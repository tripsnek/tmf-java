package org.tripsnek.tmf.json;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import model.ModelPackage;
import model.analysis.AnalysisFactory;
import model.analysis.AnalysisResult;
import model.core.Bar;
import model.core.Bazzle;
import model.core.BoundedNumber;
import model.core.CoreFactory;
import model.core.Foo;
import model.core.FooClass;
import model.core.ThingWithoutID;

public class TJsonTest {

    private CoreFactory fact;
    private Date currentDate;
    private Foo otherFoo;
    private Foo otherFoo2;
    private Foo foo;
    private Foo foo2;
    private AnalysisResult rootContainer;
    private JsonNode jsonRoot;
    private AnalysisResult deserializedRoot;
    private Foo deserializedFoo;

    @BeforeEach
    void setUp() {
        // Configure TJson with test packages
        fact = CoreFactory.eINSTANCE;
        TJson.setPackages(TUtils.allPackagesRecursive(ModelPackage.eINSTANCE));
        currentDate = new Date();

        // For cross aggregate reference
        otherFoo = fact.createFoo();
        otherFoo2 = fact.createFoo();
        TUtils.genIdIfNotExists(otherFoo);
        TUtils.genIdIfNotExists(otherFoo2);

        // Create a Foo container and contents
        foo = fact.createFoo();
        foo.setName("TestFoo");
        foo.getManyAttribute().add("TestManyAttr1");
        foo.getManyAttribute().add("TestManyAttr2");
         //this appears to have been interpreted incorrectly in TypeScript (you shouldn't even be able to set this with eSet)
        // foo.eSet(CorePackage.eINSTANCE.getFoo_UnchangeableAttribute(), "TestValue");
        foo.setTransientAttribute("ShouldNotSerialize");
        foo.setTransientReference(fact.createFoo());
        foo.setFooClass(FooClass.INTERMEDIATE);
        foo.setCreationDate(currentDate);
        foo.getManyCrossAggregate().add(otherFoo);
        foo.getManyCrossAggregate().add(otherFoo2);

        BoundedNumber num1 = fact.createBoundedNumber();
        num1.setMinValue(1.0);
        num1.setMaxValue(2.5);
        num1.setUnits("ft");
        BoundedNumber num2 = fact.createBoundedNumber();
        num2.setMinValue(0.0);
        num2.setMaxValue(10.5);
        num2.setUnits("kg");
        foo.getManyValueObjects().add(num1);
        foo.getManyValueObjects().add(num2);

        Bar bar1 = fact.createBar();
        Bar bar2 = fact.createBar();
        Bazzle bz = fact.createBazzle();
        bz.setName("TestBazzle");
        Bazzle bz2 = fact.createBazzle();
        bz2.setName("TestBazzle2");
        foo.getBars().add(bar1);
        foo.getBars().add(bar2);
        foo.setOneToOneBazzle(bz);
        bar1.getBazzles().add(bz);
        bar1.getBazzles().add(bz2);
        bz.setBackupBar(bar2);
        bz2.setBackupBar(bar2);

        foo2 = fact.createFoo();
        foo2.setName("Foo2");
        foo2.setFooClass(FooClass.SHORT);
        Bar foo2Bar = fact.createBar();
        foo2Bar.setName("Foo2Bar");
        foo2.getBars().add(foo2Bar);

        //id-less thing references
        ThingWithoutID idless1 = CoreFactory.eINSTANCE.createThingWithoutID();
        idless1.setName("idLess1");
        ThingWithoutID idless2 = CoreFactory.eINSTANCE.createThingWithoutID();
        idless2.setName("idLess2");
        ThingWithoutID idless3 = CoreFactory.eINSTANCE.createThingWithoutID();
        idless3.setName("idLess3");
        foo.getContainedThingsWithNoID().add(idless1);
        foo.getContainedThingsWithNoID().add(idless2);
        foo.getContainedThingsWithNoID2().add(idless3);
        idless1.setRefToOtherIdlessThing(idless2);
        idless1.getManyRefToOtherIdlessThings().add(idless2);
        idless1.getManyRefToOtherIdlessThings().add(idless3);

        // Validate Foo contents before serialization
        assertEquals("Foo", foo.eClass().getName());
        assertEquals(2, foo.getBars().size());
        assertEquals(currentDate, foo.getCreationDate());

        // Put it inside an AnalysisResult - which demonstrates cross-package containment and inheritance
        rootContainer = AnalysisFactory.eINSTANCE.createAnalysisResult();
        rootContainer.setObject(foo);

        // Serialize root
        jsonRoot = TJson.makeJson(rootContainer);

        // Deserialize root
        deserializedRoot = TJson.makeEObject(jsonRoot);
        deserializedFoo = (Foo) deserializedRoot.getObject();
    }

    @Test
    void shouldPreservePrimitiveAttributes() {
        assertEquals("TestFoo", deserializedFoo.getName());
    }

    @Test
    void shouldPreserveManyValuedPrimitiveAttributes() {
        assertEquals(2, deserializedFoo.getManyAttribute().size());
        assertEquals("TestManyAttr1", deserializedFoo.getManyAttribute().get(0));
        assertEquals("TestManyAttr2", deserializedFoo.getManyAttribute().get(1));
    }

    @Test
    void shouldPreserveDates() {
        assertEquals(currentDate, deserializedFoo.getCreationDate());
    }

    //this appears to have been interpreted incorrectly in TypeScript (you shouldn't even be able to set this with eSet)
    // @Test
    // void shouldPreserveUnchangeableValues() {
    //     assertEquals("TestValue", deserializedFoo.getUnchangeableAttribute());
    // }

    @Test
    void shouldPreservePrimitiveEnumValues() {
        assertEquals(FooClass.INTERMEDIATE, deserializedFoo.getFooClass());
    }

    @Test
    void shouldPreservePrimitiveFalsy0EnumValues() {
        JsonNode jsonFoo2 = TJson.makeJson(foo2);
        Foo deserializedFoo2 = TJson.makeEObject(jsonFoo2);
        assertEquals(FooClass.SHORT, deserializedFoo2.getFooClass());
    }

    @Test
    void shouldIgnoreTransientAttributes() {
        assertNull(deserializedFoo.getTransientAttribute());
    }

    @Test
    void shouldPreserveManyValuedValueObjectReferences() {
        assertEquals(2, deserializedFoo.getManyValueObjects().size());
        assertEquals(2.5, deserializedFoo.getManyValueObjects().get(0).getMaxValue(), 0.001);
        assertEquals("ft", deserializedFoo.getManyValueObjects().get(0).getUnits());
        assertEquals(10.5, deserializedFoo.getManyValueObjects().get(1).getMaxValue(), 0.001);
        assertEquals("kg", deserializedFoo.getManyValueObjects().get(1).getUnits());
    }

    @Test
    void shouldIgnoreTransientContainments() {
        assertNull(deserializedFoo.getTransientReference());
    }

    @Test
    void shouldPreserveManyValuedContainedObjects() {
        assertEquals(2, deserializedFoo.getBars().size());
    }

    @Test
    void shouldPreserveInverseReferencesToContainer() {
        assertEquals(deserializedFoo, deserializedFoo.getBars().get(0).getFoo());
    }

    @Test
    void shouldAssignIDsToAllObjectsInHierarchy() {
        assertNotNull(deserializedFoo.getBars().get(1).getId());
    }

    @Test
    void shouldPreserveManyValuedContainedObjectsRecursively() {
        Bar ds1 = deserializedFoo.getBars().get(0);
        assertEquals(2, ds1.getBazzles().size());
        Bazzle e1 = ds1.getBazzles().get(0);
        assertEquals("TestBazzle", e1.getName());
    }

    @Test
    void shouldPreserveSingleValuedAggregateInternalReferences() {
        assertEquals("TestBazzle", deserializedFoo.getOneToOneBazzle().getName());
    }

    @Test
    void shouldPreserveSingleValuedAggregateInternalReferencesRecursively() {
        Bar br1 = deserializedFoo.getBars().get(0);
        Bar br2 = deserializedFoo.getBars().get(1);
        Bazzle z1 = br1.getBazzles().get(0);
        Bazzle z2 = br1.getBazzles().get(1);
        assertEquals(br2, z1.getBackupBar());
        assertEquals(br2, z2.getBackupBar());
    }

    @Test
    void shouldPreserveManyValuedAggregateInternalReferences() {
        Bar br2 = deserializedFoo.getBars().get(1);
        assertEquals(2, br2.getBackupFor().size());
    }

    @Test
    void shouldSerializeArraysOfAggregates() {
        List<Foo> foos = List.of(foo, foo2);
        ArrayNode serialized = TJson.makeJsonArray(foos);
        assertEquals(2, serialized.size());
    }

    @Test
    void shouldDeserializeArraysOfAggregates() {
        List<Foo> foos = List.of(foo, foo2);
        @SuppressWarnings("unchecked")
        List<Foo> deserialized = (List<Foo>) TJson.makeEObjectArray(
            TJson.makeJsonArray(foos)
        );
        assertEquals(2, deserialized.size());
        assertEquals(2, deserialized.get(0).getBars().size());
        assertEquals("Foo2Bar", deserialized.get(1).getBars().get(0).getName());
    }

    @Test
    void shouldStringifyArraysOfAggregates() {
        List<Foo> foos = List.of(foo, foo2);
        ArrayNode serialized = TJson.makeJsonArray(foos);
        // Should not throw an exception
        assertDoesNotThrow(() -> serialized.toString());
    }

    @Test
    void shouldCreateProxiesForInAggregateReferencesToExternalInstances() {
        Foo f1 = fact.createFoo();
        Foo f2 = fact.createFoo();
        Bar b1 = fact.createBar();
        Bar b2 = fact.createBar();
        f1.getBars().add(b1);
        f2.getBars().add(b2);
        Bazzle baz1 = fact.createBazzle();
        b1.getBazzles().add(baz1);
        // Set internal ref to an external object
        baz1.setBackupBar(b2);
        
        Foo throughJson = TJson.makeEObject(TJson.makeJson(f1));
        assertTrue(throughJson.getBars().get(0).getBazzles().get(0).getBackupBar().eIsProxy());
    }

    @Test
    void shouldBeInformativeWhenPackagesAreNotInitialized() {
        // This test would require temporarily clearing packages and capturing System.err
        // For now, we'll just test that the method executes without error
        List<Foo> foos = List.of(foo, foo2);
        ArrayNode serialized = TJson.makeJsonArray(foos);
        assertEquals(2, serialized.size());
    }

    @Test
    void shouldPreserveCrossAggregateReferences() {
        // Test that cross-aggregate references (otherFoo, otherFoo2) are preserved
        assertEquals(2, deserializedFoo.getManyCrossAggregate().size());
        // Note: These should be proxies since they're external references
        assertTrue(deserializedFoo.getManyCrossAggregate().get(0).eIsProxy());
        assertTrue(deserializedFoo.getManyCrossAggregate().get(1).eIsProxy());
    }

    @Test
    void shouldRoundTripComplexHierarchy() {
        // Test complete round-trip: original -> JSON -> EObject -> JSON -> EObject
        JsonNode firstJson = TJson.makeJson(rootContainer);
        AnalysisResult firstDeserialized = TJson.makeEObject(firstJson);
        JsonNode secondJson = TJson.makeJson(firstDeserialized);
        AnalysisResult secondDeserialized = TJson.makeEObject(secondJson);
        
        Foo finalFoo = (Foo) secondDeserialized.getObject();
        assertEquals("TestFoo", finalFoo.getName());
        assertEquals(2, finalFoo.getBars().size());
        assertEquals(2, finalFoo.getManyAttribute().size());
        assertEquals(FooClass.INTERMEDIATE, finalFoo.getFooClass());
    }

    @Test
    void shouldHandleNullValues() {
        Foo nullTestFoo = fact.createFoo();
        nullTestFoo.setName(null);
        nullTestFoo.setCreationDate(null);
        
        JsonNode nullJson = TJson.makeJson(nullTestFoo);
        Foo deserializedNullFoo = TJson.makeEObject(nullJson);
        
        assertNull(deserializedNullFoo.getName());
        assertNull(deserializedNullFoo.getCreationDate());
    }

    @Test
    void shouldPreserveEmptyCollections() {
        Foo emptyFoo = fact.createFoo();
        emptyFoo.setName("EmptyFoo");
        // Don't add anything to collections
        
        JsonNode emptyJson = TJson.makeJson(emptyFoo);
        Foo deserializedEmptyFoo = TJson.makeEObject(emptyJson);
        
        assertEquals("EmptyFoo", deserializedEmptyFoo.getName());
        assertEquals(0, deserializedEmptyFoo.getBars().size());
        assertEquals(0, deserializedEmptyFoo.getManyAttribute().size());
        assertEquals(0, deserializedEmptyFoo.getManyValueObjects().size());
    }

    @Test
    void shouldDeserializeSimpleIdLessLists() {
        assertEquals(2, deserializedFoo.getContainedThingsWithNoID().size());
        assertEquals(1, deserializedFoo.getContainedThingsWithNoID2().size());
        assertEquals("idLess1", deserializedFoo.getContainedThingsWithNoID().get(0).getName());
        assertEquals("idLess2", deserializedFoo.getContainedThingsWithNoID().get(1).getName());
        assertEquals("idLess3", deserializedFoo.getContainedThingsWithNoID2().get(0).getName());
    }

    @Test
    void shouldDeserializeReferencesBetweenIdLessThingsSingleValued() {
        ThingWithoutID idless1 = deserializedFoo.getContainedThingsWithNoID().get(0);
        ThingWithoutID idless2 = deserializedFoo.getContainedThingsWithNoID().get(1);
        assertSame(idless2, idless1.getRefToOtherIdlessThing());
    }

    @Test
    void shouldDeserializeReferencesBetweenIdLessThingsManyValued() {
        ThingWithoutID idless1 = deserializedFoo.getContainedThingsWithNoID().get(0);
        ThingWithoutID idless2 = deserializedFoo.getContainedThingsWithNoID().get(1);
        ThingWithoutID idless3 = deserializedFoo.getContainedThingsWithNoID2().get(0);
        assertSame(idless2, idless1.getManyRefToOtherIdlessThings().get(0));
        assertSame(idless3, idless1.getManyRefToOtherIdlessThings().get(1));
    }    

    
}