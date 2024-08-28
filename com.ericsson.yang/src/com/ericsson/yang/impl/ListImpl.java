/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ericsson.yang.List;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.ListImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ListImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ListImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ListImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ListImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ListImpl#getKeylessConfigList <em>Keyless Config List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ListImpl extends NodeImpl implements List {
    /**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
    protected static final String KEY_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
    protected String key = KEY_EDEFAULT;

    /**
	 * The default value of the '{@link #getUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
    protected static final String UNIQUE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
    protected String unique = UNIQUE_EDEFAULT;

    /**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected static final Integer MIN_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected Integer min = MIN_EDEFAULT;

    /**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
    protected static final String MAX_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
    protected String max = MAX_EDEFAULT;

    /**
	 * The default value of the '{@link #getOrderedBy() <em>Ordered By</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
    protected static final String ORDERED_BY_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getOrderedBy() <em>Ordered By</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
    protected String orderedBy = ORDERED_BY_EDEFAULT;

    /**
	 * The default value of the '{@link #getKeylessConfigList() <em>Keyless Config List</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKeylessConfigList()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean KEYLESS_CONFIG_LIST_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getKeylessConfigList() <em>Keyless Config List</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKeylessConfigList()
	 * @generated
	 * @ordered
	 */
    protected Boolean keylessConfigList = KEYLESS_CONFIG_LIST_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ListImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.LIST;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getKey() {
		return key;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LIST__KEY, oldKey, key));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getUnique() {
		return unique;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUnique(String newUnique) {
		String oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LIST__UNIQUE, oldUnique, unique));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getMin() {
		return min;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMin(Integer newMin) {
		Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LIST__MIN, oldMin, min));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getMax() {
		return max;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LIST__MAX, oldMax, max));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getOrderedBy() {
		return orderedBy;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOrderedBy(String newOrderedBy) {
		String oldOrderedBy = orderedBy;
		orderedBy = newOrderedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LIST__ORDERED_BY, oldOrderedBy, orderedBy));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getKeylessConfigList() {
		return keylessConfigList;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setKeylessConfigList(Boolean newKeylessConfigList) {
		Boolean oldKeylessConfigList = keylessConfigList;
		keylessConfigList = newKeylessConfigList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LIST__KEYLESS_CONFIG_LIST, oldKeylessConfigList, keylessConfigList));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YANGPackage.LIST__KEY:
				return getKey();
			case YANGPackage.LIST__UNIQUE:
				return getUnique();
			case YANGPackage.LIST__MIN:
				return getMin();
			case YANGPackage.LIST__MAX:
				return getMax();
			case YANGPackage.LIST__ORDERED_BY:
				return getOrderedBy();
			case YANGPackage.LIST__KEYLESS_CONFIG_LIST:
				return getKeylessConfigList();
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
			case YANGPackage.LIST__KEY:
				setKey((String)newValue);
				return;
			case YANGPackage.LIST__UNIQUE:
				setUnique((String)newValue);
				return;
			case YANGPackage.LIST__MIN:
				setMin((Integer)newValue);
				return;
			case YANGPackage.LIST__MAX:
				setMax((String)newValue);
				return;
			case YANGPackage.LIST__ORDERED_BY:
				setOrderedBy((String)newValue);
				return;
			case YANGPackage.LIST__KEYLESS_CONFIG_LIST:
				setKeylessConfigList((Boolean)newValue);
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
			case YANGPackage.LIST__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case YANGPackage.LIST__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case YANGPackage.LIST__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case YANGPackage.LIST__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case YANGPackage.LIST__ORDERED_BY:
				setOrderedBy(ORDERED_BY_EDEFAULT);
				return;
			case YANGPackage.LIST__KEYLESS_CONFIG_LIST:
				setKeylessConfigList(KEYLESS_CONFIG_LIST_EDEFAULT);
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
			case YANGPackage.LIST__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case YANGPackage.LIST__UNIQUE:
				return UNIQUE_EDEFAULT == null ? unique != null : !UNIQUE_EDEFAULT.equals(unique);
			case YANGPackage.LIST__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case YANGPackage.LIST__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case YANGPackage.LIST__ORDERED_BY:
				return ORDERED_BY_EDEFAULT == null ? orderedBy != null : !ORDERED_BY_EDEFAULT.equals(orderedBy);
			case YANGPackage.LIST__KEYLESS_CONFIG_LIST:
				return KEYLESS_CONFIG_LIST_EDEFAULT == null ? keylessConfigList != null : !KEYLESS_CONFIG_LIST_EDEFAULT.equals(keylessConfigList);
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
		result.append(" (key: ");
		result.append(key);
		result.append(", unique: ");
		result.append(unique);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", orderedBy: ");
		result.append(orderedBy);
		result.append(", keylessConfigList: ");
		result.append(keylessConfigList);
		result.append(')');
		return result.toString();
	}

} //ListImpl
