/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.BasicEvents;
import hiphops.FData;
import hiphops.HiphopsPackage;
import hiphops.OutputDeviations;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FData</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.FDataImpl#getOutputDeviations <em>Output Deviations</em>}</li>
 *   <li>{@link hiphops.impl.FDataImpl#getBasicEvents <em>Basic Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FDataImpl extends EObjectImpl implements FData {
	/**
	 * The cached value of the '{@link #getOutputDeviations() <em>Output Deviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDeviations()
	 * @generated
	 * @ordered
	 */
	protected OutputDeviations outputDeviations;

	/**
	 * The cached value of the '{@link #getBasicEvents() <em>Basic Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicEvents()
	 * @generated
	 * @ordered
	 */
	protected BasicEvents basicEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.FDATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeviations getOutputDeviations() {
		return outputDeviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputDeviations(OutputDeviations newOutputDeviations, NotificationChain msgs) {
		OutputDeviations oldOutputDeviations = outputDeviations;
		outputDeviations = newOutputDeviations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HiphopsPackage.FDATA__OUTPUT_DEVIATIONS, oldOutputDeviations, newOutputDeviations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDeviations(OutputDeviations newOutputDeviations) {
		if (newOutputDeviations != outputDeviations) {
			NotificationChain msgs = null;
			if (outputDeviations != null)
				msgs = ((InternalEObject)outputDeviations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.FDATA__OUTPUT_DEVIATIONS, null, msgs);
			if (newOutputDeviations != null)
				msgs = ((InternalEObject)newOutputDeviations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.FDATA__OUTPUT_DEVIATIONS, null, msgs);
			msgs = basicSetOutputDeviations(newOutputDeviations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.FDATA__OUTPUT_DEVIATIONS, newOutputDeviations, newOutputDeviations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvents getBasicEvents() {
		return basicEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicEvents(BasicEvents newBasicEvents, NotificationChain msgs) {
		BasicEvents oldBasicEvents = basicEvents;
		basicEvents = newBasicEvents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HiphopsPackage.FDATA__BASIC_EVENTS, oldBasicEvents, newBasicEvents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicEvents(BasicEvents newBasicEvents) {
		if (newBasicEvents != basicEvents) {
			NotificationChain msgs = null;
			if (basicEvents != null)
				msgs = ((InternalEObject)basicEvents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.FDATA__BASIC_EVENTS, null, msgs);
			if (newBasicEvents != null)
				msgs = ((InternalEObject)newBasicEvents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.FDATA__BASIC_EVENTS, null, msgs);
			msgs = basicSetBasicEvents(newBasicEvents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.FDATA__BASIC_EVENTS, newBasicEvents, newBasicEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HiphopsPackage.FDATA__OUTPUT_DEVIATIONS:
				return basicSetOutputDeviations(null, msgs);
			case HiphopsPackage.FDATA__BASIC_EVENTS:
				return basicSetBasicEvents(null, msgs);
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
			case HiphopsPackage.FDATA__OUTPUT_DEVIATIONS:
				return getOutputDeviations();
			case HiphopsPackage.FDATA__BASIC_EVENTS:
				return getBasicEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HiphopsPackage.FDATA__OUTPUT_DEVIATIONS:
				setOutputDeviations((OutputDeviations)newValue);
				return;
			case HiphopsPackage.FDATA__BASIC_EVENTS:
				setBasicEvents((BasicEvents)newValue);
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
			case HiphopsPackage.FDATA__OUTPUT_DEVIATIONS:
				setOutputDeviations((OutputDeviations)null);
				return;
			case HiphopsPackage.FDATA__BASIC_EVENTS:
				setBasicEvents((BasicEvents)null);
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
			case HiphopsPackage.FDATA__OUTPUT_DEVIATIONS:
				return outputDeviations != null;
			case HiphopsPackage.FDATA__BASIC_EVENTS:
				return basicEvents != null;
		}
		return super.eIsSet(featureID);
	}

} //FDataImpl
