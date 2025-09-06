/**
 */
package model.core.CapitalizedPackage;

import model.core.Foo;
import model.core.FooGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.core.CapitalizedPackage.CapitalizedPackagePackage#getExampleInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExampleInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fooGroupMany="true"
	 * @generated
	 */
	Foo interfaceOperation(EList<FooGroup> fooGroup);

} // ExampleInterface
