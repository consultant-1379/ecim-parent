package com.ericsson.ecim.umlmod;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.uml.helpers.SelectionHelper;

public class UmlModifierAction extends AbstractHandler implements IStructuredContentProvider, ILabelProvider {

    private static final String TRANSFORMATION_EXTENSION_ID = "com.ericsson.ecim.umlmod";

    private Shell shell;
    private ISelection selection;
    private List<UmlUtilBase> modifiers;

    public UmlModifierAction() {
    }

    public void callModifier(final UmlUtilBase modifier) throws InterruptedException {
        TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(modifier.getModel());
        Assert.isNotNull(ted);
        Assert.isNotNull(ted.getResourceSet());

        final CountDownLatch utilityLatch = new CountDownLatch(1);
        CommandStack commandStack = ted.getCommandStack();
        commandStack.addCommandStackListener(new CommandStackListener() {
            @Override
            public void commandStackChanged(EventObject arg0) {
                utilityLatch.countDown();
            }
        });

        commandStack.execute(new RecordingCommand(ted) {
            @Override
            protected void doExecute() {
                SafeRunner.run(modifier);
            }
        });

        utilityLatch.await();
        if (modifier.getException() == null) {
            modifier.postTxWork();
        }
    }

    @Override
    public Object[] getElements(Object inputElement) {
        if (modifiers != null)
            return modifiers.toArray();
        else
            return new Object[] {};
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        // Not Used
    }

    @Override
    public Image getImage(Object element) {
        return null;
    }

    @Override
    public String getText(Object element) {
        return element.toString();
    }

    @Override
    public void addListener(ILabelProviderListener listener) {
        // Not Used
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
        // Not Used
    }

    /**
     * @throws CoreException
     */
    static final List<UmlUtilBase> getRegisteredUmlModifiers(Model model, IFile modelFile) throws CoreException {
        List<UmlUtilBase> allData = new ArrayList<UmlUtilBase>();

        IExtensionRegistry reg = Platform.getExtensionRegistry();
        IExtensionPoint extensionpoint = reg.getExtensionPoint(TRANSFORMATION_EXTENSION_ID);

        if (extensionpoint == null)
            throw new CoreException(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Extension point \"" + TRANSFORMATION_EXTENSION_ID
                    + "\" could not be found"));

        IConfigurationElement[] extensions = reg.getConfigurationElementsFor(TRANSFORMATION_EXTENSION_ID);

        for (IConfigurationElement element : extensions) {
            Object modifierObject = element.createExecutableExtension("class");
            UmlUtilBase umlModifier = (UmlUtilBase) modifierObject;
            umlModifier.setModel(model);
            umlModifier.setModelFile(modelFile);
            if (umlModifier.isApplicable())
                allData.add(umlModifier);
        }

        return allData;
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
            selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
            shell = HandlerUtil.getActiveShellChecked(event);
            Map<IFile, Model> modelMap = SelectionHelper.fetchFromSelection(selection);
            IFile modelFile = modelMap.keySet().iterator().next();
            Model model = modelMap.get(modelFile);
            modifiers = getRegisteredUmlModifiers(model, modelFile);

            ListDialog dialog = new ListDialog(shell);
            dialog.setTitle("Select the UML Model Utility to run");
            dialog.setContentProvider(this);
            dialog.setLabelProvider(this);
            dialog.setInput(model);

            if (dialog.open() == ListDialog.OK && dialog.getResult().length == 1) {
                UmlUtilBase modifier = (UmlUtilBase) dialog.getResult()[0];
                boolean runTheUtility = true;
                if (modifier.getConfirmationMessage() != null) {
                    runTheUtility = MessageDialog.openConfirm(shell, modifier + " Confirmation", modifier.getConfirmationMessage());
                }
                if (runTheUtility) {
                    callModifier(modifier);
                    showModifierMessage(modifier);
                }
            }

        } catch (Exception e) { // NOSONAR
            MessageDialog.openError(shell, "UML Utility Error", e.toString()); // NOSONAR
        }

        return null;
    }

    private void showModifierMessage(UmlUtilBase modifier) {
        if (modifier.getException() == null) {
            MessageDialog.openInformation(shell, modifier + " Success", "The UML model utility completed successfully.");
        } else {
            MessageDialog.openError(shell, modifier + " Failure", modifier.getException().toString());
        }
    }

}
