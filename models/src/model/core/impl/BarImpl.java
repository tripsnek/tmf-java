/**
 */
package model.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.core.Bar;
import model.core.Bazzle;
import model.core.BoundedNumber;
import model.core.CorePackage;
import model.core.Foo;
import model.core.FooClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.core.impl.BarImpl#getFoo <em>Foo</em>}</li>
 *   <li>{@link model.core.impl.BarImpl#getBazzles <em>Bazzles</em>}</li>
 *   <li>{@link model.core.impl.BarImpl#getBackupFor <em>Backup For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarImpl extends NamedEntityImpl implements Bar {
	/**
	 * The cached value of the '{@link #getBazzles() <em>Bazzles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBazzles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bazzle> bazzles;

	/**
	 * The cached value of the '{@link #getBackupFor() <em>Backup For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Bazzle> backupFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foo getFoo() {
		if (eContainerFeatureID() != CorePackage.BAR__FOO) return null;
		return (Foo)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFoo(Foo newFoo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFoo, CorePackage.BAR__FOO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFoo(Foo newFoo) {
		if (newFoo != eInternalContainer() || (eContainerFeatureID() != CorePackage.BAR__FOO && newFoo != null)) {
			if (EcoreUtil.isAncestor(this, newFoo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFoo != null)
				msgs = ((InternalEObject)newFoo).eInverseAdd(this, CorePackage.FOO__BARS, Foo.class, msgs);
			msgs = basicSetFoo(newFoo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAR__FOO, newFoo, newFoo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bazzle> getBazzles() {
		if (bazzles == null) {
			bazzles = new EObjectContainmentEList<Bazzle>(Bazzle.class, this, CorePackage.BAR__BAZZLES);
		}
		return bazzles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bazzle> getBackupFor() {
		if (backupFor == null) {
			backupFor = new EObjectWithInverseResolvingEList<Bazzle>(Bazzle.class, this, CorePackage.BAR__BACKUP_FOR, CorePackage.BAZZLE__BACKUP_BAR);
		}
		return backupFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSomethingWithFooAndBazzles(Foo foo, EList<Bazzle> bazzles) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSomethingWithClassesAndNumbers(EList<FooClass> classes, EList<BoundedNumber> numbers) {
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
			case CorePackage.BAR__FOO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFoo((Foo)otherEnd, msgs);
			case CorePackage.BAR__BACKUP_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBackupFor()).basicAdd(otherEnd, msgs);
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
			case CorePackage.BAR__FOO:
				return basicSetFoo(null, msgs);
			case CorePackage.BAR__BAZZLES:
				return ((InternalEList<?>)getBazzles()).basicRemove(otherEnd, msgs);
			case CorePackage.BAR__BACKUP_FOR:
				return ((InternalEList<?>)getBackupFor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.BAR__FOO:
				return eInternalContainer().eInverseRemove(this, CorePackage.FOO__BARS, Foo.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.BAR__FOO:
				return getFoo();
			case CorePackage.BAR__BAZZLES:
				return getBazzles();
			case CorePackage.BAR__BACKUP_FOR:
				return getBackupFor();
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
			case CorePackage.BAR__FOO:
				setFoo((Foo)newValue);
				return;
			case CorePackage.BAR__BAZZLES:
				getBazzles().clear();
				getBazzles().addAll((Collection<? extends Bazzle>)newValue);
				return;
			case CorePackage.BAR__BACKUP_FOR:
				getBackupFor().clear();
				getBackupFor().addAll((Collection<? extends Bazzle>)newValue);
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
			case CorePackage.BAR__FOO:
				setFoo((Foo)null);
				return;
			case CorePackage.BAR__BAZZLES:
				getBazzles().clear();
				return;
			case CorePackage.BAR__BACKUP_FOR:
				getBackupFor().clear();
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
			case CorePackage.BAR__FOO:
				return getFoo() != null;
			case CorePackage.BAR__BAZZLES:
				return bazzles != null && !bazzles.isEmpty();
			case CorePackage.BAR__BACKUP_FOR:
				return backupFor != null && !backupFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.BAR___DO_SOMETHING_WITH_FOO_AND_BAZZLES__FOO_ELIST:
				doSomethingWithFooAndBazzles((Foo)arguments.get(0), (EList<Bazzle>)arguments.get(1));
				return null;
			case CorePackage.BAR___DO_SOMETHING_WITH_CLASSES_AND_NUMBERS__ELIST_ELIST:
				doSomethingWithClassesAndNumbers((EList<FooClass>)arguments.get(0), (EList<BoundedNumber>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BarImpl
