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
 * A representation of the model object '<em><b>FData</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.FData#getOutputDeviations <em>Output Deviations</em>}</li>
 *   <li>{@link hiphops.FData#getBasicEvents <em>Basic Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getFData()
 * @model
 * @generated
 */
public interface FData extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Deviations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Deviations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Deviations</em>' containment reference.
	 * @see #setOutputDeviations(OutputDeviations)
	 * @see hiphops.HiphopsPackage#getFData_OutputDeviations()
	 * @model containment="true"
	 * @generated
	 */
	OutputDeviations getOutputDeviations();

	/**
	 * Sets the value of the '{@link hiphops.FData#getOutputDeviations <em>Output Deviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Deviations</em>' containment reference.
	 * @see #getOutputDeviations()
	 * @generated
	 */
	void setOutputDeviations(OutputDeviations value);

	/**
	 * Returns the value of the '<em><b>Basic Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Events</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Events</em>' containment reference.
	 * @see #setBasicEvents(BasicEvents)
	 * @see hiphops.HiphopsPackage#getFData_BasicEvents()
	 * @model containment="true"
	 * @generated
	 */
	BasicEvents getBasicEvents();

	/**
	 * Sets the value of the '{@link hiphops.FData#getBasicEvents <em>Basic Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Events</em>' containment reference.
	 * @see #getBasicEvents()
	 * @generated
	 */
	void setBasicEvents(BasicEvents value);

} // FData
