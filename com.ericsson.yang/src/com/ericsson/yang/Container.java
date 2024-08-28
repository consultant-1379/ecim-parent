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
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Container#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.Container#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.Container#getPresence <em>Presence</em>}</li>
 *   <li>{@link com.ericsson.yang.Container#isConfig <em>Config</em>}</li>
 *   <li>{@link com.ericsson.yang.Container#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.Container#getRestricted <em>Restricted</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Node {
    /**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>When</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(When)
	 * @see com.ericsson.yang.YANGPackage#getContainer_When()
	 * @model containment="true"
	 * @generated
	 */
    When getWhen();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Container#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
    void setWhen(When value);

    /**
	 * Returns the value of the '<em><b>If Feature</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.IfFeature}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>If Feature</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>If Feature</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getContainer_IfFeature()
	 * @model containment="true"
	 * @generated
	 */
    EList<IfFeature> getIfFeature();

    /**
	 * Returns the value of the '<em><b>Presence</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Presence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence</em>' attribute.
	 * @see #setPresence(String)
	 * @see com.ericsson.yang.YANGPackage#getContainer_Presence()
	 * @model
	 * @generated
	 */
    String getPresence();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Container#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence</em>' attribute.
	 * @see #getPresence()
	 * @generated
	 */
    void setPresence(String value);

    /**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(boolean)
	 * @see com.ericsson.yang.YANGPackage#getContainer_Config()
	 * @model default="true"
	 * @generated
	 */
    boolean isConfig();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Container#isConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #isConfig()
	 * @generated
	 */
    void setConfig(boolean value);

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
	 * @see com.ericsson.yang.YANGPackage#getContainer_Status()
	 * @model
	 * @generated
	 */
    StatusKind getStatus();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Container#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
    void setStatus(StatusKind value);

    /**
	 * Returns the value of the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restricted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted</em>' attribute.
	 * @see #setRestricted(Boolean)
	 * @see com.ericsson.yang.YANGPackage#getContainer_Restricted()
	 * @model
	 * @generated
	 */
    Boolean getRestricted();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Container#getRestricted <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted</em>' attribute.
	 * @see #getRestricted()
	 * @generated
	 */
    void setRestricted(Boolean value);

} // Container
