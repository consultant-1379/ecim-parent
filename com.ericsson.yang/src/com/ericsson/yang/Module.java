/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Module#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.ericsson.yang.Module#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends AbstractModule {
    /**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see com.ericsson.yang.YANGPackage#getModule_Namespace()
	 * @model
	 * @generated
	 */
    String getNamespace();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Module#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
    void setNamespace(String value);

    /**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(Prefix)
	 * @see com.ericsson.yang.YANGPackage#getModule_Prefix()
	 * @model containment="true"
	 * @generated
	 */
    Prefix getPrefix();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Module#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
    void setPrefix(Prefix value);

} // Module
