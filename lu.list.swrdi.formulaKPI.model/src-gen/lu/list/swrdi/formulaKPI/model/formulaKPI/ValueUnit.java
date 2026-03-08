/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Value Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getValueUnit()
 * @model
 * @generated
 */
public enum ValueUnit implements Enumerator {
	/**
	 * The '<em><b>MILLI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI_VALUE
	 * @generated
	 * @ordered
	 */
	MILLI(0, "MILLI", "ms"),

	/**
	 * The '<em><b>SEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC_VALUE
	 * @generated
	 * @ordered
	 */
	SEC(1, "SEC", "s"),

	/**
	 * The '<em><b>MIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(2, "MIN", "min"),

	/**
	 * The '<em><b>HOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(3, "HOUR", "h"),

	/**
	 * The '<em><b>LITERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERS_VALUE
	 * @generated
	 * @ordered
	 */
	LITERS(4, "LITERS", "L"),

	/**
	 * The '<em><b>M3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M3_VALUE
	 * @generated
	 * @ordered
	 */
	M3(5, "M3", "M3"),

	/**
	 * The '<em><b>Wh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WH_VALUE
	 * @generated
	 * @ordered
	 */
	WH(6, "Wh", "Wh"),

	/**
	 * The '<em><b>KWh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWH_VALUE
	 * @generated
	 * @ordered
	 */
	KWH(7, "kWh", "kWh"),

	/**
	 * The '<em><b>GCO 2eq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GCO_2EQ_VALUE
	 * @generated
	 * @ordered
	 */
	GCO_2EQ(8, "gCO2eq", "gCO2eq"),

	/**
	 * The '<em><b>Kg CO 2eq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KG_CO_2EQ_VALUE
	 * @generated
	 * @ordered
	 */
	KG_CO_2EQ(9, "kgCO2eq", "kgCO2eq");

	/**
	 * The '<em><b>MILLI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI
	 * @model literal="ms"
	 * @generated
	 * @ordered
	 */
	public static final int MILLI_VALUE = 0;

	/**
	 * The '<em><b>SEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC
	 * @model literal="s"
	 * @generated
	 * @ordered
	 */
	public static final int SEC_VALUE = 1;

	/**
	 * The '<em><b>MIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model literal="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 2;

	/**
	 * The '<em><b>HOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model literal="h"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 3;

	/**
	 * The '<em><b>LITERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERS
	 * @model literal="L"
	 * @generated
	 * @ordered
	 */
	public static final int LITERS_VALUE = 4;

	/**
	 * The '<em><b>M3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M3_VALUE = 5;

	/**
	 * The '<em><b>Wh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WH
	 * @model name="Wh"
	 * @generated
	 * @ordered
	 */
	public static final int WH_VALUE = 6;

	/**
	 * The '<em><b>KWh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWH
	 * @model name="kWh"
	 * @generated
	 * @ordered
	 */
	public static final int KWH_VALUE = 7;

	/**
	 * The '<em><b>GCO 2eq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GCO_2EQ
	 * @model name="gCO2eq"
	 * @generated
	 * @ordered
	 */
	public static final int GCO_2EQ_VALUE = 8;

	/**
	 * The '<em><b>Kg CO 2eq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KG_CO_2EQ
	 * @model name="kgCO2eq"
	 * @generated
	 * @ordered
	 */
	public static final int KG_CO_2EQ_VALUE = 9;

	/**
	 * An array of all the '<em><b>Value Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValueUnit[] VALUES_ARRAY = new ValueUnit[] { MILLI, SEC, MIN, HOUR, LITERS, M3, WH, KWH,
			GCO_2EQ, KG_CO_2EQ, };

	/**
	 * A public read-only list of all the '<em><b>Value Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValueUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Value Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueUnit get(int value) {
		switch (value) {
		case MILLI_VALUE:
			return MILLI;
		case SEC_VALUE:
			return SEC;
		case MIN_VALUE:
			return MIN;
		case HOUR_VALUE:
			return HOUR;
		case LITERS_VALUE:
			return LITERS;
		case M3_VALUE:
			return M3;
		case WH_VALUE:
			return WH;
		case KWH_VALUE:
			return KWH;
		case GCO_2EQ_VALUE:
			return GCO_2EQ;
		case KG_CO_2EQ_VALUE:
			return KG_CO_2EQ;
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
	private ValueUnit(int value, String name, String literal) {
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

} //ValueUnit
