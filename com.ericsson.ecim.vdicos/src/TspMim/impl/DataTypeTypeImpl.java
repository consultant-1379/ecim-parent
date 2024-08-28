/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.BooleanType;
import TspMim.DataTypeType;
import TspMim.DateTimeType;
import TspMim.DescriptionType;
import TspMim.ExtensionType;
import TspMim.FloatType;
import TspMim.IntegerType;
import TspMim.LdapTypeInfoType;
import TspMim.SequenceType;
import TspMim.StringType;
import TspMim.StructType;
import TspMim.TspMimPackage;

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
 * An implementation of the model object '<em><b>Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getString <em>String</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getLdapTypeInfo <em>Ldap Type Info</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link TspMim.impl.DataTypeTypeImpl#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeTypeImpl extends EObjectImpl implements DataTypeType {
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
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
    protected EList<ExtensionType> extension;

    /**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
    protected StructType struct;

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
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
    protected BooleanType boolean_;

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
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
    protected DateTimeType dateTime;

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
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
    protected SequenceType sequence;

    /**
	 * The cached value of the '{@link #getLdapTypeInfo() <em>Ldap Type Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLdapTypeInfo()
	 * @generated
	 * @ordered
	 */
    protected LdapTypeInfoType ldapTypeInfo;

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
	 * The default value of the '{@link #getNameRef() <em>Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNameRef()
	 * @generated
	 * @ordered
	 */
    protected static final Object NAME_REF_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNameRef()
	 * @generated
	 * @ordered
	 */
    protected Object nameRef = NAME_REF_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DataTypeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.DATA_TYPE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<ExtensionType>(ExtensionType.class, this, TspMimPackage.DATA_TYPE_TYPE__EXTENSION);
		}
		return extension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StructType getStruct() {
		return struct;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetStruct(StructType newStruct, NotificationChain msgs) {
		StructType oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStruct(StructType newStruct) {
		if (newStruct != struct) {
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__STRUCT, newStruct, newStruct));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__STRING, oldString, newString);
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
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__STRING, newString, newString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__BOOLEAN, oldBoolean, newBoolean);
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
				msgs = ((InternalEObject)boolean_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__BOOLEAN, null, msgs);
			if (newBoolean != null)
				msgs = ((InternalEObject)newBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__BOOLEAN, null, msgs);
			msgs = basicSetBoolean(newBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__BOOLEAN, newBoolean, newBoolean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__INTEGER, oldInteger, newInteger);
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
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__INTEGER, newInteger, newInteger));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DateTimeType getDateTime() {
		return dateTime;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDateTime(DateTimeType newDateTime, NotificationChain msgs) {
		DateTimeType oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDateTime(DateTimeType newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__DATE_TIME, newDateTime, newDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__FLOAT, oldFloat, newFloat);
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
				msgs = ((InternalEObject)float_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__FLOAT, null, msgs);
			if (newFloat != null)
				msgs = ((InternalEObject)newFloat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__FLOAT, null, msgs);
			msgs = basicSetFloat(newFloat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__FLOAT, newFloat, newFloat));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__SEQUENCE, oldSequence, newSequence);
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
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__SEQUENCE, newSequence, newSequence));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LdapTypeInfoType getLdapTypeInfo() {
		return ldapTypeInfo;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLdapTypeInfo(LdapTypeInfoType newLdapTypeInfo, NotificationChain msgs) {
		LdapTypeInfoType oldLdapTypeInfo = ldapTypeInfo;
		ldapTypeInfo = newLdapTypeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO, oldLdapTypeInfo, newLdapTypeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLdapTypeInfo(LdapTypeInfoType newLdapTypeInfo) {
		if (newLdapTypeInfo != ldapTypeInfo) {
			NotificationChain msgs = null;
			if (ldapTypeInfo != null)
				msgs = ((InternalEObject)ldapTypeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO, null, msgs);
			if (newLdapTypeInfo != null)
				msgs = ((InternalEObject)newLdapTypeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO, null, msgs);
			msgs = basicSetLdapTypeInfo(newLdapTypeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO, newLdapTypeInfo, newLdapTypeInfo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getNameRef() {
		return nameRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNameRef(Object newNameRef) {
		Object oldNameRef = nameRef;
		nameRef = newNameRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.DATA_TYPE_TYPE__NAME_REF, oldNameRef, nameRef));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__STRUCT:
				return basicSetStruct(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__STRING:
				return basicSetString(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__INTEGER:
				return basicSetInteger(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__FLOAT:
				return basicSetFloat(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO:
				return basicSetLdapTypeInfo(null, msgs);
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
			case TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION:
				return getDescription();
			case TspMimPackage.DATA_TYPE_TYPE__EXTENSION:
				return getExtension();
			case TspMimPackage.DATA_TYPE_TYPE__STRUCT:
				return getStruct();
			case TspMimPackage.DATA_TYPE_TYPE__STRING:
				return getString();
			case TspMimPackage.DATA_TYPE_TYPE__BOOLEAN:
				return getBoolean();
			case TspMimPackage.DATA_TYPE_TYPE__INTEGER:
				return getInteger();
			case TspMimPackage.DATA_TYPE_TYPE__DATE_TIME:
				return getDateTime();
			case TspMimPackage.DATA_TYPE_TYPE__FLOAT:
				return getFloat();
			case TspMimPackage.DATA_TYPE_TYPE__SEQUENCE:
				return getSequence();
			case TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO:
				return getLdapTypeInfo();
			case TspMimPackage.DATA_TYPE_TYPE__NAME:
				return getName();
			case TspMimPackage.DATA_TYPE_TYPE__NAME_REF:
				return getNameRef();
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
			case TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionType>)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__STRUCT:
				setStruct((StructType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__STRING:
				setString((StringType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__BOOLEAN:
				setBoolean((BooleanType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__INTEGER:
				setInteger((IntegerType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__DATE_TIME:
				setDateTime((DateTimeType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__FLOAT:
				setFloat((FloatType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__SEQUENCE:
				setSequence((SequenceType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO:
				setLdapTypeInfo((LdapTypeInfoType)newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__NAME:
				setName(newValue);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__NAME_REF:
				setNameRef(newValue);
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
			case TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case TspMimPackage.DATA_TYPE_TYPE__STRUCT:
				setStruct((StructType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__STRING:
				setString((StringType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__BOOLEAN:
				setBoolean((BooleanType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__INTEGER:
				setInteger((IntegerType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__DATE_TIME:
				setDateTime((DateTimeType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__FLOAT:
				setFloat((FloatType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__SEQUENCE:
				setSequence((SequenceType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO:
				setLdapTypeInfo((LdapTypeInfoType)null);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TspMimPackage.DATA_TYPE_TYPE__NAME_REF:
				setNameRef(NAME_REF_EDEFAULT);
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
			case TspMimPackage.DATA_TYPE_TYPE__DESCRIPTION:
				return description != null;
			case TspMimPackage.DATA_TYPE_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case TspMimPackage.DATA_TYPE_TYPE__STRUCT:
				return struct != null;
			case TspMimPackage.DATA_TYPE_TYPE__STRING:
				return string != null;
			case TspMimPackage.DATA_TYPE_TYPE__BOOLEAN:
				return boolean_ != null;
			case TspMimPackage.DATA_TYPE_TYPE__INTEGER:
				return integer != null;
			case TspMimPackage.DATA_TYPE_TYPE__DATE_TIME:
				return dateTime != null;
			case TspMimPackage.DATA_TYPE_TYPE__FLOAT:
				return float_ != null;
			case TspMimPackage.DATA_TYPE_TYPE__SEQUENCE:
				return sequence != null;
			case TspMimPackage.DATA_TYPE_TYPE__LDAP_TYPE_INFO:
				return ldapTypeInfo != null;
			case TspMimPackage.DATA_TYPE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TspMimPackage.DATA_TYPE_TYPE__NAME_REF:
				return NAME_REF_EDEFAULT == null ? nameRef != null : !NAME_REF_EDEFAULT.equals(nameRef);
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
		result.append(", nameRef: ");
		result.append(nameRef);
		result.append(')');
		return result.toString();
	}

} //DataTypeTypeImpl
