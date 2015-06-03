/**
 */
package shootingmachineemfmodel.tests;

import junit.textui.TestRunner;

import shootingmachineemfmodel.Alarm;
import shootingmachineemfmodel.ShootingmachineemfmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlarmTest extends StandardclassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlarmTest.class);
	}

	/**
	 * Constructs a new Alarm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alarm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Alarm getFixture() {
		return (Alarm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShootingmachineemfmodelFactory.eINSTANCE.createAlarm());
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

} //AlarmTest
