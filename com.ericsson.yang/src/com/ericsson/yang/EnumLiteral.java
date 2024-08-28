/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.EnumLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link com.ericsson.yang.EnumLiteral#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ericsson.yang.EnumLiteral#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getEnumLiteral()
 * @model
 * @generated
 */
public interface EnumLiteral extends NamedElement {
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
	 * @see com.ericsson.yang.YANGPackage#getEnumLiteral_Value()
	 * @model containment="true"
	 * @generated
	 */
    Value getValue();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.EnumLiteral#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(Value value);

    /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.ericsson.yang.YANGPackage#getEnumLiteral_Description()
	 * @model
	 * @generated
	 */
    String getDescription();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.EnumLiteral#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(String value);

    /**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see com.ericsson.yang.YANGPackage#getEnumLiteral_Reference()
	 * @model
	 * @generated
	 */
    String getReference();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.EnumLiteral#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
    void setReference(String value);

} // EnumLiteral
