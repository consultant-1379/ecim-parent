/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DtdVersionType;
import Mp.InterMimType;
import Mp.MibType;
import Mp.MimType;
import Mp.ModelsType;
import Mp.MomMetaDataType;
import Mp.MpPackage;

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
 * An implementation of the model object '<em><b>Models Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ModelsTypeImpl#getDtdVersion <em>Dtd Version</em>}</li>
 *   <li>{@link Mp.impl.ModelsTypeImpl#getMomMetaData <em>Mom Meta Data</em>}</li>
 *   <li>{@link Mp.impl.ModelsTypeImpl#getMim <em>Mim</em>}</li>
 *   <li>{@link Mp.impl.ModelsTypeImpl#getInterMim <em>Inter Mim</em>}</li>
 *   <li>{@link Mp.impl.ModelsTypeImpl#getMib <em>Mib</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelsTypeImpl extends EObjectImpl implements ModelsType {
    /**
	 * The cached value of the '{@link #getDtdVersion() <em>Dtd Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDtdVersion()
	 * @generated
	 * @ordered
	 */
    protected DtdVersionType dtdVersion;

    /**
	 * The cached value of the '{@link #getMomMetaData() <em>Mom Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMomMetaData()
	 * @generated
	 * @ordered
	 */
    protected MomMetaDataType momMetaData;

    /**
	 * The cached value of the '{@link #getMim() <em>Mim</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMim()
	 * @generated
	 * @ordered
	 */
    protected EList<MimType> mim;

    /**
	 * The cached value of the '{@link #getInterMim() <em>Inter Mim</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInterMim()
	 * @generated
	 * @ordered
	 */
    protected EList<InterMimType> interMim;

    /**
	 * The cached value of the '{@link #getMib() <em>Mib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMib()
	 * @generated
	 * @ordered
	 */
    protected EList<MibType> mib;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ModelsTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getModelsType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DtdVersionType getDtdVersion() {
		return dtdVersion;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDtdVersion(DtdVersionType newDtdVersion, NotificationChain msgs) {
		DtdVersionType oldDtdVersion = dtdVersion;
		dtdVersion = newDtdVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MODELS_TYPE__DTD_VERSION, oldDtdVersion, newDtdVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDtdVersion(DtdVersionType newDtdVersion) {
		if (newDtdVersion != dtdVersion) {
			NotificationChain msgs = null;
			if (dtdVersion != null)
				msgs = ((InternalEObject)dtdVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MODELS_TYPE__DTD_VERSION, null, msgs);
			if (newDtdVersion != null)
				msgs = ((InternalEObject)newDtdVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MODELS_TYPE__DTD_VERSION, null, msgs);
			msgs = basicSetDtdVersion(newDtdVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MODELS_TYPE__DTD_VERSION, newDtdVersion, newDtdVersion));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomMetaDataType getMomMetaData() {
		return momMetaData;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMomMetaData(MomMetaDataType newMomMetaData, NotificationChain msgs) {
		MomMetaDataType oldMomMetaData = momMetaData;
		momMetaData = newMomMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MODELS_TYPE__MOM_META_DATA, oldMomMetaData, newMomMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMomMetaData(MomMetaDataType newMomMetaData) {
		if (newMomMetaData != momMetaData) {
			NotificationChain msgs = null;
			if (momMetaData != null)
				msgs = ((InternalEObject)momMetaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MODELS_TYPE__MOM_META_DATA, null, msgs);
			if (newMomMetaData != null)
				msgs = ((InternalEObject)newMomMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MODELS_TYPE__MOM_META_DATA, null, msgs);
			msgs = basicSetMomMetaData(newMomMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MODELS_TYPE__MOM_META_DATA, newMomMetaData, newMomMetaData));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<MimType> getMim() {
		if (mim == null) {
			mim = new EObjectContainmentEList<MimType>(MimType.class, this, MpPackage.MODELS_TYPE__MIM);
		}
		return mim;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<InterMimType> getInterMim() {
		if (interMim == null) {
			interMim = new EObjectContainmentEList<InterMimType>(InterMimType.class, this, MpPackage.MODELS_TYPE__INTER_MIM);
		}
		return interMim;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<MibType> getMib() {
		if (mib == null) {
			mib = new EObjectContainmentEList<MibType>(MibType.class, this, MpPackage.MODELS_TYPE__MIB);
		}
		return mib;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.MODELS_TYPE__DTD_VERSION:
				return basicSetDtdVersion(null, msgs);
			case MpPackage.MODELS_TYPE__MOM_META_DATA:
				return basicSetMomMetaData(null, msgs);
			case MpPackage.MODELS_TYPE__MIM:
				return ((InternalEList<?>)getMim()).basicRemove(otherEnd, msgs);
			case MpPackage.MODELS_TYPE__INTER_MIM:
				return ((InternalEList<?>)getInterMim()).basicRemove(otherEnd, msgs);
			case MpPackage.MODELS_TYPE__MIB:
				return ((InternalEList<?>)getMib()).basicRemove(otherEnd, msgs);
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
			case MpPackage.MODELS_TYPE__DTD_VERSION:
				return getDtdVersion();
			case MpPackage.MODELS_TYPE__MOM_META_DATA:
				return getMomMetaData();
			case MpPackage.MODELS_TYPE__MIM:
				return getMim();
			case MpPackage.MODELS_TYPE__INTER_MIM:
				return getInterMim();
			case MpPackage.MODELS_TYPE__MIB:
				return getMib();
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
			case MpPackage.MODELS_TYPE__DTD_VERSION:
				setDtdVersion((DtdVersionType)newValue);
				return;
			case MpPackage.MODELS_TYPE__MOM_META_DATA:
				setMomMetaData((MomMetaDataType)newValue);
				return;
			case MpPackage.MODELS_TYPE__MIM:
				getMim().clear();
				getMim().addAll((Collection<? extends MimType>)newValue);
				return;
			case MpPackage.MODELS_TYPE__INTER_MIM:
				getInterMim().clear();
				getInterMim().addAll((Collection<? extends InterMimType>)newValue);
				return;
			case MpPackage.MODELS_TYPE__MIB:
				getMib().clear();
				getMib().addAll((Collection<? extends MibType>)newValue);
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
			case MpPackage.MODELS_TYPE__DTD_VERSION:
				setDtdVersion((DtdVersionType)null);
				return;
			case MpPackage.MODELS_TYPE__MOM_META_DATA:
				setMomMetaData((MomMetaDataType)null);
				return;
			case MpPackage.MODELS_TYPE__MIM:
				getMim().clear();
				return;
			case MpPackage.MODELS_TYPE__INTER_MIM:
				getInterMim().clear();
				return;
			case MpPackage.MODELS_TYPE__MIB:
				getMib().clear();
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
			case MpPackage.MODELS_TYPE__DTD_VERSION:
				return dtdVersion != null;
			case MpPackage.MODELS_TYPE__MOM_META_DATA:
				return momMetaData != null;
			case MpPackage.MODELS_TYPE__MIM:
				return mim != null && !mim.isEmpty();
			case MpPackage.MODELS_TYPE__INTER_MIM:
				return interMim != null && !interMim.isEmpty();
			case MpPackage.MODELS_TYPE__MIB:
				return mib != null && !mib.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelsTypeImpl
