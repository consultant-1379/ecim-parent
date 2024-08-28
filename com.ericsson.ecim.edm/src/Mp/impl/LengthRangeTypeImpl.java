/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.LengthRangeType;
import Mp.MaxType;
import Mp.MinType;
import Mp.MpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.LengthRangeTypeImpl#getMax1 <em>Max1</em>}</li>
 *   <li>{@link Mp.impl.LengthRangeTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link Mp.impl.LengthRangeTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link Mp.impl.LengthRangeTypeImpl#getMin1 <em>Min1</em>}</li>
 *   <li>{@link Mp.impl.LengthRangeTypeImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LengthRangeTypeImpl extends EObjectImpl implements LengthRangeType {
    /**
	 * The cached value of the '{@link #getMax1() <em>Max1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax1()
	 * @generated
	 * @ordered
	 */
    protected EList<MaxType> max1;

    /**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected EList<MinType> min;

    /**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
    protected MaxType max;

    /**
	 * The cached value of the '{@link #getMin1() <em>Min1</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin1()
	 * @generated
	 * @ordered
	 */
    protected MinType min1;

    /**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
    protected FeatureMap group;

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
		return MpPackage.eINSTANCE.getLengthRangeType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MaxType getMax() {
		return max;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMax(MaxType newMax, NotificationChain msgs) {
		MaxType oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.LENGTH_RANGE_TYPE__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMax(MaxType newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.LENGTH_RANGE_TYPE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.LENGTH_RANGE_TYPE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.LENGTH_RANGE_TYPE__MAX, newMax, newMax));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MpPackage.LENGTH_RANGE_TYPE__GROUP);
		}
		return group;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<MinType> getMin() {
		if (min == null) {
			min = new EObjectContainmentEList<MinType>(MinType.class, this, MpPackage.LENGTH_RANGE_TYPE__MIN);
		}
		return min;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<MaxType> getMax1() {
		if (max1 == null) {
			max1 = new EObjectContainmentEList<MaxType>(MaxType.class, this, MpPackage.LENGTH_RANGE_TYPE__MAX1);
		}
		return max1;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MinType getMin1() {
		return min1;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMin1(MinType newMin1, NotificationChain msgs) {
		MinType oldMin1 = min1;
		min1 = newMin1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.LENGTH_RANGE_TYPE__MIN1, oldMin1, newMin1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMin1(MinType newMin1) {
		if (newMin1 != min1) {
			NotificationChain msgs = null;
			if (min1 != null)
				msgs = ((InternalEObject)min1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.LENGTH_RANGE_TYPE__MIN1, null, msgs);
			if (newMin1 != null)
				msgs = ((InternalEObject)newMin1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.LENGTH_RANGE_TYPE__MIN1, null, msgs);
			msgs = basicSetMin1(newMin1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.LENGTH_RANGE_TYPE__MIN1, newMin1, newMin1));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addRanges(String ranges) {
        if (ranges == null || ranges.length() < 4)//check is no length range was specified or if the range was to short to make sense
            return;

        String[] minMaxPairs = ranges.split(",");

        for (String minMax : minMaxPairs) {
            String[] minMaxArray = minMax.split("\\.\\.");

            String minString = minMaxArray[0];
            // create a min range
            MinType min = new MinTypeImpl();
            FeatureMapUtil.addText(min.getMixed(), minString);
            // add the mim range to the group
            getGroup().add(MpPackage.eINSTANCE.getLengthRangeType_Min(), min);

            String maxString = minMaxArray[1];
            
            //don't show a max if the max is unbounded and we only have one pair
            if(!(maxString.equals("*") && minMaxPairs.length==1))
            {
                // create a max range
                MaxType max = new MaxTypeImpl();
                FeatureMapUtil.addText(max.getMixed(), maxString);
                // add the max range to the group
                getGroup().add(MpPackage.eINSTANCE.getLengthRangeType_Max1(), max);
            }

        }
    }

    /**
     * Retrieve the ranges as a comma seperated list
     * @generated NOT
     */
    public String getRanges() {
        String range = "";

        //a multi-range was found so process it
        if(getMin().size() > 1 && getMax1().size() > 1)
        {
            for(int i=0;i<getMin().size();i++)
            {
                if(i>0)
                {
                    range = range + ",";
                }
                range = range + getMin().get(i).getMixed().getValue(0) + ".." + getMax1().get(i).getMixed().getValue(0);
            }    
        }
        else
        {
            //a regular range was found. note a min/max might not be stated, if so assume 0/* respectively
            String singleMin = "";
            String singleMax = "";
            if(getMin().size() == 0)
            {
                singleMin = "0";
            }
            else
            {
                singleMin = (String)getMin().get(0).getMixed().getValue(0);
            }
            
            if(getMax1().size() == 0)
            {
                singleMax = "*";
            }
            else
            {
                singleMax = (String)getMax1().get(0).getMixed().getValue(0);
            }
            range = singleMin + ".." + singleMax;
            
        }
        return range;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.LENGTH_RANGE_TYPE__MAX1:
				return ((InternalEList<?>)getMax1()).basicRemove(otherEnd, msgs);
			case MpPackage.LENGTH_RANGE_TYPE__MIN:
				return ((InternalEList<?>)getMin()).basicRemove(otherEnd, msgs);
			case MpPackage.LENGTH_RANGE_TYPE__MAX:
				return basicSetMax(null, msgs);
			case MpPackage.LENGTH_RANGE_TYPE__MIN1:
				return basicSetMin1(null, msgs);
			case MpPackage.LENGTH_RANGE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case MpPackage.LENGTH_RANGE_TYPE__MAX1:
				return getMax1();
			case MpPackage.LENGTH_RANGE_TYPE__MIN:
				return getMin();
			case MpPackage.LENGTH_RANGE_TYPE__MAX:
				return getMax();
			case MpPackage.LENGTH_RANGE_TYPE__MIN1:
				return getMin1();
			case MpPackage.LENGTH_RANGE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
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
			case MpPackage.LENGTH_RANGE_TYPE__MAX1:
				getMax1().clear();
				getMax1().addAll((Collection<? extends MaxType>)newValue);
				return;
			case MpPackage.LENGTH_RANGE_TYPE__MIN:
				getMin().clear();
				getMin().addAll((Collection<? extends MinType>)newValue);
				return;
			case MpPackage.LENGTH_RANGE_TYPE__MAX:
				setMax((MaxType)newValue);
				return;
			case MpPackage.LENGTH_RANGE_TYPE__MIN1:
				setMin1((MinType)newValue);
				return;
			case MpPackage.LENGTH_RANGE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
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
			case MpPackage.LENGTH_RANGE_TYPE__MAX1:
				getMax1().clear();
				return;
			case MpPackage.LENGTH_RANGE_TYPE__MIN:
				getMin().clear();
				return;
			case MpPackage.LENGTH_RANGE_TYPE__MAX:
				setMax((MaxType)null);
				return;
			case MpPackage.LENGTH_RANGE_TYPE__MIN1:
				setMin1((MinType)null);
				return;
			case MpPackage.LENGTH_RANGE_TYPE__GROUP:
				getGroup().clear();
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
			case MpPackage.LENGTH_RANGE_TYPE__MAX1:
				return max1 != null && !max1.isEmpty();
			case MpPackage.LENGTH_RANGE_TYPE__MIN:
				return min != null && !min.isEmpty();
			case MpPackage.LENGTH_RANGE_TYPE__MAX:
				return max != null;
			case MpPackage.LENGTH_RANGE_TYPE__MIN1:
				return min1 != null;
			case MpPackage.LENGTH_RANGE_TYPE__GROUP:
				return group != null && !group.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //LengthRangeTypeImpl
