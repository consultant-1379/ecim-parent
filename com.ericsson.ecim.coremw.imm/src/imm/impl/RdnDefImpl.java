/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.impl;

import imm.AttrFlags;
import imm.AttrValueType;
import imm.Category;
import imm.ImmPackage;
import imm.RdnDef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdn Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imm.impl.RdnDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link imm.impl.RdnDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link imm.impl.RdnDefImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link imm.impl.RdnDefImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link imm.impl.RdnDefImpl#getNtfid <em>Ntfid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdnDefImpl extends EObjectImpl implements RdnDef {
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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final AttrValueType TYPE_EDEFAULT = AttrValueType.SAINT32T;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected AttrValueType type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

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
     * The cached value of the '{@link #getFlag() <em>Flag</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlag()
     * @generated
     * @ordered
     */
    protected EList<AttrFlags> flag;

    /**
     * The default value of the '{@link #getNtfid() <em>Ntfid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNtfid()
     * @generated
     * @ordered
     */
    protected static final long NTFID_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNtfid() <em>Ntfid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNtfid()
     * @generated
     * @ordered
     */
    protected long ntfid = NTFID_EDEFAULT;

    /**
     * This is true if the Ntfid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ntfidESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RdnDefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImmPackage.eINSTANCE.getRdnDef();
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
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.RDN_DEF__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttrValueType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(AttrValueType newType) {
        AttrValueType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.RDN_DEF__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType() {
        AttrValueType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ImmPackage.RDN_DEF__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType() {
        return typeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.RDN_DEF__CATEGORY, oldCategory, category, !oldCategoryESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ImmPackage.RDN_DEF__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
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
    public EList<AttrFlags> getFlag() {
        if (flag == null) {
            flag = new EDataTypeEList<AttrFlags>(AttrFlags.class, this, ImmPackage.RDN_DEF__FLAG);
        }
        return flag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getNtfid() {
        return ntfid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNtfid(long newNtfid) {
        long oldNtfid = ntfid;
        ntfid = newNtfid;
        boolean oldNtfidESet = ntfidESet;
        ntfidESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.RDN_DEF__NTFID, oldNtfid, ntfid, !oldNtfidESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNtfid() {
        long oldNtfid = ntfid;
        boolean oldNtfidESet = ntfidESet;
        ntfid = NTFID_EDEFAULT;
        ntfidESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ImmPackage.RDN_DEF__NTFID, oldNtfid, NTFID_EDEFAULT, oldNtfidESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNtfid() {
        return ntfidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ImmPackage.RDN_DEF__NAME:
                return getName();
            case ImmPackage.RDN_DEF__TYPE:
                return getType();
            case ImmPackage.RDN_DEF__CATEGORY:
                return getCategory();
            case ImmPackage.RDN_DEF__FLAG:
                return getFlag();
            case ImmPackage.RDN_DEF__NTFID:
                return getNtfid();
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
            case ImmPackage.RDN_DEF__NAME:
                setName((String)newValue);
                return;
            case ImmPackage.RDN_DEF__TYPE:
                setType((AttrValueType)newValue);
                return;
            case ImmPackage.RDN_DEF__CATEGORY:
                setCategory((Category)newValue);
                return;
            case ImmPackage.RDN_DEF__FLAG:
                getFlag().clear();
                getFlag().addAll((Collection<? extends AttrFlags>)newValue);
                return;
            case ImmPackage.RDN_DEF__NTFID:
                setNtfid((Long)newValue);
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
            case ImmPackage.RDN_DEF__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ImmPackage.RDN_DEF__TYPE:
                unsetType();
                return;
            case ImmPackage.RDN_DEF__CATEGORY:
                unsetCategory();
                return;
            case ImmPackage.RDN_DEF__FLAG:
                getFlag().clear();
                return;
            case ImmPackage.RDN_DEF__NTFID:
                unsetNtfid();
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
            case ImmPackage.RDN_DEF__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ImmPackage.RDN_DEF__TYPE:
                return isSetType();
            case ImmPackage.RDN_DEF__CATEGORY:
                return isSetCategory();
            case ImmPackage.RDN_DEF__FLAG:
                return flag != null && !flag.isEmpty();
            case ImmPackage.RDN_DEF__NTFID:
                return isSetNtfid();
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
        result.append(" (name: ");
        result.append(name);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(", category: ");
        if (categoryESet) result.append(category); else result.append("<unset>");
        result.append(", flag: ");
        result.append(flag);
        result.append(", ntfid: ");
        if (ntfidESet) result.append(ntfid); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //RdnDefImpl
