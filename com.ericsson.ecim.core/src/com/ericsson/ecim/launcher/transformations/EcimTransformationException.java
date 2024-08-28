package com.ericsson.ecim.launcher.transformations;

import org.eclipse.core.runtime.IStatus;

import com.ericsson.ecim.core.exceptions.EcimStatusException;
/**
 * Exception thrown when transformation fails.
 * @author xxxx
 *
 */
@SuppressWarnings("serial")
public class EcimTransformationException extends EcimStatusException {

    public EcimTransformationException(String message, IStatus status){
        super(message, status);
    }
    /**
     * This exception is/should be thrown when transformation fails.
     * @param message the detail message. The detail message is saved for later retrieval by the getMessage() method.
     * @param cause the cause (which is saved for later retrieval by the getCause() method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public EcimTransformationException(String message, Throwable cause) {
        super(message, cause);
    }
    /**
     * This exception is/should be thrown when transformation fails.
     * @param message the detail message. The detail message is saved for later retrieval by the getMessage() method.
     */
    public EcimTransformationException(String message) {
        super(message);
    }
    /**
     * This exception is/should be thrown when transformation fails.
     * @param cause the cause (which is saved for later retrieval by the getCause() method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public EcimTransformationException(Throwable cause) {
        super(cause);
    }

}
