/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Mp.MpPackage
 * @generated
 */
public interface MpFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    MpFactory eINSTANCE = Mp.impl.MpFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
    DocumentRoot createDocumentRoot();

    /**
	 * Returns a new object of class '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Type</em>'.
	 * @generated
	 */
    ActionType createActionType();

    /**
	 * Returns a new object of class '<em>Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alphabet Type</em>'.
	 * @generated
	 */
    AlphabetType createAlphabetType();

    /**
	 * Returns a new object of class '<em>Application Tag Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Tag Type</em>'.
	 * @generated
	 */
    ApplicationTagType createApplicationTagType();

    /**
	 * Returns a new object of class '<em>Association End Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association End Type</em>'.
	 * @generated
	 */
    AssociationEndType createAssociationEndType();

    /**
	 * Returns a new object of class '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type</em>'.
	 * @generated
	 */
    AttributeType createAttributeType();

    /**
	 * Returns a new object of class '<em>Base Type Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Type Type</em>'.
	 * @generated
	 */
    BaseTypeType createBaseTypeType();

    /**
	 * Returns a new object of class '<em>Bi Directional Association Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bi Directional Association Type</em>'.
	 * @generated
	 */
    BiDirectionalAssociationType createBiDirectionalAssociationType();

    /**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
    BooleanType createBooleanType();

    /**
	 * Returns a new object of class '<em>Cardinality Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality Type</em>'.
	 * @generated
	 */
    CardinalityType createCardinalityType();

    /**
	 * Returns a new object of class '<em>Char Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Type</em>'.
	 * @generated
	 */
    CharType createCharType();

    /**
	 * Returns a new object of class '<em>Child Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Type</em>'.
	 * @generated
	 */
    ChildType createChildType();

    /**
	 * Returns a new object of class '<em>Complex Seq Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Seq Value Type</em>'.
	 * @generated
	 */
    ComplexSeqValueType createComplexSeqValueType();

    /**
	 * Returns a new object of class '<em>Complex Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Value Type</em>'.
	 * @generated
	 */
    ComplexValueType createComplexValueType();

    /**
	 * Returns a new object of class '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type</em>'.
	 * @generated
	 */
    ClassType createClassType();

    /**
	 * Returns a new object of class '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Type</em>'.
	 * @generated
	 */
    ConditionType createConditionType();

    /**
	 * Returns a new object of class '<em>Containment Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Type</em>'.
	 * @generated
	 */
    ContainmentType createContainmentType();

    /**
	 * Returns a new object of class '<em>Copyright Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright Type</em>'.
	 * @generated
	 */
    CopyrightType createCopyrightType();

    /**
	 * Returns a new object of class '<em>Counter Context Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter Context Type</em>'.
	 * @generated
	 */
    CounterContextType createCounterContextType();

    /**
	 * Returns a new object of class '<em>Counter Reset Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter Reset Type</em>'.
	 * @generated
	 */
    CounterResetType createCounterResetType();

    /**
	 * Returns a new object of class '<em>Counter Type Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter Type Type</em>'.
	 * @generated
	 */
    CounterTypeType createCounterTypeType();

    /**
	 * Returns a new object of class '<em>Data Type Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Type</em>'.
	 * @generated
	 */
    DataTypeType createDataTypeType();

    /**
	 * Returns a new object of class '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Type</em>'.
	 * @generated
	 */
    DateType createDateType();

    /**
	 * Returns a new object of class '<em>Default Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value Type</em>'.
	 * @generated
	 */
    DefaultValueType createDefaultValueType();

    /**
	 * Returns a new object of class '<em>Deletion Policy Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deletion Policy Type</em>'.
	 * @generated
	 */
    DeletionPolicyType createDeletionPolicyType();

    /**
	 * Returns a new object of class '<em>Is Reserving Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Reserving Type</em>'.
	 * @generated
	 */
    IsReservingType createIsReservingType();

    /**
	 * Returns a new object of class '<em>Dependencies Script Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies Script Type</em>'.
	 * @generated
	 */
    DependenciesScriptType createDependenciesScriptType();

    /**
	 * Returns a new object of class '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies Type</em>'.
	 * @generated
	 */
    DependenciesType createDependenciesType();

    /**
	 * Returns a new object of class '<em>Derived Data Type Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Data Type Ref Type</em>'.
	 * @generated
	 */
    DerivedDataTypeRefType createDerivedDataTypeRefType();

    /**
	 * Returns a new object of class '<em>Derived Data Type Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Data Type Type</em>'.
	 * @generated
	 */
    DerivedDataTypeType createDerivedDataTypeType();

    /**
	 * Returns a new object of class '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Type</em>'.
	 * @generated
	 */
    DescriptionType createDescriptionType();

    /**
	 * Returns a new object of class '<em>Disturbances Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disturbances Type</em>'.
	 * @generated
	 */
    DisturbancesType createDisturbancesType();

    /**
	 * Returns a new object of class '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Type</em>'.
	 * @generated
	 */
    DoubleType createDoubleType();

    /**
	 * Returns a new object of class '<em>Enum Member Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Member Type</em>'.
	 * @generated
	 */
    EnumMemberType createEnumMemberType();

    /**
	 * Returns a new object of class '<em>Enum Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Ref Type</em>'.
	 * @generated
	 */
    EnumRefType createEnumRefType();

    /**
	 * Returns a new object of class '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Type</em>'.
	 * @generated
	 */
    EnumType createEnumType();

    /**
	 * Returns a new object of class '<em>Exception Parameter Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Parameter Type</em>'.
	 * @generated
	 */
    ExceptionParameterType createExceptionParameterType();

    /**
	 * Returns a new object of class '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Type</em>'.
	 * @generated
	 */
    ExceptionType createExceptionType();

    /**
	 * Returns a new object of class '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Type</em>'.
	 * @generated
	 */
    FeatureType createFeatureType();

    /**
	 * Returns a new object of class '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Type</em>'.
	 * @generated
	 */
    FloatType createFloatType();

    /**
	 * Returns a new object of class '<em>Get Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Value Type</em>'.
	 * @generated
	 */
    GetValueType createGetValueType();

    /**
	 * Returns a new object of class '<em>Has Class Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Class Type</em>'.
	 * @generated
	 */
    HasClassType createHasClassType();

    /**
	 * Returns a new object of class '<em>Inheritance Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance Type</em>'.
	 * @generated
	 */
    InheritanceType createInheritanceType();

    /**
	 * Returns a new object of class '<em>Indexed Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indexed Type</em>'.
	 * @generated
	 */
    IndexedType createIndexedType();

    /**
	 * Returns a new object of class '<em>Inout Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inout Type</em>'.
	 * @generated
	 */
    InoutType createInoutType();

    /**
	 * Returns a new object of class '<em>Int16 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int16 Type</em>'.
	 * @generated
	 */
    Int16Type createInt16Type();

    /**
	 * Returns a new object of class '<em>Int32 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int32 Type</em>'.
	 * @generated
	 */
    Int32Type createInt32Type();

    /**
	 * Returns a new object of class '<em>Int64 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int64 Type</em>'.
	 * @generated
	 */
    Int64Type createInt64Type();

    /**
	 * Returns a new object of class '<em>Int8 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int8 Type</em>'.
	 * @generated
	 */
    Int8Type createInt8Type();

    /**
	 * Returns a new object of class '<em>Decision Point Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Point Type</em>'.
	 * @generated
	 */
    DecisionPointType createDecisionPointType();

    /**
	 * Returns a new object of class '<em>Validation Rules Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Rules Type</em>'.
	 * @generated
	 */
    ValidationRulesType createValidationRulesType();

    /**
	 * Returns a new object of class '<em>Interface Only Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Only Type</em>'.
	 * @generated
	 */
    InterfaceOnlyType createInterfaceOnlyType();

    /**
	 * Returns a new object of class '<em>Inter Mim Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Mim Type</em>'.
	 * @generated
	 */
    InterMimType createInterMimType();

    /**
	 * Returns a new object of class '<em>In Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Type</em>'.
	 * @generated
	 */
    InType createInType();

    /**
	 * Returns a new object of class '<em>Ip V4 Address Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ip V4 Address Type</em>'.
	 * @generated
	 */
    IpV4AddressType createIpV4AddressType();

    /**
	 * Returns a new object of class '<em>Ip V6 Address Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ip V6 Address Type</em>'.
	 * @generated
	 */
    IpV6AddressType createIpV6AddressType();

    /**
	 * Returns a new object of class '<em>Is Exclusive Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Exclusive Type</em>'.
	 * @generated
	 */
    IsExclusiveType createIsExclusiveType();

    /**
	 * Returns a new object of class '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Type</em>'.
	 * @generated
	 */
    KeyType createKeyType();

    /**
	 * Returns a new object of class '<em>Length Range Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Range Type</em>'.
	 * @generated
	 */
    LengthRangeType createLengthRangeType();

    /**
	 * Returns a new object of class '<em>Local Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Type</em>'.
	 * @generated
	 */
    LocalType createLocalType();

    /**
	 * Returns a new object of class '<em>Lock Before Delete Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lock Before Delete Type</em>'.
	 * @generated
	 */
    LockBeforeDeleteType createLockBeforeDeleteType();

    /**
	 * Returns a new object of class '<em>Lock Before Execute Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lock Before Execute Type</em>'.
	 * @generated
	 */
    LockBeforeExecuteType createLockBeforeExecuteType();

    /**
	 * Returns a new object of class '<em>Lock Before Modify Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lock Before Modify Type</em>'.
	 * @generated
	 */
    LockBeforeModifyType createLockBeforeModifyType();

    /**
	 * Returns a new object of class '<em>Longlong Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Longlong Type</em>'.
	 * @generated
	 */
    LonglongType createLonglongType();

    /**
	 * Returns a new object of class '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Type</em>'.
	 * @generated
	 */
    ObjectType createObjectType();

    /**
	 * Returns a new object of class '<em>Long Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Type</em>'.
	 * @generated
	 */
    LongType createLongType();

    /**
	 * Returns a new object of class '<em>Mac Address Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mac Address Type</em>'.
	 * @generated
	 */
    MacAddressType createMacAddressType();

    /**
	 * Returns a new object of class '<em>Mandatory Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Type</em>'.
	 * @generated
	 */
    MandatoryType createMandatoryType();

    /**
	 * Returns a new object of class '<em>Max Length Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Length Type</em>'.
	 * @generated
	 */
    MaxLengthType createMaxLengthType();

    /**
	 * Returns a new object of class '<em>Max Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Type</em>'.
	 * @generated
	 */
    MaxType createMaxType();

    /**
	 * Returns a new object of class '<em>Mib Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mib Type</em>'.
	 * @generated
	 */
    MibType createMibType();

    /**
	 * Returns a new object of class '<em>Mim Name Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mim Name Type</em>'.
	 * @generated
	 */
    MimNameType createMimNameType();

    /**
	 * Returns a new object of class '<em>Mim Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mim Type</em>'.
	 * @generated
	 */
    MimType createMimType();

    /**
	 * Returns a new object of class '<em>Mim Version Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mim Version Type</em>'.
	 * @generated
	 */
    MimVersionType createMimVersionType();

    /**
	 * Returns a new object of class '<em>Min Length Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Length Type</em>'.
	 * @generated
	 */
    MinLengthType createMinLengthType();

    /**
	 * Returns a new object of class '<em>Min Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Type</em>'.
	 * @generated
	 */
    MinType createMinType();

    /**
	 * Returns a new object of class '<em>Models Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Models Type</em>'.
	 * @generated
	 */
    ModelsType createModelsType();

    /**
	 * Returns a new object of class '<em>Mo Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo Ref Type</em>'.
	 * @generated
	 */
    MoRefType createMoRefType();

    /**
	 * Returns a new object of class '<em>Mo Restart Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo Restart Type</em>'.
	 * @generated
	 */
    MoRestartType createMoRestartType();

    /**
	 * Returns a new object of class '<em>Multiplication Factor Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication Factor Type</em>'.
	 * @generated
	 */
    MultiplicationFactorType createMultiplicationFactorType();

    /**
	 * Returns a new object of class '<em>Node Restart Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Restart Type</em>'.
	 * @generated
	 */
    NodeRestartType createNodeRestartType();

    /**
	 * Returns a new object of class '<em>None Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Type</em>'.
	 * @generated
	 */
    NoneType createNoneType();

    /**
	 * Returns a new object of class '<em>No Notification Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Notification Type</em>'.
	 * @generated
	 */
    NoNotificationType createNoNotificationType();

    /**
	 * Returns a new object of class '<em>Not Creatable Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Creatable Type</em>'.
	 * @generated
	 */
    NotCreatableType createNotCreatableType();

    /**
	 * Returns a new object of class '<em>Not Deleteable Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Deleteable Type</em>'.
	 * @generated
	 */
    NotDeleteableType createNotDeleteableType();

    /**
	 * Returns a new object of class '<em>Non Persistent Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Persistent Type</em>'.
	 * @generated
	 */
    NonPersistentType createNonPersistentType();

    /**
	 * Returns a new object of class '<em>Non Unique Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Unique Type</em>'.
	 * @generated
	 */
    NonUniqueType createNonUniqueType();

    /**
	 * Returns a new object of class '<em>No Restart Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Restart Type</em>'.
	 * @generated
	 */
    NoRestartType createNoRestartType();

    /**
	 * Returns a new object of class '<em>Notification Types Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Types Type</em>'.
	 * @generated
	 */
    NotificationTypesType createNotificationTypesType();

    /**
	 * Returns a new object of class '<em>Octet Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octet Type</em>'.
	 * @generated
	 */
    OctetType createOctetType();

    /**
	 * Returns a new object of class '<em>Ordered Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Type</em>'.
	 * @generated
	 */
    OrderedType createOrderedType();

    /**
	 * Returns a new object of class '<em>Out Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Type</em>'.
	 * @generated
	 */
    OutType createOutType();

    /**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
    ParameterType createParameterType();

    /**
	 * Returns a new object of class '<em>Parent Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Type</em>'.
	 * @generated
	 */
    ParentType createParentType();

    /**
	 * Returns a new object of class '<em>Precondition Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition Type</em>'.
	 * @generated
	 */
    PreconditionType createPreconditionType();

    /**
	 * Returns a new object of class '<em>Raises Exception Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raises Exception Type</em>'.
	 * @generated
	 */
    RaisesExceptionType createRaisesExceptionType();

    /**
	 * Returns a new object of class '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Type</em>'.
	 * @generated
	 */
    RangeType createRangeType();

    /**
	 * Returns a new object of class '<em>Ranges Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranges Type</em>'.
	 * @generated
	 */
    RangesType createRangesType();

    /**
	 * Returns a new object of class '<em>String Length Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Length Type</em>'.
	 * @generated
	 */
    StringLengthType createStringLengthType();

    /**
	 * Returns a new object of class '<em>Subrange Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrange Type</em>'.
	 * @generated
	 */
    SubrangeType createSubrangeType();

    /**
	 * Returns a new object of class '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Type</em>'.
	 * @generated
	 */
    RelationshipType createRelationshipType();

    /**
	 * Returns a new object of class '<em>Resolution Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Type</em>'.
	 * @generated
	 */
    ResolutionType createResolutionType();

    /**
	 * Returns a new object of class '<em>Restart Type Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restart Type Type</em>'.
	 * @generated
	 */
    RestartTypeType createRestartTypeType();

    /**
	 * Returns a new object of class '<em>Restricted Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restricted Type</em>'.
	 * @generated
	 */
    RestrictedType createRestrictedType();

    /**
	 * Returns a new object of class '<em>Return Type Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type Type</em>'.
	 * @generated
	 */
    ReturnTypeType createReturnTypeType();

    /**
	 * Returns a new object of class '<em>Sampling Rate Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampling Rate Type</em>'.
	 * @generated
	 */
    SamplingRateType createSamplingRateType();

    /**
	 * Returns a new object of class '<em>Scanner Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanner Type</em>'.
	 * @generated
	 */
    ScannerType createScannerType();

    /**
	 * Returns a new object of class '<em>Seq Default Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Default Value Type</em>'.
	 * @generated
	 */
    SeqDefaultValueType createSeqDefaultValueType();

    /**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
    SequenceType createSequenceType();

    /**
	 * Returns a new object of class '<em>Seq Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Value Type</em>'.
	 * @generated
	 */
    SeqValueType createSeqValueType();

    /**
	 * Returns a new object of class '<em>Short Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Type</em>'.
	 * @generated
	 */
    ShortType createShortType();

    /**
	 * Returns a new object of class '<em>Side Effects Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Side Effects Type</em>'.
	 * @generated
	 */
    SideEffectsType createSideEffectsType();

    /**
	 * Returns a new object of class '<em>Static Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Type</em>'.
	 * @generated
	 */
    StaticType createStaticType();

    /**
	 * Returns a new object of class '<em>Slot Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Type</em>'.
	 * @generated
	 */
    SlotType createSlotType();

    /**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
    StringType createStringType();

    /**
	 * Returns a new object of class '<em>Struct Member Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Member Type</em>'.
	 * @generated
	 */
    StructMemberType createStructMemberType();

    /**
	 * Returns a new object of class '<em>Struct Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Ref Type</em>'.
	 * @generated
	 */
    StructRefType createStructRefType();

    /**
	 * Returns a new object of class '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Type</em>'.
	 * @generated
	 */
    StructType createStructType();

    /**
	 * Returns a new object of class '<em>Subclass Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subclass Type</em>'.
	 * @generated
	 */
    SubclassType createSubclassType();

    /**
	 * Returns a new object of class '<em>Superclass Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Superclass Type</em>'.
	 * @generated
	 */
    SuperclassType createSuperclassType();

    /**
	 * Returns a new object of class '<em>System Created Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Created Type</em>'.
	 * @generated
	 */
    SystemCreatedType createSystemCreatedType();

    /**
	 * Returns a new object of class '<em>Takes Effect Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Takes Effect Type</em>'.
	 * @generated
	 */
    TakesEffectType createTakesEffectType();

    /**
	 * Returns a new object of class '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Type</em>'.
	 * @generated
	 */
    TimeType createTimeType();

    /**
	 * Returns a new object of class '<em>Transaction Required Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Required Type</em>'.
	 * @generated
	 */
    TransactionRequiredType createTransactionRequiredType();

    /**
	 * Returns a new object of class '<em>Uint16 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uint16 Type</em>'.
	 * @generated
	 */
    Uint16Type createUint16Type();

    /**
	 * Returns a new object of class '<em>Uint32 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uint32 Type</em>'.
	 * @generated
	 */
    Uint32Type createUint32Type();

    /**
	 * Returns a new object of class '<em>Uint64 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uint64 Type</em>'.
	 * @generated
	 */
    Uint64Type createUint64Type();

    /**
	 * Returns a new object of class '<em>Uint8 Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uint8 Type</em>'.
	 * @generated
	 */
    Uint8Type createUint8Type();

    /**
	 * Returns a new object of class '<em>Undefined Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undefined Type</em>'.
	 * @generated
	 */
    UndefinedType createUndefinedType();

    /**
	 * Returns a new object of class '<em>Undefined Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undefined Value Type</em>'.
	 * @generated
	 */
    UndefinedValueType createUndefinedValueType();

    /**
	 * Returns a new object of class '<em>Uni Directional Association Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Directional Association Type</em>'.
	 * @generated
	 */
    UniDirectionalAssociationType createUniDirectionalAssociationType();

    /**
	 * Returns a new object of class '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Type</em>'.
	 * @generated
	 */
    UnitType createUnitType();

    /**
	 * Returns a new object of class '<em>Valid Values Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Values Type</em>'.
	 * @generated
	 */
    ValidValuesType createValidValuesType();

    /**
	 * Returns a new object of class '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type</em>'.
	 * @generated
	 */
    ValueType createValueType();

    /**
	 * Returns a new object of class '<em>Visibility Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Type</em>'.
	 * @generated
	 */
    VisibilityType createVisibilityType();

    /**
	 * Returns a new object of class '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Type</em>'.
	 * @generated
	 */
    VoidType createVoidType();

    /**
	 * Returns a new object of class '<em>Wstring Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wstring Type</em>'.
	 * @generated
	 */
    WstringType createWstringType();

    /**
	 * Returns a new object of class '<em>Read Only Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Only Type</em>'.
	 * @generated
	 */
    ReadOnlyType createReadOnlyType();

    /**
	 * Returns a new object of class '<em>Deprecated Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deprecated Type</em>'.
	 * @generated
	 */
    DeprecatedType createDeprecatedType();

    /**
	 * Returns a new object of class '<em>Obsolete Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obsolete Type</em>'.
	 * @generated
	 */
    ObsoleteType createObsoleteType();

    /**
	 * Returns a new object of class '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Type</em>'.
	 * @generated
	 */
    FilterType createFilterType();

    /**
	 * Returns a new object of class '<em>Specification Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Type</em>'.
	 * @generated
	 */
    SpecificationType createSpecificationType();

    /**
	 * Returns a new object of class '<em>Status Information Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Information Type</em>'.
	 * @generated
	 */
    StatusInformationType createStatusInformationType();

    /**
	 * Returns a new object of class '<em>Root Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Type</em>'.
	 * @generated
	 */
    RootType createRootType();

    /**
	 * Returns a new object of class '<em>Yang Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yang Root Type</em>'.
	 * @generated
	 */
	YangRootType createYangRootType();

				/**
	 * Returns a new object of class '<em>Extension Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Type</em>'.
	 * @generated
	 */
    ExtensionType createExtensionType();

    /**
	 * Returns a new object of class '<em>Domain Extension Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Extension Type</em>'.
	 * @generated
	 */
    DomainExtensionType createDomainExtensionType();

    /**
	 * Returns a new object of class '<em>Transaction Constraints Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Constraints Type</em>'.
	 * @generated
	 */
    TransactionConstraintsType createTransactionConstraintsType();

    /**
	 * Returns a new object of class '<em>Approved By Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approved By Type</em>'.
	 * @generated
	 */
    ApprovedByType createApprovedByType();

    /**
	 * Returns a new object of class '<em>Signature Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Type</em>'.
	 * @generated
	 */
    SignatureType createSignatureType();

    /**
	 * Returns a new object of class '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Type</em>'.
	 * @generated
	 */
    NameType createNameType();

    /**
	 * Returns a new object of class '<em>Company Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company Type</em>'.
	 * @generated
	 */
    CompanyType createCompanyType();

    /**
	 * Returns a new object of class '<em>Year Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year Type</em>'.
	 * @generated
	 */
    YearType createYearType();

    /**
	 * Returns a new object of class '<em>Disclaimer Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disclaimer Type</em>'.
	 * @generated
	 */
    DisclaimerType createDisclaimerType();

    /**
	 * Returns a new object of class '<em>Created By Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Created By Type</em>'.
	 * @generated
	 */
    CreatedByType createCreatedByType();

    /**
	 * Returns a new object of class '<em>Doc Date Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Date Type</em>'.
	 * @generated
	 */
    DocDateType createDocDateType();

    /**
	 * Returns a new object of class '<em>Doc Lang Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Lang Type</em>'.
	 * @generated
	 */
    DocLangType createDocLangType();

    /**
	 * Returns a new object of class '<em>Doc Num Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Num Type</em>'.
	 * @generated
	 */
    DocNumType createDocNumType();

    /**
	 * Returns a new object of class '<em>Doc Rev Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Rev Type</em>'.
	 * @generated
	 */
    DocRevType createDocRevType();

    /**
	 * Returns a new object of class '<em>Dtd Version Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dtd Version Type</em>'.
	 * @generated
	 */
    DtdVersionType createDtdVersionType();

    /**
	 * Returns a new object of class '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Type</em>'.
	 * @generated
	 */
    LabelType createLabelType();

    /**
	 * Returns a new object of class '<em>Mim Part Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mim Part Type</em>'.
	 * @generated
	 */
    MimPartType createMimPartType();

    /**
	 * Returns a new object of class '<em>Mim Parts Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mim Parts Type</em>'.
	 * @generated
	 */
    MimPartsType createMimPartsType();

    /**
	 * Returns a new object of class '<em>Mom Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mom Meta Data Type</em>'.
	 * @generated
	 */
    MomMetaDataType createMomMetaDataType();

    /**
	 * Returns a new object of class '<em>Mom Sub Title Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mom Sub Title Type</em>'.
	 * @generated
	 */
    MomSubTitleType createMomSubTitleType();

    /**
	 * Returns a new object of class '<em>Mom Title Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mom Title Type</em>'.
	 * @generated
	 */
    MomTitleType createMomTitleType();

    /**
	 * Returns a new object of class '<em>Mom Identity Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mom Identity Type</em>'.
	 * @generated
	 */
    MomIdentityType createMomIdentityType();

    /**
	 * Returns a new object of class '<em>Preliminary Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preliminary Type</em>'.
	 * @generated
	 */
    PreliminaryType createPreliminaryType();

    /**
	 * Returns a new object of class '<em>Implements Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implements Type</em>'.
	 * @generated
	 */
    ImplementsType createImplementsType();

    /**
	 * Returns a new object of class '<em>Is Nillable Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Nillable Type</em>'.
	 * @generated
	 */
    IsNillableType createIsNillableType();

    /**
	 * Returns a new object of class '<em>Is Passphrase Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Passphrase Type</em>'.
	 * @generated
	 */
    IsPassphraseType createIsPassphraseType();

    /**
	 * Returns a new object of class '<em>Decision Statement Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Statement Type</em>'.
	 * @generated
	 */
    DecisionStatementType createDecisionStatementType();

    /**
	 * Returns a new object of class '<em>Rule Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Type</em>'.
	 * @generated
	 */
    RuleType createRuleType();

    /**
	 * Returns a new object of class '<em>Model Features Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Features Type</em>'.
	 * @generated
	 */
    ModelFeaturesType createModelFeaturesType();

    /**
	 * Returns a new object of class '<em>Model Feature Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Feature Type</em>'.
	 * @generated
	 */
    ModelFeatureType createModelFeatureType();

    /**
	 * Returns a new object of class '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Type</em>'.
	 * @generated
	 */
    IntegerType createIntegerType();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    MpPackage getMpPackage();

} //MpFactory
