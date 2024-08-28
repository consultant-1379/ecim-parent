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
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.RelationshipType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.RelationshipType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.RelationshipType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.RelationshipType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.RelationshipType#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.RelationshipType#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.RelationshipType#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.RelationshipType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.RelationshipType#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.RelationshipType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.RelationshipType#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.RelationshipType#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.RelationshipType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.RelationshipType#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.RelationshipType#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.RelationshipType#getBiDirectionalAssociation <em>Bi Directional Association</em>}</li>
 *   <li>{@link Mp.RelationshipType#getUniDirectionalAssociation <em>Uni Directional Association</em>}</li>
 *   <li>{@link Mp.RelationshipType#getContainment <em>Containment</em>}</li>
 *   <li>{@link Mp.RelationshipType#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link Mp.RelationshipType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getRelationshipType()
 * @model extendedMetaData="name='relationship_._type' kind='elementOnly'"
 * @generated
 */
public interface RelationshipType extends EObject {
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
	 * @see Mp.MpPackage#getRelationshipType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getApplicationTag <em>Application Tag</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

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
	 * @see Mp.MpPackage#getRelationshipType_Deprecated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecated' namespace='##targetNamespace'"
	 * @generated
	 */
    DeprecatedType getDeprecated();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getDeprecated <em>Deprecated</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_Obsolete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='obsolete' namespace='##targetNamespace'"
	 * @generated
	 */
    ObsoleteType getObsolete();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getObsolete <em>Obsolete</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_Preliminary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preliminary' namespace='##targetNamespace'"
	 * @generated
	 */
    PreliminaryType getPreliminary();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getPreliminary <em>Preliminary</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_StatusInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
    StatusInformationType getStatusInformation();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getStatusInformation <em>Status Information</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_Visibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
    VisibilityType getVisibility();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getVisibility <em>Visibility</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
    FilterType getFilter();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getFilter <em>Filter</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesType getDependencies();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getDependencies <em>Dependencies</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_DependenciesScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependenciesScript' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesScriptType getDependenciesScript();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getDependenciesScript <em>Dependencies Script</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
    FeatureType getFeature();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getFeature <em>Feature</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_Specification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
    SpecificationType getSpecification();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getSpecification <em>Specification</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_InterfaceOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceOnly' namespace='##targetNamespace'"
	 * @generated
	 */
    InterfaceOnlyType getInterfaceOnly();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getInterfaceOnly <em>Interface Only</em>}' containment reference.
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
	 * @see Mp.MpPackage#getRelationshipType_DecisionPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionPoint' namespace='##targetNamespace'"
	 * @generated
	 */
    DecisionPointType getDecisionPoint();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getDecisionPoint <em>Decision Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Point</em>' containment reference.
	 * @see #getDecisionPoint()
	 * @generated
	 */
    void setDecisionPoint(DecisionPointType value);

    /**
	 * Returns the value of the '<em><b>Bi Directional Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bi Directional Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Bi Directional Association</em>' containment reference.
	 * @see #setBiDirectionalAssociation(BiDirectionalAssociationType)
	 * @see Mp.MpPackage#getRelationshipType_BiDirectionalAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='biDirectionalAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
    BiDirectionalAssociationType getBiDirectionalAssociation();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getBiDirectionalAssociation <em>Bi Directional Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bi Directional Association</em>' containment reference.
	 * @see #getBiDirectionalAssociation()
	 * @generated
	 */
    void setBiDirectionalAssociation(BiDirectionalAssociationType value);

    /**
	 * Returns the value of the '<em><b>Uni Directional Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uni Directional Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Uni Directional Association</em>' containment reference.
	 * @see #setUniDirectionalAssociation(UniDirectionalAssociationType)
	 * @see Mp.MpPackage#getRelationshipType_UniDirectionalAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uniDirectionalAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
    UniDirectionalAssociationType getUniDirectionalAssociation();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getUniDirectionalAssociation <em>Uni Directional Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uni Directional Association</em>' containment reference.
	 * @see #getUniDirectionalAssociation()
	 * @generated
	 */
    void setUniDirectionalAssociation(UniDirectionalAssociationType value);

    /**
	 * Returns the value of the '<em><b>Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Containment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' containment reference.
	 * @see #setContainment(ContainmentType)
	 * @see Mp.MpPackage#getRelationshipType_Containment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containment' namespace='##targetNamespace'"
	 * @generated
	 */
    ContainmentType getContainment();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getContainment <em>Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' containment reference.
	 * @see #getContainment()
	 * @generated
	 */
    void setContainment(ContainmentType value);

    /**
	 * Returns the value of the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inheritance</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' containment reference.
	 * @see #setInheritance(InheritanceType)
	 * @see Mp.MpPackage#getRelationshipType_Inheritance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inheritance' namespace='##targetNamespace'"
	 * @generated
	 */
    InheritanceType getInheritance();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getInheritance <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' containment reference.
	 * @see #getInheritance()
	 * @generated
	 */
    void setInheritance(InheritanceType value);

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
	 * @see Mp.MpPackage#getRelationshipType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.RelationshipType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // RelationshipType
