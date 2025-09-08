/**
 */
package model.core.impl;

import model.core.Bar;
import model.core.Bazzle;
import model.core.CorePackage;
import model.core.Foo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bazzle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.core.impl.BazzleImpl#getBackupBar <em>Backup Bar</em>}</li>
 *   <li>{@link model.core.impl.BazzleImpl#getOneToOneFoo <em>One To One Foo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BazzleImpl extends NamedEntityImpl implements Bazzle {
	/**
	 * The cached value of the '{@link #getBackupBar() <em>Backup Bar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupBar()
	 * @generated
	 * @ordered
	 */
	protected Bar backupBar;

	/**
	 * The cached value of the '{@link #getOneToOneFoo() <em>One To One Foo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToOneFoo()
	 * @generated
	 * @ordered
	 */
	protected Foo oneToOneFoo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BazzleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BAZZLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bar getBackupBar() {
		if (backupBar != null && backupBar.eIsProxy()) {
			InternalEObject oldBackupBar = (InternalEObject)backupBar;
			backupBar = (Bar)eResolveProxy(oldBackupBar);
			if (backupBar != oldBackupBar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.BAZZLE__BACKUP_BAR, oldBackupBar, backupBar));
			}
		}
		return backupBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar basicGetBackupBar() {
		return backupBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackupBar(Bar newBackupBar, NotificationChain msgs) {
		Bar oldBackupBar = backupBar;
		backupBar = newBackupBar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BAZZLE__BACKUP_BAR, oldBackupBar, newBackupBar);
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
	public void setBackupBar(Bar newBackupBar) {
		if (newBackupBar != backupBar) {
			NotificationChain msgs = null;
			if (backupBar != null)
				msgs = ((InternalEObject)backupBar).eInverseRemove(this, CorePackage.BAR__BACKUP_FOR, Bar.class, msgs);
			if (newBackupBar != null)
				msgs = ((InternalEObject)newBackupBar).eInverseAdd(this, CorePackage.BAR__BACKUP_FOR, Bar.class, msgs);
			msgs = basicSetBackupBar(newBackupBar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAZZLE__BACKUP_BAR, newBackupBar, newBackupBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foo getOneToOneFoo() {
		if (oneToOneFoo != null && oneToOneFoo.eIsProxy()) {
			InternalEObject oldOneToOneFoo = (InternalEObject)oneToOneFoo;
			oneToOneFoo = (Foo)eResolveProxy(oldOneToOneFoo);
			if (oneToOneFoo != oldOneToOneFoo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.BAZZLE__ONE_TO_ONE_FOO, oldOneToOneFoo, oneToOneFoo));
			}
		}
		return oneToOneFoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo basicGetOneToOneFoo() {
		return oneToOneFoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToOneFoo(Foo newOneToOneFoo, NotificationChain msgs) {
		Foo oldOneToOneFoo = oneToOneFoo;
		oneToOneFoo = newOneToOneFoo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BAZZLE__ONE_TO_ONE_FOO, oldOneToOneFoo, newOneToOneFoo);
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
	public void setOneToOneFoo(Foo newOneToOneFoo) {
		if (newOneToOneFoo != oneToOneFoo) {
			NotificationChain msgs = null;
			if (oneToOneFoo != null)
				msgs = ((InternalEObject)oneToOneFoo).eInverseRemove(this, CorePackage.FOO__ONE_TO_ONE_BAZZLE, Foo.class, msgs);
			if (newOneToOneFoo != null)
				msgs = ((InternalEObject)newOneToOneFoo).eInverseAdd(this, CorePackage.FOO__ONE_TO_ONE_BAZZLE, Foo.class, msgs);
			msgs = basicSetOneToOneFoo(newOneToOneFoo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAZZLE__ONE_TO_ONE_FOO, newOneToOneFoo, newOneToOneFoo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BAZZLE__BACKUP_BAR:
				if (backupBar != null)
					msgs = ((InternalEObject)backupBar).eInverseRemove(this, CorePackage.BAR__BACKUP_FOR, Bar.class, msgs);
				return basicSetBackupBar((Bar)otherEnd, msgs);
			case CorePackage.BAZZLE__ONE_TO_ONE_FOO:
				if (oneToOneFoo != null)
					msgs = ((InternalEObject)oneToOneFoo).eInverseRemove(this, CorePackage.FOO__ONE_TO_ONE_BAZZLE, Foo.class, msgs);
				return basicSetOneToOneFoo((Foo)otherEnd, msgs);
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
			case CorePackage.BAZZLE__BACKUP_BAR:
				return basicSetBackupBar(null, msgs);
			case CorePackage.BAZZLE__ONE_TO_ONE_FOO:
				return basicSetOneToOneFoo(null, msgs);
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
			case CorePackage.BAZZLE__BACKUP_BAR:
				if (resolve) return getBackupBar();
				return basicGetBackupBar();
			case CorePackage.BAZZLE__ONE_TO_ONE_FOO:
				if (resolve) return getOneToOneFoo();
				return basicGetOneToOneFoo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.BAZZLE__BACKUP_BAR:
				setBackupBar((Bar)newValue);
				return;
			case CorePackage.BAZZLE__ONE_TO_ONE_FOO:
				setOneToOneFoo((Foo)newValue);
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
			case CorePackage.BAZZLE__BACKUP_BAR:
				setBackupBar((Bar)null);
				return;
			case CorePackage.BAZZLE__ONE_TO_ONE_FOO:
				setOneToOneFoo((Foo)null);
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
			case CorePackage.BAZZLE__BACKUP_BAR:
				return backupBar != null;
			case CorePackage.BAZZLE__ONE_TO_ONE_FOO:
				return oneToOneFoo != null;
		}
		return super.eIsSet(featureID);
	}

} //BazzleImpl
