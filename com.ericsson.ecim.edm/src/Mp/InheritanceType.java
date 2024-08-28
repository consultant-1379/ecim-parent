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
 * A representation of the model object '<em><b>Inheritance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.InheritanceType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.InheritanceType#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link Mp.InheritanceType#getSubclass <em>Subclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getInheritanceType()
 * @model extendedMetaData="name='inheritance_._type' kind='elementOnly'"
 * @generated
 */
public interface InheritanceType extends EObject {
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
	 * @see Mp.MpPackage#getInheritanceType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Superclass</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' containment reference.
	 * @see #setSuperclass(SuperclassType)
	 * @see Mp.MpPackage#getInheritanceType_Superclass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='superclass' namespace='##targetNamespace'"
	 * @generated
	 */
    SuperclassType getSuperclass();

    /**
	 * Sets the value of the '{@link Mp.InheritanceType#getSuperclass <em>Superclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass</em>' containment reference.
	 * @see #getSuperclass()
	 * @generated
	 */
    void setSuperclass(SuperclassType value);

    /**
	 * Returns the value of the '<em><b>Subclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subclass</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' containment reference.
	 * @see #setSubclass(SubclassType)
	 * @see Mp.MpPackage#getInheritanceType_Subclass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subclass' namespace='##targetNamespace'"
	 * @generated
	 */
    SubclassType getSubclass();

    /**
	 * Sets the value of the '{@link Mp.InheritanceType#getSubclass <em>Subclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclass</em>' containment reference.
	 * @see #getSubclass()
	 * @generated
	 */
    void setSubclass(SubclassType value);

} // InheritanceType
