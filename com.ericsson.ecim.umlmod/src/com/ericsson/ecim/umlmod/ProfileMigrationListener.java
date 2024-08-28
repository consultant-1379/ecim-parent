package com.ericsson.ecim.umlmod;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.uml.Model;

/**
 * Handles notifications for profile applications by calling registered upgrade handler. An instance of this class, one
 * for each upgrader, should be registered early on using the org.eclipse.ui.startup extension point.
 */
public class ProfileMigrationListener extends ResourceSetListenerImpl {

    private static final Logger LOGGER = Logger.getLogger(ProfileMigrationListener.class);

    // A stack is used here since the latest model pushed before a profile notification is the one
    // that should be upgraded
    private Deque<Model> profileApplications = new LinkedList<Model>();
    private UmlUtilUpgrader upgrader;

    /**
     * Construction
     * 
     * @param upgrader
     *            the Upgrade utility to run
     */
    public ProfileMigrationListener(UmlUtilUpgrader upgrader) {
        this.upgrader = upgrader;
    }

    /**
     * Callback method that received events.
     */
    @Override
    public void resourceSetChanged(ResourceSetChangeEvent event) {

        List<Notification> notifications = event.getNotifications();

        for (Notification notif : notifications) {
            if (notif.getNewValue() == null) {
                continue;
            }
            
            Object o = notif.getNewValue();
            if (o instanceof Model) {
                Model m = (Model) o;
                upgrader.setModel(m);
                if (upgrader.isApplicable()) {
                    profileApplications.push(m);
                }
            } else if (o instanceof EPackage) {
                EPackage ep = (EPackage) o;
                migratePackage(ep);
            }
        }
    }

    private void migratePackage(EPackage ep) {
        if (profileNamesMatch(ep.getName(), upgrader.getProfileName())) {
            // received when new profile has applied!
            if (!profileApplications.isEmpty()) {
                Model model = profileApplications.pop();
                upgrader.setModel(model);
                if (!upgrader.hasAlreadyRun())
                    callModifier(upgrader);
            }
            profileApplications.clear();
        }
    }

    private boolean profileNamesMatch(String notifiedName, String upgraderName) {
        if (unifyString(notifiedName).contains(unifyString(upgraderName)))
            return true;
        return false;
    }

    private String unifyString(String s) {
        return s.replaceAll("\\s+", "").replaceAll("_", "").replaceAll("-", "").toLowerCase();
    }

    /**
     * Calls the upgrader in a write transaction.
     * 
     * @param upgrader
     * @throws CoreException
     */
    private void callModifier(final UmlUtilUpgrader upgrader) {
        Model model = upgrader.getModel();
        TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(model);
        if (ted == null) {
            LOGGER.error("TransactionEditingDomain not accessible. Model [" + model.getName() + "]");
            return;
        }
        ted.getCommandStack().execute(new RecordingCommand(ted) {
            @Override
            protected void doExecute() {
                upgrader.run();
            }
        });
    }
}
