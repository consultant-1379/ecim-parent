package com.ericsson.ecim.validator;

import java.util.Set;

class ErrorMessageContainer {
    private String duplicateName;
    private String errorMessage;

    public ErrorMessageContainer(String duplicateName, String errorMessage) {
        super();
        this.duplicateName = duplicateName;
        this.errorMessage = errorMessage;
    }
    
    static String getErrorMessageString(Set<ErrorMessageContainer> errorMessages) {
        String messages = null;
        for (ErrorMessageContainer emc : errorMessages) {
            if (messages == null)
                messages = emc.toString();
            else
                messages = messages + "\n" + emc.toString();
        }
        return messages;
    }

    public String getDuplicateName() {
        return duplicateName;
    }

    public void setDuplicateName(String duplicateName) {
        this.duplicateName = duplicateName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return errorMessage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ErrorMessageContainer))
            return false;
        ErrorMessageContainer emc = (ErrorMessageContainer) obj;
        return this.duplicateName.equals(emc.getDuplicateName());
    }

    @Override
    public int hashCode() {
        return this.duplicateName.hashCode();
    }
}