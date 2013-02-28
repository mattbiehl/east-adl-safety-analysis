/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.HiphopsPackage;
import hiphops.OutputDeviation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.OutputDeviationImpl#getDefaultString <em>Default String</em>}</li>
 *   <li>{@link hiphops.impl.OutputDeviationImpl#isSystemOutPort <em>System Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDeviationImpl extends NamedClassImpl implements OutputDeviation {
	/**
	 * The default value of the '{@link #getDefaultString() <em>Default String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultString()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultString() <em>Default String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultString()
	 * @generated
	 * @ordered
	 */
	protected String defaultString = DEFAULT_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isSystemOutPort() <em>System Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystemOutPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYSTEM_OUT_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSystemOutPort() <em>System Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystemOutPort()
	 * @generated
	 * @ordered
	 */
	protected boolean systemOutPort = SYSTEM_OUT_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.OUTPUT_DEVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultString() {
		return defaultString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultString(String newDefaultString) {
		String oldDefaultString = defaultString;
		defaultString = newDefaultString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.OUTPUT_DEVIATION__DEFAULT_STRING, oldDefaultString, defaultString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSystemOutPort() {
		return systemOutPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemOutPort(boolean newSystemOutPort) {
		boolean oldSystemOutPort = systemOutPort;
		systemOutPort = newSystemOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.OUTPUT_DEVIATION__SYSTEM_OUT_PORT, oldSystemOutPort, systemOutPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HiphopsPackage.OUTPUT_DEVIATION__DEFAULT_STRING:
				return getDefaultString();
			case HiphopsPackage.OUTPUT_DEVIATION__SYSTEM_OUT_PORT:
				return isSystemOutPort();
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
			case HiphopsPackage.OUTPUT_DEVIATION__DEFAULT_STRING:
				setDefaultString((String)newValue);
				return;
			case HiphopsPackage.OUTPUT_DEVIATION__SYSTEM_OUT_PORT:
				setSystemOutPort((Boolean)newValue);
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
			case HiphopsPackage.OUTPUT_DEVIATION__DEFAULT_STRING:
				setDefaultString(DEFAULT_STRING_EDEFAULT);
				return;
			case HiphopsPackage.OUTPUT_DEVIATION__SYSTEM_OUT_PORT:
				setSystemOutPort(SYSTEM_OUT_PORT_EDEFAULT);
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
			case HiphopsPackage.OUTPUT_DEVIATION__DEFAULT_STRING:
				return DEFAULT_STRING_EDEFAULT == null ? defaultString != null : !DEFAULT_STRING_EDEFAULT.equals(defaultString);
			case HiphopsPackage.OUTPUT_DEVIATION__SYSTEM_OUT_PORT:
				return systemOutPort != SYSTEM_OUT_PORT_EDEFAULT;
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
		result.append(" (defaultString: ");
		result.append(defaultString);
		result.append(", systemOutPort: ");
		result.append(systemOutPort);
		result.append(')');
		return result.toString();
	}

} //OutputDeviationImpl
