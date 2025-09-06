/**
 */
package model.core.CapitalizedPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.core.CapitalizedPackage.CapitalizedPackageFactory
 * @model kind="package"
 * @generated
 */
public interface CapitalizedPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CapitalizedPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/package1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "package1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapitalizedPackagePackage eINSTANCE = model.core.CapitalizedPackage.impl.CapitalizedPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.core.CapitalizedPackage.ExampleInterface <em>Example Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.CapitalizedPackage.ExampleInterface
	 * @see model.core.CapitalizedPackage.impl.CapitalizedPackagePackageImpl#getExampleInterface()
	 * @generated
	 */
	int EXAMPLE_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Example Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Interface Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_INTERFACE___INTERFACE_OPERATION__ELIST = 0;

	/**
	 * The number of operations of the '<em>Example Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_INTERFACE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.core.CapitalizedPackage.impl.ClassInCapitalizedPackageImpl <em>Class In Capitalized Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.CapitalizedPackage.impl.ClassInCapitalizedPackageImpl
	 * @see model.core.CapitalizedPackage.impl.CapitalizedPackagePackageImpl#getClassInCapitalizedPackage()
	 * @generated
	 */
	int CLASS_IN_CAPITALIZED_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR = EXAMPLE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class In Capitalized Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_CAPITALIZED_PACKAGE_FEATURE_COUNT = EXAMPLE_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Interface Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_CAPITALIZED_PACKAGE___INTERFACE_OPERATION__ELIST = EXAMPLE_INTERFACE___INTERFACE_OPERATION__ELIST;

	/**
	 * The number of operations of the '<em>Class In Capitalized Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_CAPITALIZED_PACKAGE_OPERATION_COUNT = EXAMPLE_INTERFACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.core.CapitalizedPackage.ExampleInterface <em>Example Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Interface</em>'.
	 * @see model.core.CapitalizedPackage.ExampleInterface
	 * @generated
	 */
	EClass getExampleInterface();

	/**
	 * Returns the meta object for the '{@link model.core.CapitalizedPackage.ExampleInterface#interfaceOperation(org.eclipse.emf.common.util.EList) <em>Interface Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interface Operation</em>' operation.
	 * @see model.core.CapitalizedPackage.ExampleInterface#interfaceOperation(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getExampleInterface__InterfaceOperation__EList();

	/**
	 * Returns the meta object for class '{@link model.core.CapitalizedPackage.ClassInCapitalizedPackage <em>Class In Capitalized Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class In Capitalized Package</em>'.
	 * @see model.core.CapitalizedPackage.ClassInCapitalizedPackage
	 * @generated
	 */
	EClass getClassInCapitalizedPackage();

	/**
	 * Returns the meta object for the attribute '{@link model.core.CapitalizedPackage.ClassInCapitalizedPackage#getStringAttr <em>String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Attr</em>'.
	 * @see model.core.CapitalizedPackage.ClassInCapitalizedPackage#getStringAttr()
	 * @see #getClassInCapitalizedPackage()
	 * @generated
	 */
	EAttribute getClassInCapitalizedPackage_StringAttr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CapitalizedPackageFactory getCapitalizedPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.core.CapitalizedPackage.ExampleInterface <em>Example Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.CapitalizedPackage.ExampleInterface
		 * @see model.core.CapitalizedPackage.impl.CapitalizedPackagePackageImpl#getExampleInterface()
		 * @generated
		 */
		EClass EXAMPLE_INTERFACE = eINSTANCE.getExampleInterface();

		/**
		 * The meta object literal for the '<em><b>Interface Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAMPLE_INTERFACE___INTERFACE_OPERATION__ELIST = eINSTANCE.getExampleInterface__InterfaceOperation__EList();

		/**
		 * The meta object literal for the '{@link model.core.CapitalizedPackage.impl.ClassInCapitalizedPackageImpl <em>Class In Capitalized Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.CapitalizedPackage.impl.ClassInCapitalizedPackageImpl
		 * @see model.core.CapitalizedPackage.impl.CapitalizedPackagePackageImpl#getClassInCapitalizedPackage()
		 * @generated
		 */
		EClass CLASS_IN_CAPITALIZED_PACKAGE = eINSTANCE.getClassInCapitalizedPackage();

		/**
		 * The meta object literal for the '<em><b>String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR = eINSTANCE.getClassInCapitalizedPackage_StringAttr();

	}

} //CapitalizedPackagePackage
