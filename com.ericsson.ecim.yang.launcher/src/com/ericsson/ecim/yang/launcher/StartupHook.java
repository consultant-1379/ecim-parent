package com.ericsson.ecim.yang.launcher;

import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.ericsson.ecim.yang.launcher.listeners.YangSelectionListener;

public class StartupHook implements IStartup {

    private ISelectionListener yangSelectionListener = null;

    @Override
    public void earlyStartup() {
        yangSelectionListener = new YangSelectionListener(); 

        final IWorkbench workbench = PlatformUI.getWorkbench();
        workbench.addWindowListener(new IWindowListener() {
            @Override
            public void windowOpened(IWorkbenchWindow window) {
                addSelectionListener(window);
            }
            @Override
            public void windowClosed(IWorkbenchWindow window) {
                removeSelectionListener(window);
            }
            @Override
            public void windowActivated(IWorkbenchWindow window) {
                // Nothing to implement
            }
            @Override
            public void windowDeactivated(IWorkbenchWindow window) {
                // Nothing to implement
            }
        });

        workbench.getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
                for (IWorkbenchWindow window : workbench.getWorkbenchWindows()) {
                    addSelectionListener(window);
                }
            }
        });
    }

    private void addSelectionListener(IWorkbenchWindow window) {
        if (window != null) {
            window.getSelectionService().addSelectionListener(yangSelectionListener);
        }
    }

    private void removeSelectionListener(IWorkbenchWindow window) {
        if (window != null) {
            window.getSelectionService().removeSelectionListener(yangSelectionListener);
        }
    }

}