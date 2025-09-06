/**
 */
package model.analysis;

import model.core.IdedEntity;
import model.core.NamedEntity;
import model.core.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.analysis.AnalysisResult#getUser <em>User</em>}</li>
 *   <li>{@link model.analysis.AnalysisResult#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see model.analysis.AnalysisPackage#getAnalysisResult()
 * @model
 * @generated
 */
public interface AnalysisResult extends IdedEntity {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see model.analysis.AnalysisPackage#getAnalysisResult_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link model.analysis.AnalysisResult#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(NamedEntity)
	 * @see model.analysis.AnalysisPackage#getAnalysisResult_Object()
	 * @model containment="true"
	 * @generated
	 */
	NamedEntity getObject();

	/**
	 * Sets the value of the '{@link model.analysis.AnalysisResult#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(NamedEntity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NamedEntity cloneObject(boolean deepCopy, User newUser);

} // AnalysisResult
