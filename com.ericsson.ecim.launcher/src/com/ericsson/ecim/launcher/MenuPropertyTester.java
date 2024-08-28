package com.ericsson.ecim.launcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;
import org.eclipse.uml2.uml.Model;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.edm.EDMActivator;
import com.ericsson.ecim.validator.ECIMValidator;
import com.ericsson.ecim.validator.EcimValidationException;

public class MenuPropertyTester extends org.eclipse.core.expressions.PropertyTester {

    private static final Logger LOGGER = Logger.getLogger(MenuPropertyTester.class);

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        boolean testResult = false;
        if (receiver instanceof java.util.List) {
            int count = ((java.util.List<?>) receiver).size();
            if (count == 0)
                return false;
            receiver = ((java.util.List<?>) receiver).get(0); // NOSONAR
        }
        if (receiver instanceof ISubResourceFile) {
            receiver = ((ISubResourceFile) receiver).getFile(); // NOSONAR
        }
        if ("isModel".equals(property))
            testResult = isModel(receiver);
        else if ("isMpXmlFile".equals(property))
            testResult = isMpXmlFile(receiver);
        else if ("isYangFile".equals(property))
            testResult = isYangFile(receiver);
        else if ("isMpXmlFolder".equals(property))
            testResult = isMpXmlFolder(receiver, true);
        else if ("isMultiMpXmlFolder".equals(property))
            testResult = isMpXmlFolder(receiver, false);
        else
            LOGGER.error("ERROR: Received unknown property!");

        return testResult;
    }

    /**
     * Checks if receiver is a Model.
     * 
     * @param receiver
     * @return
     */
    public boolean isModel(Object object) {
        EObject eObject = EMFHelper.getEObject(object);
        if (eObject != null) {
            return eObject instanceof Model;
        }
        return false;

    }

    /**
     * Checks if receiver is MP XML file.
     * 
     * @param receiver
     * @return
     */
    public boolean isMpXmlFile(Object receiver) {
        InputStream mpIS = getMpXmlInputStream(receiver);
        if (mpIS == null) {
            return false;
        }
        return validatesAgainstMpDtd(mpIS);
    }

    private InputStream getMpXmlInputStream(Object receiver) {
        try {
            if (receiver instanceof IFile && ((IFile) receiver).getName().endsWith("xml")) {
                return ((IFile) receiver).getContents();
            }
            if (receiver instanceof File && ((File) receiver).getName().endsWith("xml")) {
                return new FileInputStream((File) receiver);
            }
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
        return null;
    }

    public boolean isMpXmlFolder(Object receiver, boolean single) {
        if (receiver instanceof IFolder) {
            int fileNumber = 0;
            IFolder iFolder = (IFolder) receiver;
            IResource[] members = null;
            try {
                members = iFolder.members();
            } catch (CoreException e) {
                LOGGER.warn(e.getMessage(), e);
                members = new IResource[0];
            }
            for (IResource member : members) {
                if (member instanceof IFile && isMpXmlFile(member)) {
                    fileNumber++;
                }
                if (single && fileNumber == 1) {
                    return true;
                }
            }

            return fileNumber > 1;
        }
        return false;
    }

    /**
     * Checks if receiver is YANG file.
     * 
     * @param receiver
     * @return
     */
    public boolean isYangFile(Object receiver) {
        if (receiver instanceof IFile) {
            IFile iFile = (IFile) receiver;
            if (isYangModule(iFile)) {
                return !fileHasValidationErrors(iFile);
            }
        }
        return false;
    }

    /**
     * Returns true if file is yang file with a module, that is yang submodule files return false.
     * 
     * @param file
     * @return
     */
    public boolean isYangModule(IFile file) {
        try {
            if (!file.getName().toLowerCase().endsWith("yang"))
                return false;

            // Read selected file as YANG file
            ResourceSet resSet = new ResourceSetImpl();
            Resource resource = resSet.getResource(URI.createFileURI(file.getRawLocation().toFile().getCanonicalPath()), true);
            EObject eObj = resource.getContents().get(0);
            String topElementType = eObj.eClass().getName();
            return "module".equalsIgnoreCase(topElementType);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return false;
        }
    }

    /**
     * Checks if supplied file is according to mp.dtd.
     * 
     * @param iFile
     * @return
     */
    private boolean validatesAgainstMpDtd(InputStream mpInputStream) {
        ECIMValidator xmlValidator = new ECIMValidator();
        Bundle bundleEDM = EDMActivator.getDefault().getBundle();

        try {
            xmlValidator.validateAgainstDTD(mpInputStream, bundleEDM.getEntry("model/mp.dtd").openStream());
        } catch (EcimValidationException e) {
            // Lets accept for now the following error in MP dtd validation
            LOGGER.warn(e.getMessage(), e);
            return checkIfErrorOnlyContains(e.getStatus(), "The content of element type \"range\" must match");
        } catch (IOException e) {
            LOGGER.warn(e.getMessage(), e);
            return false;
        }
        return true;
    }

    /**
     * Checks if supplied status only has message matching supplied string.
     * 
     * @param status
     * @param msg
     * @return
     */
    private boolean checkIfErrorOnlyContains(IStatus status, String msg) {
        int noOfAcceptableErrorMessages = 0;

        for (IStatus child : status.getChildren()) {
            if (child.getMessage().contains(msg) || child.getMessage().contains("Failed to successfully validate XML resource"))
                noOfAcceptableErrorMessages++;

        }
        return status.getChildren().length > 0 && noOfAcceptableErrorMessages == status.getChildren().length;
    }

    /**
     * Method to check if file has any errors from validation
     * 
     * @param iFile
     *            The file to check
     * @return true if validation errors is found on the file
     */
    private boolean fileHasValidationErrors(IFile iFile) {
        boolean fileHasValidationErrors = true;
        try {
            fileHasValidationErrors = iFile.findMaxProblemSeverity(null, true, IFile.DEPTH_INFINITE) == IMarker.SEVERITY_ERROR;
        } catch (CoreException ce) {
            LOGGER.warn(ce.getMessage(), ce);
            return true;
        }
        return fileHasValidationErrors;
    }

}