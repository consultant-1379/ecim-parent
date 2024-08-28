package com.ericsson.ecim.validator;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecification;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.DataTypeChecker;
import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

/**
 * Checks that default values and instance slot values conform to its type.
 * 
 * @author erajaik
 * 
 */
public class InstanceValueChecker extends UmlUtilBase {

    private static final String REGEX_COMMA = "\\\\,";
    private static final String RANGE = "range";
    // maximum value to be use as infinity
    private static final String INT64_MAX_STR = "9223372036854775807";
    private static final BigInteger ZERO = new BigInteger("0");
    private static final BigInteger UINT8_MAX = new BigInteger("255");
    private static final BigInteger INT8_MIN = new BigInteger("-128");
    private static final BigInteger INT8_MAX = new BigInteger("127");
    private static final BigInteger UINT16_MAX = new BigInteger("65535");
    private static final BigInteger INT16_MIN = new BigInteger("-32768");
    private static final BigInteger INT16_MAX = new BigInteger("32767");
    private static final BigInteger UINT32_MAX = new BigInteger("4294967295");
    private static final BigInteger INT32_MIN = new BigInteger("-2147483648");
    private static final BigInteger INT32_MAX = new BigInteger("2147483647");
    private static final BigInteger UINT64_MAX = new BigInteger("18446744073709551615");
    private static final BigInteger INT64_MIN = new BigInteger("-9223372036854775808");
    private static final BigInteger INT64_MAX = new BigInteger(INT64_MAX_STR);
    private static final String INTEGER_VALUE = "Integer value";

    boolean allOK = true;

    public InstanceValueChecker(Model model) {
        super(model);
    }

    @Override
    public boolean isApplicable() {
        return true;
    }

    @Override
    public String toString() {
        return "Check default and instance values";
    }

    /**
     * Recursively checks the package w.r.t. instance values.
     * 
     * @param umlPackage
     */
    private void checkPackage(Package umlPackage, List<ErrorMessageContainer> errorMessages) {
        EList<Element> elements = umlPackage.getOwnedElements();
        for (Element e : elements) {
            if (e instanceof Class) {
                checkClass((Class) e, errorMessages);
            } else if (e instanceof InstanceSpecification) {
                checkInstanceSpecification((InstanceSpecification) e, errorMessages);
            } else if (e instanceof Package) {
                checkPackage((Package) e, errorMessages);
            }
        }
    }

    /**
     * Checks the class property defaults.
     * 
     * @param umlClass
     *            the UML class to check
     */
    private boolean checkClass(Class umlClass, List<ErrorMessageContainer> errorMessages) {
        boolean result = true;

        EList<Element> attributesOrActions = umlClass.getOwnedElements();
        for (Element e : attributesOrActions) {
            // checks whether or not element is a property
            if (e instanceof Property) {
                Property p = (Property) e;
                checkProperty(p, errorMessages);
            } else if (e instanceof Operation) {
                // checks whether or not element is an operation/ecimAction
                Operation op = (Operation) e;
                checkOperation(op, errorMessages);
            }
        }
        return result;
    }

    private void checkProperty(Property p, List<ErrorMessageContainer> errorMessages) {
        checkMultiplicityForDefault(p, errorMessages);

        String defaultValue = p.getDefault();
        if (defaultValue != null && !defaultValue.trim().isEmpty()) {
            checkValueTypeMain(p.getDefaultValue(), p.getType(), p.getUpper(), errorMessages);
            checkInlineDefaultValue(p, p.getUpper(), p.getDefault(), errorMessages);
        }
    }

    private void checkOperation(Operation op, List<ErrorMessageContainer> errorMessages) {
        EList<Element> parametersOrResult = op.getOwnedElements();
        for (Element opElement : parametersOrResult) {
            // checks whether or not element is a
            // parameter/ecimParameter
            checkParameters(opElement, errorMessages);
        }
    }

    private void checkParameters(Element opElement, List<ErrorMessageContainer> errorMessages) {
        if (opElement instanceof Parameter) {
            Parameter p = (Parameter) opElement;
            String defaultValue = p.getDefault();

            checkMultiplicityForDefault(p, errorMessages);

            if (defaultValue != null && !defaultValue.trim().isEmpty()) {
                checkValueTypeMain(p.getDefaultValue(), p.getType(), p.getUpper(), errorMessages);
                checkInlineDefaultValue(p, p.getUpper(), p.getDefault(), errorMessages);
            }
        }
    }

    /**
     * Checks instance specification slot values.
     * 
     * @param umlInstanceSpecification
     *            the UML instance specification to check
     * @throws EcimValidationException
     */
    private void checkInstanceSpecification(InstanceSpecification umlInstanceSpecification, List<ErrorMessageContainer> errorMessages) {

        EList<Slot> slots = umlInstanceSpecification.getSlots();
        for (Slot s : slots) {
            checkMultiplicityForSlot(s, errorMessages);

            for (ValueSpecification vs : s.getValues()) {
                checkValueTypeMain(vs, s.getDefiningFeature().getType(), s.getDefiningFeature().getUpper(), errorMessages);
            }
        }
    }

    private void checkMultiplicityForSlot(Slot s, List<ErrorMessageContainer> errorMessages) {
        int noOfValues = s.getValues().size();
        int lower = s.getDefiningFeature().getLower();
        int upper = s.getDefiningFeature().getUpper();

        // special case for single valued attributes where commas are not
        // interpreted as delimiter between values
        if (upper == 1)
            return;

        if (lower > noOfValues || ((upper < noOfValues) && upper != -1)) {
            ErrorMessageContainer emc = new ErrorMessageContainer(getNamedElement(s).getQualifiedName(), "Number of slot values (" + noOfValues
                    + ") does not match lower (" + lower + ") or upper bound (" + upper + ").");
            errorMessages.add(emc);
        }
    }

    private void checkMultiplicityForDefault(Property property, List<ErrorMessageContainer> errorMessages) {
        if (property.getDefaultValue() != null && property.getDefault() != null) {
            checkMultiplicityForDefault(property.getQualifiedName(), property.getDefault(), property.getLower(), property.getUpper(), errorMessages);
        }
    }

    private void checkMultiplicityForDefault(Parameter parameter, List<ErrorMessageContainer> errorMessages) {
        if (parameter.getDefaultValue() != null && parameter.getDefault() != null) {
            checkMultiplicityForDefault(parameter.getQualifiedName(), parameter.getDefault(), parameter.getLower(), parameter.getUpper(), errorMessages);
        }
    }

    private void checkMultiplicityForDefault(String name, String defaultValue, int lower, int upper, List<ErrorMessageContainer> errorMessages) {
        // special case for single valued attributes where commas are not
        // interpreted as delimiter between values
        if (upper == 1)
            return;

        String defaultWithoutEscapedCommas = defaultValue.replaceAll(REGEX_COMMA, "%%");
        String[] values = defaultWithoutEscapedCommas.split(",");
        int noOfValues = values.length;
        if (lower > noOfValues || ((upper < noOfValues) && upper != -1)) {
            ErrorMessageContainer emc = new ErrorMessageContainer(name, "Number of default values (" + noOfValues + ") does not match lower (" + lower
                    + ") or upper bound (" + upper + ").");
            errorMessages.add(emc);
        }
    }

    private void checkInlineDefaultValue(TypedElement typedElement, int upperValue, String defaultValue, List<ErrorMessageContainer> errorMessages) {
        final Stereotype attributeRWStereotype = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RW");
        final Stereotype attributeROStereotype = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RO");
        String ranges = "";

        if (typedElement.isStereotypeApplied(attributeRWStereotype)) {
            ranges = (String) typedElement.getValue(attributeRWStereotype, RANGE);
        } else if (typedElement.isStereotypeApplied(attributeROStereotype)) {
            ranges = (String) typedElement.getValue(attributeROStereotype, RANGE);
        }
        if (ranges != null && !ranges.isEmpty()) {
            String qualifiedName = typedElement.getQualifiedName();
            Type attributeType = typedElement.getType();
            String typeName = attributeType.getName();
            String[] values = splitValues(upperValue, defaultValue);
            if (values != null) {
                checkInlineData(qualifiedName, typeName, ranges, values, errorMessages);
            }
        }
    }

    private void checkInlineData(String qualifiedName, String typeName, String ranges, String[] values, List<ErrorMessageContainer> errorMessages) {
        for (String value : values) {
            try {
                if (typeName.matches("Ecim[U]?Int\\d{1,2}")) {
                    checkIntRange(qualifiedName, new BigInteger(value), ranges, errorMessages);
                } else if (typeName.matches("EcimInteger")) {
                    checkIntRange(qualifiedName, new BigInteger(value), ranges, errorMessages);
                } else if (typeName.matches("EcimFloat")) {
                    checkFloatRange(qualifiedName, new Float(value), ranges, errorMessages);
                }
            } catch (NumberFormatException e) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, typeName + " number value has invalid format '" + value + "'");
                errorMessages.add(emc);
            }
        }
    }

    /**
     * Helper method that returns the pattern for a UML type (if any).
     * 
     * @param type
     *            the UML Type
     * @return the pattern if type is an EcimDerivedString or null otherwise
     */
    private String getDerivedStringPattern(Type type) {
        final Stereotype derivedStringStereotype = getEcimBaseProfile().getOwnedStereotype("EcimDerivedString");

        if (type.isStereotypeApplied(derivedStringStereotype)) {
            Object o = type.getValue(derivedStringStereotype, "pattern");
            if (o != null) {
                String pattern = (String) o;
                if (pattern != "") {
                    return pattern;
                }
            }
        }
        return null;
    }

    /**
     * Helper method that returns a list with all enumeration literals.
     * 
     * @param enumeration
     *            the Enumeration
     * @return a list with all enumeration values or null otherwise
     */
    private List<EnumerationLiteral> getEnumerationValues(Enumeration enumeration) {
        final Stereotype enumerationStereotype = getEcimBaseProfile().getOwnedStereotype("EcimEnumeration");

        EList<EnumerationLiteral> enumLiterals = null;
        if (enumeration.isStereotypeApplied(enumerationStereotype)) {
            enumLiterals = enumeration.getOwnedLiterals();
        }

        return enumLiterals;
    }

    private void logError(String id, Exception e) {
        IStatus status = new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Type validation failed for: '" + id + "'", e);
        logger.log(status);
    }

    /**
     * Checks that value is an integer data type.
     * 
     */
    private void checkEcimIntType(String qualifiedName, Type type, List<ErrorMessageContainer> errorMessages, String value) {
        try {
            String typeName = DataTypeChecker.getParentDataType(type);
            BigInteger theIntegerValue = new BigInteger(value);
            boolean bitLengthOK = validateBitLength(typeName, theIntegerValue);
            if (!bitLengthOK) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, INTEGER_VALUE + " '" + value + "' does not fit into an " + type.getName());
                errorMessages.add(emc);
            } else {
                boolean rangeIsOK = validateInteger(typeName, theIntegerValue);
                if (!rangeIsOK) {
                    ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, INTEGER_VALUE + " '" + value + "' does not have correct range for an "
                            + type.getName());
                    errorMessages.add(emc);
                }
            }

            // checks if integer value is in the range provided in EcimProfile
            checkEcimDerivedIntInRange(qualifiedName, type, errorMessages, theIntegerValue);
        } catch (NumberFormatException nfe) {
            ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, INTEGER_VALUE + " has invalid format '" + value + "'");
            errorMessages.add(emc);
        }
    }

    private boolean validateBitLength(String typeName, BigInteger theIntegerValue) {
        int bitLength = theIntegerValue.bitLength();
        boolean bitLengthOK = true;
        if (typeName.matches("Ecim[U]?Int8") && bitLength > 8) {
            bitLengthOK = false;
        } else if (typeName.matches("Ecim[U]?Int16") && bitLength > 16) {
            bitLengthOK = false;
        } else if (typeName.matches("Ecim[U]?Int32") && bitLength > 32) {
            bitLengthOK = false;
        } else if (typeName.matches("Ecim[U]?Int64") && bitLength > 64) {
            bitLengthOK = false;
        }
        return bitLengthOK;
    }

    private boolean validateInteger(String typeName, BigInteger theIntegerValue) {
        boolean rangeIsOK = true;
        if (typeName.matches("EcimUInt8")) {
            rangeIsOK = validateInRange(theIntegerValue, ZERO, UINT8_MAX);
        } else if (typeName.matches("EcimInt8")) {
            rangeIsOK = validateInRange(theIntegerValue, INT8_MIN, INT8_MAX);
        } else if (typeName.matches("EcimUInt16")) {
            rangeIsOK = validateInRange(theIntegerValue, ZERO, UINT16_MAX);
        } else if (typeName.matches("EcimInt16")) {
            rangeIsOK = validateInRange(theIntegerValue, INT16_MIN, INT16_MAX);
        } else if (typeName.matches("EcimUInt32")) {
            rangeIsOK = validateInRange(theIntegerValue, ZERO, UINT32_MAX);
        } else if (typeName.matches("EcimInt32")) {
            rangeIsOK = validateInRange(theIntegerValue, INT32_MIN, INT32_MAX);
        } else if (typeName.matches("EcimUInt64")) {
            rangeIsOK = validateInRange(theIntegerValue, ZERO, UINT64_MAX);
        } else if (typeName.matches("EcimInt64") || typeName.matches("EcimInteger")) {
            rangeIsOK = validateInRange(theIntegerValue, INT64_MIN, INT64_MAX);
        }
        return rangeIsOK;
    }

    private boolean validateInRange(BigInteger theIntegerValue, BigInteger lowerBound, BigInteger upperBound) {
        return !(theIntegerValue.compareTo(lowerBound) < 0 || theIntegerValue.compareTo(upperBound) > 0);
    }

    /**
     * Checks that value is a float data type.
     * 
     */
    private void checkEcimFloatType(String qualifiedName, Type type, List<ErrorMessageContainer> errorMessages, String value) {
        try {
            // checks if value is a float.
            Float theFloatValue = new Float(value);

            // checks if float value is in the range provided in EcimProfile
            checkEcimDerivedFloatInRange(qualifiedName, type, errorMessages, theFloatValue);
        } catch (NumberFormatException nfe) {
            ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Float value has invalid format '" + value + "'");
            errorMessages.add(emc);
        }
    }

    /**
     * Checks that value is an enumeration data type.
     * 
     */
    private void checkEcimEnumerationType(String qualifiedName, Enumeration type, List<ErrorMessageContainer> errorMessages, String value) {

        // flag that tells whether a certain value is part of enumeration
        boolean invalidEnumLiteral = true;

        // get all enumeration literal that belong to enumeration
        List<EnumerationLiteral> enumLiterals = getEnumerationValues(type);

        // search for a matching enumeration literal
        for (Element e : enumLiterals) {
            EnumerationLiteral enumLiteral = (EnumerationLiteral) e;
            if (enumLiteral.getName().equals(value)) {
                // value exists in enumeration, skip further comparisons
                invalidEnumLiteral = false;
                break;
            }
        }

        // checks whether provided value is invalid, if so store error for
        // further report
        if (!enumLiterals.isEmpty() && invalidEnumLiteral) {

            ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Enumeration value '" + value + "' doesn't exist in " + type.getName());
            errorMessages.add(emc);
        }

        return;
    }

    /**
     * Checks that value is a boolean data type.
     * 
     */
    private void checkEcimBooleanType(String qualifiedName, List<ErrorMessageContainer> errorMessages, String value) {
        if (!value.matches("true|false")) {
            ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Boolean value must be 'true' or 'false' but was '" + value + "'");
            errorMessages.add(emc);
        }
    }

    /**
     * Checks that value is a valid string data type.
     * 
     */
    private void checkEcimStringPattern(String qualifiedName, Type type, List<ErrorMessageContainer> errorMessages, String value) {
        // get stringPattern, if there is one to apply
        String derivedStringPattern = getDerivedStringPattern(type);

        if (derivedStringPattern != null && !"\"\"".equals(value)) {
            String valueWithoutEscapedCommas = value.replaceAll(REGEX_COMMA, ",");

            if (!value.matches(derivedStringPattern) && !valueWithoutEscapedCommas.matches(derivedStringPattern)) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Value '" + value + "'"
                        + (!value.equals(valueWithoutEscapedCommas) ? " (nor '" + valueWithoutEscapedCommas + "')" : "") + " does not match pattern '"
                        + derivedStringPattern);
                errorMessages.add(emc);
            }
        }
    }

    /**
     * Checks that value is acceptable according to pattern and type.
     * 
     * @param value
     *            the value to be checked
     * @param type
     *            the type name (can be EcimString, EcimInt32 etc)
     * @param derivedStringPattern
     *            the pattern the value must comply with, can be null
     */
    private void checkValuesType(String qualifiedName, String[] values, Type type, int upperBound, List<ErrorMessageContainer> errorMessages) {
        // validates all values in the array
        for (String value : values) {
            if (value == null || value.isEmpty() || type == null) {
                continue;
            }
            checkSingleValue(qualifiedName, type, value, upperBound, errorMessages);
        }
    }

    private String checkSingleValue(String qualifiedName, Type type, String value, int upperBound, List<ErrorMessageContainer> errorMessages) {
        String typeName = DataTypeChecker.getParentDataType(type);
        if (typeName.matches("EcimString")) {
            // validate string patterns
            // restore back the escaped commas, except when the number
            // of elements is equal to one
            String checkedValue = value;
            if (upperBound > 1 || upperBound == -1) {
                checkedValue = value.replaceAll("%%", REGEX_COMMA);
            }
            checkEcimStringPattern(qualifiedName, type, errorMessages, checkedValue);
        } else if (typeName.matches("Ecim[U]?Int\\d{1,2}")) {
            // validate integers
            checkEcimIntType(qualifiedName, type, errorMessages, value);
        } else if (typeName.matches("EcimBoolean")) {
            // validate booleans
            checkEcimBooleanType(qualifiedName, errorMessages, value);
        } else if (typeName.matches("EcimFloat")) {
            // validate floats
            checkEcimFloatType(qualifiedName, type, errorMessages, value);
        } else if (type instanceof Enumeration) {
            // validate enumerations
            checkEcimEnumerationType(qualifiedName, (Enumeration) type, errorMessages, value);
        }
        return typeName;
    }

    /**
     * Checks that value is acceptable according to pattern and type.
     * 
     */
    private void checkValueTypeMain(ValueSpecification valueSpecification, Type typeSpecification, int upperBound, List<ErrorMessageContainer> errorMessages) {

        String qualifiedName = getNamedElement(valueSpecification).getQualifiedName();
        try {
            if (valueSpecification != null && typeSpecification != null) {
                String value = valueSpecification.stringValue();
                String type = typeSpecification.getName();

                if (typeSpecification instanceof Class && !(valueSpecification instanceof InstanceValue)) {
                    // The valueSpecification cannot be a string or integer in
                    // this case!
                    ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Instance value " + value + " does not match type " + type);
                    errorMessages.add(emc);
                }
                String[] values = splitValues(upperBound, value);
                if (values != null) {
                    checkValuesType(qualifiedName, values, typeSpecification, upperBound, errorMessages);
                }
            }
        } catch (Exception e) {
            ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, e.getMessage());
            logError(emc.toString(), e);
        }
    }

    private static String[] splitValues(int upperBound, String value) {
        // stores all values delimited by commas
        String[] values = null;
        if (value == null) {
            return values;
        }
        // special case when commas should be ignored as a delimiter
        if (upperBound == 1) {
            values = new String[1];
            values[0] = value;
        } else {
            // replace escaped commas with special delimiter
            String valuesWithoutEscapedCommas = value.replaceAll(REGEX_COMMA, "%%");
            values = valuesWithoutEscapedCommas.split(",");
        }
        return values;
    }

    /**
     * Checks that EcimDerivedInt value is in range
     * 
     */
    private void checkEcimDerivedIntInRange(String qualifiedName, Type type, List<ErrorMessageContainer> errorMessages, BigInteger theIntegerValue) {
        final Stereotype derivedIntStereotype = getEcimBaseProfile().getOwnedStereotype("EcimDerivedInteger");

        // checks if range parameter is defined, if not don't do anything
        if (type.isStereotypeApplied(derivedIntStereotype)) {
            String ranges = (String) type.getValue(derivedIntStereotype, RANGE);
            checkIntRange(qualifiedName, theIntegerValue, ranges, errorMessages);
        }
    }

    private void checkIntRange(String qualifiedName, BigInteger theIntegerValue, String ranges, List<ErrorMessageContainer> errorMessages) {
        if (ranges != null && ranges.length() >= 4) {
            boolean isWithinRange = isIntegerWithinRange(qualifiedName, theIntegerValue, ranges, errorMessages);
            if (!isWithinRange) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Integer value '" + theIntegerValue.intValue()
                        + "' is out of range, it should be within " + ranges);
                errorMessages.add(emc);
            }
        }
    }

    private boolean isIntegerWithinRange(String qualifiedName, BigInteger theIntegerValue, String ranges, List<ErrorMessageContainer> errorMessages) {
        boolean isWithinRange = false;
        String[] rangesArray = ranges.split(",");

        for (String range : rangesArray) {
            // it is safe to assume that the value is provided properly,
            // since the value has already been validated by MMA
            String[] rangeBoundaries = range.split("\\.\\.");
            String lowerbound = rangeBoundaries[0];
            String upperbound = rangeBoundaries[1];

            BigInteger minIntvalue = null;
            BigInteger maxIntvalue = null;
            try {
                minIntvalue = new BigInteger(lowerbound);
                // If the upperbound value is infinite, then assigns
                // upperbound with the maximum integer value
                maxIntvalue = new BigInteger("*".equals(upperbound) ? INT64_MAX_STR : upperbound);
            } catch (NumberFormatException e) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Invalid range defined: '" + ranges + "'. Please check the boundaries");
                errorMessages.add(emc);
                return false;
            }

            // be sure that boundaries values are ok
            if (minIntvalue.compareTo(maxIntvalue) > 0) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Invalid range [" + lowerbound + "," + upperbound
                        + "]. Please check the boundaries");
                errorMessages.add(emc);
                return false;
            }

            isWithinRange = isWithinRange || (theIntegerValue.compareTo(minIntvalue) >= 0 && theIntegerValue.compareTo(maxIntvalue) <= 0);
        }
        return isWithinRange;
    }

    /**
     * Checks that EcimDerivedFloat value is in range
     * 
     */
    private void checkEcimDerivedFloatInRange(String qualifiedName, Type type, List<ErrorMessageContainer> errorMessages, Float theFloatValue) {
        final Stereotype derivedFloatStereotype = getEcimBaseProfile().getOwnedStereotype("EcimDerivedFloat");

        // checks if range parameter is defined, if not don't do anything
        if (type.isStereotypeApplied(derivedFloatStereotype)) {
            String ranges = (String) type.getValue(derivedFloatStereotype, RANGE);
            checkFloatRange(qualifiedName, theFloatValue, ranges, errorMessages);
        }
    }

    private void checkFloatRange(String qualifiedName, Float theFloatValue, String ranges, List<ErrorMessageContainer> errorMessages) {
        if (ranges != null && ranges.length() >= 4) {
            boolean isWithinRange = isFloatWithinRange(qualifiedName, theFloatValue, ranges, errorMessages);
            if (!isWithinRange) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Float value '" + theFloatValue.floatValue()
                        + "' is out of range, it should be within " + ranges);
                errorMessages.add(emc);
            }
        }
    }

    private boolean isFloatWithinRange(String qualifiedName, Float theFloatValue, String ranges, List<ErrorMessageContainer> errorMessages) {
        boolean isWithinRange = false;
        String[] rangesArray = ranges.split(",");
        for (String range : rangesArray) {
            // it is safe to assume that the value is provided properly,
            // since the value has already been validated by MMA
            String[] rangeBoundaries = range.split("\\.\\.");
            String lowerbound = rangeBoundaries[0];
            String upperbound = rangeBoundaries[1];

            Float minFloatvalue = null;
            Float maxFloatvalue = null;
            try {
                minFloatvalue = new Float(lowerbound);
                // If the upperbound value is infinite, then
                // assigns upperbound with the maximum float value
                maxFloatvalue = new Float("*".equals(upperbound) ? Float.toString(Float.MAX_VALUE) : upperbound);
            } catch (NumberFormatException e) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Invalid range defined: '" + ranges + "'. Please check the boundaries");
                errorMessages.add(emc);
                return false;
            }

            // be sure that boundaries values are ok
            if (minFloatvalue.compareTo(maxFloatvalue) > 0) {
                ErrorMessageContainer emc = new ErrorMessageContainer(qualifiedName, "Invalid range [" + lowerbound + "," + upperbound
                        + "]. Please check the boundaries");
                errorMessages.add(emc);
                return false;
            }

            isWithinRange = isWithinRange || (theFloatValue.compareTo(minFloatvalue) >= 0 && theFloatValue.compareTo(maxFloatvalue) <= 0);
        }
        return isWithinRange;
    }

    private NamedElement getNamedElement(Element e) {
        if (e.getOwner() instanceof NamedElement) {
            return (NamedElement) e.getOwner();
        } else if (e.getOwner() instanceof Slot) {
            return ((Slot) e.getOwner()).getOwningInstance();
        }
        return null;
    }

    /**
     * Validates the model.
     * 
     * @return status if an error, null otherwise
     */
    private IStatus validateWithNoException(String[] expectedErrorMessages) {
        List<ErrorMessageContainer> errorMessages = new ArrayList<ErrorMessageContainer>();
        try {
            EList<Package> packages = model.getNestedPackages();
            for (Package umlPackage : packages) {
                checkPackage(umlPackage, errorMessages);
            }
        } catch (NullPointerException npe) {
            // lets just log and ignore
            IStatus status = new Status(IStatus.WARNING, UmlModActivator.PLUGIN_ID, "Ignoring NPE" + npe.getMessage(), npe);
            logger.log(status);
        }
        if (!errorMessages.isEmpty()) {
            String messages = getErrorMessageString(errorMessages);
            if (!ValidatorHelper.isExpectedErrors(expectedErrorMessages, messages)) {
                return new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Instance and default value checker failed:\n" + messages);
            }
        }
        return null;
    }

    private String getErrorMessageString(List<ErrorMessageContainer> errorMessages) {
        String messages = null;
        for (ErrorMessageContainer emc : errorMessages) {
            if (messages == null)
                messages = emc.toString();
            else
                messages = messages + "\n" + emc.toString();
        }
        return messages;
    }

    public void validate(String[] expectedErrorMessages) throws EcimException {
        IStatus status = validateWithNoException(expectedErrorMessages);
        if (status != null) {
            throw new EcimValidationException("Instance and default value checker failed.", status);
        }
    }

    /**
     * Runs the check.
     */
    @Override
    public void run() throws Exception {
        validate(null);
    }

    static class ErrorMessageContainer {
        private String qualifiedName;
        private String errorMessage;

        public ErrorMessageContainer(String qualifiedName, String errorMessage) {
            super();
            this.qualifiedName = qualifiedName;
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        @Override
        public String toString() {
            return qualifiedName + " (" + errorMessage + ")";
        }
    }
}
