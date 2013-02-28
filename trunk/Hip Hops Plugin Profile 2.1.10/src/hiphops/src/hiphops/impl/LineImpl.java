/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.HiphopsPackage;
import hiphops.Line;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.LineImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link hiphops.impl.LineImpl#getP1 <em>P1</em>}</li>
 *   <li>{@link hiphops.impl.LineImpl#getP2 <em>P2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends DescribedClassImpl implements Line {
	/**
	 * The default value of the '{@link #getConnections() <em>Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected String connections = CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getP1() <em>P1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP1()
	 * @generated
	 * @ordered
	 */
	protected static final String P1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP1() <em>P1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP1()
	 * @generated
	 * @ordered
	 */
	protected String p1 = P1_EDEFAULT;

	/**
	 * The default value of the '{@link #getP2() <em>P2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP2()
	 * @generated
	 * @ordered
	 */
	protected static final String P2_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getP2() <em>P2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP2()
	 * @generated
	 * @ordered
	 */
	protected String p2 = P2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnections(String newConnections) {
		String oldConnections = connections;
		connections = newConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.LINE__CONNECTIONS, oldConnections, connections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP1() {
		return p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP1(String newP1) {
		String oldP1 = p1;
		p1 = newP1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.LINE__P1, oldP1, p1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP2() {
		return p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP2(String newP2) {
		String oldP2 = p2;
		p2 = newP2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.LINE__P2, oldP2, p2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HiphopsPackage.LINE__CONNECTIONS:
				return getConnections();
			case HiphopsPackage.LINE__P1:
				return getP1();
			case HiphopsPackage.LINE__P2:
				return getP2();
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
			case HiphopsPackage.LINE__CONNECTIONS:
				setConnections((String)newValue);
				return;
			case HiphopsPackage.LINE__P1:
				setP1((String)newValue);
				return;
			case HiphopsPackage.LINE__P2:
				setP2((String)newValue);
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
			case HiphopsPackage.LINE__CONNECTIONS:
				setConnections(CONNECTIONS_EDEFAULT);
				return;
			case HiphopsPackage.LINE__P1:
				setP1(P1_EDEFAULT);
				return;
			case HiphopsPackage.LINE__P2:
				setP2(P2_EDEFAULT);
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
			case HiphopsPackage.LINE__CONNECTIONS:
				return CONNECTIONS_EDEFAULT == null ? connections != null : !CONNECTIONS_EDEFAULT.equals(connections);
			case HiphopsPackage.LINE__P1:
				return P1_EDEFAULT == null ? p1 != null : !P1_EDEFAULT.equals(p1);
			case HiphopsPackage.LINE__P2:
				return P2_EDEFAULT == null ? p2 != null : !P2_EDEFAULT.equals(p2);
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
		result.append(" (connections: ");
		result.append(connections);
		result.append(", p1: ");
		result.append(p1);
		result.append(", p2: ");
		result.append(p2);
		result.append(')');
		return result.toString();
	}

} //LineImpl
