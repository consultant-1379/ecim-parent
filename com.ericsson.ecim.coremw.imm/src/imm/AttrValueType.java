/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attr Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types of attribute's values
 * <!-- end-model-doc -->
 * @see imm.ImmPackage#getAttrValueType()
 * @model extendedMetaData="name='attr-value-type'"
 * @generated
 */
public enum AttrValueType implements Enumerator {
    /**
     * The '<em><b>SAINT32T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAINT32T_VALUE
     * @generated
     * @ordered
     */
    SAINT32T(0, "SAINT32T", "SA_INT32_T"),

    /**
     * The '<em><b>SAUINT32T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAUINT32T_VALUE
     * @generated
     * @ordered
     */
    SAUINT32T(1, "SAUINT32T", "SA_UINT32_T"),

    /**
     * The '<em><b>SAINT64T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAINT64T_VALUE
     * @generated
     * @ordered
     */
    SAINT64T(2, "SAINT64T", "SA_INT64_T"),

    /**
     * The '<em><b>SAUINT64T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAUINT64T_VALUE
     * @generated
     * @ordered
     */
    SAUINT64T(3, "SAUINT64T", "SA_UINT64_T"),

    /**
     * The '<em><b>SANAMET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SANAMET_VALUE
     * @generated
     * @ordered
     */
    SANAMET(4, "SANAMET", "SA_NAME_T"),

    /**
     * The '<em><b>SATIMET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SATIMET_VALUE
     * @generated
     * @ordered
     */
    SATIMET(5, "SATIMET", "SA_TIME_T"),

    /**
     * The '<em><b>SAFLOATT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAFLOATT_VALUE
     * @generated
     * @ordered
     */
    SAFLOATT(6, "SAFLOATT", "SA_FLOAT_T"),

    /**
     * The '<em><b>SADOUBLET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SADOUBLET_VALUE
     * @generated
     * @ordered
     */
    SADOUBLET(7, "SADOUBLET", "SA_DOUBLE_T"),

    /**
     * The '<em><b>SASTRINGT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SASTRINGT_VALUE
     * @generated
     * @ordered
     */
    SASTRINGT(8, "SASTRINGT", "SA_STRING_T"),

    /**
     * The '<em><b>SAANYT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAANYT_VALUE
     * @generated
     * @ordered
     */
    SAANYT(9, "SAANYT", "SA_ANY_T");

    /**
     * The '<em><b>SAINT32T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAINT32T</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAINT32T
     * @model literal="SA_INT32_T"
     * @generated
     * @ordered
     */
    public static final int SAINT32T_VALUE = 0;

    /**
     * The '<em><b>SAUINT32T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAUINT32T</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAUINT32T
     * @model literal="SA_UINT32_T"
     * @generated
     * @ordered
     */
    public static final int SAUINT32T_VALUE = 1;

    /**
     * The '<em><b>SAINT64T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAINT64T</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAINT64T
     * @model literal="SA_INT64_T"
     * @generated
     * @ordered
     */
    public static final int SAINT64T_VALUE = 2;

    /**
     * The '<em><b>SAUINT64T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAUINT64T</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAUINT64T
     * @model literal="SA_UINT64_T"
     * @generated
     * @ordered
     */
    public static final int SAUINT64T_VALUE = 3;

    /**
     * The '<em><b>SANAMET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SANAMET</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SANAMET
     * @model literal="SA_NAME_T"
     * @generated
     * @ordered
     */
    public static final int SANAMET_VALUE = 4;

    /**
     * The '<em><b>SATIMET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SATIMET</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SATIMET
     * @model literal="SA_TIME_T"
     * @generated
     * @ordered
     */
    public static final int SATIMET_VALUE = 5;

    /**
     * The '<em><b>SAFLOATT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAFLOATT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAFLOATT
     * @model literal="SA_FLOAT_T"
     * @generated
     * @ordered
     */
    public static final int SAFLOATT_VALUE = 6;

    /**
     * The '<em><b>SADOUBLET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SADOUBLET</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SADOUBLET
     * @model literal="SA_DOUBLE_T"
     * @generated
     * @ordered
     */
    public static final int SADOUBLET_VALUE = 7;

    /**
     * The '<em><b>SASTRINGT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SASTRINGT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SASTRINGT
     * @model literal="SA_STRING_T"
     * @generated
     * @ordered
     */
    public static final int SASTRINGT_VALUE = 8;

    /**
     * The '<em><b>SAANYT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAANYT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAANYT
     * @model literal="SA_ANY_T"
     * @generated
     * @ordered
     */
    public static final int SAANYT_VALUE = 9;

    /**
     * An array of all the '<em><b>Attr Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AttrValueType[] VALUES_ARRAY =
        new AttrValueType[] {
            SAINT32T,
            SAUINT32T,
            SAINT64T,
            SAUINT64T,
            SANAMET,
            SATIMET,
            SAFLOATT,
            SADOUBLET,
            SASTRINGT,
            SAANYT,
        };

    /**
     * A public read-only list of all the '<em><b>Attr Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AttrValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Attr Value Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttrValueType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttrValueType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attr Value Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttrValueType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttrValueType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attr Value Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttrValueType get(int value) {
        switch (value) {
            case SAINT32T_VALUE: return SAINT32T;
            case SAUINT32T_VALUE: return SAUINT32T;
            case SAINT64T_VALUE: return SAINT64T;
            case SAUINT64T_VALUE: return SAUINT64T;
            case SANAMET_VALUE: return SANAMET;
            case SATIMET_VALUE: return SATIMET;
            case SAFLOATT_VALUE: return SAFLOATT;
            case SADOUBLET_VALUE: return SADOUBLET;
            case SASTRINGT_VALUE: return SASTRINGT;
            case SAANYT_VALUE: return SAANYT;
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
    private AttrValueType(int value, String name, String literal) {
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
    
} //AttrValueType
