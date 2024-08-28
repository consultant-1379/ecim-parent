/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ericsson.yang.DataDefinition;
import com.ericsson.yang.LeafList;
import com.ericsson.yang.List;
import com.ericsson.yang.Node;
import com.ericsson.yang.YANGPackage;
import com.ericsson.yang.util.Helpers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getKeylessConfigList <em>Keyless Config List</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafListImpl#getNonUniqueLeafList <em>Non Unique Leaf List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafListImpl extends LeafImpl implements LeafList {
    /**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
    protected EList<DataDefinition> children;

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
	 * The default value of the '{@link #getNonUniqueLeafList() <em>Non Unique Leaf List</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNonUniqueLeafList()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean NON_UNIQUE_LEAF_LIST_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNonUniqueLeafList() <em>Non Unique Leaf List</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNonUniqueLeafList()
	 * @generated
	 * @ordered
	 */
    protected Boolean nonUniqueLeafList = NON_UNIQUE_LEAF_LIST_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LeafListImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.LEAF_LIST;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DataDefinition> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<DataDefinition>(DataDefinition.class, this, YANGPackage.LEAF_LIST__CHILDREN);
		}
		return children;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF_LIST__KEY, oldKey, key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF_LIST__UNIQUE, oldUnique, unique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF_LIST__MIN, oldMin, min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF_LIST__MAX, oldMax, max));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF_LIST__ORDERED_BY, oldOrderedBy, orderedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF_LIST__KEYLESS_CONFIG_LIST, oldKeylessConfigList, keylessConfigList));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getNonUniqueLeafList() {
		return nonUniqueLeafList;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNonUniqueLeafList(Boolean newNonUniqueLeafList) {
		Boolean oldNonUniqueLeafList = nonUniqueLeafList;
		nonUniqueLeafList = newNonUniqueLeafList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF_LIST__NON_UNIQUE_LEAF_LIST, oldNonUniqueLeafList, nonUniqueLeafList));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.LEAF_LIST__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case YANGPackage.LEAF_LIST__CHILDREN:
				return getChildren();
			case YANGPackage.LEAF_LIST__KEY:
				return getKey();
			case YANGPackage.LEAF_LIST__UNIQUE:
				return getUnique();
			case YANGPackage.LEAF_LIST__MIN:
				return getMin();
			case YANGPackage.LEAF_LIST__MAX:
				return getMax();
			case YANGPackage.LEAF_LIST__ORDERED_BY:
				return getOrderedBy();
			case YANGPackage.LEAF_LIST__KEYLESS_CONFIG_LIST:
				return getKeylessConfigList();
			case YANGPackage.LEAF_LIST__NON_UNIQUE_LEAF_LIST:
				return getNonUniqueLeafList();
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
			case YANGPackage.LEAF_LIST__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends DataDefinition>)newValue);
				return;
			case YANGPackage.LEAF_LIST__KEY:
				setKey((String)newValue);
				return;
			case YANGPackage.LEAF_LIST__UNIQUE:
				setUnique((String)newValue);
				return;
			case YANGPackage.LEAF_LIST__MIN:
				setMin((Integer)newValue);
				return;
			case YANGPackage.LEAF_LIST__MAX:
				setMax((String)newValue);
				return;
			case YANGPackage.LEAF_LIST__ORDERED_BY:
				setOrderedBy((String)newValue);
				return;
			case YANGPackage.LEAF_LIST__KEYLESS_CONFIG_LIST:
				setKeylessConfigList((Boolean)newValue);
				return;
			case YANGPackage.LEAF_LIST__NON_UNIQUE_LEAF_LIST:
				setNonUniqueLeafList((Boolean)newValue);
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
			case YANGPackage.LEAF_LIST__CHILDREN:
				getChildren().clear();
				return;
			case YANGPackage.LEAF_LIST__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case YANGPackage.LEAF_LIST__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case YANGPackage.LEAF_LIST__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case YANGPackage.LEAF_LIST__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case YANGPackage.LEAF_LIST__ORDERED_BY:
				setOrderedBy(ORDERED_BY_EDEFAULT);
				return;
			case YANGPackage.LEAF_LIST__KEYLESS_CONFIG_LIST:
				setKeylessConfigList(KEYLESS_CONFIG_LIST_EDEFAULT);
				return;
			case YANGPackage.LEAF_LIST__NON_UNIQUE_LEAF_LIST:
				setNonUniqueLeafList(NON_UNIQUE_LEAF_LIST_EDEFAULT);
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
			case YANGPackage.LEAF_LIST__CHILDREN:
				return children != null && !children.isEmpty();
			case YANGPackage.LEAF_LIST__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case YANGPackage.LEAF_LIST__UNIQUE:
				return UNIQUE_EDEFAULT == null ? unique != null : !UNIQUE_EDEFAULT.equals(unique);
			case YANGPackage.LEAF_LIST__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case YANGPackage.LEAF_LIST__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case YANGPackage.LEAF_LIST__ORDERED_BY:
				return ORDERED_BY_EDEFAULT == null ? orderedBy != null : !ORDERED_BY_EDEFAULT.equals(orderedBy);
			case YANGPackage.LEAF_LIST__KEYLESS_CONFIG_LIST:
				return KEYLESS_CONFIG_LIST_EDEFAULT == null ? keylessConfigList != null : !KEYLESS_CONFIG_LIST_EDEFAULT.equals(keylessConfigList);
			case YANGPackage.LEAF_LIST__NON_UNIQUE_LEAF_LIST:
				return NON_UNIQUE_LEAF_LIST_EDEFAULT == null ? nonUniqueLeafList != null : !NON_UNIQUE_LEAF_LIST_EDEFAULT.equals(nonUniqueLeafList);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case YANGPackage.LEAF_LIST__CHILDREN: return YANGPackage.NODE__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == List.class) {
			switch (derivedFeatureID) {
				case YANGPackage.LEAF_LIST__KEY: return YANGPackage.LIST__KEY;
				case YANGPackage.LEAF_LIST__UNIQUE: return YANGPackage.LIST__UNIQUE;
				case YANGPackage.LEAF_LIST__MIN: return YANGPackage.LIST__MIN;
				case YANGPackage.LEAF_LIST__MAX: return YANGPackage.LIST__MAX;
				case YANGPackage.LEAF_LIST__ORDERED_BY: return YANGPackage.LIST__ORDERED_BY;
				case YANGPackage.LEAF_LIST__KEYLESS_CONFIG_LIST: return YANGPackage.LIST__KEYLESS_CONFIG_LIST;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case YANGPackage.NODE__CHILDREN: return YANGPackage.LEAF_LIST__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == List.class) {
			switch (baseFeatureID) {
				case YANGPackage.LIST__KEY: return YANGPackage.LEAF_LIST__KEY;
				case YANGPackage.LIST__UNIQUE: return YANGPackage.LEAF_LIST__UNIQUE;
				case YANGPackage.LIST__MIN: return YANGPackage.LEAF_LIST__MIN;
				case YANGPackage.LIST__MAX: return YANGPackage.LEAF_LIST__MAX;
				case YANGPackage.LIST__ORDERED_BY: return YANGPackage.LEAF_LIST__ORDERED_BY;
				case YANGPackage.LIST__KEYLESS_CONFIG_LIST: return YANGPackage.LEAF_LIST__KEYLESS_CONFIG_LIST;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", nonUniqueLeafList: ");
		result.append(nonUniqueLeafList);
		result.append(')');
		return result.toString();
	}
} //LeafListImpl
