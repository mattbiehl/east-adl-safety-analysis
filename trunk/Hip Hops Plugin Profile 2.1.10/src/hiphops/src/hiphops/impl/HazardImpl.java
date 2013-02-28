/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.Hazard;
import hiphops.HiphopsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.HazardImpl#getSafetyRequirement <em>Safety Requirement</em>}</li>
 *   <li>{@link hiphops.impl.HazardImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link hiphops.impl.HazardImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardImpl extends DescribedClassImpl implements Hazard {
	/**
	 * The default value of the '{@link #getSafetyRequirement() <em>Safety Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final int SAFETY_REQUIREMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSafetyRequirement() <em>Safety Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyRequirement()
	 * @generated
	 * @ordered
	 */
	protected int safetyRequirement = SAFETY_REQUIREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final double SEVERITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected double severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected String logic = LOGIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSafetyRequirement() {
		return safetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafetyRequirement(int newSafetyRequirement) {
		int oldSafetyRequirement = safetyRequirement;
		safetyRequirement = newSafetyRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.HAZARD__SAFETY_REQUIREMENT, oldSafetyRequirement, safetyRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(double newSeverity) {
		double oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.HAZARD__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogic(String newLogic) {
		String oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.HAZARD__LOGIC, oldLogic, logic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HiphopsPackage.HAZARD__SAFETY_REQUIREMENT:
				return getSafetyRequirement();
			case HiphopsPackage.HAZARD__SEVERITY:
				return getSeverity();
			case HiphopsPackage.HAZARD__LOGIC:
				return getLogic();
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
			case HiphopsPackage.HAZARD__SAFETY_REQUIREMENT:
				setSafetyRequirement((Integer)newValue);
				return;
			case HiphopsPackage.HAZARD__SEVERITY:
				setSeverity((Double)newValue);
				return;
			case HiphopsPackage.HAZARD__LOGIC:
				setLogic((String)newValue);
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
			case HiphopsPackage.HAZARD__SAFETY_REQUIREMENT:
				setSafetyRequirement(SAFETY_REQUIREMENT_EDEFAULT);
				return;
			case HiphopsPackage.HAZARD__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case HiphopsPackage.HAZARD__LOGIC:
				setLogic(LOGIC_EDEFAULT);
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
			case HiphopsPackage.HAZARD__SAFETY_REQUIREMENT:
				return safetyRequirement != SAFETY_REQUIREMENT_EDEFAULT;
			case HiphopsPackage.HAZARD__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case HiphopsPackage.HAZARD__LOGIC:
				return LOGIC_EDEFAULT == null ? logic != null : !LOGIC_EDEFAULT.equals(logic);
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
		result.append(" (safetyRequirement: ");
		result.append(safetyRequirement);
		result.append(", severity: ");
		result.append(severity);
		result.append(", logic: ");
		result.append(logic);
		result.append(')');
		return result.toString();
	}

} //HazardImpl
