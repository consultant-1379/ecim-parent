package com.ericsson.ecim.launcher.listeners;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.IStartup;

import com.ericsson.ecim.launcher.transformations.internal.UpgradeEcimModel;
import com.ericsson.ecim.umlmod.ProfileMigrationListener;

public class StartupListener implements IStartup {

    @Override
    public void earlyStartup() {
        // TODO Need to test behaviors
        TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain().addResourceSetListener(new ProfileMigrationListener(new UpgradeEcimModel()));
    }

}
