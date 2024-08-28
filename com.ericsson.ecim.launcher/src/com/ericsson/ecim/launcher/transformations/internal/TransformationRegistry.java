package com.ericsson.ecim.launcher.transformations.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.transformations.EcimExtensionException;
import com.ericsson.ecim.launcher.transformations.Transformation;

/**
 * Used to read Extension Registry Data related to the Transformation Extension Point com.ericsson.ecim.transformations
 *
 */
public final class TransformationRegistry {

    private static final String TRANSFORMATION_EXTENSION_ID = "com.ericsson.ecim.transformations";

    /**
     * This Class is not meant to be instantiated
     */
    private TransformationRegistry() {
    }

    /**
     * Reads and returns the Data from the Extension point com.ericsson.ecim.transformations
     * 
     * @return A List of TransformationData object, each representing an Extension to this point
     * @throws EcimExtensionException
     *             Only in the case an Exception hinders getting any data back
     */
    public static final List<TransformationData> getTransformationsFromRegistry() throws EcimExtensionException {
        IExtensionRegistry reg = Platform.getExtensionRegistry();
        IExtensionPoint extensionpoint = reg.getExtensionPoint(TRANSFORMATION_EXTENSION_ID);

        if (extensionpoint == null)
            throw new EcimExtensionException("Extension point \"" + TRANSFORMATION_EXTENSION_ID + "\" could not be found");

        List<TransformationData> allData = new ArrayList<TransformationData>();
        List<EcimExtensionException> exceptions = new ArrayList<EcimExtensionException>();
        loadTransformationExtensions(reg, allData, exceptions);
        // If an Exception stops us from getting any data out, throw the first
        // one down
        if (allData.isEmpty() && !exceptions.isEmpty()) {
            throw exceptions.get(0);
        }
        return allData;
    }

    private static void loadTransformationExtensions(IExtensionRegistry reg, List<TransformationData> allData, List<EcimExtensionException> exceptions)
            throws EcimExtensionException {
        IConfigurationElement[] extensions = reg.getConfigurationElementsFor(TRANSFORMATION_EXTENSION_ID);
        for (IConfigurationElement element : extensions) {
            // Each Transformation Registry Fetch is done protected, so that a
            // broken Extension doesn't break things for others
            try {
                // Getting Transformation Id
                String transformationId = getMandatoryAttribute(element, "transformationId", "Transformation Id cannot be empty");
                // Getting Transformation Name
                String transformationName = getMandatoryAttribute(element, "transformationName", "Transformation name may not be empty");
                
                Boolean checkedByDefault = false;
                checkedByDefault = Boolean.valueOf(element.getAttribute("checkedByDefault"));
                Boolean enabledForCmwModelMerge = false;
                enabledForCmwModelMerge = Boolean.valueOf(element.getAttribute("enabledForCmwModelMerge"));
                // Getting Transformation Class
                Object transformObject = element.createExecutableExtension("transformationClass");
                // Validating Class
                Transformation transformationClass = (Transformation) transformObject;

                // Getting Required Profiles List
                List<String> requiredProfilesList = getRequiredProfileList(element);
                // Nothing is expected of requiredProfiles, if none are defined,
                // an empty list will be returned
                TransformationData data = new TransformationData(transformationId, transformationName, transformationClass, checkedByDefault,
                        requiredProfilesList, enabledForCmwModelMerge);
                allData.add(data);
            } catch (CoreException e) {
                throw new EcimExtensionException("Error while instantiating Transformation Class", e);
            } catch (ClassCastException e) {
                throw new EcimExtensionException("Transformation Class not of required type: " + Transformation.class.getName(), e);
            } catch (EcimExtensionException e) {
                // If we get Exceptions of other types (RuntimeExcpetions), we
                // regard them as serious enough to abort
                exceptions.add(e);
                LauncherActivator.getDefault().getLog()
                        .log(new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, "Exception during Extension Registry reading", e));
            }
        }
    }

    private static String getMandatoryAttribute(IConfigurationElement element, String attributeName, String exceptionMsg) throws EcimExtensionException {
        String mandatoryAttr = element.getAttribute(attributeName).trim();
        // Validating attribute
        if (mandatoryAttr.isEmpty()) {
            throw new EcimExtensionException(exceptionMsg);
        }
        return mandatoryAttr;
    }

    private static List<String> getRequiredProfileList(IConfigurationElement element) {
        List<String> resultList = new ArrayList<String>();
        IConfigurationElement[] allRequiredProfiles = element.getChildren("requiredProfiles");
        // There should at most be one requiredProfiles Sequence
        for (IConfigurationElement requiredProfiles : allRequiredProfiles) {
            IConfigurationElement[] profiles = requiredProfiles.getChildren("profile");
            for (IConfigurationElement profile : profiles) {
                String profileName = profile.getAttribute("name").trim();
                if (!profileName.isEmpty()) {
                    resultList.add(profileName);
                }
            }
        }
        return resultList;
    }

    /**
     * Holds the Data for one Transformation Configuration
     *
     */
    public static final class TransformationData {
        private final String id;
        private final String name;
        private final Transformation transformation;
        private final boolean checkedByDefault;
        private boolean isForCmwModelMerge;
        private final List<String> requiredProfiles = new ArrayList<String>();

        /**
         * Construct an Object of Transformation Data
         * 
         * @param id
         *            Transformation id, must not be null
         * @param name
         *            Transformation name, may not be empty or null
         * @param transformation
         *            {@link Transformation} Object, must not be null
         * @param checkedByDefault
         *            indicates if this transformation is turned on by default in dialog
         * @param requiredProfiles
         *            List of required Profiles, may be empty, but not null
         */
        public TransformationData(String id, String name, Transformation transformation, boolean checkedByDefault, List<String> requiredProfiles,
                boolean isForCmwModelMerge) {
            this.id = id;
            this.name = name;
            this.transformation = transformation;
            this.checkedByDefault = checkedByDefault;
            this.requiredProfiles.addAll(requiredProfiles);
            this.isForCmwModelMerge = isForCmwModelMerge;
        }

        /**
         * Get the Id of the Transformation
         * 
         * @return The Transformation Id
         */
        public final String getId() {
            return id;
        }

        /**
         * Get the name of the Transformation
         * 
         * @return The Transformation name
         */
        public final String getName() {
            return name;
        }

        /**
         * Get the Transformation Class Object
         * 
         * @return An Object extending {@link Transformation}
         */
        public final Transformation getTransformation() {
            return transformation;
        }

        /**
         * Get a List of Profiles that are required for this Transformation
         * 
         * @return List of Profile names, may be empty, but not null
         */
        public final List<String> getRequiredProfiles() {
            // To avoid modification of the list, return a copy of it
            return new ArrayList<String>(requiredProfiles);
        }

        public final boolean isCheckedByDefault() {
            return checkedByDefault;
        }

        public boolean isForCmwModelMerge() {
            return isForCmwModelMerge;
        }

        public void setForCmwModelMerge(boolean isForCmwModelMerge) {
            this.isForCmwModelMerge = isForCmwModelMerge;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
