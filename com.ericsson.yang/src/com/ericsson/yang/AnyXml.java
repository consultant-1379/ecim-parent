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
 * A representation of the model object '<em><b>Any Xml</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.AnyXml#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.AnyXml#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.AnyXml#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getAnyXml()
 * @model
 * @generated
 */
public interface AnyXml extends DataDefinition {

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
	 * @see com.ericsson.yang.YANGPackage#getAnyXml_IfFeature()
	 * @model containment="true"
	 * @generated
	 */
    EList<IfFeature> getIfFeature();

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
	 * @see com.ericsson.yang.YANGPackage#getAnyXml_When()
	 * @model containment="true"
	 * @generated
	 */
    When getWhen();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.AnyXml#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
    void setWhen(When value);

    /**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see com.ericsson.yang.YANGPackage#getAnyXml_Mandatory()
	 * @model
	 * @generated
	 */
    boolean isMandatory();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.AnyXml#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
    void setMandatory(boolean value);
} // AnyXml
