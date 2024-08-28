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
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.AttributeType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.AttributeType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.AttributeType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.AttributeType#getTransactionRequired <em>Transaction Required</em>}</li>
 *   <li>{@link Mp.AttributeType#getTransactionConstraints <em>Transaction Constraints</em>}</li>
 *   <li>{@link Mp.AttributeType#getLocal <em>Local</em>}</li>
 *   <li>{@link Mp.AttributeType#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Mp.AttributeType#getNoNotification <em>No Notification</em>}</li>
 *   <li>{@link Mp.AttributeType#getNonPersistent <em>Non Persistent</em>}</li>
 *   <li>{@link Mp.AttributeType#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link Mp.AttributeType#getRestricted <em>Restricted</em>}</li>
 *   <li>{@link Mp.AttributeType#getStatic <em>Static</em>}</li>
 *   <li>{@link Mp.AttributeType#getUndefined <em>Undefined</em>}</li>
 *   <li>{@link Mp.AttributeType#getLockBeforeModify <em>Lock Before Modify</em>}</li>
 *   <li>{@link Mp.AttributeType#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.AttributeType#getRestartType <em>Restart Type</em>}</li>
 *   <li>{@link Mp.AttributeType#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link Mp.AttributeType#getKey <em>Key</em>}</li>
 *   <li>{@link Mp.AttributeType#getIsNillable <em>Is Nillable</em>}</li>
 *   <li>{@link Mp.AttributeType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Mp.AttributeType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.AttributeType#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.AttributeType#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.AttributeType#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.AttributeType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.AttributeType#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.AttributeType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.AttributeType#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.AttributeType#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.AttributeType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.AttributeType#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.AttributeType#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.AttributeType#getDisturbances <em>Disturbances</em>}</li>
 *   <li>{@link Mp.AttributeType#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link Mp.AttributeType#getSideEffects <em>Side Effects</em>}</li>
 *   <li>{@link Mp.AttributeType#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.AttributeType#getCondition <em>Condition</em>}</li>
 *   <li>{@link Mp.AttributeType#getCounterType <em>Counter Type</em>}</li>
 *   <li>{@link Mp.AttributeType#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link Mp.AttributeType#getScanner <em>Scanner</em>}</li>
 *   <li>{@link Mp.AttributeType#getCounterReset <em>Counter Reset</em>}</li>
 *   <li>{@link Mp.AttributeType#getCounterContext <em>Counter Context</em>}</li>
 *   <li>{@link Mp.AttributeType#getGetValue <em>Get Value</em>}</li>
 *   <li>{@link Mp.AttributeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getAttributeType()
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
	 * @see Mp.MpPackage#getAttributeType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getApplicationTag <em>Application Tag</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

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
	 * @see Mp.MpPackage#getAttributeType_TransactionRequired()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactionRequired' namespace='##targetNamespace'"
	 * @generated
	 */
    TransactionRequiredType getTransactionRequired();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getTransactionRequired <em>Transaction Required</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_TransactionConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactionConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
    TransactionConstraintsType getTransactionConstraints();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getTransactionConstraints <em>Transaction Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Constraints</em>' containment reference.
	 * @see #getTransactionConstraints()
	 * @generated
	 */
    void setTransactionConstraints(TransactionConstraintsType value);

    /**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference.
	 * @see #setLocal(LocalType)
	 * @see Mp.MpPackage#getAttributeType_Local()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local' namespace='##targetNamespace'"
	 * @generated
	 */
    LocalType getLocal();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getLocal <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' containment reference.
	 * @see #getLocal()
	 * @generated
	 */
    void setLocal(LocalType value);

    /**
	 * Returns the value of the '<em><b>Mandatory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mandatory</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' containment reference.
	 * @see #setMandatory(MandatoryType)
	 * @see Mp.MpPackage#getAttributeType_Mandatory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mandatory' namespace='##targetNamespace'"
	 * @generated
	 */
    MandatoryType getMandatory();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getMandatory <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' containment reference.
	 * @see #getMandatory()
	 * @generated
	 */
    void setMandatory(MandatoryType value);

    /**
	 * Returns the value of the '<em><b>Is Nillable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Nillable</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nillable</em>' containment reference.
	 * @see #setIsNillable(IsNillableType)
	 * @see Mp.MpPackage#getAttributeType_IsNillable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isNillable' namespace='##targetNamespace'"
	 * @generated
	 */
    IsNillableType getIsNillable();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getIsNillable <em>Is Nillable</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nillable</em>' containment reference.
	 * @see #getIsNillable()
	 * @generated
	 */
    void setIsNillable(IsNillableType value);

    /**
	 * Returns the value of the '<em><b>No Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>No Notification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>No Notification</em>' containment reference.
	 * @see #setNoNotification(NoNotificationType)
	 * @see Mp.MpPackage#getAttributeType_NoNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noNotification' namespace='##targetNamespace'"
	 * @generated
	 */
    NoNotificationType getNoNotification();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getNoNotification <em>No Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Notification</em>' containment reference.
	 * @see #getNoNotification()
	 * @generated
	 */
    void setNoNotification(NoNotificationType value);

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
	 * @see Mp.MpPackage#getAttributeType_NonPersistent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nonPersistent' namespace='##targetNamespace'"
	 * @generated
	 */
    NonPersistentType getNonPersistent();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getNonPersistent <em>Non Persistent</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Persistent</em>' containment reference.
	 * @see #getNonPersistent()
	 * @generated
	 */
    void setNonPersistent(NonPersistentType value);

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
	 * @see Mp.MpPackage#getAttributeType_ReadOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readOnly' namespace='##targetNamespace'"
	 * @generated
	 */
    ReadOnlyType getReadOnly();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getReadOnly <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' containment reference.
	 * @see #getReadOnly()
	 * @generated
	 */
    void setReadOnly(ReadOnlyType value);

    /**
	 * Returns the value of the '<em><b>Restricted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restricted</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted</em>' containment reference.
	 * @see #setRestricted(RestrictedType)
	 * @see Mp.MpPackage#getAttributeType_Restricted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restricted' namespace='##targetNamespace'"
	 * @generated
	 */
    RestrictedType getRestricted();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getRestricted <em>Restricted</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted</em>' containment reference.
	 * @see #getRestricted()
	 * @generated
	 */
    void setRestricted(RestrictedType value);

    /**
	 * Returns the value of the '<em><b>Static</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' containment reference.
	 * @see #setStatic(StaticType)
	 * @see Mp.MpPackage#getAttributeType_Static()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='static' namespace='##targetNamespace'"
	 * @generated
	 */
    StaticType getStatic();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getStatic <em>Static</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' containment reference.
	 * @see #getStatic()
	 * @generated
	 */
    void setStatic(StaticType value);

    /**
	 * Returns the value of the '<em><b>Undefined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Undefined</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Undefined</em>' containment reference.
	 * @see #setUndefined(UndefinedType)
	 * @see Mp.MpPackage#getAttributeType_Undefined()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undefined' namespace='##targetNamespace'"
	 * @generated
	 */
    UndefinedType getUndefined();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getUndefined <em>Undefined</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined</em>' containment reference.
	 * @see #getUndefined()
	 * @generated
	 */
    void setUndefined(UndefinedType value);

    /**
	 * Returns the value of the '<em><b>Lock Before Modify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lock Before Modify</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Before Modify</em>' containment reference.
	 * @see #setLockBeforeModify(LockBeforeModifyType)
	 * @see Mp.MpPackage#getAttributeType_LockBeforeModify()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lockBeforeModify' namespace='##targetNamespace'"
	 * @generated
	 */
    LockBeforeModifyType getLockBeforeModify();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getLockBeforeModify <em>Lock Before Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Before Modify</em>' containment reference.
	 * @see #getLockBeforeModify()
	 * @generated
	 */
    void setLockBeforeModify(LockBeforeModifyType value);

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
	 * @see Mp.MpPackage#getAttributeType_ValidationRules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationRules' namespace='##targetNamespace'"
	 * @generated
	 */
    ValidationRulesType getValidationRules();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getValidationRules <em>Validation Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Rules</em>' containment reference.
	 * @see #getValidationRules()
	 * @generated
	 */
    void setValidationRules(ValidationRulesType value);

    /**
	 * Returns the value of the '<em><b>Restart Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restart Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Type</em>' containment reference.
	 * @see #setRestartType(RestartTypeType)
	 * @see Mp.MpPackage#getAttributeType_RestartType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restartType' namespace='##targetNamespace'"
	 * @generated
	 */
    RestartTypeType getRestartType();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getRestartType <em>Restart Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Type</em>' containment reference.
	 * @see #getRestartType()
	 * @generated
	 */
    void setRestartType(RestartTypeType value);

    /**
	 * Returns the value of the '<em><b>Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indexed</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed</em>' containment reference.
	 * @see #setIndexed(IndexedType)
	 * @see Mp.MpPackage#getAttributeType_Indexed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indexed' namespace='##targetNamespace'"
	 * @generated
	 */
    IndexedType getIndexed();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getIndexed <em>Indexed</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed</em>' containment reference.
	 * @see #getIndexed()
	 * @generated
	 */
    void setIndexed(IndexedType value);

    /**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(KeyType)
	 * @see Mp.MpPackage#getAttributeType_Key()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
    KeyType getKey();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
    void setKey(KeyType value);

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
	 * @see Mp.MpPackage#getAttributeType_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
    DataTypeType getDataType();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
    void setDataType(DataTypeType value);

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
	 * @see Mp.MpPackage#getAttributeType_Deprecated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecated' namespace='##targetNamespace'"
	 * @generated
	 */
    DeprecatedType getDeprecated();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getDeprecated <em>Deprecated</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_Obsolete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='obsolete' namespace='##targetNamespace'"
	 * @generated
	 */
    ObsoleteType getObsolete();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getObsolete <em>Obsolete</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_Preliminary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preliminary' namespace='##targetNamespace'"
	 * @generated
	 */
    PreliminaryType getPreliminary();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getPreliminary <em>Preliminary</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_StatusInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
    StatusInformationType getStatusInformation();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getStatusInformation <em>Status Information</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_Visibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
    VisibilityType getVisibility();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getVisibility <em>Visibility</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
    FilterType getFilter();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getFilter <em>Filter</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesType getDependencies();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getDependencies <em>Dependencies</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_DependenciesScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependenciesScript' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesScriptType getDependenciesScript();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getDependenciesScript <em>Dependencies Script</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
    FeatureType getFeature();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getFeature <em>Feature</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_Specification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
    SpecificationType getSpecification();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getSpecification <em>Specification</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_InterfaceOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceOnly' namespace='##targetNamespace'"
	 * @generated
	 */
    InterfaceOnlyType getInterfaceOnly();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getInterfaceOnly <em>Interface Only</em>}' containment reference.
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
	 * @see Mp.MpPackage#getAttributeType_DecisionPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionPoint' namespace='##targetNamespace'"
	 * @generated
	 */
    DecisionPointType getDecisionPoint();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getDecisionPoint <em>Decision Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Point</em>' containment reference.
	 * @see #getDecisionPoint()
	 * @generated
	 */
    void setDecisionPoint(DecisionPointType value);

    /**
	 * Returns the value of the '<em><b>Disturbances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disturbances</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Disturbances</em>' containment reference.
	 * @see #setDisturbances(DisturbancesType)
	 * @see Mp.MpPackage#getAttributeType_Disturbances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disturbances' namespace='##targetNamespace'"
	 * @generated
	 */
    DisturbancesType getDisturbances();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getDisturbances <em>Disturbances</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disturbances</em>' containment reference.
	 * @see #getDisturbances()
	 * @generated
	 */
    void setDisturbances(DisturbancesType value);

    /**
	 * Returns the value of the '<em><b>Takes Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Takes Effect</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Takes Effect</em>' containment reference.
	 * @see #setTakesEffect(TakesEffectType)
	 * @see Mp.MpPackage#getAttributeType_TakesEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takesEffect' namespace='##targetNamespace'"
	 * @generated
	 */
    TakesEffectType getTakesEffect();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getTakesEffect <em>Takes Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Takes Effect</em>' containment reference.
	 * @see #getTakesEffect()
	 * @generated
	 */
    void setTakesEffect(TakesEffectType value);

    /**
	 * Returns the value of the '<em><b>Side Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Side Effects</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Effects</em>' containment reference.
	 * @see #setSideEffects(SideEffectsType)
	 * @see Mp.MpPackage#getAttributeType_SideEffects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sideEffects' namespace='##targetNamespace'"
	 * @generated
	 */
    SideEffectsType getSideEffects();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getSideEffects <em>Side Effects</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Effects</em>' containment reference.
	 * @see #getSideEffects()
	 * @generated
	 */
    void setSideEffects(SideEffectsType value);

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
	 * @see Mp.MpPackage#getAttributeType_Precondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precondition' namespace='##targetNamespace'"
	 * @generated
	 */
    PreconditionType getPrecondition();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
    void setPrecondition(PreconditionType value);

    /**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionType)
	 * @see Mp.MpPackage#getAttributeType_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
    ConditionType getCondition();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
    void setCondition(ConditionType value);

    /**
	 * Returns the value of the '<em><b>Counter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Counter Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Type</em>' containment reference.
	 * @see #setCounterType(CounterTypeType)
	 * @see Mp.MpPackage#getAttributeType_CounterType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='counterType' namespace='##targetNamespace'"
	 * @generated
	 */
    CounterTypeType getCounterType();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getCounterType <em>Counter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Type</em>' containment reference.
	 * @see #getCounterType()
	 * @generated
	 */
    void setCounterType(CounterTypeType value);

    /**
	 * Returns the value of the '<em><b>Sampling Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sampling Rate</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Rate</em>' containment reference.
	 * @see #setSamplingRate(SamplingRateType)
	 * @see Mp.MpPackage#getAttributeType_SamplingRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='samplingRate' namespace='##targetNamespace'"
	 * @generated
	 */
    SamplingRateType getSamplingRate();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getSamplingRate <em>Sampling Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Rate</em>' containment reference.
	 * @see #getSamplingRate()
	 * @generated
	 */
    void setSamplingRate(SamplingRateType value);

    /**
	 * Returns the value of the '<em><b>Scanner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scanner</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Scanner</em>' containment reference.
	 * @see #setScanner(ScannerType)
	 * @see Mp.MpPackage#getAttributeType_Scanner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scanner' namespace='##targetNamespace'"
	 * @generated
	 */
    ScannerType getScanner();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getScanner <em>Scanner</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scanner</em>' containment reference.
	 * @see #getScanner()
	 * @generated
	 */
    void setScanner(ScannerType value);

    /**
	 * Returns the value of the '<em><b>Counter Reset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Counter Reset</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Reset</em>' containment reference.
	 * @see #setCounterReset(CounterResetType)
	 * @see Mp.MpPackage#getAttributeType_CounterReset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='counterReset' namespace='##targetNamespace'"
	 * @generated
	 */
    CounterResetType getCounterReset();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getCounterReset <em>Counter Reset</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Reset</em>' containment reference.
	 * @see #getCounterReset()
	 * @generated
	 */
    void setCounterReset(CounterResetType value);

    /**
	 * Returns the value of the '<em><b>Counter Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Counter Context</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Context</em>' containment reference.
	 * @see #setCounterContext(CounterContextType)
	 * @see Mp.MpPackage#getAttributeType_CounterContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='counterContext' namespace='##targetNamespace'"
	 * @generated
	 */
    CounterContextType getCounterContext();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getCounterContext <em>Counter Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Context</em>' containment reference.
	 * @see #getCounterContext()
	 * @generated
	 */
    void setCounterContext(CounterContextType value);

    /**
	 * Returns the value of the '<em><b>Get Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Value</em>' containment reference.
	 * @see #setGetValue(GetValueType)
	 * @see Mp.MpPackage#getAttributeType_GetValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getValue' namespace='##targetNamespace'"
	 * @generated
	 */
    GetValueType getGetValue();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getGetValue <em>Get Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Value</em>' containment reference.
	 * @see #getGetValue()
	 * @generated
	 */
    void setGetValue(GetValueType value);

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
	 * @see Mp.MpPackage#getAttributeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.AttributeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // AttributeType
