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
 * A representation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ObjectType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.ObjectType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.ObjectType#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Mp.ObjectType#getSlot <em>Slot</em>}</li>
 *   <li>{@link Mp.ObjectType#getParentDn <em>Parent Dn</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getObjectType()
 * @model extendedMetaData="name='object_._type' kind='elementOnly'"
 * @generated
 */
public interface ObjectType extends EObject {
    /**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see Mp.MpPackage#getObjectType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.ObjectType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Domain Extension</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.DomainExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Extension</em>' containment reference list.
	 * @see Mp.MpPackage#getObjectType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Class</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Class</em>' containment reference.
	 * @see #setHasClass(HasClassType)
	 * @see Mp.MpPackage#getObjectType_HasClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hasClass' namespace='##targetNamespace'"
	 * @generated
	 */
    HasClassType getHasClass();

    /**
	 * Sets the value of the '{@link Mp.ObjectType#getHasClass <em>Has Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Class</em>' containment reference.
	 * @see #getHasClass()
	 * @generated
	 */
    void setHasClass(HasClassType value);

    /**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.SlotType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see Mp.MpPackage#getObjectType_Slot()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='slot' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<SlotType> getSlot();

    /**
	 * Returns the value of the '<em><b>Parent Dn</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Dn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dn</em>' attribute.
	 * @see #setParentDn(Object)
	 * @see Mp.MpPackage#getObjectType_ParentDn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='parentDn' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getParentDn();

    /**
	 * Sets the value of the '{@link Mp.ObjectType#getParentDn <em>Parent Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dn</em>' attribute.
	 * @see #getParentDn()
	 * @generated
	 */
    void setParentDn(Object value);

} // ObjectType
