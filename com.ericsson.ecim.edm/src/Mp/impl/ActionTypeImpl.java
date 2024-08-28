/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ActionType;
import Mp.ApplicationTagType;
import Mp.DecisionPointType;
import Mp.DependenciesScriptType;
import Mp.DependenciesType;
import Mp.DeprecatedType;
import Mp.DescriptionType;
import Mp.DisturbancesType;
import Mp.DomainExtensionType;
import Mp.FeatureType;
import Mp.FilterType;
import Mp.InterfaceOnlyType;
import Mp.LockBeforeExecuteType;
import Mp.MpPackage;
import Mp.ObsoleteType;
import Mp.ParameterType;
import Mp.PreconditionType;
import Mp.PreliminaryType;
import Mp.RaisesExceptionType;
import Mp.ReturnTypeType;
import Mp.SideEffectsType;
import Mp.SpecificationType;
import Mp.StatusInformationType;
import Mp.TakesEffectType;
import Mp.TransactionConstraintsType;
import Mp.TransactionRequiredType;
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
 * An implementation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ActionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getRaisesException <em>Raises Exception</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getLockBeforeExecute <em>Lock Before Execute</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getTransactionRequired <em>Transaction Required</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getTransactionConstraints <em>Transaction Constraints</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getDisturbances <em>Disturbances</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getSideEffects <em>Side Effects</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.impl.ActionTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionTypeImpl extends EObjectImpl implements ActionType {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
    protected ReturnTypeType returnType;

    /**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
    protected EList<ParameterType> parameter;

    /**
	 * The cached value of the '{@link #getRaisesException() <em>Raises Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRaisesException()
	 * @generated
	 * @ordered
	 */
    protected EList<RaisesExceptionType> raisesException;

    /**
	 * The cached value of the '{@link #getLockBeforeExecute() <em>Lock Before Execute</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLockBeforeExecute()
	 * @generated
	 * @ordered
	 */
    protected LockBeforeExecuteType lockBeforeExecute;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ActionTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getActionType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
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
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.ACTION_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReturnTypeType getReturnType() {
		return returnType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetReturnType(ReturnTypeType newReturnType, NotificationChain msgs) {
		ReturnTypeType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReturnType(ReturnTypeType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__RETURN_TYPE, newReturnType, newReturnType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ParameterType> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, MpPackage.ACTION_TYPE__PARAMETER);
		}
		return parameter;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RaisesExceptionType> getRaisesException() {
		if (raisesException == null) {
			raisesException = new EObjectContainmentEList<RaisesExceptionType>(RaisesExceptionType.class, this, MpPackage.ACTION_TYPE__RAISES_EXCEPTION);
		}
		return raisesException;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LockBeforeExecuteType getLockBeforeExecute() {
		return lockBeforeExecute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLockBeforeExecute(LockBeforeExecuteType newLockBeforeExecute, NotificationChain msgs) {
		LockBeforeExecuteType oldLockBeforeExecute = lockBeforeExecute;
		lockBeforeExecute = newLockBeforeExecute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE, oldLockBeforeExecute, newLockBeforeExecute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLockBeforeExecute(LockBeforeExecuteType newLockBeforeExecute) {
		if (newLockBeforeExecute != lockBeforeExecute) {
			NotificationChain msgs = null;
			if (lockBeforeExecute != null)
				msgs = ((InternalEObject)lockBeforeExecute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE, null, msgs);
			if (newLockBeforeExecute != null)
				msgs = ((InternalEObject)newLockBeforeExecute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE, null, msgs);
			msgs = basicSetLockBeforeExecute(newLockBeforeExecute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE, newLockBeforeExecute, newLockBeforeExecute));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__VALIDATION_RULES, oldValidationRules, newValidationRules);
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
				msgs = ((InternalEObject)validationRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__VALIDATION_RULES, null, msgs);
			if (newValidationRules != null)
				msgs = ((InternalEObject)newValidationRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__VALIDATION_RULES, null, msgs);
			msgs = basicSetValidationRules(newValidationRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__VALIDATION_RULES, newValidationRules, newValidationRules));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED, oldTransactionRequired, newTransactionRequired);
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
				msgs = ((InternalEObject)transactionRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED, null, msgs);
			if (newTransactionRequired != null)
				msgs = ((InternalEObject)newTransactionRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED, null, msgs);
			msgs = basicSetTransactionRequired(newTransactionRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED, newTransactionRequired, newTransactionRequired));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS, oldTransactionConstraints, newTransactionConstraints);
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
				msgs = ((InternalEObject)transactionConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS, null, msgs);
			if (newTransactionConstraints != null)
				msgs = ((InternalEObject)newTransactionConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS, null, msgs);
			msgs = basicSetTransactionConstraints(newTransactionConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS, newTransactionConstraints, newTransactionConstraints));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DEPRECATED, oldDeprecated, newDeprecated);
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
				msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DEPRECATED, null, msgs);
			if (newDeprecated != null)
				msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DEPRECATED, null, msgs);
			msgs = basicSetDeprecated(newDeprecated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DEPRECATED, newDeprecated, newDeprecated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__OBSOLETE, oldObsolete, newObsolete);
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
				msgs = ((InternalEObject)obsolete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__OBSOLETE, null, msgs);
			if (newObsolete != null)
				msgs = ((InternalEObject)newObsolete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__OBSOLETE, null, msgs);
			msgs = basicSetObsolete(newObsolete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__OBSOLETE, newObsolete, newObsolete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__PRELIMINARY, oldPreliminary, newPreliminary);
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
				msgs = ((InternalEObject)preliminary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__PRELIMINARY, null, msgs);
			if (newPreliminary != null)
				msgs = ((InternalEObject)newPreliminary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__PRELIMINARY, null, msgs);
			msgs = basicSetPreliminary(newPreliminary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__PRELIMINARY, newPreliminary, newPreliminary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__STATUS_INFORMATION, oldStatusInformation, newStatusInformation);
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
				msgs = ((InternalEObject)statusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__STATUS_INFORMATION, null, msgs);
			if (newStatusInformation != null)
				msgs = ((InternalEObject)newStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__STATUS_INFORMATION, null, msgs);
			msgs = basicSetStatusInformation(newStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__STATUS_INFORMATION, newStatusInformation, newStatusInformation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__VISIBILITY, oldVisibility, newVisibility);
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
				msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__VISIBILITY, null, msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__VISIBILITY, null, msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__VISIBILITY, newVisibility, newVisibility));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__FILTER, oldFilter, newFilter);
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
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__FILTER, newFilter, newFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
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
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DEPENDENCIES, newDependencies, newDependencies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT, oldDependenciesScript, newDependenciesScript);
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
				msgs = ((InternalEObject)dependenciesScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			if (newDependenciesScript != null)
				msgs = ((InternalEObject)newDependenciesScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			msgs = basicSetDependenciesScript(newDependenciesScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT, newDependenciesScript, newDependenciesScript));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__FEATURE, oldFeature, newFeature);
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
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__FEATURE, newFeature, newFeature));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__SPECIFICATION, newSpecification, newSpecification));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__INTERFACE_ONLY, oldInterfaceOnly, newInterfaceOnly);
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
				msgs = ((InternalEObject)interfaceOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__INTERFACE_ONLY, null, msgs);
			if (newInterfaceOnly != null)
				msgs = ((InternalEObject)newInterfaceOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__INTERFACE_ONLY, null, msgs);
			msgs = basicSetInterfaceOnly(newInterfaceOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__INTERFACE_ONLY, newInterfaceOnly, newInterfaceOnly));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DECISION_POINT, oldDecisionPoint, newDecisionPoint);
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
				msgs = ((InternalEObject)decisionPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DECISION_POINT, null, msgs);
			if (newDecisionPoint != null)
				msgs = ((InternalEObject)newDecisionPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DECISION_POINT, null, msgs);
			msgs = basicSetDecisionPoint(newDecisionPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DECISION_POINT, newDecisionPoint, newDecisionPoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DISTURBANCES, oldDisturbances, newDisturbances);
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
				msgs = ((InternalEObject)disturbances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DISTURBANCES, null, msgs);
			if (newDisturbances != null)
				msgs = ((InternalEObject)newDisturbances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__DISTURBANCES, null, msgs);
			msgs = basicSetDisturbances(newDisturbances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__DISTURBANCES, newDisturbances, newDisturbances));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__TAKES_EFFECT, oldTakesEffect, newTakesEffect);
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
				msgs = ((InternalEObject)takesEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__TAKES_EFFECT, null, msgs);
			if (newTakesEffect != null)
				msgs = ((InternalEObject)newTakesEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__TAKES_EFFECT, null, msgs);
			msgs = basicSetTakesEffect(newTakesEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__TAKES_EFFECT, newTakesEffect, newTakesEffect));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__SIDE_EFFECTS, oldSideEffects, newSideEffects);
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
				msgs = ((InternalEObject)sideEffects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__SIDE_EFFECTS, null, msgs);
			if (newSideEffects != null)
				msgs = ((InternalEObject)newSideEffects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__SIDE_EFFECTS, null, msgs);
			msgs = basicSetSideEffects(newSideEffects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__SIDE_EFFECTS, newSideEffects, newSideEffects));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__PRECONDITION, oldPrecondition, newPrecondition);
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
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ACTION_TYPE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__PRECONDITION, newPrecondition, newPrecondition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ACTION_TYPE__NAME, oldName, name));
	}

    /**
     * <!-- begin-user-doc -->
     * Returns the id for this action. Used to populate the CoreMW administrative operation id.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public int getId(String containerName) {
        int strHashCode = (containerName+getName()).hashCode();
        return Math.abs((short) (strHashCode ^ (strHashCode >>> 16)));
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.ACTION_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.ACTION_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.ACTION_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.ACTION_TYPE__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case MpPackage.ACTION_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case MpPackage.ACTION_TYPE__RAISES_EXCEPTION:
				return ((InternalEList<?>)getRaisesException()).basicRemove(otherEnd, msgs);
			case MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE:
				return basicSetLockBeforeExecute(null, msgs);
			case MpPackage.ACTION_TYPE__VALIDATION_RULES:
				return basicSetValidationRules(null, msgs);
			case MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED:
				return basicSetTransactionRequired(null, msgs);
			case MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS:
				return basicSetTransactionConstraints(null, msgs);
			case MpPackage.ACTION_TYPE__DEPRECATED:
				return basicSetDeprecated(null, msgs);
			case MpPackage.ACTION_TYPE__OBSOLETE:
				return basicSetObsolete(null, msgs);
			case MpPackage.ACTION_TYPE__PRELIMINARY:
				return basicSetPreliminary(null, msgs);
			case MpPackage.ACTION_TYPE__STATUS_INFORMATION:
				return basicSetStatusInformation(null, msgs);
			case MpPackage.ACTION_TYPE__VISIBILITY:
				return basicSetVisibility(null, msgs);
			case MpPackage.ACTION_TYPE__FILTER:
				return basicSetFilter(null, msgs);
			case MpPackage.ACTION_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT:
				return basicSetDependenciesScript(null, msgs);
			case MpPackage.ACTION_TYPE__FEATURE:
				return basicSetFeature(null, msgs);
			case MpPackage.ACTION_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case MpPackage.ACTION_TYPE__INTERFACE_ONLY:
				return basicSetInterfaceOnly(null, msgs);
			case MpPackage.ACTION_TYPE__DECISION_POINT:
				return basicSetDecisionPoint(null, msgs);
			case MpPackage.ACTION_TYPE__DISTURBANCES:
				return basicSetDisturbances(null, msgs);
			case MpPackage.ACTION_TYPE__TAKES_EFFECT:
				return basicSetTakesEffect(null, msgs);
			case MpPackage.ACTION_TYPE__SIDE_EFFECTS:
				return basicSetSideEffects(null, msgs);
			case MpPackage.ACTION_TYPE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
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
			case MpPackage.ACTION_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.ACTION_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.ACTION_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.ACTION_TYPE__RETURN_TYPE:
				return getReturnType();
			case MpPackage.ACTION_TYPE__PARAMETER:
				return getParameter();
			case MpPackage.ACTION_TYPE__RAISES_EXCEPTION:
				return getRaisesException();
			case MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE:
				return getLockBeforeExecute();
			case MpPackage.ACTION_TYPE__VALIDATION_RULES:
				return getValidationRules();
			case MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED:
				return getTransactionRequired();
			case MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS:
				return getTransactionConstraints();
			case MpPackage.ACTION_TYPE__DEPRECATED:
				return getDeprecated();
			case MpPackage.ACTION_TYPE__OBSOLETE:
				return getObsolete();
			case MpPackage.ACTION_TYPE__PRELIMINARY:
				return getPreliminary();
			case MpPackage.ACTION_TYPE__STATUS_INFORMATION:
				return getStatusInformation();
			case MpPackage.ACTION_TYPE__VISIBILITY:
				return getVisibility();
			case MpPackage.ACTION_TYPE__FILTER:
				return getFilter();
			case MpPackage.ACTION_TYPE__DEPENDENCIES:
				return getDependencies();
			case MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT:
				return getDependenciesScript();
			case MpPackage.ACTION_TYPE__FEATURE:
				return getFeature();
			case MpPackage.ACTION_TYPE__SPECIFICATION:
				return getSpecification();
			case MpPackage.ACTION_TYPE__INTERFACE_ONLY:
				return getInterfaceOnly();
			case MpPackage.ACTION_TYPE__DECISION_POINT:
				return getDecisionPoint();
			case MpPackage.ACTION_TYPE__DISTURBANCES:
				return getDisturbances();
			case MpPackage.ACTION_TYPE__TAKES_EFFECT:
				return getTakesEffect();
			case MpPackage.ACTION_TYPE__SIDE_EFFECTS:
				return getSideEffects();
			case MpPackage.ACTION_TYPE__PRECONDITION:
				return getPrecondition();
			case MpPackage.ACTION_TYPE__NAME:
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
			case MpPackage.ACTION_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.ACTION_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.ACTION_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.ACTION_TYPE__RETURN_TYPE:
				setReturnType((ReturnTypeType)newValue);
				return;
			case MpPackage.ACTION_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case MpPackage.ACTION_TYPE__RAISES_EXCEPTION:
				getRaisesException().clear();
				getRaisesException().addAll((Collection<? extends RaisesExceptionType>)newValue);
				return;
			case MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE:
				setLockBeforeExecute((LockBeforeExecuteType)newValue);
				return;
			case MpPackage.ACTION_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)newValue);
				return;
			case MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED:
				setTransactionRequired((TransactionRequiredType)newValue);
				return;
			case MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS:
				setTransactionConstraints((TransactionConstraintsType)newValue);
				return;
			case MpPackage.ACTION_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)newValue);
				return;
			case MpPackage.ACTION_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)newValue);
				return;
			case MpPackage.ACTION_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)newValue);
				return;
			case MpPackage.ACTION_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)newValue);
				return;
			case MpPackage.ACTION_TYPE__VISIBILITY:
				setVisibility((VisibilityType)newValue);
				return;
			case MpPackage.ACTION_TYPE__FILTER:
				setFilter((FilterType)newValue);
				return;
			case MpPackage.ACTION_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)newValue);
				return;
			case MpPackage.ACTION_TYPE__FEATURE:
				setFeature((FeatureType)newValue);
				return;
			case MpPackage.ACTION_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)newValue);
				return;
			case MpPackage.ACTION_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)newValue);
				return;
			case MpPackage.ACTION_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)newValue);
				return;
			case MpPackage.ACTION_TYPE__DISTURBANCES:
				setDisturbances((DisturbancesType)newValue);
				return;
			case MpPackage.ACTION_TYPE__TAKES_EFFECT:
				setTakesEffect((TakesEffectType)newValue);
				return;
			case MpPackage.ACTION_TYPE__SIDE_EFFECTS:
				setSideEffects((SideEffectsType)newValue);
				return;
			case MpPackage.ACTION_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)newValue);
				return;
			case MpPackage.ACTION_TYPE__NAME:
				setName((String)newValue);
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
			case MpPackage.ACTION_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.ACTION_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.ACTION_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.ACTION_TYPE__RETURN_TYPE:
				setReturnType((ReturnTypeType)null);
				return;
			case MpPackage.ACTION_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case MpPackage.ACTION_TYPE__RAISES_EXCEPTION:
				getRaisesException().clear();
				return;
			case MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE:
				setLockBeforeExecute((LockBeforeExecuteType)null);
				return;
			case MpPackage.ACTION_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)null);
				return;
			case MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED:
				setTransactionRequired((TransactionRequiredType)null);
				return;
			case MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS:
				setTransactionConstraints((TransactionConstraintsType)null);
				return;
			case MpPackage.ACTION_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)null);
				return;
			case MpPackage.ACTION_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)null);
				return;
			case MpPackage.ACTION_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)null);
				return;
			case MpPackage.ACTION_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)null);
				return;
			case MpPackage.ACTION_TYPE__VISIBILITY:
				setVisibility((VisibilityType)null);
				return;
			case MpPackage.ACTION_TYPE__FILTER:
				setFilter((FilterType)null);
				return;
			case MpPackage.ACTION_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)null);
				return;
			case MpPackage.ACTION_TYPE__FEATURE:
				setFeature((FeatureType)null);
				return;
			case MpPackage.ACTION_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)null);
				return;
			case MpPackage.ACTION_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)null);
				return;
			case MpPackage.ACTION_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)null);
				return;
			case MpPackage.ACTION_TYPE__DISTURBANCES:
				setDisturbances((DisturbancesType)null);
				return;
			case MpPackage.ACTION_TYPE__TAKES_EFFECT:
				setTakesEffect((TakesEffectType)null);
				return;
			case MpPackage.ACTION_TYPE__SIDE_EFFECTS:
				setSideEffects((SideEffectsType)null);
				return;
			case MpPackage.ACTION_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)null);
				return;
			case MpPackage.ACTION_TYPE__NAME:
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
			case MpPackage.ACTION_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.ACTION_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.ACTION_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.ACTION_TYPE__RETURN_TYPE:
				return returnType != null;
			case MpPackage.ACTION_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case MpPackage.ACTION_TYPE__RAISES_EXCEPTION:
				return raisesException != null && !raisesException.isEmpty();
			case MpPackage.ACTION_TYPE__LOCK_BEFORE_EXECUTE:
				return lockBeforeExecute != null;
			case MpPackage.ACTION_TYPE__VALIDATION_RULES:
				return validationRules != null;
			case MpPackage.ACTION_TYPE__TRANSACTION_REQUIRED:
				return transactionRequired != null;
			case MpPackage.ACTION_TYPE__TRANSACTION_CONSTRAINTS:
				return transactionConstraints != null;
			case MpPackage.ACTION_TYPE__DEPRECATED:
				return deprecated != null;
			case MpPackage.ACTION_TYPE__OBSOLETE:
				return obsolete != null;
			case MpPackage.ACTION_TYPE__PRELIMINARY:
				return preliminary != null;
			case MpPackage.ACTION_TYPE__STATUS_INFORMATION:
				return statusInformation != null;
			case MpPackage.ACTION_TYPE__VISIBILITY:
				return visibility != null;
			case MpPackage.ACTION_TYPE__FILTER:
				return filter != null;
			case MpPackage.ACTION_TYPE__DEPENDENCIES:
				return dependencies != null;
			case MpPackage.ACTION_TYPE__DEPENDENCIES_SCRIPT:
				return dependenciesScript != null;
			case MpPackage.ACTION_TYPE__FEATURE:
				return feature != null;
			case MpPackage.ACTION_TYPE__SPECIFICATION:
				return specification != null;
			case MpPackage.ACTION_TYPE__INTERFACE_ONLY:
				return interfaceOnly != null;
			case MpPackage.ACTION_TYPE__DECISION_POINT:
				return decisionPoint != null;
			case MpPackage.ACTION_TYPE__DISTURBANCES:
				return disturbances != null;
			case MpPackage.ACTION_TYPE__TAKES_EFFECT:
				return takesEffect != null;
			case MpPackage.ACTION_TYPE__SIDE_EFFECTS:
				return sideEffects != null;
			case MpPackage.ACTION_TYPE__PRECONDITION:
				return precondition != null;
			case MpPackage.ACTION_TYPE__NAME:
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

} //ActionTypeImpl
