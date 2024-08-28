/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Property#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.ericsson.yang.Property#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Node {
    /**
	 * Returns the value of the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' reference.
	 * @see #setPrefix(Prefix)
	 * @see com.ericsson.yang.YANGPackage#getProperty_Prefix()
	 * @model derived="true"
	 * @generated
	 */
    Prefix getPrefix();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Property#getPrefix <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' reference.
	 * @see #getPrefix()
	 * @generated
	 */
    void setPrefix(Prefix value);

    /**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see com.ericsson.yang.YANGPackage#getProperty_Value()
	 * @model containment="true"
	 * @generated
	 */
    Value getValue();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Property#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(Value value);

} // Property
