/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.CardinalityType;
import Mp.MaxType;
import Mp.MinType;
import Mp.MpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.CardinalityTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link Mp.impl.CardinalityTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link Mp.impl.CardinalityTypeImpl#getMin1 <em>Min1</em>}</li>
 *   <li>{@link Mp.impl.CardinalityTypeImpl#getMax1 <em>Max1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardinalityTypeImpl extends EObjectImpl implements CardinalityType {
    /**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected MinType min;

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
	 * The cached value of the '{@link #getMax1() <em>Max1</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax1()
	 * @generated
	 * @ordered
	 */
    protected MaxType max1;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CardinalityTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getCardinalityType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MinType getMin() {
		return min;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMin(MinType newMin, NotificationChain msgs) {
		MinType oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMin(MinType newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MIN, newMin, newMin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MAX, oldMax, newMax);
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
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MAX, newMax, newMax));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MIN1, oldMin1, newMin1);
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
				msgs = ((InternalEObject)min1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MIN1, null, msgs);
			if (newMin1 != null)
				msgs = ((InternalEObject)newMin1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MIN1, null, msgs);
			msgs = basicSetMin1(newMin1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MIN1, newMin1, newMin1));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MaxType getMax1() {
		return max1;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMax1(MaxType newMax1, NotificationChain msgs) {
		MaxType oldMax1 = max1;
		max1 = newMax1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MAX1, oldMax1, newMax1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMax1(MaxType newMax1) {
		if (newMax1 != max1) {
			NotificationChain msgs = null;
			if (max1 != null)
				msgs = ((InternalEObject)max1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MAX1, null, msgs);
			if (newMax1 != null)
				msgs = ((InternalEObject)newMax1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CARDINALITY_TYPE__MAX1, null, msgs);
			msgs = basicSetMax1(newMax1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CARDINALITY_TYPE__MAX1, newMax1, newMax1));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.CARDINALITY_TYPE__MIN:
				return basicSetMin(null, msgs);
			case MpPackage.CARDINALITY_TYPE__MAX:
				return basicSetMax(null, msgs);
			case MpPackage.CARDINALITY_TYPE__MIN1:
				return basicSetMin1(null, msgs);
			case MpPackage.CARDINALITY_TYPE__MAX1:
				return basicSetMax1(null, msgs);
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
			case MpPackage.CARDINALITY_TYPE__MIN:
				return getMin();
			case MpPackage.CARDINALITY_TYPE__MAX:
				return getMax();
			case MpPackage.CARDINALITY_TYPE__MIN1:
				return getMin1();
			case MpPackage.CARDINALITY_TYPE__MAX1:
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
			case MpPackage.CARDINALITY_TYPE__MIN:
				setMin((MinType)newValue);
				return;
			case MpPackage.CARDINALITY_TYPE__MAX:
				setMax((MaxType)newValue);
				return;
			case MpPackage.CARDINALITY_TYPE__MIN1:
				setMin1((MinType)newValue);
				return;
			case MpPackage.CARDINALITY_TYPE__MAX1:
				setMax1((MaxType)newValue);
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
			case MpPackage.CARDINALITY_TYPE__MIN:
				setMin((MinType)null);
				return;
			case MpPackage.CARDINALITY_TYPE__MAX:
				setMax((MaxType)null);
				return;
			case MpPackage.CARDINALITY_TYPE__MIN1:
				setMin1((MinType)null);
				return;
			case MpPackage.CARDINALITY_TYPE__MAX1:
				setMax1((MaxType)null);
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
			case MpPackage.CARDINALITY_TYPE__MIN:
				return min != null;
			case MpPackage.CARDINALITY_TYPE__MAX:
				return max != null;
			case MpPackage.CARDINALITY_TYPE__MIN1:
				return min1 != null;
			case MpPackage.CARDINALITY_TYPE__MAX1:
				return max1 != null;
		}
		return super.eIsSet(featureID);
	}

} //CardinalityTypeImpl
