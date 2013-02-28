/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alloc Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.AllocAlternative#getAllocation <em>Allocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getAllocAlternative()
 * @model
 * @generated
 */
public interface AllocAlternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' attribute.
	 * @see #setAllocation(String)
	 * @see hiphops.HiphopsPackage#getAllocAlternative_Allocation()
	 * @model
	 * @generated
	 */
	String getAllocation();

	/**
	 * Sets the value of the '{@link hiphops.AllocAlternative#getAllocation <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' attribute.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(String value);

} // AllocAlternative
