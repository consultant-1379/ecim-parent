package com.ericsson.ecim.launcher.reverse;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.transformations.EcimExtensionException;

/**
 *
 */
public final class ReverseTransformationRegistry {

    private static final Logger LOGGER = Logger.getLogger(ReverseTransformationRegistry.class);

    private static final ILog ILOG = LauncherActivator.getDefault().getLog();

    private static final String REVERSE_EXTENSION_ID = "com.ericsson.ecim.reverse";

    private static ReverseTransformationRegistry registryInstance = null;

    private Map<String, ReverseTransformation> reverseTransformationMap;

    private ReverseTransformationRegistry() throws EcimExtensionException {
        reverseTransformationMap = new HashMap<String, ReverseTransformation>();

        IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
        IExtensionPoint extensionpoint = extensionRegistry.getExtensionPoint(REVERSE_EXTENSION_ID);

        if (extensionpoint == null) {
            throw new EcimExtensionException("Extension point \"" + REVERSE_EXTENSION_ID + "\" could not be found");
        }

        IConfigurationElement[] extensions = extensionRegistry.getConfigurationElementsFor(REVERSE_EXTENSION_ID);
        for (IConfigurationElement element : extensions) {
            // Each Transformation Registry Fetch is done protected, so that a
            // broken Extension doesn't break things for others
            registeReverseTransformation(element);
        }

    }

    private void registeReverseTransformation(IConfigurationElement element) {
        try {
            // Getting Transformation Id
            String reverseTransformationId = element.getAttribute("reverseTransformationId").trim();

            if (LOGGER.isDebugEnabled()) {
                // Getting Transformation Name
                String reverseTransformationName = element.getAttribute("reverseTransformationName").trim();
                LOGGER.debug(reverseTransformationId + ":" + reverseTransformationName);
            }

            // Validating id
            if (reverseTransformationId.isEmpty()) {
                throw new EcimExtensionException("Reverse Transformation Id cannot be empty");
            }

            // Getting Transformation Class
            Object reverseTransformObject = element.createExecutableExtension("reverseTransformationClass");
            // Validating Class
            reverseTransformationMap.put(reverseTransformationId, (ReverseTransformation) reverseTransformObject);
        } catch (CoreException e) {
            ILOG.log(new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, "Error while instantiating Reverse Transformation Class", e));
        } catch (ClassCastException e) {
            ILOG.log(new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, "Reverse Transformation Class not of required type: "
                    + ReverseTransformation.class.getName(), e));
        } catch (EcimExtensionException e) {
            // If we get Exceptions of other types (RuntimeExcpetions), we
            // regard them as serious enough to abort
            ILOG.log(new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, "Exception during Extension Registry reading", e));
        }
    }

    public static ReverseTransformationRegistry getInstance() {
        if (registryInstance == null) {
            try {
                registryInstance = new ReverseTransformationRegistry();
            } catch (EcimExtensionException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
        return registryInstance;
    }

    /**
     */
    public final ReverseTransformation getReverseTransformation(String reverseTransformationId) throws EcimExtensionException {
        return reverseTransformationMap.get(reverseTransformationId);
    }
}
