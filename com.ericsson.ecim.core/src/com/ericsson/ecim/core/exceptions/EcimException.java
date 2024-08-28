package com.ericsson.ecim.core.exceptions;

@SuppressWarnings("serial")
public class EcimException extends Exception {

    public EcimException(String message, Throwable cause) {
        super(message, cause);
    }

    public EcimException(String message) {
        super(message);
    }

    public EcimException(Throwable cause) {
        super(cause);
    }
}
