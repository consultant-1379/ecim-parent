package com.ericsson.ecim.launcher.umlutilities;

import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

public class ProfileMigrationUtility extends UmlUtilBase {
    
    private static final Logger LOGGER = Logger.getLogger(ProfileMigrationUtility.class);

    private static final String VERSION = "Version";
    private static final String PAPYRUS_VERSION = "PapyrusVersion";

    @Override
    public String toString() {
        return "Migrate profile to latest revision CLI";
    }

    @Override
    public boolean isApplicable() {
        return CoreActivator.isRunningHeadless();
    }

    @Override
    public void run() {
        LOGGER.info("Migrating profile for " + model.getName());
        this.upgradeModel();
    }

    private void upgradeModel() {
        TransactionalEditingDomain ted = getTransactionalEditingDomain();

        ted.getCommandStack().execute(new RecordingCommand(ted) {
            @Override
            protected void doExecute() {
                try {
                    recursiveMigrateProfileApplications(getModel());
                } catch (RuntimeException e) {
                    LOGGER.error("Migrating failed. " + e.getMessage(), e);
                }
            }
        });
        LOGGER.info("Persistent " + model.getName() + " resources");
        EList<Resource> resources = model.eResource().getResourceSet().getResources();
        for (Resource resource : resources) {
            try {
                if (resource.getURI().toString().startsWith("file:/")) {
                    LOGGER.info("Saving " + resource.getURI().toString());
                    resource.save(Collections.emptyMap());
                }
            } catch (Exception e) {
                LOGGER.warn(resource.getURI().toString() + " persistent failed.", e);
            }
        }
        LOGGER.info("Migration Done.");
    }

    /**
     * Migrates all profile applications only if they are not the latest
     * 
     * @param pack
     *            the org.eclipse.uml2.uml.Package to migrate
     */
    private void recursiveMigrateProfileApplications(Package pack) {
        for (ProfileApplication profileApp : pack.getAllProfileApplications()) {
            Profile appliedProfile = profileApp.getAppliedProfile();
            EPackage definition = appliedProfile.getDefinition();
            if (!profileApp.getAppliedDefinition().equals(definition)) {
                LOGGER.info("Migrate " + definition.getName() + " to " + definition.getNsURI());
                pack.applyProfile(appliedProfile);
            }
            EAnnotation currentAnnotation = profileApp.getEAnnotation(PAPYRUS_VERSION);
            if (currentAnnotation != null) {
                String currentVersion = currentAnnotation.getDetails().get(VERSION);
                EAnnotation latestAnnotation = definition.getEAnnotation(PAPYRUS_VERSION);
                String latestVersion = latestAnnotation.getDetails().get(VERSION);
                if (!currentVersion.equals(latestVersion)) {
                    LOGGER.info("Migrate " + definition.getName() + " from " + currentVersion + " to "
                            + latestVersion);
                    pack.applyProfile(appliedProfile);
                    profileApp.getEAnnotations().add(0, EcoreUtil.copy(latestAnnotation));
                }
            }
        }

        for (Element elem : pack.getOwnedElements()) {
            if (elem instanceof Package)
                recursiveMigrateProfileApplications((Package) elem);
        }
    }

}
