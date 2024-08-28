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
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.ActionType#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.ActionType#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.ActionType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link TspMim.ActionType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link TspMim.ActionType#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.ActionType#getSensitive <em>Sensitive</em>}</li>
 *   <li>{@link TspMim.ActionType#getReducedLoggingAllowed <em>Reduced Logging Allowed</em>}</li>
 *   <li>{@link TspMim.ActionType#getHideInConfd <em>Hide In Confd</em>}</li>
 *   <li>{@link TspMim.ActionType#getHideInLdap <em>Hide In Ldap</em>}</li>
 *   <li>{@link TspMim.ActionType#getSystemMaintained <em>System Maintained</em>}</li>
 *   <li>{@link TspMim.ActionType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getActionType()
 * @model extendedMetaData="name='action_._type' kind='elementOnly'"
 * @generated
 */
public interface ActionType extends EObject {
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
	 * @see TspMim.TspMimPackage#getActionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link TspMim.ActionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getActionType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

    /**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(ReturnTypeType)
	 * @see TspMim.TspMimPackage#getActionType_ReturnType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='returnType' namespace='##targetNamespace'"
	 * @generated
	 */
    ReturnTypeType getReturnType();

    /**
	 * Sets the value of the '{@link TspMim.ActionType#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
    void setReturnType(ReturnTypeType value);

    /**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ParameterType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getActionType_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ParameterType> getParameter();

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
	 * @see TspMim.TspMimPackage#getActionType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
	 * @generated
	 */
    FeatureMap getGroup();

    /**
	 * Returns the value of the '<em><b>Sensitive</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.SensitiveType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensitive</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getActionType_Sensitive()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sensitive' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<SensitiveType> getSensitive();

    /**
	 * Returns the value of the '<em><b>Reduced Logging Allowed</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ReducedLoggingAllowedType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reduced Logging Allowed</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduced Logging Allowed</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getActionType_ReducedLoggingAllowed()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reducedLoggingAllowed' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<ReducedLoggingAllowedType> getReducedLoggingAllowed();

    /**
	 * Returns the value of the '<em><b>Hide In Confd</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.HideInConfdType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hide In Confd</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide In Confd</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getActionType_HideInConfd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hideInConfd' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<HideInConfdType> getHideInConfd();

    /**
	 * Returns the value of the '<em><b>Hide In Ldap</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.HideInLdapType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hide In Ldap</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide In Ldap</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getActionType_HideInLdap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hideInLdap' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<HideInLdapType> getHideInLdap();

    /**
	 * Returns the value of the '<em><b>System Maintained</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.SystemMaintainedType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Maintained</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>System Maintained</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getActionType_SystemMaintained()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='systemMaintained' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
    EList<SystemMaintainedType> getSystemMaintained();

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
	 * @see TspMim.TspMimPackage#getActionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link TspMim.ActionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // ActionType
