/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Extension#getArgument <em>Argument</em>}</li>
 *   <li>{@link com.ericsson.yang.Extension#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends ModuleStatement, NamedElement {
    /**
	 * Returns the value of the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Argument</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' attribute.
	 * @see #setArgument(String)
	 * @see com.ericsson.yang.YANGPackage#getExtension_Argument()
	 * @model
	 * @generated
	 */
    String getArgument();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Extension#getArgument <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' attribute.
	 * @see #getArgument()
	 * @generated
	 */
    void setArgument(String value);

    /**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.ericsson.yang.StatusKind}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #setStatus(StatusKind)
	 * @see com.ericsson.yang.YANGPackage#getExtension_Status()
	 * @model
	 * @generated
	 */
    StatusKind getStatus();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Extension#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
    void setStatus(StatusKind value);

} // Extension
