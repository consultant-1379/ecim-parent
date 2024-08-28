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
 * A representation of the literals of the enumeration '<em><b>Attr Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Attribute flags
 * <!-- end-model-doc -->
 * @see imm.ImmPackage#getAttrFlags()
 * @model extendedMetaData="name='attr-flags'"
 * @generated
 */
public enum AttrFlags implements Enumerator {
    /**
     * The '<em><b>SAMULTIVALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAMULTIVALUE_VALUE
     * @generated
     * @ordered
     */
    SAMULTIVALUE(0, "SAMULTIVALUE", "SA_MULTI_VALUE"),

    /**
     * The '<em><b>SAWRITABLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAWRITABLE_VALUE
     * @generated
     * @ordered
     */
    SAWRITABLE(1, "SAWRITABLE", "SA_WRITABLE"),

    /**
     * The '<em><b>SAINITIALIZED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAINITIALIZED_VALUE
     * @generated
     * @ordered
     */
    SAINITIALIZED(2, "SAINITIALIZED", "SA_INITIALIZED"),

    /**
     * The '<em><b>SAPERSISTENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAPERSISTENT_VALUE
     * @generated
     * @ordered
     */
    SAPERSISTENT(3, "SAPERSISTENT", "SA_PERSISTENT"),

    /**
     * The '<em><b>SACACHED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SACACHED_VALUE
     * @generated
     * @ordered
     */
    SACACHED(4, "SACACHED", "SA_CACHED"), /**
     * The '<em><b>SA NO DUPLICATES</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SA_NO_DUPLICATES_VALUE
     * @generated
     * @ordered
     */
    SA_NO_DUPLICATES(5, "SA_NO_DUPLICATES", "SA_NO_DUPLICATES"), /**
     * The '<em><b>SA NOTIFY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SA_NOTIFY_VALUE
     * @generated
     * @ordered
     */
    SA_NOTIFY(6, "SA_NOTIFY", "SA_NOTIFY"), /**
     * The '<em><b>SA NO DANGLING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SA_NO_DANGLING_VALUE
     * @generated
     * @ordered
     */
    SA_NO_DANGLING(7, "SA_NO_DANGLING", "SA_NO_DANGLING");

    /**
     * The '<em><b>SAMULTIVALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAMULTIVALUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAMULTIVALUE
     * @model literal="SA_MULTI_VALUE"
     * @generated
     * @ordered
     */
    public static final int SAMULTIVALUE_VALUE = 0;

    /**
     * The '<em><b>SAWRITABLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAWRITABLE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAWRITABLE
     * @model literal="SA_WRITABLE"
     * @generated
     * @ordered
     */
    public static final int SAWRITABLE_VALUE = 1;

    /**
     * The '<em><b>SAINITIALIZED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAINITIALIZED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAINITIALIZED
     * @model literal="SA_INITIALIZED"
     * @generated
     * @ordered
     */
    public static final int SAINITIALIZED_VALUE = 2;

    /**
     * The '<em><b>SAPERSISTENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAPERSISTENT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAPERSISTENT
     * @model literal="SA_PERSISTENT"
     * @generated
     * @ordered
     */
    public static final int SAPERSISTENT_VALUE = 3;

    /**
     * The '<em><b>SACACHED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SACACHED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SACACHED
     * @model literal="SA_CACHED"
     * @generated
     * @ordered
     */
    public static final int SACACHED_VALUE = 4;

    /**
     * The '<em><b>SA NO DUPLICATES</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SA NO DUPLICATES</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SA_NO_DUPLICATES
     * @model
     * @generated
     * @ordered
     */
    public static final int SA_NO_DUPLICATES_VALUE = 5;

    /**
     * The '<em><b>SA NOTIFY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SA NOTIFY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SA_NOTIFY
     * @model
     * @generated
     * @ordered
     */
    public static final int SA_NOTIFY_VALUE = 6;

    /**
     * The '<em><b>SA NO DANGLING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SA NO DANGLING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SA_NO_DANGLING
     * @model
     * @generated
     * @ordered
     */
    public static final int SA_NO_DANGLING_VALUE = 7;

    /**
     * An array of all the '<em><b>Attr Flags</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AttrFlags[] VALUES_ARRAY =
        new AttrFlags[] {
            SAMULTIVALUE,
            SAWRITABLE,
            SAINITIALIZED,
            SAPERSISTENT,
            SACACHED,
            SA_NO_DUPLICATES,
            SA_NOTIFY,
            SA_NO_DANGLING,
        };

    /**
     * A public read-only list of all the '<em><b>Attr Flags</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AttrFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Attr Flags</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttrFlags get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttrFlags result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attr Flags</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttrFlags getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttrFlags result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attr Flags</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttrFlags get(int value) {
        switch (value) {
            case SAMULTIVALUE_VALUE: return SAMULTIVALUE;
            case SAWRITABLE_VALUE: return SAWRITABLE;
            case SAINITIALIZED_VALUE: return SAINITIALIZED;
            case SAPERSISTENT_VALUE: return SAPERSISTENT;
            case SACACHED_VALUE: return SACACHED;
            case SA_NO_DUPLICATES_VALUE: return SA_NO_DUPLICATES;
            case SA_NOTIFY_VALUE: return SA_NOTIFY;
            case SA_NO_DANGLING_VALUE: return SA_NO_DANGLING;
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
    private AttrFlags(int value, String name, String literal) {
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
    
} //AttrFlags
