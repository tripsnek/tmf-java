/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Root Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ContainedRootType#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getContainedRootType()
 * @model
 * @generated
 */
public interface ContainedRootType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.ContainerRootType#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(ContainerRootType)
	 * @see model.ModelPackage#getContainedRootType_Container()
	 * @see model.ContainerRootType#getContained
	 * @model opposite="contained" transient="false"
	 * @generated
	 */
	ContainerRootType getContainer();

	/**
	 * Sets the value of the '{@link model.ContainedRootType#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerRootType value);

} // ContainedRootType
