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
 * A representation of the model object '<em><b>Implements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ImplementsType#getName <em>Name</em>}</li>
 *   <li>{@link Mp.ImplementsType#getVersion <em>Version</em>}</li>
 *   <li>{@link Mp.ImplementsType#getRelease <em>Release</em>}</li>
 *   <li>{@link Mp.ImplementsType#getCorrection <em>Correction</em>}</li>
 *   <li>{@link Mp.ImplementsType#getVariant <em>Variant</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getImplementsType()
 * @model extendedMetaData="name='implements_._type' kind='elementOnly'"
 * @generated
 */
public interface ImplementsType extends EObject {
    /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see Mp.MpPackage#getImplementsType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getVersion();

    /**
	 * Sets the value of the '{@link Mp.ImplementsType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(Object value);

    /**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #setRelease(Object)
	 * @see Mp.MpPackage#getImplementsType_Release()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='release' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getRelease();

    /**
	 * Sets the value of the '{@link Mp.ImplementsType#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
    void setRelease(Object value);

    /**
	 * Returns the value of the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Correction</em>' attribute.
	 * @see #setCorrection(Object)
	 * @see Mp.MpPackage#getImplementsType_Correction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='correction' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getCorrection();

    /**
	 * Sets the value of the '{@link Mp.ImplementsType#getCorrection <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction</em>' attribute.
	 * @see #getCorrection()
	 * @generated
	 */
    void setCorrection(Object value);

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Mp.MpPackage#getImplementsType_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link Mp.ImplementsType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variant</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see #setVariant(Object)
	 * @see Mp.MpPackage#getImplementsType_Variant()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='variant' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getVariant();

    /**
	 * Sets the value of the '{@link Mp.ImplementsType#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see #getVariant()
	 * @generated
	 */
    void setVariant(Object value);

} // ImplementsType
