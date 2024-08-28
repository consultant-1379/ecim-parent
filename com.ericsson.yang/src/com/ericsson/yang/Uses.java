/**
 */
package com.ericsson.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Uses#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.Uses#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.Uses#getAugment <em>Augment</em>}</li>
 *   <li>{@link com.ericsson.yang.Uses#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.Uses#getRefine <em>Refine</em>}</li>
 *   <li>{@link com.ericsson.yang.Uses#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getUses()
 * @model
 * @generated
 */
public interface Uses extends DataDefinition {
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
	 * @see com.ericsson.yang.YANGPackage#getUses_Status()
	 * @model
	 * @generated
	 */
    StatusKind getStatus();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Uses#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
    void setStatus(StatusKind value);

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
	 * @see com.ericsson.yang.YANGPackage#getUses_IfFeature()
	 * @model containment="true"
	 * @generated
	 */
    EList<IfFeature> getIfFeature();

    /**
	 * Returns the value of the '<em><b>Augment</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Augment}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Augment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Augment</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getUses_Augment()
	 * @model containment="true"
	 * @generated
	 */
    EList<Augment> getAugment();

    /**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>When</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(When)
	 * @see com.ericsson.yang.YANGPackage#getUses_When()
	 * @model containment="true"
	 * @generated
	 */
    When getWhen();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Uses#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
    void setWhen(When value);

    /**
	 * Returns the value of the '<em><b>Refine</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Refine}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refine</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Refine</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getUses_Refine()
	 * @model containment="true"
	 * @generated
	 */
    EList<Refine> getRefine();

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
	 * @see com.ericsson.yang.YANGPackage#getUses_Prefix()
	 * @model
	 * @generated
	 */
    Prefix getPrefix();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Uses#getPrefix <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' reference.
	 * @see #getPrefix()
	 * @generated
	 */
    void setPrefix(Prefix value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
    String convertLocalPathToOriginalPath(String path);

} // Uses
