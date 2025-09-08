/**
 */
package model.core;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ided Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.IdedEntity#getId <em>Id</em>}</li>
 *   <li>{@link model.core.IdedEntity#getEditDate <em>Edit Date</em>}</li>
 *   <li>{@link model.core.IdedEntity#getEditUser <em>Edit User</em>}</li>
 *   <li>{@link model.core.IdedEntity#isLocked <em>Locked</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getIdedEntity()
 * @model abstract="true"
 * @generated
 */
public interface IdedEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see model.core.CorePackage#getIdedEntity_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link model.core.IdedEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Date</em>' attribute.
	 * @see #setEditDate(Date)
	 * @see model.core.CorePackage#getIdedEntity_EditDate()
	 * @model
	 * @generated
	 */
	Date getEditDate();

	/**
	 * Sets the value of the '{@link model.core.IdedEntity#getEditDate <em>Edit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Date</em>' attribute.
	 * @see #getEditDate()
	 * @generated
	 */
	void setEditDate(Date value);

	/**
	 * Returns the value of the '<em><b>Edit User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit User</em>' reference.
	 * @see #setEditUser(User)
	 * @see model.core.CorePackage#getIdedEntity_EditUser()
	 * @model
	 * @generated
	 */
	User getEditUser();

	/**
	 * Sets the value of the '{@link model.core.IdedEntity#getEditUser <em>Edit User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit User</em>' reference.
	 * @see #getEditUser()
	 * @generated
	 */
	void setEditUser(User value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see model.core.CorePackage#getIdedEntity_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link model.core.IdedEntity#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void genId();

} // IdedEntity
