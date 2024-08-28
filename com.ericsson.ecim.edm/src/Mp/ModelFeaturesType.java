/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Features Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ModelFeaturesType#getModelFeature <em>Model Feature</em>}</li>
 *   <li>{@link Mp.ModelFeaturesType#getModelType <em>Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getModelFeaturesType()
 * @model extendedMetaData="name='modelFeatures_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelFeaturesType extends EObject {
    /**
	 * Returns the value of the '<em><b>Model Feature</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.ModelFeatureType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Feature</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Feature</em>' containment reference list.
	 * @see Mp.MpPackage#getModelFeaturesType_ModelFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<ModelFeatureType> getModelFeature();

    /**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see #setModelType(Object)
	 * @see Mp.MpPackage#getModelFeaturesType_ModelType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='modelType' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getModelType();

    /**
	 * Sets the value of the '{@link Mp.ModelFeaturesType#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see #getModelType()
	 * @generated
	 */
    void setModelType(Object value);

} // ModelFeaturesType
