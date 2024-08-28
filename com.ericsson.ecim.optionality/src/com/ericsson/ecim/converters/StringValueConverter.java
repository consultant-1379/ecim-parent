package com.ericsson.ecim.converters;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.nodemodel.INode;

public class StringValueConverter extends DefaultTerminalConverters {

    @ValueConverter(rule = "FQNSpaces")
    public IValueConverter<String> fqnSpaces() {
        return new IValueConverter<String>() {
            @Override
            public String toValue(String string, INode node) {
                if (string != null) {
                    // remove single and double quotes of they exist
                    return string.replaceAll("\\'", "").replaceAll("\\\"", "");
                }
                return null;
            }

            @Override
            public String toString(String value) {
                if (value != null) {
                    // add quotes if there is a space in the name
                    return value.contains(" ") ? '"' + value + '"' : value;
                }
                return null;
            }
        };
    }
}
