package com.ericsson.ecim.extensions.triggers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.emf.workspace.EMFOperationCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.extensions.ExtensionsActivator;

public final class InstanceStereotypeTrigger extends TriggerListener {

    private static final ILog ILOG = ExtensionsActivator.getDefault().getLog();

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        try {
            final InstanceSpecification is = TriggerUtil.getInstanceSpecification(notification);
            if (is == null) {
                return null;
            }

            final org.eclipse.uml2.uml.Class c = TriggerUtil.getUmlClass(notification, is);
            if (c == null) {
                return null;
            }

            final Stereotype instanceSpecification = TriggerUtil.getInstanceSpecificationStereotype(is, c);
            if (instanceSpecification == null)
                return null;

            return new EMFOperationCommand(domain, new InstanceTransactionalCommand(domain, "Auto-creating slots", is, instanceSpecification));
        } catch (Exception e) {
            ILOG.log(new Status(IStatus.ERROR, ExtensionsActivator.PLUGIN_ID, "Exception during Instance Stereotype Application Trigger execution evaluation",
                    e));
        }
        return null;
    }

    private static class InstanceTransactionalCommand extends AbstractTransactionalCommand {

        private InstanceSpecification is;
        private Stereotype instanceSpecification;

        public InstanceTransactionalCommand(TransactionalEditingDomain domain, String label, InstanceSpecification is, Stereotype instanceSpecification) {
            super(domain, label, null);
            this.is = is;
            this.instanceSpecification = instanceSpecification;
        }

        @Override
        protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
            try {
                is.applyStereotype(instanceSpecification);
            } catch (Exception e) {
                ILOG.log(new Status(IStatus.ERROR, ExtensionsActivator.PLUGIN_ID, "Exception during Instance Stereotype Application Trigger execution", e));
                return CommandResult.newWarningCommandResult("Trigger Execution caused Exception", null);
            }
            return CommandResult.newOKCommandResult();
        }
    }
}
