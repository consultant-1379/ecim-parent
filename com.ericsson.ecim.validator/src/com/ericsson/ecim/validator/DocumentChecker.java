package com.ericsson.ecim.validator;

import org.eclipse.core.runtime.IStatus;
import org.w3c.dom.Document;

import com.ericsson.ecim.core.exceptions.EcimException;

public interface DocumentChecker {
    public IStatus checkDocument(Document doc) throws EcimException;
}
