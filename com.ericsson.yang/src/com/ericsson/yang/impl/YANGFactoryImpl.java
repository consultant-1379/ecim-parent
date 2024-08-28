/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import com.ericsson.yang.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ericsson.yang.AnyXml;
import com.ericsson.yang.Augment;
import com.ericsson.yang.BelongsTo;
import com.ericsson.yang.BooleanValue;
import com.ericsson.yang.Case;
import com.ericsson.yang.Choice;
import com.ericsson.yang.DataType;
import com.ericsson.yang.Deviation;
import com.ericsson.yang.EnumLiteral;
import com.ericsson.yang.Enumeration;
import com.ericsson.yang.Extension;
import com.ericsson.yang.Feature;
import com.ericsson.yang.Grouping;
import com.ericsson.yang.Identity;
import com.ericsson.yang.IfFeature;
import com.ericsson.yang.Import;
import com.ericsson.yang.IntValue;
import com.ericsson.yang.Leaf;
import com.ericsson.yang.LeafList;
import com.ericsson.yang.List;
import com.ericsson.yang.Module;
import com.ericsson.yang.Must;
import com.ericsson.yang.Notification;
import com.ericsson.yang.Prefix;
import com.ericsson.yang.Property;
import com.ericsson.yang.Revision;
import com.ericsson.yang.Rpc;
import com.ericsson.yang.RpcParameter;
import com.ericsson.yang.StatusKind;
import com.ericsson.yang.StringValue;
import com.ericsson.yang.SubModule;
import com.ericsson.yang.TypeDefinition;
import com.ericsson.yang.UnionType;
import com.ericsson.yang.When;
import com.ericsson.yang.YANGFactory;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YANGFactoryImpl extends EFactoryImpl implements YANGFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static YANGFactory init() {
		try {
			YANGFactory theYANGFactory = (YANGFactory)EPackage.Registry.INSTANCE.getEFactory(YANGPackage.eNS_URI);
			if (theYANGFactory != null) {
				return theYANGFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YANGFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public YANGFactoryImpl() {
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
			case YANGPackage.MODULE: return createModule();
			case YANGPackage.SUB_MODULE: return createSubModule();
			case YANGPackage.IMPORT: return createImport();
			case YANGPackage.BELONGS_TO: return createBelongsTo();
			case YANGPackage.PREFIX: return createPrefix();
			case YANGPackage.REVISION: return createRevision();
			case YANGPackage.EXTENSION: return createExtension();
			case YANGPackage.TYPE_DEFINITION: return createTypeDefinition();
			case YANGPackage.FEATURE: return createFeature();
			case YANGPackage.IDENTITY: return createIdentity();
			case YANGPackage.DEVIATION: return createDeviation();
			case YANGPackage.RPC: return createRpc();
			case YANGPackage.RPC_PARAMETER: return createRpcParameter();
			case YANGPackage.IF_FEATURE: return createIfFeature();
			case YANGPackage.DATA_TYPE: return createDataType();
			case YANGPackage.UNION_TYPE: return createUnionType();
			case YANGPackage.PROPERTY: return createProperty();
			case YANGPackage.ENUMERATION: return createEnumeration();
			case YANGPackage.ENUM_LITERAL: return createEnumLiteral();
			case YANGPackage.GROUPING: return createGrouping();
			case YANGPackage.CONTAINER: return createContainer();
			case YANGPackage.AUGMENT: return createAugment();
			case YANGPackage.NOTIFICATION: return createNotification();
			case YANGPackage.LEAF: return createLeaf();
			case YANGPackage.LEAF_LIST: return createLeafList();
			case YANGPackage.WHEN: return createWhen();
			case YANGPackage.MUST: return createMust();
			case YANGPackage.ANY_XML: return createAnyXml();
			case YANGPackage.CASE: return createCase();
			case YANGPackage.CHOICE: return createChoice();
			case YANGPackage.STRING_VALUE: return createStringValue();
			case YANGPackage.INT_VALUE: return createIntValue();
			case YANGPackage.BOOLEAN_VALUE: return createBooleanValue();
			case YANGPackage.IDENTITY_REF: return createIdentityRef();
			case YANGPackage.BASE: return createBase();
			case YANGPackage.LIST_WITH_STATUS: return createListWithStatus();
			case YANGPackage.ACTION: return createAction();
			case YANGPackage.USES: return createUses();
			case YANGPackage.REFINE: return createRefine();
			case YANGPackage.RANGE: return createRange();
			case YANGPackage.BIT: return createBit();
			case YANGPackage.INCLUDE: return createInclude();
			case YANGPackage.DEVIATE: return createDeviate();
			case YANGPackage.BITS: return createBits();
			case YANGPackage.LEAF_REF: return createLeafRef();
			case YANGPackage.BINARY: return createBinary();
			case YANGPackage.EMPTY: return createEmpty();
			case YANGPackage.INSTANCE_IDENTIFIER: return createInstanceIdentifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case YANGPackage.STATUS_KIND:
				return createStatusKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case YANGPackage.STATUS_KIND:
				return convertStatusKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SubModule createSubModule() {
		SubModuleImpl subModule = new SubModuleImpl();
		return subModule;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BelongsTo createBelongsTo() {
		BelongsToImpl belongsTo = new BelongsToImpl();
		return belongsTo;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Prefix createPrefix() {
		PrefixImpl prefix = new PrefixImpl();
		return prefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Identity createIdentity() {
		IdentityImpl identity = new IdentityImpl();
		return identity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Deviation createDeviation() {
		DeviationImpl deviation = new DeviationImpl();
		return deviation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Rpc createRpc() {
		RpcImpl rpc = new RpcImpl();
		return rpc;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RpcParameter createRpcParameter() {
		RpcParameterImpl rpcParameter = new RpcParameterImpl();
		return rpcParameter;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IfFeature createIfFeature() {
		IfFeatureImpl ifFeature = new IfFeatureImpl();
		return ifFeature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UnionType createUnionType() {
		UnionTypeImpl unionType = new UnionTypeImpl();
		return unionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Grouping createGrouping() {
		GroupingImpl grouping = new GroupingImpl();
		return grouping;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public com.ericsson.yang.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Augment createAugment() {
		AugmentImpl augment = new AugmentImpl();
		return augment;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Leaf createLeaf() {
		LeafImpl leaf = new LeafImpl();
		return leaf;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LeafList createLeafList() {
		LeafListImpl leafList = new LeafListImpl();
		return leafList;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Must createMust() {
		MustImpl must = new MustImpl();
		return must;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AnyXml createAnyXml() {
		AnyXmlImpl anyXml = new AnyXmlImpl();
		return anyXml;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IntValue createIntValue() {
		IntValueImpl intValue = new IntValueImpl();
		return intValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IdentityRef createIdentityRef() {
		IdentityRefImpl identityRef = new IdentityRefImpl();
		return identityRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Base createBase() {
		BaseImpl base = new BaseImpl();
		return base;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ListWithStatus createListWithStatus() {
		ListWithStatusImpl listWithStatus = new ListWithStatusImpl();
		return listWithStatus;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Uses createUses() {
		UsesImpl uses = new UsesImpl();
		return uses;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Refine createRefine() {
		RefineImpl refine = new RefineImpl();
		return refine;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Bit createBit() {
		BitImpl bit = new BitImpl();
		return bit;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Deviate createDeviate() {
		DeviateImpl deviate = new DeviateImpl();
		return deviate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Bits createBits() {
		BitsImpl bits = new BitsImpl();
		return bits;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LeafRef createLeafRef() {
		LeafRefImpl leafRef = new LeafRefImpl();
		return leafRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InstanceIdentifier createInstanceIdentifier() {
		InstanceIdentifierImpl instanceIdentifier = new InstanceIdentifierImpl();
		return instanceIdentifier;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatusKind createStatusKindFromString(EDataType eDataType, String initialValue) {
		StatusKind result = StatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public YANGPackage getYANGPackage() {
		return (YANGPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static YANGPackage getPackage() {
		return YANGPackage.eINSTANCE;
	}

} //YANGFactoryImpl
