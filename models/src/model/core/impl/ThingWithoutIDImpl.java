/**
 */
package model.core.impl;

import java.util.Collection;

import model.core.CorePackage;
import model.core.Foo;
import model.core.ThingWithoutID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing Without ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.core.impl.ThingWithoutIDImpl#getSingleNonContainment <em>Single Non Containment</em>}</li>
 *   <li>{@link model.core.impl.ThingWithoutIDImpl#getManyNonContainment <em>Many Non Containment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingWithoutIDImpl extends MinimalEObjectImpl.Container implements ThingWithoutID {
	/**
	 * The cached value of the '{@link #getSingleNonContainment() <em>Single Non Containment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleNonContainment()
	 * @generated
	 * @ordered
	 */
	protected Foo singleNonContainment;

	/**
	 * The cached value of the '{@link #getManyNonContainment() <em>Many Non Containment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyNonContainment()
	 * @generated
	 * @ordered
	 */
	protected EList<Foo> manyNonContainment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingWithoutIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.THING_WITHOUT_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foo getSingleNonContainment() {
		if (singleNonContainment != null && singleNonContainment.eIsProxy()) {
			InternalEObject oldSingleNonContainment = (InternalEObject)singleNonContainment;
			singleNonContainment = (Foo)eResolveProxy(oldSingleNonContainment);
			if (singleNonContainment != oldSingleNonContainment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT, oldSingleNonContainment, singleNonContainment));
			}
		}
		return singleNonContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo basicGetSingleNonContainment() {
		return singleNonContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleNonContainment(Foo newSingleNonContainment) {
		Foo oldSingleNonContainment = singleNonContainment;
		singleNonContainment = newSingleNonContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT, oldSingleNonContainment, singleNonContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Foo> getManyNonContainment() {
		if (manyNonContainment == null) {
			manyNonContainment = new EObjectResolvingEList<Foo>(Foo.class, this, CorePackage.THING_WITHOUT_ID__MANY_NON_CONTAINMENT);
		}
		return manyNonContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT:
				if (resolve) return getSingleNonContainment();
				return basicGetSingleNonContainment();
			case CorePackage.THING_WITHOUT_ID__MANY_NON_CONTAINMENT:
				return getManyNonContainment();
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
			case CorePackage.THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT:
				setSingleNonContainment((Foo)newValue);
				return;
			case CorePackage.THING_WITHOUT_ID__MANY_NON_CONTAINMENT:
				getManyNonContainment().clear();
				getManyNonContainment().addAll((Collection<? extends Foo>)newValue);
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
			case CorePackage.THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT:
				setSingleNonContainment((Foo)null);
				return;
			case CorePackage.THING_WITHOUT_ID__MANY_NON_CONTAINMENT:
				getManyNonContainment().clear();
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
			case CorePackage.THING_WITHOUT_ID__SINGLE_NON_CONTAINMENT:
				return singleNonContainment != null;
			case CorePackage.THING_WITHOUT_ID__MANY_NON_CONTAINMENT:
				return manyNonContainment != null && !manyNonContainment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThingWithoutIDImpl
