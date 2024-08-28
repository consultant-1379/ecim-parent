/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import com.ericsson.yang.AbstractModule;
import com.ericsson.yang.Bit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import com.ericsson.yang.DataType;
import com.ericsson.yang.NamedElement;
import com.ericsson.yang.Prefix;
import com.ericsson.yang.Range;
import com.ericsson.yang.YANGPackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataTypeImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataTypeImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends TypeImpl implements DataType {
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
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
    protected Prefix prefix;

    /**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
    protected static final String LENGTH_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
    protected String length = LENGTH_EDEFAULT;

    /**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
    protected EList<String> pattern;

    /**
	 * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFractionDigits()
	 * @generated
	 * @ordered
	 */
    protected static final int FRACTION_DIGITS_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFractionDigits()
	 * @generated
	 * @ordered
	 */
    protected int fractionDigits = FRACTION_DIGITS_EDEFAULT;

    /**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
    protected Range range;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DataTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.DATA_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Prefix getPrefix() {
		if (prefix != null && prefix.eIsProxy()) {
			InternalEObject oldPrefix = (InternalEObject)prefix;
			prefix = (Prefix)eResolveProxy(oldPrefix);
			if (prefix != oldPrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YANGPackage.DATA_TYPE__PREFIX, oldPrefix, prefix));
			}
		}
		return prefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Prefix basicGetPrefix() {
		return prefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPrefix(Prefix newPrefix) {
		Prefix oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_TYPE__PREFIX, oldPrefix, prefix));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLength() {
		return length;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_TYPE__LENGTH, oldLength, length));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Range getRange() {
		return range;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.DATA_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.DATA_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_TYPE__RANGE, newRange, newRange));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getPattern() {
		if (pattern == null) {
			pattern = new EDataTypeUniqueEList<String>(String.class, this, YANGPackage.DATA_TYPE__PATTERN);
		}
		return pattern;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getFractionDigits() {
		return fractionDigits;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFractionDigits(int newFractionDigits) {
		int oldFractionDigits = fractionDigits;
		fractionDigits = newFractionDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_TYPE__FRACTION_DIGITS, oldFractionDigits, fractionDigits));
	}

    /**
     * If the min and max of a range are the same just use one of them as Yang will not allow ranges like 1..1
     * @generated NOT
     */
    public String compressRange(String oldRange) {
        if (oldRange != null)
        {
            String compressedRange = "";
            String [] splitRange = oldRange.split(",");
            
            for(int i=0;i<splitRange.length;i++)
            {
                String [] range = splitRange[i].split("\\.\\.");
                if(range[0].equals(range[1]))//if the min=max then just return the min
                {
                    compressedRange = compressedRange.concat(range[0]);//compress the range
                }
                else
                {
                    compressedRange = compressedRange.concat(range[0]+".."+range[1]);//put the range back as it was before
                }
                
                //put the splitting comma back in, except for the same iteration
                if(i<splitRange.length-1)
                {
                    //Yang wants pipes not commas so swap them here
                    compressedRange = compressedRange.concat("|");
                }
            }
            return compressedRange;            
        }
        else
            return null;
    }

    /**
     * Convert a resolution into a Yang fractionalDigit value. The resolution should be a value like 0.2 or 0.33 where resolution would be 1 and 2 respectively
     * Note: We do not support multi resolutions
     * @generated NOT
     */
    public int computeFractionDigits(String resolution) {
        String [] resolutionSplit = resolution.split("\\.");
        if(resolutionSplit.length > 1)
        {
            return resolutionSplit[1].length();
        }
        else
        {
            return 1;//no reasonable value was found so default to 1
        }
    }
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertLocalPathToOriginalPath() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertLocalPathToOriginalPath(String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertLocalPathToOriginalPath(String currentPos, String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean comparePathIgnoringNs(String a, String b) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.DATA_TYPE__RANGE:
				return basicSetRange(null, msgs);
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
			case YANGPackage.DATA_TYPE__NAME:
				return getName();
			case YANGPackage.DATA_TYPE__PREFIX:
				if (resolve) return getPrefix();
				return basicGetPrefix();
			case YANGPackage.DATA_TYPE__LENGTH:
				return getLength();
			case YANGPackage.DATA_TYPE__PATTERN:
				return getPattern();
			case YANGPackage.DATA_TYPE__FRACTION_DIGITS:
				return getFractionDigits();
			case YANGPackage.DATA_TYPE__RANGE:
				return getRange();
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
			case YANGPackage.DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case YANGPackage.DATA_TYPE__PREFIX:
				setPrefix((Prefix)newValue);
				return;
			case YANGPackage.DATA_TYPE__LENGTH:
				setLength((String)newValue);
				return;
			case YANGPackage.DATA_TYPE__PATTERN:
				getPattern().clear();
				getPattern().addAll((Collection<? extends String>)newValue);
				return;
			case YANGPackage.DATA_TYPE__FRACTION_DIGITS:
				setFractionDigits((Integer)newValue);
				return;
			case YANGPackage.DATA_TYPE__RANGE:
				setRange((Range)newValue);
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
			case YANGPackage.DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case YANGPackage.DATA_TYPE__PREFIX:
				setPrefix((Prefix)null);
				return;
			case YANGPackage.DATA_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case YANGPackage.DATA_TYPE__PATTERN:
				getPattern().clear();
				return;
			case YANGPackage.DATA_TYPE__FRACTION_DIGITS:
				setFractionDigits(FRACTION_DIGITS_EDEFAULT);
				return;
			case YANGPackage.DATA_TYPE__RANGE:
				setRange((Range)null);
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
			case YANGPackage.DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case YANGPackage.DATA_TYPE__PREFIX:
				return prefix != null;
			case YANGPackage.DATA_TYPE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case YANGPackage.DATA_TYPE__PATTERN:
				return pattern != null && !pattern.isEmpty();
			case YANGPackage.DATA_TYPE__FRACTION_DIGITS:
				return fractionDigits != FRACTION_DIGITS_EDEFAULT;
			case YANGPackage.DATA_TYPE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case YANGPackage.DATA_TYPE__NAME: return YANGPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case YANGPackage.NAMED_ELEMENT__NAME: return YANGPackage.DATA_TYPE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", length: ");
		result.append(length);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", fractionDigits: ");
		result.append(fractionDigits);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
