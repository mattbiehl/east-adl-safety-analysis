/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hiphops.Line#getConnections <em>Connections</em>}</li>
 *   <li>{@link hiphops.Line#getP1 <em>P1</em>}</li>
 *   <li>{@link hiphops.Line#getP2 <em>P2</em>}</li>
 * </ul>
 * </p>
 *
 * @see hiphops.HiphopsPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends DescribedClass {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' attribute.
	 * @see #setConnections(String)
	 * @see hiphops.HiphopsPackage#getLine_Connections()
	 * @model
	 * @generated
	 */
	String getConnections();

	/**
	 * Sets the value of the '{@link hiphops.Line#getConnections <em>Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' attribute.
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(String value);

	/**
	 * Returns the value of the '<em><b>P1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P1</em>' attribute.
	 * @see #setP1(String)
	 * @see hiphops.HiphopsPackage#getLine_P1()
	 * @model
	 * @generated
	 */
	String getP1();

	/**
	 * Sets the value of the '{@link hiphops.Line#getP1 <em>P1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P1</em>' attribute.
	 * @see #getP1()
	 * @generated
	 */
	void setP1(String value);

	/**
	 * Returns the value of the '<em><b>P2</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P2</em>' attribute.
	 * @see #setP2(String)
	 * @see hiphops.HiphopsPackage#getLine_P2()
	 * @model default=""
	 * @generated
	 */
	String getP2();

	/**
	 * Sets the value of the '{@link hiphops.Line#getP2 <em>P2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P2</em>' attribute.
	 * @see #getP2()
	 * @generated
	 */
	void setP2(String value);

} // Line
