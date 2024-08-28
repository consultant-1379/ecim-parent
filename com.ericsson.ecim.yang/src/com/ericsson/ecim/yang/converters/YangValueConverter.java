package com.ericsson.ecim.yang.converters;

import java.math.BigInteger;
import java.util.regex.Pattern;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.nodemodel.INode;

public class YangValueConverter extends DefaultTerminalConverters {

    @ValueConverter(rule = "OptionallyQuotedPossiblySignedNumber")
    public IValueConverter<Integer> possiblySignedNumber() {
        return new IValueConverter<Integer>() {
            @Override
            // This method sets the value when reading the model in
            public Integer toValue(String string, INode node) {
                return Integer.parseInt(adjustString(string));
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(Integer value) {
                return value.toString();
            }
        };
    }

    @ValueConverter(rule = "Integer")
    public IValueConverter<Integer> integer() {
        return new IValueConverter<Integer>() {
            @Override
            // This method sets the value when reading the model in
            public Integer toValue(String string, INode node) {
                return Integer.parseInt(adjustString(string));
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(Integer value) {
                return value.toString();
            }
        };
    }

    @ValueConverter(rule = "NonNegativeInteger")
    public IValueConverter<BigInteger> nonNegativeInteger() {
        return new IValueConverter<BigInteger>() {
            @Override
            // This method sets the value when reading the model in
            public BigInteger toValue(String string, INode node) {
                return BigInteger.valueOf(Long.parseLong(adjustString(string)));
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(BigInteger value) {
                return value.toString();
            }
        };
    }

    @ValueConverter(rule = "Boolean")
    public IValueConverter<Boolean> booleanValue() {
        return new IValueConverter<Boolean>() {
            @Override
            // This method sets the value when reading the model in
            public Boolean toValue(String string, INode node) {
                if (string == null)
                    return Boolean.FALSE;
                else {
                    return Boolean.valueOf(string.replaceAll("\"", ""));
                }
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(Boolean value) {
                if (value == null)
                    return null;
                return value.toString();
            }
        };
    }

    @ValueConverter(rule = "OptionallyQuotedName")
    public IValueConverter<String> optionallyQuotedName() {
        return new IValueConverter<String>() {

            @Override
            // This method sets the value when reading the model in
            public String toValue(String string, INode node) {
                return adjustString(string);
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(String value) {
                return addQuotesIfNotPresent(value);
            }
        };
    }

    @ValueConverter(rule = "OptionallyQuotedString")
    public IValueConverter<String> optionallyQuotedString() {
        return new IValueConverter<String>() {

            @Override
            // This method sets the value when reading the model in
            public String toValue(String string, INode node) {
                return adjustString(string);
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(String value) {
                return addQuotesIfNotPresent(value);
            }
        };
    }

    @ValueConverter(rule = "QuotedConcatenatedString")
    public IValueConverter<String> quotedConcatenatedString() {
        return new IValueConverter<String>() {

            @Override
            // This method sets the value when reading the model in
            public String toValue(String string, INode node) {
                return adjustString(string);
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(String value) {
                return addQuotesIfNotPresent(value);
            }
        };
    }

    @ValueConverter(rule = "ConcatenatedString")
    public IValueConverter<String> concatenatedString() {
        return new IValueConverter<String>() {

            @Override
            // This method sets the value when reading the model in
            public String toValue(String string, INode node) {
                return adjustString(string);
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(String value) {
                return addQuotesIfNotPresent(value);
            }
        };
    }

    @ValueConverter(rule = "QuotedConcatenatedStringNoDeviationKeywords")
    public IValueConverter<String> quotedConcatenatedStringNoDeviationKeywords() {
        return new IValueConverter<String>() {

            @Override
            // This method sets the value when reading the model in
            public String toValue(String string, INode node) {
                return adjustString(string);
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(String value) {
                return addQuotesIfNotPresent(value);
            }
        };
    }

    @ValueConverter(rule = "ConcatenatedStringNoDeviationKeywords")
    public IValueConverter<String> concatenatedStringNoDeviationKeywords() {
        return new IValueConverter<String>() {

            @Override
            // This method sets the value when reading the model in
            public String toValue(String string, INode node) {
                return adjustString(string);
            }

            @Override
            // This method sets the string when writing the model out
            public String toString(String value) {
                return addQuotesIfNotPresent(value);
            }
        };
    }

    /**
     * Method to remove quotes from string and also remove leading '+' if string contains only digits
     * 
     * @param string
     *            The string to adjust
     * @return The adjusted string
     */
    private String adjustString(String string) {
        if (string != null) {
            // De-concatenate string if it is quoted
            String stripped = string;
            if (Pattern.matches("^[\"|'].*", string)) {
                stripped = deConcenateString(string);
            }
            if (stripped.startsWith("+") && !Pattern.matches("[a-zA-Z]+", stripped.substring(1))) {
                // If pattern is a number starting with '+' then remove the '+'
                stripped = stripped.substring(1);
            }
            return stripped;
        }
        return null;
    }

    /**
     * Method to add qoutes to a string if they are not present already
     * 
     * @param string
     *            String to add quotes to
     * @return The string with added quotes
     */
    private String addQuotesIfNotPresent(String string) {
        if (string != null) {
            // add the quotes, do we need to consider string with or without
            // space?
            String stripped = string;
            if (!((stripped.startsWith("\"") && stripped.endsWith("\"")) || (stripped.startsWith("'") && stripped.endsWith("'"))))
                stripped = "\"" + stripped + "\"";
            return stripped;
        }
        return null;
    }

    /**
     * Method to deconcatenate a string
     * 
     * @param string
     *            String to deconcatenate
     * @return The deconcatenated string
     */
    private String deConcenateString(String string) {
        String returnString = string.trim();
        // Remove the head and tail quotes
        char startQuote = string.charAt(0);
        int lastQuoteIndex = string.lastIndexOf(startQuote);
        if (lastQuoteIndex == (string.length() - 1)) {
            returnString = string.substring(1, lastQuoteIndex);
        }
        // Remove '" + "' in concenate string
        if (returnString.matches("^.*[\"|\'][ \t]+[+][ \t]+[\"|\'].*$")) {
            returnString = returnString.replaceAll("[\"|\'][ \t]+[+][ \t]+[\"|\']", "");
        }
        return returnString;
    }
}
