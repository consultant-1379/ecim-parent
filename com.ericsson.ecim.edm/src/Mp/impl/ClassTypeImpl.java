/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ActionType;
import Mp.ApplicationTagType;
import Mp.AttributeType;
import Mp.ClassType;
import Mp.DecisionPointType;
import Mp.DependenciesScriptType;
import Mp.DependenciesType;
import Mp.DeprecatedType;
import Mp.DescriptionType;
import Mp.DomainExtensionType;
import Mp.FeatureType;
import Mp.FilterType;
import Mp.InterfaceOnlyType;
import Mp.LockBeforeDeleteType;
import Mp.MpPackage;
import Mp.NonPersistentType;
import Mp.NotificationTypesType;
import Mp.ObsoleteType;
import Mp.PreconditionType;
import Mp.PreliminaryType;
import Mp.ReadOnlyType;
import Mp.RootType;
import Mp.SpecificationType;
import Mp.StatusInformationType;
import Mp.SystemCreatedType;
import Mp.TransactionConstraintsType;
import Mp.TransactionRequiredType;
import Mp.ValidationRulesType;
import Mp.VisibilityType;

import Mp.YangRootType;
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
 * An implementation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ClassTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getSystemCreated <em>System Created</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getNotificationTypes <em>Notification Types</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getNonPersistent <em>Non Persistent</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getLockBeforeDelete <em>Lock Before Delete</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getYangRoot <em>Yang Root</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getTransactionRequired <em>Transaction Required</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getTransactionConstraints <em>Transaction Constraints</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Mp.impl.ClassTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassTypeImpl extends EObjectImpl implements ClassType {
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
	 * The cached value of the '{@link #getSystemCreated() <em>System Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSystemCreated()
	 * @generated
	 * @ordered
	 */
    protected SystemCreatedType systemCreated;

    /**
	 * The cached value of the '{@link #getNotificationTypes() <em>Notification Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNotificationTypes()
	 * @generated
	 * @ordered
	 */
    protected NotificationTypesType notificationTypes;

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
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
    protected PreconditionType precondition;

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
	 * The cached value of the '{@link #getLockBeforeDelete() <em>Lock Before Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLockBeforeDelete()
	 * @generated
	 * @ordered
	 */
    protected LockBeforeDeleteType lockBeforeDelete;

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
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
    protected RootType root;

    /**
	 * The cached value of the '{@link #getYangRoot() <em>Yang Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYangRoot()
	 * @generated
	 * @ordered
	 */
	protected YangRootType yangRoot;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
    protected EList<ActionType> action;

    /**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
    protected EList<AttributeType> attribute;

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
    protected ClassTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getClassType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
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
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.CLASS_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SystemCreatedType getSystemCreated() {
		return systemCreated;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSystemCreated(SystemCreatedType newSystemCreated, NotificationChain msgs) {
		SystemCreatedType oldSystemCreated = systemCreated;
		systemCreated = newSystemCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__SYSTEM_CREATED, oldSystemCreated, newSystemCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSystemCreated(SystemCreatedType newSystemCreated) {
		if (newSystemCreated != systemCreated) {
			NotificationChain msgs = null;
			if (systemCreated != null)
				msgs = ((InternalEObject)systemCreated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__SYSTEM_CREATED, null, msgs);
			if (newSystemCreated != null)
				msgs = ((InternalEObject)newSystemCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__SYSTEM_CREATED, null, msgs);
			msgs = basicSetSystemCreated(newSystemCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__SYSTEM_CREATED, newSystemCreated, newSystemCreated));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationTypesType getNotificationTypes() {
		return notificationTypes;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNotificationTypes(NotificationTypesType newNotificationTypes, NotificationChain msgs) {
		NotificationTypesType oldNotificationTypes = notificationTypes;
		notificationTypes = newNotificationTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__NOTIFICATION_TYPES, oldNotificationTypes, newNotificationTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNotificationTypes(NotificationTypesType newNotificationTypes) {
		if (newNotificationTypes != notificationTypes) {
			NotificationChain msgs = null;
			if (notificationTypes != null)
				msgs = ((InternalEObject)notificationTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__NOTIFICATION_TYPES, null, msgs);
			if (newNotificationTypes != null)
				msgs = ((InternalEObject)newNotificationTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__NOTIFICATION_TYPES, null, msgs);
			msgs = basicSetNotificationTypes(newNotificationTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__NOTIFICATION_TYPES, newNotificationTypes, newNotificationTypes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__NON_PERSISTENT, oldNonPersistent, newNonPersistent);
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
				msgs = ((InternalEObject)nonPersistent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__NON_PERSISTENT, null, msgs);
			if (newNonPersistent != null)
				msgs = ((InternalEObject)newNonPersistent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__NON_PERSISTENT, null, msgs);
			msgs = basicSetNonPersistent(newNonPersistent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__NON_PERSISTENT, newNonPersistent, newNonPersistent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__PRECONDITION, oldPrecondition, newPrecondition);
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
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__PRECONDITION, newPrecondition, newPrecondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__READ_ONLY, oldReadOnly, newReadOnly);
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
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__READ_ONLY, newReadOnly, newReadOnly));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LockBeforeDeleteType getLockBeforeDelete() {
		return lockBeforeDelete;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLockBeforeDelete(LockBeforeDeleteType newLockBeforeDelete, NotificationChain msgs) {
		LockBeforeDeleteType oldLockBeforeDelete = lockBeforeDelete;
		lockBeforeDelete = newLockBeforeDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE, oldLockBeforeDelete, newLockBeforeDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLockBeforeDelete(LockBeforeDeleteType newLockBeforeDelete) {
		if (newLockBeforeDelete != lockBeforeDelete) {
			NotificationChain msgs = null;
			if (lockBeforeDelete != null)
				msgs = ((InternalEObject)lockBeforeDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE, null, msgs);
			if (newLockBeforeDelete != null)
				msgs = ((InternalEObject)newLockBeforeDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE, null, msgs);
			msgs = basicSetLockBeforeDelete(newLockBeforeDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE, newLockBeforeDelete, newLockBeforeDelete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__VALIDATION_RULES, oldValidationRules, newValidationRules);
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
				msgs = ((InternalEObject)validationRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__VALIDATION_RULES, null, msgs);
			if (newValidationRules != null)
				msgs = ((InternalEObject)newValidationRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__VALIDATION_RULES, null, msgs);
			msgs = basicSetValidationRules(newValidationRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__VALIDATION_RULES, newValidationRules, newValidationRules));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RootType getRoot() {
		return root;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRoot(RootType newRoot, NotificationChain msgs) {
		RootType oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRoot(RootType newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__ROOT, newRoot, newRoot));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YangRootType getYangRoot() {
		return yangRoot;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYangRoot(YangRootType newYangRoot, NotificationChain msgs) {
		YangRootType oldYangRoot = yangRoot;
		yangRoot = newYangRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__YANG_ROOT, oldYangRoot, newYangRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYangRoot(YangRootType newYangRoot) {
		if (newYangRoot != yangRoot) {
			NotificationChain msgs = null;
			if (yangRoot != null)
				msgs = ((InternalEObject)yangRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__YANG_ROOT, null, msgs);
			if (newYangRoot != null)
				msgs = ((InternalEObject)newYangRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__YANG_ROOT, null, msgs);
			msgs = basicSetYangRoot(newYangRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__YANG_ROOT, newYangRoot, newYangRoot));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DEPRECATED, oldDeprecated, newDeprecated);
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
				msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DEPRECATED, null, msgs);
			if (newDeprecated != null)
				msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DEPRECATED, null, msgs);
			msgs = basicSetDeprecated(newDeprecated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DEPRECATED, newDeprecated, newDeprecated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__OBSOLETE, oldObsolete, newObsolete);
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
				msgs = ((InternalEObject)obsolete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__OBSOLETE, null, msgs);
			if (newObsolete != null)
				msgs = ((InternalEObject)newObsolete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__OBSOLETE, null, msgs);
			msgs = basicSetObsolete(newObsolete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__OBSOLETE, newObsolete, newObsolete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__PRELIMINARY, oldPreliminary, newPreliminary);
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
				msgs = ((InternalEObject)preliminary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__PRELIMINARY, null, msgs);
			if (newPreliminary != null)
				msgs = ((InternalEObject)newPreliminary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__PRELIMINARY, null, msgs);
			msgs = basicSetPreliminary(newPreliminary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__PRELIMINARY, newPreliminary, newPreliminary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__STATUS_INFORMATION, oldStatusInformation, newStatusInformation);
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
				msgs = ((InternalEObject)statusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__STATUS_INFORMATION, null, msgs);
			if (newStatusInformation != null)
				msgs = ((InternalEObject)newStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__STATUS_INFORMATION, null, msgs);
			msgs = basicSetStatusInformation(newStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__STATUS_INFORMATION, newStatusInformation, newStatusInformation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__VISIBILITY, oldVisibility, newVisibility);
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
				msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__VISIBILITY, null, msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__VISIBILITY, null, msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__VISIBILITY, newVisibility, newVisibility));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__FILTER, oldFilter, newFilter);
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
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__FILTER, newFilter, newFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
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
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DEPENDENCIES, newDependencies, newDependencies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT, oldDependenciesScript, newDependenciesScript);
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
				msgs = ((InternalEObject)dependenciesScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			if (newDependenciesScript != null)
				msgs = ((InternalEObject)newDependenciesScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			msgs = basicSetDependenciesScript(newDependenciesScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT, newDependenciesScript, newDependenciesScript));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__FEATURE, oldFeature, newFeature);
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
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__FEATURE, newFeature, newFeature));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__SPECIFICATION, newSpecification, newSpecification));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__INTERFACE_ONLY, oldInterfaceOnly, newInterfaceOnly);
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
				msgs = ((InternalEObject)interfaceOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__INTERFACE_ONLY, null, msgs);
			if (newInterfaceOnly != null)
				msgs = ((InternalEObject)newInterfaceOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__INTERFACE_ONLY, null, msgs);
			msgs = basicSetInterfaceOnly(newInterfaceOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__INTERFACE_ONLY, newInterfaceOnly, newInterfaceOnly));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DECISION_POINT, oldDecisionPoint, newDecisionPoint);
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
				msgs = ((InternalEObject)decisionPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DECISION_POINT, null, msgs);
			if (newDecisionPoint != null)
				msgs = ((InternalEObject)newDecisionPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__DECISION_POINT, null, msgs);
			msgs = basicSetDecisionPoint(newDecisionPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__DECISION_POINT, newDecisionPoint, newDecisionPoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED, oldTransactionRequired, newTransactionRequired);
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
				msgs = ((InternalEObject)transactionRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED, null, msgs);
			if (newTransactionRequired != null)
				msgs = ((InternalEObject)newTransactionRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED, null, msgs);
			msgs = basicSetTransactionRequired(newTransactionRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED, newTransactionRequired, newTransactionRequired));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS, oldTransactionConstraints, newTransactionConstraints);
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
				msgs = ((InternalEObject)transactionConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS, null, msgs);
			if (newTransactionConstraints != null)
				msgs = ((InternalEObject)newTransactionConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS, null, msgs);
			msgs = basicSetTransactionConstraints(newTransactionConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS, newTransactionConstraints, newTransactionConstraints));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ActionType> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<ActionType>(ActionType.class, this, MpPackage.CLASS_TYPE__ACTION);
		}
		return action;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<AttributeType> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<AttributeType>(AttributeType.class, this, MpPackage.CLASS_TYPE__ATTRIBUTE);
		}
		return attribute;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CLASS_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.CLASS_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.CLASS_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.CLASS_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.CLASS_TYPE__SYSTEM_CREATED:
				return basicSetSystemCreated(null, msgs);
			case MpPackage.CLASS_TYPE__NOTIFICATION_TYPES:
				return basicSetNotificationTypes(null, msgs);
			case MpPackage.CLASS_TYPE__NON_PERSISTENT:
				return basicSetNonPersistent(null, msgs);
			case MpPackage.CLASS_TYPE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case MpPackage.CLASS_TYPE__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE:
				return basicSetLockBeforeDelete(null, msgs);
			case MpPackage.CLASS_TYPE__VALIDATION_RULES:
				return basicSetValidationRules(null, msgs);
			case MpPackage.CLASS_TYPE__ROOT:
				return basicSetRoot(null, msgs);
			case MpPackage.CLASS_TYPE__YANG_ROOT:
				return basicSetYangRoot(null, msgs);
			case MpPackage.CLASS_TYPE__DEPRECATED:
				return basicSetDeprecated(null, msgs);
			case MpPackage.CLASS_TYPE__OBSOLETE:
				return basicSetObsolete(null, msgs);
			case MpPackage.CLASS_TYPE__PRELIMINARY:
				return basicSetPreliminary(null, msgs);
			case MpPackage.CLASS_TYPE__STATUS_INFORMATION:
				return basicSetStatusInformation(null, msgs);
			case MpPackage.CLASS_TYPE__VISIBILITY:
				return basicSetVisibility(null, msgs);
			case MpPackage.CLASS_TYPE__FILTER:
				return basicSetFilter(null, msgs);
			case MpPackage.CLASS_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT:
				return basicSetDependenciesScript(null, msgs);
			case MpPackage.CLASS_TYPE__FEATURE:
				return basicSetFeature(null, msgs);
			case MpPackage.CLASS_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case MpPackage.CLASS_TYPE__INTERFACE_ONLY:
				return basicSetInterfaceOnly(null, msgs);
			case MpPackage.CLASS_TYPE__DECISION_POINT:
				return basicSetDecisionPoint(null, msgs);
			case MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED:
				return basicSetTransactionRequired(null, msgs);
			case MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS:
				return basicSetTransactionConstraints(null, msgs);
			case MpPackage.CLASS_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case MpPackage.CLASS_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case MpPackage.CLASS_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.CLASS_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.CLASS_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.CLASS_TYPE__SYSTEM_CREATED:
				return getSystemCreated();
			case MpPackage.CLASS_TYPE__NOTIFICATION_TYPES:
				return getNotificationTypes();
			case MpPackage.CLASS_TYPE__NON_PERSISTENT:
				return getNonPersistent();
			case MpPackage.CLASS_TYPE__PRECONDITION:
				return getPrecondition();
			case MpPackage.CLASS_TYPE__READ_ONLY:
				return getReadOnly();
			case MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE:
				return getLockBeforeDelete();
			case MpPackage.CLASS_TYPE__VALIDATION_RULES:
				return getValidationRules();
			case MpPackage.CLASS_TYPE__ROOT:
				return getRoot();
			case MpPackage.CLASS_TYPE__YANG_ROOT:
				return getYangRoot();
			case MpPackage.CLASS_TYPE__DEPRECATED:
				return getDeprecated();
			case MpPackage.CLASS_TYPE__OBSOLETE:
				return getObsolete();
			case MpPackage.CLASS_TYPE__PRELIMINARY:
				return getPreliminary();
			case MpPackage.CLASS_TYPE__STATUS_INFORMATION:
				return getStatusInformation();
			case MpPackage.CLASS_TYPE__VISIBILITY:
				return getVisibility();
			case MpPackage.CLASS_TYPE__FILTER:
				return getFilter();
			case MpPackage.CLASS_TYPE__DEPENDENCIES:
				return getDependencies();
			case MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT:
				return getDependenciesScript();
			case MpPackage.CLASS_TYPE__FEATURE:
				return getFeature();
			case MpPackage.CLASS_TYPE__SPECIFICATION:
				return getSpecification();
			case MpPackage.CLASS_TYPE__INTERFACE_ONLY:
				return getInterfaceOnly();
			case MpPackage.CLASS_TYPE__DECISION_POINT:
				return getDecisionPoint();
			case MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED:
				return getTransactionRequired();
			case MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS:
				return getTransactionConstraints();
			case MpPackage.CLASS_TYPE__ACTION:
				return getAction();
			case MpPackage.CLASS_TYPE__ATTRIBUTE:
				return getAttribute();
			case MpPackage.CLASS_TYPE__NAME:
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
			case MpPackage.CLASS_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.CLASS_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.CLASS_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.CLASS_TYPE__SYSTEM_CREATED:
				setSystemCreated((SystemCreatedType)newValue);
				return;
			case MpPackage.CLASS_TYPE__NOTIFICATION_TYPES:
				setNotificationTypes((NotificationTypesType)newValue);
				return;
			case MpPackage.CLASS_TYPE__NON_PERSISTENT:
				setNonPersistent((NonPersistentType)newValue);
				return;
			case MpPackage.CLASS_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)newValue);
				return;
			case MpPackage.CLASS_TYPE__READ_ONLY:
				setReadOnly((ReadOnlyType)newValue);
				return;
			case MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE:
				setLockBeforeDelete((LockBeforeDeleteType)newValue);
				return;
			case MpPackage.CLASS_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)newValue);
				return;
			case MpPackage.CLASS_TYPE__ROOT:
				setRoot((RootType)newValue);
				return;
			case MpPackage.CLASS_TYPE__YANG_ROOT:
				setYangRoot((YangRootType)newValue);
				return;
			case MpPackage.CLASS_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)newValue);
				return;
			case MpPackage.CLASS_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)newValue);
				return;
			case MpPackage.CLASS_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)newValue);
				return;
			case MpPackage.CLASS_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)newValue);
				return;
			case MpPackage.CLASS_TYPE__VISIBILITY:
				setVisibility((VisibilityType)newValue);
				return;
			case MpPackage.CLASS_TYPE__FILTER:
				setFilter((FilterType)newValue);
				return;
			case MpPackage.CLASS_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)newValue);
				return;
			case MpPackage.CLASS_TYPE__FEATURE:
				setFeature((FeatureType)newValue);
				return;
			case MpPackage.CLASS_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)newValue);
				return;
			case MpPackage.CLASS_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)newValue);
				return;
			case MpPackage.CLASS_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)newValue);
				return;
			case MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED:
				setTransactionRequired((TransactionRequiredType)newValue);
				return;
			case MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS:
				setTransactionConstraints((TransactionConstraintsType)newValue);
				return;
			case MpPackage.CLASS_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType>)newValue);
				return;
			case MpPackage.CLASS_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends AttributeType>)newValue);
				return;
			case MpPackage.CLASS_TYPE__NAME:
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
			case MpPackage.CLASS_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.CLASS_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.CLASS_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.CLASS_TYPE__SYSTEM_CREATED:
				setSystemCreated((SystemCreatedType)null);
				return;
			case MpPackage.CLASS_TYPE__NOTIFICATION_TYPES:
				setNotificationTypes((NotificationTypesType)null);
				return;
			case MpPackage.CLASS_TYPE__NON_PERSISTENT:
				setNonPersistent((NonPersistentType)null);
				return;
			case MpPackage.CLASS_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)null);
				return;
			case MpPackage.CLASS_TYPE__READ_ONLY:
				setReadOnly((ReadOnlyType)null);
				return;
			case MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE:
				setLockBeforeDelete((LockBeforeDeleteType)null);
				return;
			case MpPackage.CLASS_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)null);
				return;
			case MpPackage.CLASS_TYPE__ROOT:
				setRoot((RootType)null);
				return;
			case MpPackage.CLASS_TYPE__YANG_ROOT:
				setYangRoot((YangRootType)null);
				return;
			case MpPackage.CLASS_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)null);
				return;
			case MpPackage.CLASS_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)null);
				return;
			case MpPackage.CLASS_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)null);
				return;
			case MpPackage.CLASS_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)null);
				return;
			case MpPackage.CLASS_TYPE__VISIBILITY:
				setVisibility((VisibilityType)null);
				return;
			case MpPackage.CLASS_TYPE__FILTER:
				setFilter((FilterType)null);
				return;
			case MpPackage.CLASS_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)null);
				return;
			case MpPackage.CLASS_TYPE__FEATURE:
				setFeature((FeatureType)null);
				return;
			case MpPackage.CLASS_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)null);
				return;
			case MpPackage.CLASS_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)null);
				return;
			case MpPackage.CLASS_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)null);
				return;
			case MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED:
				setTransactionRequired((TransactionRequiredType)null);
				return;
			case MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS:
				setTransactionConstraints((TransactionConstraintsType)null);
				return;
			case MpPackage.CLASS_TYPE__ACTION:
				getAction().clear();
				return;
			case MpPackage.CLASS_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case MpPackage.CLASS_TYPE__NAME:
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
			case MpPackage.CLASS_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.CLASS_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.CLASS_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.CLASS_TYPE__SYSTEM_CREATED:
				return systemCreated != null;
			case MpPackage.CLASS_TYPE__NOTIFICATION_TYPES:
				return notificationTypes != null;
			case MpPackage.CLASS_TYPE__NON_PERSISTENT:
				return nonPersistent != null;
			case MpPackage.CLASS_TYPE__PRECONDITION:
				return precondition != null;
			case MpPackage.CLASS_TYPE__READ_ONLY:
				return readOnly != null;
			case MpPackage.CLASS_TYPE__LOCK_BEFORE_DELETE:
				return lockBeforeDelete != null;
			case MpPackage.CLASS_TYPE__VALIDATION_RULES:
				return validationRules != null;
			case MpPackage.CLASS_TYPE__ROOT:
				return root != null;
			case MpPackage.CLASS_TYPE__YANG_ROOT:
				return yangRoot != null;
			case MpPackage.CLASS_TYPE__DEPRECATED:
				return deprecated != null;
			case MpPackage.CLASS_TYPE__OBSOLETE:
				return obsolete != null;
			case MpPackage.CLASS_TYPE__PRELIMINARY:
				return preliminary != null;
			case MpPackage.CLASS_TYPE__STATUS_INFORMATION:
				return statusInformation != null;
			case MpPackage.CLASS_TYPE__VISIBILITY:
				return visibility != null;
			case MpPackage.CLASS_TYPE__FILTER:
				return filter != null;
			case MpPackage.CLASS_TYPE__DEPENDENCIES:
				return dependencies != null;
			case MpPackage.CLASS_TYPE__DEPENDENCIES_SCRIPT:
				return dependenciesScript != null;
			case MpPackage.CLASS_TYPE__FEATURE:
				return feature != null;
			case MpPackage.CLASS_TYPE__SPECIFICATION:
				return specification != null;
			case MpPackage.CLASS_TYPE__INTERFACE_ONLY:
				return interfaceOnly != null;
			case MpPackage.CLASS_TYPE__DECISION_POINT:
				return decisionPoint != null;
			case MpPackage.CLASS_TYPE__TRANSACTION_REQUIRED:
				return transactionRequired != null;
			case MpPackage.CLASS_TYPE__TRANSACTION_CONSTRAINTS:
				return transactionConstraints != null;
			case MpPackage.CLASS_TYPE__ACTION:
				return action != null && !action.isEmpty();
			case MpPackage.CLASS_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case MpPackage.CLASS_TYPE__NAME:
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

} //ClassTypeImpl
