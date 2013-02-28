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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.Model#getSystem <em>System</em>}</li>
 *   <li>{@link hiphops.Model#getSimulationX <em>Simulation X</em>}</li>
 *   <li>{@link hiphops.Model#getHazards <em>Hazards</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends DescribedClass {
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
	 * @see hiphops.HiphopsPackage#getModel_System()
	 * @model containment="true"
	 * @generated
	 */
	EList<hiphops.System> getSystem();

	/**
	 * Returns the value of the '<em><b>Simulation X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation X</em>' attribute.
	 * @see #setSimulationX(String)
	 * @see hiphops.HiphopsPackage#getModel_SimulationX()
	 * @model
	 * @generated
	 */
	String getSimulationX();

	/**
	 * Sets the value of the '{@link hiphops.Model#getSimulationX <em>Simulation X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation X</em>' attribute.
	 * @see #getSimulationX()
	 * @generated
	 */
	void setSimulationX(String value);

	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' reference list.
	 * The list contents are of type {@link hiphops.Hazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' reference list.
	 * @see hiphops.HiphopsPackage#getModel_Hazards()
	 * @model
	 * @generated
	 */
	EList<Hazard> getHazards();

} // Model
