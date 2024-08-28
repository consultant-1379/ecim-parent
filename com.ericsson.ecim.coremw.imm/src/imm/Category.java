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
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Class or attribute category
 * <!-- end-model-doc -->
 * @see imm.ImmPackage#getCategory()
 * @model extendedMetaData="name='category'"
 * @generated
 */
public enum Category implements Enumerator {
    /**
     * The '<em><b>SACONFIG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SACONFIG_VALUE
     * @generated
     * @ordered
     */
    SACONFIG(0, "SACONFIG", "SA_CONFIG"),

    /**
     * The '<em><b>SARUNTIME</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SARUNTIME_VALUE
     * @generated
     * @ordered
     */
    SARUNTIME(1, "SARUNTIME", "SA_RUNTIME");

    /**
     * The '<em><b>SACONFIG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SACONFIG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SACONFIG
     * @model literal="SA_CONFIG"
     * @generated
     * @ordered
     */
    public static final int SACONFIG_VALUE = 0;

    /**
     * The '<em><b>SARUNTIME</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SARUNTIME</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SARUNTIME
     * @model literal="SA_RUNTIME"
     * @generated
     * @ordered
     */
    public static final int SARUNTIME_VALUE = 1;

    /**
     * An array of all the '<em><b>Category</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Category[] VALUES_ARRAY =
        new Category[] {
            SACONFIG,
            SARUNTIME,
        };

    /**
     * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Category get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Category result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Category</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Category getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Category result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Category get(int value) {
        switch (value) {
            case SACONFIG_VALUE: return SACONFIG;
            case SARUNTIME_VALUE: return SARUNTIME;
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
    private Category(int value, String name, String literal) {
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
    
} //Category
