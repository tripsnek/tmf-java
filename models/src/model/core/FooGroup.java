/**
 */
package model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foo Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.FooGroup#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getFooGroup()
 * @model
 * @generated
 */
public interface FooGroup extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see model.core.CorePackage#getFooGroup_User()
	 * @model containment="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link model.core.FooGroup#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int computeFoosOfClass(FooClass fooClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bazzlesMany="true"
	 * @generated
	 */
	EList<Foo> getFoosWithBazzles(EList<Bazzle> bazzles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void freeze();

} // FooGroup
