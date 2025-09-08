/**
 */
package model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.BoundedNumber#getUnits <em>Units</em>}</li>
 *   <li>{@link model.core.BoundedNumber#getValue <em>Value</em>}</li>
 *   <li>{@link model.core.BoundedNumber#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link model.core.BoundedNumber#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getBoundedNumber()
 * @model
 * @generated
 */
public interface BoundedNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see model.core.CorePackage#getBoundedNumber_Units()
	 * @model
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link model.core.BoundedNumber#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see model.core.CorePackage#getBoundedNumber_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link model.core.BoundedNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see model.core.CorePackage#getBoundedNumber_MaxValue()
	 * @model
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link model.core.BoundedNumber#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see model.core.CorePackage#getBoundedNumber_MinValue()
	 * @model
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link model.core.BoundedNumber#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

} // BoundedNumber
