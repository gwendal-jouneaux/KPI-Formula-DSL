/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Window Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getWindowUnit()
 * @model
 * @generated
 */
public enum WindowUnit implements Enumerator {
	/**
	 * The '<em><b>SEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC_VALUE
	 * @generated
	 * @ordered
	 */
	SEC(0, "SEC", "seconds"),

	/**
	 * The '<em><b>MIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(1, "MIN", "minutes"),

	/**
	 * The '<em><b>HOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(2, "HOUR", "hours"),

	/**
	 * The '<em><b>DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(3, "DAY", "days"),

	/**
	 * The '<em><b>MEASUREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT(4, "MEASUREMENT", "measurement");

	/**
	 * The '<em><b>SEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC
	 * @model literal="seconds"
	 * @generated
	 * @ordered
	 */
	public static final int SEC_VALUE = 0;

	/**
	 * The '<em><b>MIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model literal="minutes"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 1;

	/**
	 * The '<em><b>HOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model literal="hours"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 2;

	/**
	 * The '<em><b>DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model literal="days"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 3;

	/**
	 * The '<em><b>MEASUREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT
	 * @model literal="measurement"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Window Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WindowUnit[] VALUES_ARRAY = new WindowUnit[] { SEC, MIN, HOUR, DAY, MEASUREMENT, };

	/**
	 * A public read-only list of all the '<em><b>Window Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WindowUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Window Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindowUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindowUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Window Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindowUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindowUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Window Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindowUnit get(int value) {
		switch (value) {
		case SEC_VALUE:
			return SEC;
		case MIN_VALUE:
			return MIN;
		case HOUR_VALUE:
			return HOUR;
		case DAY_VALUE:
			return DAY;
		case MEASUREMENT_VALUE:
			return MEASUREMENT;
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
	private WindowUnit(int value, String name, String literal) {
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

} //WindowUnit
