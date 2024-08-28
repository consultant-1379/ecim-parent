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
 * A representation of the model object '<em><b>Mim Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.MimType#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.MimType#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.MimType#getJim <em>Jim</em>}</li>
 *   <li>{@link TspMim.MimType#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.MimType#getHideInConfd <em>Hide In Confd</em>}</li>
 *   <li>{@link TspMim.MimType#getHideInLdap <em>Hide In Ldap</em>}</li>
 *   <li>{@link TspMim.MimType#getLdapObjectId <em>Ldap Object Id</em>}</li>
 *   <li>{@link TspMim.MimType#getConfdTargetNamespace <em>Confd Target Namespace</em>}</li>
 *   <li>{@link TspMim.MimType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link TspMim.MimType#getClass_ <em>Class</em>}</li>
 *   <li>{@link TspMim.MimType#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link TspMim.MimType#getName <em>Name</em>}</li>
 *   <li>{@link TspMim.MimType#getRelease <em>Release</em>}</li>
 *   <li>{@link TspMim.MimType#getVersion <em>Version</em>}</li>
 *   <li>{@link TspMim.MimType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getMimType()
 * @model extendedMetaData="name='mim_._type' kind='elementOnly'"
 * @generated
 */
public interface MimType extends EObject {
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
	 * @see TspMim.TspMimPackage#getMimType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link TspMim.MimType#getDescription <em>Description</em>}' containment reference.
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
	 * @see TspMim.TspMimPackage#getMimType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

    /**
	 * Returns the value of the '<em><b>Jim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jim</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Jim</em>' containment reference.
	 * @see #setJim(JimType)
	 * @see TspMim.TspMimPackage#getMimType_Jim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jim' namespace='##targetNamespace'"
	 * @generated
	 */
    JimType getJim();

    /**
	 * Sets the value of the '{@link TspMim.MimType#getJim <em>Jim</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jim</em>' containment reference.
	 * @see #getJim()
	 * @generated
	 */
    void setJim(JimType value);

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
	 * @see TspMim.TspMimPackage#getMimType_LdapObjectId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ldapObjectId' namespace='##targetNamespace'"
	 * @generated
	 */
    String getLdapObjectId();

    /**
	 * Sets the value of the '{@link TspMim.MimType#getLdapObjectId <em>Ldap Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Object Id</em>' attribute.
	 * @see #getLdapObjectId()
	 * @generated
	 */
    void setLdapObjectId(String value);

    /**
	 * Returns the value of the '<em><b>Confd Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Confd Target Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Confd Target Namespace</em>' attribute.
	 * @see #setConfdTargetNamespace(String)
	 * @see TspMim.TspMimPackage#getMimType_ConfdTargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='confdTargetNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
    String getConfdTargetNamespace();

    /**
	 * Sets the value of the '{@link TspMim.MimType#getConfdTargetNamespace <em>Confd Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confd Target Namespace</em>' attribute.
	 * @see #getConfdTargetNamespace()
	 * @generated
	 */
    void setConfdTargetNamespace(String value);

    /**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.DataTypeType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getMimType_DataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DataTypeType> getDataType();

    /**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ClassType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getMimType_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ClassType> getClass_();

    /**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.RelationshipType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getMimType_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<RelationshipType> getRelationship();

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
	 * @see TspMim.TspMimPackage#getMimType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link TspMim.MimType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

    /**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #setRelease(Object)
	 * @see TspMim.TspMimPackage#getMimType_Release()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='release' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getRelease();

    /**
	 * Sets the value of the '{@link TspMim.MimType#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
    void setRelease(Object value);

    /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see TspMim.TspMimPackage#getMimType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getVersion();

    /**
	 * Sets the value of the '{@link TspMim.MimType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(Object value);

    /**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getMimType_Any()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='any' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<EObject> getAny();

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
	 * @see TspMim.TspMimPackage#getMimType_HideInConfd()
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
	 * @see TspMim.TspMimPackage#getMimType_HideInLdap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hideInLdap' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<HideInLdapType> getHideInLdap();

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
	 * @see TspMim.TspMimPackage#getMimType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
	 * @generated
	 */
    FeatureMap getGroup();

} // MimType
