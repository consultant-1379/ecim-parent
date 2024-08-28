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
 * A representation of the model object '<em><b>Slot Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.SlotType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.SlotType#getValue <em>Value</em>}</li>
 *   <li>{@link Mp.SlotType#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link Mp.SlotType#getSeqValue <em>Seq Value</em>}</li>
 *   <li>{@link Mp.SlotType#getComplexSeqValue <em>Complex Seq Value</em>}</li>
 *   <li>{@link Mp.SlotType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getSlotType()
 * @model extendedMetaData="name='slot_._type' kind='elementOnly'"
 * @generated
 */
public interface SlotType extends EObject {
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
	 * @see Mp.MpPackage#getSlotType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Mp.MpPackage#getSlotType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
    String getValue();

    /**
	 * Sets the value of the '{@link Mp.SlotType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(String value);

    /**
	 * Returns the value of the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Value</em>' containment reference.
	 * @see #setComplexValue(ComplexValueType)
	 * @see Mp.MpPackage#getSlotType_ComplexValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complexValue' namespace='##targetNamespace'"
	 * @generated
	 */
    ComplexValueType getComplexValue();

    /**
	 * Sets the value of the '{@link Mp.SlotType#getComplexValue <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Value</em>' containment reference.
	 * @see #getComplexValue()
	 * @generated
	 */
    void setComplexValue(ComplexValueType value);

    /**
	 * Returns the value of the '<em><b>Seq Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seq Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Value</em>' containment reference.
	 * @see #setSeqValue(SeqValueType)
	 * @see Mp.MpPackage#getSlotType_SeqValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seqValue' namespace='##targetNamespace'"
	 * @generated
	 */
    SeqValueType getSeqValue();

    /**
	 * Sets the value of the '{@link Mp.SlotType#getSeqValue <em>Seq Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Value</em>' containment reference.
	 * @see #getSeqValue()
	 * @generated
	 */
    void setSeqValue(SeqValueType value);

    /**
	 * Returns the value of the '<em><b>Complex Seq Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex Seq Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Seq Value</em>' containment reference.
	 * @see #setComplexSeqValue(ComplexSeqValueType)
	 * @see Mp.MpPackage#getSlotType_ComplexSeqValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complexSeqValue' namespace='##targetNamespace'"
	 * @generated
	 */
    ComplexSeqValueType getComplexSeqValue();

    /**
	 * Sets the value of the '{@link Mp.SlotType#getComplexSeqValue <em>Complex Seq Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Seq Value</em>' containment reference.
	 * @see #getComplexSeqValue()
	 * @generated
	 */
    void setComplexSeqValue(ComplexSeqValueType value);

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
	 * @see Mp.MpPackage#getSlotType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.SlotType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // SlotType
