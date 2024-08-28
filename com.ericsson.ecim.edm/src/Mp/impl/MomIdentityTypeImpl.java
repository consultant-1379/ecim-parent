/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DocDateType;
import Mp.DocLangType;
import Mp.DocNumType;
import Mp.DocRevType;
import Mp.MomIdentityType;
import Mp.MpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mom Identity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.MomIdentityTypeImpl#getDocNum <em>Doc Num</em>}</li>
 *   <li>{@link Mp.impl.MomIdentityTypeImpl#getDocLang <em>Doc Lang</em>}</li>
 *   <li>{@link Mp.impl.MomIdentityTypeImpl#getDocRev <em>Doc Rev</em>}</li>
 *   <li>{@link Mp.impl.MomIdentityTypeImpl#getDocDate <em>Doc Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MomIdentityTypeImpl extends EObjectImpl implements MomIdentityType {
    /**
	 * The cached value of the '{@link #getDocNum() <em>Doc Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocNum()
	 * @generated
	 * @ordered
	 */
    protected DocNumType docNum;

    /**
	 * The cached value of the '{@link #getDocLang() <em>Doc Lang</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocLang()
	 * @generated
	 * @ordered
	 */
    protected DocLangType docLang;

    /**
	 * The cached value of the '{@link #getDocRev() <em>Doc Rev</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocRev()
	 * @generated
	 * @ordered
	 */
    protected DocRevType docRev;

    /**
	 * The cached value of the '{@link #getDocDate() <em>Doc Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocDate()
	 * @generated
	 * @ordered
	 */
    protected DocDateType docDate;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MomIdentityTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getMomIdentityType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocNumType getDocNum() {
		return docNum;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDocNum(DocNumType newDocNum, NotificationChain msgs) {
		DocNumType oldDocNum = docNum;
		docNum = newDocNum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_NUM, oldDocNum, newDocNum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocNum(DocNumType newDocNum) {
		if (newDocNum != docNum) {
			NotificationChain msgs = null;
			if (docNum != null)
				msgs = ((InternalEObject)docNum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_NUM, null, msgs);
			if (newDocNum != null)
				msgs = ((InternalEObject)newDocNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_NUM, null, msgs);
			msgs = basicSetDocNum(newDocNum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_NUM, newDocNum, newDocNum));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocLangType getDocLang() {
		return docLang;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDocLang(DocLangType newDocLang, NotificationChain msgs) {
		DocLangType oldDocLang = docLang;
		docLang = newDocLang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_LANG, oldDocLang, newDocLang);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocLang(DocLangType newDocLang) {
		if (newDocLang != docLang) {
			NotificationChain msgs = null;
			if (docLang != null)
				msgs = ((InternalEObject)docLang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_LANG, null, msgs);
			if (newDocLang != null)
				msgs = ((InternalEObject)newDocLang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_LANG, null, msgs);
			msgs = basicSetDocLang(newDocLang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_LANG, newDocLang, newDocLang));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocRevType getDocRev() {
		return docRev;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDocRev(DocRevType newDocRev, NotificationChain msgs) {
		DocRevType oldDocRev = docRev;
		docRev = newDocRev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_REV, oldDocRev, newDocRev);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocRev(DocRevType newDocRev) {
		if (newDocRev != docRev) {
			NotificationChain msgs = null;
			if (docRev != null)
				msgs = ((InternalEObject)docRev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_REV, null, msgs);
			if (newDocRev != null)
				msgs = ((InternalEObject)newDocRev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_REV, null, msgs);
			msgs = basicSetDocRev(newDocRev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_REV, newDocRev, newDocRev));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocDateType getDocDate() {
		return docDate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDocDate(DocDateType newDocDate, NotificationChain msgs) {
		DocDateType oldDocDate = docDate;
		docDate = newDocDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_DATE, oldDocDate, newDocDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocDate(DocDateType newDocDate) {
		if (newDocDate != docDate) {
			NotificationChain msgs = null;
			if (docDate != null)
				msgs = ((InternalEObject)docDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_DATE, null, msgs);
			if (newDocDate != null)
				msgs = ((InternalEObject)newDocDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MOM_IDENTITY_TYPE__DOC_DATE, null, msgs);
			msgs = basicSetDocDate(newDocDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MOM_IDENTITY_TYPE__DOC_DATE, newDocDate, newDocDate));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.MOM_IDENTITY_TYPE__DOC_NUM:
				return basicSetDocNum(null, msgs);
			case MpPackage.MOM_IDENTITY_TYPE__DOC_LANG:
				return basicSetDocLang(null, msgs);
			case MpPackage.MOM_IDENTITY_TYPE__DOC_REV:
				return basicSetDocRev(null, msgs);
			case MpPackage.MOM_IDENTITY_TYPE__DOC_DATE:
				return basicSetDocDate(null, msgs);
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
			case MpPackage.MOM_IDENTITY_TYPE__DOC_NUM:
				return getDocNum();
			case MpPackage.MOM_IDENTITY_TYPE__DOC_LANG:
				return getDocLang();
			case MpPackage.MOM_IDENTITY_TYPE__DOC_REV:
				return getDocRev();
			case MpPackage.MOM_IDENTITY_TYPE__DOC_DATE:
				return getDocDate();
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
			case MpPackage.MOM_IDENTITY_TYPE__DOC_NUM:
				setDocNum((DocNumType)newValue);
				return;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_LANG:
				setDocLang((DocLangType)newValue);
				return;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_REV:
				setDocRev((DocRevType)newValue);
				return;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_DATE:
				setDocDate((DocDateType)newValue);
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
			case MpPackage.MOM_IDENTITY_TYPE__DOC_NUM:
				setDocNum((DocNumType)null);
				return;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_LANG:
				setDocLang((DocLangType)null);
				return;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_REV:
				setDocRev((DocRevType)null);
				return;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_DATE:
				setDocDate((DocDateType)null);
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
			case MpPackage.MOM_IDENTITY_TYPE__DOC_NUM:
				return docNum != null;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_LANG:
				return docLang != null;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_REV:
				return docRev != null;
			case MpPackage.MOM_IDENTITY_TYPE__DOC_DATE:
				return docDate != null;
		}
		return super.eIsSet(featureID);
	}

} //MomIdentityTypeImpl
