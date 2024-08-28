package com.ericsson.ecim.core.helpers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import com.ericsson.ecim.core.CoreActivator;

public class UIHelper {

    private UIHelper() {
    }

    public static void popupMessage(final String pluginID, final String title, final String message) {
        if (CoreActivator.isRunningHeadless()) {
            CoreActivator.getDefault().getLog().log(new Status(IStatus.INFO, pluginID, title + ":\n" + message));
        } else {
            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    MessageDialog.openInformation(null, title, message);
                }
            });
        }
    }

    public static void popupErrorMessage(final String pluginID, final String title, final String message) {
        if (CoreActivator.isRunningHeadless()) {
            CoreActivator.getDefault().getLog().log(new Status(IStatus.ERROR, pluginID, title + ":\n" + message));
        } else {
            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    MessageDialog.openError(null, title, message);
                }
            });
        }
    }
}
