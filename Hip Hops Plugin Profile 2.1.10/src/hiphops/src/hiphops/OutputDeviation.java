/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.OutputDeviation#getDefaultString <em>Default String</em>}</li>
 *   <li>{@link hiphops.OutputDeviation#isSystemOutPort <em>System Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getOutputDeviation()
 * @model
 * @generated
 */
public interface OutputDeviation extends NamedClass {
	/**
	 * Returns the value of the '<em><b>Default String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default String</em>' attribute.
	 * @see #setDefaultString(String)
	 * @see hiphops.HiphopsPackage#getOutputDeviation_DefaultString()
	 * @model
	 * @generated
	 */
	String getDefaultString();

	/**
	 * Sets the value of the '{@link hiphops.OutputDeviation#getDefaultString <em>Default String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default String</em>' attribute.
	 * @see #getDefaultString()
	 * @generated
	 */
	void setDefaultString(String value);

	/**
	 * Returns the value of the '<em><b>System Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Out Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Out Port</em>' attribute.
	 * @see #setSystemOutPort(boolean)
	 * @see hiphops.HiphopsPackage#getOutputDeviation_SystemOutPort()
	 * @model
	 * @generated
	 */
	boolean isSystemOutPort();

	/**
	 * Sets the value of the '{@link hiphops.OutputDeviation#isSystemOutPort <em>System Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Out Port</em>' attribute.
	 * @see #isSystemOutPort()
	 * @generated
	 */
	void setSystemOutPort(boolean value);

} // OutputDeviation
