/**
 */
package model.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import model.core.CorePackage;
import model.core.IdedEntity;
import model.core.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ided Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.core.impl.IdedEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.core.impl.IdedEntityImpl#getEditDate <em>Edit Date</em>}</li>
 *   <li>{@link model.core.impl.IdedEntityImpl#getEditUser <em>Edit User</em>}</li>
 *   <li>{@link model.core.impl.IdedEntityImpl#isLocked <em>Locked</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IdedEntityImpl extends MinimalEObjectImpl.Container implements IdedEntity {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditDate() <em>Edit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EDIT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditDate() <em>Edit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditDate()
	 * @generated
	 * @ordered
	 */
	protected Date editDate = EDIT_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEditUser() <em>Edit User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditUser()
	 * @generated
	 * @ordered
	 */
	protected User editUser;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IDED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDED_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEditDate() {
		return editDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditDate(Date newEditDate) {
		Date oldEditDate = editDate;
		editDate = newEditDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDED_ENTITY__EDIT_DATE, oldEditDate, editDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getEditUser() {
		if (editUser != null && editUser.eIsProxy()) {
			InternalEObject oldEditUser = (InternalEObject)editUser;
			editUser = (User)eResolveProxy(oldEditUser);
			if (editUser != oldEditUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IDED_ENTITY__EDIT_USER, oldEditUser, editUser));
			}
		}
		return editUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetEditUser() {
		return editUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditUser(User newEditUser) {
		User oldEditUser = editUser;
		editUser = newEditUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDED_ENTITY__EDIT_USER, oldEditUser, editUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IDED_ENTITY__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void genId() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.IDED_ENTITY__ID:
				return getId();
			case CorePackage.IDED_ENTITY__EDIT_DATE:
				return getEditDate();
			case CorePackage.IDED_ENTITY__EDIT_USER:
				if (resolve) return getEditUser();
				return basicGetEditUser();
			case CorePackage.IDED_ENTITY__LOCKED:
				return isLocked();
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
			case CorePackage.IDED_ENTITY__ID:
				setId((String)newValue);
				return;
			case CorePackage.IDED_ENTITY__EDIT_DATE:
				setEditDate((Date)newValue);
				return;
			case CorePackage.IDED_ENTITY__EDIT_USER:
				setEditUser((User)newValue);
				return;
			case CorePackage.IDED_ENTITY__LOCKED:
				setLocked((Boolean)newValue);
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
			case CorePackage.IDED_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.IDED_ENTITY__EDIT_DATE:
				setEditDate(EDIT_DATE_EDEFAULT);
				return;
			case CorePackage.IDED_ENTITY__EDIT_USER:
				setEditUser((User)null);
				return;
			case CorePackage.IDED_ENTITY__LOCKED:
				setLocked(LOCKED_EDEFAULT);
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
			case CorePackage.IDED_ENTITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.IDED_ENTITY__EDIT_DATE:
				return EDIT_DATE_EDEFAULT == null ? editDate != null : !EDIT_DATE_EDEFAULT.equals(editDate);
			case CorePackage.IDED_ENTITY__EDIT_USER:
				return editUser != null;
			case CorePackage.IDED_ENTITY__LOCKED:
				return locked != LOCKED_EDEFAULT;
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
			case CorePackage.IDED_ENTITY___GEN_ID:
				genId();
				return null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", editDate: ");
		result.append(editDate);
		result.append(", locked: ");
		result.append(locked);
		result.append(')');
		return result.toString();
	}

} //IdedEntityImpl
