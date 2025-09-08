/**
 */
package model.core.impl;

import model.ModelPackage;

import model.analysis.AnalysisPackage;

import model.analysis.impl.AnalysisPackageImpl;

import model.core.Bar;
import model.core.BarSpecializationWithComponents;
import model.core.Bazzle;
import model.core.BoundedNumber;

import model.core.CapitalizedPackage.CapitalizedPackagePackage;

import model.core.CapitalizedPackage.impl.CapitalizedPackagePackageImpl;

import model.core.CoreFactory;
import model.core.CorePackage;
import model.core.Foo;
import model.core.FooClass;
import model.core.FooGroup;
import model.core.FooSpecialization;
import model.core.IdedEntity;
import model.core.NamedEntity;
import model.core.ThingWithoutID;
import model.core.User;

import model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fooGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fooSpecializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barSpecializationWithComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bazzleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingWithoutIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fooClassEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(registeredPackage instanceof ModelPackageImpl ? registeredPackage : ModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CapitalizedPackagePackage.eNS_URI);
		CapitalizedPackagePackageImpl theCapitalizedPackagePackage = (CapitalizedPackagePackageImpl)(registeredPackage instanceof CapitalizedPackagePackageImpl ? registeredPackage : CapitalizedPackagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);
		AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(registeredPackage instanceof AnalysisPackageImpl ? registeredPackage : AnalysisPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theModelPackage.createPackageContents();
		theCapitalizedPackagePackage.createPackageContents();
		theAnalysisPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theCapitalizedPackagePackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdedEntity() {
		return idedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdedEntity_Id() {
		return (EAttribute)idedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdedEntity_EditDate() {
		return (EAttribute)idedEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdedEntity_EditUser() {
		return (EReference)idedEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdedEntity_Locked() {
		return (EAttribute)idedEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIdedEntity__GenId() {
		return idedEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedEntity() {
		return namedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedEntity_Name() {
		return (EAttribute)namedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Pass() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Salt() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFooGroup() {
		return fooGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFooGroup_User() {
		return (EReference)fooGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFooGroup__ComputeFoosOfClass__FooClass() {
		return fooGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFooGroup__GetFoosWithBazzles__EList() {
		return fooGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFooGroup__Freeze() {
		return fooGroupEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFoo() {
		return fooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_Group() {
		return (EReference)fooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFoo_CreationDate() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFoo_FooClass() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_Range() {
		return (EReference)fooEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_Bars() {
		return (EReference)fooEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_OneToOneBazzle() {
		return (EReference)fooEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFoo_ManyAttribute() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFoo_UnchangeableAttribute() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_UnchangeableReference() {
		return (EReference)fooEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFoo_TransientAttribute() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_TransientReference() {
		return (EReference)fooEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFoo_VolatileAttribute() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_VolatileReference() {
		return (EReference)fooEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_ManyCrossAggregate() {
		return (EReference)fooEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_ManyCrossAggregateNested() {
		return (EReference)fooEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_ManyValueObjects() {
		return (EReference)fooEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_OneToOneContainment() {
		return (EReference)fooEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_OwnedFoos() {
		return (EReference)fooEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_SubpackageReference() {
		return (EReference)fooEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_ContainedThingsWithNoID() {
		return (EReference)fooEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFoo_ContainedThingsWithNoID2() {
		return (EReference)fooEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFoo__CopyFoo() {
		return fooEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFooSpecialization() {
		return fooSpecializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBarSpecializationWithComponents() {
		return barSpecializationWithComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBarSpecializationWithComponents_ComponentBars() {
		return (EReference)barSpecializationWithComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarSpecializationWithComponents_SpecialName() {
		return (EAttribute)barSpecializationWithComponentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBar_Foo() {
		return (EReference)barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBar_Bazzles() {
		return (EReference)barEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBar_BackupFor() {
		return (EReference)barEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBar__DoSomethingWithFooAndBazzles__Foo_EList() {
		return barEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBar__DoSomethingWithClassesAndNumbers__EList_EList() {
		return barEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBazzle() {
		return bazzleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBazzle_BackupBar() {
		return (EReference)bazzleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBazzle_OneToOneFoo() {
		return (EReference)bazzleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedNumber() {
		return boundedNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedNumber_Units() {
		return (EAttribute)boundedNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedNumber_Value() {
		return (EAttribute)boundedNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedNumber_MaxValue() {
		return (EAttribute)boundedNumberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedNumber_MinValue() {
		return (EAttribute)boundedNumberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThingWithoutID() {
		return thingWithoutIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThingWithoutID_SingleNonContainment() {
		return (EReference)thingWithoutIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThingWithoutID_ManyNonContainment() {
		return (EReference)thingWithoutIDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThingWithoutID_RefToOtherIdlessThing() {
		return (EReference)thingWithoutIDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThingWithoutID_ManyRefToOtherIdlessThings() {
		return (EReference)thingWithoutIDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThingWithoutID_Name() {
		return (EAttribute)thingWithoutIDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFooClass() {
		return fooClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		idedEntityEClass = createEClass(IDED_ENTITY);
		createEAttribute(idedEntityEClass, IDED_ENTITY__ID);
		createEAttribute(idedEntityEClass, IDED_ENTITY__EDIT_DATE);
		createEReference(idedEntityEClass, IDED_ENTITY__EDIT_USER);
		createEAttribute(idedEntityEClass, IDED_ENTITY__LOCKED);
		createEOperation(idedEntityEClass, IDED_ENTITY___GEN_ID);

		namedEntityEClass = createEClass(NAMED_ENTITY);
		createEAttribute(namedEntityEClass, NAMED_ENTITY__NAME);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__PASS);
		createEAttribute(userEClass, USER__SALT);
		createEAttribute(userEClass, USER__EMAIL);

		fooGroupEClass = createEClass(FOO_GROUP);
		createEReference(fooGroupEClass, FOO_GROUP__USER);
		createEOperation(fooGroupEClass, FOO_GROUP___COMPUTE_FOOS_OF_CLASS__FOOCLASS);
		createEOperation(fooGroupEClass, FOO_GROUP___GET_FOOS_WITH_BAZZLES__ELIST);
		createEOperation(fooGroupEClass, FOO_GROUP___FREEZE);

		fooEClass = createEClass(FOO);
		createEReference(fooEClass, FOO__GROUP);
		createEAttribute(fooEClass, FOO__CREATION_DATE);
		createEAttribute(fooEClass, FOO__FOO_CLASS);
		createEReference(fooEClass, FOO__RANGE);
		createEReference(fooEClass, FOO__BARS);
		createEReference(fooEClass, FOO__ONE_TO_ONE_BAZZLE);
		createEAttribute(fooEClass, FOO__MANY_ATTRIBUTE);
		createEAttribute(fooEClass, FOO__UNCHANGEABLE_ATTRIBUTE);
		createEReference(fooEClass, FOO__UNCHANGEABLE_REFERENCE);
		createEAttribute(fooEClass, FOO__TRANSIENT_ATTRIBUTE);
		createEReference(fooEClass, FOO__TRANSIENT_REFERENCE);
		createEAttribute(fooEClass, FOO__VOLATILE_ATTRIBUTE);
		createEReference(fooEClass, FOO__VOLATILE_REFERENCE);
		createEReference(fooEClass, FOO__MANY_CROSS_AGGREGATE);
		createEReference(fooEClass, FOO__MANY_CROSS_AGGREGATE_NESTED);
		createEReference(fooEClass, FOO__MANY_VALUE_OBJECTS);
		createEReference(fooEClass, FOO__ONE_TO_ONE_CONTAINMENT);
		createEReference(fooEClass, FOO__OWNED_FOOS);
		createEReference(fooEClass, FOO__SUBPACKAGE_REFERENCE);
		createEReference(fooEClass, FOO__CONTAINED_THINGS_WITH_NO_ID);
		createEReference(fooEClass, FOO__CONTAINED_THINGS_WITH_NO_ID2);
		createEOperation(fooEClass, FOO___COPY_FOO);

		fooSpecializationEClass = createEClass(FOO_SPECIALIZATION);

		barSpecializationWithComponentsEClass = createEClass(BAR_SPECIALIZATION_WITH_COMPONENTS);
		createEReference(barSpecializationWithComponentsEClass, BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS);
		createEAttribute(barSpecializationWithComponentsEClass, BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME);

		barEClass = createEClass(BAR);
		createEReference(barEClass, BAR__FOO);
		createEReference(barEClass, BAR__BAZZLES);
		createEReference(barEClass, BAR__BACKUP_FOR);
		createEOperation(barEClass, BAR___DO_SOMETHING_WITH_FOO_AND_BAZZLES__FOO_ELIST);
		createEOperation(barEClass, BAR___DO_SOMETHING_WITH_CLASSES_AND_NUMBERS__ELIST_ELIST);

		bazzleEClass = createEClass(BAZZLE);
		createEReference(bazzleEClass, BAZZLE__BACKUP_BAR);
		createEReference(bazzleEClass, BAZZLE__ONE_TO_ONE_FOO);

		boundedNumberEClass = createEClass(BOUNDED_NUMBER);
		createEAttribute(boundedNumberEClass, BOUNDED_NUMBER__UNITS);
		createEAttribute(boundedNumberEClass, BOUNDED_NUMBER__VALUE);
		createEAttribute(boundedNumberEClass, BOUNDED_NUMBER__MAX_VALUE);
		createEAttribute(boundedNumberEClass, BOUNDED_NUMBER__MIN_VALUE);

		thingWithoutIDEClass = createEClass(THING_WITHOUT_ID);
		createEReference(thingWithoutIDEClass, THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT);
		createEReference(thingWithoutIDEClass, THING_WITHOUT_ID__MANY_NON_CONTAINMENT);
		createEReference(thingWithoutIDEClass, THING_WITHOUT_ID__REF_TO_OTHER_IDLESS_THING);
		createEReference(thingWithoutIDEClass, THING_WITHOUT_ID__MANY_REF_TO_OTHER_IDLESS_THINGS);
		createEAttribute(thingWithoutIDEClass, THING_WITHOUT_ID__NAME);

		// Create enums
		fooClassEEnum = createEEnum(FOO_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapitalizedPackagePackage theCapitalizedPackagePackage = (CapitalizedPackagePackage)EPackage.Registry.INSTANCE.getEPackage(CapitalizedPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCapitalizedPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedEntityEClass.getESuperTypes().add(this.getIdedEntity());
		userEClass.getESuperTypes().add(this.getNamedEntity());
		fooGroupEClass.getESuperTypes().add(this.getNamedEntity());
		fooEClass.getESuperTypes().add(this.getNamedEntity());
		fooSpecializationEClass.getESuperTypes().add(this.getFoo());
		barSpecializationWithComponentsEClass.getESuperTypes().add(this.getBar());
		barEClass.getESuperTypes().add(this.getNamedEntity());
		bazzleEClass.getESuperTypes().add(this.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(idedEntityEClass, IdedEntity.class, "IdedEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdedEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, IdedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdedEntity_EditDate(), ecorePackage.getEDate(), "editDate", null, 0, 1, IdedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdedEntity_EditUser(), this.getUser(), null, "editUser", null, 0, 1, IdedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdedEntity_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, IdedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIdedEntity__GenId(), null, "genId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedEntityEClass, NamedEntity.class, "NamedEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Pass(), ecorePackage.getEString(), "pass", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Salt(), ecorePackage.getEString(), "salt", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fooGroupEClass, FooGroup.class, "FooGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFooGroup_User(), this.getUser(), null, "user", null, 0, 1, FooGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFooGroup__ComputeFoosOfClass__FooClass(), ecorePackage.getEInt(), "computeFoosOfClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFooClass(), "fooClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFooGroup__GetFoosWithBazzles__EList(), this.getFoo(), "getFoosWithBazzles", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBazzle(), "bazzles", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFooGroup__Freeze(), null, "freeze", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFoo_Group(), this.getFooGroup(), null, "group", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_FooClass(), this.getFooClass(), "fooClass", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_Range(), this.getBoundedNumber(), null, "range", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_Bars(), this.getBar(), this.getBar_Foo(), "bars", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_OneToOneBazzle(), this.getBazzle(), this.getBazzle_OneToOneFoo(), "oneToOneBazzle", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_ManyAttribute(), ecorePackage.getEString(), "manyAttribute", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_UnchangeableAttribute(), ecorePackage.getEString(), "unchangeableAttribute", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_UnchangeableReference(), this.getBazzle(), null, "unchangeableReference", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_TransientAttribute(), ecorePackage.getEString(), "transientAttribute", null, 0, 1, Foo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_TransientReference(), this.getFoo(), null, "transientReference", null, 0, 1, Foo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_VolatileAttribute(), ecorePackage.getEString(), "volatileAttribute", null, 0, 1, Foo.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_VolatileReference(), this.getFoo(), null, "volatileReference", null, 0, 1, Foo.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_ManyCrossAggregate(), this.getFoo(), null, "manyCrossAggregate", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_ManyCrossAggregateNested(), this.getBar(), null, "manyCrossAggregateNested", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_ManyValueObjects(), this.getBoundedNumber(), null, "manyValueObjects", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_OneToOneContainment(), this.getBazzle(), null, "oneToOneContainment", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_OwnedFoos(), this.getFoo(), null, "ownedFoos", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_SubpackageReference(), theCapitalizedPackagePackage.getClassInCapitalizedPackage(), null, "subpackageReference", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_ContainedThingsWithNoID(), this.getThingWithoutID(), null, "containedThingsWithNoID", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_ContainedThingsWithNoID2(), this.getThingWithoutID(), null, "containedThingsWithNoID2", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFoo__CopyFoo(), this.getFoo(), "copyFoo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fooSpecializationEClass, FooSpecialization.class, "FooSpecialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(barSpecializationWithComponentsEClass, BarSpecializationWithComponents.class, "BarSpecializationWithComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBarSpecializationWithComponents_ComponentBars(), this.getBar(), null, "componentBars", null, 0, -1, BarSpecializationWithComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarSpecializationWithComponents_SpecialName(), ecorePackage.getEString(), "specialName", null, 0, 1, BarSpecializationWithComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBar_Foo(), this.getFoo(), this.getFoo_Bars(), "foo", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBar_Bazzles(), this.getBazzle(), null, "bazzles", null, 0, -1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBar_BackupFor(), this.getBazzle(), this.getBazzle_BackupBar(), "backupFor", null, 0, -1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBar__DoSomethingWithFooAndBazzles__Foo_EList(), null, "doSomethingWithFooAndBazzles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFoo(), "foo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBazzle(), "bazzles", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBar__DoSomethingWithClassesAndNumbers__EList_EList(), null, "doSomethingWithClassesAndNumbers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFooClass(), "classes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBoundedNumber(), "numbers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(bazzleEClass, Bazzle.class, "Bazzle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBazzle_BackupBar(), this.getBar(), this.getBar_BackupFor(), "backupBar", null, 0, 1, Bazzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBazzle_OneToOneFoo(), this.getFoo(), this.getFoo_OneToOneBazzle(), "oneToOneFoo", null, 0, 1, Bazzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedNumberEClass, BoundedNumber.class, "BoundedNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedNumber_Units(), ecorePackage.getEString(), "units", null, 0, 1, BoundedNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedNumber_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, BoundedNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedNumber_MaxValue(), ecorePackage.getEDouble(), "maxValue", null, 0, 1, BoundedNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedNumber_MinValue(), ecorePackage.getEDouble(), "minValue", null, 0, 1, BoundedNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingWithoutIDEClass, ThingWithoutID.class, "ThingWithoutID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThingWithoutID_SingleNonContainment(), this.getFoo(), null, "singleNonContainment", null, 0, 1, ThingWithoutID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingWithoutID_ManyNonContainment(), this.getFoo(), null, "manyNonContainment", null, 0, -1, ThingWithoutID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingWithoutID_RefToOtherIdlessThing(), this.getThingWithoutID(), null, "refToOtherIdlessThing", null, 0, 1, ThingWithoutID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingWithoutID_ManyRefToOtherIdlessThings(), this.getThingWithoutID(), null, "manyRefToOtherIdlessThings", null, 0, -1, ThingWithoutID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingWithoutID_Name(), ecorePackage.getEString(), "name", null, 0, 1, ThingWithoutID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fooClassEEnum, FooClass.class, "FooClass");
		addEEnumLiteral(fooClassEEnum, FooClass.SHORT);
		addEEnumLiteral(fooClassEEnum, FooClass.MEDIUM);
		addEEnumLiteral(fooClassEEnum, FooClass.INTERMEDIATE);
		addEEnumLiteral(fooClassEEnum, FooClass.LONG);
	}

} //CorePackageImpl
