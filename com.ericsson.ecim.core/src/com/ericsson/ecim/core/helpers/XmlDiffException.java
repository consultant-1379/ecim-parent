package com.ericsson.ecim.core.helpers;

import com.ericsson.ecim.core.exceptions.EcimException;

@SuppressWarnings("serial")
public class XmlDiffException extends EcimException {  // NOSONAR

    public XmlDiffException(String message) {
        super(message);
    }

    public XmlDiffException(Throwable cause) {
        super(cause);
    }

    public XmlDiffException(String message, Throwable cause) {
        super(message, cause);
    }

}
