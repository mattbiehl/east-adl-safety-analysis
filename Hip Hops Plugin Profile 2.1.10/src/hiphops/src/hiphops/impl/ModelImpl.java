/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.Hazard;
import hiphops.HiphopsPackage;
import hiphops.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.ModelImpl#getSystem <em>System</em>}</li>
 *   <li>{@link hiphops.impl.ModelImpl#getSimulationX <em>Simulation X</em>}</li>
 *   <li>{@link hiphops.impl.ModelImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends DescribedClassImpl implements Model {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<hiphops.System> system;

	/**
	 * The default value of the '{@link #getSimulationX() <em>Simulation X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationX()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMULATION_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimulationX() <em>Simulation X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationX()
	 * @generated
	 * @ordered
	 */
	protected String simulationX = SIMULATION_X_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<hiphops.System> getSystem() {
		if (system == null) {
			system = new EObjectContainmentEList<hiphops.System>(hiphops.System.class, this, HiphopsPackage.MODEL__SYSTEM);
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimulationX() {
		return simulationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationX(String newSimulationX) {
		String oldSimulationX = simulationX;
		simulationX = newSimulationX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.MODEL__SIMULATION_X, oldSimulationX, simulationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectResolvingEList<Hazard>(Hazard.class, this, HiphopsPackage.MODEL__HAZARDS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HiphopsPackage.MODEL__SYSTEM:
				return ((InternalEList<?>)getSystem()).basicRemove(otherEnd, msgs);
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
			case HiphopsPackage.MODEL__SYSTEM:
				return getSystem();
			case HiphopsPackage.MODEL__SIMULATION_X:
				return getSimulationX();
			case HiphopsPackage.MODEL__HAZARDS:
				return getHazards();
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
			case HiphopsPackage.MODEL__SYSTEM:
				getSystem().clear();
				getSystem().addAll((Collection<? extends hiphops.System>)newValue);
				return;
			case HiphopsPackage.MODEL__SIMULATION_X:
				setSimulationX((String)newValue);
				return;
			case HiphopsPackage.MODEL__HAZARDS:
				getHazards().clear();
				getHazards().addAll((Collection<? extends Hazard>)newValue);
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
			case HiphopsPackage.MODEL__SYSTEM:
				getSystem().clear();
				return;
			case HiphopsPackage.MODEL__SIMULATION_X:
				setSimulationX(SIMULATION_X_EDEFAULT);
				return;
			case HiphopsPackage.MODEL__HAZARDS:
				getHazards().clear();
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
			case HiphopsPackage.MODEL__SYSTEM:
				return system != null && !system.isEmpty();
			case HiphopsPackage.MODEL__SIMULATION_X:
				return SIMULATION_X_EDEFAULT == null ? simulationX != null : !SIMULATION_X_EDEFAULT.equals(simulationX);
			case HiphopsPackage.MODEL__HAZARDS:
				return hazards != null && !hazards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (simulationX: ");
		result.append(simulationX);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
