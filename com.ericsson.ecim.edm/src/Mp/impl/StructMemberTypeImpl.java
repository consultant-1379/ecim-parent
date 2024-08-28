/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApplicationTagType;
import Mp.BooleanType;
import Mp.CharType;
import Mp.Decimal64Type;
import Mp.DecisionPointType;
import Mp.DependenciesScriptType;
import Mp.DependenciesType;
import Mp.DeprecatedType;
import Mp.DerivedDataTypeRefType;
import Mp.DescriptionType;
import Mp.DisturbancesType;
import Mp.DomainExtensionType;
import Mp.DoubleType;
import Mp.EnumRefType;
import Mp.FeatureType;
import Mp.FilterType;
import Mp.FloatType;
import Mp.Int16Type;
import Mp.Int32Type;
import Mp.Int64Type;
import Mp.Int8Type;
import Mp.IntegerType;
import Mp.InterfaceOnlyType;
import Mp.LongType;
import Mp.LonglongType;
import Mp.MoRefType;
import Mp.MpPackage;
import Mp.ObsoleteType;
import Mp.OctetType;
import Mp.PreconditionType;
import Mp.PreliminaryType;
import Mp.SequenceType;
import Mp.ShortType;
import Mp.SideEffectsType;
import Mp.SpecificationType;
import Mp.StatusInformationType;
import Mp.StringType;
import Mp.StructMemberType;
import Mp.TakesEffectType;
import Mp.Uint16Type;
import Mp.Uint32Type;
import Mp.Uint64Type;
import Mp.Uint8Type;
import Mp.VisibilityType;
import Mp.WstringType;

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
 * An implementation of the model object '<em><b>Struct Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getOctet <em>Octet</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getLong <em>Long</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getLonglong <em>Longlong</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getShort <em>Short</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getString <em>String</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getWstring <em>Wstring</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getInt8 <em>Int8</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getInt16 <em>Int16</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getInt32 <em>Int32</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getInt64 <em>Int64</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getUint8 <em>Uint8</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getUint16 <em>Uint16</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getUint32 <em>Uint32</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getUint64 <em>Uint64</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getEnumRef <em>Enum Ref</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getMoRef <em>Mo Ref</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getDisturbances <em>Disturbances</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getSideEffects <em>Side Effects</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.impl.StructMemberTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructMemberTypeImpl extends EObjectImpl implements StructMemberType {
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
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
    protected BooleanType boolean_;

    /**
	 * The cached value of the '{@link #getOctet() <em>Octet</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOctet()
	 * @generated
	 * @ordered
	 */
    protected OctetType octet;

    /**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
    protected CharType char_;

    /**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
    protected DoubleType double_;

    /**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
    protected FloatType float_;

    /**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
    protected LongType long_;

    /**
	 * The cached value of the '{@link #getLonglong() <em>Longlong</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLonglong()
	 * @generated
	 * @ordered
	 */
    protected LonglongType longlong;

    /**
	 * The cached value of the '{@link #getShort() <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
    protected ShortType short_;

    /**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
    protected StringType string;

    /**
	 * The cached value of the '{@link #getWstring() <em>Wstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWstring()
	 * @generated
	 * @ordered
	 */
    protected WstringType wstring;

    /**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
    protected IntegerType integer;

    /**
	 * The cached value of the '{@link #getInt8() <em>Int8</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInt8()
	 * @generated
	 * @ordered
	 */
    protected Int8Type int8;

    /**
	 * The cached value of the '{@link #getInt16() <em>Int16</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInt16()
	 * @generated
	 * @ordered
	 */
    protected Int16Type int16;

    /**
	 * The cached value of the '{@link #getInt32() <em>Int32</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInt32()
	 * @generated
	 * @ordered
	 */
    protected Int32Type int32;

    /**
	 * The cached value of the '{@link #getInt64() <em>Int64</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInt64()
	 * @generated
	 * @ordered
	 */
    protected Int64Type int64;

    /**
	 * The cached value of the '{@link #getUint8() <em>Uint8</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUint8()
	 * @generated
	 * @ordered
	 */
    protected Uint8Type uint8;

    /**
	 * The cached value of the '{@link #getUint16() <em>Uint16</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUint16()
	 * @generated
	 * @ordered
	 */
    protected Uint16Type uint16;

    /**
	 * The cached value of the '{@link #getUint32() <em>Uint32</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUint32()
	 * @generated
	 * @ordered
	 */
    protected Uint32Type uint32;

    /**
	 * The cached value of the '{@link #getUint64() <em>Uint64</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUint64()
	 * @generated
	 * @ordered
	 */
    protected Uint64Type uint64;

    /**
	 * The cached value of the '{@link #getEnumRef() <em>Enum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEnumRef()
	 * @generated
	 * @ordered
	 */
    protected EnumRefType enumRef;

    /**
	 * The cached value of the '{@link #getMoRef() <em>Mo Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMoRef()
	 * @generated
	 * @ordered
	 */
    protected MoRefType moRef;

    /**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
    protected SequenceType sequence;

    /**
	 * The cached value of the '{@link #getDerivedDataTypeRef() <em>Derived Data Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDerivedDataTypeRef()
	 * @generated
	 * @ordered
	 */
    protected DerivedDataTypeRefType derivedDataTypeRef;

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
    protected StructMemberTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getStructMemberType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
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
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.STRUCT_MEMBER_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BooleanType getBoolean() {
		return boolean_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBoolean(BooleanType newBoolean, NotificationChain msgs) {
		BooleanType oldBoolean = boolean_;
		boolean_ = newBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN, oldBoolean, newBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBoolean(BooleanType newBoolean) {
		if (newBoolean != boolean_) {
			NotificationChain msgs = null;
			if (boolean_ != null)
				msgs = ((InternalEObject)boolean_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN, null, msgs);
			if (newBoolean != null)
				msgs = ((InternalEObject)newBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN, null, msgs);
			msgs = basicSetBoolean(newBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN, newBoolean, newBoolean));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OctetType getOctet() {
		return octet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetOctet(OctetType newOctet, NotificationChain msgs) {
		OctetType oldOctet = octet;
		octet = newOctet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__OCTET, oldOctet, newOctet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOctet(OctetType newOctet) {
		if (newOctet != octet) {
			NotificationChain msgs = null;
			if (octet != null)
				msgs = ((InternalEObject)octet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__OCTET, null, msgs);
			if (newOctet != null)
				msgs = ((InternalEObject)newOctet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__OCTET, null, msgs);
			msgs = basicSetOctet(newOctet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__OCTET, newOctet, newOctet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CharType getChar() {
		return char_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetChar(CharType newChar, NotificationChain msgs) {
		CharType oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__CHAR, oldChar, newChar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setChar(CharType newChar) {
		if (newChar != char_) {
			NotificationChain msgs = null;
			if (char_ != null)
				msgs = ((InternalEObject)char_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__CHAR, null, msgs);
			if (newChar != null)
				msgs = ((InternalEObject)newChar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__CHAR, null, msgs);
			msgs = basicSetChar(newChar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__CHAR, newChar, newChar));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DoubleType getDouble() {
		return double_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDouble(DoubleType newDouble, NotificationChain msgs) {
		DoubleType oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DOUBLE, oldDouble, newDouble);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDouble(DoubleType newDouble) {
		if (newDouble != double_) {
			NotificationChain msgs = null;
			if (double_ != null)
				msgs = ((InternalEObject)double_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DOUBLE, null, msgs);
			if (newDouble != null)
				msgs = ((InternalEObject)newDouble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DOUBLE, null, msgs);
			msgs = basicSetDouble(newDouble, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DOUBLE, newDouble, newDouble));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FloatType getFloat() {
		return float_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFloat(FloatType newFloat, NotificationChain msgs) {
		FloatType oldFloat = float_;
		float_ = newFloat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__FLOAT, oldFloat, newFloat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFloat(FloatType newFloat) {
		if (newFloat != float_) {
			NotificationChain msgs = null;
			if (float_ != null)
				msgs = ((InternalEObject)float_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__FLOAT, null, msgs);
			if (newFloat != null)
				msgs = ((InternalEObject)newFloat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__FLOAT, null, msgs);
			msgs = basicSetFloat(newFloat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__FLOAT, newFloat, newFloat));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LongType getLong() {
		return long_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLong(LongType newLong, NotificationChain msgs) {
		LongType oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__LONG, oldLong, newLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLong(LongType newLong) {
		if (newLong != long_) {
			NotificationChain msgs = null;
			if (long_ != null)
				msgs = ((InternalEObject)long_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__LONG, null, msgs);
			if (newLong != null)
				msgs = ((InternalEObject)newLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__LONG, null, msgs);
			msgs = basicSetLong(newLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__LONG, newLong, newLong));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LonglongType getLonglong() {
		return longlong;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLonglong(LonglongType newLonglong, NotificationChain msgs) {
		LonglongType oldLonglong = longlong;
		longlong = newLonglong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__LONGLONG, oldLonglong, newLonglong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLonglong(LonglongType newLonglong) {
		if (newLonglong != longlong) {
			NotificationChain msgs = null;
			if (longlong != null)
				msgs = ((InternalEObject)longlong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__LONGLONG, null, msgs);
			if (newLonglong != null)
				msgs = ((InternalEObject)newLonglong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__LONGLONG, null, msgs);
			msgs = basicSetLonglong(newLonglong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__LONGLONG, newLonglong, newLonglong));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ShortType getShort() {
		return short_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetShort(ShortType newShort, NotificationChain msgs) {
		ShortType oldShort = short_;
		short_ = newShort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SHORT, oldShort, newShort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setShort(ShortType newShort) {
		if (newShort != short_) {
			NotificationChain msgs = null;
			if (short_ != null)
				msgs = ((InternalEObject)short_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SHORT, null, msgs);
			if (newShort != null)
				msgs = ((InternalEObject)newShort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SHORT, null, msgs);
			msgs = basicSetShort(newShort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SHORT, newShort, newShort));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StringType getString() {
		return string;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetString(StringType newString, NotificationChain msgs) {
		StringType oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setString(StringType newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__STRING, newString, newString));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public WstringType getWstring() {
		return wstring;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetWstring(WstringType newWstring, NotificationChain msgs) {
		WstringType oldWstring = wstring;
		wstring = newWstring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__WSTRING, oldWstring, newWstring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWstring(WstringType newWstring) {
		if (newWstring != wstring) {
			NotificationChain msgs = null;
			if (wstring != null)
				msgs = ((InternalEObject)wstring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__WSTRING, null, msgs);
			if (newWstring != null)
				msgs = ((InternalEObject)newWstring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__WSTRING, null, msgs);
			msgs = basicSetWstring(newWstring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__WSTRING, newWstring, newWstring));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int8Type getInt8() {
		return int8;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInt8(Int8Type newInt8, NotificationChain msgs) {
		Int8Type oldInt8 = int8;
		int8 = newInt8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT8, oldInt8, newInt8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInt8(Int8Type newInt8) {
		if (newInt8 != int8) {
			NotificationChain msgs = null;
			if (int8 != null)
				msgs = ((InternalEObject)int8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT8, null, msgs);
			if (newInt8 != null)
				msgs = ((InternalEObject)newInt8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT8, null, msgs);
			msgs = basicSetInt8(newInt8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT8, newInt8, newInt8));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int16Type getInt16() {
		return int16;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInt16(Int16Type newInt16, NotificationChain msgs) {
		Int16Type oldInt16 = int16;
		int16 = newInt16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT16, oldInt16, newInt16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInt16(Int16Type newInt16) {
		if (newInt16 != int16) {
			NotificationChain msgs = null;
			if (int16 != null)
				msgs = ((InternalEObject)int16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT16, null, msgs);
			if (newInt16 != null)
				msgs = ((InternalEObject)newInt16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT16, null, msgs);
			msgs = basicSetInt16(newInt16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT16, newInt16, newInt16));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int32Type getInt32() {
		return int32;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInt32(Int32Type newInt32, NotificationChain msgs) {
		Int32Type oldInt32 = int32;
		int32 = newInt32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT32, oldInt32, newInt32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInt32(Int32Type newInt32) {
		if (newInt32 != int32) {
			NotificationChain msgs = null;
			if (int32 != null)
				msgs = ((InternalEObject)int32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT32, null, msgs);
			if (newInt32 != null)
				msgs = ((InternalEObject)newInt32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT32, null, msgs);
			msgs = basicSetInt32(newInt32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT32, newInt32, newInt32));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int64Type getInt64() {
		return int64;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInt64(Int64Type newInt64, NotificationChain msgs) {
		Int64Type oldInt64 = int64;
		int64 = newInt64;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT64, oldInt64, newInt64);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInt64(Int64Type newInt64) {
		if (newInt64 != int64) {
			NotificationChain msgs = null;
			if (int64 != null)
				msgs = ((InternalEObject)int64).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT64, null, msgs);
			if (newInt64 != null)
				msgs = ((InternalEObject)newInt64).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INT64, null, msgs);
			msgs = basicSetInt64(newInt64, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INT64, newInt64, newInt64));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint8Type getUint8() {
		return uint8;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUint8(Uint8Type newUint8, NotificationChain msgs) {
		Uint8Type oldUint8 = uint8;
		uint8 = newUint8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT8, oldUint8, newUint8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUint8(Uint8Type newUint8) {
		if (newUint8 != uint8) {
			NotificationChain msgs = null;
			if (uint8 != null)
				msgs = ((InternalEObject)uint8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT8, null, msgs);
			if (newUint8 != null)
				msgs = ((InternalEObject)newUint8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT8, null, msgs);
			msgs = basicSetUint8(newUint8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT8, newUint8, newUint8));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint16Type getUint16() {
		return uint16;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUint16(Uint16Type newUint16, NotificationChain msgs) {
		Uint16Type oldUint16 = uint16;
		uint16 = newUint16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT16, oldUint16, newUint16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUint16(Uint16Type newUint16) {
		if (newUint16 != uint16) {
			NotificationChain msgs = null;
			if (uint16 != null)
				msgs = ((InternalEObject)uint16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT16, null, msgs);
			if (newUint16 != null)
				msgs = ((InternalEObject)newUint16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT16, null, msgs);
			msgs = basicSetUint16(newUint16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT16, newUint16, newUint16));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint32Type getUint32() {
		return uint32;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUint32(Uint32Type newUint32, NotificationChain msgs) {
		Uint32Type oldUint32 = uint32;
		uint32 = newUint32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT32, oldUint32, newUint32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUint32(Uint32Type newUint32) {
		if (newUint32 != uint32) {
			NotificationChain msgs = null;
			if (uint32 != null)
				msgs = ((InternalEObject)uint32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT32, null, msgs);
			if (newUint32 != null)
				msgs = ((InternalEObject)newUint32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT32, null, msgs);
			msgs = basicSetUint32(newUint32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT32, newUint32, newUint32));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint64Type getUint64() {
		return uint64;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUint64(Uint64Type newUint64, NotificationChain msgs) {
		Uint64Type oldUint64 = uint64;
		uint64 = newUint64;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT64, oldUint64, newUint64);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUint64(Uint64Type newUint64) {
		if (newUint64 != uint64) {
			NotificationChain msgs = null;
			if (uint64 != null)
				msgs = ((InternalEObject)uint64).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT64, null, msgs);
			if (newUint64 != null)
				msgs = ((InternalEObject)newUint64).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__UINT64, null, msgs);
			msgs = basicSetUint64(newUint64, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__UINT64, newUint64, newUint64));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumRefType getEnumRef() {
		return enumRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetEnumRef(EnumRefType newEnumRef, NotificationChain msgs) {
		EnumRefType oldEnumRef = enumRef;
		enumRef = newEnumRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF, oldEnumRef, newEnumRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEnumRef(EnumRefType newEnumRef) {
		if (newEnumRef != enumRef) {
			NotificationChain msgs = null;
			if (enumRef != null)
				msgs = ((InternalEObject)enumRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF, null, msgs);
			if (newEnumRef != null)
				msgs = ((InternalEObject)newEnumRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF, null, msgs);
			msgs = basicSetEnumRef(newEnumRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF, newEnumRef, newEnumRef));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MoRefType getMoRef() {
		return moRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMoRef(MoRefType newMoRef, NotificationChain msgs) {
		MoRefType oldMoRef = moRef;
		moRef = newMoRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__MO_REF, oldMoRef, newMoRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMoRef(MoRefType newMoRef) {
		if (newMoRef != moRef) {
			NotificationChain msgs = null;
			if (moRef != null)
				msgs = ((InternalEObject)moRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__MO_REF, null, msgs);
			if (newMoRef != null)
				msgs = ((InternalEObject)newMoRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__MO_REF, null, msgs);
			msgs = basicSetMoRef(newMoRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__MO_REF, newMoRef, newMoRef));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SequenceType getSequence() {
		return sequence;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSequence(SequenceType newSequence, NotificationChain msgs) {
		SequenceType oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSequence(SequenceType newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE, newSequence, newSequence));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DerivedDataTypeRefType getDerivedDataTypeRef() {
		return derivedDataTypeRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDerivedDataTypeRef(DerivedDataTypeRefType newDerivedDataTypeRef, NotificationChain msgs) {
		DerivedDataTypeRefType oldDerivedDataTypeRef = derivedDataTypeRef;
		derivedDataTypeRef = newDerivedDataTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF, oldDerivedDataTypeRef, newDerivedDataTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDerivedDataTypeRef(DerivedDataTypeRefType newDerivedDataTypeRef) {
		if (newDerivedDataTypeRef != derivedDataTypeRef) {
			NotificationChain msgs = null;
			if (derivedDataTypeRef != null)
				msgs = ((InternalEObject)derivedDataTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF, null, msgs);
			if (newDerivedDataTypeRef != null)
				msgs = ((InternalEObject)newDerivedDataTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF, null, msgs);
			msgs = basicSetDerivedDataTypeRef(newDerivedDataTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF, newDerivedDataTypeRef, newDerivedDataTypeRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED, oldDeprecated, newDeprecated);
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
				msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED, null, msgs);
			if (newDeprecated != null)
				msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED, null, msgs);
			msgs = basicSetDeprecated(newDeprecated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED, newDeprecated, newDeprecated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE, oldObsolete, newObsolete);
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
				msgs = ((InternalEObject)obsolete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE, null, msgs);
			if (newObsolete != null)
				msgs = ((InternalEObject)newObsolete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE, null, msgs);
			msgs = basicSetObsolete(newObsolete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE, newObsolete, newObsolete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY, oldPreliminary, newPreliminary);
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
				msgs = ((InternalEObject)preliminary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY, null, msgs);
			if (newPreliminary != null)
				msgs = ((InternalEObject)newPreliminary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY, null, msgs);
			msgs = basicSetPreliminary(newPreliminary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY, newPreliminary, newPreliminary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION, oldStatusInformation, newStatusInformation);
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
				msgs = ((InternalEObject)statusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION, null, msgs);
			if (newStatusInformation != null)
				msgs = ((InternalEObject)newStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION, null, msgs);
			msgs = basicSetStatusInformation(newStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION, newStatusInformation, newStatusInformation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY, oldVisibility, newVisibility);
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
				msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY, null, msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY, null, msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY, newVisibility, newVisibility));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__FILTER, oldFilter, newFilter);
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
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__FILTER, newFilter, newFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
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
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES, newDependencies, newDependencies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT, oldDependenciesScript, newDependenciesScript);
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
				msgs = ((InternalEObject)dependenciesScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			if (newDependenciesScript != null)
				msgs = ((InternalEObject)newDependenciesScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT, null, msgs);
			msgs = basicSetDependenciesScript(newDependenciesScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT, newDependenciesScript, newDependenciesScript));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__FEATURE, oldFeature, newFeature);
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
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__FEATURE, newFeature, newFeature));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION, newSpecification, newSpecification));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY, oldInterfaceOnly, newInterfaceOnly);
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
				msgs = ((InternalEObject)interfaceOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY, null, msgs);
			if (newInterfaceOnly != null)
				msgs = ((InternalEObject)newInterfaceOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY, null, msgs);
			msgs = basicSetInterfaceOnly(newInterfaceOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY, newInterfaceOnly, newInterfaceOnly));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT, oldDecisionPoint, newDecisionPoint);
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
				msgs = ((InternalEObject)decisionPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT, null, msgs);
			if (newDecisionPoint != null)
				msgs = ((InternalEObject)newDecisionPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT, null, msgs);
			msgs = basicSetDecisionPoint(newDecisionPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT, newDecisionPoint, newDecisionPoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES, oldDisturbances, newDisturbances);
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
				msgs = ((InternalEObject)disturbances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES, null, msgs);
			if (newDisturbances != null)
				msgs = ((InternalEObject)newDisturbances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES, null, msgs);
			msgs = basicSetDisturbances(newDisturbances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES, newDisturbances, newDisturbances));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT, oldTakesEffect, newTakesEffect);
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
				msgs = ((InternalEObject)takesEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT, null, msgs);
			if (newTakesEffect != null)
				msgs = ((InternalEObject)newTakesEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT, null, msgs);
			msgs = basicSetTakesEffect(newTakesEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT, newTakesEffect, newTakesEffect));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS, oldSideEffects, newSideEffects);
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
				msgs = ((InternalEObject)sideEffects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS, null, msgs);
			if (newSideEffects != null)
				msgs = ((InternalEObject)newSideEffects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS, null, msgs);
			msgs = basicSetSideEffects(newSideEffects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS, newSideEffects, newSideEffects));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION, oldPrecondition, newPrecondition);
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
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION, newPrecondition, newPrecondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IntegerType getInteger() {
		return integer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInteger(IntegerType newInteger, NotificationChain msgs) {
		IntegerType oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INTEGER, oldInteger, newInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInteger(IntegerType newInteger) {
		if (newInteger != integer) {
			NotificationChain msgs = null;
			if (integer != null)
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.STRUCT_MEMBER_TYPE__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.STRUCT_MEMBER_TYPE__INTEGER, newInteger, newInteger));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__OCTET:
				return basicSetOctet(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__CHAR:
				return basicSetChar(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DOUBLE:
				return basicSetDouble(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__FLOAT:
				return basicSetFloat(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__LONG:
				return basicSetLong(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__LONGLONG:
				return basicSetLonglong(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__SHORT:
				return basicSetShort(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__STRING:
				return basicSetString(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__WSTRING:
				return basicSetWstring(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__INTEGER:
				return basicSetInteger(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__INT8:
				return basicSetInt8(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__INT16:
				return basicSetInt16(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__INT32:
				return basicSetInt32(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__INT64:
				return basicSetInt64(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__UINT8:
				return basicSetUint8(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__UINT16:
				return basicSetUint16(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__UINT32:
				return basicSetUint32(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__UINT64:
				return basicSetUint64(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF:
				return basicSetEnumRef(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__MO_REF:
				return basicSetMoRef(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF:
				return basicSetDerivedDataTypeRef(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED:
				return basicSetDeprecated(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE:
				return basicSetObsolete(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY:
				return basicSetPreliminary(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION:
				return basicSetStatusInformation(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY:
				return basicSetVisibility(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__FILTER:
				return basicSetFilter(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT:
				return basicSetDependenciesScript(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__FEATURE:
				return basicSetFeature(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY:
				return basicSetInterfaceOnly(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT:
				return basicSetDecisionPoint(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES:
				return basicSetDisturbances(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT:
				return basicSetTakesEffect(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS:
				return basicSetSideEffects(null, msgs);
			case MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION:
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
			case MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.STRUCT_MEMBER_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN:
				return getBoolean();
			case MpPackage.STRUCT_MEMBER_TYPE__OCTET:
				return getOctet();
			case MpPackage.STRUCT_MEMBER_TYPE__CHAR:
				return getChar();
			case MpPackage.STRUCT_MEMBER_TYPE__DOUBLE:
				return getDouble();
			case MpPackage.STRUCT_MEMBER_TYPE__FLOAT:
				return getFloat();
			case MpPackage.STRUCT_MEMBER_TYPE__LONG:
				return getLong();
			case MpPackage.STRUCT_MEMBER_TYPE__LONGLONG:
				return getLonglong();
			case MpPackage.STRUCT_MEMBER_TYPE__SHORT:
				return getShort();
			case MpPackage.STRUCT_MEMBER_TYPE__STRING:
				return getString();
			case MpPackage.STRUCT_MEMBER_TYPE__WSTRING:
				return getWstring();
			case MpPackage.STRUCT_MEMBER_TYPE__INTEGER:
				return getInteger();
			case MpPackage.STRUCT_MEMBER_TYPE__INT8:
				return getInt8();
			case MpPackage.STRUCT_MEMBER_TYPE__INT16:
				return getInt16();
			case MpPackage.STRUCT_MEMBER_TYPE__INT32:
				return getInt32();
			case MpPackage.STRUCT_MEMBER_TYPE__INT64:
				return getInt64();
			case MpPackage.STRUCT_MEMBER_TYPE__UINT8:
				return getUint8();
			case MpPackage.STRUCT_MEMBER_TYPE__UINT16:
				return getUint16();
			case MpPackage.STRUCT_MEMBER_TYPE__UINT32:
				return getUint32();
			case MpPackage.STRUCT_MEMBER_TYPE__UINT64:
				return getUint64();
			case MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF:
				return getEnumRef();
			case MpPackage.STRUCT_MEMBER_TYPE__MO_REF:
				return getMoRef();
			case MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE:
				return getSequence();
			case MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF:
				return getDerivedDataTypeRef();
			case MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED:
				return getDeprecated();
			case MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE:
				return getObsolete();
			case MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY:
				return getPreliminary();
			case MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION:
				return getStatusInformation();
			case MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY:
				return getVisibility();
			case MpPackage.STRUCT_MEMBER_TYPE__FILTER:
				return getFilter();
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES:
				return getDependencies();
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT:
				return getDependenciesScript();
			case MpPackage.STRUCT_MEMBER_TYPE__FEATURE:
				return getFeature();
			case MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION:
				return getSpecification();
			case MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY:
				return getInterfaceOnly();
			case MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT:
				return getDecisionPoint();
			case MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES:
				return getDisturbances();
			case MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT:
				return getTakesEffect();
			case MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS:
				return getSideEffects();
			case MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION:
				return getPrecondition();
			case MpPackage.STRUCT_MEMBER_TYPE__NAME:
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
			case MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN:
				setBoolean((BooleanType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__OCTET:
				setOctet((OctetType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__CHAR:
				setChar((CharType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DOUBLE:
				setDouble((DoubleType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__FLOAT:
				setFloat((FloatType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__LONG:
				setLong((LongType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__LONGLONG:
				setLonglong((LonglongType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SHORT:
				setShort((ShortType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__STRING:
				setString((StringType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__WSTRING:
				setWstring((WstringType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INTEGER:
				setInteger((IntegerType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT8:
				setInt8((Int8Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT16:
				setInt16((Int16Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT32:
				setInt32((Int32Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT64:
				setInt64((Int64Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT8:
				setUint8((Uint8Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT16:
				setUint16((Uint16Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT32:
				setUint32((Uint32Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT64:
				setUint64((Uint64Type)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF:
				setEnumRef((EnumRefType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__MO_REF:
				setMoRef((MoRefType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE:
				setSequence((SequenceType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF:
				setDerivedDataTypeRef((DerivedDataTypeRefType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY:
				setVisibility((VisibilityType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__FILTER:
				setFilter((FilterType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__FEATURE:
				setFeature((FeatureType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES:
				setDisturbances((DisturbancesType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT:
				setTakesEffect((TakesEffectType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS:
				setSideEffects((SideEffectsType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)newValue);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__NAME:
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
			case MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN:
				setBoolean((BooleanType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__OCTET:
				setOctet((OctetType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__CHAR:
				setChar((CharType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DOUBLE:
				setDouble((DoubleType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__FLOAT:
				setFloat((FloatType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__LONG:
				setLong((LongType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__LONGLONG:
				setLonglong((LonglongType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SHORT:
				setShort((ShortType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__STRING:
				setString((StringType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__WSTRING:
				setWstring((WstringType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INTEGER:
				setInteger((IntegerType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT8:
				setInt8((Int8Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT16:
				setInt16((Int16Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT32:
				setInt32((Int32Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INT64:
				setInt64((Int64Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT8:
				setUint8((Uint8Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT16:
				setUint16((Uint16Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT32:
				setUint32((Uint32Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT64:
				setUint64((Uint64Type)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF:
				setEnumRef((EnumRefType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__MO_REF:
				setMoRef((MoRefType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE:
				setSequence((SequenceType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF:
				setDerivedDataTypeRef((DerivedDataTypeRefType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED:
				setDeprecated((DeprecatedType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE:
				setObsolete((ObsoleteType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY:
				setPreliminary((PreliminaryType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION:
				setStatusInformation((StatusInformationType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY:
				setVisibility((VisibilityType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__FILTER:
				setFilter((FilterType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT:
				setDependenciesScript((DependenciesScriptType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__FEATURE:
				setFeature((FeatureType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY:
				setInterfaceOnly((InterfaceOnlyType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT:
				setDecisionPoint((DecisionPointType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES:
				setDisturbances((DisturbancesType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT:
				setTakesEffect((TakesEffectType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS:
				setSideEffects((SideEffectsType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION:
				setPrecondition((PreconditionType)null);
				return;
			case MpPackage.STRUCT_MEMBER_TYPE__NAME:
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
			case MpPackage.STRUCT_MEMBER_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.STRUCT_MEMBER_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.STRUCT_MEMBER_TYPE__BOOLEAN:
				return boolean_ != null;
			case MpPackage.STRUCT_MEMBER_TYPE__OCTET:
				return octet != null;
			case MpPackage.STRUCT_MEMBER_TYPE__CHAR:
				return char_ != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DOUBLE:
				return double_ != null;
			case MpPackage.STRUCT_MEMBER_TYPE__FLOAT:
				return float_ != null;
			case MpPackage.STRUCT_MEMBER_TYPE__LONG:
				return long_ != null;
			case MpPackage.STRUCT_MEMBER_TYPE__LONGLONG:
				return longlong != null;
			case MpPackage.STRUCT_MEMBER_TYPE__SHORT:
				return short_ != null;
			case MpPackage.STRUCT_MEMBER_TYPE__STRING:
				return string != null;
			case MpPackage.STRUCT_MEMBER_TYPE__WSTRING:
				return wstring != null;
			case MpPackage.STRUCT_MEMBER_TYPE__INTEGER:
				return integer != null;
			case MpPackage.STRUCT_MEMBER_TYPE__INT8:
				return int8 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__INT16:
				return int16 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__INT32:
				return int32 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__INT64:
				return int64 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT8:
				return uint8 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT16:
				return uint16 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT32:
				return uint32 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__UINT64:
				return uint64 != null;
			case MpPackage.STRUCT_MEMBER_TYPE__ENUM_REF:
				return enumRef != null;
			case MpPackage.STRUCT_MEMBER_TYPE__MO_REF:
				return moRef != null;
			case MpPackage.STRUCT_MEMBER_TYPE__SEQUENCE:
				return sequence != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF:
				return derivedDataTypeRef != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPRECATED:
				return deprecated != null;
			case MpPackage.STRUCT_MEMBER_TYPE__OBSOLETE:
				return obsolete != null;
			case MpPackage.STRUCT_MEMBER_TYPE__PRELIMINARY:
				return preliminary != null;
			case MpPackage.STRUCT_MEMBER_TYPE__STATUS_INFORMATION:
				return statusInformation != null;
			case MpPackage.STRUCT_MEMBER_TYPE__VISIBILITY:
				return visibility != null;
			case MpPackage.STRUCT_MEMBER_TYPE__FILTER:
				return filter != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES:
				return dependencies != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT:
				return dependenciesScript != null;
			case MpPackage.STRUCT_MEMBER_TYPE__FEATURE:
				return feature != null;
			case MpPackage.STRUCT_MEMBER_TYPE__SPECIFICATION:
				return specification != null;
			case MpPackage.STRUCT_MEMBER_TYPE__INTERFACE_ONLY:
				return interfaceOnly != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DECISION_POINT:
				return decisionPoint != null;
			case MpPackage.STRUCT_MEMBER_TYPE__DISTURBANCES:
				return disturbances != null;
			case MpPackage.STRUCT_MEMBER_TYPE__TAKES_EFFECT:
				return takesEffect != null;
			case MpPackage.STRUCT_MEMBER_TYPE__SIDE_EFFECTS:
				return sideEffects != null;
			case MpPackage.STRUCT_MEMBER_TYPE__PRECONDITION:
				return precondition != null;
			case MpPackage.STRUCT_MEMBER_TYPE__NAME:
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

} //StructMemberTypeImpl
