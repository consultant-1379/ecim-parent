package com.ericsson.ecim.coremw.core.exceptions;

import com.ericsson.ecim.core.exceptions.EcimException;

@SuppressWarnings("serial")
public class CoreMwException extends EcimException { // NOSONAR

    public CoreMwException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoreMwException(String message) {
        super(message);
    }

    public CoreMwException(Throwable cause) {
        super(cause);
    }

}
