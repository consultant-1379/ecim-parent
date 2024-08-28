/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.CompanyType;
import Mp.CopyrightType;
import Mp.DisclaimerType;
import Mp.MpPackage;
import Mp.YearType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copyright Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.CopyrightTypeImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link Mp.impl.CopyrightTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link Mp.impl.CopyrightTypeImpl#getDisclaimer <em>Disclaimer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyrightTypeImpl extends EObjectImpl implements CopyrightType {
    /**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
    protected CompanyType company;

    /**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
    protected YearType year;

    /**
	 * The cached value of the '{@link #getDisclaimer() <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDisclaimer()
	 * @generated
	 * @ordered
	 */
    protected DisclaimerType disclaimer;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CopyrightTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getCopyrightType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CompanyType getCompany() {
		return company;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCompany(CompanyType newCompany, NotificationChain msgs) {
		CompanyType oldCompany = company;
		company = newCompany;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.COPYRIGHT_TYPE__COMPANY, oldCompany, newCompany);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCompany(CompanyType newCompany) {
		if (newCompany != company) {
			NotificationChain msgs = null;
			if (company != null)
				msgs = ((InternalEObject)company).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.COPYRIGHT_TYPE__COMPANY, null, msgs);
			if (newCompany != null)
				msgs = ((InternalEObject)newCompany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.COPYRIGHT_TYPE__COMPANY, null, msgs);
			msgs = basicSetCompany(newCompany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.COPYRIGHT_TYPE__COMPANY, newCompany, newCompany));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public YearType getYear() {
		return year;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetYear(YearType newYear, NotificationChain msgs) {
		YearType oldYear = year;
		year = newYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.COPYRIGHT_TYPE__YEAR, oldYear, newYear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setYear(YearType newYear) {
		if (newYear != year) {
			NotificationChain msgs = null;
			if (year != null)
				msgs = ((InternalEObject)year).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.COPYRIGHT_TYPE__YEAR, null, msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.COPYRIGHT_TYPE__YEAR, null, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.COPYRIGHT_TYPE__YEAR, newYear, newYear));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DisclaimerType getDisclaimer() {
		return disclaimer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDisclaimer(DisclaimerType newDisclaimer, NotificationChain msgs) {
		DisclaimerType oldDisclaimer = disclaimer;
		disclaimer = newDisclaimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.COPYRIGHT_TYPE__DISCLAIMER, oldDisclaimer, newDisclaimer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDisclaimer(DisclaimerType newDisclaimer) {
		if (newDisclaimer != disclaimer) {
			NotificationChain msgs = null;
			if (disclaimer != null)
				msgs = ((InternalEObject)disclaimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.COPYRIGHT_TYPE__DISCLAIMER, null, msgs);
			if (newDisclaimer != null)
				msgs = ((InternalEObject)newDisclaimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.COPYRIGHT_TYPE__DISCLAIMER, null, msgs);
			msgs = basicSetDisclaimer(newDisclaimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.COPYRIGHT_TYPE__DISCLAIMER, newDisclaimer, newDisclaimer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.COPYRIGHT_TYPE__COMPANY:
				return basicSetCompany(null, msgs);
			case MpPackage.COPYRIGHT_TYPE__YEAR:
				return basicSetYear(null, msgs);
			case MpPackage.COPYRIGHT_TYPE__DISCLAIMER:
				return basicSetDisclaimer(null, msgs);
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
			case MpPackage.COPYRIGHT_TYPE__COMPANY:
				return getCompany();
			case MpPackage.COPYRIGHT_TYPE__YEAR:
				return getYear();
			case MpPackage.COPYRIGHT_TYPE__DISCLAIMER:
				return getDisclaimer();
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
			case MpPackage.COPYRIGHT_TYPE__COMPANY:
				setCompany((CompanyType)newValue);
				return;
			case MpPackage.COPYRIGHT_TYPE__YEAR:
				setYear((YearType)newValue);
				return;
			case MpPackage.COPYRIGHT_TYPE__DISCLAIMER:
				setDisclaimer((DisclaimerType)newValue);
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
			case MpPackage.COPYRIGHT_TYPE__COMPANY:
				setCompany((CompanyType)null);
				return;
			case MpPackage.COPYRIGHT_TYPE__YEAR:
				setYear((YearType)null);
				return;
			case MpPackage.COPYRIGHT_TYPE__DISCLAIMER:
				setDisclaimer((DisclaimerType)null);
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
			case MpPackage.COPYRIGHT_TYPE__COMPANY:
				return company != null;
			case MpPackage.COPYRIGHT_TYPE__YEAR:
				return year != null;
			case MpPackage.COPYRIGHT_TYPE__DISCLAIMER:
				return disclaimer != null;
		}
		return super.eIsSet(featureID);
	}

} //CopyrightTypeImpl
