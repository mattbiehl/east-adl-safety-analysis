/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.HiphopsPackage;
import hiphops.OutputDeviation;
import hiphops.OutputDeviations;

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
 * An implementation of the model object '<em><b>Output Deviations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.OutputDeviationsImpl#getOutputDeviation <em>Output Deviation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDeviationsImpl extends EObjectImpl implements OutputDeviations {
	/**
	 * The cached value of the '{@link #getOutputDeviation() <em>Output Deviation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDeviation()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDeviation> outputDeviation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDeviationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.OUTPUT_DEVIATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputDeviation> getOutputDeviation() {
		if (outputDeviation == null) {
			outputDeviation = new EObjectContainmentEList<OutputDeviation>(OutputDeviation.class, this, HiphopsPackage.OUTPUT_DEVIATIONS__OUTPUT_DEVIATION);
		}
		return outputDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HiphopsPackage.OUTPUT_DEVIATIONS__OUTPUT_DEVIATION:
				return ((InternalEList<?>)getOutputDeviation()).basicRemove(otherEnd, msgs);
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
			case HiphopsPackage.OUTPUT_DEVIATIONS__OUTPUT_DEVIATION:
				return getOutputDeviation();
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
			case HiphopsPackage.OUTPUT_DEVIATIONS__OUTPUT_DEVIATION:
				getOutputDeviation().clear();
				getOutputDeviation().addAll((Collection<? extends OutputDeviation>)newValue);
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
			case HiphopsPackage.OUTPUT_DEVIATIONS__OUTPUT_DEVIATION:
				getOutputDeviation().clear();
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
			case HiphopsPackage.OUTPUT_DEVIATIONS__OUTPUT_DEVIATION:
				return outputDeviation != null && !outputDeviation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputDeviationsImpl
