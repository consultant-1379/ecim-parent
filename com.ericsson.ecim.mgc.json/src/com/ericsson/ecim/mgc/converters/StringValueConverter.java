package com.ericsson.ecim.mgc.converters;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class StringValueConverter extends DefaultTerminalConverters {

    @Override
    @ValueConverter(rule = "STRING")
    public IValueConverter<String> STRING() {
        return new IValueConverter<String>() {
            @Override
            public String toValue(String string, INode node) {
                if (string != null) {
                    try {
                        return Strings.convertFromJavaString(string.substring(1, string.length() - 1), true);
                    } catch (IllegalArgumentException e) {
                        throw new ValueConverterException(e.getMessage(), node, e);
                    }
                }
                return null;
            }

            @Override
            public String toString(String value) {
                if (value != null) {
                    return '"' + value.replaceAll("\\'", "'").replaceAll("\n", "\\\\n") + '"';
                }
                return null;
            }
        };
    }
}
