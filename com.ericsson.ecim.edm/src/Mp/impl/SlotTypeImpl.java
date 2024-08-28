/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ComplexSeqValueType;
import Mp.ComplexValueType;
import Mp.DomainExtensionType;
import Mp.MpPackage;
import Mp.SeqValueType;
import Mp.SlotType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.SlotTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.SlotTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link Mp.impl.SlotTypeImpl#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link Mp.impl.SlotTypeImpl#getSeqValue <em>Seq Value</em>}</li>
 *   <li>{@link Mp.impl.SlotTypeImpl#getComplexSeqValue <em>Complex Seq Value</em>}</li>
 *   <li>{@link Mp.impl.SlotTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotTypeImpl extends EObjectImpl implements SlotType {
    /**
	 * The cached value of the '{@link #getDomainExtension() <em>Domain Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDomainExtension()
	 * @generated
	 * @ordered
	 */
    protected EList<DomainExtensionType> domainExtension;

    /**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected static final String VALUE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected String value = VALUE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getComplexValue() <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getComplexValue()
	 * @generated
	 * @ordered
	 */
    protected ComplexValueType complexValue;

    /**
	 * The cached value of the '{@link #getSeqValue() <em>Seq Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSeqValue()
	 * @generated
	 * @ordered
	 */
    protected SeqValueType seqValue;

    /**
	 * The cached value of the '{@link #getComplexSeqValue() <em>Complex Seq Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getComplexSeqValue()
	 * @generated
	 * @ordered
	 */
    protected ComplexSeqValueType complexSeqValue;

    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final Object NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected Object name = NAME_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SlotTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getSlotType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.SLOT_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getValue() {
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__VALUE, oldValue, value));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ComplexValueType getComplexValue() {
		return complexValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetComplexValue(ComplexValueType newComplexValue, NotificationChain msgs) {
		ComplexValueType oldComplexValue = complexValue;
		complexValue = newComplexValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__COMPLEX_VALUE, oldComplexValue, newComplexValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setComplexValue(ComplexValueType newComplexValue) {
		if (newComplexValue != complexValue) {
			NotificationChain msgs = null;
			if (complexValue != null)
				msgs = ((InternalEObject)complexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.SLOT_TYPE__COMPLEX_VALUE, null, msgs);
			if (newComplexValue != null)
				msgs = ((InternalEObject)newComplexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.SLOT_TYPE__COMPLEX_VALUE, null, msgs);
			msgs = basicSetComplexValue(newComplexValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__COMPLEX_VALUE, newComplexValue, newComplexValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SeqValueType getSeqValue() {
		return seqValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSeqValue(SeqValueType newSeqValue, NotificationChain msgs) {
		SeqValueType oldSeqValue = seqValue;
		seqValue = newSeqValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__SEQ_VALUE, oldSeqValue, newSeqValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSeqValue(SeqValueType newSeqValue) {
		if (newSeqValue != seqValue) {
			NotificationChain msgs = null;
			if (seqValue != null)
				msgs = ((InternalEObject)seqValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.SLOT_TYPE__SEQ_VALUE, null, msgs);
			if (newSeqValue != null)
				msgs = ((InternalEObject)newSeqValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.SLOT_TYPE__SEQ_VALUE, null, msgs);
			msgs = basicSetSeqValue(newSeqValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__SEQ_VALUE, newSeqValue, newSeqValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ComplexSeqValueType getComplexSeqValue() {
		return complexSeqValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetComplexSeqValue(ComplexSeqValueType newComplexSeqValue, NotificationChain msgs) {
		ComplexSeqValueType oldComplexSeqValue = complexSeqValue;
		complexSeqValue = newComplexSeqValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE, oldComplexSeqValue, newComplexSeqValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setComplexSeqValue(ComplexSeqValueType newComplexSeqValue) {
		if (newComplexSeqValue != complexSeqValue) {
			NotificationChain msgs = null;
			if (complexSeqValue != null)
				msgs = ((InternalEObject)complexSeqValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE, null, msgs);
			if (newComplexSeqValue != null)
				msgs = ((InternalEObject)newComplexSeqValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE, null, msgs);
			msgs = basicSetComplexSeqValue(newComplexSeqValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE, newComplexSeqValue, newComplexSeqValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SLOT_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.SLOT_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.SLOT_TYPE__COMPLEX_VALUE:
				return basicSetComplexValue(null, msgs);
			case MpPackage.SLOT_TYPE__SEQ_VALUE:
				return basicSetSeqValue(null, msgs);
			case MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE:
				return basicSetComplexSeqValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MpPackage.SLOT_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.SLOT_TYPE__VALUE:
				return getValue();
			case MpPackage.SLOT_TYPE__COMPLEX_VALUE:
				return getComplexValue();
			case MpPackage.SLOT_TYPE__SEQ_VALUE:
				return getSeqValue();
			case MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE:
				return getComplexSeqValue();
			case MpPackage.SLOT_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpPackage.SLOT_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.SLOT_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case MpPackage.SLOT_TYPE__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)newValue);
				return;
			case MpPackage.SLOT_TYPE__SEQ_VALUE:
				setSeqValue((SeqValueType)newValue);
				return;
			case MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE:
				setComplexSeqValue((ComplexSeqValueType)newValue);
				return;
			case MpPackage.SLOT_TYPE__NAME:
				setName(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case MpPackage.SLOT_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.SLOT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MpPackage.SLOT_TYPE__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)null);
				return;
			case MpPackage.SLOT_TYPE__SEQ_VALUE:
				setSeqValue((SeqValueType)null);
				return;
			case MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE:
				setComplexSeqValue((ComplexSeqValueType)null);
				return;
			case MpPackage.SLOT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MpPackage.SLOT_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.SLOT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MpPackage.SLOT_TYPE__COMPLEX_VALUE:
				return complexValue != null;
			case MpPackage.SLOT_TYPE__SEQ_VALUE:
				return seqValue != null;
			case MpPackage.SLOT_TYPE__COMPLEX_SEQ_VALUE:
				return complexSeqValue != null;
			case MpPackage.SLOT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SlotTypeImpl
