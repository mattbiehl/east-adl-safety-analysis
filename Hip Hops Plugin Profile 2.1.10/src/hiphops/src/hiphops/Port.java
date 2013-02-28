/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.Port#getPortType <em>Port Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends DescribedClass {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see #setPortType(String)
	 * @see hiphops.HiphopsPackage#getPort_PortType()
	 * @model
	 * @generated
	 */
	String getPortType();

	/**
	 * Sets the value of the '{@link hiphops.Port#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(String value);

} // Port
