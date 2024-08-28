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
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ClassType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.ClassType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.ClassType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.ClassType#getSystemCreated <em>System Created</em>}</li>
 *   <li>{@link Mp.ClassType#getNotificationTypes <em>Notification Types</em>}</li>
 *   <li>{@link Mp.ClassType#getNonPersistent <em>Non Persistent</em>}</li>
 *   <li>{@link Mp.ClassType#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.ClassType#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link Mp.ClassType#getLockBeforeDelete <em>Lock Before Delete</em>}</li>
 *   <li>{@link Mp.ClassType#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.ClassType#getRoot <em>Root</em>}</li>
 *   <li>{@link Mp.ClassType#getYangRoot <em>Yang Root</em>}</li>
 *   <li>{@link Mp.ClassType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.ClassType#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.ClassType#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.ClassType#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.ClassType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.ClassType#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.ClassType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.ClassType#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.ClassType#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.ClassType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.ClassType#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.ClassType#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.ClassType#getTransactionRequired <em>Transaction Required</em>}</li>
 *   <li>{@link Mp.ClassType#getTransactionConstraints <em>Transaction Constraints</em>}</li>
 *   <li>{@link Mp.ClassType#getAction <em>Action</em>}</li>
 *   <li>{@link Mp.ClassType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Mp.ClassType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getClassType()
 * @model extendedMetaData="name='class_._type' kind='elementOnly'"
 * @generated
 */
public interface ClassType extends EObject {
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
	 * @see Mp.MpPackage#getClassType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Mp.MpPackage#getClassType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getApplicationTag <em>Application Tag</em>}' containment reference.
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
	 * @see Mp.MpPackage#getClassType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>System Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Created</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>System Created</em>' containment reference.
	 * @see #setSystemCreated(SystemCreatedType)
	 * @see Mp.MpPackage#getClassType_SystemCreated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='systemCreated' namespace='##targetNamespace'"
	 * @generated
	 */
    SystemCreatedType getSystemCreated();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getSystemCreated <em>System Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Created</em>' containment reference.
	 * @see #getSystemCreated()
	 * @generated
	 */
    void setSystemCreated(SystemCreatedType value);

    /**
	 * Returns the value of the '<em><b>Notification Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notification Types</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Types</em>' containment reference.
	 * @see #setNotificationTypes(NotificationTypesType)
	 * @see Mp.MpPackage#getClassType_NotificationTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notificationTypes' namespace='##targetNamespace'"
	 * @generated
	 */
    NotificationTypesType getNotificationTypes();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getNotificationTypes <em>Notification Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Types</em>' containment reference.
	 * @see #getNotificationTypes()
	 * @generated
	 */
    void setNotificationTypes(NotificationTypesType value);

    /**
	 * Returns the value of the '<em><b>Non Persistent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Non Persistent</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Persistent</em>' containment reference.
	 * @see #setNonPersistent(NonPersistentType)
	 * @see Mp.MpPackage#getClassType_NonPersistent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nonPersistent' namespace='##targetNamespace'"
	 * @generated
	 */
    NonPersistentType getNonPersistent();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getNonPersistent <em>Non Persistent</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Persistent</em>' containment reference.
	 * @see #getNonPersistent()
	 * @generated
	 */
    void setNonPersistent(NonPersistentType value);

    /**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(PreconditionType)
	 * @see Mp.MpPackage#getClassType_Precondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precondition' namespace='##targetNamespace'"
	 * @generated
	 */
    PreconditionType getPrecondition();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
    void setPrecondition(PreconditionType value);

    /**
	 * Returns the value of the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Only</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' containment reference.
	 * @see #setReadOnly(ReadOnlyType)
	 * @see Mp.MpPackage#getClassType_ReadOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readOnly' namespace='##targetNamespace'"
	 * @generated
	 */
    ReadOnlyType getReadOnly();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getReadOnly <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' containment reference.
	 * @see #getReadOnly()
	 * @generated
	 */
    void setReadOnly(ReadOnlyType value);

    /**
	 * Returns the value of the '<em><b>Lock Before Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lock Before Delete</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Before Delete</em>' containment reference.
	 * @see #setLockBeforeDelete(LockBeforeDeleteType)
	 * @see Mp.MpPackage#getClassType_LockBeforeDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lockBeforeDelete' namespace='##targetNamespace'"
	 * @generated
	 */
    LockBeforeDeleteType getLockBeforeDelete();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getLockBeforeDelete <em>Lock Before Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Before Delete</em>' containment reference.
	 * @see #getLockBeforeDelete()
	 * @generated
	 */
    void setLockBeforeDelete(LockBeforeDeleteType value);

    /**
	 * Returns the value of the '<em><b>Validation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Validation Rules</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Rules</em>' containment reference.
	 * @see #setValidationRules(ValidationRulesType)
	 * @see Mp.MpPackage#getClassType_ValidationRules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationRules' namespace='##targetNamespace'"
	 * @generated
	 */
    ValidationRulesType getValidationRules();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getValidationRules <em>Validation Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Rules</em>' containment reference.
	 * @see #getValidationRules()
	 * @generated
	 */
    void setValidationRules(ValidationRulesType value);

    /**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(RootType)
	 * @see Mp.MpPackage#getClassType_Root()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace'"
	 * @generated
	 */
    RootType getRoot();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
    void setRoot(RootType value);

    /**
	 * Returns the value of the '<em><b>Yang Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yang Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yang Root</em>' containment reference.
	 * @see #setYangRoot(YangRootType)
	 * @see Mp.MpPackage#getClassType_YangRoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='yangRoot' namespace='##targetNamespace'"
	 * @generated
	 */
	YangRootType getYangRoot();

				/**
	 * Sets the value of the '{@link Mp.ClassType#getYangRoot <em>Yang Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yang Root</em>' containment reference.
	 * @see #getYangRoot()
	 * @generated
	 */
	void setYangRoot(YangRootType value);

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
	 * @see Mp.MpPackage#getClassType_Deprecated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecated' namespace='##targetNamespace'"
	 * @generated
	 */
    DeprecatedType getDeprecated();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getDeprecated <em>Deprecated</em>}' containment reference.
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
	 * @see Mp.MpPackage#getClassType_Obsolete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='obsolete' namespace='##targetNamespace'"
	 * @generated
	 */
    ObsoleteType getObsolete();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getObsolete <em>Obsolete</em>}' containment reference.
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
	 * @see Mp.MpPackage#getClassType_Preliminary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preliminary' namespace='##targetNamespace'"
	 * @generated
	 */
    PreliminaryType getPreliminary();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getPreliminary <em>Preliminary</em>}' containment reference.
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
	 * @see Mp.MpPackage#getClassType_StatusInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
    StatusInformationType getStatusInformation();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getStatusInformation <em>Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Information</em>' containment reference.
	 * @see #getStatusInformation()
	 * @generated
	 */
    void setStatusInformation(StatusInformationType value);

    /**
	 * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' containment reference.
	 * @see #setVisibility(VisibilityType)
	 * @see Mp.MpPackage#getClassType_Visibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
    VisibilityType getVisibility();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getVisibility <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' containment reference.
	 * @see #getVisibility()
	 * @generated
	 */
    void setVisibility(VisibilityType value);

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
	 * @see Mp.MpPackage#getClassType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
    FilterType getFilter();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
    void setFilter(FilterType value);

    /**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType)
	 * @see Mp.MpPackage#getClassType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesType getDependencies();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
    void setDependencies(DependenciesType value);

    /**
	 * Returns the value of the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies Script</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Script</em>' containment reference.
	 * @see #setDependenciesScript(DependenciesScriptType)
	 * @see Mp.MpPackage#getClassType_DependenciesScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependenciesScript' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesScriptType getDependenciesScript();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getDependenciesScript <em>Dependencies Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies Script</em>' containment reference.
	 * @see #getDependenciesScript()
	 * @generated
	 */
    void setDependenciesScript(DependenciesScriptType value);

    /**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureType)
	 * @see Mp.MpPackage#getClassType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
    FeatureType getFeature();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
    void setFeature(FeatureType value);

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
	 * @see Mp.MpPackage#getClassType_Specification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
    SpecificationType getSpecification();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
    void setSpecification(SpecificationType value);

    /**
	 * Returns the value of the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface Only</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Only</em>' containment reference.
	 * @see #setInterfaceOnly(InterfaceOnlyType)
	 * @see Mp.MpPackage#getClassType_InterfaceOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceOnly' namespace='##targetNamespace'"
	 * @generated
	 */
    InterfaceOnlyType getInterfaceOnly();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getInterfaceOnly <em>Interface Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Only</em>' containment reference.
	 * @see #getInterfaceOnly()
	 * @generated
	 */
    void setInterfaceOnly(InterfaceOnlyType value);

    /**
	 * Returns the value of the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decision Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Point</em>' containment reference.
	 * @see #setDecisionPoint(DecisionPointType)
	 * @see Mp.MpPackage#getClassType_DecisionPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionPoint' namespace='##targetNamespace'"
	 * @generated
	 */
    DecisionPointType getDecisionPoint();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getDecisionPoint <em>Decision Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Point</em>' containment reference.
	 * @see #getDecisionPoint()
	 * @generated
	 */
    void setDecisionPoint(DecisionPointType value);

    /**
	 * Returns the value of the '<em><b>Transaction Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transaction Required</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Required</em>' containment reference.
	 * @see #setTransactionRequired(TransactionRequiredType)
	 * @see Mp.MpPackage#getClassType_TransactionRequired()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactionRequired' namespace='##targetNamespace'"
	 * @generated
	 */
    TransactionRequiredType getTransactionRequired();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getTransactionRequired <em>Transaction Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Required</em>' containment reference.
	 * @see #getTransactionRequired()
	 * @generated
	 */
    void setTransactionRequired(TransactionRequiredType value);

    /**
	 * Returns the value of the '<em><b>Transaction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transaction Constraints</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Constraints</em>' containment reference.
	 * @see #setTransactionConstraints(TransactionConstraintsType)
	 * @see Mp.MpPackage#getClassType_TransactionConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactionConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
    TransactionConstraintsType getTransactionConstraints();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getTransactionConstraints <em>Transaction Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Constraints</em>' containment reference.
	 * @see #getTransactionConstraints()
	 * @generated
	 */
    void setTransactionConstraints(TransactionConstraintsType value);

    /**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.ActionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see Mp.MpPackage#getClassType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace' group='group:18'"
	 * @generated
	 */
    EList<ActionType> getAction();

    /**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.AttributeType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see Mp.MpPackage#getClassType_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace' group='group:18'"
	 * @generated
	 */
    EList<AttributeType> getAttribute();

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
	 * @see Mp.MpPackage#getClassType_Name()
	 * @model required="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link Mp.ClassType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

} // ClassType
