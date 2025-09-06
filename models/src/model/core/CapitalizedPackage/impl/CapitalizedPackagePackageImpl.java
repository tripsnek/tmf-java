/**
 */
package model.core.CapitalizedPackage.impl;

import model.ModelPackage;

import model.analysis.AnalysisPackage;

import model.analysis.impl.AnalysisPackageImpl;

import model.core.CapitalizedPackage.CapitalizedPackageFactory;
import model.core.CapitalizedPackage.CapitalizedPackagePackage;
import model.core.CapitalizedPackage.ClassInCapitalizedPackage;
import model.core.CapitalizedPackage.ExampleInterface;

import model.core.CorePackage;

import model.core.impl.CorePackageImpl;

import model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapitalizedPackagePackageImpl extends EPackageImpl implements CapitalizedPackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInCapitalizedPackageEClass = null;

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
	 * @see model.core.CapitalizedPackage.CapitalizedPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapitalizedPackagePackageImpl() {
		super(eNS_URI, CapitalizedPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CapitalizedPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapitalizedPackagePackage init() {
		if (isInited) return (CapitalizedPackagePackage)EPackage.Registry.INSTANCE.getEPackage(CapitalizedPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCapitalizedPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CapitalizedPackagePackageImpl theCapitalizedPackagePackage = registeredCapitalizedPackagePackage instanceof CapitalizedPackagePackageImpl ? (CapitalizedPackagePackageImpl)registeredCapitalizedPackagePackage : new CapitalizedPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(registeredPackage instanceof ModelPackageImpl ? registeredPackage : ModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);
		AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(registeredPackage instanceof AnalysisPackageImpl ? registeredPackage : AnalysisPackage.eINSTANCE);

		// Create package meta-data objects
		theCapitalizedPackagePackage.createPackageContents();
		theModelPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAnalysisPackage.createPackageContents();

		// Initialize created meta-data
		theCapitalizedPackagePackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapitalizedPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapitalizedPackagePackage.eNS_URI, theCapitalizedPackagePackage);
		return theCapitalizedPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExampleInterface() {
		return exampleInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExampleInterface__InterfaceOperation__EList() {
		return exampleInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInCapitalizedPackage() {
		return classInCapitalizedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassInCapitalizedPackage_StringAttr() {
		return (EAttribute)classInCapitalizedPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapitalizedPackageFactory getCapitalizedPackageFactory() {
		return (CapitalizedPackageFactory)getEFactoryInstance();
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
		exampleInterfaceEClass = createEClass(EXAMPLE_INTERFACE);
		createEOperation(exampleInterfaceEClass, EXAMPLE_INTERFACE___INTERFACE_OPERATION__ELIST);

		classInCapitalizedPackageEClass = createEClass(CLASS_IN_CAPITALIZED_PACKAGE);
		createEAttribute(classInCapitalizedPackageEClass, CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classInCapitalizedPackageEClass.getESuperTypes().add(this.getExampleInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(exampleInterfaceEClass, ExampleInterface.class, "ExampleInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getExampleInterface__InterfaceOperation__EList(), theCorePackage.getFoo(), "interfaceOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getFooGroup(), "fooGroup", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(classInCapitalizedPackageEClass, ClassInCapitalizedPackage.class, "ClassInCapitalizedPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassInCapitalizedPackage_StringAttr(), ecorePackage.getEString(), "stringAttr", null, 0, 1, ClassInCapitalizedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CapitalizedPackagePackageImpl
