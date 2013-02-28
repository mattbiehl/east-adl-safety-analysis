/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.BasicEvent;
import hiphops.HiphopsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.BasicEventImpl#getDefaultString <em>Default String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicEventImpl extends DescribedClassImpl implements BasicEvent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.BASIC_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.BASIC_EVENT__DEFAULT_STRING, oldDefaultString, defaultString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HiphopsPackage.BASIC_EVENT__DEFAULT_STRING:
				return getDefaultString();
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
			case HiphopsPackage.BASIC_EVENT__DEFAULT_STRING:
				setDefaultString((String)newValue);
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
			case HiphopsPackage.BASIC_EVENT__DEFAULT_STRING:
				setDefaultString(DEFAULT_STRING_EDEFAULT);
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
			case HiphopsPackage.BASIC_EVENT__DEFAULT_STRING:
				return DEFAULT_STRING_EDEFAULT == null ? defaultString != null : !DEFAULT_STRING_EDEFAULT.equals(defaultString);
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
		result.append(')');
		return result.toString();
	}

} //BasicEventImpl
