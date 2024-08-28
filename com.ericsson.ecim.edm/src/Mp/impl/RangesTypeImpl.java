/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import Mp.MaxType;
import Mp.MinType;
import Mp.MpPackage;
import Mp.RangesType;
import Mp.SubrangeType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ranges Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.RangesTypeImpl#getSubrange <em>Subrange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangesTypeImpl extends EObjectImpl implements RangesType {
    /**
	 * The cached value of the '{@link #getSubrange() <em>Subrange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubrange()
	 * @generated
	 * @ordered
	 */
    protected EList<SubrangeType> subrange;

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected RangesTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getRangesType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SubrangeType> getSubrange() {
		if (subrange == null) {
			subrange = new EObjectContainmentEList<SubrangeType>(SubrangeType.class, this, MpPackage.RANGES_TYPE__SUBRANGE);
		}
		return subrange;
	}

    /**
     * Set ranges in a predetermined order
     * 
     * @generated NOT
     */
    public void addRanges(String ranges) {
        if (ranges == null || ranges.length() < 4)// check is no range was
                                                    // specified or if the range
                                                    // was to short to make
                                                    // sense
            return;

        String[] minMaxPairs = ranges.split(",");
        
        EList<SubrangeType> subRangeValue = getSubrange();
        subRangeValue.clear();

        int index=0;
        for (String minMax : minMaxPairs) {
            String[] minMaxArray = minMax.split("\\.\\.");

            SubrangeType subRange = new SubrangeTypeImpl();

            String minString = minMaxArray[0];
            MinType min = new MinTypeImpl();
            FeatureMapUtil.addText(min.getMixed(), minString);
            subRange.setMin(min);

            String maxString = minMaxArray[1];
            MaxType max = new MaxTypeImpl();
            FeatureMapUtil.addText(max.getMixed(), maxString);
            subRange.setMax(max);
            
            subRangeValue.add(index++, subRange);
        }
    }

    /**
     * Retrieve the ranges as a comma separated list
     * 
     * @generated NOT
     */
    public String getRanges() {
        String range = "";

        for (int i = 0; i < getSubrange().size(); i++) {
            if (i > 0) {
                range = range + ",";
            }
            range = range
                    + getSubrange().get(i).getMin().getMixed().getValue(0)
                    + ".."
                    + getSubrange().get(i).getMax().getMixed().getValue(0);
        }

        return range;
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
            int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.RANGES_TYPE__SUBRANGE:
				return ((InternalEList<?>)getSubrange()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MpPackage.RANGES_TYPE__SUBRANGE:
				return getSubrange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpPackage.RANGES_TYPE__SUBRANGE:
				getSubrange().clear();
				getSubrange().addAll((Collection<? extends SubrangeType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case MpPackage.RANGES_TYPE__SUBRANGE:
				getSubrange().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MpPackage.RANGES_TYPE__SUBRANGE:
				return subrange != null && !subrange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // RangesTypeImpl
