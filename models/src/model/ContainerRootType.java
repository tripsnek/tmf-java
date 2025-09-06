/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Root Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ContainerRootType#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getContainerRootType()
 * @model
 * @generated
 */
public interface ContainerRootType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained</b></em>' containment reference list.
	 * The list contents are of type {@link model.ContainedRootType}.
	 * It is bidirectional and its opposite is '{@link model.ContainedRootType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' containment reference list.
	 * @see model.ModelPackage#getContainerRootType_Contained()
	 * @see model.ContainedRootType#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<ContainedRootType> getContained();

} // ContainerRootType
