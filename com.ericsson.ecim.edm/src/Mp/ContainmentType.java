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
 * A representation of the model object '<em><b>Containment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ContainmentType#getParent <em>Parent</em>}</li>
 *   <li>{@link Mp.ContainmentType#getChild <em>Child</em>}</li>
 *   <li>{@link Mp.ContainmentType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.ContainmentType#getNoNotification <em>No Notification</em>}</li>
 *   <li>{@link Mp.ContainmentType#getNotCreatable <em>Not Creatable</em>}</li>
 *   <li>{@link Mp.ContainmentType#getNotDeleteable <em>Not Deleteable</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getContainmentType()
 * @model extendedMetaData="name='containment_._type' kind='elementOnly'"
 * @generated
 */
public interface ContainmentType extends EObject {
    /**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(ParentType)
	 * @see Mp.MpPackage#getContainmentType_Parent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
    ParentType getParent();

    /**
	 * Sets the value of the '{@link Mp.ContainmentType#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
    void setParent(ParentType value);

    /**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.ChildType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see Mp.MpPackage#getContainmentType_Child()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='child' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ChildType> getChild();

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
	 * @see Mp.MpPackage#getContainmentType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>No Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>No Notification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>No Notification</em>' containment reference.
	 * @see #setNoNotification(NoNotificationType)
	 * @see Mp.MpPackage#getContainmentType_NoNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noNotification' namespace='##targetNamespace'"
	 * @generated
	 */
    NoNotificationType getNoNotification();

    /**
	 * Sets the value of the '{@link Mp.ContainmentType#getNoNotification <em>No Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Notification</em>' containment reference.
	 * @see #getNoNotification()
	 * @generated
	 */
    void setNoNotification(NoNotificationType value);

    /**
	 * Returns the value of the '<em><b>Not Creatable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not Creatable</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Creatable</em>' containment reference.
	 * @see #setNotCreatable(NotCreatableType)
	 * @see Mp.MpPackage#getContainmentType_NotCreatable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notCreatable' namespace='##targetNamespace'"
	 * @generated
	 */
    NotCreatableType getNotCreatable();

    /**
	 * Sets the value of the '{@link Mp.ContainmentType#getNotCreatable <em>Not Creatable</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Creatable</em>' containment reference.
	 * @see #getNotCreatable()
	 * @generated
	 */
    void setNotCreatable(NotCreatableType value);

    /**
	 * Returns the value of the '<em><b>Not Deleteable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not Deleteable</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Deleteable</em>' containment reference.
	 * @see #setNotDeleteable(NotDeleteableType)
	 * @see Mp.MpPackage#getContainmentType_NotDeleteable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notDeleteable' namespace='##targetNamespace'"
	 * @generated
	 */
    NotDeleteableType getNotDeleteable();

    /**
	 * Sets the value of the '{@link Mp.ContainmentType#getNotDeleteable <em>Not Deleteable</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Deleteable</em>' containment reference.
	 * @see #getNotDeleteable()
	 * @generated
	 */
    void setNotDeleteable(NotDeleteableType value);

} // ContainmentType
