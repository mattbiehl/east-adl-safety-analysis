/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Deviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.OutputDeviations#getOutputDeviation <em>Output Deviation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getOutputDeviations()
 * @model
 * @generated
 */
public interface OutputDeviations extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Deviation</b></em>' containment reference list.
	 * The list contents are of type {@link hiphops.OutputDeviation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Deviation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Deviation</em>' containment reference list.
	 * @see hiphops.HiphopsPackage#getOutputDeviations_OutputDeviation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputDeviation> getOutputDeviation();

} // OutputDeviations
