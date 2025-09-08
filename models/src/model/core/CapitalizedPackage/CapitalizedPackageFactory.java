/**
 */
package model.core.CapitalizedPackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.core.CapitalizedPackage.CapitalizedPackagePackage
 * @generated
 */
public interface CapitalizedPackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapitalizedPackageFactory eINSTANCE = model.core.CapitalizedPackage.impl.CapitalizedPackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class In Capitalized Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class In Capitalized Package</em>'.
	 * @generated
	 */
	ClassInCapitalizedPackage createClassInCapitalizedPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CapitalizedPackagePackage getCapitalizedPackagePackage();

} //CapitalizedPackageFactory
