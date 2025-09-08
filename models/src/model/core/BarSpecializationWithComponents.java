/**
 */
package model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar Specialization With Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.BarSpecializationWithComponents#getComponentBars <em>Component Bars</em>}</li>
 *   <li>{@link model.core.BarSpecializationWithComponents#getSpecialName <em>Special Name</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getBarSpecializationWithComponents()
 * @model
 * @generated
 */
public interface BarSpecializationWithComponents extends Bar {
	/**
	 * Returns the value of the '<em><b>Component Bars</b></em>' containment reference list.
	 * The list contents are of type {@link model.core.Bar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Bars</em>' containment reference list.
	 * @see model.core.CorePackage#getBarSpecializationWithComponents_ComponentBars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bar> getComponentBars();

	/**
	 * Returns the value of the '<em><b>Special Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Name</em>' attribute.
	 * @see #setSpecialName(String)
	 * @see model.core.CorePackage#getBarSpecializationWithComponents_SpecialName()
	 * @model
	 * @generated
	 */
	String getSpecialName();

	/**
	 * Sets the value of the '{@link model.core.BarSpecializationWithComponents#getSpecialName <em>Special Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Name</em>' attribute.
	 * @see #getSpecialName()
	 * @generated
	 */
	void setSpecialName(String value);

} // BarSpecializationWithComponents
