package com.ericsson.ecim.validator;

import org.eclipse.core.runtime.IStatus;

import com.ericsson.ecim.core.exceptions.EcimStatusException;

/**
 * Exception thrown when validation fails.
 * 
 * @author qmahsha
 *
 */
@SuppressWarnings("serial")
public class EcimValidationException extends EcimStatusException { // NOSONAR

    /**
     * This exception is/should be thrown when validation fails.
     * 
     * @param status
     *            the status with additional information regarding the validation that failed. Is saved for later
     *            retrieval by the getStatus() method.
     * @param message
     *            the detail message. The detail message is saved for later retrieval by the getMessage() method.
     * @param cause
     *            the cause (which is saved for later retrieval by the getCause() method). (A null value is permitted,
     *            and indicates that the cause is nonexistent or unknown.)
     */
    public EcimValidationException(String message, IStatus status) {
        super(message, status);
    }

    public EcimValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public EcimValidationException(String message) {
        super(message);
    }

    public EcimValidationException(Throwable cause) {
        super(cause);
    }
}