package com.ericsson.ecim.validator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SAXErrorHandler implements ErrorHandler {

    private MultiStatus status;
    private Boolean error;

    public SAXErrorHandler() {
        this.status = new MultiStatus(ValidatorActivator.PLUGIN_ID, 0, "SAXErrorHandler", null);
        error = false;
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        Status errorStatus = newStatus(exception, Status.ERROR, "**Parsing Error**");
        this.status.add(errorStatus);
        error = true;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        Status fatalStatus = newStatus(exception, Status.ERROR, "**Parsing Fatal Error**");
        this.status.add(fatalStatus);
        error = true;
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        Status warningStatus = newStatus(exception, Status.WARNING, "**Parsing Warning**");
        this.status.add(warningStatus);
    }

    private Status newStatus(final SAXParseException exception, final int level, final String exceptionTitle) {
        return new Status(level, ValidatorActivator.PLUGIN_ID, exceptionTitle + "  Line: " + exception.getLineNumber() + "  URI: " + exception.getSystemId()
                + "  Message: " + exception.getMessage());
    }

    public IStatus getStatus() {
        return status;
    }

    public Boolean getError() {
        return error;
    }

}
