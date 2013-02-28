/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.tests;

import hiphops.BasicEvents;
import hiphops.HiphopsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Basic Events</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicEventsTest extends TestCase {

	/**
	 * The fixture for this Basic Events test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicEvents fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BasicEventsTest.class);
	}

	/**
	 * Constructs a new Basic Events test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEventsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Basic Events test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BasicEvents fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Basic Events test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicEvents getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HiphopsFactory.eINSTANCE.createBasicEvents());
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

} //BasicEventsTest
