package com.ericsson.ecim.core.exceptions;

import org.eclipse.core.runtime.IStatus;

@SuppressWarnings("serial")
public class EcimStatusException extends EcimException {

    private final IStatus status;  // NOSONAR

    public EcimStatusException(String message, IStatus status){
        super(message, status.getException());
        this.status = status;
    }

    public EcimStatusException(String message, Throwable cause){
        super(message, cause);
        this.status = null;
    }

    public EcimStatusException(String message){
        super(message);
        this.status = null;
    }

    public EcimStatusException(Throwable cause){
        super(cause);
        this.status = null;
    }

    public IStatus getStatus(){
        return this.status;
    }

    @Override
    public String getMessage() {
        if(this.status == null)
            return super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("\n");
        sb.append(status.getMessage());
        for(IStatus child : status.getChildren()){
            sb.append("\n");
            sb.append(child.getMessage());
        }

        return sb.toString();
    }
}
