/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.MpFactory;
import Mp.MpPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MpPackageImpl extends EPackageImpl implements MpPackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected String packageFilename = "Mp.ecore";

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass documentRootEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass actionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass alphabetTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass applicationTagTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass associationEndTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass attributeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass baseTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass biDirectionalAssociationTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass booleanTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass cardinalityTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass charTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass childTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass complexSeqValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass complexValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass classTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass conditionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass containmentTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass copyrightTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass counterContextTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass counterResetTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass counterTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dataTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dateTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass defaultValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass deletionPolicyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass isReservingTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dependenciesScriptTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dependenciesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass derivedDataTypeRefTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass derivedDataTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass descriptionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass disturbancesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass doubleTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass enumMemberTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass enumRefTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass enumTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass exceptionParameterTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass exceptionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass featureTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass floatTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass getValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass hasClassTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass inheritanceTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass indexedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass inoutTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass int16TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass int32TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass int64TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass int8TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass decisionPointTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass validationRulesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass interfaceOnlyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass interMimTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass inTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass ipV4AddressTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass ipV6AddressTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass isExclusiveTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass keyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass lengthRangeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass localTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass lockBeforeDeleteTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass lockBeforeExecuteTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass lockBeforeModifyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass longlongTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass objectTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass longTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass macAddressTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mandatoryTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass maxLengthTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass maxTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mibTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mimNameTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mimTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mimVersionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass minLengthTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass minTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass modelsTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass moRefTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass moRestartTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass multiplicationFactorTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass nodeRestartTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass noneTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass noNotificationTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass notCreatableTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass notDeleteableTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass nonPersistentTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass nonUniqueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass noRestartTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass notificationTypesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass octetTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass orderedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass outTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass parameterTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass parentTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass preconditionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass raisesExceptionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass rangeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass rangesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass stringLengthTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass subrangeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass relationshipTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass resolutionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass restartTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass restrictedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass returnTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass samplingRateTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass scannerTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass seqDefaultValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sequenceTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass seqValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass shortTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sideEffectsTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass staticTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass slotTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass stringTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass structMemberTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass structRefTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass structTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass subclassTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass superclassTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass systemCreatedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass takesEffectTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass timeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass transactionRequiredTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass uint16TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass uint32TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass uint64TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass uint8TypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass undefinedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass undefinedValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass uniDirectionalAssociationTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass unitTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass validValuesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass valueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass visibilityTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass voidTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass wstringTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass readOnlyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass deprecatedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass obsoleteTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass filterTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass specificationTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass statusInformationTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass rootTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yangRootTypeEClass = null;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass extensionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass domainExtensionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass transactionConstraintsTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass approvedByTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass signatureTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass nameTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass companyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass yearTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass disclaimerTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass createdByTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass docDateTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass docLangTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass docNumTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass docRevTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dtdVersionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass labelTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mimPartTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mimPartsTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass momMetaDataTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass momSubTitleTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass momTitleTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass momIdentityTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass preliminaryTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dataTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass implementsTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass isNillableTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass isPassphraseTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass decisionStatementTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass ruleTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass modelFeaturesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass modelFeatureTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass integerTypeEClass = null;

    /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Mp.MpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private MpPackageImpl() {
		super(eNS_URI, MpFactory.eINSTANCE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static boolean isInited = false;

    /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
    public static MpPackage init() {
		if (isInited) return (MpPackage)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI);

		// Obtain or create and register package
		MpPackageImpl theMpPackage = (MpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theMpPackage.loadPackage();

		// Fix loaded packages
		theMpPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MpPackage.eNS_URI, theMpPackage);
		return theMpPackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(0);
		}
		return documentRootEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDocumentRoot_Models() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getActionType() {
		if (actionTypeEClass == null) {
			actionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(1);
		}
		return actionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Description() {
        return (EReference)getActionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_ApplicationTag() {
        return (EReference)getActionType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_DomainExtension() {
        return (EReference)getActionType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_ReturnType() {
        return (EReference)getActionType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Parameter() {
        return (EReference)getActionType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_RaisesException() {
        return (EReference)getActionType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_LockBeforeExecute() {
        return (EReference)getActionType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_ValidationRules() {
        return (EReference)getActionType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_TransactionRequired() {
        return (EReference)getActionType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_TransactionConstraints() {
        return (EReference)getActionType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Deprecated() {
        return (EReference)getActionType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Obsolete() {
        return (EReference)getActionType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Preliminary() {
        return (EReference)getActionType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_StatusInformation() {
        return (EReference)getActionType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Visibility() {
        return (EReference)getActionType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Filter() {
        return (EReference)getActionType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Dependencies() {
        return (EReference)getActionType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_DependenciesScript() {
        return (EReference)getActionType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Feature() {
        return (EReference)getActionType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Specification() {
        return (EReference)getActionType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_InterfaceOnly() {
        return (EReference)getActionType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_DecisionPoint() {
        return (EReference)getActionType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Disturbances() {
        return (EReference)getActionType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_TakesEffect() {
        return (EReference)getActionType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_SideEffects() {
        return (EReference)getActionType().getEStructuralFeatures().get(24);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Precondition() {
        return (EReference)getActionType().getEStructuralFeatures().get(25);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getActionType_Name() {
        return (EAttribute)getActionType().getEStructuralFeatures().get(26);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAlphabetType() {
		if (alphabetTypeEClass == null) {
			alphabetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(2);
		}
		return alphabetTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAlphabetType_Mixed() {
        return (EAttribute)getAlphabetType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getApplicationTagType() {
		if (applicationTagTypeEClass == null) {
			applicationTagTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(3);
		}
		return applicationTagTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getApplicationTagType_Mixed() {
        return (EAttribute)getApplicationTagType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAssociationEndType() {
		if (associationEndTypeEClass == null) {
			associationEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(4);
		}
		return associationEndTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAssociationEndType_Description() {
        return (EReference)getAssociationEndType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAssociationEndType_ApplicationTag() {
        return (EReference)getAssociationEndType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAssociationEndType_DomainExtension() {
        return (EReference)getAssociationEndType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAssociationEndType_HasClass() {
        return (EReference)getAssociationEndType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAssociationEndType_Cardinality() {
        return (EReference)getAssociationEndType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAssociationEndType_DeletionPolicy() {
        return (EReference)getAssociationEndType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAssociationEndType_IsReserving() {
        return (EReference)getAssociationEndType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAssociationEndType_Name() {
        return (EAttribute)getAssociationEndType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAttributeType() {
		if (attributeTypeEClass == null) {
			attributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(5);
		}
		return attributeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Description() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_ApplicationTag() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_DomainExtension() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_TransactionRequired() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_TransactionConstraints() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Local() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Mandatory() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_IsNillable() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_NoNotification() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_NonPersistent() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_ReadOnly() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Restricted() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Static() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Undefined() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_LockBeforeModify() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_ValidationRules() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_RestartType() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Indexed() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Key() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_DataType() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Deprecated() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Obsolete() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Preliminary() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_StatusInformation() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Visibility() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(24);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Filter() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(25);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Dependencies() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(26);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_DependenciesScript() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(27);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Feature() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(28);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Specification() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(29);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_InterfaceOnly() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(30);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_DecisionPoint() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(31);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Disturbances() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(32);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_TakesEffect() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(33);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_SideEffects() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(34);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Precondition() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(35);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Condition() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(36);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_CounterType() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(37);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_SamplingRate() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(38);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Scanner() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(39);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_CounterReset() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(40);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_CounterContext() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(41);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_GetValue() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(42);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAttributeType_Name() {
        return (EAttribute)getAttributeType().getEStructuralFeatures().get(43);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBaseTypeType() {
		if (baseTypeTypeEClass == null) {
			baseTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(6);
		}
		return baseTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Boolean() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Octet() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Char() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Double() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Float() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Long() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Longlong() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Short() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_String() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Wstring() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Int8() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Int16() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Int32() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Int64() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Uint8() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Uint16() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Uint32() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Uint64() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_EnumRef() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_MoRef() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_StructRef() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_DerivedDataTypeRef() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Sequence() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBaseTypeType_Integer() {
        return (EReference)getBaseTypeType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBiDirectionalAssociationType() {
		if (biDirectionalAssociationTypeEClass == null) {
			biDirectionalAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(7);
		}
		return biDirectionalAssociationTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBiDirectionalAssociationType_Mandatory() {
        return (EReference)getBiDirectionalAssociationType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBiDirectionalAssociationType_AssociationEnd() {
        return (EReference)getBiDirectionalAssociationType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBooleanType() {
		if (booleanTypeEClass == null) {
			booleanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(8);
		}
		return booleanTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBooleanType_DefaultValue() {
        return (EReference)getBooleanType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCardinalityType() {
		if (cardinalityTypeEClass == null) {
			cardinalityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(9);
		}
		return cardinalityTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCardinalityType_Min() {
        return (EReference)getCardinalityType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCardinalityType_Max() {
        return (EReference)getCardinalityType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCardinalityType_Min1() {
        return (EReference)getCardinalityType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCardinalityType_Max1() {
        return (EReference)getCardinalityType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCharType() {
		if (charTypeEClass == null) {
			charTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(10);
		}
		return charTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCharType_Range() {
        return (EReference)getCharType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCharType_DefaultValue() {
        return (EReference)getCharType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getChildType() {
		if (childTypeEClass == null) {
			childTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(11);
		}
		return childTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getChildType_Description() {
        return (EReference)getChildType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getChildType_ApplicationTag() {
        return (EReference)getChildType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getChildType_HasClass() {
        return (EReference)getChildType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getChildType_Cardinality() {
        return (EReference)getChildType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getComplexSeqValueType() {
		if (complexSeqValueTypeEClass == null) {
			complexSeqValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(12);
		}
		return complexSeqValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getComplexSeqValueType_ComplexValue() {
        return (EReference)getComplexSeqValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getComplexValueType() {
		if (complexValueTypeEClass == null) {
			complexValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(13);
		}
		return complexValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getComplexValueType_Slot() {
        return (EReference)getComplexValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getClassType() {
		if (classTypeEClass == null) {
			classTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(14);
		}
		return classTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Description() {
        return (EReference)getClassType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_ApplicationTag() {
        return (EReference)getClassType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_DomainExtension() {
        return (EReference)getClassType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_SystemCreated() {
        return (EReference)getClassType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_NotificationTypes() {
        return (EReference)getClassType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_NonPersistent() {
        return (EReference)getClassType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Precondition() {
        return (EReference)getClassType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_ReadOnly() {
        return (EReference)getClassType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_LockBeforeDelete() {
        return (EReference)getClassType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_ValidationRules() {
        return (EReference)getClassType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Root() {
        return (EReference)getClassType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassType_YangRoot() {
        return (EReference)getClassType().getEStructuralFeatures().get(11);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Deprecated() {
        return (EReference)getClassType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Obsolete() {
        return (EReference)getClassType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Preliminary() {
        return (EReference)getClassType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_StatusInformation() {
        return (EReference)getClassType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Visibility() {
        return (EReference)getClassType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Filter() {
        return (EReference)getClassType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Dependencies() {
        return (EReference)getClassType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_DependenciesScript() {
        return (EReference)getClassType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Feature() {
        return (EReference)getClassType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Specification() {
        return (EReference)getClassType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_InterfaceOnly() {
        return (EReference)getClassType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_DecisionPoint() {
        return (EReference)getClassType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_TransactionRequired() {
        return (EReference)getClassType().getEStructuralFeatures().get(24);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_TransactionConstraints() {
        return (EReference)getClassType().getEStructuralFeatures().get(25);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Action() {
        return (EReference)getClassType().getEStructuralFeatures().get(26);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Attribute() {
        return (EReference)getClassType().getEStructuralFeatures().get(27);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getClassType_Name() {
        return (EAttribute)getClassType().getEStructuralFeatures().get(28);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getConditionType() {
		if (conditionTypeEClass == null) {
			conditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(15);
		}
		return conditionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getConditionType_Mixed() {
        return (EAttribute)getConditionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getContainmentType() {
		if (containmentTypeEClass == null) {
			containmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(16);
		}
		return containmentTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getContainmentType_Parent() {
        return (EReference)getContainmentType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getContainmentType_Child() {
        return (EReference)getContainmentType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getContainmentType_DomainExtension() {
        return (EReference)getContainmentType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getContainmentType_NoNotification() {
        return (EReference)getContainmentType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getContainmentType_NotCreatable() {
        return (EReference)getContainmentType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getContainmentType_NotDeleteable() {
        return (EReference)getContainmentType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCopyrightType() {
		if (copyrightTypeEClass == null) {
			copyrightTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(17);
		}
		return copyrightTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCopyrightType_Company() {
        return (EReference)getCopyrightType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCopyrightType_Year() {
        return (EReference)getCopyrightType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCopyrightType_Disclaimer() {
        return (EReference)getCopyrightType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCounterContextType() {
		if (counterContextTypeEClass == null) {
			counterContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(18);
		}
		return counterContextTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCounterContextType_Mixed() {
        return (EAttribute)getCounterContextType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCounterResetType() {
		if (counterResetTypeEClass == null) {
			counterResetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(19);
		}
		return counterResetTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCounterResetType_Mixed() {
        return (EAttribute)getCounterResetType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCounterTypeType() {
		if (counterTypeTypeEClass == null) {
			counterTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(20);
		}
		return counterTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCounterTypeType_Mixed() {
        return (EAttribute)getCounterTypeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDataTypeType() {
		if (dataTypeTypeEClass == null) {
			dataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(21);
		}
		return dataTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Boolean() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Octet() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Char() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Double() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Float() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Long() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Longlong() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Short() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_String() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Wstring() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Int8() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Int16() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Int32() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Int64() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Uint8() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Uint16() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Uint32() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Uint64() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_EnumRef() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_MoRef() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_StructRef() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_DerivedDataTypeRef() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Sequence() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Integer() {
        return (EReference)getDataTypeType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDateType() {
		if (dateTypeEClass == null) {
			dateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(22);
		}
		return dateTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDefaultValueType() {
		if (defaultValueTypeEClass == null) {
			defaultValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(23);
		}
		return defaultValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDefaultValueType_Mixed() {
        return (EAttribute)getDefaultValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDeletionPolicyType() {
		if (deletionPolicyTypeEClass == null) {
			deletionPolicyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(24);
		}
		return deletionPolicyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDeletionPolicyType_None() {
        return (EReference)getDeletionPolicyType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDeletionPolicyType_Restricted() {
        return (EReference)getDeletionPolicyType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIsReservingType() {
		if (isReservingTypeEClass == null) {
			isReservingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(25);
		}
		return isReservingTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDependenciesScriptType() {
		if (dependenciesScriptTypeEClass == null) {
			dependenciesScriptTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(26);
		}
		return dependenciesScriptTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDependenciesScriptType_Mixed() {
        return (EAttribute)getDependenciesScriptType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDependenciesType() {
		if (dependenciesTypeEClass == null) {
			dependenciesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(27);
		}
		return dependenciesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDependenciesType_Mixed() {
        return (EAttribute)getDependenciesType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDerivedDataTypeRefType() {
		if (derivedDataTypeRefTypeEClass == null) {
			derivedDataTypeRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(28);
		}
		return derivedDataTypeRefTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeRefType_DefaultValue() {
        return (EReference)getDerivedDataTypeRefType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeRefType_MimName() {
        return (EReference)getDerivedDataTypeRefType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeRefType_MimVersion() {
        return (EReference)getDerivedDataTypeRefType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDerivedDataTypeRefType_Name() {
        return (EAttribute)getDerivedDataTypeRefType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDerivedDataTypeType() {
		if (derivedDataTypeTypeEClass == null) {
			derivedDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(29);
		}
		return derivedDataTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeType_Description() {
        return (EReference)getDerivedDataTypeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeType_ApplicationTag() {
        return (EReference)getDerivedDataTypeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeType_DomainExtension() {
        return (EReference)getDerivedDataTypeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeType_BaseType() {
        return (EReference)getDerivedDataTypeType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDerivedDataTypeType_ValidationRules() {
        return (EReference)getDerivedDataTypeType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDerivedDataTypeType_Name() {
        return (EAttribute)getDerivedDataTypeType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDescriptionType() {
		if (descriptionTypeEClass == null) {
			descriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(30);
		}
		return descriptionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDescriptionType_Mixed() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDisturbancesType() {
		if (disturbancesTypeEClass == null) {
			disturbancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(31);
		}
		return disturbancesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDisturbancesType_Mixed() {
        return (EAttribute)getDisturbancesType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDoubleType() {
		if (doubleTypeEClass == null) {
			doubleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(32);
		}
		return doubleTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDoubleType_Range() {
        return (EReference)getDoubleType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDoubleType_Ranges() {
        return (EReference)getDoubleType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDoubleType_DefaultValue() {
        return (EReference)getDoubleType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDoubleType_Unit() {
        return (EReference)getDoubleType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDoubleType_MultiplicationFactor() {
        return (EReference)getDoubleType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDoubleType_Resolution() {
        return (EReference)getDoubleType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDoubleType_UndefinedValue() {
        return (EReference)getDoubleType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getEnumMemberType() {
		if (enumMemberTypeEClass == null) {
			enumMemberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(33);
		}
		return enumMemberTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Description() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_ApplicationTag() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_DomainExtension() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Value() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Deprecated() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Obsolete() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Preliminary() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_StatusInformation() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Visibility() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Filter() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Dependencies() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_DependenciesScript() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Feature() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Specification() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_InterfaceOnly() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_DecisionPoint() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Disturbances() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_TakesEffect() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_SideEffects() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumMemberType_Precondition() {
        return (EReference)getEnumMemberType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getEnumMemberType_Name() {
        return (EAttribute)getEnumMemberType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getEnumRefType() {
		if (enumRefTypeEClass == null) {
			enumRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(34);
		}
		return enumRefTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumRefType_DefaultValue() {
        return (EReference)getEnumRefType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumRefType_MimName() {
        return (EReference)getEnumRefType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumRefType_MimVersion() {
        return (EReference)getEnumRefType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getEnumRefType_Name() {
        return (EAttribute)getEnumRefType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getEnumType() {
		if (enumTypeEClass == null) {
			enumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(35);
		}
		return enumTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumType_Description() {
        return (EReference)getEnumType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumType_ApplicationTag() {
        return (EReference)getEnumType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumType_DomainExtension() {
        return (EReference)getEnumType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEnumType_EnumMember() {
        return (EReference)getEnumType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getEnumType_Name() {
        return (EAttribute)getEnumType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getExceptionParameterType() {
		if (exceptionParameterTypeEClass == null) {
			exceptionParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(36);
		}
		return exceptionParameterTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionParameterType_Description() {
        return (EReference)getExceptionParameterType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionParameterType_ApplicationTag() {
        return (EReference)getExceptionParameterType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionParameterType_DataType() {
        return (EReference)getExceptionParameterType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExceptionParameterType_Name() {
        return (EAttribute)getExceptionParameterType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getExceptionType() {
		if (exceptionTypeEClass == null) {
			exceptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(37);
		}
		return exceptionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionType_Description() {
        return (EReference)getExceptionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionType_ApplicationTag() {
        return (EReference)getExceptionType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionType_DomainExtension() {
        return (EReference)getExceptionType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionType_ExceptionParameter() {
        return (EReference)getExceptionType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExceptionType_Deprecated() {
        return (EReference)getExceptionType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExceptionType_Name() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFeatureType() {
		if (featureTypeEClass == null) {
			featureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(38);
		}
		return featureTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFeatureType_Mixed() {
        return (EAttribute)getFeatureType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFloatType() {
		if (floatTypeEClass == null) {
			floatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(39);
		}
		return floatTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_Range() {
        return (EReference)getFloatType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_Ranges() {
        return (EReference)getFloatType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_DefaultValue() {
        return (EReference)getFloatType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_Unit() {
        return (EReference)getFloatType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_MultiplicationFactor() {
        return (EReference)getFloatType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_Resolution() {
        return (EReference)getFloatType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_UndefinedValue() {
        return (EReference)getFloatType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getGetValueType() {
		if (getValueTypeEClass == null) {
			getValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(40);
		}
		return getValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getGetValueType_Mixed() {
        return (EAttribute)getGetValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getHasClassType() {
		if (hasClassTypeEClass == null) {
			hasClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(41);
		}
		return hasClassTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getHasClassType_MimName() {
        return (EReference)getHasClassType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getHasClassType_MimVersion() {
        return (EReference)getHasClassType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getHasClassType_Name() {
        return (EAttribute)getHasClassType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInheritanceType() {
		if (inheritanceTypeEClass == null) {
			inheritanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(42);
		}
		return inheritanceTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInheritanceType_DomainExtension() {
        return (EReference)getInheritanceType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInheritanceType_Superclass() {
        return (EReference)getInheritanceType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInheritanceType_Subclass() {
        return (EReference)getInheritanceType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIndexedType() {
		if (indexedTypeEClass == null) {
			indexedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(43);
		}
		return indexedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInoutType() {
		if (inoutTypeEClass == null) {
			inoutTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(44);
		}
		return inoutTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInt16Type() {
		if (int16TypeEClass == null) {
			int16TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(45);
		}
		return int16TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt16Type_Range() {
        return (EReference)getInt16Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt16Type_Ranges() {
        return (EReference)getInt16Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt16Type_DefaultValue() {
        return (EReference)getInt16Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt16Type_Unit() {
        return (EReference)getInt16Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt16Type_MultiplicationFactor() {
        return (EReference)getInt16Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt16Type_Resolution() {
        return (EReference)getInt16Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt16Type_UndefinedValue() {
        return (EReference)getInt16Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInt32Type() {
		if (int32TypeEClass == null) {
			int32TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(46);
		}
		return int32TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt32Type_Range() {
        return (EReference)getInt32Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt32Type_Ranges() {
        return (EReference)getInt32Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt32Type_DefaultValue() {
        return (EReference)getInt32Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt32Type_Unit() {
        return (EReference)getInt32Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt32Type_MultiplicationFactor() {
        return (EReference)getInt32Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt32Type_Resolution() {
        return (EReference)getInt32Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt32Type_UndefinedValue() {
        return (EReference)getInt32Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInt64Type() {
		if (int64TypeEClass == null) {
			int64TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(47);
		}
		return int64TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt64Type_Range() {
        return (EReference)getInt64Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt64Type_Ranges() {
        return (EReference)getInt64Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt64Type_DefaultValue() {
        return (EReference)getInt64Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt64Type_Unit() {
        return (EReference)getInt64Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt64Type_MultiplicationFactor() {
        return (EReference)getInt64Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt64Type_Resolution() {
        return (EReference)getInt64Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt64Type_UndefinedValue() {
        return (EReference)getInt64Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInt8Type() {
		if (int8TypeEClass == null) {
			int8TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(48);
		}
		return int8TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt8Type_Range() {
        return (EReference)getInt8Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt8Type_Ranges() {
        return (EReference)getInt8Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt8Type_DefaultValue() {
        return (EReference)getInt8Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt8Type_Unit() {
        return (EReference)getInt8Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt8Type_MultiplicationFactor() {
        return (EReference)getInt8Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt8Type_Resolution() {
        return (EReference)getInt8Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInt8Type_UndefinedValue() {
        return (EReference)getInt8Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDecisionPointType() {
		if (decisionPointTypeEClass == null) {
			decisionPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(49);
		}
		return decisionPointTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDecisionPointType_DecisionStatement() {
        return (EReference)getDecisionPointType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getValidationRulesType() {
		if (validationRulesTypeEClass == null) {
			validationRulesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(50);
		}
		return validationRulesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getValidationRulesType_Rule() {
        return (EReference)getValidationRulesType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInterfaceOnlyType() {
		if (interfaceOnlyTypeEClass == null) {
			interfaceOnlyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(51);
		}
		return interfaceOnlyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInterMimType() {
		if (interMimTypeEClass == null) {
			interMimTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(52);
		}
		return interMimTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInterMimType_Description() {
        return (EReference)getInterMimType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInterMimType_ApplicationTag() {
        return (EReference)getInterMimType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInterMimType_DomainExtension() {
        return (EReference)getInterMimType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInterMimType_Relationship() {
        return (EReference)getInterMimType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInType() {
		if (inTypeEClass == null) {
			inTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(53);
		}
		return inTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIpV4AddressType() {
		if (ipV4AddressTypeEClass == null) {
			ipV4AddressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(54);
		}
		return ipV4AddressTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIpV6AddressType() {
		if (ipV6AddressTypeEClass == null) {
			ipV6AddressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(55);
		}
		return ipV6AddressTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIsExclusiveType() {
		if (isExclusiveTypeEClass == null) {
			isExclusiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(56);
		}
		return isExclusiveTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getKeyType() {
		if (keyTypeEClass == null) {
			keyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(57);
		}
		return keyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLengthRangeType() {
		if (lengthRangeTypeEClass == null) {
			lengthRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(58);
		}
		return lengthRangeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLengthRangeType_Max() {
        return (EReference)getLengthRangeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLengthRangeType_Group() {
        return (EAttribute)getLengthRangeType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLengthRangeType_Min() {
        return (EReference)getLengthRangeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLengthRangeType_Max1() {
        return (EReference)getLengthRangeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLengthRangeType_Min1() {
        return (EReference)getLengthRangeType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLocalType() {
		if (localTypeEClass == null) {
			localTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(59);
		}
		return localTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLockBeforeDeleteType() {
		if (lockBeforeDeleteTypeEClass == null) {
			lockBeforeDeleteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(60);
		}
		return lockBeforeDeleteTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLockBeforeDeleteType_Mixed() {
        return (EAttribute)getLockBeforeDeleteType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLockBeforeExecuteType() {
		if (lockBeforeExecuteTypeEClass == null) {
			lockBeforeExecuteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(61);
		}
		return lockBeforeExecuteTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLockBeforeExecuteType_Mixed() {
        return (EAttribute)getLockBeforeExecuteType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLockBeforeModifyType() {
		if (lockBeforeModifyTypeEClass == null) {
			lockBeforeModifyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(62);
		}
		return lockBeforeModifyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLockBeforeModifyType_Mixed() {
        return (EAttribute)getLockBeforeModifyType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLonglongType() {
		if (longlongTypeEClass == null) {
			longlongTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(63);
		}
		return longlongTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLonglongType_Range() {
        return (EReference)getLonglongType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLonglongType_Ranges() {
        return (EReference)getLonglongType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLonglongType_DefaultValue() {
        return (EReference)getLonglongType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLonglongType_Unit() {
        return (EReference)getLonglongType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLonglongType_MultiplicationFactor() {
        return (EReference)getLonglongType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLonglongType_Resolution() {
        return (EReference)getLonglongType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLonglongType_UndefinedValue() {
        return (EReference)getLonglongType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getObjectType() {
		if (objectTypeEClass == null) {
			objectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(64);
		}
		return objectTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getObjectType_Description() {
        return (EReference)getObjectType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getObjectType_DomainExtension() {
        return (EReference)getObjectType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getObjectType_HasClass() {
        return (EReference)getObjectType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getObjectType_Slot() {
        return (EReference)getObjectType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getObjectType_ParentDn() {
        return (EAttribute)getObjectType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLongType() {
		if (longTypeEClass == null) {
			longTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(65);
		}
		return longTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLongType_Range() {
        return (EReference)getLongType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLongType_Ranges() {
        return (EReference)getLongType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLongType_DefaultValue() {
        return (EReference)getLongType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLongType_Unit() {
        return (EReference)getLongType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLongType_MultiplicationFactor() {
        return (EReference)getLongType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLongType_Resolution() {
        return (EReference)getLongType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLongType_UndefinedValue() {
        return (EReference)getLongType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMacAddressType() {
		if (macAddressTypeEClass == null) {
			macAddressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(66);
		}
		return macAddressTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMandatoryType() {
		if (mandatoryTypeEClass == null) {
			mandatoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(67);
		}
		return mandatoryTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMaxLengthType() {
		if (maxLengthTypeEClass == null) {
			maxLengthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(68);
		}
		return maxLengthTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMaxLengthType_Mixed() {
        return (EAttribute)getMaxLengthType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMaxType() {
		if (maxTypeEClass == null) {
			maxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(69);
		}
		return maxTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMaxType_Mixed() {
        return (EAttribute)getMaxType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMibType() {
		if (mibTypeEClass == null) {
			mibTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(70);
		}
		return mibTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMibType_Description() {
        return (EReference)getMibType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMibType_DomainExtension() {
        return (EReference)getMibType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMibType_Object() {
        return (EReference)getMibType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMibType_Name() {
        return (EAttribute)getMibType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMibType_Release() {
        return (EAttribute)getMibType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMibType_Version() {
        return (EAttribute)getMibType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMibType_Variant() {
        return (EAttribute)getMibType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMibType_Correction() {
        return (EAttribute)getMibType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMimNameType() {
		if (mimNameTypeEClass == null) {
			mimNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(71);
		}
		return mimNameTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimNameType_Mixed() {
        return (EAttribute)getMimNameType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMimType() {
		if (mimTypeEClass == null) {
			mimTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(72);
		}
		return mimTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Description() {
        return (EReference)getMimType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_ApplicationTag() {
        return (EReference)getMimType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_DomainExtension() {
        return (EReference)getMimType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Copyright() {
        return (EReference)getMimType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_MimParts() {
        return (EReference)getMimType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Struct() {
        return (EReference)getMimType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Enum() {
        return (EReference)getMimType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Exception() {
        return (EReference)getMimType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_DerivedDataType() {
        return (EReference)getMimType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Class() {
        return (EReference)getMimType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Relationship() {
        return (EReference)getMimType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Name() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Version() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Release() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Author() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Contact() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Date() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(24);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_DocNo() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(25);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Revision() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(26);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Namespace() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(27);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_NamespacePrefix() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(28);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Organization() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(29);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Variant() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(30);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Correction() {
        return (EAttribute)getMimType().getEStructuralFeatures().get(31);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_ModelFeatures() {
        return (EReference)getMimType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Deprecated() {
        return (EReference)getMimType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Obsolete() {
        return (EReference)getMimType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Preliminary() {
        return (EReference)getMimType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_StatusInformation() {
        return (EReference)getMimType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Filter() {
        return (EReference)getMimType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Specification() {
        return (EReference)getMimType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Implements() {
        return (EReference)getMimType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMimVersionType() {
		if (mimVersionTypeEClass == null) {
			mimVersionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(73);
		}
		return mimVersionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimVersionType_Mixed() {
        return (EAttribute)getMimVersionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMinLengthType() {
		if (minLengthTypeEClass == null) {
			minLengthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(74);
		}
		return minLengthTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMinLengthType_Mixed() {
        return (EAttribute)getMinLengthType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMinType() {
		if (minTypeEClass == null) {
			minTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(75);
		}
		return minTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMinType_Mixed() {
        return (EAttribute)getMinType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getModelsType() {
		if (modelsTypeEClass == null) {
			modelsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(76);
		}
		return modelsTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getModelsType_DtdVersion() {
        return (EReference)getModelsType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getModelsType_MomMetaData() {
        return (EReference)getModelsType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getModelsType_Mim() {
        return (EReference)getModelsType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getModelsType_InterMim() {
        return (EReference)getModelsType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getModelsType_Mib() {
        return (EReference)getModelsType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMoRefType() {
		if (moRefTypeEClass == null) {
			moRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(77);
		}
		return moRefTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMoRefType_MimName() {
        return (EReference)getMoRefType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMoRefType_MimVersion() {
        return (EReference)getMoRefType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMoRefType_Name() {
        return (EAttribute)getMoRefType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMoRestartType() {
		if (moRestartTypeEClass == null) {
			moRestartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(78);
		}
		return moRestartTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMultiplicationFactorType() {
		if (multiplicationFactorTypeEClass == null) {
			multiplicationFactorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(79);
		}
		return multiplicationFactorTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMultiplicationFactorType_Mixed() {
        return (EAttribute)getMultiplicationFactorType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNodeRestartType() {
		if (nodeRestartTypeEClass == null) {
			nodeRestartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(80);
		}
		return nodeRestartTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNoneType() {
		if (noneTypeEClass == null) {
			noneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(81);
		}
		return noneTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNoNotificationType() {
		if (noNotificationTypeEClass == null) {
			noNotificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(82);
		}
		return noNotificationTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNotCreatableType() {
		if (notCreatableTypeEClass == null) {
			notCreatableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(83);
		}
		return notCreatableTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNotDeleteableType() {
		if (notDeleteableTypeEClass == null) {
			notDeleteableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(84);
		}
		return notDeleteableTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNonPersistentType() {
		if (nonPersistentTypeEClass == null) {
			nonPersistentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(85);
		}
		return nonPersistentTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNonUniqueType() {
		if (nonUniqueTypeEClass == null) {
			nonUniqueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(86);
		}
		return nonUniqueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNoRestartType() {
		if (noRestartTypeEClass == null) {
			noRestartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(87);
		}
		return noRestartTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNotificationTypesType() {
		if (notificationTypesTypeEClass == null) {
			notificationTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(88);
		}
		return notificationTypesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getNotificationTypesType_Mixed() {
        return (EAttribute)getNotificationTypesType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOctetType() {
		if (octetTypeEClass == null) {
			octetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(89);
		}
		return octetTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOctetType_Range() {
        return (EReference)getOctetType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOctetType_Ranges() {
        return (EReference)getOctetType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOctetType_DefaultValue() {
        return (EReference)getOctetType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOctetType_Unit() {
        return (EReference)getOctetType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOctetType_MultiplicationFactor() {
        return (EReference)getOctetType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOctetType_Resolution() {
        return (EReference)getOctetType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOctetType_UndefinedValue() {
        return (EReference)getOctetType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOrderedType() {
		if (orderedTypeEClass == null) {
			orderedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(90);
		}
		return orderedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOutType() {
		if (outTypeEClass == null) {
			outTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(91);
		}
		return outTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getParameterType() {
		if (parameterTypeEClass == null) {
			parameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(92);
		}
		return parameterTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_Description() {
        return (EReference)getParameterType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_ApplicationTag() {
        return (EReference)getParameterType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_DomainExtension() {
        return (EReference)getParameterType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_ValidationRules() {
        return (EReference)getParameterType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_IsNillable() {
        return (EReference)getParameterType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_In() {
        return (EReference)getParameterType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_Out() {
        return (EReference)getParameterType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_Inout() {
        return (EReference)getParameterType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_DataType() {
        return (EReference)getParameterType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getParameterType_Name() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getParentType() {
		if (parentTypeEClass == null) {
			parentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(93);
		}
		return parentTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParentType_Description() {
        return (EReference)getParentType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParentType_ApplicationTag() {
        return (EReference)getParentType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParentType_HasClass() {
        return (EReference)getParentType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getPreconditionType() {
		if (preconditionTypeEClass == null) {
			preconditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(94);
		}
		return preconditionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getPreconditionType_Mixed() {
        return (EAttribute)getPreconditionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRaisesExceptionType() {
		if (raisesExceptionTypeEClass == null) {
			raisesExceptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(95);
		}
		return raisesExceptionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRaisesExceptionType_Name() {
        return (EAttribute)getRaisesExceptionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRangeType() {
		if (rangeTypeEClass == null) {
			rangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(96);
		}
		return rangeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRangeType_Max() {
        return (EReference)getRangeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRangeType_Group() {
        return (EAttribute)getRangeType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRangesType() {
		if (rangesTypeEClass == null) {
			rangesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(97);
		}
		return rangesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRangesType_Subrange() {
        return (EReference)getRangesType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStringLengthType() {
		if (stringLengthTypeEClass == null) {
			stringLengthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(98);
		}
		return stringLengthTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringLengthType_Subrange() {
        return (EReference)getStringLengthType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSubrangeType() {
		if (subrangeTypeEClass == null) {
			subrangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(99);
		}
		return subrangeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSubrangeType_Min() {
        return (EReference)getSubrangeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSubrangeType_Max() {
        return (EReference)getSubrangeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRangeType_Min() {
        return (EReference)getRangeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRangeType_Max1() {
        return (EReference)getRangeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRangeType_Min1() {
        return (EReference)getRangeType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRelationshipType() {
		if (relationshipTypeEClass == null) {
			relationshipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(100);
		}
		return relationshipTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Description() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_ApplicationTag() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_DomainExtension() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Deprecated() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Obsolete() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Preliminary() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_StatusInformation() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Visibility() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Filter() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Dependencies() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_DependenciesScript() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Feature() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Specification() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_InterfaceOnly() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_DecisionPoint() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_BiDirectionalAssociation() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_UniDirectionalAssociation() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Containment() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Inheritance() {
        return (EReference)getRelationshipType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRelationshipType_Name() {
        return (EAttribute)getRelationshipType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getResolutionType() {
		if (resolutionTypeEClass == null) {
			resolutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(101);
		}
		return resolutionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getResolutionType_Mixed() {
        return (EAttribute)getResolutionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRestartTypeType() {
		if (restartTypeTypeEClass == null) {
			restartTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(102);
		}
		return restartTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRestartTypeType_NoRestart() {
        return (EReference)getRestartTypeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRestartTypeType_MoRestart() {
        return (EReference)getRestartTypeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRestartTypeType_NodeRestart() {
        return (EReference)getRestartTypeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRestrictedType() {
		if (restrictedTypeEClass == null) {
			restrictedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(103);
		}
		return restrictedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getReturnTypeType() {
		if (returnTypeTypeEClass == null) {
			returnTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(104);
		}
		return returnTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Void() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Boolean() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Octet() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Char() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Double() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Float() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Long() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Longlong() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Short() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_String() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Wstring() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Int8() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Int16() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Int32() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Int64() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Uint8() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Uint16() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Uint32() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Uint64() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_EnumRef() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_MoRef() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_StructRef() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_DerivedDataTypeRef() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Sequence() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(24);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Integer() {
        return (EReference)getReturnTypeType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSamplingRateType() {
		if (samplingRateTypeEClass == null) {
			samplingRateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(105);
		}
		return samplingRateTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSamplingRateType_Mixed() {
        return (EAttribute)getSamplingRateType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getScannerType() {
		if (scannerTypeEClass == null) {
			scannerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(106);
		}
		return scannerTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getScannerType_Mixed() {
        return (EAttribute)getScannerType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSeqDefaultValueType() {
		if (seqDefaultValueTypeEClass == null) {
			seqDefaultValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(107);
		}
		return seqDefaultValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSeqDefaultValueType_DefaultValue() {
        return (EReference)getSeqDefaultValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSequenceType() {
		if (sequenceTypeEClass == null) {
			sequenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(108);
		}
		return sequenceTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Boolean() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Octet() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Char() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Double() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Float() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Long() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Longlong() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Short() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_String() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Wstring() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Int8() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Int16() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Int32() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Int64() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Uint8() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Uint16() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Uint32() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Uint64() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_EnumRef() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_MoRef() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_StructRef() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_DerivedDataTypeRef() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_MinLength() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_MaxLength() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(24);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_NonUnique() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(25);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Ordered() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(26);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_SeqDefaultValue() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(27);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Integer() {
        return (EReference)getSequenceType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSeqValueType() {
		if (seqValueTypeEClass == null) {
			seqValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(109);
		}
		return seqValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSeqValueType_Value() {
        return (EAttribute)getSeqValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getShortType() {
		if (shortTypeEClass == null) {
			shortTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(110);
		}
		return shortTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getShortType_Range() {
        return (EReference)getShortType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getShortType_Ranges() {
        return (EReference)getShortType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getShortType_DefaultValue() {
        return (EReference)getShortType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getShortType_Unit() {
        return (EReference)getShortType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getShortType_MultiplicationFactor() {
        return (EReference)getShortType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getShortType_Resolution() {
        return (EReference)getShortType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getShortType_UndefinedValue() {
        return (EReference)getShortType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSideEffectsType() {
		if (sideEffectsTypeEClass == null) {
			sideEffectsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(111);
		}
		return sideEffectsTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSideEffectsType_Mixed() {
        return (EAttribute)getSideEffectsType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStaticType() {
		if (staticTypeEClass == null) {
			staticTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(112);
		}
		return staticTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSlotType() {
		if (slotTypeEClass == null) {
			slotTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(113);
		}
		return slotTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSlotType_DomainExtension() {
        return (EReference)getSlotType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSlotType_Value() {
        return (EAttribute)getSlotType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSlotType_ComplexValue() {
        return (EReference)getSlotType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSlotType_SeqValue() {
        return (EReference)getSlotType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSlotType_ComplexSeqValue() {
        return (EReference)getSlotType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSlotType_Name() {
        return (EAttribute)getSlotType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStringType() {
		if (stringTypeEClass == null) {
			stringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(114);
		}
		return stringTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_LengthRange() {
        return (EReference)getStringType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_StringLength() {
        return (EReference)getStringType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_ValidValues() {
        return (EReference)getStringType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_Alphabet() {
        return (EReference)getStringType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_IpV4Address() {
        return (EReference)getStringType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_IpV6Address() {
        return (EReference)getStringType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_MacAddress() {
        return (EReference)getStringType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_Date() {
        return (EReference)getStringType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_Time() {
        return (EReference)getStringType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_DefaultValue() {
        return (EReference)getStringType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_IsPassphrase() {
        return (EReference)getStringType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_UndefinedValue() {
        return (EReference)getStringType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStructMemberType() {
		if (structMemberTypeEClass == null) {
			structMemberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(115);
		}
		return structMemberTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Description() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_ApplicationTag() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_DomainExtension() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Boolean() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Octet() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Char() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Double() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Float() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Long() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Longlong() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Short() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_String() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Wstring() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Int8() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Int16() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Int32() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Int64() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Uint8() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Uint16() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Uint32() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(20);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Uint64() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(21);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_EnumRef() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(22);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_MoRef() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(23);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Sequence() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(24);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_DerivedDataTypeRef() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(25);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Deprecated() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(26);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Obsolete() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(27);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Preliminary() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(28);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_StatusInformation() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(29);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Visibility() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(30);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Filter() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(31);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Dependencies() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(32);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_DependenciesScript() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(33);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Feature() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(34);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Specification() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(35);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_InterfaceOnly() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(36);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_DecisionPoint() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(37);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Disturbances() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(38);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_TakesEffect() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(39);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_SideEffects() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(40);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Precondition() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(41);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getStructMemberType_Name() {
        return (EAttribute)getStructMemberType().getEStructuralFeatures().get(42);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructMemberType_Integer() {
        return (EReference)getStructMemberType().getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStructRefType() {
		if (structRefTypeEClass == null) {
			structRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(116);
		}
		return structRefTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructRefType_MimName() {
        return (EReference)getStructRefType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructRefType_MimVersion() {
        return (EReference)getStructRefType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getStructRefType_Name() {
        return (EAttribute)getStructRefType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStructType() {
		if (structTypeEClass == null) {
			structTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(117);
		}
		return structTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_Description() {
        return (EReference)getStructType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_ApplicationTag() {
        return (EReference)getStructType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_DomainExtension() {
        return (EReference)getStructType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_IsExclusive() {
        return (EReference)getStructType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_StructMember() {
        return (EReference)getStructType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getStructType_Name() {
        return (EAttribute)getStructType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSubclassType() {
		if (subclassTypeEClass == null) {
			subclassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(118);
		}
		return subclassTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSubclassType_Description() {
        return (EReference)getSubclassType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSubclassType_ApplicationTag() {
        return (EAttribute)getSubclassType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSubclassType_HasClass() {
        return (EReference)getSubclassType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSuperclassType() {
		if (superclassTypeEClass == null) {
			superclassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(119);
		}
		return superclassTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSuperclassType_Description() {
        return (EReference)getSuperclassType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSuperclassType_ApplicationTag() {
        return (EAttribute)getSuperclassType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSuperclassType_HasClass() {
        return (EReference)getSuperclassType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSystemCreatedType() {
		if (systemCreatedTypeEClass == null) {
			systemCreatedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(120);
		}
		return systemCreatedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTakesEffectType() {
		if (takesEffectTypeEClass == null) {
			takesEffectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(121);
		}
		return takesEffectTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getTakesEffectType_Mixed() {
        return (EAttribute)getTakesEffectType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTimeType() {
		if (timeTypeEClass == null) {
			timeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(122);
		}
		return timeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTransactionRequiredType() {
		if (transactionRequiredTypeEClass == null) {
			transactionRequiredTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(123);
		}
		return transactionRequiredTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getTransactionRequiredType_Mixed() {
        return (EAttribute)getTransactionRequiredType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUint16Type() {
		if (uint16TypeEClass == null) {
			uint16TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(124);
		}
		return uint16TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint16Type_Range() {
        return (EReference)getUint16Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint16Type_Ranges() {
        return (EReference)getUint16Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint16Type_DefaultValue() {
        return (EReference)getUint16Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint16Type_Unit() {
        return (EReference)getUint16Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint16Type_MultiplicationFactor() {
        return (EReference)getUint16Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint16Type_Resolution() {
        return (EReference)getUint16Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint16Type_UndefinedValue() {
        return (EReference)getUint16Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUint32Type() {
		if (uint32TypeEClass == null) {
			uint32TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(125);
		}
		return uint32TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint32Type_Range() {
        return (EReference)getUint32Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint32Type_Ranges() {
        return (EReference)getUint32Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint32Type_DefaultValue() {
        return (EReference)getUint32Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint32Type_Unit() {
        return (EReference)getUint32Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint32Type_MultiplicationFactor() {
        return (EReference)getUint32Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint32Type_Resolution() {
        return (EReference)getUint32Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint32Type_UndefinedValue() {
        return (EReference)getUint32Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUint64Type() {
		if (uint64TypeEClass == null) {
			uint64TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(126);
		}
		return uint64TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint64Type_Range() {
        return (EReference)getUint64Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint64Type_Ranges() {
        return (EReference)getUint64Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint64Type_DefaultValue() {
        return (EReference)getUint64Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint64Type_Unit() {
        return (EReference)getUint64Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint64Type_MultiplicationFactor() {
        return (EReference)getUint64Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint64Type_Resolution() {
        return (EReference)getUint64Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint64Type_UndefinedValue() {
        return (EReference)getUint64Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUint8Type() {
		if (uint8TypeEClass == null) {
			uint8TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(127);
		}
		return uint8TypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint8Type_Range() {
        return (EReference)getUint8Type().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint8Type_Ranges() {
        return (EReference)getUint8Type().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint8Type_DefaultValue() {
        return (EReference)getUint8Type().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint8Type_Unit() {
        return (EReference)getUint8Type().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint8Type_MultiplicationFactor() {
        return (EReference)getUint8Type().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint8Type_Resolution() {
        return (EReference)getUint8Type().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUint8Type_UndefinedValue() {
        return (EReference)getUint8Type().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUndefinedType() {
		if (undefinedTypeEClass == null) {
			undefinedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(128);
		}
		return undefinedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUndefinedValueType() {
		if (undefinedValueTypeEClass == null) {
			undefinedValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(129);
		}
		return undefinedValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getUndefinedValueType_Mixed() {
        return (EAttribute)getUndefinedValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUniDirectionalAssociationType() {
		if (uniDirectionalAssociationTypeEClass == null) {
			uniDirectionalAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(130);
		}
		return uniDirectionalAssociationTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUniDirectionalAssociationType_Mandatory() {
        return (EReference)getUniDirectionalAssociationType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUniDirectionalAssociationType_HasClass() {
        return (EReference)getUniDirectionalAssociationType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getUniDirectionalAssociationType_AssociationEnd() {
        return (EReference)getUniDirectionalAssociationType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUnitType() {
		if (unitTypeEClass == null) {
			unitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(131);
		}
		return unitTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getUnitType_Mixed() {
        return (EAttribute)getUnitType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getValidValuesType() {
		if (validValuesTypeEClass == null) {
			validValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(132);
		}
		return validValuesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getValidValuesType_Mixed() {
        return (EAttribute)getValidValuesType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(133);
		}
		return valueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getValueType_Mixed() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getVisibilityType() {
		if (visibilityTypeEClass == null) {
			visibilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(134);
		}
		return visibilityTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getVisibilityType_Mixed() {
        return (EAttribute)getVisibilityType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getVoidType() {
		if (voidTypeEClass == null) {
			voidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(135);
		}
		return voidTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getWstringType() {
		if (wstringTypeEClass == null) {
			wstringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(136);
		}
		return wstringTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_LengthRange() {
        return (EReference)getWstringType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_StringLength() {
        return (EReference)getWstringType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_ValidValues() {
        return (EReference)getWstringType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_Alphabet() {
        return (EReference)getWstringType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_IpV4Address() {
        return (EReference)getWstringType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_IpV6Address() {
        return (EReference)getWstringType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_MacAddress() {
        return (EReference)getWstringType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_Date() {
        return (EReference)getWstringType().getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_Time() {
        return (EReference)getWstringType().getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getWstringType_DefaultValue() {
        return (EReference)getWstringType().getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getReadOnlyType() {
		if (readOnlyTypeEClass == null) {
			readOnlyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(137);
		}
		return readOnlyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDeprecatedType() {
		if (deprecatedTypeEClass == null) {
			deprecatedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(138);
		}
		return deprecatedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDeprecatedType_Mixed() {
        return (EAttribute)getDeprecatedType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getObsoleteType() {
		if (obsoleteTypeEClass == null) {
			obsoleteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(139);
		}
		return obsoleteTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getObsoleteType_Mixed() {
        return (EAttribute)getObsoleteType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFilterType() {
		if (filterTypeEClass == null) {
			filterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(140);
		}
		return filterTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFilterType_Mixed() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSpecificationType() {
		if (specificationTypeEClass == null) {
			specificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(141);
		}
		return specificationTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSpecificationType_Mixed() {
        return (EAttribute)getSpecificationType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStatusInformationType() {
		if (statusInformationTypeEClass == null) {
			statusInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(142);
		}
		return statusInformationTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getStatusInformationType_Mixed() {
        return (EAttribute)getStatusInformationType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRootType() {
		if (rootTypeEClass == null) {
			rootTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(143);
		}
		return rootTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYangRootType() {
		if (yangRootTypeEClass == null) {
			yangRootTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(144);
		}
		return yangRootTypeEClass;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getExtensionType() {
		if (extensionTypeEClass == null) {
			extensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(145);
		}
		return extensionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExtensionType_Name() {
        return (EAttribute)getExtensionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExtensionType_Value() {
        return (EAttribute)getExtensionType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDomainExtensionType() {
		if (domainExtensionTypeEClass == null) {
			domainExtensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(146);
		}
		return domainExtensionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDomainExtensionType_Domain() {
        return (EAttribute)getDomainExtensionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDomainExtensionType_Extension() {
        return (EReference)getDomainExtensionType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTransactionConstraintsType() {
		if (transactionConstraintsTypeEClass == null) {
			transactionConstraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(147);
		}
		return transactionConstraintsTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getTransactionConstraintsType_Mixed() {
        return (EAttribute)getTransactionConstraintsType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getApprovedByType() {
		if (approvedByTypeEClass == null) {
			approvedByTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(148);
		}
		return approvedByTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getApprovedByType_Signature() {
        return (EReference)getApprovedByType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getApprovedByType_Name() {
        return (EReference)getApprovedByType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSignatureType() {
		if (signatureTypeEClass == null) {
			signatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(149);
		}
		return signatureTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSignatureType_Mixed() {
        return (EAttribute)getSignatureType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNameType() {
		if (nameTypeEClass == null) {
			nameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(150);
		}
		return nameTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getNameType_Mixed() {
        return (EAttribute)getNameType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCompanyType() {
		if (companyTypeEClass == null) {
			companyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(151);
		}
		return companyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCompanyType_Mixed() {
        return (EAttribute)getCompanyType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getYearType() {
		if (yearTypeEClass == null) {
			yearTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(152);
		}
		return yearTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getYearType_Mixed() {
        return (EAttribute)getYearType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDisclaimerType() {
		if (disclaimerTypeEClass == null) {
			disclaimerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(153);
		}
		return disclaimerTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDisclaimerType_Mixed() {
        return (EAttribute)getDisclaimerType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCreatedByType() {
		if (createdByTypeEClass == null) {
			createdByTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(154);
		}
		return createdByTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCreatedByType_Signature() {
        return (EReference)getCreatedByType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCreatedByType_Name() {
        return (EReference)getCreatedByType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDocDateType() {
		if (docDateTypeEClass == null) {
			docDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(155);
		}
		return docDateTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDocDateType_Mixed() {
        return (EAttribute)getDocDateType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDocLangType() {
		if (docLangTypeEClass == null) {
			docLangTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(156);
		}
		return docLangTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDocLangType_Mixed() {
        return (EAttribute)getDocLangType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDocNumType() {
		if (docNumTypeEClass == null) {
			docNumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(157);
		}
		return docNumTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDocNumType_Mixed() {
        return (EAttribute)getDocNumType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDocRevType() {
		if (docRevTypeEClass == null) {
			docRevTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(158);
		}
		return docRevTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDocRevType_Mixed() {
        return (EAttribute)getDocRevType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDtdVersionType() {
		if (dtdVersionTypeEClass == null) {
			dtdVersionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(159);
		}
		return dtdVersionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDtdVersionType_Mixed() {
        return (EAttribute)getDtdVersionType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLabelType() {
		if (labelTypeEClass == null) {
			labelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(160);
		}
		return labelTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLabelType_Mixed() {
        return (EAttribute)getLabelType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMimPartType() {
		if (mimPartTypeEClass == null) {
			mimPartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(161);
		}
		return mimPartTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimPartType_Name() {
        return (EReference)getMimPartType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimPartType_Label() {
        return (EReference)getMimPartType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMimPartsType() {
		if (mimPartsTypeEClass == null) {
			mimPartsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(162);
		}
		return mimPartsTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimPartsType_MimPart() {
        return (EReference)getMimPartsType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMomMetaDataType() {
		if (momMetaDataTypeEClass == null) {
			momMetaDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(163);
		}
		return momMetaDataTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomMetaDataType_MomTitle() {
        return (EReference)getMomMetaDataType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomMetaDataType_MomSubTitle() {
        return (EReference)getMomMetaDataType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomMetaDataType_MomIdentity() {
        return (EReference)getMomMetaDataType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomMetaDataType_CreatedBy() {
        return (EReference)getMomMetaDataType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomMetaDataType_ApprovedBy() {
        return (EReference)getMomMetaDataType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMomSubTitleType() {
		if (momSubTitleTypeEClass == null) {
			momSubTitleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(164);
		}
		return momSubTitleTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMomSubTitleType_Mixed() {
        return (EAttribute)getMomSubTitleType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMomTitleType() {
		if (momTitleTypeEClass == null) {
			momTitleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(165);
		}
		return momTitleTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMomTitleType_Mixed() {
        return (EAttribute)getMomTitleType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMomIdentityType() {
		if (momIdentityTypeEClass == null) {
			momIdentityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(166);
		}
		return momIdentityTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomIdentityType_DocNum() {
        return (EReference)getMomIdentityType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomIdentityType_DocLang() {
        return (EReference)getMomIdentityType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomIdentityType_DocRev() {
        return (EReference)getMomIdentityType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMomIdentityType_DocDate() {
        return (EReference)getMomIdentityType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getPreliminaryType() {
		if (preliminaryTypeEClass == null) {
			preliminaryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(167);
		}
		return preliminaryTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getPreliminaryType_Mixed() {
        return (EAttribute)getPreliminaryType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(168);
		}
		return dataTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getImplementsType() {
		if (implementsTypeEClass == null) {
			implementsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(169);
		}
		return implementsTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getImplementsType_Version() {
        return (EAttribute)getImplementsType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getImplementsType_Release() {
        return (EAttribute)getImplementsType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getImplementsType_Correction() {
        return (EAttribute)getImplementsType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getImplementsType_Name() {
        return (EAttribute)getImplementsType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getImplementsType_Variant() {
        return (EAttribute)getImplementsType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIsNillableType() {
		if (isNillableTypeEClass == null) {
			isNillableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(170);
		}
		return isNillableTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIsPassphraseType() {
		if (isPassphraseTypeEClass == null) {
			isPassphraseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(171);
		}
		return isPassphraseTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDecisionStatementType() {
		if (decisionStatementTypeEClass == null) {
			decisionStatementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(172);
		}
		return decisionStatementTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDecisionStatementType_Mixed() {
        return (EAttribute)getDecisionStatementType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDecisionStatementType_DecisionType() {
        return (EAttribute)getDecisionStatementType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRuleType() {
		if (ruleTypeEClass == null) {
			ruleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(173);
		}
		return ruleTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRuleType_Mixed() {
        return (EAttribute)getRuleType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRuleType_Name() {
        return (EAttribute)getRuleType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRuleType_Format() {
        return (EAttribute)getRuleType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRuleType_Operation() {
        return (EAttribute)getRuleType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRuleType_ExceptionText() {
        return (EAttribute)getRuleType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getModelFeaturesType() {
		if (modelFeaturesTypeEClass == null) {
			modelFeaturesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(174);
		}
		return modelFeaturesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getModelFeaturesType_ModelFeature() {
        return (EReference)getModelFeaturesType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getModelFeaturesType_ModelType() {
        return (EAttribute)getModelFeaturesType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getModelFeatureType() {
		if (modelFeatureTypeEClass == null) {
			modelFeatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(175);
		}
		return modelFeatureTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getModelFeatureType_Name() {
        return (EAttribute)getModelFeatureType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getModelFeatureType_FeatureType() {
        return (EAttribute)getModelFeatureType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIntegerType() {
		if (integerTypeEClass == null) {
			integerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MpPackage.eNS_URI).getEClassifiers().get(176);
		}
		return integerTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_Range() {
        return (EReference)getIntegerType().getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_Ranges() {
        return (EReference)getIntegerType().getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_DefaultValue() {
        return (EReference)getIntegerType().getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_Unit() {
        return (EReference)getIntegerType().getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_MultiplicationFactor() {
        return (EReference)getIntegerType().getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_Resolution() {
        return (EReference)getIntegerType().getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_UndefinedValue() {
        return (EReference)getIntegerType().getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MpFactory getMpFactory() {
		return (MpFactory)getEFactoryInstance();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isLoaded = false;

    /**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isFixed = false;

    /**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

    /**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("Mp." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //MpPackageImpl
