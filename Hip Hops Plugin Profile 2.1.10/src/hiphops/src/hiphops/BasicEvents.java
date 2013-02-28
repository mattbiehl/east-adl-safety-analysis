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
 * A representation of the model object '<em><b>Basic Events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.BasicEvents#getBasicEvent <em>Basic Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getBasicEvents()
 * @model
 * @generated
 */
public interface BasicEvents extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic Event</b></em>' containment reference list.
	 * The list contents are of type {@link hiphops.BasicEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Event</em>' containment reference list.
	 * @see hiphops.HiphopsPackage#getBasicEvents_BasicEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicEvent> getBasicEvent();

} // BasicEvents
