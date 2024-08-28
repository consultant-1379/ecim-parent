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
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.ClassType#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.ClassType#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.ClassType#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link TspMim.ClassType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link TspMim.ClassType#getLdapObjectId <em>Ldap Object Id</em>}</li>
 *   <li>{@link TspMim.ClassType#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.ClassType#getSingleton <em>Singleton</em>}</li>
 *   <li>{@link TspMim.ClassType#getSystemCreated <em>System Created</em>}</li>
 *   <li>{@link TspMim.ClassType#getReducedLoggingAllowed <em>Reduced Logging Allowed</em>}</li>
 *   <li>{@link TspMim.ClassType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link TspMim.ClassType#getAction <em>Action</em>}</li>
 *   <li>{@link TspMim.ClassType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getClassType()
 * @model extendedMetaData="name='class_._type' kind='elementOnly'"
 * @generated
 */
public interface ClassType extends EObject {
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
	 * @see TspMim.TspMimPackage#getClassType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link TspMim.ClassType#getDescription <em>Description</em>}' containment reference.
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
	 * @see TspMim.TspMimPackage#getClassType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

    /**
	 * Returns the value of the '<em><b>Base Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Class</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' containment reference.
	 * @see #setBaseClass(BaseClassType)
	 * @see TspMim.TspMimPackage#getClassType_BaseClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseClass' namespace='##targetNamespace'"
	 * @generated
	 */
    BaseClassType getBaseClass();

    /**
	 * Sets the value of the '{@link TspMim.ClassType#getBaseClass <em>Base Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' containment reference.
	 * @see #getBaseClass()
	 * @generated
	 */
    void setBaseClass(BaseClassType value);

    /**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(AbstractType)
	 * @see TspMim.TspMimPackage#getClassType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
    AbstractType getAbstract();

    /**
	 * Sets the value of the '{@link TspMim.ClassType#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
    void setAbstract(AbstractType value);

    /**
	 * Returns the value of the '<em><b>Ldap Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ldap Object Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Object Id</em>' attribute.
	 * @see #setLdapObjectId(String)
	 * @see TspMim.TspMimPackage#getClassType_LdapObjectId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ldapObjectId' namespace='##targetNamespace'"
	 * @generated
	 */
    String getLdapObjectId();

    /**
	 * Sets the value of the '{@link TspMim.ClassType#getLdapObjectId <em>Ldap Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Object Id</em>' attribute.
	 * @see #getLdapObjectId()
	 * @generated
	 */
    void setLdapObjectId(String value);

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
	 * @see TspMim.TspMimPackage#getClassType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
    FeatureMap getGroup();

    /**
	 * Returns the value of the '<em><b>Singleton</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.SingletonType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Singleton</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getClassType_Singleton()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='singleton' namespace='##targetNamespace' group='group:5'"
	 * @generated
	 */
    EList<SingletonType> getSingleton();

    /**
	 * Returns the value of the '<em><b>System Created</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.SystemCreatedType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Created</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>System Created</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getClassType_SystemCreated()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='systemCreated' namespace='##targetNamespace' group='group:5'"
	 * @generated
	 */
    EList<SystemCreatedType> getSystemCreated();

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
	 * @see TspMim.TspMimPackage#getClassType_ReducedLoggingAllowed()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reducedLoggingAllowed' namespace='##targetNamespace' group='group:5'"
	 * @generated
	 */
    EList<ReducedLoggingAllowedType> getReducedLoggingAllowed();

    /**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.AttributeType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getClassType_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<AttributeType> getAttribute();

    /**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ActionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getClassType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ActionType> getAction();

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
	 * @see TspMim.TspMimPackage#getClassType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link TspMim.ClassType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // ClassType
