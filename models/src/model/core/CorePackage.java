/**
 */
package model.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see model.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tripsnek.com/emf.com.tripsnek.tmftest.model.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.core.impl.IdedEntityImpl <em>Ided Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.IdedEntityImpl
	 * @see model.core.impl.CorePackageImpl#getIdedEntity()
	 * @generated
	 */
	int IDED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDED_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDED_ENTITY__EDIT_DATE = 1;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDED_ENTITY__EDIT_USER = 2;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDED_ENTITY__LOCKED = 3;

	/**
	 * The number of structural features of the '<em>Ided Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDED_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDED_ENTITY___GEN_ID = 0;

	/**
	 * The number of operations of the '<em>Ided Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDED_ENTITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.core.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.NamedEntityImpl
	 * @see model.core.impl.CorePackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__ID = IDED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__EDIT_DATE = IDED_ENTITY__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__EDIT_USER = IDED_ENTITY__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__LOCKED = IDED_ENTITY__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = IDED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = IDED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY___GEN_ID = IDED_ENTITY___GEN_ID;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = IDED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.core.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.UserImpl
	 * @see model.core.impl.CorePackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EDIT_DATE = NAMED_ENTITY__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EDIT_USER = NAMED_ENTITY__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOCKED = NAMED_ENTITY__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASS = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Salt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SALT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___GEN_ID = NAMED_ENTITY___GEN_ID;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.core.impl.FooGroupImpl <em>Foo Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.FooGroupImpl
	 * @see model.core.impl.CorePackageImpl#getFooGroup()
	 * @generated
	 */
	int FOO_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP__ID = NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP__EDIT_DATE = NAMED_ENTITY__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP__EDIT_USER = NAMED_ENTITY__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP__LOCKED = NAMED_ENTITY__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP__USER = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foo Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP___GEN_ID = NAMED_ENTITY___GEN_ID;

	/**
	 * The operation id for the '<em>Compute Foos Of Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP___COMPUTE_FOOS_OF_CLASS__FOOCLASS = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Foos With Bazzles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP___GET_FOOS_WITH_BAZZLES__ELIST = NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Freeze</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP___FREEZE = NAMED_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Foo Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_GROUP_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link model.core.impl.FooImpl <em>Foo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.FooImpl
	 * @see model.core.impl.CorePackageImpl#getFoo()
	 * @generated
	 */
	int FOO = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__ID = NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__EDIT_DATE = NAMED_ENTITY__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__EDIT_USER = NAMED_ENTITY__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__LOCKED = NAMED_ENTITY__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__GROUP = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__CREATION_DATE = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foo Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__FOO_CLASS = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__RANGE = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__BARS = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>One To One Bazzle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__ONE_TO_ONE_BAZZLE = NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Many Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__MANY_ATTRIBUTE = NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unchangeable Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__UNCHANGEABLE_ATTRIBUTE = NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unchangeable Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__UNCHANGEABLE_REFERENCE = NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transient Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__TRANSIENT_ATTRIBUTE = NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transient Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__TRANSIENT_REFERENCE = NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Volatile Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__VOLATILE_ATTRIBUTE = NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Volatile Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__VOLATILE_REFERENCE = NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Many Cross Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__MANY_CROSS_AGGREGATE = NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Many Cross Aggregate Nested</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__MANY_CROSS_AGGREGATE_NESTED = NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Many Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__MANY_VALUE_OBJECTS = NAMED_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>One To One Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__ONE_TO_ONE_CONTAINMENT = NAMED_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Owned Foos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__OWNED_FOOS = NAMED_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Subpackage Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__SUBPACKAGE_REFERENCE = NAMED_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Contained Things With No ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__CONTAINED_THINGS_WITH_NO_ID = NAMED_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Contained Things With No ID2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__CONTAINED_THINGS_WITH_NO_ID2 = NAMED_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO___GEN_ID = NAMED_ENTITY___GEN_ID;

	/**
	 * The operation id for the '<em>Copy Foo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO___COPY_FOO = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.core.impl.FooSpecializationImpl <em>Foo Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.FooSpecializationImpl
	 * @see model.core.impl.CorePackageImpl#getFooSpecialization()
	 * @generated
	 */
	int FOO_SPECIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__ID = FOO__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__EDIT_DATE = FOO__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__EDIT_USER = FOO__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__LOCKED = FOO__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__NAME = FOO__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__GROUP = FOO__GROUP;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__CREATION_DATE = FOO__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Foo Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__FOO_CLASS = FOO__FOO_CLASS;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__RANGE = FOO__RANGE;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__BARS = FOO__BARS;

	/**
	 * The feature id for the '<em><b>One To One Bazzle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__ONE_TO_ONE_BAZZLE = FOO__ONE_TO_ONE_BAZZLE;

	/**
	 * The feature id for the '<em><b>Many Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__MANY_ATTRIBUTE = FOO__MANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Unchangeable Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__UNCHANGEABLE_ATTRIBUTE = FOO__UNCHANGEABLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Unchangeable Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__UNCHANGEABLE_REFERENCE = FOO__UNCHANGEABLE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Transient Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__TRANSIENT_ATTRIBUTE = FOO__TRANSIENT_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transient Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__TRANSIENT_REFERENCE = FOO__TRANSIENT_REFERENCE;

	/**
	 * The feature id for the '<em><b>Volatile Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__VOLATILE_ATTRIBUTE = FOO__VOLATILE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Volatile Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__VOLATILE_REFERENCE = FOO__VOLATILE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Many Cross Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__MANY_CROSS_AGGREGATE = FOO__MANY_CROSS_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Many Cross Aggregate Nested</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__MANY_CROSS_AGGREGATE_NESTED = FOO__MANY_CROSS_AGGREGATE_NESTED;

	/**
	 * The feature id for the '<em><b>Many Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__MANY_VALUE_OBJECTS = FOO__MANY_VALUE_OBJECTS;

	/**
	 * The feature id for the '<em><b>One To One Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__ONE_TO_ONE_CONTAINMENT = FOO__ONE_TO_ONE_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Owned Foos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__OWNED_FOOS = FOO__OWNED_FOOS;

	/**
	 * The feature id for the '<em><b>Subpackage Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__SUBPACKAGE_REFERENCE = FOO__SUBPACKAGE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Contained Things With No ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__CONTAINED_THINGS_WITH_NO_ID = FOO__CONTAINED_THINGS_WITH_NO_ID;

	/**
	 * The feature id for the '<em><b>Contained Things With No ID2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION__CONTAINED_THINGS_WITH_NO_ID2 = FOO__CONTAINED_THINGS_WITH_NO_ID2;

	/**
	 * The number of structural features of the '<em>Foo Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION_FEATURE_COUNT = FOO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION___GEN_ID = FOO___GEN_ID;

	/**
	 * The operation id for the '<em>Copy Foo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION___COPY_FOO = FOO___COPY_FOO;

	/**
	 * The number of operations of the '<em>Foo Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_SPECIALIZATION_OPERATION_COUNT = FOO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.core.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.BarImpl
	 * @see model.core.impl.CorePackageImpl#getBar()
	 * @generated
	 */
	int BAR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__ID = NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__EDIT_DATE = NAMED_ENTITY__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__EDIT_USER = NAMED_ENTITY__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__LOCKED = NAMED_ENTITY__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Foo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__FOO = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bazzles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BAZZLES = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Backup For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BACKUP_FOR = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR___GEN_ID = NAMED_ENTITY___GEN_ID;

	/**
	 * The operation id for the '<em>Do Something With Foo And Bazzles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR___DO_SOMETHING_WITH_FOO_AND_BAZZLES__FOO_ELIST = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Do Something With Classes And Numbers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR___DO_SOMETHING_WITH_CLASSES_AND_NUMBERS__ELIST_ELIST = NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.core.impl.BarSpecializationWithComponentsImpl <em>Bar Specialization With Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.BarSpecializationWithComponentsImpl
	 * @see model.core.impl.CorePackageImpl#getBarSpecializationWithComponents()
	 * @generated
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__ID = BAR__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__EDIT_DATE = BAR__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__EDIT_USER = BAR__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__LOCKED = BAR__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__NAME = BAR__NAME;

	/**
	 * The feature id for the '<em><b>Foo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__FOO = BAR__FOO;

	/**
	 * The feature id for the '<em><b>Bazzles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__BAZZLES = BAR__BAZZLES;

	/**
	 * The feature id for the '<em><b>Backup For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__BACKUP_FOR = BAR__BACKUP_FOR;

	/**
	 * The feature id for the '<em><b>Component Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS = BAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Special Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME = BAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bar Specialization With Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS_FEATURE_COUNT = BAR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS___GEN_ID = BAR___GEN_ID;

	/**
	 * The operation id for the '<em>Do Something With Foo And Bazzles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS___DO_SOMETHING_WITH_FOO_AND_BAZZLES__FOO_ELIST = BAR___DO_SOMETHING_WITH_FOO_AND_BAZZLES__FOO_ELIST;

	/**
	 * The operation id for the '<em>Do Something With Classes And Numbers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS___DO_SOMETHING_WITH_CLASSES_AND_NUMBERS__ELIST_ELIST = BAR___DO_SOMETHING_WITH_CLASSES_AND_NUMBERS__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Bar Specialization With Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_SPECIALIZATION_WITH_COMPONENTS_OPERATION_COUNT = BAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.core.impl.BazzleImpl <em>Bazzle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.BazzleImpl
	 * @see model.core.impl.CorePackageImpl#getBazzle()
	 * @generated
	 */
	int BAZZLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE__ID = NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE__EDIT_DATE = NAMED_ENTITY__EDIT_DATE;

	/**
	 * The feature id for the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE__EDIT_USER = NAMED_ENTITY__EDIT_USER;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE__LOCKED = NAMED_ENTITY__LOCKED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Backup Bar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE__BACKUP_BAR = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>One To One Foo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE__ONE_TO_ONE_FOO = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bazzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Gen Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE___GEN_ID = NAMED_ENTITY___GEN_ID;

	/**
	 * The number of operations of the '<em>Bazzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZZLE_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.core.impl.BoundedNumberImpl <em>Bounded Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.BoundedNumberImpl
	 * @see model.core.impl.CorePackageImpl#getBoundedNumber()
	 * @generated
	 */
	int BOUNDED_NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_NUMBER__UNITS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_NUMBER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_NUMBER__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_NUMBER__MIN_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Bounded Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_NUMBER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bounded Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.core.impl.ThingWithoutIDImpl <em>Thing Without ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.impl.ThingWithoutIDImpl
	 * @see model.core.impl.CorePackageImpl#getThingWithoutID()
	 * @generated
	 */
	int THING_WITHOUT_ID = 10;

	/**
	 * The feature id for the '<em><b>Single Non Containment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT = 0;

	/**
	 * The feature id for the '<em><b>Many Non Containment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_WITHOUT_ID__MANY_NON_CONTAINMENT = 1;

	/**
	 * The feature id for the '<em><b>Ref To Other Idless Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_WITHOUT_ID__REF_TO_OTHER_IDLESS_THING = 2;

	/**
	 * The feature id for the '<em><b>Many Ref To Other Idless Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_WITHOUT_ID__MANY_REF_TO_OTHER_IDLESS_THINGS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_WITHOUT_ID__NAME = 4;

	/**
	 * The number of structural features of the '<em>Thing Without ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_WITHOUT_ID_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thing Without ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_WITHOUT_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.core.FooClass <em>Foo Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.core.FooClass
	 * @see model.core.impl.CorePackageImpl#getFooClass()
	 * @generated
	 */
	int FOO_CLASS = 11;


	/**
	 * Returns the meta object for class '{@link model.core.IdedEntity <em>Ided Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ided Entity</em>'.
	 * @see model.core.IdedEntity
	 * @generated
	 */
	EClass getIdedEntity();

	/**
	 * Returns the meta object for the attribute '{@link model.core.IdedEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.core.IdedEntity#getId()
	 * @see #getIdedEntity()
	 * @generated
	 */
	EAttribute getIdedEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.core.IdedEntity#getEditDate <em>Edit Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Date</em>'.
	 * @see model.core.IdedEntity#getEditDate()
	 * @see #getIdedEntity()
	 * @generated
	 */
	EAttribute getIdedEntity_EditDate();

	/**
	 * Returns the meta object for the reference '{@link model.core.IdedEntity#getEditUser <em>Edit User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edit User</em>'.
	 * @see model.core.IdedEntity#getEditUser()
	 * @see #getIdedEntity()
	 * @generated
	 */
	EReference getIdedEntity_EditUser();

	/**
	 * Returns the meta object for the attribute '{@link model.core.IdedEntity#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see model.core.IdedEntity#isLocked()
	 * @see #getIdedEntity()
	 * @generated
	 */
	EAttribute getIdedEntity_Locked();

	/**
	 * Returns the meta object for the '{@link model.core.IdedEntity#genId() <em>Gen Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gen Id</em>' operation.
	 * @see model.core.IdedEntity#genId()
	 * @generated
	 */
	EOperation getIdedEntity__GenId();

	/**
	 * Returns the meta object for class '{@link model.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see model.core.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link model.core.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.core.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link model.core.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see model.core.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link model.core.User#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see model.core.User#getPass()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Pass();

	/**
	 * Returns the meta object for the attribute '{@link model.core.User#getSalt <em>Salt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salt</em>'.
	 * @see model.core.User#getSalt()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Salt();

	/**
	 * Returns the meta object for the attribute '{@link model.core.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see model.core.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for class '{@link model.core.FooGroup <em>Foo Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo Group</em>'.
	 * @see model.core.FooGroup
	 * @generated
	 */
	EClass getFooGroup();

	/**
	 * Returns the meta object for the containment reference '{@link model.core.FooGroup#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see model.core.FooGroup#getUser()
	 * @see #getFooGroup()
	 * @generated
	 */
	EReference getFooGroup_User();

	/**
	 * Returns the meta object for the '{@link model.core.FooGroup#computeFoosOfClass(model.core.FooClass) <em>Compute Foos Of Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Foos Of Class</em>' operation.
	 * @see model.core.FooGroup#computeFoosOfClass(model.core.FooClass)
	 * @generated
	 */
	EOperation getFooGroup__ComputeFoosOfClass__FooClass();

	/**
	 * Returns the meta object for the '{@link model.core.FooGroup#getFoosWithBazzles(org.eclipse.emf.common.util.EList) <em>Get Foos With Bazzles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Foos With Bazzles</em>' operation.
	 * @see model.core.FooGroup#getFoosWithBazzles(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFooGroup__GetFoosWithBazzles__EList();

	/**
	 * Returns the meta object for the '{@link model.core.FooGroup#freeze() <em>Freeze</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Freeze</em>' operation.
	 * @see model.core.FooGroup#freeze()
	 * @generated
	 */
	EOperation getFooGroup__Freeze();

	/**
	 * Returns the meta object for class '{@link model.core.Foo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo</em>'.
	 * @see model.core.Foo
	 * @generated
	 */
	EClass getFoo();

	/**
	 * Returns the meta object for the reference '{@link model.core.Foo#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see model.core.Foo#getGroup()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_Group();

	/**
	 * Returns the meta object for the attribute '{@link model.core.Foo#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see model.core.Foo#getCreationDate()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link model.core.Foo#getFooClass <em>Foo Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foo Class</em>'.
	 * @see model.core.Foo#getFooClass()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_FooClass();

	/**
	 * Returns the meta object for the containment reference '{@link model.core.Foo#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see model.core.Foo#getRange()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link model.core.Foo#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bars</em>'.
	 * @see model.core.Foo#getBars()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_Bars();

	/**
	 * Returns the meta object for the reference '{@link model.core.Foo#getOneToOneBazzle <em>One To One Bazzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>One To One Bazzle</em>'.
	 * @see model.core.Foo#getOneToOneBazzle()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_OneToOneBazzle();

	/**
	 * Returns the meta object for the attribute list '{@link model.core.Foo#getManyAttribute <em>Many Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Many Attribute</em>'.
	 * @see model.core.Foo#getManyAttribute()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_ManyAttribute();

	/**
	 * Returns the meta object for the attribute '{@link model.core.Foo#getUnchangeableAttribute <em>Unchangeable Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unchangeable Attribute</em>'.
	 * @see model.core.Foo#getUnchangeableAttribute()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_UnchangeableAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link model.core.Foo#getUnchangeableReference <em>Unchangeable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchangeable Reference</em>'.
	 * @see model.core.Foo#getUnchangeableReference()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_UnchangeableReference();

	/**
	 * Returns the meta object for the attribute '{@link model.core.Foo#getTransientAttribute <em>Transient Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient Attribute</em>'.
	 * @see model.core.Foo#getTransientAttribute()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_TransientAttribute();

	/**
	 * Returns the meta object for the reference '{@link model.core.Foo#getTransientReference <em>Transient Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transient Reference</em>'.
	 * @see model.core.Foo#getTransientReference()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_TransientReference();

	/**
	 * Returns the meta object for the attribute '{@link model.core.Foo#getVolatileAttribute <em>Volatile Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile Attribute</em>'.
	 * @see model.core.Foo#getVolatileAttribute()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_VolatileAttribute();

	/**
	 * Returns the meta object for the reference '{@link model.core.Foo#getVolatileReference <em>Volatile Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volatile Reference</em>'.
	 * @see model.core.Foo#getVolatileReference()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_VolatileReference();

	/**
	 * Returns the meta object for the reference list '{@link model.core.Foo#getManyCrossAggregate <em>Many Cross Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Many Cross Aggregate</em>'.
	 * @see model.core.Foo#getManyCrossAggregate()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_ManyCrossAggregate();

	/**
	 * Returns the meta object for the reference list '{@link model.core.Foo#getManyCrossAggregateNested <em>Many Cross Aggregate Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Many Cross Aggregate Nested</em>'.
	 * @see model.core.Foo#getManyCrossAggregateNested()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_ManyCrossAggregateNested();

	/**
	 * Returns the meta object for the containment reference list '{@link model.core.Foo#getManyValueObjects <em>Many Value Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many Value Objects</em>'.
	 * @see model.core.Foo#getManyValueObjects()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_ManyValueObjects();

	/**
	 * Returns the meta object for the containment reference '{@link model.core.Foo#getOneToOneContainment <em>One To One Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To One Containment</em>'.
	 * @see model.core.Foo#getOneToOneContainment()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_OneToOneContainment();

	/**
	 * Returns the meta object for the reference list '{@link model.core.Foo#getOwnedFoos <em>Owned Foos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Foos</em>'.
	 * @see model.core.Foo#getOwnedFoos()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_OwnedFoos();

	/**
	 * Returns the meta object for the reference '{@link model.core.Foo#getSubpackageReference <em>Subpackage Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subpackage Reference</em>'.
	 * @see model.core.Foo#getSubpackageReference()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_SubpackageReference();

	/**
	 * Returns the meta object for the containment reference list '{@link model.core.Foo#getContainedThingsWithNoID <em>Contained Things With No ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Things With No ID</em>'.
	 * @see model.core.Foo#getContainedThingsWithNoID()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_ContainedThingsWithNoID();

	/**
	 * Returns the meta object for the containment reference list '{@link model.core.Foo#getContainedThingsWithNoID2 <em>Contained Things With No ID2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Things With No ID2</em>'.
	 * @see model.core.Foo#getContainedThingsWithNoID2()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_ContainedThingsWithNoID2();

	/**
	 * Returns the meta object for the '{@link model.core.Foo#copyFoo() <em>Copy Foo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Foo</em>' operation.
	 * @see model.core.Foo#copyFoo()
	 * @generated
	 */
	EOperation getFoo__CopyFoo();

	/**
	 * Returns the meta object for class '{@link model.core.FooSpecialization <em>Foo Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo Specialization</em>'.
	 * @see model.core.FooSpecialization
	 * @generated
	 */
	EClass getFooSpecialization();

	/**
	 * Returns the meta object for class '{@link model.core.BarSpecializationWithComponents <em>Bar Specialization With Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Specialization With Components</em>'.
	 * @see model.core.BarSpecializationWithComponents
	 * @generated
	 */
	EClass getBarSpecializationWithComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link model.core.BarSpecializationWithComponents#getComponentBars <em>Component Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Bars</em>'.
	 * @see model.core.BarSpecializationWithComponents#getComponentBars()
	 * @see #getBarSpecializationWithComponents()
	 * @generated
	 */
	EReference getBarSpecializationWithComponents_ComponentBars();

	/**
	 * Returns the meta object for the attribute '{@link model.core.BarSpecializationWithComponents#getSpecialName <em>Special Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Name</em>'.
	 * @see model.core.BarSpecializationWithComponents#getSpecialName()
	 * @see #getBarSpecializationWithComponents()
	 * @generated
	 */
	EAttribute getBarSpecializationWithComponents_SpecialName();

	/**
	 * Returns the meta object for class '{@link model.core.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see model.core.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the container reference '{@link model.core.Bar#getFoo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Foo</em>'.
	 * @see model.core.Bar#getFoo()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Foo();

	/**
	 * Returns the meta object for the containment reference list '{@link model.core.Bar#getBazzles <em>Bazzles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bazzles</em>'.
	 * @see model.core.Bar#getBazzles()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Bazzles();

	/**
	 * Returns the meta object for the reference list '{@link model.core.Bar#getBackupFor <em>Backup For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Backup For</em>'.
	 * @see model.core.Bar#getBackupFor()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_BackupFor();

	/**
	 * Returns the meta object for the '{@link model.core.Bar#doSomethingWithFooAndBazzles(model.core.Foo, org.eclipse.emf.common.util.EList) <em>Do Something With Foo And Bazzles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Something With Foo And Bazzles</em>' operation.
	 * @see model.core.Bar#doSomethingWithFooAndBazzles(model.core.Foo, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBar__DoSomethingWithFooAndBazzles__Foo_EList();

	/**
	 * Returns the meta object for the '{@link model.core.Bar#doSomethingWithClassesAndNumbers(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Do Something With Classes And Numbers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Something With Classes And Numbers</em>' operation.
	 * @see model.core.Bar#doSomethingWithClassesAndNumbers(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBar__DoSomethingWithClassesAndNumbers__EList_EList();

	/**
	 * Returns the meta object for class '{@link model.core.Bazzle <em>Bazzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bazzle</em>'.
	 * @see model.core.Bazzle
	 * @generated
	 */
	EClass getBazzle();

	/**
	 * Returns the meta object for the reference '{@link model.core.Bazzle#getBackupBar <em>Backup Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Backup Bar</em>'.
	 * @see model.core.Bazzle#getBackupBar()
	 * @see #getBazzle()
	 * @generated
	 */
	EReference getBazzle_BackupBar();

	/**
	 * Returns the meta object for the reference '{@link model.core.Bazzle#getOneToOneFoo <em>One To One Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>One To One Foo</em>'.
	 * @see model.core.Bazzle#getOneToOneFoo()
	 * @see #getBazzle()
	 * @generated
	 */
	EReference getBazzle_OneToOneFoo();

	/**
	 * Returns the meta object for class '{@link model.core.BoundedNumber <em>Bounded Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Number</em>'.
	 * @see model.core.BoundedNumber
	 * @generated
	 */
	EClass getBoundedNumber();

	/**
	 * Returns the meta object for the attribute '{@link model.core.BoundedNumber#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see model.core.BoundedNumber#getUnits()
	 * @see #getBoundedNumber()
	 * @generated
	 */
	EAttribute getBoundedNumber_Units();

	/**
	 * Returns the meta object for the attribute '{@link model.core.BoundedNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.core.BoundedNumber#getValue()
	 * @see #getBoundedNumber()
	 * @generated
	 */
	EAttribute getBoundedNumber_Value();

	/**
	 * Returns the meta object for the attribute '{@link model.core.BoundedNumber#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see model.core.BoundedNumber#getMaxValue()
	 * @see #getBoundedNumber()
	 * @generated
	 */
	EAttribute getBoundedNumber_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link model.core.BoundedNumber#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see model.core.BoundedNumber#getMinValue()
	 * @see #getBoundedNumber()
	 * @generated
	 */
	EAttribute getBoundedNumber_MinValue();

	/**
	 * Returns the meta object for class '{@link model.core.ThingWithoutID <em>Thing Without ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Without ID</em>'.
	 * @see model.core.ThingWithoutID
	 * @generated
	 */
	EClass getThingWithoutID();

	/**
	 * Returns the meta object for the reference '{@link model.core.ThingWithoutID#getSingleNonContainment <em>Single Non Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Non Containment</em>'.
	 * @see model.core.ThingWithoutID#getSingleNonContainment()
	 * @see #getThingWithoutID()
	 * @generated
	 */
	EReference getThingWithoutID_SingleNonContainment();

	/**
	 * Returns the meta object for the reference list '{@link model.core.ThingWithoutID#getManyNonContainment <em>Many Non Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Many Non Containment</em>'.
	 * @see model.core.ThingWithoutID#getManyNonContainment()
	 * @see #getThingWithoutID()
	 * @generated
	 */
	EReference getThingWithoutID_ManyNonContainment();

	/**
	 * Returns the meta object for the reference '{@link model.core.ThingWithoutID#getRefToOtherIdlessThing <em>Ref To Other Idless Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref To Other Idless Thing</em>'.
	 * @see model.core.ThingWithoutID#getRefToOtherIdlessThing()
	 * @see #getThingWithoutID()
	 * @generated
	 */
	EReference getThingWithoutID_RefToOtherIdlessThing();

	/**
	 * Returns the meta object for the reference list '{@link model.core.ThingWithoutID#getManyRefToOtherIdlessThings <em>Many Ref To Other Idless Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Many Ref To Other Idless Things</em>'.
	 * @see model.core.ThingWithoutID#getManyRefToOtherIdlessThings()
	 * @see #getThingWithoutID()
	 * @generated
	 */
	EReference getThingWithoutID_ManyRefToOtherIdlessThings();

	/**
	 * Returns the meta object for the attribute '{@link model.core.ThingWithoutID#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.core.ThingWithoutID#getName()
	 * @see #getThingWithoutID()
	 * @generated
	 */
	EAttribute getThingWithoutID_Name();

	/**
	 * Returns the meta object for enum '{@link model.core.FooClass <em>Foo Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Foo Class</em>'.
	 * @see model.core.FooClass
	 * @generated
	 */
	EEnum getFooClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link model.core.impl.IdedEntityImpl <em>Ided Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.IdedEntityImpl
		 * @see model.core.impl.CorePackageImpl#getIdedEntity()
		 * @generated
		 */
		EClass IDED_ENTITY = eINSTANCE.getIdedEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDED_ENTITY__ID = eINSTANCE.getIdedEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Edit Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDED_ENTITY__EDIT_DATE = eINSTANCE.getIdedEntity_EditDate();

		/**
		 * The meta object literal for the '<em><b>Edit User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDED_ENTITY__EDIT_USER = eINSTANCE.getIdedEntity_EditUser();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDED_ENTITY__LOCKED = eINSTANCE.getIdedEntity_Locked();

		/**
		 * The meta object literal for the '<em><b>Gen Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDED_ENTITY___GEN_ID = eINSTANCE.getIdedEntity__GenId();

		/**
		 * The meta object literal for the '{@link model.core.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.NamedEntityImpl
		 * @see model.core.impl.CorePackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link model.core.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.UserImpl
		 * @see model.core.impl.CorePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASS = eINSTANCE.getUser_Pass();

		/**
		 * The meta object literal for the '<em><b>Salt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SALT = eINSTANCE.getUser_Salt();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '{@link model.core.impl.FooGroupImpl <em>Foo Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.FooGroupImpl
		 * @see model.core.impl.CorePackageImpl#getFooGroup()
		 * @generated
		 */
		EClass FOO_GROUP = eINSTANCE.getFooGroup();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO_GROUP__USER = eINSTANCE.getFooGroup_User();

		/**
		 * The meta object literal for the '<em><b>Compute Foos Of Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOO_GROUP___COMPUTE_FOOS_OF_CLASS__FOOCLASS = eINSTANCE.getFooGroup__ComputeFoosOfClass__FooClass();

		/**
		 * The meta object literal for the '<em><b>Get Foos With Bazzles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOO_GROUP___GET_FOOS_WITH_BAZZLES__ELIST = eINSTANCE.getFooGroup__GetFoosWithBazzles__EList();

		/**
		 * The meta object literal for the '<em><b>Freeze</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOO_GROUP___FREEZE = eINSTANCE.getFooGroup__Freeze();

		/**
		 * The meta object literal for the '{@link model.core.impl.FooImpl <em>Foo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.FooImpl
		 * @see model.core.impl.CorePackageImpl#getFoo()
		 * @generated
		 */
		EClass FOO = eINSTANCE.getFoo();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__GROUP = eINSTANCE.getFoo_Group();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__CREATION_DATE = eINSTANCE.getFoo_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Foo Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__FOO_CLASS = eINSTANCE.getFoo_FooClass();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__RANGE = eINSTANCE.getFoo_Range();

		/**
		 * The meta object literal for the '<em><b>Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__BARS = eINSTANCE.getFoo_Bars();

		/**
		 * The meta object literal for the '<em><b>One To One Bazzle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__ONE_TO_ONE_BAZZLE = eINSTANCE.getFoo_OneToOneBazzle();

		/**
		 * The meta object literal for the '<em><b>Many Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__MANY_ATTRIBUTE = eINSTANCE.getFoo_ManyAttribute();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__UNCHANGEABLE_ATTRIBUTE = eINSTANCE.getFoo_UnchangeableAttribute();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__UNCHANGEABLE_REFERENCE = eINSTANCE.getFoo_UnchangeableReference();

		/**
		 * The meta object literal for the '<em><b>Transient Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__TRANSIENT_ATTRIBUTE = eINSTANCE.getFoo_TransientAttribute();

		/**
		 * The meta object literal for the '<em><b>Transient Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__TRANSIENT_REFERENCE = eINSTANCE.getFoo_TransientReference();

		/**
		 * The meta object literal for the '<em><b>Volatile Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__VOLATILE_ATTRIBUTE = eINSTANCE.getFoo_VolatileAttribute();

		/**
		 * The meta object literal for the '<em><b>Volatile Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__VOLATILE_REFERENCE = eINSTANCE.getFoo_VolatileReference();

		/**
		 * The meta object literal for the '<em><b>Many Cross Aggregate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__MANY_CROSS_AGGREGATE = eINSTANCE.getFoo_ManyCrossAggregate();

		/**
		 * The meta object literal for the '<em><b>Many Cross Aggregate Nested</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__MANY_CROSS_AGGREGATE_NESTED = eINSTANCE.getFoo_ManyCrossAggregateNested();

		/**
		 * The meta object literal for the '<em><b>Many Value Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__MANY_VALUE_OBJECTS = eINSTANCE.getFoo_ManyValueObjects();

		/**
		 * The meta object literal for the '<em><b>One To One Containment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__ONE_TO_ONE_CONTAINMENT = eINSTANCE.getFoo_OneToOneContainment();

		/**
		 * The meta object literal for the '<em><b>Owned Foos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__OWNED_FOOS = eINSTANCE.getFoo_OwnedFoos();

		/**
		 * The meta object literal for the '<em><b>Subpackage Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__SUBPACKAGE_REFERENCE = eINSTANCE.getFoo_SubpackageReference();

		/**
		 * The meta object literal for the '<em><b>Contained Things With No ID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__CONTAINED_THINGS_WITH_NO_ID = eINSTANCE.getFoo_ContainedThingsWithNoID();

		/**
		 * The meta object literal for the '<em><b>Contained Things With No ID2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__CONTAINED_THINGS_WITH_NO_ID2 = eINSTANCE.getFoo_ContainedThingsWithNoID2();

		/**
		 * The meta object literal for the '<em><b>Copy Foo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOO___COPY_FOO = eINSTANCE.getFoo__CopyFoo();

		/**
		 * The meta object literal for the '{@link model.core.impl.FooSpecializationImpl <em>Foo Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.FooSpecializationImpl
		 * @see model.core.impl.CorePackageImpl#getFooSpecialization()
		 * @generated
		 */
		EClass FOO_SPECIALIZATION = eINSTANCE.getFooSpecialization();

		/**
		 * The meta object literal for the '{@link model.core.impl.BarSpecializationWithComponentsImpl <em>Bar Specialization With Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.BarSpecializationWithComponentsImpl
		 * @see model.core.impl.CorePackageImpl#getBarSpecializationWithComponents()
		 * @generated
		 */
		EClass BAR_SPECIALIZATION_WITH_COMPONENTS = eINSTANCE.getBarSpecializationWithComponents();

		/**
		 * The meta object literal for the '<em><b>Component Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS = eINSTANCE.getBarSpecializationWithComponents_ComponentBars();

		/**
		 * The meta object literal for the '<em><b>Special Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME = eINSTANCE.getBarSpecializationWithComponents_SpecialName();

		/**
		 * The meta object literal for the '{@link model.core.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.BarImpl
		 * @see model.core.impl.CorePackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Foo</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__FOO = eINSTANCE.getBar_Foo();

		/**
		 * The meta object literal for the '<em><b>Bazzles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BAZZLES = eINSTANCE.getBar_Bazzles();

		/**
		 * The meta object literal for the '<em><b>Backup For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BACKUP_FOR = eINSTANCE.getBar_BackupFor();

		/**
		 * The meta object literal for the '<em><b>Do Something With Foo And Bazzles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BAR___DO_SOMETHING_WITH_FOO_AND_BAZZLES__FOO_ELIST = eINSTANCE.getBar__DoSomethingWithFooAndBazzles__Foo_EList();

		/**
		 * The meta object literal for the '<em><b>Do Something With Classes And Numbers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BAR___DO_SOMETHING_WITH_CLASSES_AND_NUMBERS__ELIST_ELIST = eINSTANCE.getBar__DoSomethingWithClassesAndNumbers__EList_EList();

		/**
		 * The meta object literal for the '{@link model.core.impl.BazzleImpl <em>Bazzle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.BazzleImpl
		 * @see model.core.impl.CorePackageImpl#getBazzle()
		 * @generated
		 */
		EClass BAZZLE = eINSTANCE.getBazzle();

		/**
		 * The meta object literal for the '<em><b>Backup Bar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAZZLE__BACKUP_BAR = eINSTANCE.getBazzle_BackupBar();

		/**
		 * The meta object literal for the '<em><b>One To One Foo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAZZLE__ONE_TO_ONE_FOO = eINSTANCE.getBazzle_OneToOneFoo();

		/**
		 * The meta object literal for the '{@link model.core.impl.BoundedNumberImpl <em>Bounded Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.BoundedNumberImpl
		 * @see model.core.impl.CorePackageImpl#getBoundedNumber()
		 * @generated
		 */
		EClass BOUNDED_NUMBER = eINSTANCE.getBoundedNumber();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_NUMBER__UNITS = eINSTANCE.getBoundedNumber_Units();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_NUMBER__VALUE = eINSTANCE.getBoundedNumber_Value();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_NUMBER__MAX_VALUE = eINSTANCE.getBoundedNumber_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_NUMBER__MIN_VALUE = eINSTANCE.getBoundedNumber_MinValue();

		/**
		 * The meta object literal for the '{@link model.core.impl.ThingWithoutIDImpl <em>Thing Without ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.impl.ThingWithoutIDImpl
		 * @see model.core.impl.CorePackageImpl#getThingWithoutID()
		 * @generated
		 */
		EClass THING_WITHOUT_ID = eINSTANCE.getThingWithoutID();

		/**
		 * The meta object literal for the '<em><b>Single Non Containment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT = eINSTANCE.getThingWithoutID_SingleNonContainment();

		/**
		 * The meta object literal for the '<em><b>Many Non Containment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_WITHOUT_ID__MANY_NON_CONTAINMENT = eINSTANCE.getThingWithoutID_ManyNonContainment();

		/**
		 * The meta object literal for the '<em><b>Ref To Other Idless Thing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_WITHOUT_ID__REF_TO_OTHER_IDLESS_THING = eINSTANCE.getThingWithoutID_RefToOtherIdlessThing();

		/**
		 * The meta object literal for the '<em><b>Many Ref To Other Idless Things</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_WITHOUT_ID__MANY_REF_TO_OTHER_IDLESS_THINGS = eINSTANCE.getThingWithoutID_ManyRefToOtherIdlessThings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_WITHOUT_ID__NAME = eINSTANCE.getThingWithoutID_Name();

		/**
		 * The meta object literal for the '{@link model.core.FooClass <em>Foo Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.core.FooClass
		 * @see model.core.impl.CorePackageImpl#getFooClass()
		 * @generated
		 */
		EEnum FOO_CLASS = eINSTANCE.getFooClass();

	}

} //CorePackage
