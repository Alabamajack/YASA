/**
 */
package shootingmachineemfmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;



/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HW Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWType()
 * @model
 * @generated
 */
public enum HWType implements Enumerator {
	/**
	 * The '<em><b>BUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON(0, "BUTTON", "BUTTON"), /**
	 * The '<em><b>SONIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SONIC_VALUE
	 * @generated
	 * @ordered
	 */
	SONIC(1, "SONIC", "SONIC");

	/**
	 * The '<em><b>BUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_VALUE = 0;

	/**
	 * The '<em><b>SONIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sonic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SONIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SONIC_VALUE = 1;

	/**
	 * An array of all the '<em><b>HW Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HWType[] VALUES_ARRAY =
		new HWType[] {
			BUTTON,
			SONIC,
		};

	/**
	 * A public read-only list of all the '<em><b>HW Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HWType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HW Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HWType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HWType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HW Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HWType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HWType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HW Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HWType get(int value) {
		switch (value) {
			case BUTTON_VALUE: return BUTTON;
			case SONIC_VALUE: return SONIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HWType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HWType
