/**
 */
package model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tripsnek.com/emf.com.tripsnek.tmftest.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emf.com.tripsnek.tmftest.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.ContainerRootTypeImpl <em>Container Root Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ContainerRootTypeImpl
	 * @see model.impl.ModelPackageImpl#getContainerRootType()
	 * @generated
	 */
	int CONTAINER_ROOT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT_TYPE__CONTAINED = 0;

	/**
	 * The number of structural features of the '<em>Container Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.ContainedRootTypeImpl <em>Contained Root Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ContainedRootTypeImpl
	 * @see model.impl.ModelPackageImpl#getContainedRootType()
	 * @generated
	 */
	int CONTAINED_ROOT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ROOT_TYPE__CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Contained Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ROOT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contained Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ROOT_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.ContainerRootType <em>Container Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Root Type</em>'.
	 * @see model.ContainerRootType
	 * @generated
	 */
	EClass getContainerRootType();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ContainerRootType#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained</em>'.
	 * @see model.ContainerRootType#getContained()
	 * @see #getContainerRootType()
	 * @generated
	 */
	EReference getContainerRootType_Contained();

	/**
	 * Returns the meta object for class '{@link model.ContainedRootType <em>Contained Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Root Type</em>'.
	 * @see model.ContainedRootType
	 * @generated
	 */
	EClass getContainedRootType();

	/**
	 * Returns the meta object for the container reference '{@link model.ContainedRootType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see model.ContainedRootType#getContainer()
	 * @see #getContainedRootType()
	 * @generated
	 */
	EReference getContainedRootType_Container();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link model.impl.ContainerRootTypeImpl <em>Container Root Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ContainerRootTypeImpl
		 * @see model.impl.ModelPackageImpl#getContainerRootType()
		 * @generated
		 */
		EClass CONTAINER_ROOT_TYPE = eINSTANCE.getContainerRootType();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT_TYPE__CONTAINED = eINSTANCE.getContainerRootType_Contained();

		/**
		 * The meta object literal for the '{@link model.impl.ContainedRootTypeImpl <em>Contained Root Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ContainedRootTypeImpl
		 * @see model.impl.ModelPackageImpl#getContainedRootType()
		 * @generated
		 */
		EClass CONTAINED_ROOT_TYPE = eINSTANCE.getContainedRootType();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_ROOT_TYPE__CONTAINER = eINSTANCE.getContainedRootType_Container();

	}

} //ModelPackage
