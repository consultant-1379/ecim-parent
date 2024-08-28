/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ldap Type Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.LdapTypeInfoType#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.LdapTypeInfoType#getEquality <em>Equality</em>}</li>
 *   <li>{@link TspMim.LdapTypeInfoType#getSubstr <em>Substr</em>}</li>
 *   <li>{@link TspMim.LdapTypeInfoType#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link TspMim.LdapTypeInfoType#getSyntax <em>Syntax</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getLdapTypeInfoType()
 * @model extendedMetaData="name='ldapTypeInfo_._type' kind='elementOnly'"
 * @generated
 */
public interface LdapTypeInfoType extends EObject {
    /**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see TspMim.TspMimPackage#getLdapTypeInfoType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
    FeatureMap getGroup();

    /**
	 * Returns the value of the '<em><b>Equality</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equality</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality</em>' attribute list.
	 * @see TspMim.TspMimPackage#getLdapTypeInfoType_Equality()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equality' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
    EList<String> getEquality();

    /**
	 * Returns the value of the '<em><b>Substr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substr</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Substr</em>' attribute list.
	 * @see TspMim.TspMimPackage#getLdapTypeInfoType_Substr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='substr' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
    EList<String> getSubstr();

    /**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ordering</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute list.
	 * @see TspMim.TspMimPackage#getLdapTypeInfoType_Ordering()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ordering' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
    EList<String> getOrdering();

    /**
	 * Returns the value of the '<em><b>Syntax</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Syntax</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax</em>' attribute list.
	 * @see TspMim.TspMimPackage#getLdapTypeInfoType_Syntax()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='syntax' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
    EList<String> getSyntax();

} // LdapTypeInfoType
