/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Member Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.EnumMemberType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getValue <em>Value</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getDisturbances <em>Disturbances</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getSideEffects <em>Side Effects</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.EnumMemberType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getEnumMemberType()
 * @model extendedMetaData="name='enumMember_._type' kind='elementOnly'"
 * @generated
 */
public interface EnumMemberType extends EObject {
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
	 * @see Mp.MpPackage#getEnumMemberType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Tag</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Tag</em>' containment reference.
	 * @see #setApplicationTag(ApplicationTagType)
	 * @see Mp.MpPackage#getEnumMemberType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getApplicationTag <em>Application Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Tag</em>' containment reference.
	 * @see #getApplicationTag()
	 * @generated
	 */
    void setApplicationTag(ApplicationTagType value);

    /**
	 * Returns the value of the '<em><b>Domain Extension</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.DomainExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Extension</em>' containment reference list.
	 * @see Mp.MpPackage#getEnumMemberType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueType)
	 * @see Mp.MpPackage#getEnumMemberType_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
    ValueType getValue();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(ValueType value);

    /**
	 * Returns the value of the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deprecated</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' containment reference.
	 * @see #setDeprecated(DeprecatedType)
	 * @see Mp.MpPackage#getEnumMemberType_Deprecated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecated' namespace='##targetNamespace'"
	 * @generated
	 */
    DeprecatedType getDeprecated();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getDeprecated <em>Deprecated</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' containment reference.
	 * @see #getDeprecated()
	 * @generated
	 */
    void setDeprecated(DeprecatedType value);

    /**
	 * Returns the value of the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Obsolete</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Obsolete</em>' containment reference.
	 * @see #setObsolete(ObsoleteType)
	 * @see Mp.MpPackage#getEnumMemberType_Obsolete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='obsolete' namespace='##targetNamespace'"
	 * @generated
	 */
    ObsoleteType getObsolete();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getObsolete <em>Obsolete</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obsolete</em>' containment reference.
	 * @see #getObsolete()
	 * @generated
	 */
    void setObsolete(ObsoleteType value);

    /**
	 * Returns the value of the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preliminary</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary</em>' containment reference.
	 * @see #setPreliminary(PreliminaryType)
	 * @see Mp.MpPackage#getEnumMemberType_Preliminary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preliminary' namespace='##targetNamespace'"
	 * @generated
	 */
    PreliminaryType getPreliminary();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getPreliminary <em>Preliminary</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary</em>' containment reference.
	 * @see #getPreliminary()
	 * @generated
	 */
    void setPreliminary(PreliminaryType value);

    /**
	 * Returns the value of the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status Information</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Information</em>' containment reference.
	 * @see #setStatusInformation(StatusInformationType)
	 * @see Mp.MpPackage#getEnumMemberType_StatusInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
    StatusInformationType getStatusInformation();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getStatusInformation <em>Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Information</em>' containment reference.
	 * @see #getStatusInformation()
	 * @generated
	 */
    void setStatusInformation(StatusInformationType value);

    /**
	 * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' containment reference.
	 * @see #setVisibility(VisibilityType)
	 * @see Mp.MpPackage#getEnumMemberType_Visibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
    VisibilityType getVisibility();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getVisibility <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' containment reference.
	 * @see #getVisibility()
	 * @generated
	 */
    void setVisibility(VisibilityType value);

    /**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see Mp.MpPackage#getEnumMemberType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
    FilterType getFilter();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
    void setFilter(FilterType value);

    /**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType)
	 * @see Mp.MpPackage#getEnumMemberType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesType getDependencies();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
    void setDependencies(DependenciesType value);

    /**
	 * Returns the value of the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies Script</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Script</em>' containment reference.
	 * @see #setDependenciesScript(DependenciesScriptType)
	 * @see Mp.MpPackage#getEnumMemberType_DependenciesScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependenciesScript' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesScriptType getDependenciesScript();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getDependenciesScript <em>Dependencies Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies Script</em>' containment reference.
	 * @see #getDependenciesScript()
	 * @generated
	 */
    void setDependenciesScript(DependenciesScriptType value);

    /**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureType)
	 * @see Mp.MpPackage#getEnumMemberType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
    FeatureType getFeature();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
    void setFeature(FeatureType value);

    /**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(SpecificationType)
	 * @see Mp.MpPackage#getEnumMemberType_Specification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
    SpecificationType getSpecification();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
    void setSpecification(SpecificationType value);

    /**
	 * Returns the value of the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface Only</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Only</em>' containment reference.
	 * @see #setInterfaceOnly(InterfaceOnlyType)
	 * @see Mp.MpPackage#getEnumMemberType_InterfaceOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceOnly' namespace='##targetNamespace'"
	 * @generated
	 */
    InterfaceOnlyType getInterfaceOnly();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getInterfaceOnly <em>Interface Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Only</em>' containment reference.
	 * @see #getInterfaceOnly()
	 * @generated
	 */
    void setInterfaceOnly(InterfaceOnlyType value);

    /**
	 * Returns the value of the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decision Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Point</em>' containment reference.
	 * @see #setDecisionPoint(DecisionPointType)
	 * @see Mp.MpPackage#getEnumMemberType_DecisionPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionPoint' namespace='##targetNamespace'"
	 * @generated
	 */
    DecisionPointType getDecisionPoint();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getDecisionPoint <em>Decision Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Point</em>' containment reference.
	 * @see #getDecisionPoint()
	 * @generated
	 */
    void setDecisionPoint(DecisionPointType value);

    /**
	 * Returns the value of the '<em><b>Disturbances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disturbances</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Disturbances</em>' containment reference.
	 * @see #setDisturbances(DisturbancesType)
	 * @see Mp.MpPackage#getEnumMemberType_Disturbances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disturbances' namespace='##targetNamespace'"
	 * @generated
	 */
    DisturbancesType getDisturbances();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getDisturbances <em>Disturbances</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disturbances</em>' containment reference.
	 * @see #getDisturbances()
	 * @generated
	 */
    void setDisturbances(DisturbancesType value);

    /**
	 * Returns the value of the '<em><b>Takes Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Takes Effect</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Takes Effect</em>' containment reference.
	 * @see #setTakesEffect(TakesEffectType)
	 * @see Mp.MpPackage#getEnumMemberType_TakesEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takesEffect' namespace='##targetNamespace'"
	 * @generated
	 */
    TakesEffectType getTakesEffect();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getTakesEffect <em>Takes Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Takes Effect</em>' containment reference.
	 * @see #getTakesEffect()
	 * @generated
	 */
    void setTakesEffect(TakesEffectType value);

    /**
	 * Returns the value of the '<em><b>Side Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Side Effects</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Effects</em>' containment reference.
	 * @see #setSideEffects(SideEffectsType)
	 * @see Mp.MpPackage#getEnumMemberType_SideEffects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sideEffects' namespace='##targetNamespace'"
	 * @generated
	 */
    SideEffectsType getSideEffects();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getSideEffects <em>Side Effects</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Effects</em>' containment reference.
	 * @see #getSideEffects()
	 * @generated
	 */
    void setSideEffects(SideEffectsType value);

    /**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(PreconditionType)
	 * @see Mp.MpPackage#getEnumMemberType_Precondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precondition' namespace='##targetNamespace'"
	 * @generated
	 */
    PreconditionType getPrecondition();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
    void setPrecondition(PreconditionType value);

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
	 * @see Mp.MpPackage#getEnumMemberType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.EnumMemberType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // EnumMemberType
