/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.BasicEvent;
import hiphops.BasicEvents;
import hiphops.HiphopsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.BasicEventsImpl#getBasicEvent <em>Basic Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicEventsImpl extends EObjectImpl implements BasicEvents {
	/**
	 * The cached value of the '{@link #getBasicEvent() <em>Basic Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicEvent> basicEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicEventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.BASIC_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicEvent> getBasicEvent() {
		if (basicEvent == null) {
			basicEvent = new EObjectContainmentEList<BasicEvent>(BasicEvent.class, this, HiphopsPackage.BASIC_EVENTS__BASIC_EVENT);
		}
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HiphopsPackage.BASIC_EVENTS__BASIC_EVENT:
				return ((InternalEList<?>)getBasicEvent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HiphopsPackage.BASIC_EVENTS__BASIC_EVENT:
				return getBasicEvent();
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
			case HiphopsPackage.BASIC_EVENTS__BASIC_EVENT:
				getBasicEvent().clear();
				getBasicEvent().addAll((Collection<? extends BasicEvent>)newValue);
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
			case HiphopsPackage.BASIC_EVENTS__BASIC_EVENT:
				getBasicEvent().clear();
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
			case HiphopsPackage.BASIC_EVENTS__BASIC_EVENT:
				return basicEvent != null && !basicEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicEventsImpl
