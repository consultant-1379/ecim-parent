/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.BaseTypeType;
import Mp.BooleanType;
import Mp.CharType;
import Mp.Decimal64Type;
import Mp.DerivedDataTypeRefType;
import Mp.DoubleType;
import Mp.EnumRefType;
import Mp.FloatType;
import Mp.Int16Type;
import Mp.Int32Type;
import Mp.Int64Type;
import Mp.Int8Type;
import Mp.IntegerType;
import Mp.LongType;
import Mp.LonglongType;
import Mp.MoRefType;
import Mp.MpPackage;
import Mp.OctetType;
import Mp.SequenceType;
import Mp.ShortType;
import Mp.StringType;
import Mp.StructRefType;
import Mp.Uint16Type;
import Mp.Uint32Type;
import Mp.Uint64Type;
import Mp.Uint8Type;
import Mp.WstringType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getOctet <em>Octet</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getLong <em>Long</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getLonglong <em>Longlong</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getShort <em>Short</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getString <em>String</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getWstring <em>Wstring</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getInt8 <em>Int8</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getInt16 <em>Int16</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getInt32 <em>Int32</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getInt64 <em>Int64</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getUint8 <em>Uint8</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getUint16 <em>Uint16</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getUint32 <em>Uint32</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getUint64 <em>Uint64</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getEnumRef <em>Enum Ref</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getMoRef <em>Mo Ref</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}</li>
 *   <li>{@link Mp.impl.BaseTypeTypeImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseTypeTypeImpl extends EObjectImpl implements BaseTypeType {
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
	 * The cached value of the '{@link #getStructRef() <em>Struct Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStructRef()
	 * @generated
	 * @ordered
	 */
    protected StructRefType structRef;

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
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
    protected SequenceType sequence;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BaseTypeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getBaseTypeType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__BOOLEAN, oldBoolean, newBoolean);
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
				msgs = ((InternalEObject)boolean_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__BOOLEAN, null, msgs);
			if (newBoolean != null)
				msgs = ((InternalEObject)newBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__BOOLEAN, null, msgs);
			msgs = basicSetBoolean(newBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__BOOLEAN, newBoolean, newBoolean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__OCTET, oldOctet, newOctet);
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
				msgs = ((InternalEObject)octet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__OCTET, null, msgs);
			if (newOctet != null)
				msgs = ((InternalEObject)newOctet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__OCTET, null, msgs);
			msgs = basicSetOctet(newOctet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__OCTET, newOctet, newOctet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__CHAR, oldChar, newChar);
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
				msgs = ((InternalEObject)char_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__CHAR, null, msgs);
			if (newChar != null)
				msgs = ((InternalEObject)newChar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__CHAR, null, msgs);
			msgs = basicSetChar(newChar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__CHAR, newChar, newChar));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__DOUBLE, oldDouble, newDouble);
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
				msgs = ((InternalEObject)double_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__DOUBLE, null, msgs);
			if (newDouble != null)
				msgs = ((InternalEObject)newDouble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__DOUBLE, null, msgs);
			msgs = basicSetDouble(newDouble, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__DOUBLE, newDouble, newDouble));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__FLOAT, oldFloat, newFloat);
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
				msgs = ((InternalEObject)float_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__FLOAT, null, msgs);
			if (newFloat != null)
				msgs = ((InternalEObject)newFloat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__FLOAT, null, msgs);
			msgs = basicSetFloat(newFloat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__FLOAT, newFloat, newFloat));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__LONG, oldLong, newLong);
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
				msgs = ((InternalEObject)long_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__LONG, null, msgs);
			if (newLong != null)
				msgs = ((InternalEObject)newLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__LONG, null, msgs);
			msgs = basicSetLong(newLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__LONG, newLong, newLong));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__LONGLONG, oldLonglong, newLonglong);
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
				msgs = ((InternalEObject)longlong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__LONGLONG, null, msgs);
			if (newLonglong != null)
				msgs = ((InternalEObject)newLonglong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__LONGLONG, null, msgs);
			msgs = basicSetLonglong(newLonglong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__LONGLONG, newLonglong, newLonglong));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__SHORT, oldShort, newShort);
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
				msgs = ((InternalEObject)short_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__SHORT, null, msgs);
			if (newShort != null)
				msgs = ((InternalEObject)newShort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__SHORT, null, msgs);
			msgs = basicSetShort(newShort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__SHORT, newShort, newShort));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__STRING, oldString, newString);
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
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__STRING, newString, newString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__WSTRING, oldWstring, newWstring);
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
				msgs = ((InternalEObject)wstring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__WSTRING, null, msgs);
			if (newWstring != null)
				msgs = ((InternalEObject)newWstring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__WSTRING, null, msgs);
			msgs = basicSetWstring(newWstring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__WSTRING, newWstring, newWstring));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT8, oldInt8, newInt8);
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
				msgs = ((InternalEObject)int8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT8, null, msgs);
			if (newInt8 != null)
				msgs = ((InternalEObject)newInt8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT8, null, msgs);
			msgs = basicSetInt8(newInt8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT8, newInt8, newInt8));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT16, oldInt16, newInt16);
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
				msgs = ((InternalEObject)int16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT16, null, msgs);
			if (newInt16 != null)
				msgs = ((InternalEObject)newInt16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT16, null, msgs);
			msgs = basicSetInt16(newInt16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT16, newInt16, newInt16));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT32, oldInt32, newInt32);
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
				msgs = ((InternalEObject)int32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT32, null, msgs);
			if (newInt32 != null)
				msgs = ((InternalEObject)newInt32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT32, null, msgs);
			msgs = basicSetInt32(newInt32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT32, newInt32, newInt32));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT64, oldInt64, newInt64);
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
				msgs = ((InternalEObject)int64).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT64, null, msgs);
			if (newInt64 != null)
				msgs = ((InternalEObject)newInt64).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INT64, null, msgs);
			msgs = basicSetInt64(newInt64, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INT64, newInt64, newInt64));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT8, oldUint8, newUint8);
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
				msgs = ((InternalEObject)uint8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT8, null, msgs);
			if (newUint8 != null)
				msgs = ((InternalEObject)newUint8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT8, null, msgs);
			msgs = basicSetUint8(newUint8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT8, newUint8, newUint8));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT16, oldUint16, newUint16);
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
				msgs = ((InternalEObject)uint16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT16, null, msgs);
			if (newUint16 != null)
				msgs = ((InternalEObject)newUint16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT16, null, msgs);
			msgs = basicSetUint16(newUint16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT16, newUint16, newUint16));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT32, oldUint32, newUint32);
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
				msgs = ((InternalEObject)uint32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT32, null, msgs);
			if (newUint32 != null)
				msgs = ((InternalEObject)newUint32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT32, null, msgs);
			msgs = basicSetUint32(newUint32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT32, newUint32, newUint32));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT64, oldUint64, newUint64);
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
				msgs = ((InternalEObject)uint64).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT64, null, msgs);
			if (newUint64 != null)
				msgs = ((InternalEObject)newUint64).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__UINT64, null, msgs);
			msgs = basicSetUint64(newUint64, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__UINT64, newUint64, newUint64));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__ENUM_REF, oldEnumRef, newEnumRef);
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
				msgs = ((InternalEObject)enumRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__ENUM_REF, null, msgs);
			if (newEnumRef != null)
				msgs = ((InternalEObject)newEnumRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__ENUM_REF, null, msgs);
			msgs = basicSetEnumRef(newEnumRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__ENUM_REF, newEnumRef, newEnumRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__MO_REF, oldMoRef, newMoRef);
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
				msgs = ((InternalEObject)moRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__MO_REF, null, msgs);
			if (newMoRef != null)
				msgs = ((InternalEObject)newMoRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__MO_REF, null, msgs);
			msgs = basicSetMoRef(newMoRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__MO_REF, newMoRef, newMoRef));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StructRefType getStructRef() {
		return structRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetStructRef(StructRefType newStructRef, NotificationChain msgs) {
		StructRefType oldStructRef = structRef;
		structRef = newStructRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__STRUCT_REF, oldStructRef, newStructRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStructRef(StructRefType newStructRef) {
		if (newStructRef != structRef) {
			NotificationChain msgs = null;
			if (structRef != null)
				msgs = ((InternalEObject)structRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__STRUCT_REF, null, msgs);
			if (newStructRef != null)
				msgs = ((InternalEObject)newStructRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__STRUCT_REF, null, msgs);
			msgs = basicSetStructRef(newStructRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__STRUCT_REF, newStructRef, newStructRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF, oldDerivedDataTypeRef, newDerivedDataTypeRef);
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
				msgs = ((InternalEObject)derivedDataTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF, null, msgs);
			if (newDerivedDataTypeRef != null)
				msgs = ((InternalEObject)newDerivedDataTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF, null, msgs);
			msgs = basicSetDerivedDataTypeRef(newDerivedDataTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF, newDerivedDataTypeRef, newDerivedDataTypeRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__SEQUENCE, oldSequence, newSequence);
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
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__SEQUENCE, newSequence, newSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INTEGER, oldInteger, newInteger);
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
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BASE_TYPE_TYPE__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BASE_TYPE_TYPE__INTEGER, newInteger, newInteger));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.BASE_TYPE_TYPE__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__OCTET:
				return basicSetOctet(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__CHAR:
				return basicSetChar(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__DOUBLE:
				return basicSetDouble(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__FLOAT:
				return basicSetFloat(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__LONG:
				return basicSetLong(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__LONGLONG:
				return basicSetLonglong(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__SHORT:
				return basicSetShort(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__STRING:
				return basicSetString(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__WSTRING:
				return basicSetWstring(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__INTEGER:
				return basicSetInteger(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__INT8:
				return basicSetInt8(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__INT16:
				return basicSetInt16(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__INT32:
				return basicSetInt32(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__INT64:
				return basicSetInt64(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__UINT8:
				return basicSetUint8(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__UINT16:
				return basicSetUint16(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__UINT32:
				return basicSetUint32(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__UINT64:
				return basicSetUint64(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__ENUM_REF:
				return basicSetEnumRef(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__MO_REF:
				return basicSetMoRef(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__STRUCT_REF:
				return basicSetStructRef(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF:
				return basicSetDerivedDataTypeRef(null, msgs);
			case MpPackage.BASE_TYPE_TYPE__SEQUENCE:
				return basicSetSequence(null, msgs);
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
			case MpPackage.BASE_TYPE_TYPE__BOOLEAN:
				return getBoolean();
			case MpPackage.BASE_TYPE_TYPE__OCTET:
				return getOctet();
			case MpPackage.BASE_TYPE_TYPE__CHAR:
				return getChar();
			case MpPackage.BASE_TYPE_TYPE__DOUBLE:
				return getDouble();
			case MpPackage.BASE_TYPE_TYPE__FLOAT:
				return getFloat();
			case MpPackage.BASE_TYPE_TYPE__LONG:
				return getLong();
			case MpPackage.BASE_TYPE_TYPE__LONGLONG:
				return getLonglong();
			case MpPackage.BASE_TYPE_TYPE__SHORT:
				return getShort();
			case MpPackage.BASE_TYPE_TYPE__STRING:
				return getString();
			case MpPackage.BASE_TYPE_TYPE__WSTRING:
				return getWstring();
			case MpPackage.BASE_TYPE_TYPE__INTEGER:
				return getInteger();
			case MpPackage.BASE_TYPE_TYPE__INT8:
				return getInt8();
			case MpPackage.BASE_TYPE_TYPE__INT16:
				return getInt16();
			case MpPackage.BASE_TYPE_TYPE__INT32:
				return getInt32();
			case MpPackage.BASE_TYPE_TYPE__INT64:
				return getInt64();
			case MpPackage.BASE_TYPE_TYPE__UINT8:
				return getUint8();
			case MpPackage.BASE_TYPE_TYPE__UINT16:
				return getUint16();
			case MpPackage.BASE_TYPE_TYPE__UINT32:
				return getUint32();
			case MpPackage.BASE_TYPE_TYPE__UINT64:
				return getUint64();
			case MpPackage.BASE_TYPE_TYPE__ENUM_REF:
				return getEnumRef();
			case MpPackage.BASE_TYPE_TYPE__MO_REF:
				return getMoRef();
			case MpPackage.BASE_TYPE_TYPE__STRUCT_REF:
				return getStructRef();
			case MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF:
				return getDerivedDataTypeRef();
			case MpPackage.BASE_TYPE_TYPE__SEQUENCE:
				return getSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpPackage.BASE_TYPE_TYPE__BOOLEAN:
				setBoolean((BooleanType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__OCTET:
				setOctet((OctetType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__CHAR:
				setChar((CharType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__DOUBLE:
				setDouble((DoubleType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__FLOAT:
				setFloat((FloatType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__LONG:
				setLong((LongType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__LONGLONG:
				setLonglong((LonglongType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__SHORT:
				setShort((ShortType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__STRING:
				setString((StringType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__WSTRING:
				setWstring((WstringType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__INTEGER:
				setInteger((IntegerType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT8:
				setInt8((Int8Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT16:
				setInt16((Int16Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT32:
				setInt32((Int32Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT64:
				setInt64((Int64Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT8:
				setUint8((Uint8Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT16:
				setUint16((Uint16Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT32:
				setUint32((Uint32Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT64:
				setUint64((Uint64Type)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__ENUM_REF:
				setEnumRef((EnumRefType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__MO_REF:
				setMoRef((MoRefType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__STRUCT_REF:
				setStructRef((StructRefType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF:
				setDerivedDataTypeRef((DerivedDataTypeRefType)newValue);
				return;
			case MpPackage.BASE_TYPE_TYPE__SEQUENCE:
				setSequence((SequenceType)newValue);
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
			case MpPackage.BASE_TYPE_TYPE__BOOLEAN:
				setBoolean((BooleanType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__OCTET:
				setOctet((OctetType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__CHAR:
				setChar((CharType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__DOUBLE:
				setDouble((DoubleType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__FLOAT:
				setFloat((FloatType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__LONG:
				setLong((LongType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__LONGLONG:
				setLonglong((LonglongType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__SHORT:
				setShort((ShortType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__STRING:
				setString((StringType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__WSTRING:
				setWstring((WstringType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__INTEGER:
				setInteger((IntegerType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT8:
				setInt8((Int8Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT16:
				setInt16((Int16Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT32:
				setInt32((Int32Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__INT64:
				setInt64((Int64Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT8:
				setUint8((Uint8Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT16:
				setUint16((Uint16Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT32:
				setUint32((Uint32Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__UINT64:
				setUint64((Uint64Type)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__ENUM_REF:
				setEnumRef((EnumRefType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__MO_REF:
				setMoRef((MoRefType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__STRUCT_REF:
				setStructRef((StructRefType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF:
				setDerivedDataTypeRef((DerivedDataTypeRefType)null);
				return;
			case MpPackage.BASE_TYPE_TYPE__SEQUENCE:
				setSequence((SequenceType)null);
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
			case MpPackage.BASE_TYPE_TYPE__BOOLEAN:
				return boolean_ != null;
			case MpPackage.BASE_TYPE_TYPE__OCTET:
				return octet != null;
			case MpPackage.BASE_TYPE_TYPE__CHAR:
				return char_ != null;
			case MpPackage.BASE_TYPE_TYPE__DOUBLE:
				return double_ != null;
			case MpPackage.BASE_TYPE_TYPE__FLOAT:
				return float_ != null;
			case MpPackage.BASE_TYPE_TYPE__LONG:
				return long_ != null;
			case MpPackage.BASE_TYPE_TYPE__LONGLONG:
				return longlong != null;
			case MpPackage.BASE_TYPE_TYPE__SHORT:
				return short_ != null;
			case MpPackage.BASE_TYPE_TYPE__STRING:
				return string != null;
			case MpPackage.BASE_TYPE_TYPE__WSTRING:
				return wstring != null;
			case MpPackage.BASE_TYPE_TYPE__INTEGER:
				return integer != null;
			case MpPackage.BASE_TYPE_TYPE__INT8:
				return int8 != null;
			case MpPackage.BASE_TYPE_TYPE__INT16:
				return int16 != null;
			case MpPackage.BASE_TYPE_TYPE__INT32:
				return int32 != null;
			case MpPackage.BASE_TYPE_TYPE__INT64:
				return int64 != null;
			case MpPackage.BASE_TYPE_TYPE__UINT8:
				return uint8 != null;
			case MpPackage.BASE_TYPE_TYPE__UINT16:
				return uint16 != null;
			case MpPackage.BASE_TYPE_TYPE__UINT32:
				return uint32 != null;
			case MpPackage.BASE_TYPE_TYPE__UINT64:
				return uint64 != null;
			case MpPackage.BASE_TYPE_TYPE__ENUM_REF:
				return enumRef != null;
			case MpPackage.BASE_TYPE_TYPE__MO_REF:
				return moRef != null;
			case MpPackage.BASE_TYPE_TYPE__STRUCT_REF:
				return structRef != null;
			case MpPackage.BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF:
				return derivedDataTypeRef != null;
			case MpPackage.BASE_TYPE_TYPE__SEQUENCE:
				return sequence != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseTypeTypeImpl
