/**
 */
package model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.User#getPass <em>Pass</em>}</li>
 *   <li>{@link model.core.User#getSalt <em>Salt</em>}</li>
 *   <li>{@link model.core.User#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getUser()
 * @model
 * @generated
 */
public interface User extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' attribute.
	 * @see #setPass(String)
	 * @see model.core.CorePackage#getUser_Pass()
	 * @model
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link model.core.User#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

	/**
	 * Returns the value of the '<em><b>Salt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salt</em>' attribute.
	 * @see #setSalt(String)
	 * @see model.core.CorePackage#getUser_Salt()
	 * @model
	 * @generated
	 */
	String getSalt();

	/**
	 * Sets the value of the '{@link model.core.User#getSalt <em>Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salt</em>' attribute.
	 * @see #getSalt()
	 * @generated
	 */
	void setSalt(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see model.core.CorePackage#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link model.core.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // User
