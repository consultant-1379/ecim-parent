/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ModelFeatureType#getName <em>Name</em>}</li>
 *   <li>{@link Mp.ModelFeatureType#getFeatureType <em>Feature Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getModelFeatureType()
 * @model extendedMetaData="name='modelFeature_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelFeatureType extends EObject {
    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see Mp.MpPackage#getModelFeatureType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.ModelFeatureType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

    /**
	 * Returns the value of the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type</em>' attribute.
	 * @see #setFeatureType(Object)
	 * @see Mp.MpPackage#getModelFeatureType_FeatureType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='featureType' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getFeatureType();

    /**
	 * Sets the value of the '{@link Mp.ModelFeatureType#getFeatureType <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type</em>' attribute.
	 * @see #getFeatureType()
	 * @generated
	 */
    void setFeatureType(Object value);

} // ModelFeatureType
