/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.impl;

import imm.AttrType;
import imm.ImmPackage;
import imm.ObjectDef;

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
 * An implementation of the model object '<em><b>Object Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imm.impl.ObjectDefImpl#getDn <em>Dn</em>}</li>
 *   <li>{@link imm.impl.ObjectDefImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link imm.impl.ObjectDefImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectDefImpl extends EObjectImpl implements ObjectDef {
    /**
     * The default value of the '{@link #getDn() <em>Dn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDn()
     * @generated
     * @ordered
     */
    protected static final String DN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDn() <em>Dn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDn()
     * @generated
     * @ordered
     */
    protected String dn = DN_EDEFAULT;

    /**
     * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttr()
     * @generated
     * @ordered
     */
    protected EList<AttrType> attr;

    /**
     * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
    protected static final String CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
    protected String class_ = CLASS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObjectDefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImmPackage.eINSTANCE.getObjectDef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDn() {
        return dn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDn(String newDn) {
        String oldDn = dn;
        dn = newDn;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.OBJECT_DEF__DN, oldDn, dn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttrType> getAttr() {
        if (attr == null) {
            attr = new EObjectContainmentEList<AttrType>(AttrType.class, this, ImmPackage.OBJECT_DEF__ATTR);
        }
        return attr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClass_() {
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClass(String newClass) {
        String oldClass = class_;
        class_ = newClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.OBJECT_DEF__CLASS, oldClass, class_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImmPackage.OBJECT_DEF__ATTR:
                return ((InternalEList<?>)getAttr()).basicRemove(otherEnd, msgs);
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
            case ImmPackage.OBJECT_DEF__DN:
                return getDn();
            case ImmPackage.OBJECT_DEF__ATTR:
                return getAttr();
            case ImmPackage.OBJECT_DEF__CLASS:
                return getClass_();
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
            case ImmPackage.OBJECT_DEF__DN:
                setDn((String)newValue);
                return;
            case ImmPackage.OBJECT_DEF__ATTR:
                getAttr().clear();
                getAttr().addAll((Collection<? extends AttrType>)newValue);
                return;
            case ImmPackage.OBJECT_DEF__CLASS:
                setClass((String)newValue);
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
            case ImmPackage.OBJECT_DEF__DN:
                setDn(DN_EDEFAULT);
                return;
            case ImmPackage.OBJECT_DEF__ATTR:
                getAttr().clear();
                return;
            case ImmPackage.OBJECT_DEF__CLASS:
                setClass(CLASS_EDEFAULT);
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
            case ImmPackage.OBJECT_DEF__DN:
                return DN_EDEFAULT == null ? dn != null : !DN_EDEFAULT.equals(dn);
            case ImmPackage.OBJECT_DEF__ATTR:
                return attr != null && !attr.isEmpty();
            case ImmPackage.OBJECT_DEF__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
        result.append(" (dn: ");
        result.append(dn);
        result.append(", class: ");
        result.append(class_);
        result.append(')');
        return result.toString();
    }

} //ObjectDefImpl
