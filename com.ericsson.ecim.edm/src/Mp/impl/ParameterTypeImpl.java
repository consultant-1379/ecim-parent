/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApplicationTagType;
import Mp.DataTypeType;
import Mp.DescriptionType;
import Mp.DomainExtensionType;
import Mp.InType;
import Mp.InoutType;
import Mp.IsNillableType;
import Mp.MpPackage;
import Mp.OutType;
import Mp.ParameterType;

import Mp.ValidationRulesType;
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
 * An implementation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getIsNillable <em>Is Nillable</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getIn <em>In</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getOut <em>Out</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getInout <em>Inout</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Mp.impl.ParameterTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterTypeImpl extends EObjectImpl implements ParameterType {
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
	 * The cached value of the '{@link #getValidationRules() <em>Validation Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValidationRules()
	 * @generated
	 * @ordered
	 */
    protected ValidationRulesType validationRules;

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
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
    protected InType in;

    /**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
    protected OutType out;

    /**
	 * The cached value of the '{@link #getInout() <em>Inout</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInout()
	 * @generated
	 * @ordered
	 */
    protected InoutType inout;

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
    protected ParameterTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getParameterType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
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
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.PARAMETER_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__VALIDATION_RULES, oldValidationRules, newValidationRules);
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
				msgs = ((InternalEObject)validationRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__VALIDATION_RULES, null, msgs);
			if (newValidationRules != null)
				msgs = ((InternalEObject)newValidationRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__VALIDATION_RULES, null, msgs);
			msgs = basicSetValidationRules(newValidationRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__VALIDATION_RULES, newValidationRules, newValidationRules));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__IS_NILLABLE, oldIsNillable, newIsNillable);
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
				msgs = ((InternalEObject)isNillable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__IS_NILLABLE, null, msgs);
			if (newIsNillable != null)
				msgs = ((InternalEObject)newIsNillable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__IS_NILLABLE, null, msgs);
			msgs = basicSetIsNillable(newIsNillable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__IS_NILLABLE, newIsNillable, newIsNillable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InType getIn() {
		return in;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIn(InType newIn, NotificationChain msgs) {
		InType oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__IN, oldIn, newIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIn(InType newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__IN, null, msgs);
			if (newIn != null)
				msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__IN, null, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__IN, newIn, newIn));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutType getOut() {
		return out;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetOut(OutType newOut, NotificationChain msgs) {
		OutType oldOut = out;
		out = newOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__OUT, oldOut, newOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOut(OutType newOut) {
		if (newOut != out) {
			NotificationChain msgs = null;
			if (out != null)
				msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__OUT, null, msgs);
			if (newOut != null)
				msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__OUT, null, msgs);
			msgs = basicSetOut(newOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__OUT, newOut, newOut));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InoutType getInout() {
		return inout;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInout(InoutType newInout, NotificationChain msgs) {
		InoutType oldInout = inout;
		inout = newInout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__INOUT, oldInout, newInout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInout(InoutType newInout) {
		if (newInout != inout) {
			NotificationChain msgs = null;
			if (inout != null)
				msgs = ((InternalEObject)inout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__INOUT, null, msgs);
			if (newInout != null)
				msgs = ((InternalEObject)newInout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__INOUT, null, msgs);
			msgs = basicSetInout(newInout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__INOUT, newInout, newInout));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__DATA_TYPE, oldDataType, newDataType);
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
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.PARAMETER_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__DATA_TYPE, newDataType, newDataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.PARAMETER_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.PARAMETER_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.PARAMETER_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.PARAMETER_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.PARAMETER_TYPE__VALIDATION_RULES:
				return basicSetValidationRules(null, msgs);
			case MpPackage.PARAMETER_TYPE__IS_NILLABLE:
				return basicSetIsNillable(null, msgs);
			case MpPackage.PARAMETER_TYPE__IN:
				return basicSetIn(null, msgs);
			case MpPackage.PARAMETER_TYPE__OUT:
				return basicSetOut(null, msgs);
			case MpPackage.PARAMETER_TYPE__INOUT:
				return basicSetInout(null, msgs);
			case MpPackage.PARAMETER_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
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
			case MpPackage.PARAMETER_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.PARAMETER_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.PARAMETER_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.PARAMETER_TYPE__VALIDATION_RULES:
				return getValidationRules();
			case MpPackage.PARAMETER_TYPE__IS_NILLABLE:
				return getIsNillable();
			case MpPackage.PARAMETER_TYPE__IN:
				return getIn();
			case MpPackage.PARAMETER_TYPE__OUT:
				return getOut();
			case MpPackage.PARAMETER_TYPE__INOUT:
				return getInout();
			case MpPackage.PARAMETER_TYPE__DATA_TYPE:
				return getDataType();
			case MpPackage.PARAMETER_TYPE__NAME:
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
			case MpPackage.PARAMETER_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__IS_NILLABLE:
				setIsNillable((IsNillableType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__IN:
				setIn((InType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__OUT:
				setOut((OutType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__INOUT:
				setInout((InoutType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__DATA_TYPE:
				setDataType((DataTypeType)newValue);
				return;
			case MpPackage.PARAMETER_TYPE__NAME:
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
			case MpPackage.PARAMETER_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.PARAMETER_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.PARAMETER_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.PARAMETER_TYPE__VALIDATION_RULES:
				setValidationRules((ValidationRulesType)null);
				return;
			case MpPackage.PARAMETER_TYPE__IS_NILLABLE:
				setIsNillable((IsNillableType)null);
				return;
			case MpPackage.PARAMETER_TYPE__IN:
				setIn((InType)null);
				return;
			case MpPackage.PARAMETER_TYPE__OUT:
				setOut((OutType)null);
				return;
			case MpPackage.PARAMETER_TYPE__INOUT:
				setInout((InoutType)null);
				return;
			case MpPackage.PARAMETER_TYPE__DATA_TYPE:
				setDataType((DataTypeType)null);
				return;
			case MpPackage.PARAMETER_TYPE__NAME:
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
			case MpPackage.PARAMETER_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.PARAMETER_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.PARAMETER_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.PARAMETER_TYPE__VALIDATION_RULES:
				return validationRules != null;
			case MpPackage.PARAMETER_TYPE__IS_NILLABLE:
				return isNillable != null;
			case MpPackage.PARAMETER_TYPE__IN:
				return in != null;
			case MpPackage.PARAMETER_TYPE__OUT:
				return out != null;
			case MpPackage.PARAMETER_TYPE__INOUT:
				return inout != null;
			case MpPackage.PARAMETER_TYPE__DATA_TYPE:
				return dataType != null;
			case MpPackage.PARAMETER_TYPE__NAME:
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

} //ParameterTypeImpl
