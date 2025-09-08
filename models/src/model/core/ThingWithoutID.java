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
 *   <li>{@link model.core.ThingWithoutID#getRefToOtherIdlessThing <em>Ref To Other Idless Thing</em>}</li>
 *   <li>{@link model.core.ThingWithoutID#getManyRefToOtherIdlessThings <em>Many Ref To Other Idless Things</em>}</li>
 *   <li>{@link model.core.ThingWithoutID#getName <em>Name</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Ref To Other Idless Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref To Other Idless Thing</em>' reference.
	 * @see #setRefToOtherIdlessThing(ThingWithoutID)
	 * @see model.core.CorePackage#getThingWithoutID_RefToOtherIdlessThing()
	 * @model
	 * @generated
	 */
	ThingWithoutID getRefToOtherIdlessThing();

	/**
	 * Sets the value of the '{@link model.core.ThingWithoutID#getRefToOtherIdlessThing <em>Ref To Other Idless Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref To Other Idless Thing</em>' reference.
	 * @see #getRefToOtherIdlessThing()
	 * @generated
	 */
	void setRefToOtherIdlessThing(ThingWithoutID value);

	/**
	 * Returns the value of the '<em><b>Many Ref To Other Idless Things</b></em>' reference list.
	 * The list contents are of type {@link model.core.ThingWithoutID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many Ref To Other Idless Things</em>' reference list.
	 * @see model.core.CorePackage#getThingWithoutID_ManyRefToOtherIdlessThings()
	 * @model
	 * @generated
	 */
	EList<ThingWithoutID> getManyRefToOtherIdlessThings();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.core.CorePackage#getThingWithoutID_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.core.ThingWithoutID#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ThingWithoutID
