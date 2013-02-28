/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.Hazard#getSafetyRequirement <em>Safety Requirement</em>}</li>
 *   <li>{@link hiphops.Hazard#getSeverity <em>Severity</em>}</li>
 *   <li>{@link hiphops.Hazard#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getHazard()
 * @model
 * @generated
 */
public interface Hazard extends DescribedClass {
	/**
	 * Returns the value of the '<em><b>Safety Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Requirement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Requirement</em>' attribute.
	 * @see #setSafetyRequirement(int)
	 * @see hiphops.HiphopsPackage#getHazard_SafetyRequirement()
	 * @model
	 * @generated
	 */
	int getSafetyRequirement();

	/**
	 * Sets the value of the '{@link hiphops.Hazard#getSafetyRequirement <em>Safety Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Requirement</em>' attribute.
	 * @see #getSafetyRequirement()
	 * @generated
	 */
	void setSafetyRequirement(int value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(double)
	 * @see hiphops.HiphopsPackage#getHazard_Severity()
	 * @model
	 * @generated
	 */
	double getSeverity();

	/**
	 * Sets the value of the '{@link hiphops.Hazard#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(double value);

	/**
	 * Returns the value of the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic</em>' attribute.
	 * @see #setLogic(String)
	 * @see hiphops.HiphopsPackage#getHazard_Logic()
	 * @model
	 * @generated
	 */
	String getLogic();

	/**
	 * Sets the value of the '{@link hiphops.Hazard#getLogic <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' attribute.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(String value);

} // Hazard
