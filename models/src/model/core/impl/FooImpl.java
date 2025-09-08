/**
 */
package model.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import model.core.Bar;
import model.core.Bazzle;
import model.core.BoundedNumber;

import model.core.CapitalizedPackage.ClassInCapitalizedPackage;

import model.core.CorePackage;
import model.core.Foo;
import model.core.FooClass;
import model.core.FooGroup;
import model.core.ThingWithoutID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.core.impl.FooImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getFooClass <em>Foo Class</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getRange <em>Range</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getBars <em>Bars</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getOneToOneBazzle <em>One To One Bazzle</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getManyAttribute <em>Many Attribute</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getUnchangeableAttribute <em>Unchangeable Attribute</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getUnchangeableReference <em>Unchangeable Reference</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getTransientAttribute <em>Transient Attribute</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getTransientReference <em>Transient Reference</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getVolatileAttribute <em>Volatile Attribute</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getVolatileReference <em>Volatile Reference</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getManyCrossAggregate <em>Many Cross Aggregate</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getManyCrossAggregateNested <em>Many Cross Aggregate Nested</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getManyValueObjects <em>Many Value Objects</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getOneToOneContainment <em>One To One Containment</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getOwnedFoos <em>Owned Foos</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getSubpackageReference <em>Subpackage Reference</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getContainedThingsWithNoID <em>Contained Things With No ID</em>}</li>
 *   <li>{@link model.core.impl.FooImpl#getContainedThingsWithNoID2 <em>Contained Things With No ID2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FooImpl extends NamedEntityImpl implements Foo {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FooGroup group;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooClass() <em>Foo Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooClass()
	 * @generated
	 * @ordered
	 */
	protected static final FooClass FOO_CLASS_EDEFAULT = FooClass.SHORT;

	/**
	 * The cached value of the '{@link #getFooClass() <em>Foo Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooClass()
	 * @generated
	 * @ordered
	 */
	protected FooClass fooClass = FOO_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected BoundedNumber range;

	/**
	 * The cached value of the '{@link #getBars() <em>Bars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBars()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> bars;

	/**
	 * The cached value of the '{@link #getOneToOneBazzle() <em>One To One Bazzle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToOneBazzle()
	 * @generated
	 * @ordered
	 */
	protected Bazzle oneToOneBazzle;

	/**
	 * The cached value of the '{@link #getManyAttribute() <em>Many Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<String> manyAttribute;

	/**
	 * The default value of the '{@link #getUnchangeableAttribute() <em>Unchangeable Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String UNCHANGEABLE_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnchangeableAttribute() <em>Unchangeable Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableAttribute()
	 * @generated
	 * @ordered
	 */
	protected String unchangeableAttribute = UNCHANGEABLE_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnchangeableReference() <em>Unchangeable Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableReference()
	 * @generated
	 * @ordered
	 */
	protected Bazzle unchangeableReference;

	/**
	 * The default value of the '{@link #getTransientAttribute() <em>Transient Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSIENT_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransientAttribute() <em>Transient Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientAttribute()
	 * @generated
	 * @ordered
	 */
	protected String transientAttribute = TRANSIENT_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransientReference() <em>Transient Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientReference()
	 * @generated
	 * @ordered
	 */
	protected Foo transientReference;

	/**
	 * The default value of the '{@link #getVolatileAttribute() <em>Volatile Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLATILE_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManyCrossAggregate() <em>Many Cross Aggregate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyCrossAggregate()
	 * @generated
	 * @ordered
	 */
	protected EList<Foo> manyCrossAggregate;

	/**
	 * The cached value of the '{@link #getManyCrossAggregateNested() <em>Many Cross Aggregate Nested</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyCrossAggregateNested()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> manyCrossAggregateNested;

	/**
	 * The cached value of the '{@link #getManyValueObjects() <em>Many Value Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyValueObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundedNumber> manyValueObjects;

	/**
	 * The cached value of the '{@link #getOneToOneContainment() <em>One To One Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToOneContainment()
	 * @generated
	 * @ordered
	 */
	protected Bazzle oneToOneContainment;

	/**
	 * The cached value of the '{@link #getOwnedFoos() <em>Owned Foos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFoos()
	 * @generated
	 * @ordered
	 */
	protected EList<Foo> ownedFoos;

	/**
	 * The cached value of the '{@link #getSubpackageReference() <em>Subpackage Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackageReference()
	 * @generated
	 * @ordered
	 */
	protected ClassInCapitalizedPackage subpackageReference;

	/**
	 * The cached value of the '{@link #getContainedThingsWithNoID() <em>Contained Things With No ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedThingsWithNoID()
	 * @generated
	 * @ordered
	 */
	protected EList<ThingWithoutID> containedThingsWithNoID;

	/**
	 * The cached value of the '{@link #getContainedThingsWithNoID2() <em>Contained Things With No ID2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedThingsWithNoID2()
	 * @generated
	 * @ordered
	 */
	protected EList<ThingWithoutID> containedThingsWithNoID2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FooImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FOO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FooGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (FooGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.FOO__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(FooGroup newGroup) {
		FooGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FooClass getFooClass() {
		return fooClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooClass(FooClass newFooClass) {
		FooClass oldFooClass = fooClass;
		fooClass = newFooClass == null ? FOO_CLASS_EDEFAULT : newFooClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__FOO_CLASS, oldFooClass, fooClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedNumber getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(BoundedNumber newRange, NotificationChain msgs) {
		BoundedNumber oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FOO__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(BoundedNumber newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FOO__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FOO__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bar> getBars() {
		if (bars == null) {
			bars = new EObjectContainmentWithInverseEList<Bar>(Bar.class, this, CorePackage.FOO__BARS, CorePackage.BAR__FOO);
		}
		return bars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bazzle getOneToOneBazzle() {
		if (oneToOneBazzle != null && oneToOneBazzle.eIsProxy()) {
			InternalEObject oldOneToOneBazzle = (InternalEObject)oneToOneBazzle;
			oneToOneBazzle = (Bazzle)eResolveProxy(oldOneToOneBazzle);
			if (oneToOneBazzle != oldOneToOneBazzle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.FOO__ONE_TO_ONE_BAZZLE, oldOneToOneBazzle, oneToOneBazzle));
			}
		}
		return oneToOneBazzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bazzle basicGetOneToOneBazzle() {
		return oneToOneBazzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToOneBazzle(Bazzle newOneToOneBazzle, NotificationChain msgs) {
		Bazzle oldOneToOneBazzle = oneToOneBazzle;
		oneToOneBazzle = newOneToOneBazzle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FOO__ONE_TO_ONE_BAZZLE, oldOneToOneBazzle, newOneToOneBazzle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneToOneBazzle(Bazzle newOneToOneBazzle) {
		if (newOneToOneBazzle != oneToOneBazzle) {
			NotificationChain msgs = null;
			if (oneToOneBazzle != null)
				msgs = ((InternalEObject)oneToOneBazzle).eInverseRemove(this, CorePackage.BAZZLE__ONE_TO_ONE_FOO, Bazzle.class, msgs);
			if (newOneToOneBazzle != null)
				msgs = ((InternalEObject)newOneToOneBazzle).eInverseAdd(this, CorePackage.BAZZLE__ONE_TO_ONE_FOO, Bazzle.class, msgs);
			msgs = basicSetOneToOneBazzle(newOneToOneBazzle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__ONE_TO_ONE_BAZZLE, newOneToOneBazzle, newOneToOneBazzle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getManyAttribute() {
		if (manyAttribute == null) {
			manyAttribute = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.FOO__MANY_ATTRIBUTE);
		}
		return manyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnchangeableAttribute() {
		return unchangeableAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bazzle getUnchangeableReference() {
		return unchangeableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnchangeableReference(Bazzle newUnchangeableReference, NotificationChain msgs) {
		Bazzle oldUnchangeableReference = unchangeableReference;
		unchangeableReference = newUnchangeableReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FOO__UNCHANGEABLE_REFERENCE, oldUnchangeableReference, newUnchangeableReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransientAttribute() {
		return transientAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransientAttribute(String newTransientAttribute) {
		String oldTransientAttribute = transientAttribute;
		transientAttribute = newTransientAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__TRANSIENT_ATTRIBUTE, oldTransientAttribute, transientAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foo getTransientReference() {
		if (transientReference != null && transientReference.eIsProxy()) {
			InternalEObject oldTransientReference = (InternalEObject)transientReference;
			transientReference = (Foo)eResolveProxy(oldTransientReference);
			if (transientReference != oldTransientReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.FOO__TRANSIENT_REFERENCE, oldTransientReference, transientReference));
			}
		}
		return transientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo basicGetTransientReference() {
		return transientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransientReference(Foo newTransientReference) {
		Foo oldTransientReference = transientReference;
		transientReference = newTransientReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__TRANSIENT_REFERENCE, oldTransientReference, transientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolatileAttribute() {
		// TODO: implement this method to return the 'Volatile Attribute' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolatileAttribute(String newVolatileAttribute) {
		// TODO: implement this method to set the 'Volatile Attribute' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foo getVolatileReference() {
		Foo volatileReference = basicGetVolatileReference();
		return volatileReference != null && volatileReference.eIsProxy() ? (Foo)eResolveProxy((InternalEObject)volatileReference) : volatileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo basicGetVolatileReference() {
		// TODO: implement this method to return the 'Volatile Reference' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolatileReference(Foo newVolatileReference) {
		// TODO: implement this method to set the 'Volatile Reference' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Foo> getManyCrossAggregate() {
		if (manyCrossAggregate == null) {
			manyCrossAggregate = new EObjectResolvingEList<Foo>(Foo.class, this, CorePackage.FOO__MANY_CROSS_AGGREGATE);
		}
		return manyCrossAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bar> getManyCrossAggregateNested() {
		if (manyCrossAggregateNested == null) {
			manyCrossAggregateNested = new EObjectResolvingEList<Bar>(Bar.class, this, CorePackage.FOO__MANY_CROSS_AGGREGATE_NESTED);
		}
		return manyCrossAggregateNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundedNumber> getManyValueObjects() {
		if (manyValueObjects == null) {
			manyValueObjects = new EObjectContainmentEList<BoundedNumber>(BoundedNumber.class, this, CorePackage.FOO__MANY_VALUE_OBJECTS);
		}
		return manyValueObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bazzle getOneToOneContainment() {
		return oneToOneContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToOneContainment(Bazzle newOneToOneContainment, NotificationChain msgs) {
		Bazzle oldOneToOneContainment = oneToOneContainment;
		oneToOneContainment = newOneToOneContainment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FOO__ONE_TO_ONE_CONTAINMENT, oldOneToOneContainment, newOneToOneContainment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneToOneContainment(Bazzle newOneToOneContainment) {
		if (newOneToOneContainment != oneToOneContainment) {
			NotificationChain msgs = null;
			if (oneToOneContainment != null)
				msgs = ((InternalEObject)oneToOneContainment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FOO__ONE_TO_ONE_CONTAINMENT, null, msgs);
			if (newOneToOneContainment != null)
				msgs = ((InternalEObject)newOneToOneContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FOO__ONE_TO_ONE_CONTAINMENT, null, msgs);
			msgs = basicSetOneToOneContainment(newOneToOneContainment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__ONE_TO_ONE_CONTAINMENT, newOneToOneContainment, newOneToOneContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Foo> getOwnedFoos() {
		if (ownedFoos == null) {
			ownedFoos = new EObjectResolvingEList<Foo>(Foo.class, this, CorePackage.FOO__OWNED_FOOS);
		}
		return ownedFoos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInCapitalizedPackage getSubpackageReference() {
		if (subpackageReference != null && subpackageReference.eIsProxy()) {
			InternalEObject oldSubpackageReference = (InternalEObject)subpackageReference;
			subpackageReference = (ClassInCapitalizedPackage)eResolveProxy(oldSubpackageReference);
			if (subpackageReference != oldSubpackageReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.FOO__SUBPACKAGE_REFERENCE, oldSubpackageReference, subpackageReference));
			}
		}
		return subpackageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInCapitalizedPackage basicGetSubpackageReference() {
		return subpackageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubpackageReference(ClassInCapitalizedPackage newSubpackageReference) {
		ClassInCapitalizedPackage oldSubpackageReference = subpackageReference;
		subpackageReference = newSubpackageReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOO__SUBPACKAGE_REFERENCE, oldSubpackageReference, subpackageReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThingWithoutID> getContainedThingsWithNoID() {
		if (containedThingsWithNoID == null) {
			containedThingsWithNoID = new EObjectContainmentEList<ThingWithoutID>(ThingWithoutID.class, this, CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID);
		}
		return containedThingsWithNoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThingWithoutID> getContainedThingsWithNoID2() {
		if (containedThingsWithNoID2 == null) {
			containedThingsWithNoID2 = new EObjectContainmentEList<ThingWithoutID>(ThingWithoutID.class, this, CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID2);
		}
		return containedThingsWithNoID2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foo copyFoo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FOO__BARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBars()).basicAdd(otherEnd, msgs);
			case CorePackage.FOO__ONE_TO_ONE_BAZZLE:
				if (oneToOneBazzle != null)
					msgs = ((InternalEObject)oneToOneBazzle).eInverseRemove(this, CorePackage.BAZZLE__ONE_TO_ONE_FOO, Bazzle.class, msgs);
				return basicSetOneToOneBazzle((Bazzle)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FOO__RANGE:
				return basicSetRange(null, msgs);
			case CorePackage.FOO__BARS:
				return ((InternalEList<?>)getBars()).basicRemove(otherEnd, msgs);
			case CorePackage.FOO__ONE_TO_ONE_BAZZLE:
				return basicSetOneToOneBazzle(null, msgs);
			case CorePackage.FOO__UNCHANGEABLE_REFERENCE:
				return basicSetUnchangeableReference(null, msgs);
			case CorePackage.FOO__MANY_VALUE_OBJECTS:
				return ((InternalEList<?>)getManyValueObjects()).basicRemove(otherEnd, msgs);
			case CorePackage.FOO__ONE_TO_ONE_CONTAINMENT:
				return basicSetOneToOneContainment(null, msgs);
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID:
				return ((InternalEList<?>)getContainedThingsWithNoID()).basicRemove(otherEnd, msgs);
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID2:
				return ((InternalEList<?>)getContainedThingsWithNoID2()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.FOO__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case CorePackage.FOO__CREATION_DATE:
				return getCreationDate();
			case CorePackage.FOO__FOO_CLASS:
				return getFooClass();
			case CorePackage.FOO__RANGE:
				return getRange();
			case CorePackage.FOO__BARS:
				return getBars();
			case CorePackage.FOO__ONE_TO_ONE_BAZZLE:
				if (resolve) return getOneToOneBazzle();
				return basicGetOneToOneBazzle();
			case CorePackage.FOO__MANY_ATTRIBUTE:
				return getManyAttribute();
			case CorePackage.FOO__UNCHANGEABLE_ATTRIBUTE:
				return getUnchangeableAttribute();
			case CorePackage.FOO__UNCHANGEABLE_REFERENCE:
				return getUnchangeableReference();
			case CorePackage.FOO__TRANSIENT_ATTRIBUTE:
				return getTransientAttribute();
			case CorePackage.FOO__TRANSIENT_REFERENCE:
				if (resolve) return getTransientReference();
				return basicGetTransientReference();
			case CorePackage.FOO__VOLATILE_ATTRIBUTE:
				return getVolatileAttribute();
			case CorePackage.FOO__VOLATILE_REFERENCE:
				if (resolve) return getVolatileReference();
				return basicGetVolatileReference();
			case CorePackage.FOO__MANY_CROSS_AGGREGATE:
				return getManyCrossAggregate();
			case CorePackage.FOO__MANY_CROSS_AGGREGATE_NESTED:
				return getManyCrossAggregateNested();
			case CorePackage.FOO__MANY_VALUE_OBJECTS:
				return getManyValueObjects();
			case CorePackage.FOO__ONE_TO_ONE_CONTAINMENT:
				return getOneToOneContainment();
			case CorePackage.FOO__OWNED_FOOS:
				return getOwnedFoos();
			case CorePackage.FOO__SUBPACKAGE_REFERENCE:
				if (resolve) return getSubpackageReference();
				return basicGetSubpackageReference();
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID:
				return getContainedThingsWithNoID();
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID2:
				return getContainedThingsWithNoID2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.FOO__GROUP:
				setGroup((FooGroup)newValue);
				return;
			case CorePackage.FOO__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case CorePackage.FOO__FOO_CLASS:
				setFooClass((FooClass)newValue);
				return;
			case CorePackage.FOO__RANGE:
				setRange((BoundedNumber)newValue);
				return;
			case CorePackage.FOO__BARS:
				getBars().clear();
				getBars().addAll((Collection<? extends Bar>)newValue);
				return;
			case CorePackage.FOO__ONE_TO_ONE_BAZZLE:
				setOneToOneBazzle((Bazzle)newValue);
				return;
			case CorePackage.FOO__MANY_ATTRIBUTE:
				getManyAttribute().clear();
				getManyAttribute().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.FOO__TRANSIENT_ATTRIBUTE:
				setTransientAttribute((String)newValue);
				return;
			case CorePackage.FOO__TRANSIENT_REFERENCE:
				setTransientReference((Foo)newValue);
				return;
			case CorePackage.FOO__VOLATILE_ATTRIBUTE:
				setVolatileAttribute((String)newValue);
				return;
			case CorePackage.FOO__VOLATILE_REFERENCE:
				setVolatileReference((Foo)newValue);
				return;
			case CorePackage.FOO__MANY_CROSS_AGGREGATE:
				getManyCrossAggregate().clear();
				getManyCrossAggregate().addAll((Collection<? extends Foo>)newValue);
				return;
			case CorePackage.FOO__MANY_CROSS_AGGREGATE_NESTED:
				getManyCrossAggregateNested().clear();
				getManyCrossAggregateNested().addAll((Collection<? extends Bar>)newValue);
				return;
			case CorePackage.FOO__MANY_VALUE_OBJECTS:
				getManyValueObjects().clear();
				getManyValueObjects().addAll((Collection<? extends BoundedNumber>)newValue);
				return;
			case CorePackage.FOO__ONE_TO_ONE_CONTAINMENT:
				setOneToOneContainment((Bazzle)newValue);
				return;
			case CorePackage.FOO__OWNED_FOOS:
				getOwnedFoos().clear();
				getOwnedFoos().addAll((Collection<? extends Foo>)newValue);
				return;
			case CorePackage.FOO__SUBPACKAGE_REFERENCE:
				setSubpackageReference((ClassInCapitalizedPackage)newValue);
				return;
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID:
				getContainedThingsWithNoID().clear();
				getContainedThingsWithNoID().addAll((Collection<? extends ThingWithoutID>)newValue);
				return;
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID2:
				getContainedThingsWithNoID2().clear();
				getContainedThingsWithNoID2().addAll((Collection<? extends ThingWithoutID>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.FOO__GROUP:
				setGroup((FooGroup)null);
				return;
			case CorePackage.FOO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case CorePackage.FOO__FOO_CLASS:
				setFooClass(FOO_CLASS_EDEFAULT);
				return;
			case CorePackage.FOO__RANGE:
				setRange((BoundedNumber)null);
				return;
			case CorePackage.FOO__BARS:
				getBars().clear();
				return;
			case CorePackage.FOO__ONE_TO_ONE_BAZZLE:
				setOneToOneBazzle((Bazzle)null);
				return;
			case CorePackage.FOO__MANY_ATTRIBUTE:
				getManyAttribute().clear();
				return;
			case CorePackage.FOO__TRANSIENT_ATTRIBUTE:
				setTransientAttribute(TRANSIENT_ATTRIBUTE_EDEFAULT);
				return;
			case CorePackage.FOO__TRANSIENT_REFERENCE:
				setTransientReference((Foo)null);
				return;
			case CorePackage.FOO__VOLATILE_ATTRIBUTE:
				setVolatileAttribute(VOLATILE_ATTRIBUTE_EDEFAULT);
				return;
			case CorePackage.FOO__VOLATILE_REFERENCE:
				setVolatileReference((Foo)null);
				return;
			case CorePackage.FOO__MANY_CROSS_AGGREGATE:
				getManyCrossAggregate().clear();
				return;
			case CorePackage.FOO__MANY_CROSS_AGGREGATE_NESTED:
				getManyCrossAggregateNested().clear();
				return;
			case CorePackage.FOO__MANY_VALUE_OBJECTS:
				getManyValueObjects().clear();
				return;
			case CorePackage.FOO__ONE_TO_ONE_CONTAINMENT:
				setOneToOneContainment((Bazzle)null);
				return;
			case CorePackage.FOO__OWNED_FOOS:
				getOwnedFoos().clear();
				return;
			case CorePackage.FOO__SUBPACKAGE_REFERENCE:
				setSubpackageReference((ClassInCapitalizedPackage)null);
				return;
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID:
				getContainedThingsWithNoID().clear();
				return;
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID2:
				getContainedThingsWithNoID2().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.FOO__GROUP:
				return group != null;
			case CorePackage.FOO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case CorePackage.FOO__FOO_CLASS:
				return fooClass != FOO_CLASS_EDEFAULT;
			case CorePackage.FOO__RANGE:
				return range != null;
			case CorePackage.FOO__BARS:
				return bars != null && !bars.isEmpty();
			case CorePackage.FOO__ONE_TO_ONE_BAZZLE:
				return oneToOneBazzle != null;
			case CorePackage.FOO__MANY_ATTRIBUTE:
				return manyAttribute != null && !manyAttribute.isEmpty();
			case CorePackage.FOO__UNCHANGEABLE_ATTRIBUTE:
				return UNCHANGEABLE_ATTRIBUTE_EDEFAULT == null ? unchangeableAttribute != null : !UNCHANGEABLE_ATTRIBUTE_EDEFAULT.equals(unchangeableAttribute);
			case CorePackage.FOO__UNCHANGEABLE_REFERENCE:
				return unchangeableReference != null;
			case CorePackage.FOO__TRANSIENT_ATTRIBUTE:
				return TRANSIENT_ATTRIBUTE_EDEFAULT == null ? transientAttribute != null : !TRANSIENT_ATTRIBUTE_EDEFAULT.equals(transientAttribute);
			case CorePackage.FOO__TRANSIENT_REFERENCE:
				return transientReference != null;
			case CorePackage.FOO__VOLATILE_ATTRIBUTE:
				return VOLATILE_ATTRIBUTE_EDEFAULT == null ? getVolatileAttribute() != null : !VOLATILE_ATTRIBUTE_EDEFAULT.equals(getVolatileAttribute());
			case CorePackage.FOO__VOLATILE_REFERENCE:
				return basicGetVolatileReference() != null;
			case CorePackage.FOO__MANY_CROSS_AGGREGATE:
				return manyCrossAggregate != null && !manyCrossAggregate.isEmpty();
			case CorePackage.FOO__MANY_CROSS_AGGREGATE_NESTED:
				return manyCrossAggregateNested != null && !manyCrossAggregateNested.isEmpty();
			case CorePackage.FOO__MANY_VALUE_OBJECTS:
				return manyValueObjects != null && !manyValueObjects.isEmpty();
			case CorePackage.FOO__ONE_TO_ONE_CONTAINMENT:
				return oneToOneContainment != null;
			case CorePackage.FOO__OWNED_FOOS:
				return ownedFoos != null && !ownedFoos.isEmpty();
			case CorePackage.FOO__SUBPACKAGE_REFERENCE:
				return subpackageReference != null;
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID:
				return containedThingsWithNoID != null && !containedThingsWithNoID.isEmpty();
			case CorePackage.FOO__CONTAINED_THINGS_WITH_NO_ID2:
				return containedThingsWithNoID2 != null && !containedThingsWithNoID2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.FOO___COPY_FOO:
				return copyFoo();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(", fooClass: ");
		result.append(fooClass);
		result.append(", manyAttribute: ");
		result.append(manyAttribute);
		result.append(", unchangeableAttribute: ");
		result.append(unchangeableAttribute);
		result.append(", transientAttribute: ");
		result.append(transientAttribute);
		result.append(')');
		return result.toString();
	}

} //FooImpl
