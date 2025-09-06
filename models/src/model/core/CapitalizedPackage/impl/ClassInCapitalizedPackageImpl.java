/**
 */
package model.core.CapitalizedPackage.impl;

import java.lang.reflect.InvocationTargetException;

import model.core.CapitalizedPackage.CapitalizedPackagePackage;
import model.core.CapitalizedPackage.ClassInCapitalizedPackage;

import model.core.Foo;
import model.core.FooGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class In Capitalized Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.core.CapitalizedPackage.impl.ClassInCapitalizedPackageImpl#getStringAttr <em>String Attr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassInCapitalizedPackageImpl extends MinimalEObjectImpl.Container implements ClassInCapitalizedPackage {
	/**
	 * The default value of the '{@link #getStringAttr() <em>String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_ATTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringAttr() <em>String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String stringAttr = STRING_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInCapitalizedPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapitalizedPackagePackage.Literals.CLASS_IN_CAPITALIZED_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringAttr() {
		return stringAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringAttr(String newStringAttr) {
		String oldStringAttr = stringAttr;
		stringAttr = newStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapitalizedPackagePackage.CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR, oldStringAttr, stringAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foo interfaceOperation(EList<FooGroup> fooGroup) {
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
			case CapitalizedPackagePackage.CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR:
				return getStringAttr();
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
			case CapitalizedPackagePackage.CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR:
				setStringAttr((String)newValue);
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
			case CapitalizedPackagePackage.CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR:
				setStringAttr(STRING_ATTR_EDEFAULT);
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
			case CapitalizedPackagePackage.CLASS_IN_CAPITALIZED_PACKAGE__STRING_ATTR:
				return STRING_ATTR_EDEFAULT == null ? stringAttr != null : !STRING_ATTR_EDEFAULT.equals(stringAttr);
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
			case CapitalizedPackagePackage.CLASS_IN_CAPITALIZED_PACKAGE___INTERFACE_OPERATION__ELIST:
				return interfaceOperation((EList<FooGroup>)arguments.get(0));
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
		result.append(" (stringAttr: ");
		result.append(stringAttr);
		result.append(')');
		return result.toString();
	}

} //ClassInCapitalizedPackageImpl
