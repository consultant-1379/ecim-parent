package com.ericsson.ecim.coremw.launcher.extension;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.IStartup;

import com.ericsson.ecim.umlmod.ProfileMigrationListener;

public class StartupListener implements IStartup {

    @Override
    public void earlyStartup() {
        // TODO Need to test backward compatibility
        TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain().addResourceSetListener(new ProfileMigrationListener(new UpgradeCoreMwModel()));
    }

}
