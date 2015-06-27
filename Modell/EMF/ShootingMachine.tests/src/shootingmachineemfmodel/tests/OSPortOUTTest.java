/**
 */
package shootingmachineemfmodel.tests;

import junit.textui.TestRunner;

import shootingmachineemfmodel.OSPortOUT;
import shootingmachineemfmodel.ShootingmachineemfmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OS Port OUT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSPortOUTTest extends SenderPortsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSPortOUTTest.class);
	}

	/**
	 * Constructs a new OS Port OUT test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPortOUTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OS Port OUT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OSPortOUT getFixture() {
		return (OSPortOUT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShootingmachineemfmodelFactory.eINSTANCE.createOSPortOUT());
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

} //OSPortOUTTest
