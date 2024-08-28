/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApplicationTagType;
import Mp.ClassType;
import Mp.CopyrightType;
import Mp.DeprecatedType;
import Mp.DerivedDataTypeType;
import Mp.DescriptionType;
import Mp.DomainExtensionType;
import Mp.EnumType;
import Mp.ExceptionType;
import Mp.FilterType;
import Mp.ImplementsType;
import Mp.MimPartsType;
import Mp.MimType;
import Mp.ModelFeaturesType;
import Mp.MpPackage;
import Mp.ObsoleteType;
import Mp.PreliminaryType;
import Mp.RelationshipType;
import Mp.SpecificationType;
import Mp.StatusInformationType;
import Mp.StructType;

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
 * An implementation of the model object '<em><b>Mim Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.MimTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getMimParts <em>Mim Parts</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getModelFeatures <em>Model Features</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getException <em>Exception</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getDerivedDataType <em>Derived Data Type</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getDocNo <em>Doc No</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link Mp.impl.MimTypeImpl#getCorrection <em>Correction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MimTypeImpl extends EObjectImpl implements MimType {
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
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
    protected CopyrightType copyright;

    /**
	 * The cached value of the '{@link #getMimParts() <em>Mim Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMimParts()
	 * @generated
	 * @ordered
	 */
    protected MimPartsType mimParts;

    /**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
    protected ImplementsType implements_;

    /**
	 * The cached value of the '{@link #getModelFeatures() <em>Model Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModelFeatures()
	 * @generated
	 * @ordered
	 */
    protected ModelFeaturesType modelFeatures;

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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
    protected FilterType filter;

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
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
    protected EList<StructType> struct;

    /**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
    protected EList<EnumType> enum_;

    /**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
    protected EList<ExceptionType> exception;

    /**
	 * The cached value of the '{@link #getDerivedDataType() <em>Derived Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDerivedDataType()
	 * @generated
	 * @ordered
	 */
    protected EList<DerivedDataTypeType> derivedDataType;

    /**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
    protected EList<ClassType> class_;

    /**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
    protected EList<RelationshipType> relationship;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected static final Object VERSION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected Object version = VERSION_EDEFAULT;

    /**
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected static final Object RELEASE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected Object release = RELEASE_EDEFAULT;

    /**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
    protected static final String AUTHOR_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
    protected String author = AUTHOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
    protected static final Object CONTACT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
    protected Object contact = CONTACT_EDEFAULT;

    /**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
    protected static final Object DATE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
    protected Object date = DATE_EDEFAULT;

    /**
	 * The default value of the '{@link #getDocNo() <em>Doc No</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocNo()
	 * @generated
	 * @ordered
	 */
    protected static final Object DOC_NO_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDocNo() <em>Doc No</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocNo()
	 * @generated
	 * @ordered
	 */
    protected Object docNo = DOC_NO_EDEFAULT;

    /**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
    protected static final Object REVISION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
    protected Object revision = REVISION_EDEFAULT;

    /**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
    protected static final Object NAMESPACE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
    protected Object namespace = NAMESPACE_EDEFAULT;

    /**
	 * The default value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
    protected static final Object NAMESPACE_PREFIX_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
    protected Object namespacePrefix = NAMESPACE_PREFIX_EDEFAULT;

    /**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
    protected static final Object ORGANIZATION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
    protected Object organization = ORGANIZATION_EDEFAULT;

    /**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
    protected static final Object VARIANT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
    protected Object variant = VARIANT_EDEFAULT;

    /**
	 * The default value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
    protected static final Object CORRECTION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
    protected Object correction = CORRECTION_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MimTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getMimType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
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
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.MIM_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CopyrightType getCopyright() {
		return copyright;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCopyright(CopyrightType newCopyright, NotificationChain msgs) {
		CopyrightType oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCopyright(CopyrightType newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__COPYRIGHT, newCopyright, newCopyright));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimPartsType getMimParts() {
		return mimParts;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMimParts(MimPartsType newMimParts, NotificationChain msgs) {
		MimPartsType oldMimParts = mimParts;
		mimParts = newMimParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__MIM_PARTS, oldMimParts, newMimParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMimParts(MimPartsType newMimParts) {
		if (newMimParts != mimParts) {
			NotificationChain msgs = null;
			if (mimParts != null)
				msgs = ((InternalEObject)mimParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__MIM_PARTS, null, msgs);
			if (newMimParts != null)
				msgs = ((InternalEObject)newMimParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__MIM_PARTS, null, msgs);
			msgs = basicSetMimParts(newMimParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__MIM_PARTS, newMimParts, newMimParts));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<StructType> getStruct() {
		if (struct == null) {
			struct = new EObjectContainmentEList<StructType>(StructType.class, this, MpPackage.MIM_TYPE__STRUCT);
		}
		return struct;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EnumType> getEnum() {
		if (enum_ == null) {
			enum_ = new EObjectContainmentEList<EnumType>(EnumType.class, this, MpPackage.MIM_TYPE__ENUM);
		}
		return enum_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExceptionType> getException() {
		if (exception == null) {
			exception = new EObjectContainmentEList<ExceptionType>(ExceptionType.class, this, MpPackage.MIM_TYPE__EXCEPTION);
		}
		return exception;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DerivedDataTypeType> getDerivedDataType() {
		if (derivedDataType == null) {
			derivedDataType = new EObjectContainmentEList<DerivedDataTypeType>(DerivedDataTypeType.class, this, MpPackage.MIM_TYPE__DERIVED_DATA_TYPE);
		}
		return derivedDataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ClassType> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<ClassType>(ClassType.class, this, MpPackage.MIM_TYPE__CLASS);
		}
		return class_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RelationshipType> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<RelationshipType>(RelationshipType.class, this, MpPackage.MIM_TYPE__RELATIONSHIP);
		}
		return relationship;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getVersion() {
		return version;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVersion(Object newVersion) {
		Object oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__VERSION, oldVersion, version));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getRelease() {
		return release;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRelease(Object newRelease) {
		Object oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__RELEASE, oldRelease, release));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getAuthor() {
		return author;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__AUTHOR, oldAuthor, author));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getContact() {
		return contact;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContact(Object newContact) {
		Object oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__CONTACT, oldContact, contact));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getDate() {
		return date;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDate(Object newDate) {
		Object oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__DATE, oldDate, date));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getDocNo() {
		return docNo;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocNo(Object newDocNo) {
		Object oldDocNo = docNo;
		docNo = newDocNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__DOC_NO, oldDocNo, docNo));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getRevision() {
		return revision;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRevision(Object newRevision) {
		Object oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__REVISION, oldRevision, revision));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getNamespace() {
		return namespace;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNamespace(Object newNamespace) {
		Object oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__NAMESPACE, oldNamespace, namespace));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getNamespacePrefix() {
		return namespacePrefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNamespacePrefix(Object newNamespacePrefix) {
		Object oldNamespacePrefix = namespacePrefix;
		namespacePrefix = newNamespacePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getOrganization() {
		return organization;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOrganization(Object newOrganization) {
		Object oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__ORGANIZATION, oldOrganization, organization));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getVariant() {
		return variant;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVariant(Object newVariant) {
		Object oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__VARIANT, oldVariant, variant));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getCorrection() {
		return correction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCorrection(Object newCorrection) {
		Object oldCorrection = correction;
		correction = newCorrection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__CORRECTION, oldCorrection, correction));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ModelFeaturesType getModelFeatures() {
		return modelFeatures;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetModelFeatures(ModelFeaturesType newModelFeatures, NotificationChain msgs) {
		ModelFeaturesType oldModelFeatures = modelFeatures;
		modelFeatures = newModelFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__MODEL_FEATURES, oldModelFeatures, newModelFeatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setModelFeatures(ModelFeaturesType newModelFeatures) {
		if (newModelFeatures != modelFeatures) {
			NotificationChain msgs = null;
			if (modelFeatures != null)
				msgs = ((InternalEObject)modelFeatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__MODEL_FEATURES, null, msgs);
			if (newModelFeatures != null)
				msgs = ((InternalEObject)newModelFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__MODEL_FEATURES, null, msgs);
			msgs = basicSetModelFeatures(newModelFeatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__MODEL_FEATURES, newModelFeatures, newModelFeatures));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__DEPRECATED, oldDeprecated, newDeprecated);
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
				msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__DEPRECATED, null, msgs);
			if (newDeprecated != null)
				msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__DEPRECATED, null, msgs);
			msgs = basicSetDeprecated(newDeprecated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__DEPRECATED, newDeprecated, newDeprecated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__OBSOLETE, oldObsolete, newObsolete);
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
				msgs = ((InternalEObject)obsolete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__OBSOLETE, null, msgs);
			if (newObsolete != null)
				msgs = ((InternalEObject)newObsolete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__OBSOLETE, null, msgs);
			msgs = basicSetObsolete(newObsolete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__OBSOLETE, newObsolete, newObsolete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__PRELIMINARY, oldPreliminary, newPreliminary);
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
				msgs = ((InternalEObject)preliminary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__PRELIMINARY, null, msgs);
			if (newPreliminary != null)
				msgs = ((InternalEObject)newPreliminary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__PRELIMINARY, null, msgs);
			msgs = basicSetPreliminary(newPreliminary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__PRELIMINARY, newPreliminary, newPreliminary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__STATUS_INFORMATION, oldStatusInformation, newStatusInformation);
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
				msgs = ((InternalEObject)statusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__STATUS_INFORMATION, null, msgs);
			if (newStatusInformation != null)
				msgs = ((InternalEObject)newStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__STATUS_INFORMATION, null, msgs);
			msgs = basicSetStatusInformation(newStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__STATUS_INFORMATION, newStatusInformation, newStatusInformation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__FILTER, oldFilter, newFilter);
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
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__FILTER, newFilter, newFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__SPECIFICATION, newSpecification, newSpecification));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ImplementsType getImplements() {
		return implements_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetImplements(ImplementsType newImplements, NotificationChain msgs) {
		ImplementsType oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__IMPLEMENTS, oldImplements, newImplements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setImplements(ImplementsType newImplements) {
		if (newImplements != implements_) {
			NotificationChain msgs = null;
			if (implements_ != null)
				msgs = ((InternalEObject)implements_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__IMPLEMENTS, null, msgs);
			if (newImplements != null)
				msgs = ((InternalEObject)newImplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MIM_TYPE__IMPLEMENTS, null, msgs);
			msgs = basicSetImplements(newImplements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MIM_TYPE__IMPLEMENTS, newImplements, newImplements));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.MIM_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.MIM_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.MIM_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.MIM_TYPE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case MpPackage.MIM_TYPE__MIM_PARTS:
				return basicSetMimParts(null, msgs);
			case MpPackage.MIM_TYPE__IMPLEMENTS:
				return basicSetImplements(null, msgs);
			case MpPackage.MIM_TYPE__MODEL_FEATURES:
				return basicSetModelFeatures(null, msgs);
			case MpPackage.MIM_TYPE__DEPRECATED:
				return basicSetDeprecated(null, msgs);
			case MpPackage.MIM_TYPE__OBSOLETE:
				return basicSetObsolete(null, msgs);
			case MpPackage.MIM_TYPE__PRELIMINARY:
				return basicSetPreliminary(null, msgs);
			case MpPackage.MIM_TYPE__STATUS_INFORMATION:
				return basicSetStatusInformation(null, msgs);
			case MpPackage.MIM_TYPE__FILTER:
				return basicSetFilter(null, msgs);
			case MpPackage.MIM_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case MpPackage.MIM_TYPE__STRUCT:
				return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
			case MpPackage.MIM_TYPE__ENUM:
				return ((InternalEList<?>)getEnum()).basicRemove(otherEnd, msgs);
			case MpPackage.MIM_TYPE__EXCEPTION:
				return ((InternalEList<?>)getException()).basicRemove(otherEnd, msgs);
			case MpPackage.MIM_TYPE__DERIVED_DATA_TYPE:
				return ((InternalEList<?>)getDerivedDataType()).basicRemove(otherEnd, msgs);
			case MpPackage.MIM_TYPE__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case MpPackage.MIM_TYPE__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
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
			case MpPackage.MIM_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.MIM_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.MIM_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.MIM_TYPE__COPYRIGHT:
				return getCopyright();
			case MpPackage.MIM_TYPE__MIM_PARTS:
				return getMimParts();
			case MpPackage.MIM_TYPE__IMPLEMENTS:
				return getImplements();
			case MpPackage.MIM_TYPE__MODEL_FEATURES:
				return getModelFeatures();
			case MpPackage.MIM_TYPE__DEPRECATED:
				return getDeprecated();
			case MpPackage.MIM_TYPE__OBSOLETE:
				return getObsolete();
			case MpPackage.MIM_TYPE__PRELIMINARY:
				return getPreliminary();
			case MpPackage.MIM_TYPE__STATUS_INFORMATION:
				return getStatusInformation();
			case MpPackage.MIM_TYPE__FILTER:
				return getFilter();
			case MpPackage.MIM_TYPE__SPECIFICATION:
				return getSpecification();
			case MpPackage.MIM_TYPE__STRUCT:
				return getStruct();
			case MpPackage.MIM_TYPE__ENUM:
				return getEnum();
			case MpPackage.MIM_TYPE__EXCEPTION:
				return getException();
			case MpPackage.MIM_TYPE__DERIVED_DATA_TYPE:
				return getDerivedDataType();
			case MpPackage.MIM_TYPE__CLASS:
				return getClass_();
			case MpPackage.MIM_TYPE__RELATIONSHIP:
				return getRelationship();
			case MpPackage.MIM_TYPE__NAME:
				return getName();
			case MpPackage.MIM_TYPE__VERSION:
				return getVersion();
			case MpPackage.MIM_TYPE__RELEASE:
				return getRelease();
			case MpPackage.MIM_TYPE__AUTHOR:
				return getAuthor();
			case MpPackage.MIM_TYPE__CONTACT:
				return getContact();
			case MpPackage.MIM_TYPE__DATE:
				return getDate();
			case MpPackage.MIM_TYPE__DOC_NO:
				return getDocNo();
			case MpPackage.MIM_TYPE__REVISION:
				return getRevision();
			case MpPackage.MIM_TYPE__NAMESPACE:
				return getNamespace();
			case MpPackage.MIM_TYPE__NAMESPACE_PREFIX:
				return getNamespacePrefix();
			case MpPackage.MIM_TYPE__ORGANIZATION:
				return getOrganization();
			case MpPackage.MIM_TYPE__VARIANT:
				return getVariant();
			case MpPackage.MIM_TYPE__CORRECTION:
				return getCorrection();
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
			case MpPackage.MIM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.MIM_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.MIM_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.MIM_TYPE__COPYRIGHT:
				setCopyright((CopyrightType)newValue);
				return;
			case MpPackage.MIM_TYPE__MIM_PARTS:
				setMimParts((MimPartsType)newValue);
				return;
			case MpPackage.MIM_TYPE__IMPLEMENTS:
				setImplements((ImplementsType)newValue);
				return;
			case MpPackage.MIM_TYPE__MODEL_FEATURES:
				setModelFeatures((ModelFeaturesType)newValue);
				return;
			case MpPackage.MIM_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)newValue);
				return;
			case MpPackage.MIM_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)newValue);
				return;
			case MpPackage.MIM_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)newValue);
				return;
			case MpPackage.MIM_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)newValue);
				return;
			case MpPackage.MIM_TYPE__FILTER:
				setFilter((FilterType)newValue);
				return;
			case MpPackage.MIM_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)newValue);
				return;
			case MpPackage.MIM_TYPE__STRUCT:
				getStruct().clear();
				getStruct().addAll((Collection<? extends StructType>)newValue);
				return;
			case MpPackage.MIM_TYPE__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends EnumType>)newValue);
				return;
			case MpPackage.MIM_TYPE__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends ExceptionType>)newValue);
				return;
			case MpPackage.MIM_TYPE__DERIVED_DATA_TYPE:
				getDerivedDataType().clear();
				getDerivedDataType().addAll((Collection<? extends DerivedDataTypeType>)newValue);
				return;
			case MpPackage.MIM_TYPE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends ClassType>)newValue);
				return;
			case MpPackage.MIM_TYPE__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends RelationshipType>)newValue);
				return;
			case MpPackage.MIM_TYPE__NAME:
				setName((String)newValue);
				return;
			case MpPackage.MIM_TYPE__VERSION:
				setVersion(newValue);
				return;
			case MpPackage.MIM_TYPE__RELEASE:
				setRelease(newValue);
				return;
			case MpPackage.MIM_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case MpPackage.MIM_TYPE__CONTACT:
				setContact(newValue);
				return;
			case MpPackage.MIM_TYPE__DATE:
				setDate(newValue);
				return;
			case MpPackage.MIM_TYPE__DOC_NO:
				setDocNo(newValue);
				return;
			case MpPackage.MIM_TYPE__REVISION:
				setRevision(newValue);
				return;
			case MpPackage.MIM_TYPE__NAMESPACE:
				setNamespace(newValue);
				return;
			case MpPackage.MIM_TYPE__NAMESPACE_PREFIX:
				setNamespacePrefix(newValue);
				return;
			case MpPackage.MIM_TYPE__ORGANIZATION:
				setOrganization(newValue);
				return;
			case MpPackage.MIM_TYPE__VARIANT:
				setVariant(newValue);
				return;
			case MpPackage.MIM_TYPE__CORRECTION:
				setCorrection(newValue);
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
			case MpPackage.MIM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.MIM_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.MIM_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.MIM_TYPE__COPYRIGHT:
				setCopyright((CopyrightType)null);
				return;
			case MpPackage.MIM_TYPE__MIM_PARTS:
				setMimParts((MimPartsType)null);
				return;
			case MpPackage.MIM_TYPE__IMPLEMENTS:
				setImplements((ImplementsType)null);
				return;
			case MpPackage.MIM_TYPE__MODEL_FEATURES:
				setModelFeatures((ModelFeaturesType)null);
				return;
			case MpPackage.MIM_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)null);
				return;
			case MpPackage.MIM_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)null);
				return;
			case MpPackage.MIM_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)null);
				return;
			case MpPackage.MIM_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)null);
				return;
			case MpPackage.MIM_TYPE__FILTER:
				setFilter((FilterType)null);
				return;
			case MpPackage.MIM_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)null);
				return;
			case MpPackage.MIM_TYPE__STRUCT:
				getStruct().clear();
				return;
			case MpPackage.MIM_TYPE__ENUM:
				getEnum().clear();
				return;
			case MpPackage.MIM_TYPE__EXCEPTION:
				getException().clear();
				return;
			case MpPackage.MIM_TYPE__DERIVED_DATA_TYPE:
				getDerivedDataType().clear();
				return;
			case MpPackage.MIM_TYPE__CLASS:
				getClass_().clear();
				return;
			case MpPackage.MIM_TYPE__RELATIONSHIP:
				getRelationship().clear();
				return;
			case MpPackage.MIM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__RELEASE:
				setRelease(RELEASE_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__DOC_NO:
				setDocNo(DOC_NO_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__NAMESPACE_PREFIX:
				setNamespacePrefix(NAMESPACE_PREFIX_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__VARIANT:
				setVariant(VARIANT_EDEFAULT);
				return;
			case MpPackage.MIM_TYPE__CORRECTION:
				setCorrection(CORRECTION_EDEFAULT);
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
			case MpPackage.MIM_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.MIM_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.MIM_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.MIM_TYPE__COPYRIGHT:
				return copyright != null;
			case MpPackage.MIM_TYPE__MIM_PARTS:
				return mimParts != null;
			case MpPackage.MIM_TYPE__IMPLEMENTS:
				return implements_ != null;
			case MpPackage.MIM_TYPE__MODEL_FEATURES:
				return modelFeatures != null;
			case MpPackage.MIM_TYPE__DEPRECATED:
				return deprecated != null;
			case MpPackage.MIM_TYPE__OBSOLETE:
				return obsolete != null;
			case MpPackage.MIM_TYPE__PRELIMINARY:
				return preliminary != null;
			case MpPackage.MIM_TYPE__STATUS_INFORMATION:
				return statusInformation != null;
			case MpPackage.MIM_TYPE__FILTER:
				return filter != null;
			case MpPackage.MIM_TYPE__SPECIFICATION:
				return specification != null;
			case MpPackage.MIM_TYPE__STRUCT:
				return struct != null && !struct.isEmpty();
			case MpPackage.MIM_TYPE__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case MpPackage.MIM_TYPE__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case MpPackage.MIM_TYPE__DERIVED_DATA_TYPE:
				return derivedDataType != null && !derivedDataType.isEmpty();
			case MpPackage.MIM_TYPE__CLASS:
				return class_ != null && !class_.isEmpty();
			case MpPackage.MIM_TYPE__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case MpPackage.MIM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MpPackage.MIM_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MpPackage.MIM_TYPE__RELEASE:
				return RELEASE_EDEFAULT == null ? release != null : !RELEASE_EDEFAULT.equals(release);
			case MpPackage.MIM_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case MpPackage.MIM_TYPE__CONTACT:
				return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
			case MpPackage.MIM_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case MpPackage.MIM_TYPE__DOC_NO:
				return DOC_NO_EDEFAULT == null ? docNo != null : !DOC_NO_EDEFAULT.equals(docNo);
			case MpPackage.MIM_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case MpPackage.MIM_TYPE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case MpPackage.MIM_TYPE__NAMESPACE_PREFIX:
				return NAMESPACE_PREFIX_EDEFAULT == null ? namespacePrefix != null : !NAMESPACE_PREFIX_EDEFAULT.equals(namespacePrefix);
			case MpPackage.MIM_TYPE__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case MpPackage.MIM_TYPE__VARIANT:
				return VARIANT_EDEFAULT == null ? variant != null : !VARIANT_EDEFAULT.equals(variant);
			case MpPackage.MIM_TYPE__CORRECTION:
				return CORRECTION_EDEFAULT == null ? correction != null : !CORRECTION_EDEFAULT.equals(correction);
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
		result.append(", version: ");
		result.append(version);
		result.append(", release: ");
		result.append(release);
		result.append(", author: ");
		result.append(author);
		result.append(", contact: ");
		result.append(contact);
		result.append(", date: ");
		result.append(date);
		result.append(", docNo: ");
		result.append(docNo);
		result.append(", revision: ");
		result.append(revision);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", namespacePrefix: ");
		result.append(namespacePrefix);
		result.append(", organization: ");
		result.append(organization);
		result.append(", variant: ");
		result.append(variant);
		result.append(", correction: ");
		result.append(correction);
		result.append(')');
		return result.toString();
	}

} //MimTypeImpl
