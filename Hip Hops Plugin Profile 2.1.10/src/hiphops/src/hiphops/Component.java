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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link hiphops.Component#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link hiphops.Component#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link hiphops.Component#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link hiphops.Component#getImpalternatives <em>Impalternatives</em>}</li>
 *   <li>{@link hiphops.Component#getAllocalternatives <em>Allocalternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends DescribedClass {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link hiphops.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see hiphops.HiphopsPackage#getComponent_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see #setComponentType(String)
	 * @see hiphops.HiphopsPackage#getComponent_ComponentType()
	 * @model
	 * @generated
	 */
	String getComponentType();

	/**
	 * Sets the value of the '{@link hiphops.Component#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(String value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(Implementation)
	 * @see hiphops.HiphopsPackage#getComponent_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	Implementation getImplementation();

	/**
	 * Sets the value of the '{@link hiphops.Component#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Implementation value);

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
	 * @see hiphops.HiphopsPackage#getComponent_Allocation()
	 * @model
	 * @generated
	 */
	String getAllocation();

	/**
	 * Sets the value of the '{@link hiphops.Component#getAllocation <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' attribute.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(String value);

	/**
	 * Returns the value of the '<em><b>Impalternatives</b></em>' reference list.
	 * The list contents are of type {@link hiphops.Implementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impalternatives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impalternatives</em>' reference list.
	 * @see hiphops.HiphopsPackage#getComponent_Impalternatives()
	 * @model
	 * @generated
	 */
	EList<Implementation> getImpalternatives();

	/**
	 * Returns the value of the '<em><b>Allocalternatives</b></em>' reference list.
	 * The list contents are of type {@link hiphops.AllocAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocalternatives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocalternatives</em>' reference list.
	 * @see hiphops.HiphopsPackage#getComponent_Allocalternatives()
	 * @model
	 * @generated
	 */
	EList<AllocAlternative> getAllocalternatives();

} // Component
