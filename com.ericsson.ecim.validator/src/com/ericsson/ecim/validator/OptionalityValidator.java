package com.ericsson.ecim.validator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.ericsson.ecim.optionality.Model;

/**
 * This class provides functions related to Optionality Constraint parsing.
 */
public class OptionalityValidator {

    private String constraint = null;

    public OptionalityValidator(String text) {
        constraint = text;
    }

    /**
     * Convert a text based Optionality Constraint to an XText model and try to parse
     * 
     * @return Model The Optionality Constraint as an XText/Ecore model
     * @throws EcimValidationException
     *             , IOException
     */
    // TODO: We need to return something in the exception to tell the user what constraint failed to parse
    public Model parse() throws EcimValidationException {
        // Convert the text into an instance of the optionality model
        URI resourceURI = URI.createURI("dummy:/inline.optionality");// the .optionality is needed to create the right
                                                                     // resource type
        XtextResourceSet resourceSet = new XtextResourceSet();
        XtextResource resource = (XtextResource) resourceSet.createResource(resourceURI);
        InputStream in = new ByteArrayInputStream(constraint.getBytes());
        try {
            // load the body text and parse to ensure it is well formed
            resource.load(in, null);
            if (resource.getParseResult().hasSyntaxErrors()) {
                String message = "Failed to parse optionality constraint expressions.";
                IStatus status = new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, message);
                throw new EcimValidationException(message, status);
            } else {
                if (!resource.getContents().isEmpty()) {
                    return (Model) resource.getContents().get(0);
                } else {
                    return null;
                }
            }
        } catch (IOException e) {
            throw new EcimValidationException(e.getMessage(), e);
        }
    }
}
