/**
 */
package shootingmachineemfmodel.tests;

import junit.textui.TestRunner;

import shootingmachineemfmodel.OSPortIN;
import shootingmachineemfmodel.ShootingmachineemfmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OS Port IN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSPortINTest extends ReceiverPortsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSPortINTest.class);
	}

	/**
	 * Constructs a new OS Port IN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPortINTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OS Port IN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OSPortIN getFixture() {
		return (OSPortIN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShootingmachineemfmodelFactory.eINSTANCE.createOSPortIN());
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

} //OSPortINTest
