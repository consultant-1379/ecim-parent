/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import Mp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MpFactoryImpl extends EFactoryImpl implements MpFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static MpFactory init() {
		try {
			MpFactory theMpFactory = (MpFactory)EPackage.Registry.INSTANCE.getEFactory(MpPackage.eNS_URI);
			if (theMpFactory != null) {
				return theMpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MpFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MpFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MpPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MpPackage.ACTION_TYPE: return createActionType();
			case MpPackage.ALPHABET_TYPE: return createAlphabetType();
			case MpPackage.APPLICATION_TAG_TYPE: return createApplicationTagType();
			case MpPackage.ASSOCIATION_END_TYPE: return createAssociationEndType();
			case MpPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case MpPackage.BASE_TYPE_TYPE: return createBaseTypeType();
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE: return createBiDirectionalAssociationType();
			case MpPackage.BOOLEAN_TYPE: return createBooleanType();
			case MpPackage.CARDINALITY_TYPE: return createCardinalityType();
			case MpPackage.CHAR_TYPE: return createCharType();
			case MpPackage.CHILD_TYPE: return createChildType();
			case MpPackage.COMPLEX_SEQ_VALUE_TYPE: return createComplexSeqValueType();
			case MpPackage.COMPLEX_VALUE_TYPE: return createComplexValueType();
			case MpPackage.CLASS_TYPE: return createClassType();
			case MpPackage.CONDITION_TYPE: return createConditionType();
			case MpPackage.CONTAINMENT_TYPE: return createContainmentType();
			case MpPackage.COPYRIGHT_TYPE: return createCopyrightType();
			case MpPackage.COUNTER_CONTEXT_TYPE: return createCounterContextType();
			case MpPackage.COUNTER_RESET_TYPE: return createCounterResetType();
			case MpPackage.COUNTER_TYPE_TYPE: return createCounterTypeType();
			case MpPackage.DATA_TYPE_TYPE: return createDataTypeType();
			case MpPackage.DATE_TYPE: return createDateType();
			case MpPackage.DEFAULT_VALUE_TYPE: return createDefaultValueType();
			case MpPackage.DELETION_POLICY_TYPE: return createDeletionPolicyType();
			case MpPackage.IS_RESERVING_TYPE: return createIsReservingType();
			case MpPackage.DEPENDENCIES_SCRIPT_TYPE: return createDependenciesScriptType();
			case MpPackage.DEPENDENCIES_TYPE: return createDependenciesType();
			case MpPackage.DERIVED_DATA_TYPE_REF_TYPE: return createDerivedDataTypeRefType();
			case MpPackage.DERIVED_DATA_TYPE_TYPE: return createDerivedDataTypeType();
			case MpPackage.DESCRIPTION_TYPE: return createDescriptionType();
			case MpPackage.DISTURBANCES_TYPE: return createDisturbancesType();
			case MpPackage.DOUBLE_TYPE: return createDoubleType();
			case MpPackage.ENUM_MEMBER_TYPE: return createEnumMemberType();
			case MpPackage.ENUM_REF_TYPE: return createEnumRefType();
			case MpPackage.ENUM_TYPE: return createEnumType();
			case MpPackage.EXCEPTION_PARAMETER_TYPE: return createExceptionParameterType();
			case MpPackage.EXCEPTION_TYPE: return createExceptionType();
			case MpPackage.FEATURE_TYPE: return createFeatureType();
			case MpPackage.FLOAT_TYPE: return createFloatType();
			case MpPackage.GET_VALUE_TYPE: return createGetValueType();
			case MpPackage.HAS_CLASS_TYPE: return createHasClassType();
			case MpPackage.INHERITANCE_TYPE: return createInheritanceType();
			case MpPackage.INDEXED_TYPE: return createIndexedType();
			case MpPackage.INOUT_TYPE: return createInoutType();
			case MpPackage.INT16_TYPE: return createInt16Type();
			case MpPackage.INT32_TYPE: return createInt32Type();
			case MpPackage.INT64_TYPE: return createInt64Type();
			case MpPackage.INT8_TYPE: return createInt8Type();
			case MpPackage.DECISION_POINT_TYPE: return createDecisionPointType();
			case MpPackage.VALIDATION_RULES_TYPE: return createValidationRulesType();
			case MpPackage.INTERFACE_ONLY_TYPE: return createInterfaceOnlyType();
			case MpPackage.INTER_MIM_TYPE: return createInterMimType();
			case MpPackage.IN_TYPE: return createInType();
			case MpPackage.IP_V4_ADDRESS_TYPE: return createIpV4AddressType();
			case MpPackage.IP_V6_ADDRESS_TYPE: return createIpV6AddressType();
			case MpPackage.IS_EXCLUSIVE_TYPE: return createIsExclusiveType();
			case MpPackage.KEY_TYPE: return createKeyType();
			case MpPackage.LENGTH_RANGE_TYPE: return createLengthRangeType();
			case MpPackage.LOCAL_TYPE: return createLocalType();
			case MpPackage.LOCK_BEFORE_DELETE_TYPE: return createLockBeforeDeleteType();
			case MpPackage.LOCK_BEFORE_EXECUTE_TYPE: return createLockBeforeExecuteType();
			case MpPackage.LOCK_BEFORE_MODIFY_TYPE: return createLockBeforeModifyType();
			case MpPackage.LONGLONG_TYPE: return createLonglongType();
			case MpPackage.OBJECT_TYPE: return createObjectType();
			case MpPackage.LONG_TYPE: return createLongType();
			case MpPackage.MAC_ADDRESS_TYPE: return createMacAddressType();
			case MpPackage.MANDATORY_TYPE: return createMandatoryType();
			case MpPackage.MAX_LENGTH_TYPE: return createMaxLengthType();
			case MpPackage.MAX_TYPE: return createMaxType();
			case MpPackage.MIB_TYPE: return createMibType();
			case MpPackage.MIM_NAME_TYPE: return createMimNameType();
			case MpPackage.MIM_TYPE: return createMimType();
			case MpPackage.MIM_VERSION_TYPE: return createMimVersionType();
			case MpPackage.MIN_LENGTH_TYPE: return createMinLengthType();
			case MpPackage.MIN_TYPE: return createMinType();
			case MpPackage.MODELS_TYPE: return createModelsType();
			case MpPackage.MO_REF_TYPE: return createMoRefType();
			case MpPackage.MO_RESTART_TYPE: return createMoRestartType();
			case MpPackage.MULTIPLICATION_FACTOR_TYPE: return createMultiplicationFactorType();
			case MpPackage.NODE_RESTART_TYPE: return createNodeRestartType();
			case MpPackage.NONE_TYPE: return createNoneType();
			case MpPackage.NO_NOTIFICATION_TYPE: return createNoNotificationType();
			case MpPackage.NOT_CREATABLE_TYPE: return createNotCreatableType();
			case MpPackage.NOT_DELETEABLE_TYPE: return createNotDeleteableType();
			case MpPackage.NON_PERSISTENT_TYPE: return createNonPersistentType();
			case MpPackage.NON_UNIQUE_TYPE: return createNonUniqueType();
			case MpPackage.NO_RESTART_TYPE: return createNoRestartType();
			case MpPackage.NOTIFICATION_TYPES_TYPE: return createNotificationTypesType();
			case MpPackage.OCTET_TYPE: return createOctetType();
			case MpPackage.ORDERED_TYPE: return createOrderedType();
			case MpPackage.OUT_TYPE: return createOutType();
			case MpPackage.PARAMETER_TYPE: return createParameterType();
			case MpPackage.PARENT_TYPE: return createParentType();
			case MpPackage.PRECONDITION_TYPE: return createPreconditionType();
			case MpPackage.RAISES_EXCEPTION_TYPE: return createRaisesExceptionType();
			case MpPackage.RANGE_TYPE: return createRangeType();
			case MpPackage.RANGES_TYPE: return createRangesType();
			case MpPackage.STRING_LENGTH_TYPE: return createStringLengthType();
			case MpPackage.SUBRANGE_TYPE: return createSubrangeType();
			case MpPackage.RELATIONSHIP_TYPE: return createRelationshipType();
			case MpPackage.RESOLUTION_TYPE: return createResolutionType();
			case MpPackage.RESTART_TYPE_TYPE: return createRestartTypeType();
			case MpPackage.RESTRICTED_TYPE: return createRestrictedType();
			case MpPackage.RETURN_TYPE_TYPE: return createReturnTypeType();
			case MpPackage.SAMPLING_RATE_TYPE: return createSamplingRateType();
			case MpPackage.SCANNER_TYPE: return createScannerType();
			case MpPackage.SEQ_DEFAULT_VALUE_TYPE: return createSeqDefaultValueType();
			case MpPackage.SEQUENCE_TYPE: return createSequenceType();
			case MpPackage.SEQ_VALUE_TYPE: return createSeqValueType();
			case MpPackage.SHORT_TYPE: return createShortType();
			case MpPackage.SIDE_EFFECTS_TYPE: return createSideEffectsType();
			case MpPackage.STATIC_TYPE: return createStaticType();
			case MpPackage.SLOT_TYPE: return createSlotType();
			case MpPackage.STRING_TYPE: return createStringType();
			case MpPackage.STRUCT_MEMBER_TYPE: return createStructMemberType();
			case MpPackage.STRUCT_REF_TYPE: return createStructRefType();
			case MpPackage.STRUCT_TYPE: return createStructType();
			case MpPackage.SUBCLASS_TYPE: return createSubclassType();
			case MpPackage.SUPERCLASS_TYPE: return createSuperclassType();
			case MpPackage.SYSTEM_CREATED_TYPE: return createSystemCreatedType();
			case MpPackage.TAKES_EFFECT_TYPE: return createTakesEffectType();
			case MpPackage.TIME_TYPE: return createTimeType();
			case MpPackage.TRANSACTION_REQUIRED_TYPE: return createTransactionRequiredType();
			case MpPackage.UINT16_TYPE: return createUint16Type();
			case MpPackage.UINT32_TYPE: return createUint32Type();
			case MpPackage.UINT64_TYPE: return createUint64Type();
			case MpPackage.UINT8_TYPE: return createUint8Type();
			case MpPackage.UNDEFINED_TYPE: return createUndefinedType();
			case MpPackage.UNDEFINED_VALUE_TYPE: return createUndefinedValueType();
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE: return createUniDirectionalAssociationType();
			case MpPackage.UNIT_TYPE: return createUnitType();
			case MpPackage.VALID_VALUES_TYPE: return createValidValuesType();
			case MpPackage.VALUE_TYPE: return createValueType();
			case MpPackage.VISIBILITY_TYPE: return createVisibilityType();
			case MpPackage.VOID_TYPE: return createVoidType();
			case MpPackage.WSTRING_TYPE: return createWstringType();
			case MpPackage.READ_ONLY_TYPE: return createReadOnlyType();
			case MpPackage.DEPRECATED_TYPE: return createDeprecatedType();
			case MpPackage.OBSOLETE_TYPE: return createObsoleteType();
			case MpPackage.FILTER_TYPE: return createFilterType();
			case MpPackage.SPECIFICATION_TYPE: return createSpecificationType();
			case MpPackage.STATUS_INFORMATION_TYPE: return createStatusInformationType();
			case MpPackage.ROOT_TYPE: return createRootType();
			case MpPackage.YANG_ROOT_TYPE: return createYangRootType();
			case MpPackage.EXTENSION_TYPE: return createExtensionType();
			case MpPackage.DOMAIN_EXTENSION_TYPE: return createDomainExtensionType();
			case MpPackage.TRANSACTION_CONSTRAINTS_TYPE: return createTransactionConstraintsType();
			case MpPackage.APPROVED_BY_TYPE: return createApprovedByType();
			case MpPackage.SIGNATURE_TYPE: return createSignatureType();
			case MpPackage.NAME_TYPE: return createNameType();
			case MpPackage.COMPANY_TYPE: return createCompanyType();
			case MpPackage.YEAR_TYPE: return createYearType();
			case MpPackage.DISCLAIMER_TYPE: return createDisclaimerType();
			case MpPackage.CREATED_BY_TYPE: return createCreatedByType();
			case MpPackage.DOC_DATE_TYPE: return createDocDateType();
			case MpPackage.DOC_LANG_TYPE: return createDocLangType();
			case MpPackage.DOC_NUM_TYPE: return createDocNumType();
			case MpPackage.DOC_REV_TYPE: return createDocRevType();
			case MpPackage.DTD_VERSION_TYPE: return createDtdVersionType();
			case MpPackage.LABEL_TYPE: return createLabelType();
			case MpPackage.MIM_PART_TYPE: return createMimPartType();
			case MpPackage.MIM_PARTS_TYPE: return createMimPartsType();
			case MpPackage.MOM_META_DATA_TYPE: return createMomMetaDataType();
			case MpPackage.MOM_SUB_TITLE_TYPE: return createMomSubTitleType();
			case MpPackage.MOM_TITLE_TYPE: return createMomTitleType();
			case MpPackage.MOM_IDENTITY_TYPE: return createMomIdentityType();
			case MpPackage.PRELIMINARY_TYPE: return createPreliminaryType();
			case MpPackage.IMPLEMENTS_TYPE: return createImplementsType();
			case MpPackage.IS_NILLABLE_TYPE: return createIsNillableType();
			case MpPackage.IS_PASSPHRASE_TYPE: return createIsPassphraseType();
			case MpPackage.DECISION_STATEMENT_TYPE: return createDecisionStatementType();
			case MpPackage.RULE_TYPE: return createRuleType();
			case MpPackage.MODEL_FEATURES_TYPE: return createModelFeaturesType();
			case MpPackage.MODEL_FEATURE_TYPE: return createModelFeatureType();
			case MpPackage.INTEGER_TYPE: return createIntegerType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();

        //Put in a plugin versioning comment into the XML for end user issue debugging
        documentRoot.getMixed().add(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
                "\n\tCopyright (c) " +java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)+" Ericsson AB. \n\t" +
                "All rights reserved \n\n\tDX ECIM Tool-chain generated this file on "+ (new java.util.Date()).toLocaleString() +" using:\n\t" +
                "* com.ericsson.ecim.m2m "+com.ericsson.ecim.m2m.M2MActivator.getVersion()+"\n\t" +
                "* com.ericsson.ecim.dsl "+com.ericsson.ecim.dsl.DSLActivator.getVersion()+"\n\t" +
                "* com.ericsson.ecim.edm "+com.ericsson.ecim.edm.EDMActivator.getVersion()+"\n");
        return documentRoot;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AlphabetType createAlphabetType() {
		AlphabetTypeImpl alphabetType = new AlphabetTypeImpl();
		return alphabetType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationTagType createApplicationTagType() {
		ApplicationTagTypeImpl applicationTagType = new ApplicationTagTypeImpl();
		return applicationTagType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AssociationEndType createAssociationEndType() {
		AssociationEndTypeImpl associationEndType = new AssociationEndTypeImpl();
		return associationEndType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BaseTypeType createBaseTypeType() {
		BaseTypeTypeImpl baseTypeType = new BaseTypeTypeImpl();
		return baseTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BiDirectionalAssociationType createBiDirectionalAssociationType() {
		BiDirectionalAssociationTypeImpl biDirectionalAssociationType = new BiDirectionalAssociationTypeImpl();
		return biDirectionalAssociationType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CardinalityType createCardinalityType() {
		CardinalityTypeImpl cardinalityType = new CardinalityTypeImpl();
		return cardinalityType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CharType createCharType() {
		CharTypeImpl charType = new CharTypeImpl();
		return charType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChildType createChildType() {
		ChildTypeImpl childType = new ChildTypeImpl();
		return childType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ComplexSeqValueType createComplexSeqValueType() {
		ComplexSeqValueTypeImpl complexSeqValueType = new ComplexSeqValueTypeImpl();
		return complexSeqValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ComplexValueType createComplexValueType() {
		ComplexValueTypeImpl complexValueType = new ComplexValueTypeImpl();
		return complexValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ContainmentType createContainmentType() {
		ContainmentTypeImpl containmentType = new ContainmentTypeImpl();
		return containmentType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CopyrightType createCopyrightType() {
		CopyrightTypeImpl copyrightType = new CopyrightTypeImpl();
		return copyrightType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CounterContextType createCounterContextType() {
		CounterContextTypeImpl counterContextType = new CounterContextTypeImpl();
		return counterContextType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CounterResetType createCounterResetType() {
		CounterResetTypeImpl counterResetType = new CounterResetTypeImpl();
		return counterResetType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CounterTypeType createCounterTypeType() {
		CounterTypeTypeImpl counterTypeType = new CounterTypeTypeImpl();
		return counterTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeType createDataTypeType() {
		DataTypeTypeImpl dataTypeType = new DataTypeTypeImpl();
		return dataTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DefaultValueType createDefaultValueType() {
		DefaultValueTypeImpl defaultValueType = new DefaultValueTypeImpl();
		return defaultValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeletionPolicyType createDeletionPolicyType() {
		DeletionPolicyTypeImpl deletionPolicyType = new DeletionPolicyTypeImpl();
		return deletionPolicyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IsReservingType createIsReservingType() {
		IsReservingTypeImpl isReservingType = new IsReservingTypeImpl();
		return isReservingType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DependenciesScriptType createDependenciesScriptType() {
		DependenciesScriptTypeImpl dependenciesScriptType = new DependenciesScriptTypeImpl();
		return dependenciesScriptType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DependenciesType createDependenciesType() {
		DependenciesTypeImpl dependenciesType = new DependenciesTypeImpl();
		return dependenciesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DerivedDataTypeRefType createDerivedDataTypeRefType() {
		DerivedDataTypeRefTypeImpl derivedDataTypeRefType = new DerivedDataTypeRefTypeImpl();
		return derivedDataTypeRefType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DerivedDataTypeType createDerivedDataTypeType() {
		DerivedDataTypeTypeImpl derivedDataTypeType = new DerivedDataTypeTypeImpl();
		return derivedDataTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DisturbancesType createDisturbancesType() {
		DisturbancesTypeImpl disturbancesType = new DisturbancesTypeImpl();
		return disturbancesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DoubleType createDoubleType() {
		DoubleTypeImpl doubleType = new DoubleTypeImpl();
		return doubleType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumMemberType createEnumMemberType() {
		EnumMemberTypeImpl enumMemberType = new EnumMemberTypeImpl();
		return enumMemberType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumRefType createEnumRefType() {
		EnumRefTypeImpl enumRefType = new EnumRefTypeImpl();
		return enumRefType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ExceptionParameterType createExceptionParameterType() {
		ExceptionParameterTypeImpl exceptionParameterType = new ExceptionParameterTypeImpl();
		return exceptionParameterType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureType createFeatureType() {
		FeatureTypeImpl featureType = new FeatureTypeImpl();
		return featureType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GetValueType createGetValueType() {
		GetValueTypeImpl getValueType = new GetValueTypeImpl();
		return getValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HasClassType createHasClassType() {
		HasClassTypeImpl hasClassType = new HasClassTypeImpl();
		return hasClassType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InheritanceType createInheritanceType() {
		InheritanceTypeImpl inheritanceType = new InheritanceTypeImpl();
		return inheritanceType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IndexedType createIndexedType() {
		IndexedTypeImpl indexedType = new IndexedTypeImpl();
		return indexedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InoutType createInoutType() {
		InoutTypeImpl inoutType = new InoutTypeImpl();
		return inoutType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int16Type createInt16Type() {
		Int16TypeImpl int16Type = new Int16TypeImpl();
		return int16Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int32Type createInt32Type() {
		Int32TypeImpl int32Type = new Int32TypeImpl();
		return int32Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int64Type createInt64Type() {
		Int64TypeImpl int64Type = new Int64TypeImpl();
		return int64Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Int8Type createInt8Type() {
		Int8TypeImpl int8Type = new Int8TypeImpl();
		return int8Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DecisionPointType createDecisionPointType() {
		DecisionPointTypeImpl decisionPointType = new DecisionPointTypeImpl();
		return decisionPointType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValidationRulesType createValidationRulesType() {
		ValidationRulesTypeImpl validationRulesType = new ValidationRulesTypeImpl();
		return validationRulesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InterfaceOnlyType createInterfaceOnlyType() {
		InterfaceOnlyTypeImpl interfaceOnlyType = new InterfaceOnlyTypeImpl();
		return interfaceOnlyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InterMimType createInterMimType() {
		InterMimTypeImpl interMimType = new InterMimTypeImpl();
		return interMimType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InType createInType() {
		InTypeImpl inType = new InTypeImpl();
		return inType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IpV4AddressType createIpV4AddressType() {
		IpV4AddressTypeImpl ipV4AddressType = new IpV4AddressTypeImpl();
		return ipV4AddressType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IpV6AddressType createIpV6AddressType() {
		IpV6AddressTypeImpl ipV6AddressType = new IpV6AddressTypeImpl();
		return ipV6AddressType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IsExclusiveType createIsExclusiveType() {
		IsExclusiveTypeImpl isExclusiveType = new IsExclusiveTypeImpl();
		return isExclusiveType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KeyType createKeyType() {
		KeyTypeImpl keyType = new KeyTypeImpl();
		return keyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LengthRangeType createLengthRangeType() {
		LengthRangeTypeImpl lengthRangeType = new LengthRangeTypeImpl();
		return lengthRangeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LocalType createLocalType() {
		LocalTypeImpl localType = new LocalTypeImpl();
		return localType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LockBeforeDeleteType createLockBeforeDeleteType() {
		LockBeforeDeleteTypeImpl lockBeforeDeleteType = new LockBeforeDeleteTypeImpl();
		return lockBeforeDeleteType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LockBeforeExecuteType createLockBeforeExecuteType() {
		LockBeforeExecuteTypeImpl lockBeforeExecuteType = new LockBeforeExecuteTypeImpl();
		return lockBeforeExecuteType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LockBeforeModifyType createLockBeforeModifyType() {
		LockBeforeModifyTypeImpl lockBeforeModifyType = new LockBeforeModifyTypeImpl();
		return lockBeforeModifyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LonglongType createLonglongType() {
		LonglongTypeImpl longlongType = new LonglongTypeImpl();
		return longlongType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LongType createLongType() {
		LongTypeImpl longType = new LongTypeImpl();
		return longType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MacAddressType createMacAddressType() {
		MacAddressTypeImpl macAddressType = new MacAddressTypeImpl();
		return macAddressType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MandatoryType createMandatoryType() {
		MandatoryTypeImpl mandatoryType = new MandatoryTypeImpl();
		return mandatoryType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MaxLengthType createMaxLengthType() {
		MaxLengthTypeImpl maxLengthType = new MaxLengthTypeImpl();
		return maxLengthType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MaxType createMaxType() {
		MaxTypeImpl maxType = new MaxTypeImpl();
		return maxType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MibType createMibType() {
		MibTypeImpl mibType = new MibTypeImpl();
		return mibType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimNameType createMimNameType() {
		MimNameTypeImpl mimNameType = new MimNameTypeImpl();
		return mimNameType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimType createMimType() {
		MimTypeImpl mimType = new MimTypeImpl();
		return mimType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimVersionType createMimVersionType() {
		MimVersionTypeImpl mimVersionType = new MimVersionTypeImpl();
		return mimVersionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MinLengthType createMinLengthType() {
		MinLengthTypeImpl minLengthType = new MinLengthTypeImpl();
		return minLengthType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MinType createMinType() {
		MinTypeImpl minType = new MinTypeImpl();
		return minType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ModelsType createModelsType() {
		ModelsTypeImpl modelsType = new ModelsTypeImpl();
		return modelsType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MoRefType createMoRefType() {
		MoRefTypeImpl moRefType = new MoRefTypeImpl();
		return moRefType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MoRestartType createMoRestartType() {
		MoRestartTypeImpl moRestartType = new MoRestartTypeImpl();
		return moRestartType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MultiplicationFactorType createMultiplicationFactorType() {
		MultiplicationFactorTypeImpl multiplicationFactorType = new MultiplicationFactorTypeImpl();
		return multiplicationFactorType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NodeRestartType createNodeRestartType() {
		NodeRestartTypeImpl nodeRestartType = new NodeRestartTypeImpl();
		return nodeRestartType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NoneType createNoneType() {
		NoneTypeImpl noneType = new NoneTypeImpl();
		return noneType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NoNotificationType createNoNotificationType() {
		NoNotificationTypeImpl noNotificationType = new NoNotificationTypeImpl();
		return noNotificationType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotCreatableType createNotCreatableType() {
		NotCreatableTypeImpl notCreatableType = new NotCreatableTypeImpl();
		return notCreatableType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotDeleteableType createNotDeleteableType() {
		NotDeleteableTypeImpl notDeleteableType = new NotDeleteableTypeImpl();
		return notDeleteableType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NonPersistentType createNonPersistentType() {
		NonPersistentTypeImpl nonPersistentType = new NonPersistentTypeImpl();
		return nonPersistentType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NonUniqueType createNonUniqueType() {
		NonUniqueTypeImpl nonUniqueType = new NonUniqueTypeImpl();
		return nonUniqueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NoRestartType createNoRestartType() {
		NoRestartTypeImpl noRestartType = new NoRestartTypeImpl();
		return noRestartType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationTypesType createNotificationTypesType() {
		NotificationTypesTypeImpl notificationTypesType = new NotificationTypesTypeImpl();
		return notificationTypesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OctetType createOctetType() {
		OctetTypeImpl octetType = new OctetTypeImpl();
		return octetType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OrderedType createOrderedType() {
		OrderedTypeImpl orderedType = new OrderedTypeImpl();
		return orderedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutType createOutType() {
		OutTypeImpl outType = new OutTypeImpl();
		return outType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ParentType createParentType() {
		ParentTypeImpl parentType = new ParentTypeImpl();
		return parentType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PreconditionType createPreconditionType() {
		PreconditionTypeImpl preconditionType = new PreconditionTypeImpl();
		return preconditionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RaisesExceptionType createRaisesExceptionType() {
		RaisesExceptionTypeImpl raisesExceptionType = new RaisesExceptionTypeImpl();
		return raisesExceptionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RangesType createRangesType() {
		RangesTypeImpl rangesType = new RangesTypeImpl();
		return rangesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StringLengthType createStringLengthType() {
		StringLengthTypeImpl stringLengthType = new StringLengthTypeImpl();
		return stringLengthType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SubrangeType createSubrangeType() {
		SubrangeTypeImpl subrangeType = new SubrangeTypeImpl();
		return subrangeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResolutionType createResolutionType() {
		ResolutionTypeImpl resolutionType = new ResolutionTypeImpl();
		return resolutionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RestartTypeType createRestartTypeType() {
		RestartTypeTypeImpl restartTypeType = new RestartTypeTypeImpl();
		return restartTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RestrictedType createRestrictedType() {
		RestrictedTypeImpl restrictedType = new RestrictedTypeImpl();
		return restrictedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReturnTypeType createReturnTypeType() {
		ReturnTypeTypeImpl returnTypeType = new ReturnTypeTypeImpl();
		return returnTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SamplingRateType createSamplingRateType() {
		SamplingRateTypeImpl samplingRateType = new SamplingRateTypeImpl();
		return samplingRateType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScannerType createScannerType() {
		ScannerTypeImpl scannerType = new ScannerTypeImpl();
		return scannerType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SeqDefaultValueType createSeqDefaultValueType() {
		SeqDefaultValueTypeImpl seqDefaultValueType = new SeqDefaultValueTypeImpl();
		return seqDefaultValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SeqValueType createSeqValueType() {
		SeqValueTypeImpl seqValueType = new SeqValueTypeImpl();
		return seqValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ShortType createShortType() {
		ShortTypeImpl shortType = new ShortTypeImpl();
		return shortType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SideEffectsType createSideEffectsType() {
		SideEffectsTypeImpl sideEffectsType = new SideEffectsTypeImpl();
		return sideEffectsType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StaticType createStaticType() {
		StaticTypeImpl staticType = new StaticTypeImpl();
		return staticType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SlotType createSlotType() {
		SlotTypeImpl slotType = new SlotTypeImpl();
		return slotType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StructMemberType createStructMemberType() {
		StructMemberTypeImpl structMemberType = new StructMemberTypeImpl();
		return structMemberType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StructRefType createStructRefType() {
		StructRefTypeImpl structRefType = new StructRefTypeImpl();
		return structRefType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StructType createStructType() {
		StructTypeImpl structType = new StructTypeImpl();
		return structType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SubclassType createSubclassType() {
		SubclassTypeImpl subclassType = new SubclassTypeImpl();
		return subclassType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SuperclassType createSuperclassType() {
		SuperclassTypeImpl superclassType = new SuperclassTypeImpl();
		return superclassType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SystemCreatedType createSystemCreatedType() {
		SystemCreatedTypeImpl systemCreatedType = new SystemCreatedTypeImpl();
		return systemCreatedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TakesEffectType createTakesEffectType() {
		TakesEffectTypeImpl takesEffectType = new TakesEffectTypeImpl();
		return takesEffectType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TransactionRequiredType createTransactionRequiredType() {
		TransactionRequiredTypeImpl transactionRequiredType = new TransactionRequiredTypeImpl();
		return transactionRequiredType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint16Type createUint16Type() {
		Uint16TypeImpl uint16Type = new Uint16TypeImpl();
		return uint16Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint32Type createUint32Type() {
		Uint32TypeImpl uint32Type = new Uint32TypeImpl();
		return uint32Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint64Type createUint64Type() {
		Uint64TypeImpl uint64Type = new Uint64TypeImpl();
		return uint64Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uint8Type createUint8Type() {
		Uint8TypeImpl uint8Type = new Uint8TypeImpl();
		return uint8Type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UndefinedType createUndefinedType() {
		UndefinedTypeImpl undefinedType = new UndefinedTypeImpl();
		return undefinedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UndefinedValueType createUndefinedValueType() {
		UndefinedValueTypeImpl undefinedValueType = new UndefinedValueTypeImpl();
		return undefinedValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UniDirectionalAssociationType createUniDirectionalAssociationType() {
		UniDirectionalAssociationTypeImpl uniDirectionalAssociationType = new UniDirectionalAssociationTypeImpl();
		return uniDirectionalAssociationType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UnitType createUnitType() {
		UnitTypeImpl unitType = new UnitTypeImpl();
		return unitType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValidValuesType createValidValuesType() {
		ValidValuesTypeImpl validValuesType = new ValidValuesTypeImpl();
		return validValuesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VisibilityType createVisibilityType() {
		VisibilityTypeImpl visibilityType = new VisibilityTypeImpl();
		return visibilityType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public WstringType createWstringType() {
		WstringTypeImpl wstringType = new WstringTypeImpl();
		return wstringType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReadOnlyType createReadOnlyType() {
		ReadOnlyTypeImpl readOnlyType = new ReadOnlyTypeImpl();
		return readOnlyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeprecatedType createDeprecatedType() {
		DeprecatedTypeImpl deprecatedType = new DeprecatedTypeImpl();
		return deprecatedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ObsoleteType createObsoleteType() {
		ObsoleteTypeImpl obsoleteType = new ObsoleteTypeImpl();
		return obsoleteType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SpecificationType createSpecificationType() {
		SpecificationTypeImpl specificationType = new SpecificationTypeImpl();
		return specificationType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatusInformationType createStatusInformationType() {
		StatusInformationTypeImpl statusInformationType = new StatusInformationTypeImpl();
		return statusInformationType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RootType createRootType() {
		RootTypeImpl rootType = new RootTypeImpl();
		return rootType;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YangRootType createYangRootType() {
		YangRootTypeImpl yangRootType = new YangRootTypeImpl();
		return yangRootType;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ExtensionType createExtensionType() {
		ExtensionTypeImpl extensionType = new ExtensionTypeImpl();
		return extensionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DomainExtensionType createDomainExtensionType() {
		DomainExtensionTypeImpl domainExtensionType = new DomainExtensionTypeImpl();
		return domainExtensionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TransactionConstraintsType createTransactionConstraintsType() {
		TransactionConstraintsTypeImpl transactionConstraintsType = new TransactionConstraintsTypeImpl();
		return transactionConstraintsType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApprovedByType createApprovedByType() {
		ApprovedByTypeImpl approvedByType = new ApprovedByTypeImpl();
		return approvedByType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SignatureType createSignatureType() {
		SignatureTypeImpl signatureType = new SignatureTypeImpl();
		return signatureType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NameType createNameType() {
		NameTypeImpl nameType = new NameTypeImpl();
		return nameType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CompanyType createCompanyType() {
		CompanyTypeImpl companyType = new CompanyTypeImpl();
		return companyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public YearType createYearType() {
		YearTypeImpl yearType = new YearTypeImpl();
		return yearType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DisclaimerType createDisclaimerType() {
		DisclaimerTypeImpl disclaimerType = new DisclaimerTypeImpl();
		return disclaimerType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CreatedByType createCreatedByType() {
		CreatedByTypeImpl createdByType = new CreatedByTypeImpl();
		return createdByType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocDateType createDocDateType() {
		DocDateTypeImpl docDateType = new DocDateTypeImpl();
		return docDateType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocLangType createDocLangType() {
		DocLangTypeImpl docLangType = new DocLangTypeImpl();
		return docLangType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocNumType createDocNumType() {
		DocNumTypeImpl docNumType = new DocNumTypeImpl();
		return docNumType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocRevType createDocRevType() {
		DocRevTypeImpl docRevType = new DocRevTypeImpl();
		return docRevType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DtdVersionType createDtdVersionType() {
		DtdVersionTypeImpl dtdVersionType = new DtdVersionTypeImpl();
		return dtdVersionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimPartType createMimPartType() {
		MimPartTypeImpl mimPartType = new MimPartTypeImpl();
		return mimPartType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimPartsType createMimPartsType() {
		MimPartsTypeImpl mimPartsType = new MimPartsTypeImpl();
		return mimPartsType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomMetaDataType createMomMetaDataType() {
		MomMetaDataTypeImpl momMetaDataType = new MomMetaDataTypeImpl();
		return momMetaDataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomSubTitleType createMomSubTitleType() {
		MomSubTitleTypeImpl momSubTitleType = new MomSubTitleTypeImpl();
		return momSubTitleType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomTitleType createMomTitleType() {
		MomTitleTypeImpl momTitleType = new MomTitleTypeImpl();
		return momTitleType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomIdentityType createMomIdentityType() {
		MomIdentityTypeImpl momIdentityType = new MomIdentityTypeImpl();
		return momIdentityType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PreliminaryType createPreliminaryType() {
		PreliminaryTypeImpl preliminaryType = new PreliminaryTypeImpl();
		return preliminaryType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ImplementsType createImplementsType() {
		ImplementsTypeImpl implementsType = new ImplementsTypeImpl();
		return implementsType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IsNillableType createIsNillableType() {
		IsNillableTypeImpl isNillableType = new IsNillableTypeImpl();
		return isNillableType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IsPassphraseType createIsPassphraseType() {
		IsPassphraseTypeImpl isPassphraseType = new IsPassphraseTypeImpl();
		return isPassphraseType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DecisionStatementType createDecisionStatementType() {
		DecisionStatementTypeImpl decisionStatementType = new DecisionStatementTypeImpl();
		return decisionStatementType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RuleType createRuleType() {
		RuleTypeImpl ruleType = new RuleTypeImpl();
		return ruleType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ModelFeaturesType createModelFeaturesType() {
		ModelFeaturesTypeImpl modelFeaturesType = new ModelFeaturesTypeImpl();
		return modelFeaturesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ModelFeatureType createModelFeatureType() {
		ModelFeatureTypeImpl modelFeatureType = new ModelFeatureTypeImpl();
		return modelFeatureType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MpPackage getMpPackage() {
		return (MpPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static MpPackage getPackage() {
		return MpPackage.eINSTANCE;
	}

} //MpFactoryImpl
