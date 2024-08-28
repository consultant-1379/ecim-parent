/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.LengthRangeType;
import TspMim.TspMimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.LengthRangeTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link TspMim.impl.LengthRangeTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link TspMim.impl.LengthRangeTypeImpl#getMax1 <em>Max1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LengthRangeTypeImpl extends EObjectImpl implements LengthRangeType {
    /**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected static final String MIN_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected String min = MIN_EDEFAULT;

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
	 * The default value of the '{@link #getMax1() <em>Max1</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax1()
	 * @generated
	 * @ordered
	 */
    protected static final String MAX1_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMax1() <em>Max1</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax1()
	 * @generated
	 * @ordered
	 */
    protected String max1 = MAX1_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LengthRangeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.LENGTH_RANGE_TYPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getMin() {
		return min;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.LENGTH_RANGE_TYPE__MIN, oldMin, min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.LENGTH_RANGE_TYPE__MAX, oldMax, max));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getMax1() {
		return max1;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMax1(String newMax1) {
		String oldMax1 = max1;
		max1 = newMax1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.LENGTH_RANGE_TYPE__MAX1, oldMax1, max1));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TspMimPackage.LENGTH_RANGE_TYPE__MIN:
				return getMin();
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX:
				return getMax();
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX1:
				return getMax1();
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
			case TspMimPackage.LENGTH_RANGE_TYPE__MIN:
				setMin((String)newValue);
				return;
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX:
				setMax((String)newValue);
				return;
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX1:
				setMax1((String)newValue);
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
			case TspMimPackage.LENGTH_RANGE_TYPE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX1:
				setMax1(MAX1_EDEFAULT);
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
			case TspMimPackage.LENGTH_RANGE_TYPE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case TspMimPackage.LENGTH_RANGE_TYPE__MAX1:
				return MAX1_EDEFAULT == null ? max1 != null : !MAX1_EDEFAULT.equals(max1);
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", max1: ");
		result.append(max1);
		result.append(')');
		return result.toString();
	}

} //LengthRangeTypeImpl
