/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.Implementation#getFData <em>FData</em>}</li>
 *   <li>{@link hiphops.Implementation#isExcludeFromOptimization <em>Exclude From Optimization</em>}</li>
 *   <li>{@link hiphops.Implementation#getSystem <em>System</em>}</li>
 *   <li>{@link hiphops.Implementation#getH_BlockType <em>HBlock Type</em>}</li>
 *   <li>{@link hiphops.Implementation#getCost <em>Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends DescribedClass {
	/**
	 * Returns the value of the '<em><b>FData</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FData</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FData</em>' containment reference.
	 * @see #setFData(FData)
	 * @see hiphops.HiphopsPackage#getImplementation_FData()
	 * @model containment="true"
	 * @generated
	 */
	FData getFData();

	/**
	 * Sets the value of the '{@link hiphops.Implementation#getFData <em>FData</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FData</em>' containment reference.
	 * @see #getFData()
	 * @generated
	 */
	void setFData(FData value);

	/**
	 * Returns the value of the '<em><b>Exclude From Optimization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude From Optimization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude From Optimization</em>' attribute.
	 * @see #setExcludeFromOptimization(boolean)
	 * @see hiphops.HiphopsPackage#getImplementation_ExcludeFromOptimization()
	 * @model
	 * @generated
	 */
	boolean isExcludeFromOptimization();

	/**
	 * Sets the value of the '{@link hiphops.Implementation#isExcludeFromOptimization <em>Exclude From Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude From Optimization</em>' attribute.
	 * @see #isExcludeFromOptimization()
	 * @generated
	 */
	void setExcludeFromOptimization(boolean value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference list.
	 * The list contents are of type {@link hiphops.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference list.
	 * @see hiphops.HiphopsPackage#getImplementation_System()
	 * @model containment="true"
	 * @generated
	 */
	EList<hiphops.System> getSystem();

	/**
	 * Returns the value of the '<em><b>HBlock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HBlock Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HBlock Type</em>' attribute.
	 * @see #setH_BlockType(String)
	 * @see hiphops.HiphopsPackage#getImplementation_H_BlockType()
	 * @model
	 * @generated
	 */
	String getH_BlockType();

	/**
	 * Sets the value of the '{@link hiphops.Implementation#getH_BlockType <em>HBlock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HBlock Type</em>' attribute.
	 * @see #getH_BlockType()
	 * @generated
	 */
	void setH_BlockType(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see hiphops.HiphopsPackage#getImplementation_Cost()
	 * @model
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link hiphops.Implementation#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

} // Implementation
