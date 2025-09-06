/**
 */
package model.core.impl;

import java.util.Collection;

import model.core.Bar;
import model.core.BarSpecializationWithComponents;
import model.core.CorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar Specialization With Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.core.impl.BarSpecializationWithComponentsImpl#getComponentBars <em>Component Bars</em>}</li>
 *   <li>{@link model.core.impl.BarSpecializationWithComponentsImpl#getSpecialName <em>Special Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarSpecializationWithComponentsImpl extends BarImpl implements BarSpecializationWithComponents {
	/**
	 * The cached value of the '{@link #getComponentBars() <em>Component Bars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentBars()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> componentBars;

	/**
	 * The default value of the '{@link #getSpecialName() <em>Special Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialName() <em>Special Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialName()
	 * @generated
	 * @ordered
	 */
	protected String specialName = SPECIAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarSpecializationWithComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BAR_SPECIALIZATION_WITH_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bar> getComponentBars() {
		if (componentBars == null) {
			componentBars = new EObjectContainmentEList<Bar>(Bar.class, this, CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS);
		}
		return componentBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialName() {
		return specialName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialName(String newSpecialName) {
		String oldSpecialName = specialName;
		specialName = newSpecialName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME, oldSpecialName, specialName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS:
				return ((InternalEList<?>)getComponentBars()).basicRemove(otherEnd, msgs);
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
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS:
				return getComponentBars();
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME:
				return getSpecialName();
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
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS:
				getComponentBars().clear();
				getComponentBars().addAll((Collection<? extends Bar>)newValue);
				return;
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME:
				setSpecialName((String)newValue);
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
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS:
				getComponentBars().clear();
				return;
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME:
				setSpecialName(SPECIAL_NAME_EDEFAULT);
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
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__COMPONENT_BARS:
				return componentBars != null && !componentBars.isEmpty();
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS__SPECIAL_NAME:
				return SPECIAL_NAME_EDEFAULT == null ? specialName != null : !SPECIAL_NAME_EDEFAULT.equals(specialName);
		}
		return super.eIsSet(featureID);
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
		result.append(" (specialName: ");
		result.append(specialName);
		result.append(')');
		return result.toString();
	}

} //BarSpecializationWithComponentsImpl
