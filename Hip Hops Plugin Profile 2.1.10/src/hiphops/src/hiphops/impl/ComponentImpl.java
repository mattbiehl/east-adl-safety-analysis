/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.AllocAlternative;
import hiphops.Component;
import hiphops.HiphopsPackage;
import hiphops.Implementation;
import hiphops.Port;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link hiphops.impl.ComponentImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link hiphops.impl.ComponentImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link hiphops.impl.ComponentImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link hiphops.impl.ComponentImpl#getImpalternatives <em>Impalternatives</em>}</li>
 *   <li>{@link hiphops.impl.ComponentImpl#getAllocalternatives <em>Allocalternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends DescribedClassImpl implements Component {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected String componentType = COMPONENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected Implementation implementation;

	/**
	 * The default value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected String allocation = ALLOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImpalternatives() <em>Impalternatives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpalternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> impalternatives;

	/**
	 * The cached value of the '{@link #getAllocalternatives() <em>Allocalternatives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocalternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocAlternative> allocalternatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, HiphopsPackage.COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(String newComponentType) {
		String oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.COMPONENT__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(Implementation newImplementation, NotificationChain msgs) {
		Implementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HiphopsPackage.COMPONENT__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(Implementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.COMPONENT__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.COMPONENT__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.COMPONENT__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(String newAllocation) {
		String oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.COMPONENT__ALLOCATION, oldAllocation, allocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getImpalternatives() {
		if (impalternatives == null) {
			impalternatives = new EObjectResolvingEList<Implementation>(Implementation.class, this, HiphopsPackage.COMPONENT__IMPALTERNATIVES);
		}
		return impalternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocAlternative> getAllocalternatives() {
		if (allocalternatives == null) {
			allocalternatives = new EObjectResolvingEList<AllocAlternative>(AllocAlternative.class, this, HiphopsPackage.COMPONENT__ALLOCALTERNATIVES);
		}
		return allocalternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HiphopsPackage.COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case HiphopsPackage.COMPONENT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
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
			case HiphopsPackage.COMPONENT__PORTS:
				return getPorts();
			case HiphopsPackage.COMPONENT__COMPONENT_TYPE:
				return getComponentType();
			case HiphopsPackage.COMPONENT__IMPLEMENTATION:
				return getImplementation();
			case HiphopsPackage.COMPONENT__ALLOCATION:
				return getAllocation();
			case HiphopsPackage.COMPONENT__IMPALTERNATIVES:
				return getImpalternatives();
			case HiphopsPackage.COMPONENT__ALLOCALTERNATIVES:
				return getAllocalternatives();
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
			case HiphopsPackage.COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case HiphopsPackage.COMPONENT__COMPONENT_TYPE:
				setComponentType((String)newValue);
				return;
			case HiphopsPackage.COMPONENT__IMPLEMENTATION:
				setImplementation((Implementation)newValue);
				return;
			case HiphopsPackage.COMPONENT__ALLOCATION:
				setAllocation((String)newValue);
				return;
			case HiphopsPackage.COMPONENT__IMPALTERNATIVES:
				getImpalternatives().clear();
				getImpalternatives().addAll((Collection<? extends Implementation>)newValue);
				return;
			case HiphopsPackage.COMPONENT__ALLOCALTERNATIVES:
				getAllocalternatives().clear();
				getAllocalternatives().addAll((Collection<? extends AllocAlternative>)newValue);
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
			case HiphopsPackage.COMPONENT__PORTS:
				getPorts().clear();
				return;
			case HiphopsPackage.COMPONENT__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
				return;
			case HiphopsPackage.COMPONENT__IMPLEMENTATION:
				setImplementation((Implementation)null);
				return;
			case HiphopsPackage.COMPONENT__ALLOCATION:
				setAllocation(ALLOCATION_EDEFAULT);
				return;
			case HiphopsPackage.COMPONENT__IMPALTERNATIVES:
				getImpalternatives().clear();
				return;
			case HiphopsPackage.COMPONENT__ALLOCALTERNATIVES:
				getAllocalternatives().clear();
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
			case HiphopsPackage.COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
			case HiphopsPackage.COMPONENT__COMPONENT_TYPE:
				return COMPONENT_TYPE_EDEFAULT == null ? componentType != null : !COMPONENT_TYPE_EDEFAULT.equals(componentType);
			case HiphopsPackage.COMPONENT__IMPLEMENTATION:
				return implementation != null;
			case HiphopsPackage.COMPONENT__ALLOCATION:
				return ALLOCATION_EDEFAULT == null ? allocation != null : !ALLOCATION_EDEFAULT.equals(allocation);
			case HiphopsPackage.COMPONENT__IMPALTERNATIVES:
				return impalternatives != null && !impalternatives.isEmpty();
			case HiphopsPackage.COMPONENT__ALLOCALTERNATIVES:
				return allocalternatives != null && !allocalternatives.isEmpty();
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
		result.append(" (componentType: ");
		result.append(componentType);
		result.append(", allocation: ");
		result.append(allocation);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
