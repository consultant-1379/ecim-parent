/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.DataTypeType;
import TspMim.DescriptionType;
import TspMim.ExtensionType;
import TspMim.LengthRangeType;
import TspMim.SequenceType;
import TspMim.TspMimPackage;

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
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.SequenceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.impl.SequenceTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.impl.SequenceTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link TspMim.impl.SequenceTypeImpl#getLengthRange <em>Length Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceTypeImpl extends EObjectImpl implements SequenceType {
    /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
    protected DescriptionType description;

    /**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
    protected EList<ExtensionType> extension;

    /**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
    protected DataTypeType dataType;

    /**
	 * The cached value of the '{@link #getLengthRange() <em>Length Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLengthRange()
	 * @generated
	 * @ordered
	 */
    protected LengthRangeType lengthRange;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SequenceTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.SEQUENCE_TYPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DescriptionType getDescription() {
		return description;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.SEQUENCE_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.SEQUENCE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.SEQUENCE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.SEQUENCE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<ExtensionType>(ExtensionType.class, this, TspMimPackage.SEQUENCE_TYPE__EXTENSION);
		}
		return extension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeType getDataType() {
		return dataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataType(DataTypeType newDataType, NotificationChain msgs) {
		DataTypeType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.SEQUENCE_TYPE__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataType(DataTypeType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.SEQUENCE_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.SEQUENCE_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.SEQUENCE_TYPE__DATA_TYPE, newDataType, newDataType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LengthRangeType getLengthRange() {
		return lengthRange;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLengthRange(LengthRangeType newLengthRange, NotificationChain msgs) {
		LengthRangeType oldLengthRange = lengthRange;
		lengthRange = newLengthRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE, oldLengthRange, newLengthRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLengthRange(LengthRangeType newLengthRange) {
		if (newLengthRange != lengthRange) {
			NotificationChain msgs = null;
			if (lengthRange != null)
				msgs = ((InternalEObject)lengthRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE, null, msgs);
			if (newLengthRange != null)
				msgs = ((InternalEObject)newLengthRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE, null, msgs);
			msgs = basicSetLengthRange(newLengthRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE, newLengthRange, newLengthRange));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.SEQUENCE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TspMimPackage.SEQUENCE_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case TspMimPackage.SEQUENCE_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE:
				return basicSetLengthRange(null, msgs);
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
			case TspMimPackage.SEQUENCE_TYPE__DESCRIPTION:
				return getDescription();
			case TspMimPackage.SEQUENCE_TYPE__EXTENSION:
				return getExtension();
			case TspMimPackage.SEQUENCE_TYPE__DATA_TYPE:
				return getDataType();
			case TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE:
				return getLengthRange();
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
			case TspMimPackage.SEQUENCE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TspMimPackage.SEQUENCE_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionType>)newValue);
				return;
			case TspMimPackage.SEQUENCE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)newValue);
				return;
			case TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE:
				setLengthRange((LengthRangeType)newValue);
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
			case TspMimPackage.SEQUENCE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TspMimPackage.SEQUENCE_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case TspMimPackage.SEQUENCE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)null);
				return;
			case TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE:
				setLengthRange((LengthRangeType)null);
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
			case TspMimPackage.SEQUENCE_TYPE__DESCRIPTION:
				return description != null;
			case TspMimPackage.SEQUENCE_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case TspMimPackage.SEQUENCE_TYPE__DATA_TYPE:
				return dataType != null;
			case TspMimPackage.SEQUENCE_TYPE__LENGTH_RANGE:
				return lengthRange != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceTypeImpl
