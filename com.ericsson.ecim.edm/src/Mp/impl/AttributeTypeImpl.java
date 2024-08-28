/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApplicationTagType;
import Mp.AttributeType;
import Mp.ConditionType;
import Mp.CounterContextType;
import Mp.CounterResetType;
import Mp.CounterTypeType;
import Mp.DataTypeType;
import Mp.DecisionPointType;
import Mp.DependenciesScriptType;
import Mp.DependenciesType;
import Mp.DeprecatedType;
import Mp.DescriptionType;
import Mp.DisturbancesType;
import Mp.DomainExtensionType;
import Mp.FeatureType;
import Mp.FilterType;
import Mp.GetValueType;
import Mp.IndexedType;
import Mp.InterfaceOnlyType;
import Mp.IsNillableType;
import Mp.KeyType;
import Mp.LocalType;
import Mp.LockBeforeModifyType;
import Mp.MandatoryType;
import Mp.MpPackage;
import Mp.NoNotificationType;
import Mp.NonPersistentType;
import Mp.ObsoleteType;
import Mp.PreconditionType;
import Mp.PreliminaryType;
import Mp.ReadOnlyType;
import Mp.RestartTypeType;
import Mp.RestrictedType;
import Mp.SamplingRateType;
import Mp.ScannerType;
import Mp.SideEffectsType;
import Mp.SpecificationType;
import Mp.StaticType;
import Mp.StatusInformationType;
import Mp.TakesEffectType;
import Mp.TransactionConstraintsType;
import Mp.TransactionRequiredType;
import Mp.UndefinedType;
import Mp.ValidationRulesType;
import Mp.VisibilityType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getTransactionRequired <em>Transaction Required</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getTransactionConstraints <em>Transaction Constraints</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getNoNotification <em>No Notification</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getNonPersistent <em>Non Persistent</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getRestricted <em>Restricted</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getUndefined <em>Undefined</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getLockBeforeModify <em>Lock Before Modify</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getRestartType <em>Restart Type</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getIsNillable <em>Is Nillable</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getDisturbances <em>Disturbances</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getSideEffects <em>Side Effects</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getCounterType <em>Counter Type</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getScanner <em>Scanner</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getCounterReset <em>Counter Reset</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getCounterContext <em>Counter Context</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getGetValue <em>Get Value</em>}</li>
 *   <li>{@link Mp.impl.AttributeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeTypeImpl extends EObjectImpl implements AttributeType {
    /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
    protected DescriptionType description;

    /**
	 * The cached value of the '{@link #getApplicationTag() <em>Application Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApplicationTag()
	 * @generated
	 * @ordered
	 */
    protected ApplicationTagType applicationTag;

    /**
	 * The cached value of the '{@link #getDomainExtension() <em>Domain Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDomainExtension()
	 * @generated
	 * @ordered
	 */
    protected EList<DomainExtensionType> domainExtension;

    /**
	 * The cached value of the '{@link #getTransactionRequired() <em>Transaction Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTransactionRequired()
	 * @generated
	 * @ordered
	 */
    protected TransactionRequiredType transactionRequired;

    /**
	 * The cached value of the '{@link #getTransactionConstraints() <em>Transaction Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTransactionConstraints()
	 * @generated
	 * @ordered
	 */
    protected TransactionConstraintsType transactionConstraints;

    /**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
    protected LocalType local;

    /**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
    protected MandatoryType mandatory;

    /**
	 * The cached value of the '{@link #getNoNotification() <em>No Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNoNotification()
	 * @generated
	 * @ordered
	 */
    protected NoNotificationType noNotification;

    /**
	 * The cached value of the '{@link #getNonPersistent() <em>Non Persistent</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNonPersistent()
	 * @generated
	 * @ordered
	 */
    protected NonPersistentType nonPersistent;

    /**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
    protected ReadOnlyType readOnly;

    /**
	 * The cached value of the '{@link #getRestricted() <em>Restricted</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestricted()
	 * @generated
	 * @ordered
	 */
    protected RestrictedType restricted;

    /**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
    protected StaticType static_;

    /**
	 * The cached value of the '{@link #getUndefined() <em>Undefined</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUndefined()
	 * @generated
	 * @ordered
	 */
    protected UndefinedType undefined;

    /**
	 * The cached value of the '{@link #getLockBeforeModify() <em>Lock Before Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLockBeforeModify()
	 * @generated
	 * @ordered
	 */
    protected LockBeforeModifyType lockBeforeModify;

    /**
	 * The cached value of the '{@link #getValidationRules() <em>Validation Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValidationRules()
	 * @generated
	 * @ordered
	 */
    protected ValidationRulesType validationRules;

    /**
	 * The cached value of the '{@link #getRestartType() <em>Restart Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestartType()
	 * @generated
	 * @ordered
	 */
    protected RestartTypeType restartType;

    /**
	 * The cached value of the '{@link #getIndexed() <em>Indexed</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIndexed()
	 * @generated
	 * @ordered
	 */
    protected IndexedType indexed;

    /**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
    protected KeyType key;

    /**
	 * The cached value of the '{@link #getIsNillable() <em>Is Nillable</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsNillable()
	 * @generated
	 * @ordered
	 */
    protected IsNillableType isNillable;

    /**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
    protected DataTypeType dataType;

    /**
	 * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
    protected DeprecatedType deprecated;

    /**
	 * The cached value of the '{@link #getObsolete() <em>Obsolete</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getObsolete()
	 * @generated
	 * @ordered
	 */
    protected ObsoleteType obsolete;

    /**
	 * The cached value of the '{@link #getPreliminary() <em>Preliminary</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPreliminary()
	 * @generated
	 * @ordered
	 */
    protected PreliminaryType preliminary;

    /**
	 * The cached value of the '{@link #getStatusInformation() <em>Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatusInformation()
	 * @generated
	 * @ordered
	 */
    protected StatusInformationType statusInformation;

    /**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
    protected VisibilityType visibility;

    /**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
    protected FilterType filter;

    /**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
    protected DependenciesType dependencies;

    /**
	 * The cached value of the '{@link #getDependenciesScript() <em>Dependencies Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDependenciesScript()
	 * @generated
	 * @ordered
	 */
    protected DependenciesScriptType dependenciesScript;

    /**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
    protected FeatureType feature;

    /**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
    protected SpecificationType specification;

    /**
	 * The cached value of the '{@link #getInterfaceOnly() <em>Interface Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInterfaceOnly()
	 * @generated
	 * @ordered
	 */
    protected InterfaceOnlyType interfaceOnly;

    /**
	 * The cached value of the '{@link #getDecisionPoint() <em>Decision Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDecisionPoint()
	 * @generated
	 * @ordered
	 */
    protected DecisionPointType decisionPoint;

    /**
	 * The cached value of the '{@link #getDisturbances() <em>Disturbances</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDisturbances()
	 * @generated
	 * @ordered
	 */
    protected DisturbancesType disturbances;

    /**
	 * The cached value of the '{@link #getTakesEffect() <em>Takes Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTakesEffect()
	 * @generated
	 * @ordered
	 */
    protected TakesEffectType takesEffect;

    /**
	 * The cached value of the '{@link #getSideEffects() <em>Side Effects</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSideEffects()
	 * @generated
	 * @ordered
	 */
    protected SideEffectsType sideEffects;

    /**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
    protected PreconditionType precondition;

    /**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
    protected ConditionType condition;

    /**
	 * The cached value of the '{@link #getCounterType() <em>Counter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCounterType()
	 * @generated
	 * @ordered
	 */
    protected CounterTypeType counterType;

    /**
	 * The cached value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
    protected SamplingRateType samplingRate;

    /**
	 * The cached value of the '{@link #getScanner() <em>Scanner</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getScanner()
	 * @generated
	 * @ordered
	 */
    protected ScannerType scanner;

    /**
	 * The cached value of the '{@link #getCounterReset() <em>Counter Reset</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCounterReset()
	 * @generated
	 * @ordered
	 */
    protected CounterResetType counterReset;

    /**
	 * The cached value of the '{@link #getCounterContext() <em>Counter Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCounterContext()
	 * @generated
	 * @ordered
	 */
    protected CounterContextType counterContext;

    /**
	 * The cached value of the '{@link #getGetValue() <em>Get Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGetValue()
	 * @generated
	 * @ordered
	 */
    protected GetValueType getValue;

    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final Object NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected Object name = NAME_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AttributeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getAttributeType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DescriptionType getDescription() {
		return description;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationTagType getApplicationTag() {
		return applicationTag;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetApplicationTag(ApplicationTagType newApplicationTag, NotificationChain msgs) {
		ApplicationTagType oldApplicationTag = applicationTag;
		applicationTag = newApplicationTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApplicationTag(ApplicationTagType newApplicationTag) {
		if (newApplicationTag != applicationTag) {
			NotificationChain msgs = null;
			if (applicationTag != null)
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.ATTRIBUTE_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TransactionRequiredType getTransactionRequired() {
		return transactionRequired;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTransactionRequired(TransactionRequiredType newTransactionRequired, NotificationChain msgs) {
		TransactionRequiredType oldTransactionRequired = transactionRequired;
		transactionRequired = newTransactionRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED, oldTransactionRequired, newTransactionRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTransactionRequired(TransactionRequiredType newTransactionRequired) {
		if (newTransactionRequired != transactionRequired) {
			NotificationChain msgs = null;
			if (transactionRequired != null)
				msgs = ((InternalEObject)transactionRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED, null, msgs);
			if (newTransactionRequired != null)
				msgs = ((InternalEObject)newTransactionRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED, null, msgs);
			msgs = basicSetTransactionRequired(newTransactionRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED, newTransactionRequired, newTransactionRequired));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TransactionConstraintsType getTransactionConstraints() {
		return transactionConstraints;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTransactionConstraints(TransactionConstraintsType newTransactionConstraints, NotificationChain msgs) {
		TransactionConstraintsType oldTransactionConstraints = transactionConstraints;
		transactionConstraints = newTransactionConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS, oldTransactionConstraints, newTransactionConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTransactionConstraints(TransactionConstraintsType newTransactionConstraints) {
		if (newTransactionConstraints != transactionConstraints) {
			NotificationChain msgs = null;
			if (transactionConstraints != null)
				msgs = ((InternalEObject)transactionConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS, null, msgs);
			if (newTransactionConstraints != null)
				msgs = ((InternalEObject)newTransactionConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS, null, msgs);
			msgs = basicSetTransactionConstraints(newTransactionConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS, newTransactionConstraints, newTransactionConstraints));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LocalType getLocal() {
		return local;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLocal(LocalType newLocal, NotificationChain msgs) {
		LocalType oldLocal = local;
		local = newLocal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__LOCAL, oldLocal, newLocal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLocal(LocalType newLocal) {
		if (newLocal != local) {
			NotificationChain msgs = null;
			if (local != null)
				msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__LOCAL, null, msgs);
			if (newLocal != null)
				msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__LOCAL, null, msgs);
			msgs = basicSetLocal(newLocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__LOCAL, newLocal, newLocal));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MandatoryType getMandatory() {
		return mandatory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMandatory(MandatoryType newMandatory, NotificationChain msgs) {
		MandatoryType oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__MANDATORY, oldMandatory, newMandatory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMandatory(MandatoryType newMandatory) {
		if (newMandatory != mandatory) {
			NotificationChain msgs = null;
			if (mandatory != null)
				msgs = ((InternalEObject)mandatory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__MANDATORY, null, msgs);
			if (newMandatory != null)
				msgs = ((InternalEObject)newMandatory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__MANDATORY, null, msgs);
			msgs = basicSetMandatory(newMandatory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__MANDATORY, newMandatory, newMandatory));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IsNillableType getIsNillable() {
		return isNillable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIsNillable(IsNillableType newIsNillable, NotificationChain msgs) {
		IsNillableType oldIsNillable = isNillable;
		isNillable = newIsNillable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE, oldIsNillable, newIsNillable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsNillable(IsNillableType newIsNillable) {
		if (newIsNillable != isNillable) {
			NotificationChain msgs = null;
			if (isNillable != null)
				msgs = ((InternalEObject)isNillable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE, null, msgs);
			if (newIsNillable != null)
				msgs = ((InternalEObject)newIsNillable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE, null, msgs);
			msgs = basicSetIsNillable(newIsNillable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE, newIsNillable, newIsNillable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NoNotificationType getNoNotification() {
		return noNotification;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNoNotification(NoNotificationType newNoNotification, NotificationChain msgs) {
		NoNotificationType oldNoNotification = noNotification;
		noNotification = newNoNotification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION, oldNoNotification, newNoNotification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNoNotification(NoNotificationType newNoNotification) {
		if (newNoNotification != noNotification) {
			NotificationChain msgs = null;
			if (noNotification != null)
				msgs = ((InternalEObject)noNotification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION, null, msgs);
			if (newNoNotification != null)
				msgs = ((InternalEObject)newNoNotification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION, null, msgs);
			msgs = basicSetNoNotification(newNoNotification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION, newNoNotification, newNoNotification));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NonPersistentType getNonPersistent() {
		return nonPersistent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNonPersistent(NonPersistentType newNonPersistent, NotificationChain msgs) {
		NonPersistentType oldNonPersistent = nonPersistent;
		nonPersistent = newNonPersistent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT, oldNonPersistent, newNonPersistent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNonPersistent(NonPersistentType newNonPersistent) {
		if (newNonPersistent != nonPersistent) {
			NotificationChain msgs = null;
			if (nonPersistent != null)
				msgs = ((InternalEObject)nonPersistent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT, null, msgs);
			if (newNonPersistent != null)
				msgs = ((InternalEObject)newNonPersistent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT, null, msgs);
			msgs = basicSetNonPersistent(newNonPersistent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT, newNonPersistent, newNonPersistent));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReadOnlyType getReadOnly() {
		return readOnly;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetReadOnly(ReadOnlyType newReadOnly, NotificationChain msgs) {
		ReadOnlyType oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__READ_ONLY, oldReadOnly, newReadOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReadOnly(ReadOnlyType newReadOnly) {
		if (newReadOnly != readOnly) {
			NotificationChain msgs = null;
			if (readOnly != null)
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__READ_ONLY, newReadOnly, newReadOnly));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RestrictedType getRestricted() {
		return restricted;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRestricted(RestrictedType newRestricted, NotificationChain msgs) {
		RestrictedType oldRestricted = restricted;
		restricted = newRestricted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__RESTRICTED, oldRestricted, newRestricted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRestricted(RestrictedType newRestricted) {
		if (newRestricted != restricted) {
			NotificationChain msgs = null;
			if (restricted != null)
				msgs = ((InternalEObject)restricted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__RESTRICTED, null, msgs);
			if (newRestricted != null)
				msgs = ((InternalEObject)newRestricted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__RESTRICTED, null, msgs);
			msgs = basicSetRestricted(newRestricted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__RESTRICTED, newRestricted, newRestricted));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StaticType getStatic() {
		return static_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetStatic(StaticType newStatic, NotificationChain msgs) {
		StaticType oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__STATIC, oldStatic, newStatic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStatic(StaticType newStatic) {
		if (newStatic != static_) {
			NotificationChain msgs = null;
			if (static_ != null)
				msgs = ((InternalEObject)static_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__STATIC, null, msgs);
			if (newStatic != null)
				msgs = ((InternalEObject)newStatic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__STATIC, null, msgs);
			msgs = basicSetStatic(newStatic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__STATIC, newStatic, newStatic));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UndefinedType getUndefined() {
		return undefined;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUndefined(UndefinedType newUndefined, NotificationChain msgs) {
		UndefinedType oldUndefined = undefined;
		undefined = newUndefined;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__UNDEFINED, oldUndefined, newUndefined);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUndefined(UndefinedType newUndefined) {
		if (newUndefined != undefined) {
			NotificationChain msgs = null;
			if (undefined != null)
				msgs = ((InternalEObject)undefined).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__UNDEFINED, null, msgs);
			if (newUndefined != null)
				msgs = ((InternalEObject)newUndefined).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__UNDEFINED, null, msgs);
			msgs = basicSetUndefined(newUndefined, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__UNDEFINED, newUndefined, newUndefined));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LockBeforeModifyType getLockBeforeModify() {
		return lockBeforeModify;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLockBeforeModify(LockBeforeModifyType newLockBeforeModify, NotificationChain msgs) {
		LockBeforeModifyType oldLockBeforeModify = lockBeforeModify;
		lockBeforeModify = newLockBeforeModify;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY, oldLockBeforeModify, newLockBeforeModify);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLockBeforeModify(LockBeforeModifyType newLockBeforeModify) {
		if (newLockBeforeModify != lockBeforeModify) {
			NotificationChain msgs = null;
			if (lockBeforeModify != null)
				msgs = ((InternalEObject)lockBeforeModify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY, null, msgs);
			if (newLockBeforeModify != null)
				msgs = ((InternalEObject)newLockBeforeModify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY, null, msgs);
			msgs = basicSetLockBeforeModify(newLockBeforeModify, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY, newLockBeforeModify, newLockBeforeModify));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValidationRulesType getValidationRules() {
		return validationRules;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetValidationRules(ValidationRulesType newValidationRules, NotificationChain msgs) {
		ValidationRulesType oldValidationRules = validationRules;
		validationRules = newValidationRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES, oldValidationRules, newValidationRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValidationRules(ValidationRulesType newValidationRules) {
		if (newValidationRules != validationRules) {
			NotificationChain msgs = null;
			if (validationRules != null)
				msgs = ((InternalEObject)validationRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES, null, msgs);
			if (newValidationRules != null)
				msgs = ((InternalEObject)newValidationRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES, null, msgs);
			msgs = basicSetValidationRules(newValidationRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES, newValidationRules, newValidationRules));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RestartTypeType getRestartType() {
		return restartType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRestartType(RestartTypeType newRestartType, NotificationChain msgs) {
		RestartTypeType oldRestartType = restartType;
		restartType = newRestartType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE, oldRestartType, newRestartType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRestartType(RestartTypeType newRestartType) {
		if (newRestartType != restartType) {
			NotificationChain msgs = null;
			if (restartType != null)
				msgs = ((InternalEObject)restartType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE, null, msgs);
			if (newRestartType != null)
				msgs = ((InternalEObject)newRestartType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE, null, msgs);
			msgs = basicSetRestartType(newRestartType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE, newRestartType, newRestartType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IndexedType getIndexed() {
		return indexed;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIndexed(IndexedType newIndexed, NotificationChain msgs) {
		IndexedType oldIndexed = indexed;
		indexed = newIndexed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__INDEXED, oldIndexed, newIndexed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIndexed(IndexedType newIndexed) {
		if (newIndexed != indexed) {
			NotificationChain msgs = null;
			if (indexed != null)
				msgs = ((InternalEObject)indexed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__INDEXED, null, msgs);
			if (newIndexed != null)
				msgs = ((InternalEObject)newIndexed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__INDEXED, null, msgs);
			msgs = basicSetIndexed(newIndexed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__INDEXED, newIndexed, newIndexed));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KeyType getKey() {
		return key;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetKey(KeyType newKey, NotificationChain msgs) {
		KeyType oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setKey(KeyType newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__KEY, newKey, newKey));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeType getDataType() {
		return dataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataType(DataTypeType newDataType, NotificationChain msgs) {
		DataTypeType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataType(DataTypeType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DATA_TYPE, newDataType, newDataType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeprecatedType getDeprecated() {
		return deprecated;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDeprecated(DeprecatedType newDeprecated, NotificationChain msgs) {
		DeprecatedType oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DEPRECATED, oldDeprecated, newDeprecated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDeprecated(DeprecatedType newDeprecated) {
		if (newDeprecated != deprecated) {
			NotificationChain msgs = null;
			if (deprecated != null)
				msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DEPRECATED, null, msgs);
			if (newDeprecated != null)
				msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DEPRECATED, null, msgs);
			msgs = basicSetDeprecated(newDeprecated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DEPRECATED, newDeprecated, newDeprecated));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ObsoleteType getObsolete() {
		return obsolete;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetObsolete(ObsoleteType newObsolete, NotificationChain msgs) {
		ObsoleteType oldObsolete = obsolete;
		obsolete = newObsolete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__OBSOLETE, oldObsolete, newObsolete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setObsolete(ObsoleteType newObsolete) {
		if (newObsolete != obsolete) {
			NotificationChain msgs = null;
			if (obsolete != null)
				msgs = ((InternalEObject)obsolete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__OBSOLETE, null, msgs);
			if (newObsolete != null)
				msgs = ((InternalEObject)newObsolete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__OBSOLETE, null, msgs);
			msgs = basicSetObsolete(newObsolete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__OBSOLETE, newObsolete, newObsolete));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PreliminaryType getPreliminary() {
		return preliminary;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetPreliminary(PreliminaryType newPreliminary, NotificationChain msgs) {
		PreliminaryType oldPreliminary = preliminary;
		preliminary = newPreliminary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__PRELIMINARY, oldPreliminary, newPreliminary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPreliminary(PreliminaryType newPreliminary) {
		if (newPreliminary != preliminary) {
			NotificationChain msgs = null;
			if (preliminary != null)
				msgs = ((InternalEObject)preliminary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__PRELIMINARY, null, msgs);
			if (newPreliminary != null)
				msgs = ((InternalEObject)newPreliminary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__PRELIMINARY, null, msgs);
			msgs = basicSetPreliminary(newPreliminary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__PRELIMINARY, newPreliminary, newPreliminary));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatusInformationType getStatusInformation() {
		return statusInformation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetStatusInformation(StatusInformationType newStatusInformation, NotificationChain msgs) {
		StatusInformationType oldStatusInformation = statusInformation;
		statusInformation = newStatusInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION, oldStatusInformation, newStatusInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStatusInformation(StatusInformationType newStatusInformation) {
		if (newStatusInformation != statusInformation) {
			NotificationChain msgs = null;
			if (statusInformation != null)
				msgs = ((InternalEObject)statusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION, null, msgs);
			if (newStatusInformation != null)
				msgs = ((InternalEObject)newStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION, null, msgs);
			msgs = basicSetStatusInformation(newStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION, newStatusInformation, newStatusInformation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VisibilityType getVisibility() {
		return visibility;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetVisibility(VisibilityType newVisibility, NotificationChain msgs) {
		VisibilityType oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__VISIBILITY, oldVisibility, newVisibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVisibility(VisibilityType newVisibility) {
		if (newVisibility != visibility) {
			NotificationChain msgs = null;
			if (visibility != null)
				msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__VISIBILITY, null, msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__VISIBILITY, null, msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__VISIBILITY, newVisibility, newVisibility));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FilterType getFilter() {
		return filter;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		FilterType oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFilter(FilterType newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__FILTER, newFilter, newFilter));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DependenciesType getDependencies() {
		return dependencies;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDependencies(DependenciesType newDependencies, NotificationChain msgs) {
		DependenciesType oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDependencies(DependenciesType newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES, newDependencies, newDependencies));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DependenciesScriptType getDependenciesScript() {
		return dependenciesScript;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDependenciesScript(DependenciesScriptType newDependenciesScript, NotificationChain msgs) {
		DependenciesScriptType oldDependenciesScript = dependenciesScript;
		dependenciesScript = newDependenciesScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT, oldDependenciesScript, newDependenciesScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDependenciesScript(DependenciesScriptType newDependenciesScript) {
		if (newDependenciesScript != dependenciesScript) {
			NotificationChain msgs = null;
			if (dependenciesScript != null)
				msgs = ((InternalEObject)dependenciesScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			if (newDependenciesScript != null)
				msgs = ((InternalEObject)newDependenciesScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			msgs = basicSetDependenciesScript(newDependenciesScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT, newDependenciesScript, newDependenciesScript));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureType getFeature() {
		return feature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFeature(FeatureType newFeature, NotificationChain msgs) {
		FeatureType oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__FEATURE, oldFeature, newFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFeature(FeatureType newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__FEATURE, newFeature, newFeature));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SpecificationType getSpecification() {
		return specification;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSpecification(SpecificationType newSpecification, NotificationChain msgs) {
		SpecificationType oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSpecification(SpecificationType newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SPECIFICATION, newSpecification, newSpecification));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InterfaceOnlyType getInterfaceOnly() {
		return interfaceOnly;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInterfaceOnly(InterfaceOnlyType newInterfaceOnly, NotificationChain msgs) {
		InterfaceOnlyType oldInterfaceOnly = interfaceOnly;
		interfaceOnly = newInterfaceOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY, oldInterfaceOnly, newInterfaceOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInterfaceOnly(InterfaceOnlyType newInterfaceOnly) {
		if (newInterfaceOnly != interfaceOnly) {
			NotificationChain msgs = null;
			if (interfaceOnly != null)
				msgs = ((InternalEObject)interfaceOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY, null, msgs);
			if (newInterfaceOnly != null)
				msgs = ((InternalEObject)newInterfaceOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY, null, msgs);
			msgs = basicSetInterfaceOnly(newInterfaceOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY, newInterfaceOnly, newInterfaceOnly));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DecisionPointType getDecisionPoint() {
		return decisionPoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDecisionPoint(DecisionPointType newDecisionPoint, NotificationChain msgs) {
		DecisionPointType oldDecisionPoint = decisionPoint;
		decisionPoint = newDecisionPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DECISION_POINT, oldDecisionPoint, newDecisionPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDecisionPoint(DecisionPointType newDecisionPoint) {
		if (newDecisionPoint != decisionPoint) {
			NotificationChain msgs = null;
			if (decisionPoint != null)
				msgs = ((InternalEObject)decisionPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DECISION_POINT, null, msgs);
			if (newDecisionPoint != null)
				msgs = ((InternalEObject)newDecisionPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DECISION_POINT, null, msgs);
			msgs = basicSetDecisionPoint(newDecisionPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DECISION_POINT, newDecisionPoint, newDecisionPoint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DisturbancesType getDisturbances() {
		return disturbances;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDisturbances(DisturbancesType newDisturbances, NotificationChain msgs) {
		DisturbancesType oldDisturbances = disturbances;
		disturbances = newDisturbances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DISTURBANCES, oldDisturbances, newDisturbances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDisturbances(DisturbancesType newDisturbances) {
		if (newDisturbances != disturbances) {
			NotificationChain msgs = null;
			if (disturbances != null)
				msgs = ((InternalEObject)disturbances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DISTURBANCES, null, msgs);
			if (newDisturbances != null)
				msgs = ((InternalEObject)newDisturbances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__DISTURBANCES, null, msgs);
			msgs = basicSetDisturbances(newDisturbances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__DISTURBANCES, newDisturbances, newDisturbances));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TakesEffectType getTakesEffect() {
		return takesEffect;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTakesEffect(TakesEffectType newTakesEffect, NotificationChain msgs) {
		TakesEffectType oldTakesEffect = takesEffect;
		takesEffect = newTakesEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT, oldTakesEffect, newTakesEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTakesEffect(TakesEffectType newTakesEffect) {
		if (newTakesEffect != takesEffect) {
			NotificationChain msgs = null;
			if (takesEffect != null)
				msgs = ((InternalEObject)takesEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT, null, msgs);
			if (newTakesEffect != null)
				msgs = ((InternalEObject)newTakesEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT, null, msgs);
			msgs = basicSetTakesEffect(newTakesEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT, newTakesEffect, newTakesEffect));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SideEffectsType getSideEffects() {
		return sideEffects;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSideEffects(SideEffectsType newSideEffects, NotificationChain msgs) {
		SideEffectsType oldSideEffects = sideEffects;
		sideEffects = newSideEffects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS, oldSideEffects, newSideEffects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSideEffects(SideEffectsType newSideEffects) {
		if (newSideEffects != sideEffects) {
			NotificationChain msgs = null;
			if (sideEffects != null)
				msgs = ((InternalEObject)sideEffects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS, null, msgs);
			if (newSideEffects != null)
				msgs = ((InternalEObject)newSideEffects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS, null, msgs);
			msgs = basicSetSideEffects(newSideEffects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS, newSideEffects, newSideEffects));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PreconditionType getPrecondition() {
		return precondition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetPrecondition(PreconditionType newPrecondition, NotificationChain msgs) {
		PreconditionType oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPrecondition(PreconditionType newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__PRECONDITION, newPrecondition, newPrecondition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConditionType getCondition() {
		return condition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCondition(ConditionType newCondition, NotificationChain msgs) {
		ConditionType oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCondition(ConditionType newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__CONDITION, newCondition, newCondition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CounterTypeType getCounterType() {
		return counterType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCounterType(CounterTypeType newCounterType, NotificationChain msgs) {
		CounterTypeType oldCounterType = counterType;
		counterType = newCounterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE, oldCounterType, newCounterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCounterType(CounterTypeType newCounterType) {
		if (newCounterType != counterType) {
			NotificationChain msgs = null;
			if (counterType != null)
				msgs = ((InternalEObject)counterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE, null, msgs);
			if (newCounterType != null)
				msgs = ((InternalEObject)newCounterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE, null, msgs);
			msgs = basicSetCounterType(newCounterType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE, newCounterType, newCounterType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SamplingRateType getSamplingRate() {
		return samplingRate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSamplingRate(SamplingRateType newSamplingRate, NotificationChain msgs) {
		SamplingRateType oldSamplingRate = samplingRate;
		samplingRate = newSamplingRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE, oldSamplingRate, newSamplingRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSamplingRate(SamplingRateType newSamplingRate) {
		if (newSamplingRate != samplingRate) {
			NotificationChain msgs = null;
			if (samplingRate != null)
				msgs = ((InternalEObject)samplingRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE, null, msgs);
			if (newSamplingRate != null)
				msgs = ((InternalEObject)newSamplingRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE, null, msgs);
			msgs = basicSetSamplingRate(newSamplingRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE, newSamplingRate, newSamplingRate));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScannerType getScanner() {
		return scanner;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetScanner(ScannerType newScanner, NotificationChain msgs) {
		ScannerType oldScanner = scanner;
		scanner = newScanner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SCANNER, oldScanner, newScanner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setScanner(ScannerType newScanner) {
		if (newScanner != scanner) {
			NotificationChain msgs = null;
			if (scanner != null)
				msgs = ((InternalEObject)scanner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SCANNER, null, msgs);
			if (newScanner != null)
				msgs = ((InternalEObject)newScanner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__SCANNER, null, msgs);
			msgs = basicSetScanner(newScanner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__SCANNER, newScanner, newScanner));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CounterResetType getCounterReset() {
		return counterReset;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCounterReset(CounterResetType newCounterReset, NotificationChain msgs) {
		CounterResetType oldCounterReset = counterReset;
		counterReset = newCounterReset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET, oldCounterReset, newCounterReset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCounterReset(CounterResetType newCounterReset) {
		if (newCounterReset != counterReset) {
			NotificationChain msgs = null;
			if (counterReset != null)
				msgs = ((InternalEObject)counterReset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET, null, msgs);
			if (newCounterReset != null)
				msgs = ((InternalEObject)newCounterReset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET, null, msgs);
			msgs = basicSetCounterReset(newCounterReset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET, newCounterReset, newCounterReset));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CounterContextType getCounterContext() {
		return counterContext;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCounterContext(CounterContextType newCounterContext, NotificationChain msgs) {
		CounterContextType oldCounterContext = counterContext;
		counterContext = newCounterContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT, oldCounterContext, newCounterContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCounterContext(CounterContextType newCounterContext) {
		if (newCounterContext != counterContext) {
			NotificationChain msgs = null;
			if (counterContext != null)
				msgs = ((InternalEObject)counterContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT, null, msgs);
			if (newCounterContext != null)
				msgs = ((InternalEObject)newCounterContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT, null, msgs);
			msgs = basicSetCounterContext(newCounterContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT, newCounterContext, newCounterContext));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GetValueType getGetValue() {
		return getValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGetValue(GetValueType newGetValue, NotificationChain msgs) {
		GetValueType oldGetValue = getValue;
		getValue = newGetValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__GET_VALUE, oldGetValue, newGetValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGetValue(GetValueType newGetValue) {
		if (newGetValue != getValue) {
			NotificationChain msgs = null;
			if (getValue != null)
				msgs = ((InternalEObject)getValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__GET_VALUE, null, msgs);
			if (newGetValue != null)
				msgs = ((InternalEObject)newGetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ATTRIBUTE_TYPE__GET_VALUE, null, msgs);
			msgs = basicSetGetValue(newGetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__GET_VALUE, newGetValue, newGetValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ATTRIBUTE_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED:
				return basicSetTransactionRequired(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS:
				return basicSetTransactionConstraints(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__LOCAL:
				return basicSetLocal(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__MANDATORY:
				return basicSetMandatory(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION:
				return basicSetNoNotification(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				return basicSetNonPersistent(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__RESTRICTED:
				return basicSetRestricted(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__STATIC:
				return basicSetStatic(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__UNDEFINED:
				return basicSetUndefined(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY:
				return basicSetLockBeforeModify(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES:
				return basicSetValidationRules(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE:
				return basicSetRestartType(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__INDEXED:
				return basicSetIndexed(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__KEY:
				return basicSetKey(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE:
				return basicSetIsNillable(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__DEPRECATED:
				return basicSetDeprecated(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__OBSOLETE:
				return basicSetObsolete(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__PRELIMINARY:
				return basicSetPreliminary(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION:
				return basicSetStatusInformation(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__VISIBILITY:
				return basicSetVisibility(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__FILTER:
				return basicSetFilter(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT:
				return basicSetDependenciesScript(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__FEATURE:
				return basicSetFeature(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY:
				return basicSetInterfaceOnly(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__DECISION_POINT:
				return basicSetDecisionPoint(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__DISTURBANCES:
				return basicSetDisturbances(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT:
				return basicSetTakesEffect(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS:
				return basicSetSideEffects(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__CONDITION:
				return basicSetCondition(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE:
				return basicSetCounterType(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE:
				return basicSetSamplingRate(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__SCANNER:
				return basicSetScanner(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET:
				return basicSetCounterReset(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT:
				return basicSetCounterContext(null, msgs);
			case MpPackage.ATTRIBUTE_TYPE__GET_VALUE:
				return basicSetGetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MpPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.ATTRIBUTE_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED:
				return getTransactionRequired();
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS:
				return getTransactionConstraints();
			case MpPackage.ATTRIBUTE_TYPE__LOCAL:
				return getLocal();
			case MpPackage.ATTRIBUTE_TYPE__MANDATORY:
				return getMandatory();
			case MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION:
				return getNoNotification();
			case MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				return getNonPersistent();
			case MpPackage.ATTRIBUTE_TYPE__READ_ONLY:
				return getReadOnly();
			case MpPackage.ATTRIBUTE_TYPE__RESTRICTED:
				return getRestricted();
			case MpPackage.ATTRIBUTE_TYPE__STATIC:
				return getStatic();
			case MpPackage.ATTRIBUTE_TYPE__UNDEFINED:
				return getUndefined();
			case MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY:
				return getLockBeforeModify();
			case MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES:
				return getValidationRules();
			case MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE:
				return getRestartType();
			case MpPackage.ATTRIBUTE_TYPE__INDEXED:
				return getIndexed();
			case MpPackage.ATTRIBUTE_TYPE__KEY:
				return getKey();
			case MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE:
				return getIsNillable();
			case MpPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				return getDataType();
			case MpPackage.ATTRIBUTE_TYPE__DEPRECATED:
				return getDeprecated();
			case MpPackage.ATTRIBUTE_TYPE__OBSOLETE:
				return getObsolete();
			case MpPackage.ATTRIBUTE_TYPE__PRELIMINARY:
				return getPreliminary();
			case MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION:
				return getStatusInformation();
			case MpPackage.ATTRIBUTE_TYPE__VISIBILITY:
				return getVisibility();
			case MpPackage.ATTRIBUTE_TYPE__FILTER:
				return getFilter();
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES:
				return getDependencies();
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT:
				return getDependenciesScript();
			case MpPackage.ATTRIBUTE_TYPE__FEATURE:
				return getFeature();
			case MpPackage.ATTRIBUTE_TYPE__SPECIFICATION:
				return getSpecification();
			case MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY:
				return getInterfaceOnly();
			case MpPackage.ATTRIBUTE_TYPE__DECISION_POINT:
				return getDecisionPoint();
			case MpPackage.ATTRIBUTE_TYPE__DISTURBANCES:
				return getDisturbances();
			case MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT:
				return getTakesEffect();
			case MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS:
				return getSideEffects();
			case MpPackage.ATTRIBUTE_TYPE__PRECONDITION:
				return getPrecondition();
			case MpPackage.ATTRIBUTE_TYPE__CONDITION:
				return getCondition();
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE:
				return getCounterType();
			case MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE:
				return getSamplingRate();
			case MpPackage.ATTRIBUTE_TYPE__SCANNER:
				return getScanner();
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET:
				return getCounterReset();
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT:
				return getCounterContext();
			case MpPackage.ATTRIBUTE_TYPE__GET_VALUE:
				return getGetValue();
			case MpPackage.ATTRIBUTE_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED:
				setTransactionRequired((TransactionRequiredType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS:
				setTransactionConstraints((TransactionConstraintsType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__LOCAL:
				setLocal((LocalType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__MANDATORY:
				setMandatory((MandatoryType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION:
				setNoNotification((NoNotificationType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				setNonPersistent((NonPersistentType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__READ_ONLY:
				setReadOnly((ReadOnlyType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__RESTRICTED:
				setRestricted((RestrictedType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__STATIC:
				setStatic((StaticType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__UNDEFINED:
				setUndefined((UndefinedType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY:
				setLockBeforeModify((LockBeforeModifyType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE:
				setRestartType((RestartTypeType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__INDEXED:
				setIndexed((IndexedType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__KEY:
				setKey((KeyType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE:
				setIsNillable((IsNillableType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__VISIBILITY:
				setVisibility((VisibilityType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__FILTER:
				setFilter((FilterType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__FEATURE:
				setFeature((FeatureType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DISTURBANCES:
				setDisturbances((DisturbancesType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT:
				setTakesEffect((TakesEffectType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS:
				setSideEffects((SideEffectsType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__CONDITION:
				setCondition((ConditionType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE:
				setCounterType((CounterTypeType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE:
				setSamplingRate((SamplingRateType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SCANNER:
				setScanner((ScannerType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET:
				setCounterReset((CounterResetType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT:
				setCounterContext((CounterContextType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__GET_VALUE:
				setGetValue((GetValueType)newValue);
				return;
			case MpPackage.ATTRIBUTE_TYPE__NAME:
				setName(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case MpPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED:
				setTransactionRequired((TransactionRequiredType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS:
				setTransactionConstraints((TransactionConstraintsType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__LOCAL:
				setLocal((LocalType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__MANDATORY:
				setMandatory((MandatoryType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION:
				setNoNotification((NoNotificationType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				setNonPersistent((NonPersistentType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__READ_ONLY:
				setReadOnly((ReadOnlyType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__RESTRICTED:
				setRestricted((RestrictedType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__STATIC:
				setStatic((StaticType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__UNDEFINED:
				setUndefined((UndefinedType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY:
				setLockBeforeModify((LockBeforeModifyType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE:
				setRestartType((RestartTypeType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__INDEXED:
				setIndexed((IndexedType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__KEY:
				setKey((KeyType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE:
				setIsNillable((IsNillableType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__VISIBILITY:
				setVisibility((VisibilityType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__FILTER:
				setFilter((FilterType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__FEATURE:
				setFeature((FeatureType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__DISTURBANCES:
				setDisturbances((DisturbancesType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT:
				setTakesEffect((TakesEffectType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS:
				setSideEffects((SideEffectsType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__CONDITION:
				setCondition((ConditionType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE:
				setCounterType((CounterTypeType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE:
				setSamplingRate((SamplingRateType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__SCANNER:
				setScanner((ScannerType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET:
				setCounterReset((CounterResetType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT:
				setCounterContext((CounterContextType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__GET_VALUE:
				setGetValue((GetValueType)null);
				return;
			case MpPackage.ATTRIBUTE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MpPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.ATTRIBUTE_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.ATTRIBUTE_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_REQUIRED:
				return transactionRequired != null;
			case MpPackage.ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS:
				return transactionConstraints != null;
			case MpPackage.ATTRIBUTE_TYPE__LOCAL:
				return local != null;
			case MpPackage.ATTRIBUTE_TYPE__MANDATORY:
				return mandatory != null;
			case MpPackage.ATTRIBUTE_TYPE__NO_NOTIFICATION:
				return noNotification != null;
			case MpPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				return nonPersistent != null;
			case MpPackage.ATTRIBUTE_TYPE__READ_ONLY:
				return readOnly != null;
			case MpPackage.ATTRIBUTE_TYPE__RESTRICTED:
				return restricted != null;
			case MpPackage.ATTRIBUTE_TYPE__STATIC:
				return static_ != null;
			case MpPackage.ATTRIBUTE_TYPE__UNDEFINED:
				return undefined != null;
			case MpPackage.ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY:
				return lockBeforeModify != null;
			case MpPackage.ATTRIBUTE_TYPE__VALIDATION_RULES:
				return validationRules != null;
			case MpPackage.ATTRIBUTE_TYPE__RESTART_TYPE:
				return restartType != null;
			case MpPackage.ATTRIBUTE_TYPE__INDEXED:
				return indexed != null;
			case MpPackage.ATTRIBUTE_TYPE__KEY:
				return key != null;
			case MpPackage.ATTRIBUTE_TYPE__IS_NILLABLE:
				return isNillable != null;
			case MpPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				return dataType != null;
			case MpPackage.ATTRIBUTE_TYPE__DEPRECATED:
				return deprecated != null;
			case MpPackage.ATTRIBUTE_TYPE__OBSOLETE:
				return obsolete != null;
			case MpPackage.ATTRIBUTE_TYPE__PRELIMINARY:
				return preliminary != null;
			case MpPackage.ATTRIBUTE_TYPE__STATUS_INFORMATION:
				return statusInformation != null;
			case MpPackage.ATTRIBUTE_TYPE__VISIBILITY:
				return visibility != null;
			case MpPackage.ATTRIBUTE_TYPE__FILTER:
				return filter != null;
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES:
				return dependencies != null;
			case MpPackage.ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT:
				return dependenciesScript != null;
			case MpPackage.ATTRIBUTE_TYPE__FEATURE:
				return feature != null;
			case MpPackage.ATTRIBUTE_TYPE__SPECIFICATION:
				return specification != null;
			case MpPackage.ATTRIBUTE_TYPE__INTERFACE_ONLY:
				return interfaceOnly != null;
			case MpPackage.ATTRIBUTE_TYPE__DECISION_POINT:
				return decisionPoint != null;
			case MpPackage.ATTRIBUTE_TYPE__DISTURBANCES:
				return disturbances != null;
			case MpPackage.ATTRIBUTE_TYPE__TAKES_EFFECT:
				return takesEffect != null;
			case MpPackage.ATTRIBUTE_TYPE__SIDE_EFFECTS:
				return sideEffects != null;
			case MpPackage.ATTRIBUTE_TYPE__PRECONDITION:
				return precondition != null;
			case MpPackage.ATTRIBUTE_TYPE__CONDITION:
				return condition != null;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_TYPE:
				return counterType != null;
			case MpPackage.ATTRIBUTE_TYPE__SAMPLING_RATE:
				return samplingRate != null;
			case MpPackage.ATTRIBUTE_TYPE__SCANNER:
				return scanner != null;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_RESET:
				return counterReset != null;
			case MpPackage.ATTRIBUTE_TYPE__COUNTER_CONTEXT:
				return counterContext != null;
			case MpPackage.ATTRIBUTE_TYPE__GET_VALUE:
				return getValue != null;
			case MpPackage.ATTRIBUTE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AttributeTypeImpl
