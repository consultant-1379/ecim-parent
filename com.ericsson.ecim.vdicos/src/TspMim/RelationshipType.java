/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

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
 *   <li>{@link TspMim.RelationshipType#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.RelationshipType#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.RelationshipType#getParent <em>Parent</em>}</li>
 *   <li>{@link TspMim.RelationshipType#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getRelationshipType()
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
	 * @see TspMim.TspMimPackage#getRelationshipType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link TspMim.RelationshipType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getRelationshipType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

    /**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(ParentType)
	 * @see TspMim.TspMimPackage#getRelationshipType_Parent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
    ParentType getParent();

    /**
	 * Sets the value of the '{@link TspMim.RelationshipType#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
    void setParent(ParentType value);

    /**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ChildType)
	 * @see TspMim.TspMimPackage#getRelationshipType_Child()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='child' namespace='##targetNamespace'"
	 * @generated
	 */
    ChildType getChild();

    /**
	 * Sets the value of the '{@link TspMim.RelationshipType#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
    void setChild(ChildType value);

} // RelationshipType
