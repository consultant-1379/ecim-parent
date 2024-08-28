/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.ExtensionType#getExtender <em>Extender</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getName <em>Name</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getRelease <em>Release</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getVersion <em>Version</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getCategory <em>Category</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getStatus <em>Status</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getUnique <em>Unique</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getEcimName <em>Ecim Name</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getNotifiable <em>Notifiable</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getIsVirtualContainer <em>Is Virtual Container</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getSingletonKeyValue <em>Singleton Key Value</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getLdapServerName <em>Ldap Server Name</em>}</li>
 *   <li>{@link TspMim.ExtensionType#getIsPassphrase <em>Is Passphrase</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getExtensionType()
 * @model extendedMetaData="name='extension_._type' kind='mixed'"
 * @generated
 */
public interface ExtensionType extends Any {
    /**
	 * Returns the value of the '<em><b>Extender</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extender</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extender</em>' attribute.
	 * @see #setExtender(Object)
	 * @see TspMim.TspMimPackage#getExtensionType_Extender()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='extender' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getExtender();

    /**
	 * Sets the value of the '{@link TspMim.ExtensionType#getExtender <em>Extender</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extender</em>' attribute.
	 * @see #getExtender()
	 * @generated
	 */
    void setExtender(Object value);

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
	 * @see TspMim.TspMimPackage#getExtensionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link TspMim.ExtensionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

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
	 * @see TspMim.TspMimPackage#getExtensionType_Release()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='release' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getRelease();

    /**
	 * Sets the value of the '{@link TspMim.ExtensionType#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
    void setRelease(Object value);

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
	 * @see TspMim.TspMimPackage#getExtensionType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getVersion();

    /**
	 * Sets the value of the '{@link TspMim.ExtensionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(Object value);

    /**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.CategoryType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<CategoryType> getCategory();

    /**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.StatusType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<StatusType> getStatus();

    /**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.DependenciesType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DependenciesType> getDependencies();

    /**
	 * Returns the value of the '<em><b>Unique</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.UniqueType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_Unique()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unique' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<UniqueType> getUnique();

    /**
	 * Returns the value of the '<em><b>Ordered</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.OrderedType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ordered</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_Ordered()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ordered' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<OrderedType> getOrdered();

    /**
	 * Returns the value of the '<em><b>Takes Effect</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.TakesEffectType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Takes Effect</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Takes Effect</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_TakesEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takesEffect' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<TakesEffectType> getTakesEffect();

    /**
	 * Returns the value of the '<em><b>Ecim Name</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.EcimNameType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ecim Name</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecim Name</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_EcimName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ecimName' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<EcimNameType> getEcimName();

    /**
	 * Returns the value of the '<em><b>Notifiable</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.NotifiableType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notifiable</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifiable</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_Notifiable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notifiable' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<NotifiableType> getNotifiable();

    /**
	 * Returns the value of the '<em><b>Is Virtual Container</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.IsVirtualContainerType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Virtual Container</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual Container</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_IsVirtualContainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isVirtualContainer' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<IsVirtualContainerType> getIsVirtualContainer();

    /**
	 * Returns the value of the '<em><b>Singleton Key Value</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.SingletonKeyValueType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Singleton Key Value</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Key Value</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_SingletonKeyValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='singletonKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<SingletonKeyValueType> getSingletonKeyValue();

    /**
	 * Returns the value of the '<em><b>Ldap Server Name</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.LdapServerNameType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ldap Server Name</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Server Name</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_LdapServerName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ldapServerName' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<LdapServerNameType> getLdapServerName();

				/**
	 * Returns the value of the '<em><b>Is Passphrase</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.IsPassphraseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Passphrase</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Passphrase</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getExtensionType_IsPassphrase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isPassphrase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IsPassphraseType> getIsPassphrase();

} // ExtensionType
