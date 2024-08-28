/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApplicationTagType;
import Mp.BiDirectionalAssociationType;
import Mp.ContainmentType;
import Mp.DecisionPointType;
import Mp.DependenciesScriptType;
import Mp.DependenciesType;
import Mp.DeprecatedType;
import Mp.DescriptionType;
import Mp.DomainExtensionType;
import Mp.FeatureType;
import Mp.FilterType;
import Mp.InheritanceType;
import Mp.InterfaceOnlyType;
import Mp.MpPackage;
import Mp.ObsoleteType;
import Mp.PreliminaryType;
import Mp.RelationshipType;
import Mp.SpecificationType;
import Mp.StatusInformationType;
import Mp.UniDirectionalAssociationType;
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
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getBiDirectionalAssociation <em>Bi Directional Association</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getUniDirectionalAssociation <em>Uni Directional Association</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link Mp.impl.RelationshipTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipTypeImpl extends EObjectImpl implements RelationshipType {
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
	 * The cached value of the '{@link #getBiDirectionalAssociation() <em>Bi Directional Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBiDirectionalAssociation()
	 * @generated
	 * @ordered
	 */
    protected BiDirectionalAssociationType biDirectionalAssociation;

    /**
	 * The cached value of the '{@link #getUniDirectionalAssociation() <em>Uni Directional Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUniDirectionalAssociation()
	 * @generated
	 * @ordered
	 */
    protected UniDirectionalAssociationType uniDirectionalAssociation;

    /**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
    protected ContainmentType containment;

    /**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
    protected InheritanceType inheritance;

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
    protected RelationshipTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getRelationshipType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
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
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.RELATIONSHIP_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DEPRECATED, oldDeprecated, newDeprecated);
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
				msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DEPRECATED, null, msgs);
			if (newDeprecated != null)
				msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DEPRECATED, null, msgs);
			msgs = basicSetDeprecated(newDeprecated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DEPRECATED, newDeprecated, newDeprecated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__OBSOLETE, oldObsolete, newObsolete);
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
				msgs = ((InternalEObject)obsolete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__OBSOLETE, null, msgs);
			if (newObsolete != null)
				msgs = ((InternalEObject)newObsolete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__OBSOLETE, null, msgs);
			msgs = basicSetObsolete(newObsolete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__OBSOLETE, newObsolete, newObsolete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__PRELIMINARY, oldPreliminary, newPreliminary);
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
				msgs = ((InternalEObject)preliminary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__PRELIMINARY, null, msgs);
			if (newPreliminary != null)
				msgs = ((InternalEObject)newPreliminary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__PRELIMINARY, null, msgs);
			msgs = basicSetPreliminary(newPreliminary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__PRELIMINARY, newPreliminary, newPreliminary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION, oldStatusInformation, newStatusInformation);
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
				msgs = ((InternalEObject)statusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION, null, msgs);
			if (newStatusInformation != null)
				msgs = ((InternalEObject)newStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION, null, msgs);
			msgs = basicSetStatusInformation(newStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION, newStatusInformation, newStatusInformation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__VISIBILITY, oldVisibility, newVisibility);
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
				msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__VISIBILITY, null, msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__VISIBILITY, null, msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__VISIBILITY, newVisibility, newVisibility));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__FILTER, oldFilter, newFilter);
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
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__FILTER, newFilter, newFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
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
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES, newDependencies, newDependencies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT, oldDependenciesScript, newDependenciesScript);
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
				msgs = ((InternalEObject)dependenciesScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			if (newDependenciesScript != null)
				msgs = ((InternalEObject)newDependenciesScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			msgs = basicSetDependenciesScript(newDependenciesScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT, newDependenciesScript, newDependenciesScript));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__FEATURE, oldFeature, newFeature);
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
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__FEATURE, newFeature, newFeature));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__SPECIFICATION, newSpecification, newSpecification));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY, oldInterfaceOnly, newInterfaceOnly);
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
				msgs = ((InternalEObject)interfaceOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY, null, msgs);
			if (newInterfaceOnly != null)
				msgs = ((InternalEObject)newInterfaceOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY, null, msgs);
			msgs = basicSetInterfaceOnly(newInterfaceOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY, newInterfaceOnly, newInterfaceOnly));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DECISION_POINT, oldDecisionPoint, newDecisionPoint);
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
				msgs = ((InternalEObject)decisionPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DECISION_POINT, null, msgs);
			if (newDecisionPoint != null)
				msgs = ((InternalEObject)newDecisionPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__DECISION_POINT, null, msgs);
			msgs = basicSetDecisionPoint(newDecisionPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__DECISION_POINT, newDecisionPoint, newDecisionPoint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BiDirectionalAssociationType getBiDirectionalAssociation() {
		return biDirectionalAssociation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBiDirectionalAssociation(BiDirectionalAssociationType newBiDirectionalAssociation, NotificationChain msgs) {
		BiDirectionalAssociationType oldBiDirectionalAssociation = biDirectionalAssociation;
		biDirectionalAssociation = newBiDirectionalAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION, oldBiDirectionalAssociation, newBiDirectionalAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBiDirectionalAssociation(BiDirectionalAssociationType newBiDirectionalAssociation) {
		if (newBiDirectionalAssociation != biDirectionalAssociation) {
			NotificationChain msgs = null;
			if (biDirectionalAssociation != null)
				msgs = ((InternalEObject)biDirectionalAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION, null, msgs);
			if (newBiDirectionalAssociation != null)
				msgs = ((InternalEObject)newBiDirectionalAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION, null, msgs);
			msgs = basicSetBiDirectionalAssociation(newBiDirectionalAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION, newBiDirectionalAssociation, newBiDirectionalAssociation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UniDirectionalAssociationType getUniDirectionalAssociation() {
		return uniDirectionalAssociation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUniDirectionalAssociation(UniDirectionalAssociationType newUniDirectionalAssociation, NotificationChain msgs) {
		UniDirectionalAssociationType oldUniDirectionalAssociation = uniDirectionalAssociation;
		uniDirectionalAssociation = newUniDirectionalAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION, oldUniDirectionalAssociation, newUniDirectionalAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUniDirectionalAssociation(UniDirectionalAssociationType newUniDirectionalAssociation) {
		if (newUniDirectionalAssociation != uniDirectionalAssociation) {
			NotificationChain msgs = null;
			if (uniDirectionalAssociation != null)
				msgs = ((InternalEObject)uniDirectionalAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION, null, msgs);
			if (newUniDirectionalAssociation != null)
				msgs = ((InternalEObject)newUniDirectionalAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION, null, msgs);
			msgs = basicSetUniDirectionalAssociation(newUniDirectionalAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION, newUniDirectionalAssociation, newUniDirectionalAssociation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ContainmentType getContainment() {
		return containment;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetContainment(ContainmentType newContainment, NotificationChain msgs) {
		ContainmentType oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__CONTAINMENT, oldContainment, newContainment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContainment(ContainmentType newContainment) {
		if (newContainment != containment) {
			NotificationChain msgs = null;
			if (containment != null)
				msgs = ((InternalEObject)containment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__CONTAINMENT, null, msgs);
			if (newContainment != null)
				msgs = ((InternalEObject)newContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__CONTAINMENT, null, msgs);
			msgs = basicSetContainment(newContainment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__CONTAINMENT, newContainment, newContainment));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InheritanceType getInheritance() {
		return inheritance;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInheritance(InheritanceType newInheritance, NotificationChain msgs) {
		InheritanceType oldInheritance = inheritance;
		inheritance = newInheritance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__INHERITANCE, oldInheritance, newInheritance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInheritance(InheritanceType newInheritance) {
		if (newInheritance != inheritance) {
			NotificationChain msgs = null;
			if (inheritance != null)
				msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__INHERITANCE, null, msgs);
			if (newInheritance != null)
				msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RELATIONSHIP_TYPE__INHERITANCE, null, msgs);
			msgs = basicSetInheritance(newInheritance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__INHERITANCE, newInheritance, newInheritance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RELATIONSHIP_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.RELATIONSHIP_TYPE__DEPRECATED:
				return basicSetDeprecated(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__OBSOLETE:
				return basicSetObsolete(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__PRELIMINARY:
				return basicSetPreliminary(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION:
				return basicSetStatusInformation(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__VISIBILITY:
				return basicSetVisibility(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__FILTER:
				return basicSetFilter(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT:
				return basicSetDependenciesScript(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__FEATURE:
				return basicSetFeature(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY:
				return basicSetInterfaceOnly(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__DECISION_POINT:
				return basicSetDecisionPoint(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION:
				return basicSetBiDirectionalAssociation(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION:
				return basicSetUniDirectionalAssociation(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__CONTAINMENT:
				return basicSetContainment(null, msgs);
			case MpPackage.RELATIONSHIP_TYPE__INHERITANCE:
				return basicSetInheritance(null, msgs);
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
			case MpPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.RELATIONSHIP_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.RELATIONSHIP_TYPE__DEPRECATED:
				return getDeprecated();
			case MpPackage.RELATIONSHIP_TYPE__OBSOLETE:
				return getObsolete();
			case MpPackage.RELATIONSHIP_TYPE__PRELIMINARY:
				return getPreliminary();
			case MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION:
				return getStatusInformation();
			case MpPackage.RELATIONSHIP_TYPE__VISIBILITY:
				return getVisibility();
			case MpPackage.RELATIONSHIP_TYPE__FILTER:
				return getFilter();
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES:
				return getDependencies();
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT:
				return getDependenciesScript();
			case MpPackage.RELATIONSHIP_TYPE__FEATURE:
				return getFeature();
			case MpPackage.RELATIONSHIP_TYPE__SPECIFICATION:
				return getSpecification();
			case MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY:
				return getInterfaceOnly();
			case MpPackage.RELATIONSHIP_TYPE__DECISION_POINT:
				return getDecisionPoint();
			case MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION:
				return getBiDirectionalAssociation();
			case MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION:
				return getUniDirectionalAssociation();
			case MpPackage.RELATIONSHIP_TYPE__CONTAINMENT:
				return getContainment();
			case MpPackage.RELATIONSHIP_TYPE__INHERITANCE:
				return getInheritance();
			case MpPackage.RELATIONSHIP_TYPE__NAME:
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
			case MpPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__VISIBILITY:
				setVisibility((VisibilityType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__FILTER:
				setFilter((FilterType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__FEATURE:
				setFeature((FeatureType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION:
				setBiDirectionalAssociation((BiDirectionalAssociationType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION:
				setUniDirectionalAssociation((UniDirectionalAssociationType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__CONTAINMENT:
				setContainment((ContainmentType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__INHERITANCE:
				setInheritance((InheritanceType)newValue);
				return;
			case MpPackage.RELATIONSHIP_TYPE__NAME:
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
			case MpPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.RELATIONSHIP_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__VISIBILITY:
				setVisibility((VisibilityType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__FILTER:
				setFilter((FilterType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__FEATURE:
				setFeature((FeatureType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION:
				setBiDirectionalAssociation((BiDirectionalAssociationType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION:
				setUniDirectionalAssociation((UniDirectionalAssociationType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__CONTAINMENT:
				setContainment((ContainmentType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__INHERITANCE:
				setInheritance((InheritanceType)null);
				return;
			case MpPackage.RELATIONSHIP_TYPE__NAME:
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
			case MpPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.RELATIONSHIP_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.RELATIONSHIP_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.RELATIONSHIP_TYPE__DEPRECATED:
				return deprecated != null;
			case MpPackage.RELATIONSHIP_TYPE__OBSOLETE:
				return obsolete != null;
			case MpPackage.RELATIONSHIP_TYPE__PRELIMINARY:
				return preliminary != null;
			case MpPackage.RELATIONSHIP_TYPE__STATUS_INFORMATION:
				return statusInformation != null;
			case MpPackage.RELATIONSHIP_TYPE__VISIBILITY:
				return visibility != null;
			case MpPackage.RELATIONSHIP_TYPE__FILTER:
				return filter != null;
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES:
				return dependencies != null;
			case MpPackage.RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT:
				return dependenciesScript != null;
			case MpPackage.RELATIONSHIP_TYPE__FEATURE:
				return feature != null;
			case MpPackage.RELATIONSHIP_TYPE__SPECIFICATION:
				return specification != null;
			case MpPackage.RELATIONSHIP_TYPE__INTERFACE_ONLY:
				return interfaceOnly != null;
			case MpPackage.RELATIONSHIP_TYPE__DECISION_POINT:
				return decisionPoint != null;
			case MpPackage.RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION:
				return biDirectionalAssociation != null;
			case MpPackage.RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION:
				return uniDirectionalAssociation != null;
			case MpPackage.RELATIONSHIP_TYPE__CONTAINMENT:
				return containment != null;
			case MpPackage.RELATIONSHIP_TYPE__INHERITANCE:
				return inheritance != null;
			case MpPackage.RELATIONSHIP_TYPE__NAME:
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

} //RelationshipTypeImpl
