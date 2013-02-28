/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.tests;

import hiphops.HiphopsFactory;
import hiphops.OutputDeviation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Deviation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputDeviationTest extends NamedClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputDeviationTest.class);
	}

	/**
	 * Constructs a new Output Deviation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeviationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Output Deviation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutputDeviation getFixture() {
		return (OutputDeviation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HiphopsFactory.eINSTANCE.createOutputDeviation());
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

} //OutputDeviationTest
