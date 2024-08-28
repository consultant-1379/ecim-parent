/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApprovedByType;
import Mp.CreatedByType;
import Mp.MomIdentityType;
import Mp.MomMetaDataType;
import Mp.MomSubTitleType;
import Mp.MomTitleType;
import Mp.MpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mom Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.MomMetaDataTypeImpl#getMomTitle <em>Mom Title</em>}</li>
 *   <li>{@link Mp.impl.MomMetaDataTypeImpl#getMomSubTitle <em>Mom Sub Title</em>}</li>
 *   <li>{@link Mp.impl.MomMetaDataTypeImpl#getMomIdentity <em>Mom Identity</em>}</li>
 *   <li>{@link Mp.impl.MomMetaDataTypeImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link Mp.impl.MomMetaDataTypeImpl#getApprovedBy <em>Approved By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MomMetaDataTypeImpl extends EObjectImpl implements MomMetaDataType {
    /**
	 * The cached value of the '{@link #getMomTitle() <em>Mom Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMomTitle()
	 * @generated
	 * @ordered
	 */
    protected MomTitleType momTitle;

    /**
	 * The cached value of the '{@link #getMomSubTitle() <em>Mom Sub Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMomSubTitle()
	 * @generated
	 * @ordered
	 */
    protected MomSubTitleType momSubTitle;

    /**
	 * The cached value of the '{@link #getMomIdentity() <em>Mom Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMomIdentity()
	 * @generated
	 * @ordered
	 */
    protected MomIdentityType momIdentity;

    /**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
    protected CreatedByType createdBy;

    /**
	 * The cached value of the '{@link #getApprovedBy() <em>Approved By</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApprovedBy()
	 * @generated
	 * @ordered
	 */
    protected ApprovedByType approvedBy;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MomMetaDataTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getMomMetaDataType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomTitleType getMomTitle() {
		return momTitle;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMomTitle(MomTitleType newMomTitle, NotificationChain msgs) {
		MomTitleType oldMomTitle = momTitle;
		momTitle = newMomTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__MOM_TITLE, oldMomTitle, newMomTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMomTitle(MomTitleType newMomTitle) {
		if (newMomTitle != momTitle) {
			NotificationChain msgs = null;
			if (momTitle != null)
				msgs = ((InternalEObject)momTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__MOM_TITLE, null, msgs);
			if (newMomTitle != null)
				msgs = ((InternalEObject)newMomTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__MOM_TITLE, null, msgs);
			msgs = basicSetMomTitle(newMomTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__MOM_TITLE, newMomTitle, newMomTitle));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomSubTitleType getMomSubTitle() {
		return momSubTitle;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMomSubTitle(MomSubTitleType newMomSubTitle, NotificationChain msgs) {
		MomSubTitleType oldMomSubTitle = momSubTitle;
		momSubTitle = newMomSubTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE, oldMomSubTitle, newMomSubTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMomSubTitle(MomSubTitleType newMomSubTitle) {
		if (newMomSubTitle != momSubTitle) {
			NotificationChain msgs = null;
			if (momSubTitle != null)
				msgs = ((InternalEObject)momSubTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE, null, msgs);
			if (newMomSubTitle != null)
				msgs = ((InternalEObject)newMomSubTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE, null, msgs);
			msgs = basicSetMomSubTitle(newMomSubTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE, newMomSubTitle, newMomSubTitle));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MomIdentityType getMomIdentity() {
		return momIdentity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMomIdentity(MomIdentityType newMomIdentity, NotificationChain msgs) {
		MomIdentityType oldMomIdentity = momIdentity;
		momIdentity = newMomIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY, oldMomIdentity, newMomIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMomIdentity(MomIdentityType newMomIdentity) {
		if (newMomIdentity != momIdentity) {
			NotificationChain msgs = null;
			if (momIdentity != null)
				msgs = ((InternalEObject)momIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY, null, msgs);
			if (newMomIdentity != null)
				msgs = ((InternalEObject)newMomIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY, null, msgs);
			msgs = basicSetMomIdentity(newMomIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY, newMomIdentity, newMomIdentity));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CreatedByType getCreatedBy() {
		return createdBy;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCreatedBy(CreatedByType newCreatedBy, NotificationChain msgs) {
		CreatedByType oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__CREATED_BY, oldCreatedBy, newCreatedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCreatedBy(CreatedByType newCreatedBy) {
		if (newCreatedBy != createdBy) {
			NotificationChain msgs = null;
			if (createdBy != null)
				msgs = ((InternalEObject)createdBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__CREATED_BY, null, msgs);
			if (newCreatedBy != null)
				msgs = ((InternalEObject)newCreatedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__CREATED_BY, null, msgs);
			msgs = basicSetCreatedBy(newCreatedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__CREATED_BY, newCreatedBy, newCreatedBy));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApprovedByType getApprovedBy() {
		return approvedBy;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetApprovedBy(ApprovedByType newApprovedBy, NotificationChain msgs) {
		ApprovedByType oldApprovedBy = approvedBy;
		approvedBy = newApprovedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__APPROVED_BY, oldApprovedBy, newApprovedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApprovedBy(ApprovedByType newApprovedBy) {
		if (newApprovedBy != approvedBy) {
			NotificationChain msgs = null;
			if (approvedBy != null)
				msgs = ((InternalEObject)approvedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__APPROVED_BY, null, msgs);
			if (newApprovedBy != null)
				msgs = ((InternalEObject)newApprovedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_META_DATA_TYPE__APPROVED_BY, null, msgs);
			msgs = basicSetApprovedBy(newApprovedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_META_DATA_TYPE__APPROVED_BY, newApprovedBy, newApprovedBy));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.MOM_META_DATA_TYPE__MOM_TITLE:
				return basicSetMomTitle(null, msgs);
			case MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE:
				return basicSetMomSubTitle(null, msgs);
			case MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY:
				return basicSetMomIdentity(null, msgs);
			case MpPackage.MOM_META_DATA_TYPE__CREATED_BY:
				return basicSetCreatedBy(null, msgs);
			case MpPackage.MOM_META_DATA_TYPE__APPROVED_BY:
				return basicSetApprovedBy(null, msgs);
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
			case MpPackage.MOM_META_DATA_TYPE__MOM_TITLE:
				return getMomTitle();
			case MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE:
				return getMomSubTitle();
			case MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY:
				return getMomIdentity();
			case MpPackage.MOM_META_DATA_TYPE__CREATED_BY:
				return getCreatedBy();
			case MpPackage.MOM_META_DATA_TYPE__APPROVED_BY:
				return getApprovedBy();
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
			case MpPackage.MOM_META_DATA_TYPE__MOM_TITLE:
				setMomTitle((MomTitleType)newValue);
				return;
			case MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE:
				setMomSubTitle((MomSubTitleType)newValue);
				return;
			case MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY:
				setMomIdentity((MomIdentityType)newValue);
				return;
			case MpPackage.MOM_META_DATA_TYPE__CREATED_BY:
				setCreatedBy((CreatedByType)newValue);
				return;
			case MpPackage.MOM_META_DATA_TYPE__APPROVED_BY:
				setApprovedBy((ApprovedByType)newValue);
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
			case MpPackage.MOM_META_DATA_TYPE__MOM_TITLE:
				setMomTitle((MomTitleType)null);
				return;
			case MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE:
				setMomSubTitle((MomSubTitleType)null);
				return;
			case MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY:
				setMomIdentity((MomIdentityType)null);
				return;
			case MpPackage.MOM_META_DATA_TYPE__CREATED_BY:
				setCreatedBy((CreatedByType)null);
				return;
			case MpPackage.MOM_META_DATA_TYPE__APPROVED_BY:
				setApprovedBy((ApprovedByType)null);
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
			case MpPackage.MOM_META_DATA_TYPE__MOM_TITLE:
				return momTitle != null;
			case MpPackage.MOM_META_DATA_TYPE__MOM_SUB_TITLE:
				return momSubTitle != null;
			case MpPackage.MOM_META_DATA_TYPE__MOM_IDENTITY:
				return momIdentity != null;
			case MpPackage.MOM_META_DATA_TYPE__CREATED_BY:
				return createdBy != null;
			case MpPackage.MOM_META_DATA_TYPE__APPROVED_BY:
				return approvedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //MomMetaDataTypeImpl
