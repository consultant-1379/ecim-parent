/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.BooleanValue#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends Value {
    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see com.ericsson.yang.YANGPackage#getBooleanValue_Value()
	 * @model
	 * @generated
	 */
    boolean isValue();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.BooleanValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
    void setValue(boolean value);

} // BooleanValue
