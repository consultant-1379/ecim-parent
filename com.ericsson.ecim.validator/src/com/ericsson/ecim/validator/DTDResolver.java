package com.ericsson.ecim.validator;

import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DTDResolver implements EntityResolver {
    
    private InputStream inputStream;
    
    public DTDResolver(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    
    @Override
    public InputSource resolveEntity(String publicId, String systemId)
            throws SAXException, IOException {
        if (systemId.contains(".dtd")) {
            return new InputSource(this.inputStream);
        }
        else {
            return null;
        }
    }
}
