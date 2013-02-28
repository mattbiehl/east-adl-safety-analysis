/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.FData;
import hiphops.HiphopsPackage;
import hiphops.Implementation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hiphops.impl.ImplementationImpl#getFData <em>FData</em>}</li>
 *   <li>{@link hiphops.impl.ImplementationImpl#isExcludeFromOptimization <em>Exclude From Optimization</em>}</li>
 *   <li>{@link hiphops.impl.ImplementationImpl#getSystem <em>System</em>}</li>
 *   <li>{@link hiphops.impl.ImplementationImpl#getH_BlockType <em>HBlock Type</em>}</li>
 *   <li>{@link hiphops.impl.ImplementationImpl#getCost <em>Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationImpl extends DescribedClassImpl implements Implementation {
	/**
	 * The cached value of the '{@link #getFData() <em>FData</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFData()
	 * @generated
	 * @ordered
	 */
	protected FData fData;

	/**
	 * The default value of the '{@link #isExcludeFromOptimization() <em>Exclude From Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExcludeFromOptimization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUDE_FROM_OPTIMIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExcludeFromOptimization() <em>Exclude From Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExcludeFromOptimization()
	 * @generated
	 * @ordered
	 */
	protected boolean excludeFromOptimization = EXCLUDE_FROM_OPTIMIZATION_EDEFAULT;

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
	 * The default value of the '{@link #getH_BlockType() <em>HBlock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH_BlockType()
	 * @generated
	 * @ordered
	 */
	protected static final String HBLOCK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getH_BlockType() <em>HBlock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH_BlockType()
	 * @generated
	 * @ordered
	 */
	protected String h_BlockType = HBLOCK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HiphopsPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FData getFData() {
		return fData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFData(FData newFData, NotificationChain msgs) {
		FData oldFData = fData;
		fData = newFData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HiphopsPackage.IMPLEMENTATION__FDATA, oldFData, newFData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFData(FData newFData) {
		if (newFData != fData) {
			NotificationChain msgs = null;
			if (fData != null)
				msgs = ((InternalEObject)fData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.IMPLEMENTATION__FDATA, null, msgs);
			if (newFData != null)
				msgs = ((InternalEObject)newFData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HiphopsPackage.IMPLEMENTATION__FDATA, null, msgs);
			msgs = basicSetFData(newFData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.IMPLEMENTATION__FDATA, newFData, newFData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExcludeFromOptimization() {
		return excludeFromOptimization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeFromOptimization(boolean newExcludeFromOptimization) {
		boolean oldExcludeFromOptimization = excludeFromOptimization;
		excludeFromOptimization = newExcludeFromOptimization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.IMPLEMENTATION__EXCLUDE_FROM_OPTIMIZATION, oldExcludeFromOptimization, excludeFromOptimization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<hiphops.System> getSystem() {
		if (system == null) {
			system = new EObjectContainmentEList<hiphops.System>(hiphops.System.class, this, HiphopsPackage.IMPLEMENTATION__SYSTEM);
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getH_BlockType() {
		return h_BlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH_BlockType(String newH_BlockType) {
		String oldH_BlockType = h_BlockType;
		h_BlockType = newH_BlockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.IMPLEMENTATION__HBLOCK_TYPE, oldH_BlockType, h_BlockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HiphopsPackage.IMPLEMENTATION__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HiphopsPackage.IMPLEMENTATION__FDATA:
				return basicSetFData(null, msgs);
			case HiphopsPackage.IMPLEMENTATION__SYSTEM:
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
			case HiphopsPackage.IMPLEMENTATION__FDATA:
				return getFData();
			case HiphopsPackage.IMPLEMENTATION__EXCLUDE_FROM_OPTIMIZATION:
				return isExcludeFromOptimization();
			case HiphopsPackage.IMPLEMENTATION__SYSTEM:
				return getSystem();
			case HiphopsPackage.IMPLEMENTATION__HBLOCK_TYPE:
				return getH_BlockType();
			case HiphopsPackage.IMPLEMENTATION__COST:
				return getCost();
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
			case HiphopsPackage.IMPLEMENTATION__FDATA:
				setFData((FData)newValue);
				return;
			case HiphopsPackage.IMPLEMENTATION__EXCLUDE_FROM_OPTIMIZATION:
				setExcludeFromOptimization((Boolean)newValue);
				return;
			case HiphopsPackage.IMPLEMENTATION__SYSTEM:
				getSystem().clear();
				getSystem().addAll((Collection<? extends hiphops.System>)newValue);
				return;
			case HiphopsPackage.IMPLEMENTATION__HBLOCK_TYPE:
				setH_BlockType((String)newValue);
				return;
			case HiphopsPackage.IMPLEMENTATION__COST:
				setCost((Float)newValue);
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
			case HiphopsPackage.IMPLEMENTATION__FDATA:
				setFData((FData)null);
				return;
			case HiphopsPackage.IMPLEMENTATION__EXCLUDE_FROM_OPTIMIZATION:
				setExcludeFromOptimization(EXCLUDE_FROM_OPTIMIZATION_EDEFAULT);
				return;
			case HiphopsPackage.IMPLEMENTATION__SYSTEM:
				getSystem().clear();
				return;
			case HiphopsPackage.IMPLEMENTATION__HBLOCK_TYPE:
				setH_BlockType(HBLOCK_TYPE_EDEFAULT);
				return;
			case HiphopsPackage.IMPLEMENTATION__COST:
				setCost(COST_EDEFAULT);
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
			case HiphopsPackage.IMPLEMENTATION__FDATA:
				return fData != null;
			case HiphopsPackage.IMPLEMENTATION__EXCLUDE_FROM_OPTIMIZATION:
				return excludeFromOptimization != EXCLUDE_FROM_OPTIMIZATION_EDEFAULT;
			case HiphopsPackage.IMPLEMENTATION__SYSTEM:
				return system != null && !system.isEmpty();
			case HiphopsPackage.IMPLEMENTATION__HBLOCK_TYPE:
				return HBLOCK_TYPE_EDEFAULT == null ? h_BlockType != null : !HBLOCK_TYPE_EDEFAULT.equals(h_BlockType);
			case HiphopsPackage.IMPLEMENTATION__COST:
				return cost != COST_EDEFAULT;
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
		result.append(" (excludeFromOptimization: ");
		result.append(excludeFromOptimization);
		result.append(", h_BlockType: ");
		result.append(h_BlockType);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ImplementationImpl
