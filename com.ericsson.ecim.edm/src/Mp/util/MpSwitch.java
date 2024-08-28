/**
 */
package Mp.util;

import Mp.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Mp.MpPackage
 * @generated
 */
public class MpSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static MpPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MpSwitch() {
		if (modelPackage == null) {
			modelPackage = MpPackage.eINSTANCE;
		}
	}

    /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MpPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ALPHABET_TYPE: {
				AlphabetType alphabetType = (AlphabetType)theEObject;
				T result = caseAlphabetType(alphabetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.APPLICATION_TAG_TYPE: {
				ApplicationTagType applicationTagType = (ApplicationTagType)theEObject;
				T result = caseApplicationTagType(applicationTagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ASSOCIATION_END_TYPE: {
				AssociationEndType associationEndType = (AssociationEndType)theEObject;
				T result = caseAssociationEndType(associationEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.BASE_TYPE_TYPE: {
				BaseTypeType baseTypeType = (BaseTypeType)theEObject;
				T result = caseBaseTypeType(baseTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE: {
				BiDirectionalAssociationType biDirectionalAssociationType = (BiDirectionalAssociationType)theEObject;
				T result = caseBiDirectionalAssociationType(biDirectionalAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = caseDataType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.CARDINALITY_TYPE: {
				CardinalityType cardinalityType = (CardinalityType)theEObject;
				T result = caseCardinalityType(cardinalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.CHAR_TYPE: {
				CharType charType = (CharType)theEObject;
				T result = caseCharType(charType);
				if (result == null) result = caseDataType(charType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.CHILD_TYPE: {
				ChildType childType = (ChildType)theEObject;
				T result = caseChildType(childType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.COMPLEX_SEQ_VALUE_TYPE: {
				ComplexSeqValueType complexSeqValueType = (ComplexSeqValueType)theEObject;
				T result = caseComplexSeqValueType(complexSeqValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.COMPLEX_VALUE_TYPE: {
				ComplexValueType complexValueType = (ComplexValueType)theEObject;
				T result = caseComplexValueType(complexValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.CLASS_TYPE: {
				ClassType classType = (ClassType)theEObject;
				T result = caseClassType(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.CONDITION_TYPE: {
				ConditionType conditionType = (ConditionType)theEObject;
				T result = caseConditionType(conditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.CONTAINMENT_TYPE: {
				ContainmentType containmentType = (ContainmentType)theEObject;
				T result = caseContainmentType(containmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.COPYRIGHT_TYPE: {
				CopyrightType copyrightType = (CopyrightType)theEObject;
				T result = caseCopyrightType(copyrightType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.COUNTER_CONTEXT_TYPE: {
				CounterContextType counterContextType = (CounterContextType)theEObject;
				T result = caseCounterContextType(counterContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.COUNTER_RESET_TYPE: {
				CounterResetType counterResetType = (CounterResetType)theEObject;
				T result = caseCounterResetType(counterResetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.COUNTER_TYPE_TYPE: {
				CounterTypeType counterTypeType = (CounterTypeType)theEObject;
				T result = caseCounterTypeType(counterTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DATA_TYPE_TYPE: {
				DataTypeType dataTypeType = (DataTypeType)theEObject;
				T result = caseDataTypeType(dataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DEFAULT_VALUE_TYPE: {
				DefaultValueType defaultValueType = (DefaultValueType)theEObject;
				T result = caseDefaultValueType(defaultValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DELETION_POLICY_TYPE: {
				DeletionPolicyType deletionPolicyType = (DeletionPolicyType)theEObject;
				T result = caseDeletionPolicyType(deletionPolicyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IS_RESERVING_TYPE: {
				IsReservingType isReservingType = (IsReservingType)theEObject;
				T result = caseIsReservingType(isReservingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DEPENDENCIES_SCRIPT_TYPE: {
				DependenciesScriptType dependenciesScriptType = (DependenciesScriptType)theEObject;
				T result = caseDependenciesScriptType(dependenciesScriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DEPENDENCIES_TYPE: {
				DependenciesType dependenciesType = (DependenciesType)theEObject;
				T result = caseDependenciesType(dependenciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DERIVED_DATA_TYPE_REF_TYPE: {
				DerivedDataTypeRefType derivedDataTypeRefType = (DerivedDataTypeRefType)theEObject;
				T result = caseDerivedDataTypeRefType(derivedDataTypeRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DERIVED_DATA_TYPE_TYPE: {
				DerivedDataTypeType derivedDataTypeType = (DerivedDataTypeType)theEObject;
				T result = caseDerivedDataTypeType(derivedDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DISTURBANCES_TYPE: {
				DisturbancesType disturbancesType = (DisturbancesType)theEObject;
				T result = caseDisturbancesType(disturbancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DOUBLE_TYPE: {
				DoubleType doubleType = (DoubleType)theEObject;
				T result = caseDoubleType(doubleType);
				if (result == null) result = caseDataType(doubleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ENUM_MEMBER_TYPE: {
				EnumMemberType enumMemberType = (EnumMemberType)theEObject;
				T result = caseEnumMemberType(enumMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ENUM_REF_TYPE: {
				EnumRefType enumRefType = (EnumRefType)theEObject;
				T result = caseEnumRefType(enumRefType);
				if (result == null) result = caseDataType(enumRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				T result = caseEnumType(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.EXCEPTION_PARAMETER_TYPE: {
				ExceptionParameterType exceptionParameterType = (ExceptionParameterType)theEObject;
				T result = caseExceptionParameterType(exceptionParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.FEATURE_TYPE: {
				FeatureType featureType = (FeatureType)theEObject;
				T result = caseFeatureType(featureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.FLOAT_TYPE: {
				FloatType floatType = (FloatType)theEObject;
				T result = caseFloatType(floatType);
				if (result == null) result = caseDataType(floatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.GET_VALUE_TYPE: {
				GetValueType getValueType = (GetValueType)theEObject;
				T result = caseGetValueType(getValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.HAS_CLASS_TYPE: {
				HasClassType hasClassType = (HasClassType)theEObject;
				T result = caseHasClassType(hasClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INHERITANCE_TYPE: {
				InheritanceType inheritanceType = (InheritanceType)theEObject;
				T result = caseInheritanceType(inheritanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INDEXED_TYPE: {
				IndexedType indexedType = (IndexedType)theEObject;
				T result = caseIndexedType(indexedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INOUT_TYPE: {
				InoutType inoutType = (InoutType)theEObject;
				T result = caseInoutType(inoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INT16_TYPE: {
				Int16Type int16Type = (Int16Type)theEObject;
				T result = caseInt16Type(int16Type);
				if (result == null) result = caseDataType(int16Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INT32_TYPE: {
				Int32Type int32Type = (Int32Type)theEObject;
				T result = caseInt32Type(int32Type);
				if (result == null) result = caseDataType(int32Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INT64_TYPE: {
				Int64Type int64Type = (Int64Type)theEObject;
				T result = caseInt64Type(int64Type);
				if (result == null) result = caseDataType(int64Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INT8_TYPE: {
				Int8Type int8Type = (Int8Type)theEObject;
				T result = caseInt8Type(int8Type);
				if (result == null) result = caseDataType(int8Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DECISION_POINT_TYPE: {
				DecisionPointType decisionPointType = (DecisionPointType)theEObject;
				T result = caseDecisionPointType(decisionPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.VALIDATION_RULES_TYPE: {
				ValidationRulesType validationRulesType = (ValidationRulesType)theEObject;
				T result = caseValidationRulesType(validationRulesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INTERFACE_ONLY_TYPE: {
				InterfaceOnlyType interfaceOnlyType = (InterfaceOnlyType)theEObject;
				T result = caseInterfaceOnlyType(interfaceOnlyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INTER_MIM_TYPE: {
				InterMimType interMimType = (InterMimType)theEObject;
				T result = caseInterMimType(interMimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IN_TYPE: {
				InType inType = (InType)theEObject;
				T result = caseInType(inType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IP_V4_ADDRESS_TYPE: {
				IpV4AddressType ipV4AddressType = (IpV4AddressType)theEObject;
				T result = caseIpV4AddressType(ipV4AddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IP_V6_ADDRESS_TYPE: {
				IpV6AddressType ipV6AddressType = (IpV6AddressType)theEObject;
				T result = caseIpV6AddressType(ipV6AddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IS_EXCLUSIVE_TYPE: {
				IsExclusiveType isExclusiveType = (IsExclusiveType)theEObject;
				T result = caseIsExclusiveType(isExclusiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.KEY_TYPE: {
				KeyType keyType = (KeyType)theEObject;
				T result = caseKeyType(keyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LENGTH_RANGE_TYPE: {
				LengthRangeType lengthRangeType = (LengthRangeType)theEObject;
				T result = caseLengthRangeType(lengthRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LOCAL_TYPE: {
				LocalType localType = (LocalType)theEObject;
				T result = caseLocalType(localType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LOCK_BEFORE_DELETE_TYPE: {
				LockBeforeDeleteType lockBeforeDeleteType = (LockBeforeDeleteType)theEObject;
				T result = caseLockBeforeDeleteType(lockBeforeDeleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LOCK_BEFORE_EXECUTE_TYPE: {
				LockBeforeExecuteType lockBeforeExecuteType = (LockBeforeExecuteType)theEObject;
				T result = caseLockBeforeExecuteType(lockBeforeExecuteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LOCK_BEFORE_MODIFY_TYPE: {
				LockBeforeModifyType lockBeforeModifyType = (LockBeforeModifyType)theEObject;
				T result = caseLockBeforeModifyType(lockBeforeModifyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LONGLONG_TYPE: {
				LonglongType longlongType = (LonglongType)theEObject;
				T result = caseLonglongType(longlongType);
				if (result == null) result = caseDataType(longlongType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LONG_TYPE: {
				LongType longType = (LongType)theEObject;
				T result = caseLongType(longType);
				if (result == null) result = caseDataType(longType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MAC_ADDRESS_TYPE: {
				MacAddressType macAddressType = (MacAddressType)theEObject;
				T result = caseMacAddressType(macAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MANDATORY_TYPE: {
				MandatoryType mandatoryType = (MandatoryType)theEObject;
				T result = caseMandatoryType(mandatoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MAX_LENGTH_TYPE: {
				MaxLengthType maxLengthType = (MaxLengthType)theEObject;
				T result = caseMaxLengthType(maxLengthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MAX_TYPE: {
				MaxType maxType = (MaxType)theEObject;
				T result = caseMaxType(maxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIB_TYPE: {
				MibType mibType = (MibType)theEObject;
				T result = caseMibType(mibType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIM_NAME_TYPE: {
				MimNameType mimNameType = (MimNameType)theEObject;
				T result = caseMimNameType(mimNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIM_TYPE: {
				MimType mimType = (MimType)theEObject;
				T result = caseMimType(mimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIM_VERSION_TYPE: {
				MimVersionType mimVersionType = (MimVersionType)theEObject;
				T result = caseMimVersionType(mimVersionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIN_LENGTH_TYPE: {
				MinLengthType minLengthType = (MinLengthType)theEObject;
				T result = caseMinLengthType(minLengthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIN_TYPE: {
				MinType minType = (MinType)theEObject;
				T result = caseMinType(minType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MODELS_TYPE: {
				ModelsType modelsType = (ModelsType)theEObject;
				T result = caseModelsType(modelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MO_REF_TYPE: {
				MoRefType moRefType = (MoRefType)theEObject;
				T result = caseMoRefType(moRefType);
				if (result == null) result = caseDataType(moRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MO_RESTART_TYPE: {
				MoRestartType moRestartType = (MoRestartType)theEObject;
				T result = caseMoRestartType(moRestartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MULTIPLICATION_FACTOR_TYPE: {
				MultiplicationFactorType multiplicationFactorType = (MultiplicationFactorType)theEObject;
				T result = caseMultiplicationFactorType(multiplicationFactorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NODE_RESTART_TYPE: {
				NodeRestartType nodeRestartType = (NodeRestartType)theEObject;
				T result = caseNodeRestartType(nodeRestartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NONE_TYPE: {
				NoneType noneType = (NoneType)theEObject;
				T result = caseNoneType(noneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NO_NOTIFICATION_TYPE: {
				NoNotificationType noNotificationType = (NoNotificationType)theEObject;
				T result = caseNoNotificationType(noNotificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NOT_CREATABLE_TYPE: {
				NotCreatableType notCreatableType = (NotCreatableType)theEObject;
				T result = caseNotCreatableType(notCreatableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NOT_DELETEABLE_TYPE: {
				NotDeleteableType notDeleteableType = (NotDeleteableType)theEObject;
				T result = caseNotDeleteableType(notDeleteableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NON_PERSISTENT_TYPE: {
				NonPersistentType nonPersistentType = (NonPersistentType)theEObject;
				T result = caseNonPersistentType(nonPersistentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NON_UNIQUE_TYPE: {
				NonUniqueType nonUniqueType = (NonUniqueType)theEObject;
				T result = caseNonUniqueType(nonUniqueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NO_RESTART_TYPE: {
				NoRestartType noRestartType = (NoRestartType)theEObject;
				T result = caseNoRestartType(noRestartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NOTIFICATION_TYPES_TYPE: {
				NotificationTypesType notificationTypesType = (NotificationTypesType)theEObject;
				T result = caseNotificationTypesType(notificationTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.OCTET_TYPE: {
				OctetType octetType = (OctetType)theEObject;
				T result = caseOctetType(octetType);
				if (result == null) result = caseDataType(octetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ORDERED_TYPE: {
				OrderedType orderedType = (OrderedType)theEObject;
				T result = caseOrderedType(orderedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.OUT_TYPE: {
				OutType outType = (OutType)theEObject;
				T result = caseOutType(outType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.PARENT_TYPE: {
				ParentType parentType = (ParentType)theEObject;
				T result = caseParentType(parentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.PRECONDITION_TYPE: {
				PreconditionType preconditionType = (PreconditionType)theEObject;
				T result = casePreconditionType(preconditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RAISES_EXCEPTION_TYPE: {
				RaisesExceptionType raisesExceptionType = (RaisesExceptionType)theEObject;
				T result = caseRaisesExceptionType(raisesExceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RANGES_TYPE: {
				RangesType rangesType = (RangesType)theEObject;
				T result = caseRangesType(rangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.STRING_LENGTH_TYPE: {
				StringLengthType stringLengthType = (StringLengthType)theEObject;
				T result = caseStringLengthType(stringLengthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SUBRANGE_TYPE: {
				SubrangeType subrangeType = (SubrangeType)theEObject;
				T result = caseSubrangeType(subrangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				T result = caseRelationshipType(relationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RESOLUTION_TYPE: {
				ResolutionType resolutionType = (ResolutionType)theEObject;
				T result = caseResolutionType(resolutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RESTART_TYPE_TYPE: {
				RestartTypeType restartTypeType = (RestartTypeType)theEObject;
				T result = caseRestartTypeType(restartTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RESTRICTED_TYPE: {
				RestrictedType restrictedType = (RestrictedType)theEObject;
				T result = caseRestrictedType(restrictedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RETURN_TYPE_TYPE: {
				ReturnTypeType returnTypeType = (ReturnTypeType)theEObject;
				T result = caseReturnTypeType(returnTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SAMPLING_RATE_TYPE: {
				SamplingRateType samplingRateType = (SamplingRateType)theEObject;
				T result = caseSamplingRateType(samplingRateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SCANNER_TYPE: {
				ScannerType scannerType = (ScannerType)theEObject;
				T result = caseScannerType(scannerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SEQ_DEFAULT_VALUE_TYPE: {
				SeqDefaultValueType seqDefaultValueType = (SeqDefaultValueType)theEObject;
				T result = caseSeqDefaultValueType(seqDefaultValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = caseDataType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SEQ_VALUE_TYPE: {
				SeqValueType seqValueType = (SeqValueType)theEObject;
				T result = caseSeqValueType(seqValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SHORT_TYPE: {
				ShortType shortType = (ShortType)theEObject;
				T result = caseShortType(shortType);
				if (result == null) result = caseDataType(shortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SIDE_EFFECTS_TYPE: {
				SideEffectsType sideEffectsType = (SideEffectsType)theEObject;
				T result = caseSideEffectsType(sideEffectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.STATIC_TYPE: {
				StaticType staticType = (StaticType)theEObject;
				T result = caseStaticType(staticType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SLOT_TYPE: {
				SlotType slotType = (SlotType)theEObject;
				T result = caseSlotType(slotType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = caseDataType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.STRUCT_MEMBER_TYPE: {
				StructMemberType structMemberType = (StructMemberType)theEObject;
				T result = caseStructMemberType(structMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.STRUCT_REF_TYPE: {
				StructRefType structRefType = (StructRefType)theEObject;
				T result = caseStructRefType(structRefType);
				if (result == null) result = caseDataType(structRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.STRUCT_TYPE: {
				StructType structType = (StructType)theEObject;
				T result = caseStructType(structType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SUBCLASS_TYPE: {
				SubclassType subclassType = (SubclassType)theEObject;
				T result = caseSubclassType(subclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SUPERCLASS_TYPE: {
				SuperclassType superclassType = (SuperclassType)theEObject;
				T result = caseSuperclassType(superclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SYSTEM_CREATED_TYPE: {
				SystemCreatedType systemCreatedType = (SystemCreatedType)theEObject;
				T result = caseSystemCreatedType(systemCreatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.TAKES_EFFECT_TYPE: {
				TakesEffectType takesEffectType = (TakesEffectType)theEObject;
				T result = caseTakesEffectType(takesEffectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.TRANSACTION_REQUIRED_TYPE: {
				TransactionRequiredType transactionRequiredType = (TransactionRequiredType)theEObject;
				T result = caseTransactionRequiredType(transactionRequiredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UINT16_TYPE: {
				Uint16Type uint16Type = (Uint16Type)theEObject;
				T result = caseUint16Type(uint16Type);
				if (result == null) result = caseDataType(uint16Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UINT32_TYPE: {
				Uint32Type uint32Type = (Uint32Type)theEObject;
				T result = caseUint32Type(uint32Type);
				if (result == null) result = caseDataType(uint32Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UINT64_TYPE: {
				Uint64Type uint64Type = (Uint64Type)theEObject;
				T result = caseUint64Type(uint64Type);
				if (result == null) result = caseDataType(uint64Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UINT8_TYPE: {
				Uint8Type uint8Type = (Uint8Type)theEObject;
				T result = caseUint8Type(uint8Type);
				if (result == null) result = caseDataType(uint8Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UNDEFINED_TYPE: {
				UndefinedType undefinedType = (UndefinedType)theEObject;
				T result = caseUndefinedType(undefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UNDEFINED_VALUE_TYPE: {
				UndefinedValueType undefinedValueType = (UndefinedValueType)theEObject;
				T result = caseUndefinedValueType(undefinedValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE: {
				UniDirectionalAssociationType uniDirectionalAssociationType = (UniDirectionalAssociationType)theEObject;
				T result = caseUniDirectionalAssociationType(uniDirectionalAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.UNIT_TYPE: {
				UnitType unitType = (UnitType)theEObject;
				T result = caseUnitType(unitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.VALID_VALUES_TYPE: {
				ValidValuesType validValuesType = (ValidValuesType)theEObject;
				T result = caseValidValuesType(validValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.VISIBILITY_TYPE: {
				VisibilityType visibilityType = (VisibilityType)theEObject;
				T result = caseVisibilityType(visibilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				T result = caseVoidType(voidType);
				if (result == null) result = caseDataType(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.WSTRING_TYPE: {
				WstringType wstringType = (WstringType)theEObject;
				T result = caseWstringType(wstringType);
				if (result == null) result = caseDataType(wstringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.READ_ONLY_TYPE: {
				ReadOnlyType readOnlyType = (ReadOnlyType)theEObject;
				T result = caseReadOnlyType(readOnlyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DEPRECATED_TYPE: {
				DeprecatedType deprecatedType = (DeprecatedType)theEObject;
				T result = caseDeprecatedType(deprecatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.OBSOLETE_TYPE: {
				ObsoleteType obsoleteType = (ObsoleteType)theEObject;
				T result = caseObsoleteType(obsoleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SPECIFICATION_TYPE: {
				SpecificationType specificationType = (SpecificationType)theEObject;
				T result = caseSpecificationType(specificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.STATUS_INFORMATION_TYPE: {
				StatusInformationType statusInformationType = (StatusInformationType)theEObject;
				T result = caseStatusInformationType(statusInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.ROOT_TYPE: {
				RootType rootType = (RootType)theEObject;
				T result = caseRootType(rootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.YANG_ROOT_TYPE: {
				YangRootType yangRootType = (YangRootType)theEObject;
				T result = caseYangRootType(yangRootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.EXTENSION_TYPE: {
				ExtensionType extensionType = (ExtensionType)theEObject;
				T result = caseExtensionType(extensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DOMAIN_EXTENSION_TYPE: {
				DomainExtensionType domainExtensionType = (DomainExtensionType)theEObject;
				T result = caseDomainExtensionType(domainExtensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.TRANSACTION_CONSTRAINTS_TYPE: {
				TransactionConstraintsType transactionConstraintsType = (TransactionConstraintsType)theEObject;
				T result = caseTransactionConstraintsType(transactionConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.APPROVED_BY_TYPE: {
				ApprovedByType approvedByType = (ApprovedByType)theEObject;
				T result = caseApprovedByType(approvedByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.SIGNATURE_TYPE: {
				SignatureType signatureType = (SignatureType)theEObject;
				T result = caseSignatureType(signatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.NAME_TYPE: {
				NameType nameType = (NameType)theEObject;
				T result = caseNameType(nameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.COMPANY_TYPE: {
				CompanyType companyType = (CompanyType)theEObject;
				T result = caseCompanyType(companyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.YEAR_TYPE: {
				YearType yearType = (YearType)theEObject;
				T result = caseYearType(yearType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DISCLAIMER_TYPE: {
				DisclaimerType disclaimerType = (DisclaimerType)theEObject;
				T result = caseDisclaimerType(disclaimerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.CREATED_BY_TYPE: {
				CreatedByType createdByType = (CreatedByType)theEObject;
				T result = caseCreatedByType(createdByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DOC_DATE_TYPE: {
				DocDateType docDateType = (DocDateType)theEObject;
				T result = caseDocDateType(docDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DOC_LANG_TYPE: {
				DocLangType docLangType = (DocLangType)theEObject;
				T result = caseDocLangType(docLangType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DOC_NUM_TYPE: {
				DocNumType docNumType = (DocNumType)theEObject;
				T result = caseDocNumType(docNumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DOC_REV_TYPE: {
				DocRevType docRevType = (DocRevType)theEObject;
				T result = caseDocRevType(docRevType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DTD_VERSION_TYPE: {
				DtdVersionType dtdVersionType = (DtdVersionType)theEObject;
				T result = caseDtdVersionType(dtdVersionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIM_PART_TYPE: {
				MimPartType mimPartType = (MimPartType)theEObject;
				T result = caseMimPartType(mimPartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MIM_PARTS_TYPE: {
				MimPartsType mimPartsType = (MimPartsType)theEObject;
				T result = caseMimPartsType(mimPartsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MOM_META_DATA_TYPE: {
				MomMetaDataType momMetaDataType = (MomMetaDataType)theEObject;
				T result = caseMomMetaDataType(momMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MOM_SUB_TITLE_TYPE: {
				MomSubTitleType momSubTitleType = (MomSubTitleType)theEObject;
				T result = caseMomSubTitleType(momSubTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MOM_TITLE_TYPE: {
				MomTitleType momTitleType = (MomTitleType)theEObject;
				T result = caseMomTitleType(momTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MOM_IDENTITY_TYPE: {
				MomIdentityType momIdentityType = (MomIdentityType)theEObject;
				T result = caseMomIdentityType(momIdentityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.PRELIMINARY_TYPE: {
				PreliminaryType preliminaryType = (PreliminaryType)theEObject;
				T result = casePreliminaryType(preliminaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IMPLEMENTS_TYPE: {
				ImplementsType implementsType = (ImplementsType)theEObject;
				T result = caseImplementsType(implementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IS_NILLABLE_TYPE: {
				IsNillableType isNillableType = (IsNillableType)theEObject;
				T result = caseIsNillableType(isNillableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.IS_PASSPHRASE_TYPE: {
				IsPassphraseType isPassphraseType = (IsPassphraseType)theEObject;
				T result = caseIsPassphraseType(isPassphraseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.DECISION_STATEMENT_TYPE: {
				DecisionStatementType decisionStatementType = (DecisionStatementType)theEObject;
				T result = caseDecisionStatementType(decisionStatementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.RULE_TYPE: {
				RuleType ruleType = (RuleType)theEObject;
				T result = caseRuleType(ruleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MODEL_FEATURES_TYPE: {
				ModelFeaturesType modelFeaturesType = (ModelFeaturesType)theEObject;
				T result = caseModelFeaturesType(modelFeaturesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.MODEL_FEATURE_TYPE: {
				ModelFeatureType modelFeatureType = (ModelFeatureType)theEObject;
				T result = caseModelFeatureType(modelFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MpPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = caseDataType(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseActionType(ActionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAlphabetType(AlphabetType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Application Tag Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Tag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseApplicationTagType(ApplicationTagType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Association End Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAssociationEndType(AssociationEndType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAttributeType(AttributeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Base Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBaseTypeType(BaseTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Bi Directional Association Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bi Directional Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBiDirectionalAssociationType(BiDirectionalAssociationType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBooleanType(BooleanType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCardinalityType(CardinalityType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Char Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCharType(CharType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Child Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseChildType(ChildType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Seq Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Seq Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseComplexSeqValueType(ComplexSeqValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseComplexValueType(ComplexValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseClassType(ClassType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseConditionType(ConditionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseContainmentType(ContainmentType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCopyrightType(CopyrightType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Counter Context Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCounterContextType(CounterContextType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Counter Reset Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter Reset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCounterResetType(CounterResetType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Counter Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCounterTypeType(CounterTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataTypeType(DataTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDateType(DateType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDefaultValueType(DefaultValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion Policy Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion Policy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDeletionPolicyType(DeletionPolicyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Is Reserving Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Reserving Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIsReservingType(IsReservingType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencies Script Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencies Script Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDependenciesScriptType(DependenciesScriptType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDependenciesType(DependenciesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Data Type Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Data Type Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDerivedDataTypeRefType(DerivedDataTypeRefType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Data Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDerivedDataTypeType(DerivedDataTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDescriptionType(DescriptionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Disturbances Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disturbances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDisturbancesType(DisturbancesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDoubleType(DoubleType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Member Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnumMemberType(EnumMemberType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnumRefType(EnumRefType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnumType(EnumType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Parameter Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseExceptionParameterType(ExceptionParameterType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseExceptionType(ExceptionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseFeatureType(FeatureType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseFloatType(FloatType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Get Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseGetValueType(GetValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Has Class Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHasClassType(HasClassType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInheritanceType(InheritanceType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Indexed Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIndexedType(IndexedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Inout Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInoutType(InoutType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Int16 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int16 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInt16Type(Int16Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Int32 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int32 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInt32Type(Int32Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Int64 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int64 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInt64Type(Int64Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Int8 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int8 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInt8Type(Int8Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Point Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDecisionPointType(DecisionPointType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Rules Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Rules Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseValidationRulesType(ValidationRulesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Only Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Only Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInterfaceOnlyType(InterfaceOnlyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Mim Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Mim Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInterMimType(InterMimType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>In Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInType(InType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ip V4 Address Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip V4 Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIpV4AddressType(IpV4AddressType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ip V6 Address Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip V6 Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIpV6AddressType(IpV6AddressType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Is Exclusive Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Exclusive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIsExclusiveType(IsExclusiveType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKeyType(KeyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Length Range Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLengthRangeType(LengthRangeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLocalType(LocalType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Lock Before Delete Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Before Delete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLockBeforeDeleteType(LockBeforeDeleteType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Lock Before Execute Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Before Execute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLockBeforeExecuteType(LockBeforeExecuteType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Lock Before Modify Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Before Modify Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLockBeforeModifyType(LockBeforeModifyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Longlong Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Longlong Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLonglongType(LonglongType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseObjectType(ObjectType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Long Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLongType(LongType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mac Address Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mac Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMacAddressType(MacAddressType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMandatoryType(MandatoryType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Max Length Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Length Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMaxLengthType(MaxLengthType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Max Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMaxType(MaxType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mib Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mib Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMibType(MibType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mim Name Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mim Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMimNameType(MimNameType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mim Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mim Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMimType(MimType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mim Version Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mim Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMimVersionType(MimVersionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Min Length Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Length Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMinLengthType(MinLengthType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Min Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMinType(MinType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Models Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Models Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseModelsType(ModelsType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mo Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMoRefType(MoRefType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mo Restart Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo Restart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMoRestartType(MoRestartType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication Factor Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication Factor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMultiplicationFactorType(MultiplicationFactorType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node Restart Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Restart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNodeRestartType(NodeRestartType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>None Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNoneType(NoneType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>No Notification Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNoNotificationType(NoNotificationType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Not Creatable Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Creatable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNotCreatableType(NotCreatableType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Not Deleteable Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Deleteable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNotDeleteableType(NotDeleteableType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Non Persistent Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Persistent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNonPersistentType(NonPersistentType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Non Unique Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Unique Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNonUniqueType(NonUniqueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>No Restart Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Restart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNoRestartType(NoRestartType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Types Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNotificationTypesType(NotificationTypesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Octet Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOctetType(OctetType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOrderedType(OrderedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Out Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOutType(OutType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseParameterType(ParameterType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Parent Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseParentType(ParentType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T casePreconditionType(PreconditionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Raises Exception Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raises Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRaisesExceptionType(RaisesExceptionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRangeType(RangeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ranges Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRangesType(RangesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>String Length Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Length Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStringLengthType(StringLengthType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSubrangeType(SubrangeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRelationshipType(RelationshipType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseResolutionType(ResolutionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Restart Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restart Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRestartTypeType(RestartTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRestrictedType(RestrictedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseReturnTypeType(ReturnTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Rate Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSamplingRateType(SamplingRateType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Scanner Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scanner Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseScannerType(ScannerType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Default Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Default Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSeqDefaultValueType(SeqDefaultValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSequenceType(SequenceType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSeqValueType(SeqValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Short Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseShortType(ShortType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Side Effects Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Side Effects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSideEffectsType(SideEffectsType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Static Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStaticType(StaticType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSlotType(SlotType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStringType(StringType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Member Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStructMemberType(StructMemberType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Ref Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStructRefType(StructRefType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStructType(StructType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Subclass Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subclass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSubclassType(SubclassType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Superclass Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Superclass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSuperclassType(SuperclassType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>System Created Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Created Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSystemCreatedType(SystemCreatedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Takes Effect Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Takes Effect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTakesEffectType(TakesEffectType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTimeType(TimeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Required Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Required Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTransactionRequiredType(TransactionRequiredType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Uint16 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uint16 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUint16Type(Uint16Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Uint32 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uint32 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUint32Type(Uint32Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Uint64 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uint64 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUint64Type(Uint64Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Uint8 Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uint8 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUint8Type(Uint8Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Undefined Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undefined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUndefinedType(UndefinedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Undefined Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undefined Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUndefinedValueType(UndefinedValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Directional Association Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Directional Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUniDirectionalAssociationType(UniDirectionalAssociationType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUnitType(UnitType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Values Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseValidValuesType(ValidValuesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseValueType(ValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseVisibilityType(VisibilityType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseVoidType(VoidType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Wstring Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wstring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseWstringType(WstringType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Read Only Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Only Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseReadOnlyType(ReadOnlyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Deprecated Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deprecated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDeprecatedType(DeprecatedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Obsolete Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obsolete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseObsoleteType(ObsoleteType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseFilterType(FilterType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSpecificationType(SpecificationType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Status Information Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStatusInformationType(StatusInformationType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRootType(RootType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Yang Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yang Root Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYangRootType(YangRootType object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseExtensionType(ExtensionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Extension Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDomainExtensionType(DomainExtensionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Constraints Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTransactionConstraintsType(TransactionConstraintsType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Approved By Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approved By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseApprovedByType(ApprovedByType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSignatureType(SignatureType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNameType(NameType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Company Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCompanyType(CompanyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseYearType(YearType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Disclaimer Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disclaimer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDisclaimerType(DisclaimerType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Created By Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Created By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCreatedByType(CreatedByType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Date Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDocDateType(DocDateType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Lang Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Lang Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDocLangType(DocLangType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Num Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Num Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDocNumType(DocNumType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Rev Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Rev Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDocRevType(DocRevType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Dtd Version Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dtd Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDtdVersionType(DtdVersionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLabelType(LabelType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mim Part Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mim Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMimPartType(MimPartType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mim Parts Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mim Parts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMimPartsType(MimPartsType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mom Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mom Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMomMetaDataType(MomMetaDataType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mom Sub Title Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mom Sub Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMomSubTitleType(MomSubTitleType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mom Title Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mom Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMomTitleType(MomTitleType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mom Identity Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mom Identity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMomIdentityType(MomIdentityType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Preliminary Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preliminary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T casePreliminaryType(PreliminaryType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataType(DataType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Implements Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseImplementsType(ImplementsType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Is Nillable Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Nillable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIsNillableType(IsNillableType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Is Passphrase Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Passphrase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIsPassphraseType(IsPassphraseType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Statement Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Statement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDecisionStatementType(DecisionStatementType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRuleType(RuleType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Model Features Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Features Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseModelFeaturesType(ModelFeaturesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Model Feature Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseModelFeatureType(ModelFeatureType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIntegerType(IntegerType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
    @Override
    public T defaultCase(EObject object) {
		return null;
	}

} //MpSwitch
