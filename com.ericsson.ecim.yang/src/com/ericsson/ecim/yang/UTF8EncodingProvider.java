package com.ericsson.ecim.yang;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.parser.IEncodingProvider;

public class UTF8EncodingProvider implements IEncodingProvider {

    @Override
    public String getEncoding(URI uri) {
        return "utf-8";
    }
}
