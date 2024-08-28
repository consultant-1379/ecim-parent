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
 * A representation of the model object '<em><b>Domain Extension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.DomainExtensionType#getDomain <em>Domain</em>}</li>
 *   <li>{@link Mp.DomainExtensionType#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getDomainExtensionType()
 * @model annotation="ExtendedMetaData name='domainExtension_._type' kind='elementOnly'"
 * @generated
 */
public interface DomainExtensionType extends EObject {
    /**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(Object)
	 * @see Mp.MpPackage#getDomainExtensionType_Domain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
    Object getDomain();

    /**
	 * Sets the value of the '{@link Mp.DomainExtensionType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
    void setDomain(Object value);

    /**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.ExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see Mp.MpPackage#getDomainExtensionType_Extension()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

} // DomainExtensionType
