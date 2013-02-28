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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.System#getComponent <em>Component</em>}</li>
 *   <li>{@link hiphops.System#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends DescribedClass {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link hiphops.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see hiphops.HiphopsPackage#getSystem_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link hiphops.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see hiphops.HiphopsPackage#getSystem_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

} // System
