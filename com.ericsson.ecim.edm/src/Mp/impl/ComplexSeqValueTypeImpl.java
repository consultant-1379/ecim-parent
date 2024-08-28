/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ComplexSeqValueType;
import Mp.ComplexValueType;
import Mp.MpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Seq Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ComplexSeqValueTypeImpl#getComplexValue <em>Complex Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexSeqValueTypeImpl extends EObjectImpl implements ComplexSeqValueType {
    /**
	 * The cached value of the '{@link #getComplexValue() <em>Complex Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getComplexValue()
	 * @generated
	 * @ordered
	 */
    protected EList<ComplexValueType> complexValue;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ComplexSeqValueTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getComplexSeqValueType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ComplexValueType> getComplexValue() {
		if (complexValue == null) {
			complexValue = new EObjectContainmentEList<ComplexValueType>(ComplexValueType.class, this, MpPackage.COMPLEX_SEQ_VALUE_TYPE__COMPLEX_VALUE);
		}
		return complexValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.COMPLEX_SEQ_VALUE_TYPE__COMPLEX_VALUE:
				return ((InternalEList<?>)getComplexValue()).basicRemove(otherEnd, msgs);
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
			case MpPackage.COMPLEX_SEQ_VALUE_TYPE__COMPLEX_VALUE:
				return getComplexValue();
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
			case MpPackage.COMPLEX_SEQ_VALUE_TYPE__COMPLEX_VALUE:
				getComplexValue().clear();
				getComplexValue().addAll((Collection<? extends ComplexValueType>)newValue);
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
			case MpPackage.COMPLEX_SEQ_VALUE_TYPE__COMPLEX_VALUE:
				getComplexValue().clear();
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
			case MpPackage.COMPLEX_SEQ_VALUE_TYPE__COMPLEX_VALUE:
				return complexValue != null && !complexValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexSeqValueTypeImpl
