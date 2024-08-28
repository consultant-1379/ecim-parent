/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.IdentityRef#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getIdentityRef()
 * @model
 * @generated
 */
public interface IdentityRef extends Type {
    /**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Base)
	 * @see com.ericsson.yang.YANGPackage#getIdentityRef_Base()
	 * @model containment="true" required="true"
	 * @generated
	 */
    Base getBase();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.IdentityRef#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
    void setBase(Base value);

} // IdentityRef
