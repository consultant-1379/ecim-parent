/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.DataTypeType;
import TspMim.ReturnTypeType;
import TspMim.TspMimPackage;
import TspMim.VoidType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.ReturnTypeTypeImpl#getVoid <em>Void</em>}</li>
 *   <li>{@link TspMim.impl.ReturnTypeTypeImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnTypeTypeImpl extends EObjectImpl implements ReturnTypeType {
    /**
	 * The cached value of the '{@link #getVoid() <em>Void</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVoid()
	 * @generated
	 * @ordered
	 */
    protected VoidType void_;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ReturnTypeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.RETURN_TYPE_TYPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VoidType getVoid() {
		return void_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetVoid(VoidType newVoid, NotificationChain msgs) {
		VoidType oldVoid = void_;
		void_ = newVoid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.RETURN_TYPE_TYPE__VOID, oldVoid, newVoid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVoid(VoidType newVoid) {
		if (newVoid != void_) {
			NotificationChain msgs = null;
			if (void_ != null)
				msgs = ((InternalEObject)void_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RETURN_TYPE_TYPE__VOID, null, msgs);
			if (newVoid != null)
				msgs = ((InternalEObject)newVoid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RETURN_TYPE_TYPE__VOID, null, msgs);
			msgs = basicSetVoid(newVoid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.RETURN_TYPE_TYPE__VOID, newVoid, newVoid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE, oldDataType, newDataType);
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
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE, newDataType, newDataType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.RETURN_TYPE_TYPE__VOID:
				return basicSetVoid(null, msgs);
			case TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
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
			case TspMimPackage.RETURN_TYPE_TYPE__VOID:
				return getVoid();
			case TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE:
				return getDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TspMimPackage.RETURN_TYPE_TYPE__VOID:
				setVoid((VoidType)newValue);
				return;
			case TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)newValue);
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
			case TspMimPackage.RETURN_TYPE_TYPE__VOID:
				setVoid((VoidType)null);
				return;
			case TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)null);
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
			case TspMimPackage.RETURN_TYPE_TYPE__VOID:
				return void_ != null;
			case TspMimPackage.RETURN_TYPE_TYPE__DATA_TYPE:
				return dataType != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnTypeTypeImpl
