/**
 */
package model.core.CapitalizedPackage.impl;

import model.core.CapitalizedPackage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapitalizedPackageFactoryImpl extends EFactoryImpl implements CapitalizedPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapitalizedPackageFactory init() {
		try {
			CapitalizedPackageFactory theCapitalizedPackageFactory = (CapitalizedPackageFactory)EPackage.Registry.INSTANCE.getEFactory(CapitalizedPackagePackage.eNS_URI);
			if (theCapitalizedPackageFactory != null) {
				return theCapitalizedPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapitalizedPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapitalizedPackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CapitalizedPackagePackage.CLASS_IN_CAPITALIZED_PACKAGE: return createClassInCapitalizedPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInCapitalizedPackage createClassInCapitalizedPackage() {
		ClassInCapitalizedPackageImpl classInCapitalizedPackage = new ClassInCapitalizedPackageImpl();
		return classInCapitalizedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapitalizedPackagePackage getCapitalizedPackagePackage() {
		return (CapitalizedPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapitalizedPackagePackage getPackage() {
		return CapitalizedPackagePackage.eINSTANCE;
	}

} //CapitalizedPackageFactoryImpl
