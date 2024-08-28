/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.util;

import Mp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Mp.MpPackage
 * @generated
 */
public class MpAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static MpPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MpPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MpSwitch<Adapter> modelSwitch =
        new MpSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseActionType(ActionType object) {
				return createActionTypeAdapter();
			}
			@Override
			public Adapter caseAlphabetType(AlphabetType object) {
				return createAlphabetTypeAdapter();
			}
			@Override
			public Adapter caseApplicationTagType(ApplicationTagType object) {
				return createApplicationTagTypeAdapter();
			}
			@Override
			public Adapter caseAssociationEndType(AssociationEndType object) {
				return createAssociationEndTypeAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseBaseTypeType(BaseTypeType object) {
				return createBaseTypeTypeAdapter();
			}
			@Override
			public Adapter caseBiDirectionalAssociationType(BiDirectionalAssociationType object) {
				return createBiDirectionalAssociationTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseCardinalityType(CardinalityType object) {
				return createCardinalityTypeAdapter();
			}
			@Override
			public Adapter caseCharType(CharType object) {
				return createCharTypeAdapter();
			}
			@Override
			public Adapter caseChildType(ChildType object) {
				return createChildTypeAdapter();
			}
			@Override
			public Adapter caseComplexSeqValueType(ComplexSeqValueType object) {
				return createComplexSeqValueTypeAdapter();
			}
			@Override
			public Adapter caseComplexValueType(ComplexValueType object) {
				return createComplexValueTypeAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseConditionType(ConditionType object) {
				return createConditionTypeAdapter();
			}
			@Override
			public Adapter caseContainmentType(ContainmentType object) {
				return createContainmentTypeAdapter();
			}
			@Override
			public Adapter caseCopyrightType(CopyrightType object) {
				return createCopyrightTypeAdapter();
			}
			@Override
			public Adapter caseCounterContextType(CounterContextType object) {
				return createCounterContextTypeAdapter();
			}
			@Override
			public Adapter caseCounterResetType(CounterResetType object) {
				return createCounterResetTypeAdapter();
			}
			@Override
			public Adapter caseCounterTypeType(CounterTypeType object) {
				return createCounterTypeTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeType(DataTypeType object) {
				return createDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDefaultValueType(DefaultValueType object) {
				return createDefaultValueTypeAdapter();
			}
			@Override
			public Adapter caseDeletionPolicyType(DeletionPolicyType object) {
				return createDeletionPolicyTypeAdapter();
			}
			@Override
			public Adapter caseIsReservingType(IsReservingType object) {
				return createIsReservingTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesScriptType(DependenciesScriptType object) {
				return createDependenciesScriptTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType(DependenciesType object) {
				return createDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseDerivedDataTypeRefType(DerivedDataTypeRefType object) {
				return createDerivedDataTypeRefTypeAdapter();
			}
			@Override
			public Adapter caseDerivedDataTypeType(DerivedDataTypeType object) {
				return createDerivedDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDisturbancesType(DisturbancesType object) {
				return createDisturbancesTypeAdapter();
			}
			@Override
			public Adapter caseDoubleType(DoubleType object) {
				return createDoubleTypeAdapter();
			}
			@Override
			public Adapter caseEnumMemberType(EnumMemberType object) {
				return createEnumMemberTypeAdapter();
			}
			@Override
			public Adapter caseEnumRefType(EnumRefType object) {
				return createEnumRefTypeAdapter();
			}
			@Override
			public Adapter caseEnumType(EnumType object) {
				return createEnumTypeAdapter();
			}
			@Override
			public Adapter caseExceptionParameterType(ExceptionParameterType object) {
				return createExceptionParameterTypeAdapter();
			}
			@Override
			public Adapter caseExceptionType(ExceptionType object) {
				return createExceptionTypeAdapter();
			}
			@Override
			public Adapter caseFeatureType(FeatureType object) {
				return createFeatureTypeAdapter();
			}
			@Override
			public Adapter caseFloatType(FloatType object) {
				return createFloatTypeAdapter();
			}
			@Override
			public Adapter caseGetValueType(GetValueType object) {
				return createGetValueTypeAdapter();
			}
			@Override
			public Adapter caseHasClassType(HasClassType object) {
				return createHasClassTypeAdapter();
			}
			@Override
			public Adapter caseInheritanceType(InheritanceType object) {
				return createInheritanceTypeAdapter();
			}
			@Override
			public Adapter caseIndexedType(IndexedType object) {
				return createIndexedTypeAdapter();
			}
			@Override
			public Adapter caseInoutType(InoutType object) {
				return createInoutTypeAdapter();
			}
			@Override
			public Adapter caseInt16Type(Int16Type object) {
				return createInt16TypeAdapter();
			}
			@Override
			public Adapter caseInt32Type(Int32Type object) {
				return createInt32TypeAdapter();
			}
			@Override
			public Adapter caseInt64Type(Int64Type object) {
				return createInt64TypeAdapter();
			}
			@Override
			public Adapter caseInt8Type(Int8Type object) {
				return createInt8TypeAdapter();
			}
			@Override
			public Adapter caseDecisionPointType(DecisionPointType object) {
				return createDecisionPointTypeAdapter();
			}
			@Override
			public Adapter caseValidationRulesType(ValidationRulesType object) {
				return createValidationRulesTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceOnlyType(InterfaceOnlyType object) {
				return createInterfaceOnlyTypeAdapter();
			}
			@Override
			public Adapter caseInterMimType(InterMimType object) {
				return createInterMimTypeAdapter();
			}
			@Override
			public Adapter caseInType(InType object) {
				return createInTypeAdapter();
			}
			@Override
			public Adapter caseIpV4AddressType(IpV4AddressType object) {
				return createIpV4AddressTypeAdapter();
			}
			@Override
			public Adapter caseIpV6AddressType(IpV6AddressType object) {
				return createIpV6AddressTypeAdapter();
			}
			@Override
			public Adapter caseIsExclusiveType(IsExclusiveType object) {
				return createIsExclusiveTypeAdapter();
			}
			@Override
			public Adapter caseKeyType(KeyType object) {
				return createKeyTypeAdapter();
			}
			@Override
			public Adapter caseLengthRangeType(LengthRangeType object) {
				return createLengthRangeTypeAdapter();
			}
			@Override
			public Adapter caseLocalType(LocalType object) {
				return createLocalTypeAdapter();
			}
			@Override
			public Adapter caseLockBeforeDeleteType(LockBeforeDeleteType object) {
				return createLockBeforeDeleteTypeAdapter();
			}
			@Override
			public Adapter caseLockBeforeExecuteType(LockBeforeExecuteType object) {
				return createLockBeforeExecuteTypeAdapter();
			}
			@Override
			public Adapter caseLockBeforeModifyType(LockBeforeModifyType object) {
				return createLockBeforeModifyTypeAdapter();
			}
			@Override
			public Adapter caseLonglongType(LonglongType object) {
				return createLonglongTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseLongType(LongType object) {
				return createLongTypeAdapter();
			}
			@Override
			public Adapter caseMacAddressType(MacAddressType object) {
				return createMacAddressTypeAdapter();
			}
			@Override
			public Adapter caseMandatoryType(MandatoryType object) {
				return createMandatoryTypeAdapter();
			}
			@Override
			public Adapter caseMaxLengthType(MaxLengthType object) {
				return createMaxLengthTypeAdapter();
			}
			@Override
			public Adapter caseMaxType(MaxType object) {
				return createMaxTypeAdapter();
			}
			@Override
			public Adapter caseMibType(MibType object) {
				return createMibTypeAdapter();
			}
			@Override
			public Adapter caseMimNameType(MimNameType object) {
				return createMimNameTypeAdapter();
			}
			@Override
			public Adapter caseMimType(MimType object) {
				return createMimTypeAdapter();
			}
			@Override
			public Adapter caseMimVersionType(MimVersionType object) {
				return createMimVersionTypeAdapter();
			}
			@Override
			public Adapter caseMinLengthType(MinLengthType object) {
				return createMinLengthTypeAdapter();
			}
			@Override
			public Adapter caseMinType(MinType object) {
				return createMinTypeAdapter();
			}
			@Override
			public Adapter caseModelsType(ModelsType object) {
				return createModelsTypeAdapter();
			}
			@Override
			public Adapter caseMoRefType(MoRefType object) {
				return createMoRefTypeAdapter();
			}
			@Override
			public Adapter caseMoRestartType(MoRestartType object) {
				return createMoRestartTypeAdapter();
			}
			@Override
			public Adapter caseMultiplicationFactorType(MultiplicationFactorType object) {
				return createMultiplicationFactorTypeAdapter();
			}
			@Override
			public Adapter caseNodeRestartType(NodeRestartType object) {
				return createNodeRestartTypeAdapter();
			}
			@Override
			public Adapter caseNoneType(NoneType object) {
				return createNoneTypeAdapter();
			}
			@Override
			public Adapter caseNoNotificationType(NoNotificationType object) {
				return createNoNotificationTypeAdapter();
			}
			@Override
			public Adapter caseNotCreatableType(NotCreatableType object) {
				return createNotCreatableTypeAdapter();
			}
			@Override
			public Adapter caseNotDeleteableType(NotDeleteableType object) {
				return createNotDeleteableTypeAdapter();
			}
			@Override
			public Adapter caseNonPersistentType(NonPersistentType object) {
				return createNonPersistentTypeAdapter();
			}
			@Override
			public Adapter caseNonUniqueType(NonUniqueType object) {
				return createNonUniqueTypeAdapter();
			}
			@Override
			public Adapter caseNoRestartType(NoRestartType object) {
				return createNoRestartTypeAdapter();
			}
			@Override
			public Adapter caseNotificationTypesType(NotificationTypesType object) {
				return createNotificationTypesTypeAdapter();
			}
			@Override
			public Adapter caseOctetType(OctetType object) {
				return createOctetTypeAdapter();
			}
			@Override
			public Adapter caseOrderedType(OrderedType object) {
				return createOrderedTypeAdapter();
			}
			@Override
			public Adapter caseOutType(OutType object) {
				return createOutTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParentType(ParentType object) {
				return createParentTypeAdapter();
			}
			@Override
			public Adapter casePreconditionType(PreconditionType object) {
				return createPreconditionTypeAdapter();
			}
			@Override
			public Adapter caseRaisesExceptionType(RaisesExceptionType object) {
				return createRaisesExceptionTypeAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseRangesType(RangesType object) {
				return createRangesTypeAdapter();
			}
			@Override
			public Adapter caseStringLengthType(StringLengthType object) {
				return createStringLengthTypeAdapter();
			}
			@Override
			public Adapter caseSubrangeType(SubrangeType object) {
				return createSubrangeTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipType(RelationshipType object) {
				return createRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseResolutionType(ResolutionType object) {
				return createResolutionTypeAdapter();
			}
			@Override
			public Adapter caseRestartTypeType(RestartTypeType object) {
				return createRestartTypeTypeAdapter();
			}
			@Override
			public Adapter caseRestrictedType(RestrictedType object) {
				return createRestrictedTypeAdapter();
			}
			@Override
			public Adapter caseReturnTypeType(ReturnTypeType object) {
				return createReturnTypeTypeAdapter();
			}
			@Override
			public Adapter caseSamplingRateType(SamplingRateType object) {
				return createSamplingRateTypeAdapter();
			}
			@Override
			public Adapter caseScannerType(ScannerType object) {
				return createScannerTypeAdapter();
			}
			@Override
			public Adapter caseSeqDefaultValueType(SeqDefaultValueType object) {
				return createSeqDefaultValueTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSeqValueType(SeqValueType object) {
				return createSeqValueTypeAdapter();
			}
			@Override
			public Adapter caseShortType(ShortType object) {
				return createShortTypeAdapter();
			}
			@Override
			public Adapter caseSideEffectsType(SideEffectsType object) {
				return createSideEffectsTypeAdapter();
			}
			@Override
			public Adapter caseStaticType(StaticType object) {
				return createStaticTypeAdapter();
			}
			@Override
			public Adapter caseSlotType(SlotType object) {
				return createSlotTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseStructMemberType(StructMemberType object) {
				return createStructMemberTypeAdapter();
			}
			@Override
			public Adapter caseStructRefType(StructRefType object) {
				return createStructRefTypeAdapter();
			}
			@Override
			public Adapter caseStructType(StructType object) {
				return createStructTypeAdapter();
			}
			@Override
			public Adapter caseSubclassType(SubclassType object) {
				return createSubclassTypeAdapter();
			}
			@Override
			public Adapter caseSuperclassType(SuperclassType object) {
				return createSuperclassTypeAdapter();
			}
			@Override
			public Adapter caseSystemCreatedType(SystemCreatedType object) {
				return createSystemCreatedTypeAdapter();
			}
			@Override
			public Adapter caseTakesEffectType(TakesEffectType object) {
				return createTakesEffectTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseTransactionRequiredType(TransactionRequiredType object) {
				return createTransactionRequiredTypeAdapter();
			}
			@Override
			public Adapter caseUint16Type(Uint16Type object) {
				return createUint16TypeAdapter();
			}
			@Override
			public Adapter caseUint32Type(Uint32Type object) {
				return createUint32TypeAdapter();
			}
			@Override
			public Adapter caseUint64Type(Uint64Type object) {
				return createUint64TypeAdapter();
			}
			@Override
			public Adapter caseUint8Type(Uint8Type object) {
				return createUint8TypeAdapter();
			}
			@Override
			public Adapter caseUndefinedType(UndefinedType object) {
				return createUndefinedTypeAdapter();
			}
			@Override
			public Adapter caseUndefinedValueType(UndefinedValueType object) {
				return createUndefinedValueTypeAdapter();
			}
			@Override
			public Adapter caseUniDirectionalAssociationType(UniDirectionalAssociationType object) {
				return createUniDirectionalAssociationTypeAdapter();
			}
			@Override
			public Adapter caseUnitType(UnitType object) {
				return createUnitTypeAdapter();
			}
			@Override
			public Adapter caseValidValuesType(ValidValuesType object) {
				return createValidValuesTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseVisibilityType(VisibilityType object) {
				return createVisibilityTypeAdapter();
			}
			@Override
			public Adapter caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			@Override
			public Adapter caseWstringType(WstringType object) {
				return createWstringTypeAdapter();
			}
			@Override
			public Adapter caseReadOnlyType(ReadOnlyType object) {
				return createReadOnlyTypeAdapter();
			}
			@Override
			public Adapter caseDeprecatedType(DeprecatedType object) {
				return createDeprecatedTypeAdapter();
			}
			@Override
			public Adapter caseObsoleteType(ObsoleteType object) {
				return createObsoleteTypeAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseSpecificationType(SpecificationType object) {
				return createSpecificationTypeAdapter();
			}
			@Override
			public Adapter caseStatusInformationType(StatusInformationType object) {
				return createStatusInformationTypeAdapter();
			}
			@Override
			public Adapter caseRootType(RootType object) {
				return createRootTypeAdapter();
			}
			@Override
			public Adapter caseYangRootType(YangRootType object) {
				return createYangRootTypeAdapter();
			}
			@Override
			public Adapter caseExtensionType(ExtensionType object) {
				return createExtensionTypeAdapter();
			}
			@Override
			public Adapter caseDomainExtensionType(DomainExtensionType object) {
				return createDomainExtensionTypeAdapter();
			}
			@Override
			public Adapter caseTransactionConstraintsType(TransactionConstraintsType object) {
				return createTransactionConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseApprovedByType(ApprovedByType object) {
				return createApprovedByTypeAdapter();
			}
			@Override
			public Adapter caseSignatureType(SignatureType object) {
				return createSignatureTypeAdapter();
			}
			@Override
			public Adapter caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			@Override
			public Adapter caseCompanyType(CompanyType object) {
				return createCompanyTypeAdapter();
			}
			@Override
			public Adapter caseYearType(YearType object) {
				return createYearTypeAdapter();
			}
			@Override
			public Adapter caseDisclaimerType(DisclaimerType object) {
				return createDisclaimerTypeAdapter();
			}
			@Override
			public Adapter caseCreatedByType(CreatedByType object) {
				return createCreatedByTypeAdapter();
			}
			@Override
			public Adapter caseDocDateType(DocDateType object) {
				return createDocDateTypeAdapter();
			}
			@Override
			public Adapter caseDocLangType(DocLangType object) {
				return createDocLangTypeAdapter();
			}
			@Override
			public Adapter caseDocNumType(DocNumType object) {
				return createDocNumTypeAdapter();
			}
			@Override
			public Adapter caseDocRevType(DocRevType object) {
				return createDocRevTypeAdapter();
			}
			@Override
			public Adapter caseDtdVersionType(DtdVersionType object) {
				return createDtdVersionTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseMimPartType(MimPartType object) {
				return createMimPartTypeAdapter();
			}
			@Override
			public Adapter caseMimPartsType(MimPartsType object) {
				return createMimPartsTypeAdapter();
			}
			@Override
			public Adapter caseMomMetaDataType(MomMetaDataType object) {
				return createMomMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseMomSubTitleType(MomSubTitleType object) {
				return createMomSubTitleTypeAdapter();
			}
			@Override
			public Adapter caseMomTitleType(MomTitleType object) {
				return createMomTitleTypeAdapter();
			}
			@Override
			public Adapter caseMomIdentityType(MomIdentityType object) {
				return createMomIdentityTypeAdapter();
			}
			@Override
			public Adapter casePreliminaryType(PreliminaryType object) {
				return createPreliminaryTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseImplementsType(ImplementsType object) {
				return createImplementsTypeAdapter();
			}
			@Override
			public Adapter caseIsNillableType(IsNillableType object) {
				return createIsNillableTypeAdapter();
			}
			@Override
			public Adapter caseIsPassphraseType(IsPassphraseType object) {
				return createIsPassphraseTypeAdapter();
			}
			@Override
			public Adapter caseDecisionStatementType(DecisionStatementType object) {
				return createDecisionStatementTypeAdapter();
			}
			@Override
			public Adapter caseRuleType(RuleType object) {
				return createRuleTypeAdapter();
			}
			@Override
			public Adapter caseModelFeaturesType(ModelFeaturesType object) {
				return createModelFeaturesTypeAdapter();
			}
			@Override
			public Adapter caseModelFeatureType(ModelFeatureType object) {
				return createModelFeatureTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link Mp.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DocumentRoot
	 * @generated
	 */
    public Adapter createDocumentRootAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ActionType
	 * @generated
	 */
    public Adapter createActionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.AlphabetType <em>Alphabet Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.AlphabetType
	 * @generated
	 */
    public Adapter createAlphabetTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ApplicationTagType <em>Application Tag Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ApplicationTagType
	 * @generated
	 */
    public Adapter createApplicationTagTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.AssociationEndType <em>Association End Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.AssociationEndType
	 * @generated
	 */
    public Adapter createAssociationEndTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.AttributeType
	 * @generated
	 */
    public Adapter createAttributeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.BaseTypeType <em>Base Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.BaseTypeType
	 * @generated
	 */
    public Adapter createBaseTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.BiDirectionalAssociationType <em>Bi Directional Association Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.BiDirectionalAssociationType
	 * @generated
	 */
    public Adapter createBiDirectionalAssociationTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.BooleanType
	 * @generated
	 */
    public Adapter createBooleanTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CardinalityType
	 * @generated
	 */
    public Adapter createCardinalityTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CharType
	 * @generated
	 */
    public Adapter createCharTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ChildType <em>Child Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ChildType
	 * @generated
	 */
    public Adapter createChildTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ComplexSeqValueType <em>Complex Seq Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ComplexSeqValueType
	 * @generated
	 */
    public Adapter createComplexSeqValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ComplexValueType <em>Complex Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ComplexValueType
	 * @generated
	 */
    public Adapter createComplexValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ClassType
	 * @generated
	 */
    public Adapter createClassTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ConditionType
	 * @generated
	 */
    public Adapter createConditionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ContainmentType <em>Containment Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ContainmentType
	 * @generated
	 */
    public Adapter createContainmentTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CopyrightType <em>Copyright Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CopyrightType
	 * @generated
	 */
    public Adapter createCopyrightTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CounterContextType <em>Counter Context Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CounterContextType
	 * @generated
	 */
    public Adapter createCounterContextTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CounterResetType <em>Counter Reset Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CounterResetType
	 * @generated
	 */
    public Adapter createCounterResetTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CounterTypeType <em>Counter Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CounterTypeType
	 * @generated
	 */
    public Adapter createCounterTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DataTypeType <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DataTypeType
	 * @generated
	 */
    public Adapter createDataTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DateType
	 * @generated
	 */
    public Adapter createDateTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DefaultValueType <em>Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DefaultValueType
	 * @generated
	 */
    public Adapter createDefaultValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DeletionPolicyType <em>Deletion Policy Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DeletionPolicyType
	 * @generated
	 */
    public Adapter createDeletionPolicyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IsReservingType <em>Is Reserving Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IsReservingType
	 * @generated
	 */
    public Adapter createIsReservingTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DependenciesScriptType <em>Dependencies Script Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DependenciesScriptType
	 * @generated
	 */
    public Adapter createDependenciesScriptTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DependenciesType
	 * @generated
	 */
    public Adapter createDependenciesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DerivedDataTypeRefType <em>Derived Data Type Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DerivedDataTypeRefType
	 * @generated
	 */
    public Adapter createDerivedDataTypeRefTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DerivedDataTypeType <em>Derived Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DerivedDataTypeType
	 * @generated
	 */
    public Adapter createDerivedDataTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DescriptionType
	 * @generated
	 */
    public Adapter createDescriptionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DisturbancesType <em>Disturbances Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DisturbancesType
	 * @generated
	 */
    public Adapter createDisturbancesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DoubleType
	 * @generated
	 */
    public Adapter createDoubleTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.EnumMemberType <em>Enum Member Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.EnumMemberType
	 * @generated
	 */
    public Adapter createEnumMemberTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.EnumRefType <em>Enum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.EnumRefType
	 * @generated
	 */
    public Adapter createEnumRefTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.EnumType
	 * @generated
	 */
    public Adapter createEnumTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ExceptionParameterType <em>Exception Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ExceptionParameterType
	 * @generated
	 */
    public Adapter createExceptionParameterTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ExceptionType
	 * @generated
	 */
    public Adapter createExceptionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.FeatureType
	 * @generated
	 */
    public Adapter createFeatureTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.FloatType
	 * @generated
	 */
    public Adapter createFloatTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.GetValueType <em>Get Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.GetValueType
	 * @generated
	 */
    public Adapter createGetValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.HasClassType <em>Has Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.HasClassType
	 * @generated
	 */
    public Adapter createHasClassTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.InheritanceType
	 * @generated
	 */
    public Adapter createInheritanceTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IndexedType <em>Indexed Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IndexedType
	 * @generated
	 */
    public Adapter createIndexedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.InoutType <em>Inout Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.InoutType
	 * @generated
	 */
    public Adapter createInoutTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Int16Type <em>Int16 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Int16Type
	 * @generated
	 */
    public Adapter createInt16TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Int32Type <em>Int32 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Int32Type
	 * @generated
	 */
    public Adapter createInt32TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Int64Type <em>Int64 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Int64Type
	 * @generated
	 */
    public Adapter createInt64TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Int8Type <em>Int8 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Int8Type
	 * @generated
	 */
    public Adapter createInt8TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DecisionPointType <em>Decision Point Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DecisionPointType
	 * @generated
	 */
    public Adapter createDecisionPointTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ValidationRulesType <em>Validation Rules Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ValidationRulesType
	 * @generated
	 */
    public Adapter createValidationRulesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.InterfaceOnlyType <em>Interface Only Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.InterfaceOnlyType
	 * @generated
	 */
    public Adapter createInterfaceOnlyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.InterMimType <em>Inter Mim Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.InterMimType
	 * @generated
	 */
    public Adapter createInterMimTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.InType <em>In Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.InType
	 * @generated
	 */
    public Adapter createInTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IpV4AddressType <em>Ip V4 Address Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IpV4AddressType
	 * @generated
	 */
    public Adapter createIpV4AddressTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IpV6AddressType <em>Ip V6 Address Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IpV6AddressType
	 * @generated
	 */
    public Adapter createIpV6AddressTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IsExclusiveType <em>Is Exclusive Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IsExclusiveType
	 * @generated
	 */
    public Adapter createIsExclusiveTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.KeyType
	 * @generated
	 */
    public Adapter createKeyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LengthRangeType <em>Length Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LengthRangeType
	 * @generated
	 */
    public Adapter createLengthRangeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LocalType
	 * @generated
	 */
    public Adapter createLocalTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LockBeforeDeleteType <em>Lock Before Delete Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LockBeforeDeleteType
	 * @generated
	 */
    public Adapter createLockBeforeDeleteTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LockBeforeExecuteType <em>Lock Before Execute Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LockBeforeExecuteType
	 * @generated
	 */
    public Adapter createLockBeforeExecuteTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LockBeforeModifyType <em>Lock Before Modify Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LockBeforeModifyType
	 * @generated
	 */
    public Adapter createLockBeforeModifyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LonglongType <em>Longlong Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LonglongType
	 * @generated
	 */
    public Adapter createLonglongTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ObjectType
	 * @generated
	 */
    public Adapter createObjectTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LongType <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LongType
	 * @generated
	 */
    public Adapter createLongTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MacAddressType <em>Mac Address Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MacAddressType
	 * @generated
	 */
    public Adapter createMacAddressTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MandatoryType <em>Mandatory Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MandatoryType
	 * @generated
	 */
    public Adapter createMandatoryTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MaxLengthType <em>Max Length Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MaxLengthType
	 * @generated
	 */
    public Adapter createMaxLengthTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MaxType <em>Max Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MaxType
	 * @generated
	 */
    public Adapter createMaxTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MibType <em>Mib Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MibType
	 * @generated
	 */
    public Adapter createMibTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MimNameType <em>Mim Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MimNameType
	 * @generated
	 */
    public Adapter createMimNameTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MimType <em>Mim Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MimType
	 * @generated
	 */
    public Adapter createMimTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MimVersionType <em>Mim Version Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MimVersionType
	 * @generated
	 */
    public Adapter createMimVersionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MinLengthType <em>Min Length Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MinLengthType
	 * @generated
	 */
    public Adapter createMinLengthTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MinType <em>Min Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MinType
	 * @generated
	 */
    public Adapter createMinTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ModelsType <em>Models Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ModelsType
	 * @generated
	 */
    public Adapter createModelsTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MoRefType <em>Mo Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MoRefType
	 * @generated
	 */
    public Adapter createMoRefTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MoRestartType <em>Mo Restart Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MoRestartType
	 * @generated
	 */
    public Adapter createMoRestartTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MultiplicationFactorType <em>Multiplication Factor Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MultiplicationFactorType
	 * @generated
	 */
    public Adapter createMultiplicationFactorTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NodeRestartType <em>Node Restart Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NodeRestartType
	 * @generated
	 */
    public Adapter createNodeRestartTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NoneType <em>None Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NoneType
	 * @generated
	 */
    public Adapter createNoneTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NoNotificationType <em>No Notification Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NoNotificationType
	 * @generated
	 */
    public Adapter createNoNotificationTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NotCreatableType <em>Not Creatable Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NotCreatableType
	 * @generated
	 */
    public Adapter createNotCreatableTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NotDeleteableType <em>Not Deleteable Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NotDeleteableType
	 * @generated
	 */
    public Adapter createNotDeleteableTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NonPersistentType <em>Non Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NonPersistentType
	 * @generated
	 */
    public Adapter createNonPersistentTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NonUniqueType <em>Non Unique Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NonUniqueType
	 * @generated
	 */
    public Adapter createNonUniqueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NoRestartType <em>No Restart Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NoRestartType
	 * @generated
	 */
    public Adapter createNoRestartTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NotificationTypesType <em>Notification Types Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NotificationTypesType
	 * @generated
	 */
    public Adapter createNotificationTypesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.OctetType <em>Octet Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.OctetType
	 * @generated
	 */
    public Adapter createOctetTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.OrderedType <em>Ordered Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.OrderedType
	 * @generated
	 */
    public Adapter createOrderedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.OutType <em>Out Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.OutType
	 * @generated
	 */
    public Adapter createOutTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ParameterType
	 * @generated
	 */
    public Adapter createParameterTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ParentType
	 * @generated
	 */
    public Adapter createParentTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.PreconditionType <em>Precondition Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.PreconditionType
	 * @generated
	 */
    public Adapter createPreconditionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RaisesExceptionType <em>Raises Exception Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RaisesExceptionType
	 * @generated
	 */
    public Adapter createRaisesExceptionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RangeType
	 * @generated
	 */
    public Adapter createRangeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RangesType <em>Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RangesType
	 * @generated
	 */
    public Adapter createRangesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.StringLengthType <em>String Length Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.StringLengthType
	 * @generated
	 */
    public Adapter createStringLengthTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SubrangeType <em>Subrange Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SubrangeType
	 * @generated
	 */
    public Adapter createSubrangeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RelationshipType
	 * @generated
	 */
    public Adapter createRelationshipTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ResolutionType
	 * @generated
	 */
    public Adapter createResolutionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RestartTypeType <em>Restart Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RestartTypeType
	 * @generated
	 */
    public Adapter createRestartTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RestrictedType <em>Restricted Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RestrictedType
	 * @generated
	 */
    public Adapter createRestrictedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ReturnTypeType <em>Return Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ReturnTypeType
	 * @generated
	 */
    public Adapter createReturnTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SamplingRateType <em>Sampling Rate Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SamplingRateType
	 * @generated
	 */
    public Adapter createSamplingRateTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ScannerType <em>Scanner Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ScannerType
	 * @generated
	 */
    public Adapter createScannerTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SeqDefaultValueType <em>Seq Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SeqDefaultValueType
	 * @generated
	 */
    public Adapter createSeqDefaultValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SequenceType
	 * @generated
	 */
    public Adapter createSequenceTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SeqValueType <em>Seq Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SeqValueType
	 * @generated
	 */
    public Adapter createSeqValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ShortType <em>Short Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ShortType
	 * @generated
	 */
    public Adapter createShortTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SideEffectsType <em>Side Effects Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SideEffectsType
	 * @generated
	 */
    public Adapter createSideEffectsTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.StaticType <em>Static Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.StaticType
	 * @generated
	 */
    public Adapter createStaticTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SlotType
	 * @generated
	 */
    public Adapter createSlotTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.StringType
	 * @generated
	 */
    public Adapter createStringTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.StructMemberType <em>Struct Member Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.StructMemberType
	 * @generated
	 */
    public Adapter createStructMemberTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.StructRefType <em>Struct Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.StructRefType
	 * @generated
	 */
    public Adapter createStructRefTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.StructType
	 * @generated
	 */
    public Adapter createStructTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SubclassType <em>Subclass Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SubclassType
	 * @generated
	 */
    public Adapter createSubclassTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SuperclassType <em>Superclass Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SuperclassType
	 * @generated
	 */
    public Adapter createSuperclassTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SystemCreatedType <em>System Created Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SystemCreatedType
	 * @generated
	 */
    public Adapter createSystemCreatedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.TakesEffectType <em>Takes Effect Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.TakesEffectType
	 * @generated
	 */
    public Adapter createTakesEffectTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.TimeType
	 * @generated
	 */
    public Adapter createTimeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.TransactionRequiredType <em>Transaction Required Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.TransactionRequiredType
	 * @generated
	 */
    public Adapter createTransactionRequiredTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Uint16Type <em>Uint16 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Uint16Type
	 * @generated
	 */
    public Adapter createUint16TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Uint32Type <em>Uint32 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Uint32Type
	 * @generated
	 */
    public Adapter createUint32TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Uint64Type <em>Uint64 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Uint64Type
	 * @generated
	 */
    public Adapter createUint64TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.Uint8Type <em>Uint8 Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.Uint8Type
	 * @generated
	 */
    public Adapter createUint8TypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.UndefinedType <em>Undefined Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.UndefinedType
	 * @generated
	 */
    public Adapter createUndefinedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.UndefinedValueType <em>Undefined Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.UndefinedValueType
	 * @generated
	 */
    public Adapter createUndefinedValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.UniDirectionalAssociationType <em>Uni Directional Association Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.UniDirectionalAssociationType
	 * @generated
	 */
    public Adapter createUniDirectionalAssociationTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.UnitType
	 * @generated
	 */
    public Adapter createUnitTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ValidValuesType <em>Valid Values Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ValidValuesType
	 * @generated
	 */
    public Adapter createValidValuesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ValueType
	 * @generated
	 */
    public Adapter createValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.VisibilityType <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.VisibilityType
	 * @generated
	 */
    public Adapter createVisibilityTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.VoidType
	 * @generated
	 */
    public Adapter createVoidTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.WstringType <em>Wstring Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.WstringType
	 * @generated
	 */
    public Adapter createWstringTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ReadOnlyType <em>Read Only Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ReadOnlyType
	 * @generated
	 */
    public Adapter createReadOnlyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DeprecatedType <em>Deprecated Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DeprecatedType
	 * @generated
	 */
    public Adapter createDeprecatedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ObsoleteType <em>Obsolete Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ObsoleteType
	 * @generated
	 */
    public Adapter createObsoleteTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.FilterType
	 * @generated
	 */
    public Adapter createFilterTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SpecificationType
	 * @generated
	 */
    public Adapter createSpecificationTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.StatusInformationType <em>Status Information Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.StatusInformationType
	 * @generated
	 */
    public Adapter createStatusInformationTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RootType
	 * @generated
	 */
    public Adapter createRootTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.YangRootType <em>Yang Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.YangRootType
	 * @generated
	 */
	public Adapter createYangRootTypeAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link Mp.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ExtensionType
	 * @generated
	 */
    public Adapter createExtensionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DomainExtensionType <em>Domain Extension Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DomainExtensionType
	 * @generated
	 */
    public Adapter createDomainExtensionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.TransactionConstraintsType <em>Transaction Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.TransactionConstraintsType
	 * @generated
	 */
    public Adapter createTransactionConstraintsTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ApprovedByType <em>Approved By Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ApprovedByType
	 * @generated
	 */
    public Adapter createApprovedByTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.SignatureType <em>Signature Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.SignatureType
	 * @generated
	 */
    public Adapter createSignatureTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.NameType
	 * @generated
	 */
    public Adapter createNameTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CompanyType <em>Company Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CompanyType
	 * @generated
	 */
    public Adapter createCompanyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.YearType <em>Year Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.YearType
	 * @generated
	 */
    public Adapter createYearTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DisclaimerType <em>Disclaimer Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DisclaimerType
	 * @generated
	 */
    public Adapter createDisclaimerTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.CreatedByType <em>Created By Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.CreatedByType
	 * @generated
	 */
    public Adapter createCreatedByTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DocDateType <em>Doc Date Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DocDateType
	 * @generated
	 */
    public Adapter createDocDateTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DocLangType <em>Doc Lang Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DocLangType
	 * @generated
	 */
    public Adapter createDocLangTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DocNumType <em>Doc Num Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DocNumType
	 * @generated
	 */
    public Adapter createDocNumTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DocRevType <em>Doc Rev Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DocRevType
	 * @generated
	 */
    public Adapter createDocRevTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DtdVersionType <em>Dtd Version Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DtdVersionType
	 * @generated
	 */
    public Adapter createDtdVersionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.LabelType
	 * @generated
	 */
    public Adapter createLabelTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MimPartType <em>Mim Part Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MimPartType
	 * @generated
	 */
    public Adapter createMimPartTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MimPartsType <em>Mim Parts Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MimPartsType
	 * @generated
	 */
    public Adapter createMimPartsTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MomMetaDataType <em>Mom Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MomMetaDataType
	 * @generated
	 */
    public Adapter createMomMetaDataTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MomSubTitleType <em>Mom Sub Title Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MomSubTitleType
	 * @generated
	 */
    public Adapter createMomSubTitleTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MomTitleType <em>Mom Title Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MomTitleType
	 * @generated
	 */
    public Adapter createMomTitleTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.MomIdentityType <em>Mom Identity Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.MomIdentityType
	 * @generated
	 */
    public Adapter createMomIdentityTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.PreliminaryType <em>Preliminary Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.PreliminaryType
	 * @generated
	 */
    public Adapter createPreliminaryTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DataType
	 * @generated
	 */
    public Adapter createDataTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ImplementsType <em>Implements Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ImplementsType
	 * @generated
	 */
    public Adapter createImplementsTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IsNillableType <em>Is Nillable Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IsNillableType
	 * @generated
	 */
    public Adapter createIsNillableTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IsPassphraseType <em>Is Passphrase Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IsPassphraseType
	 * @generated
	 */
    public Adapter createIsPassphraseTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.DecisionStatementType <em>Decision Statement Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.DecisionStatementType
	 * @generated
	 */
    public Adapter createDecisionStatementTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.RuleType
	 * @generated
	 */
    public Adapter createRuleTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ModelFeaturesType <em>Model Features Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ModelFeaturesType
	 * @generated
	 */
    public Adapter createModelFeaturesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.ModelFeatureType <em>Model Feature Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.ModelFeatureType
	 * @generated
	 */
    public Adapter createModelFeatureTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link Mp.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mp.IntegerType
	 * @generated
	 */
    public Adapter createIntegerTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //MpAdapterFactory
