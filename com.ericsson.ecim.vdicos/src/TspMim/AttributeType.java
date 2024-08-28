/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.AttributeType#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.AttributeType#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.AttributeType#getLdapObjectId <em>Ldap Object Id</em>}</li>
 *   <li>{@link TspMim.AttributeType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link TspMim.AttributeType#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.AttributeType#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link TspMim.AttributeType#getRestricted <em>Restricted</em>}</li>
 *   <li>{@link TspMim.AttributeType#getKey <em>Key</em>}</li>
 *   <li>{@link TspMim.AttributeType#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link TspMim.AttributeType#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link TspMim.AttributeType#getNonPersistent <em>Non Persistent</em>}</li>
 *   <li>{@link TspMim.AttributeType#getSensitive <em>Sensitive</em>}</li>
 *   <li>{@link TspMim.AttributeType#getHideInConfd <em>Hide In Confd</em>}</li>
 *   <li>{@link TspMim.AttributeType#getHideInLdap <em>Hide In Ldap</em>}</li>
 *   <li>{@link TspMim.AttributeType#getSystemMaintained <em>System Maintained</em>}</li>
 *   <li>{@link TspMim.AttributeType#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link TspMim.AttributeType#getCached <em>Cached</em>}</li>
 *   <li>{@link TspMim.AttributeType#getDeletable <em>Deletable</em>}</li>
 *   <li>{@link TspMim.AttributeType#getFrom <em>From</em>}</li>
 *   <li>{@link TspMim.AttributeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getAttributeType()
 * @model extendedMetaData="name='attribute_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeType extends EObject {
    /**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see TspMim.TspMimPackage#getAttributeType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link TspMim.AttributeType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

    /**
	 * Returns the value of the '<em><b>Ldap Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ldap Object Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Object Id</em>' attribute.
	 * @see #setLdapObjectId(String)
	 * @see TspMim.TspMimPackage#getAttributeType_LdapObjectId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ldapObjectId' namespace='##targetNamespace'"
	 * @generated
	 */
    String getLdapObjectId();

    /**
	 * Sets the value of the '{@link TspMim.AttributeType#getLdapObjectId <em>Ldap Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Object Id</em>' attribute.
	 * @see #getLdapObjectId()
	 * @generated
	 */
    void setLdapObjectId(String value);

    /**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataTypeType)
	 * @see TspMim.TspMimPackage#getAttributeType_DataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
    DataTypeType getDataType();

    /**
	 * Sets the value of the '{@link TspMim.AttributeType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
    void setDataType(DataTypeType value);

    /**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see TspMim.TspMimPackage#getAttributeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
	 * @generated
	 */
    FeatureMap getGroup();

    /**
	 * Returns the value of the '<em><b>Mandatory</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.MandatoryType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mandatory</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Mandatory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mandatory' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<MandatoryType> getMandatory();

    /**
	 * Returns the value of the '<em><b>Restricted</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.RestrictedType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restricted</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Restricted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='restricted' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<RestrictedType> getRestricted();

    /**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.KeyType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Key()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<KeyType> getKey();

    /**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Value</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute list.
	 * @see TspMim.TspMimPackage#getAttributeType_InitialValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initialValue' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<String> getInitialValue();

    /**
	 * Returns the value of the '<em><b>Read Only</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ReadOnlyType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Only</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_ReadOnly()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='readOnly' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<ReadOnlyType> getReadOnly();

    /**
	 * Returns the value of the '<em><b>Non Persistent</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.NonPersistentType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Non Persistent</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Persistent</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_NonPersistent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nonPersistent' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<NonPersistentType> getNonPersistent();

    /**
	 * Returns the value of the '<em><b>Sensitive</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.SensitiveType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensitive</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Sensitive()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sensitive' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<SensitiveType> getSensitive();

    /**
	 * Returns the value of the '<em><b>Hide In Confd</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.HideInConfdType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hide In Confd</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide In Confd</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_HideInConfd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hideInConfd' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<HideInConfdType> getHideInConfd();

    /**
	 * Returns the value of the '<em><b>Hide In Ldap</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.HideInLdapType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hide In Ldap</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide In Ldap</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_HideInLdap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hideInLdap' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<HideInLdapType> getHideInLdap();

    /**
	 * Returns the value of the '<em><b>System Maintained</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.SystemMaintainedType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Maintained</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>System Maintained</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_SystemMaintained()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='systemMaintained' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<SystemMaintainedType> getSystemMaintained();

    /**
	 * Returns the value of the '<em><b>Runtime</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.RuntimeType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Runtime</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Runtime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='runtime' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<RuntimeType> getRuntime();

    /**
	 * Returns the value of the '<em><b>Cached</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.CachedType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cached</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Cached()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cached' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<CachedType> getCached();

    /**
	 * Returns the value of the '<em><b>Deletable</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.DeletableType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deletable</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletable</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getAttributeType_Deletable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deletable' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<DeletableType> getDeletable();

    /**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Object)
	 * @see TspMim.TspMimPackage#getAttributeType_From()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getFrom();

    /**
	 * Sets the value of the '{@link TspMim.AttributeType#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
    void setFrom(Object value);

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see TspMim.TspMimPackage#getAttributeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link TspMim.AttributeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // AttributeType
