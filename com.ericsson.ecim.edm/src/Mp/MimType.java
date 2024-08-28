/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mim Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.MimType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.MimType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.MimType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.MimType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link Mp.MimType#getMimParts <em>Mim Parts</em>}</li>
 *   <li>{@link Mp.MimType#getImplements <em>Implements</em>}</li>
 *   <li>{@link Mp.MimType#getModelFeatures <em>Model Features</em>}</li>
 *   <li>{@link Mp.MimType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.MimType#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.MimType#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.MimType#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.MimType#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.MimType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.MimType#getStruct <em>Struct</em>}</li>
 *   <li>{@link Mp.MimType#getEnum <em>Enum</em>}</li>
 *   <li>{@link Mp.MimType#getException <em>Exception</em>}</li>
 *   <li>{@link Mp.MimType#getDerivedDataType <em>Derived Data Type</em>}</li>
 *   <li>{@link Mp.MimType#getClass_ <em>Class</em>}</li>
 *   <li>{@link Mp.MimType#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link Mp.MimType#getName <em>Name</em>}</li>
 *   <li>{@link Mp.MimType#getVersion <em>Version</em>}</li>
 *   <li>{@link Mp.MimType#getRelease <em>Release</em>}</li>
 *   <li>{@link Mp.MimType#getAuthor <em>Author</em>}</li>
 *   <li>{@link Mp.MimType#getContact <em>Contact</em>}</li>
 *   <li>{@link Mp.MimType#getDate <em>Date</em>}</li>
 *   <li>{@link Mp.MimType#getDocNo <em>Doc No</em>}</li>
 *   <li>{@link Mp.MimType#getRevision <em>Revision</em>}</li>
 *   <li>{@link Mp.MimType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link Mp.MimType#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link Mp.MimType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link Mp.MimType#getVariant <em>Variant</em>}</li>
 *   <li>{@link Mp.MimType#getCorrection <em>Correction</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getMimType()
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
	 * @see Mp.MpPackage#getMimType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.MimType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Tag</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Tag</em>' containment reference.
	 * @see #setApplicationTag(ApplicationTagType)
	 * @see Mp.MpPackage#getMimType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.MimType#getApplicationTag <em>Application Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Tag</em>' containment reference.
	 * @see #getApplicationTag()
	 * @generated
	 */
    void setApplicationTag(ApplicationTagType value);

    /**
	 * Returns the value of the '<em><b>Domain Extension</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.DomainExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Extension</em>' containment reference list.
	 * @see Mp.MpPackage#getMimType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(CopyrightType)
	 * @see Mp.MpPackage#getMimType_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
    CopyrightType getCopyright();

    /**
	 * Sets the value of the '{@link Mp.MimType#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
    void setCopyright(CopyrightType value);

    /**
	 * Returns the value of the '<em><b>Mim Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mim Parts</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mim Parts</em>' containment reference.
	 * @see #setMimParts(MimPartsType)
	 * @see Mp.MpPackage#getMimType_MimParts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimParts' namespace='##targetNamespace'"
	 * @generated
	 */
    MimPartsType getMimParts();

    /**
	 * Sets the value of the '{@link Mp.MimType#getMimParts <em>Mim Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mim Parts</em>' containment reference.
	 * @see #getMimParts()
	 * @generated
	 */
    void setMimParts(MimPartsType value);

    /**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.StructType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Struct</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference list.
	 * @see Mp.MpPackage#getMimType_Struct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
    EList<StructType> getStruct();

    /**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.EnumType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enum</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference list.
	 * @see Mp.MpPackage#getMimType_Enum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
    EList<EnumType> getEnum();

    /**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.ExceptionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exception</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference list.
	 * @see Mp.MpPackage#getMimType_Exception()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exception' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
    EList<ExceptionType> getException();

    /**
	 * Returns the value of the '<em><b>Derived Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.DerivedDataTypeType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Derived Data Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Data Type</em>' containment reference list.
	 * @see Mp.MpPackage#getMimType_DerivedDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedDataType' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
    EList<DerivedDataTypeType> getDerivedDataType();

    /**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.ClassType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see Mp.MpPackage#getMimType_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ClassType> getClass_();

    /**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.RelationshipType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see Mp.MpPackage#getMimType_Relationship()
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
	 * @see #setName(String)
	 * @see Mp.MpPackage#getMimType_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link Mp.MimType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

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
	 * @see Mp.MpPackage#getMimType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getVersion();

    /**
	 * Sets the value of the '{@link Mp.MimType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(Object value);

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
	 * @see Mp.MpPackage#getMimType_Release()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='release' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getRelease();

    /**
	 * Sets the value of the '{@link Mp.MimType#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
    void setRelease(Object value);

    /**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see Mp.MpPackage#getMimType_Author()
	 * @model extendedMetaData="kind='attribute' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
    String getAuthor();

    /**
	 * Sets the value of the '{@link Mp.MimType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
    void setAuthor(String value);

    /**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contact</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(Object)
	 * @see Mp.MpPackage#getMimType_Contact()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getContact();

    /**
	 * Sets the value of the '{@link Mp.MimType#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
    void setContact(Object value);

    /**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Object)
	 * @see Mp.MpPackage#getMimType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getDate();

    /**
	 * Sets the value of the '{@link Mp.MimType#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
    void setDate(Object value);

    /**
	 * Returns the value of the '<em><b>Doc No</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Doc No</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc No</em>' attribute.
	 * @see #setDocNo(Object)
	 * @see Mp.MpPackage#getMimType_DocNo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='docNo' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getDocNo();

    /**
	 * Sets the value of the '{@link Mp.MimType#getDocNo <em>Doc No</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc No</em>' attribute.
	 * @see #getDocNo()
	 * @generated
	 */
    void setDocNo(Object value);

    /**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(Object)
	 * @see Mp.MpPackage#getMimType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getRevision();

    /**
	 * Sets the value of the '{@link Mp.MimType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
    void setRevision(Object value);

    /**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(Object)
	 * @see Mp.MpPackage#getMimType_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='namespace' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getNamespace();

    /**
	 * Sets the value of the '{@link Mp.MimType#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
    void setNamespace(Object value);

    /**
	 * Returns the value of the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Prefix</em>' attribute.
	 * @see #setNamespacePrefix(Object)
	 * @see Mp.MpPackage#getMimType_NamespacePrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='namespacePrefix' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getNamespacePrefix();

    /**
	 * Sets the value of the '{@link Mp.MimType#getNamespacePrefix <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Prefix</em>' attribute.
	 * @see #getNamespacePrefix()
	 * @generated
	 */
    void setNamespacePrefix(Object value);

    /**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Organization</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(Object)
	 * @see Mp.MpPackage#getMimType_Organization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getOrganization();

    /**
	 * Sets the value of the '{@link Mp.MimType#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
    void setOrganization(Object value);

    /**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variant</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see #setVariant(Object)
	 * @see Mp.MpPackage#getMimType_Variant()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='variant' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getVariant();

    /**
	 * Sets the value of the '{@link Mp.MimType#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see #getVariant()
	 * @generated
	 */
    void setVariant(Object value);

    /**
	 * Returns the value of the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Correction</em>' attribute.
	 * @see #setCorrection(Object)
	 * @see Mp.MpPackage#getMimType_Correction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='correction' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getCorrection();

    /**
	 * Sets the value of the '{@link Mp.MimType#getCorrection <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction</em>' attribute.
	 * @see #getCorrection()
	 * @generated
	 */
    void setCorrection(Object value);

    /**
	 * Returns the value of the '<em><b>Model Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Features</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Features</em>' containment reference.
	 * @see #setModelFeatures(ModelFeaturesType)
	 * @see Mp.MpPackage#getMimType_ModelFeatures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelFeatures' namespace='##targetNamespace'"
	 * @generated
	 */
    ModelFeaturesType getModelFeatures();

    /**
	 * Sets the value of the '{@link Mp.MimType#getModelFeatures <em>Model Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Features</em>' containment reference.
	 * @see #getModelFeatures()
	 * @generated
	 */
    void setModelFeatures(ModelFeaturesType value);

    /**
	 * Returns the value of the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deprecated</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' containment reference.
	 * @see #setDeprecated(DeprecatedType)
	 * @see Mp.MpPackage#getMimType_Deprecated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecated' namespace='##targetNamespace'"
	 * @generated
	 */
    DeprecatedType getDeprecated();

    /**
	 * Sets the value of the '{@link Mp.MimType#getDeprecated <em>Deprecated</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' containment reference.
	 * @see #getDeprecated()
	 * @generated
	 */
    void setDeprecated(DeprecatedType value);

    /**
	 * Returns the value of the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Obsolete</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Obsolete</em>' containment reference.
	 * @see #setObsolete(ObsoleteType)
	 * @see Mp.MpPackage#getMimType_Obsolete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='obsolete' namespace='##targetNamespace'"
	 * @generated
	 */
    ObsoleteType getObsolete();

    /**
	 * Sets the value of the '{@link Mp.MimType#getObsolete <em>Obsolete</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obsolete</em>' containment reference.
	 * @see #getObsolete()
	 * @generated
	 */
    void setObsolete(ObsoleteType value);

    /**
	 * Returns the value of the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preliminary</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary</em>' containment reference.
	 * @see #setPreliminary(PreliminaryType)
	 * @see Mp.MpPackage#getMimType_Preliminary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preliminary' namespace='##targetNamespace'"
	 * @generated
	 */
    PreliminaryType getPreliminary();

    /**
	 * Sets the value of the '{@link Mp.MimType#getPreliminary <em>Preliminary</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary</em>' containment reference.
	 * @see #getPreliminary()
	 * @generated
	 */
    void setPreliminary(PreliminaryType value);

    /**
	 * Returns the value of the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status Information</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Information</em>' containment reference.
	 * @see #setStatusInformation(StatusInformationType)
	 * @see Mp.MpPackage#getMimType_StatusInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
    StatusInformationType getStatusInformation();

    /**
	 * Sets the value of the '{@link Mp.MimType#getStatusInformation <em>Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Information</em>' containment reference.
	 * @see #getStatusInformation()
	 * @generated
	 */
    void setStatusInformation(StatusInformationType value);

    /**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see Mp.MpPackage#getMimType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
    FilterType getFilter();

    /**
	 * Sets the value of the '{@link Mp.MimType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
    void setFilter(FilterType value);

    /**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(SpecificationType)
	 * @see Mp.MpPackage#getMimType_Specification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
    SpecificationType getSpecification();

    /**
	 * Sets the value of the '{@link Mp.MimType#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
    void setSpecification(SpecificationType value);

    /**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implements</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference.
	 * @see #setImplements(ImplementsType)
	 * @see Mp.MpPackage#getMimType_Implements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implements' namespace='##targetNamespace'"
	 * @generated
	 */
    ImplementsType getImplements();

    /**
	 * Sets the value of the '{@link Mp.MimType#getImplements <em>Implements</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' containment reference.
	 * @see #getImplements()
	 * @generated
	 */
    void setImplements(ImplementsType value);

} // MimType
