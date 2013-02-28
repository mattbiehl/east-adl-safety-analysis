/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.tests;

import hiphops.HiphopsFactory;
import hiphops.Line;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LineTest extends DescribedClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LineTest.class);
	}

	/**
	 * Constructs a new Line test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Line getFixture() {
		return (Line)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HiphopsFactory.eINSTANCE.createLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LineTest
