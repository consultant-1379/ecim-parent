/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.MoRestartType;
import Mp.MpPackage;
import Mp.NoRestartType;
import Mp.NodeRestartType;
import Mp.RestartTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restart Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.RestartTypeTypeImpl#getNoRestart <em>No Restart</em>}</li>
 *   <li>{@link Mp.impl.RestartTypeTypeImpl#getMoRestart <em>Mo Restart</em>}</li>
 *   <li>{@link Mp.impl.RestartTypeTypeImpl#getNodeRestart <em>Node Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestartTypeTypeImpl extends EObjectImpl implements RestartTypeType {
    /**
	 * The cached value of the '{@link #getNoRestart() <em>No Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNoRestart()
	 * @generated
	 * @ordered
	 */
    protected NoRestartType noRestart;

    /**
	 * The cached value of the '{@link #getMoRestart() <em>Mo Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMoRestart()
	 * @generated
	 * @ordered
	 */
    protected MoRestartType moRestart;

    /**
	 * The cached value of the '{@link #getNodeRestart() <em>Node Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNodeRestart()
	 * @generated
	 * @ordered
	 */
    protected NodeRestartType nodeRestart;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RestartTypeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getRestartTypeType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NoRestartType getNoRestart() {
		return noRestart;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNoRestart(NoRestartType newNoRestart, NotificationChain msgs) {
		NoRestartType oldNoRestart = noRestart;
		noRestart = newNoRestart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RESTART_TYPE_TYPE__NO_RESTART, oldNoRestart, newNoRestart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNoRestart(NoRestartType newNoRestart) {
		if (newNoRestart != noRestart) {
			NotificationChain msgs = null;
			if (noRestart != null)
				msgs = ((InternalEObject)noRestart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RESTART_TYPE_TYPE__NO_RESTART, null, msgs);
			if (newNoRestart != null)
				msgs = ((InternalEObject)newNoRestart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RESTART_TYPE_TYPE__NO_RESTART, null, msgs);
			msgs = basicSetNoRestart(newNoRestart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RESTART_TYPE_TYPE__NO_RESTART, newNoRestart, newNoRestart));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MoRestartType getMoRestart() {
		return moRestart;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMoRestart(MoRestartType newMoRestart, NotificationChain msgs) {
		MoRestartType oldMoRestart = moRestart;
		moRestart = newMoRestart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RESTART_TYPE_TYPE__MO_RESTART, oldMoRestart, newMoRestart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMoRestart(MoRestartType newMoRestart) {
		if (newMoRestart != moRestart) {
			NotificationChain msgs = null;
			if (moRestart != null)
				msgs = ((InternalEObject)moRestart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RESTART_TYPE_TYPE__MO_RESTART, null, msgs);
			if (newMoRestart != null)
				msgs = ((InternalEObject)newMoRestart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RESTART_TYPE_TYPE__MO_RESTART, null, msgs);
			msgs = basicSetMoRestart(newMoRestart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RESTART_TYPE_TYPE__MO_RESTART, newMoRestart, newMoRestart));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NodeRestartType getNodeRestart() {
		return nodeRestart;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNodeRestart(NodeRestartType newNodeRestart, NotificationChain msgs) {
		NodeRestartType oldNodeRestart = nodeRestart;
		nodeRestart = newNodeRestart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.RESTART_TYPE_TYPE__NODE_RESTART, oldNodeRestart, newNodeRestart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNodeRestart(NodeRestartType newNodeRestart) {
		if (newNodeRestart != nodeRestart) {
			NotificationChain msgs = null;
			if (nodeRestart != null)
				msgs = ((InternalEObject)nodeRestart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.RESTART_TYPE_TYPE__NODE_RESTART, null, msgs);
			if (newNodeRestart != null)
				msgs = ((InternalEObject)newNodeRestart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.RESTART_TYPE_TYPE__NODE_RESTART, null, msgs);
			msgs = basicSetNodeRestart(newNodeRestart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.RESTART_TYPE_TYPE__NODE_RESTART, newNodeRestart, newNodeRestart));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.RESTART_TYPE_TYPE__NO_RESTART:
				return basicSetNoRestart(null, msgs);
			case MpPackage.RESTART_TYPE_TYPE__MO_RESTART:
				return basicSetMoRestart(null, msgs);
			case MpPackage.RESTART_TYPE_TYPE__NODE_RESTART:
				return basicSetNodeRestart(null, msgs);
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
			case MpPackage.RESTART_TYPE_TYPE__NO_RESTART:
				return getNoRestart();
			case MpPackage.RESTART_TYPE_TYPE__MO_RESTART:
				return getMoRestart();
			case MpPackage.RESTART_TYPE_TYPE__NODE_RESTART:
				return getNodeRestart();
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
			case MpPackage.RESTART_TYPE_TYPE__NO_RESTART:
				setNoRestart((NoRestartType)newValue);
				return;
			case MpPackage.RESTART_TYPE_TYPE__MO_RESTART:
				setMoRestart((MoRestartType)newValue);
				return;
			case MpPackage.RESTART_TYPE_TYPE__NODE_RESTART:
				setNodeRestart((NodeRestartType)newValue);
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
			case MpPackage.RESTART_TYPE_TYPE__NO_RESTART:
				setNoRestart((NoRestartType)null);
				return;
			case MpPackage.RESTART_TYPE_TYPE__MO_RESTART:
				setMoRestart((MoRestartType)null);
				return;
			case MpPackage.RESTART_TYPE_TYPE__NODE_RESTART:
				setNodeRestart((NodeRestartType)null);
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
			case MpPackage.RESTART_TYPE_TYPE__NO_RESTART:
				return noRestart != null;
			case MpPackage.RESTART_TYPE_TYPE__MO_RESTART:
				return moRestart != null;
			case MpPackage.RESTART_TYPE_TYPE__NODE_RESTART:
				return nodeRestart != null;
		}
		return super.eIsSet(featureID);
	}

} //RestartTypeTypeImpl
