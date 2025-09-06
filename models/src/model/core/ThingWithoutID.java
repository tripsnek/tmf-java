/**
 */
package model.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing Without ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.ThingWithoutID#getSingleNonContainment <em>Single Non Containment</em>}</li>
 *   <li>{@link model.core.ThingWithoutID#getManyNonContainment <em>Many Non Containment</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getThingWithoutID()
 * @model
 * @generated
 */
public interface ThingWithoutID extends EObject {
	/**
	 * Returns the value of the '<em><b>Single Non Containment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Non Containment</em>' reference.
	 * @see #setSingleNonContainment(Foo)
	 * @see model.core.CorePackage#getThingWithoutID_SingleNonContainment()
	 * @model
	 * @generated
	 */
	Foo getSingleNonContainment();

	/**
	 * Sets the value of the '{@link model.core.ThingWithoutID#getSingleNonContainment <em>Single Non Containment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Non Containment</em>' reference.
	 * @see #getSingleNonContainment()
	 * @generated
	 */
	void setSingleNonContainment(Foo value);

	/**
	 * Returns the value of the '<em><b>Many Non Containment</b></em>' reference list.
	 * The list contents are of type {@link model.core.Foo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many Non Containment</em>' reference list.
	 * @see model.core.CorePackage#getThingWithoutID_ManyNonContainment()
	 * @model
	 * @generated
	 */
	EList<Foo> getManyNonContainment();

} // ThingWithoutID
