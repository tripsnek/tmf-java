package org.tripsnek.tmf.json;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import model.ModelPackage;
import model.analysis.AnalysisFactory;
import model.analysis.AnalysisResult;
import model.core.Bar;
import model.core.Bazzle;
import model.core.CoreFactory;
import model.core.Foo;
import model.core.User;

public class TJsonProxyTest {

    private CoreFactory fact;
    private ByteArrayOutputStream errorOutput;
    private PrintStream originalErr;

    @BeforeEach
    void setUp() {
        TJson.setPackages(TUtils.allPackagesRecursive(ModelPackage.eINSTANCE));
        fact = CoreFactory.eINSTANCE;
        
        // Capture System.err for warning tests
        errorOutput = new ByteArrayOutputStream();
        originalErr = System.err;
        System.setErr(new PrintStream(errorOutput));
    }

    @AfterEach
    void tearDown() {
        // Restore original System.err
        System.setErr(originalErr);
    }

    @Test
    void shouldCreateProxyObjectsForExternalNonContainmentProxiesEvenIfReferringObjectHasNoID() {
        // Create objects
        Foo f1 = fact.createFoo();
        // Note: Assuming ThingWithoutID doesn't exist in the basic model, 
        // we'll use a Bar instead which can exist without explicit ID assignment
        Bar noId = fact.createBar();
        Foo referredTo = fact.createFoo();
        f1.getBars().add(noId);
        TUtils.genIdIfNotExists(referredTo);

        // Create a Bazzle to hold the external reference since Bar might not have direct Foo references
        Bazzle baz = fact.createBazzle();
        noId.getBazzles().add(baz);
        
        // Set external reference from ID-less object's contained element
        // We'll use the backup bar reference as our external reference
        Foo externalFoo = fact.createFoo();
        TUtils.genIdIfNotExists(externalFoo);
        Bar externalBar = fact.createBar();
        externalFoo.getBars().add(externalBar);
        baz.setBackupBar(externalBar);

        Foo throughJson = TJson.makeEObject(TJson.makeJson(f1));
        Bar deserializedNoId = throughJson.getBars().get(0);
        Bazzle deserializedBaz = deserializedNoId.getBazzles().get(0);

        assertNotNull(deserializedBaz.getBackupBar());
        assertTrue(deserializedBaz.getBackupBar().eIsProxy());
    }

    @Test
    void shouldCreateProxyObjectsForExternalNonContainmentReferences() {
        Foo f1 = fact.createFoo();
        Foo f2 = fact.createFoo();
        Bar b1 = fact.createBar();
        Bar b2 = fact.createBar();

        // Set up the object hierarchy
        f1.getBars().add(b1);
        f2.getBars().add(b2);
        Bazzle baz1 = fact.createBazzle();
        b1.getBazzles().add(baz1);

        // Ensure external object has an ID
        TUtils.genIdIfNotExists(b2);

        // Set internal ref to an external object
        baz1.setBackupBar(b2);

        // Serialize and deserialize only f1 (not f2, so b2 is external)
        Foo throughJson = TJson.makeEObject(TJson.makeJson(f1));
        Bazzle deserializedBaz = throughJson.getBars().get(0).getBazzles().get(0);
        Bar backupBarProxy = deserializedBaz.getBackupBar();

        // Should create a proxy instead of being null
        assertNotNull(backupBarProxy);
        assertTrue(backupBarProxy.eIsProxy());
    }

    @Test
    void shouldCreateProxiesWithCorrectEClass() {
        Foo f1 = fact.createFoo();
        User externalUser = fact.createUser();
        externalUser.setId("user123");
        externalUser.setName("External User");

        // Set external reference
        f1.setEditUser(externalUser);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        User userProxy = deserialized.getEditUser();

        assertNotNull(userProxy);
        assertTrue(userProxy.eIsProxy());
        assertEquals("User", userProxy.eClass().getName());
    }

    @Test
    void shouldCreateProxiesWithCorrectIDValue() {
        Foo f1 = fact.createFoo();
        User externalUser = fact.createUser();
        externalUser.setId("user456");
        externalUser.setName("Test User");

        f1.setEditUser(externalUser);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        User userProxy = deserialized.getEditUser();

        assertNotNull(userProxy);
        assertTrue(userProxy.eIsProxy());
        assertEquals("user456", userProxy.getId());
        assertEquals("User_user456", TUtils.getFullId(userProxy));
    }

    @Test
    void shouldShareSameProxyInstanceForMultipleReferencesToSameExternalObject() {
        Foo f1 = fact.createFoo();
        Bar bar1 = fact.createBar();
        Bar bar2 = fact.createBar();
        Bazzle baz1 = fact.createBazzle();
        Bazzle baz2 = fact.createBazzle();

        f1.getBars().add(bar1);
        f1.getBars().add(bar2);
        bar1.getBazzles().add(baz1);
        bar2.getBazzles().add(baz2);

        // External bar that both bazzles reference
        Bar externalBar = fact.createBar();
        TUtils.genIdIfNotExists(externalBar);
        baz1.setBackupBar(externalBar);
        baz2.setBackupBar(externalBar);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        Bar proxy1 = deserialized.getBars().get(0).getBazzles().get(0).getBackupBar();
        Bar proxy2 = deserialized.getBars().get(1).getBazzles().get(0).getBackupBar();

        assertNotNull(proxy1);
        assertNotNull(proxy2);
        assertTrue(proxy1.eIsProxy());
        assertTrue(proxy2.eIsProxy());
        // Should be the exact same instance
        assertSame(proxy1, proxy2);
    }

    @Test
    void shouldHandleManyValuedExternalReferences() {
        Foo f1 = fact.createFoo();
        Foo externalFoo1 = fact.createFoo();
        Foo externalFoo2 = fact.createFoo();

        TUtils.genIdIfNotExists(externalFoo1);
        TUtils.genIdIfNotExists(externalFoo2);
        externalFoo1.setName("External1");
        externalFoo2.setName("External2");

        // Add external references to many-valued cross aggregate
        f1.getManyCrossAggregate().add(externalFoo1);
        f1.getManyCrossAggregate().add(externalFoo2);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        var crossRefs = deserialized.getManyCrossAggregate();

        assertEquals(2, crossRefs.size());

        Foo proxy1 = crossRefs.get(0);
        Foo proxy2 = crossRefs.get(1);

        assertTrue(proxy1.eIsProxy());
        assertTrue(proxy2.eIsProxy());
        assertEquals("Foo", proxy1.eClass().getName());
        assertEquals("Foo", proxy2.eClass().getName());
        assertEquals(externalFoo1.getId(), proxy1.getId());
        assertEquals(externalFoo2.getId(), proxy2.getId());
    }

    @Test
    void shouldNotCreateProxiesForContainmentReferences() {
        Foo f1 = fact.createFoo();
        Bar bar1 = fact.createBar();
        Bazzle baz1 = fact.createBazzle();

        TUtils.genIdIfNotExists(baz1);
        baz1.setName("Contained Bazzle");

        // This is a containment reference
        bar1.getBazzles().add(baz1);
        f1.getBars().add(bar1);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        Bazzle deserializedBaz = deserialized.getBars().get(0).getBazzles().get(0);

        assertNotNull(deserializedBaz);
        assertFalse(deserializedBaz.eIsProxy());
        assertEquals("Contained Bazzle", deserializedBaz.getName());
    }

    @Test
    void shouldStillResolveInternalReferencesNormally() {
        Foo f1 = fact.createFoo();
        Bar bar1 = fact.createBar();
        Bar bar2 = fact.createBar();
        Bazzle baz1 = fact.createBazzle();

        f1.getBars().add(bar1);
        f1.getBars().add(bar2);
        bar1.getBazzles().add(baz1);

        // This should resolve normally since bar2 is in the same aggregate
        baz1.setBackupBar(bar2);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        Bazzle deserializedBaz = deserialized.getBars().get(0).getBazzles().get(0);
        Bar backupBar = deserializedBaz.getBackupBar();
        Bar expectedBar = deserialized.getBars().get(1);

        assertNotNull(backupBar);
        assertFalse(backupBar.eIsProxy());
        assertSame(backupBar, expectedBar);
    }

    @Test
    void shouldHandleExternalReferencesWithComplexIDs() {
        Foo f1 = fact.createFoo();
        User externalUser = fact.createUser();

        // Test with complex ID that might contain underscores
        externalUser.setId("complex_user_id_123");
        externalUser.setName("Complex User");
        f1.setEditUser(externalUser);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        User userProxy = deserialized.getEditUser();

        assertNotNull(userProxy);
        assertTrue(userProxy.eIsProxy());
        assertEquals("complex_user_id_123", userProxy.getId());
        assertEquals("User_complex_user_id_123", TUtils.getFullId(userProxy));
    }

    @Test
    void shouldCreateProxiesForCrossPackageReferences() {
        AnalysisResult analysisResult = AnalysisFactory.eINSTANCE.createAnalysisResult();
        User externalUser = fact.createUser();
        TUtils.genIdIfNotExists(externalUser);
        externalUser.setName("External User");

        // Cross-package reference from analysis to core
        analysisResult.setUser(externalUser);

        AnalysisResult deserialized = TJson.makeEObject(TJson.makeJson(analysisResult));
        User userProxy = deserialized.getUser();

        assertNotNull(userProxy);
        assertTrue(userProxy.eIsProxy());
        assertEquals("User", userProxy.eClass().getName());
        assertEquals(externalUser.getId(), userProxy.getId());
    }

    @Test
    void shouldLogAppropriateWarningsForInvalidProxyCreationScenarios() {
        // Create a scenario where proxy creation might fail
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode malformedJson = mapper.createObjectNode();
        malformedJson.put("@type", "Foo");
        malformedJson.put("id", "test_foo");
        malformedJson.put("editUser", "InvalidIdFormat"); // Missing underscore

        Foo result = TJson.makeEObject(malformedJson);

        // Should still create the object, just without the problematic reference
        assertNotNull(result);
        assertEquals("Foo", result.eClass().getName());
        
        // Check that some warning was logged (the exact message may vary)
        String errorText = errorOutput.toString();
        assertFalse(errorText.isEmpty());
    }

    @Test
    void shouldPreserveProxyStatusThroughMultipleSerializationCycles() {
        Foo f1 = fact.createFoo();
        User externalUser = fact.createUser();
        externalUser.setId("persistent_user");
        f1.setEditUser(externalUser);

        // First serialization cycle - creates proxy
        Foo firstDeserialized = TJson.makeEObject(TJson.makeJson(f1));
        User firstProxy = firstDeserialized.getEditUser();
        assertTrue(firstProxy.eIsProxy());

        // Second serialization cycle - proxy should be serialized as reference
        Foo secondDeserialized = TJson.makeEObject(TJson.makeJson(firstDeserialized));
        User secondProxy = secondDeserialized.getEditUser();

        assertNotNull(secondProxy);
        assertTrue(secondProxy.eIsProxy());
        assertEquals("persistent_user", secondProxy.getId());
        assertEquals("User", secondProxy.eClass().getName());
    }

    @Test
    void shouldHandleNullExternalReferences() {
        Foo f1 = fact.createFoo();
        f1.setEditUser(null);

        Foo deserialized = TJson.makeEObject(TJson.makeJson(f1));
        
        assertNull(deserialized.getEditUser());
    }

    @Test
    void shouldPreserveProxyEqualityBasedOnFullId() {
        Foo f1 = fact.createFoo();
        User externalUser = fact.createUser();
        externalUser.setId("equality_test_user");
        
        f1.setEditUser(externalUser);
        
        // Create two separate deserialization cycles
        Foo deserialized1 = TJson.makeEObject(TJson.makeJson(f1));
        Foo deserialized2 = TJson.makeEObject(TJson.makeJson(f1));
        
        User proxy1 = deserialized1.getEditUser();
        User proxy2 = deserialized2.getEditUser();
        
        // Proxies should have same ID and type even if different instances
        assertEquals(proxy1.getId(), proxy2.getId());
        assertEquals(proxy1.eClass().getName(), proxy2.eClass().getName());
        assertEquals(TUtils.getFullId(proxy1), TUtils.getFullId(proxy2));
    }
}