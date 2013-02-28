/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.tests;

import hiphops.DescribedClass;
import hiphops.HiphopsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Described Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescribedClassTest extends NamedClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DescribedClassTest.class);
	}

	/**
	 * Constructs a new Described Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribedClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Described Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DescribedClass getFixture() {
		return (DescribedClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HiphopsFactory.eINSTANCE.createDescribedClass());
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

} //DescribedClassTest
