package com.ericsson.ecim.launcher.transformations;

import com.ericsson.ecim.core.exceptions.EcimException;

@SuppressWarnings("serial")
public class EcimExtensionException extends EcimException { // NOSONAR
    
    /**
     * This exception is/should be thrown when extension fails.
     * @param message the detail message. The detail message is saved for later retrieval by the getMessage() method.
     * @param cause the cause (which is saved for later retrieval by the getCause() method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public EcimExtensionException(String message, Throwable cause) {
        super(message, cause);
    }
    /**
     * This exception is/should be thrown when extension fails.
     * @param message the detail message. The detail message is saved for later retrieval by the getMessage() method.
     */
    public EcimExtensionException(String message) {
        super(message);
    }
    /**
     * This exception is/should be thrown when extension fails.
     * @param cause the cause (which is saved for later retrieval by the getCause() method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public EcimExtensionException(Throwable cause) {
        super(cause);
    }
}
