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
 * A representation of the model object '<em><b>Abstract Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.AbstractModule#getYangVersion <em>Yang Version</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getOrganization <em>Organization</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getContact <em>Contact</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getImports <em>Imports</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getStatements <em>Statements</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getIncludeModules <em>Include Modules</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getDeviation <em>Deviation</em>}</li>
 *   <li>{@link com.ericsson.yang.AbstractModule#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getAbstractModule()
 * @model abstract="true"
 * @generated
 */
public interface AbstractModule extends NamedElement {
    /**
	 * Returns the value of the '<em><b>Yang Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Yang Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Yang Version</em>' attribute.
	 * @see #setYangVersion(int)
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_YangVersion()
	 * @model
	 * @generated
	 */
    int getYangVersion();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.AbstractModule#getYangVersion <em>Yang Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yang Version</em>' attribute.
	 * @see #getYangVersion()
	 * @generated
	 */
    void setYangVersion(int value);

    /**
	 * Returns the value of the '<em><b>Include Modules</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Include}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Include Modules</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Modules</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_IncludeModules()
	 * @model containment="true"
	 * @generated
	 */
    EList<Include> getIncludeModules();

    /**
	 * Returns the value of the '<em><b>Deviation</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Deviation}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deviation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviation</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Deviation()
	 * @model containment="true"
	 * @generated
	 */
    EList<Deviation> getDeviation();

    /**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Property}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Properties()
	 * @model containment="true"
	 * @generated
	 */
    EList<Property> getProperties();

    /**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Organization</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Organization()
	 * @model
	 * @generated
	 */
    String getOrganization();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.AbstractModule#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
    void setOrganization(String value);

    /**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contact</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(String)
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Contact()
	 * @model
	 * @generated
	 */
    String getContact();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.AbstractModule#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
    void setContact(String value);

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
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Description()
	 * @model
	 * @generated
	 */
    String getDescription();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.AbstractModule#getDescription <em>Description</em>}' attribute.
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
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Reference()
	 * @model
	 * @generated
	 */
    String getReference();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.AbstractModule#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
    void setReference(String value);

    /**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Import}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Imports()
	 * @model containment="true"
	 * @generated
	 */
    EList<Import> getImports();

    /**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Revision}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revisions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Revisions()
	 * @model containment="true"
	 * @generated
	 */
    EList<Revision> getRevisions();

    /**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.ModuleStatement}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Statements()
	 * @model containment="true"
	 * @generated
	 */
    EList<ModuleStatement> getStatements();

    /**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Feature}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAbstractModule_Features()
	 * @model containment="true"
	 * @generated
	 */
    EList<Feature> getFeatures();

} // AbstractModule
