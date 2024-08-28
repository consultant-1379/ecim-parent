/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ModelFeatureType;
import Mp.ModelFeaturesType;
import Mp.MpPackage;

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
 * An implementation of the model object '<em><b>Model Features Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ModelFeaturesTypeImpl#getModelFeature <em>Model Feature</em>}</li>
 *   <li>{@link Mp.impl.ModelFeaturesTypeImpl#getModelType <em>Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelFeaturesTypeImpl extends EObjectImpl implements ModelFeaturesType {
    /**
	 * The cached value of the '{@link #getModelFeature() <em>Model Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModelFeature()
	 * @generated
	 * @ordered
	 */
    protected EList<ModelFeatureType> modelFeature;

    /**
	 * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
    protected static final Object MODEL_TYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
    protected Object modelType = MODEL_TYPE_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ModelFeaturesTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getModelFeaturesType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ModelFeatureType> getModelFeature() {
		if (modelFeature == null) {
			modelFeature = new EObjectContainmentEList<ModelFeatureType>(ModelFeatureType.class, this, MpPackage.MODEL_FEATURES_TYPE__MODEL_FEATURE);
		}
		return modelFeature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getModelType() {
		return modelType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setModelType(Object newModelType) {
		Object oldModelType = modelType;
		modelType = newModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MODEL_FEATURES_TYPE__MODEL_TYPE, oldModelType, modelType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_FEATURE:
				return ((InternalEList<?>)getModelFeature()).basicRemove(otherEnd, msgs);
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
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_FEATURE:
				return getModelFeature();
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_TYPE:
				return getModelType();
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
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_FEATURE:
				getModelFeature().clear();
				getModelFeature().addAll((Collection<? extends ModelFeatureType>)newValue);
				return;
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_TYPE:
				setModelType(newValue);
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
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_FEATURE:
				getModelFeature().clear();
				return;
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_TYPE:
				setModelType(MODEL_TYPE_EDEFAULT);
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
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_FEATURE:
				return modelFeature != null && !modelFeature.isEmpty();
			case MpPackage.MODEL_FEATURES_TYPE__MODEL_TYPE:
				return MODEL_TYPE_EDEFAULT == null ? modelType != null : !MODEL_TYPE_EDEFAULT.equals(modelType);
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
		result.append(" (modelType: ");
		result.append(modelType);
		result.append(')');
		return result.toString();
	}

} //ModelFeaturesTypeImpl
