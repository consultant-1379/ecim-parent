/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.ericsson.yang.YANGPackage
 * @generated
 */
public interface YANGFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    YANGFactory eINSTANCE = com.ericsson.yang.impl.YANGFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
    Module createModule();

    /**
	 * Returns a new object of class '<em>Sub Module</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Module</em>'.
	 * @generated
	 */
    SubModule createSubModule();

    /**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
    Import createImport();

    /**
	 * Returns a new object of class '<em>Belongs To</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Belongs To</em>'.
	 * @generated
	 */
    BelongsTo createBelongsTo();

    /**
	 * Returns a new object of class '<em>Prefix</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefix</em>'.
	 * @generated
	 */
    Prefix createPrefix();

    /**
	 * Returns a new object of class '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision</em>'.
	 * @generated
	 */
    Revision createRevision();

    /**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
    Extension createExtension();

    /**
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
    TypeDefinition createTypeDefinition();

    /**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
    Feature createFeature();

    /**
	 * Returns a new object of class '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity</em>'.
	 * @generated
	 */
    Identity createIdentity();

    /**
	 * Returns a new object of class '<em>Deviation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deviation</em>'.
	 * @generated
	 */
    Deviation createDeviation();

    /**
	 * Returns a new object of class '<em>Rpc</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rpc</em>'.
	 * @generated
	 */
    Rpc createRpc();

    /**
	 * Returns a new object of class '<em>Rpc Parameter</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rpc Parameter</em>'.
	 * @generated
	 */
    RpcParameter createRpcParameter();

    /**
	 * Returns a new object of class '<em>If Feature</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Feature</em>'.
	 * @generated
	 */
    IfFeature createIfFeature();

    /**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
    DataType createDataType();

    /**
	 * Returns a new object of class '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Type</em>'.
	 * @generated
	 */
    UnionType createUnionType();

    /**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
    Property createProperty();

    /**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
    Enumeration createEnumeration();

    /**
	 * Returns a new object of class '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal</em>'.
	 * @generated
	 */
    EnumLiteral createEnumLiteral();

    /**
	 * Returns a new object of class '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping</em>'.
	 * @generated
	 */
    Grouping createGrouping();

    /**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
    Container createContainer();

    /**
	 * Returns a new object of class '<em>Augment</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Augment</em>'.
	 * @generated
	 */
    Augment createAugment();

    /**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
    Notification createNotification();

    /**
	 * Returns a new object of class '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf</em>'.
	 * @generated
	 */
    Leaf createLeaf();

    /**
	 * Returns a new object of class '<em>Leaf List</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf List</em>'.
	 * @generated
	 */
    LeafList createLeafList();

    /**
	 * Returns a new object of class '<em>When</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>When</em>'.
	 * @generated
	 */
    When createWhen();

    /**
	 * Returns a new object of class '<em>Must</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must</em>'.
	 * @generated
	 */
    Must createMust();

    /**
	 * Returns a new object of class '<em>Any Xml</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Xml</em>'.
	 * @generated
	 */
    AnyXml createAnyXml();

    /**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
    Case createCase();

    /**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
    Choice createChoice();

    /**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
    StringValue createStringValue();

    /**
	 * Returns a new object of class '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Value</em>'.
	 * @generated
	 */
    IntValue createIntValue();

    /**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
    BooleanValue createBooleanValue();

    /**
	 * Returns a new object of class '<em>Identity Ref</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Ref</em>'.
	 * @generated
	 */
    IdentityRef createIdentityRef();

    /**
	 * Returns a new object of class '<em>Base</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base</em>'.
	 * @generated
	 */
    Base createBase();

    /**
	 * Returns a new object of class '<em>List With Status</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>List With Status</em>'.
	 * @generated
	 */
    ListWithStatus createListWithStatus();

    /**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
    Action createAction();

    /**
	 * Returns a new object of class '<em>Uses</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses</em>'.
	 * @generated
	 */
    Uses createUses();

    /**
	 * Returns a new object of class '<em>Refine</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refine</em>'.
	 * @generated
	 */
    Refine createRefine();

    /**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
    Range createRange();

    /**
	 * Returns a new object of class '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit</em>'.
	 * @generated
	 */
    Bit createBit();

    /**
	 * Returns a new object of class '<em>Include</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include</em>'.
	 * @generated
	 */
    Include createInclude();

    /**
	 * Returns a new object of class '<em>Deviate</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deviate</em>'.
	 * @generated
	 */
    Deviate createDeviate();

    /**
	 * Returns a new object of class '<em>Bits</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bits</em>'.
	 * @generated
	 */
    Bits createBits();

    /**
	 * Returns a new object of class '<em>Leaf Ref</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Ref</em>'.
	 * @generated
	 */
    LeafRef createLeafRef();

    /**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
    Binary createBinary();

    /**
	 * Returns a new object of class '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty</em>'.
	 * @generated
	 */
    Empty createEmpty();

    /**
	 * Returns a new object of class '<em>Instance Identifier</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Identifier</em>'.
	 * @generated
	 */
    InstanceIdentifier createInstanceIdentifier();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    YANGPackage getYANGPackage();

} //YANGFactory
