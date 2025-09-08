/**
 */
package model.core.util;

import model.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.IDED_ENTITY: {
				IdedEntity idedEntity = (IdedEntity)theEObject;
				T result = caseIdedEntity(idedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAMED_ENTITY: {
				NamedEntity namedEntity = (NamedEntity)theEObject;
				T result = caseNamedEntity(namedEntity);
				if (result == null) result = caseIdedEntity(namedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseNamedEntity(user);
				if (result == null) result = caseIdedEntity(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FOO_GROUP: {
				FooGroup fooGroup = (FooGroup)theEObject;
				T result = caseFooGroup(fooGroup);
				if (result == null) result = caseNamedEntity(fooGroup);
				if (result == null) result = caseIdedEntity(fooGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FOO: {
				Foo foo = (Foo)theEObject;
				T result = caseFoo(foo);
				if (result == null) result = caseNamedEntity(foo);
				if (result == null) result = caseIdedEntity(foo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FOO_SPECIALIZATION: {
				FooSpecialization fooSpecialization = (FooSpecialization)theEObject;
				T result = caseFooSpecialization(fooSpecialization);
				if (result == null) result = caseFoo(fooSpecialization);
				if (result == null) result = caseNamedEntity(fooSpecialization);
				if (result == null) result = caseIdedEntity(fooSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BAR_SPECIALIZATION_WITH_COMPONENTS: {
				BarSpecializationWithComponents barSpecializationWithComponents = (BarSpecializationWithComponents)theEObject;
				T result = caseBarSpecializationWithComponents(barSpecializationWithComponents);
				if (result == null) result = caseBar(barSpecializationWithComponents);
				if (result == null) result = caseNamedEntity(barSpecializationWithComponents);
				if (result == null) result = caseIdedEntity(barSpecializationWithComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BAR: {
				Bar bar = (Bar)theEObject;
				T result = caseBar(bar);
				if (result == null) result = caseNamedEntity(bar);
				if (result == null) result = caseIdedEntity(bar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BAZZLE: {
				Bazzle bazzle = (Bazzle)theEObject;
				T result = caseBazzle(bazzle);
				if (result == null) result = caseNamedEntity(bazzle);
				if (result == null) result = caseIdedEntity(bazzle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BOUNDED_NUMBER: {
				BoundedNumber boundedNumber = (BoundedNumber)theEObject;
				T result = caseBoundedNumber(boundedNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.THING_WITHOUT_ID: {
				ThingWithoutID thingWithoutID = (ThingWithoutID)theEObject;
				T result = caseThingWithoutID(thingWithoutID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ided Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ided Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdedEntity(IdedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foo Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foo Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooGroup(FooGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFoo(Foo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foo Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foo Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooSpecialization(FooSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar Specialization With Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar Specialization With Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarSpecializationWithComponents(BarSpecializationWithComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBar(Bar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bazzle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bazzle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBazzle(Bazzle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedNumber(BoundedNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing Without ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing Without ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThingWithoutID(ThingWithoutID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
