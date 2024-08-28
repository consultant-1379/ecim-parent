/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.impl;

import imm.AttrDef;
import imm.Category;
import imm.ClassDef;
import imm.ImmPackage;
import imm.RdnDef;

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
 * An implementation of the model object '<em><b>Class Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imm.impl.ClassDefImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link imm.impl.ClassDefImpl#getRdn <em>Rdn</em>}</li>
 *   <li>{@link imm.impl.ClassDefImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link imm.impl.ClassDefImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefImpl extends EObjectImpl implements ClassDef {
    /**
     * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected static final Category CATEGORY_EDEFAULT = Category.SACONFIG;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected Category category = CATEGORY_EDEFAULT;

    /**
     * This is true if the Category attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean categoryESet;

    /**
     * The cached value of the '{@link #getRdn() <em>Rdn</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRdn()
     * @generated
     * @ordered
     */
    protected RdnDef rdn;

    /**
     * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttr()
     * @generated
     * @ordered
     */
    protected EList<AttrDef> attr;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassDefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImmPackage.eINSTANCE.getClassDef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Category getCategory() {
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCategory(Category newCategory) {
        Category oldCategory = category;
        category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
        boolean oldCategoryESet = categoryESet;
        categoryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.CLASS_DEF__CATEGORY, oldCategory, category, !oldCategoryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCategory() {
        Category oldCategory = category;
        boolean oldCategoryESet = categoryESet;
        category = CATEGORY_EDEFAULT;
        categoryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ImmPackage.CLASS_DEF__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCategory() {
        return categoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RdnDef getRdn() {
        return rdn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRdn(RdnDef newRdn, NotificationChain msgs) {
        RdnDef oldRdn = rdn;
        rdn = newRdn;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImmPackage.CLASS_DEF__RDN, oldRdn, newRdn);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRdn(RdnDef newRdn) {
        if (newRdn != rdn) {
            NotificationChain msgs = null;
            if (rdn != null)
                msgs = ((InternalEObject)rdn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImmPackage.CLASS_DEF__RDN, null, msgs);
            if (newRdn != null)
                msgs = ((InternalEObject)newRdn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImmPackage.CLASS_DEF__RDN, null, msgs);
            msgs = basicSetRdn(newRdn, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.CLASS_DEF__RDN, newRdn, newRdn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttrDef> getAttr() {
        if (attr == null) {
            attr = new EObjectContainmentEList<AttrDef>(AttrDef.class, this, ImmPackage.CLASS_DEF__ATTR);
        }
        return attr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.CLASS_DEF__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImmPackage.CLASS_DEF__RDN:
                return basicSetRdn(null, msgs);
            case ImmPackage.CLASS_DEF__ATTR:
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
            case ImmPackage.CLASS_DEF__CATEGORY:
                return getCategory();
            case ImmPackage.CLASS_DEF__RDN:
                return getRdn();
            case ImmPackage.CLASS_DEF__ATTR:
                return getAttr();
            case ImmPackage.CLASS_DEF__NAME:
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
            case ImmPackage.CLASS_DEF__CATEGORY:
                setCategory((Category)newValue);
                return;
            case ImmPackage.CLASS_DEF__RDN:
                setRdn((RdnDef)newValue);
                return;
            case ImmPackage.CLASS_DEF__ATTR:
                getAttr().clear();
                getAttr().addAll((Collection<? extends AttrDef>)newValue);
                return;
            case ImmPackage.CLASS_DEF__NAME:
                setName((String)newValue);
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
            case ImmPackage.CLASS_DEF__CATEGORY:
                unsetCategory();
                return;
            case ImmPackage.CLASS_DEF__RDN:
                setRdn((RdnDef)null);
                return;
            case ImmPackage.CLASS_DEF__ATTR:
                getAttr().clear();
                return;
            case ImmPackage.CLASS_DEF__NAME:
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
            case ImmPackage.CLASS_DEF__CATEGORY:
                return isSetCategory();
            case ImmPackage.CLASS_DEF__RDN:
                return rdn != null;
            case ImmPackage.CLASS_DEF__ATTR:
                return attr != null && !attr.isEmpty();
            case ImmPackage.CLASS_DEF__NAME:
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
        result.append(" (category: ");
        if (categoryESet) result.append(category); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ClassDefImpl
