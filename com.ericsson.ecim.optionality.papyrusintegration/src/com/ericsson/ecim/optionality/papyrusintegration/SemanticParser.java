package com.ericsson.ecim.optionality.papyrusintegration;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.papyrus.infra.emf.dialog.NestedEditingDialogContext;
import org.eclipse.papyrus.infra.services.validation.commands.AbstractValidateCommand;
import org.eclipse.papyrus.infra.services.validation.commands.AsyncValidateSubtreeCommand;
import org.eclipse.papyrus.uml.service.validation.UMLDiagnostician;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.UMLFactory;

class SemanticParser implements ISemanticParser {
    
    private EObject semanticObject;
    private IParser defaultParser;
    
    SemanticParser(EObject semanticObject, IParser defaultParser) {
        this.semanticObject = semanticObject;
        this.defaultParser = defaultParser;
    }
    
    @Override
    public String getEditString(IAdaptable element, int flags) {
        return defaultParser.getEditString(element, flags);
    }

    @Override
    public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
        // the superclass creates a comment, if validation fails. This is not useful in case of OCL,
        // since the OCL expression is already stored in opaque form within the constraint.
        CompositeCommand result = new CompositeCommand("validation"); //$NON-NLS-1$
        TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(semanticObject);
        boolean doValidation = editingDomain != null;
        if (editingDomain == null) {
            // can be null for opaque expression that have been created but have not been added to parent
            // try to get resource set from nested dialog context
            ResourceSet rs = NestedEditingDialogContext.getInstance().getResourceSet();
            editingDomain = TransactionUtil.getEditingDomain(rs);

        }
        if (semanticObject instanceof Constraint) {
            result.add(new UpdateConstraintCommand(editingDomain, (Constraint) semanticObject, newString));
        } else if (semanticObject instanceof OpaqueExpression) {
            result.add(new UpdateOpaqueExpressionCommand(editingDomain, (OpaqueExpression) semanticObject, newString));
        }
        if (doValidation) {
            final AbstractValidateCommand validationCommand = new AsyncValidateSubtreeCommand(semanticObject, new UMLDiagnostician());
            validationCommand.disableUIFeedback();
            result.add(validationCommand);
        }
        return result;
    }

    @Override
    public String getPrintString(IAdaptable element, int flags) {
        return defaultParser.getPrintString(element, flags);
    }

    @Override
    public boolean isAffectingEvent(Object event, int flags) {
        return false;
    }

    @Override
    public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
        // Not used
        return null;
    }

    @Override
    public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
        // Not used
        return null;
    }

    @Override
    public List<EObject> getSemanticElementsBeingParsed(EObject element) {
        // Add specification to list.
        List<EObject> list = new BasicEList<EObject>();
        if (element instanceof Constraint) {
            list.add(((Constraint) element).getSpecification());
        }
        return list;
    }

    @Override
    public boolean areSemanticElementsAffected(EObject listener, Object notification) {
        // always return true to assure refresh of semantic listeners
        return true;
    }

    /**
     * the command to save the content of an opaque expression
     * 
     */
    protected class UpdateOpaqueExpressionCommand extends AbstractTransactionalCommand {

        protected final OpaqueExpression opaqueExpression;

        protected final String newTextualRepresentation;

        public UpdateOpaqueExpressionCommand(TransactionalEditingDomain editingDomain, OpaqueExpression expression, String newTextualRepresentation) {
            super(editingDomain, "Opaque expression update", getWorkspaceFiles(expression)); //$NON-NLS-1$
            this.opaqueExpression = expression;
            this.newTextualRepresentation = newTextualRepresentation;
        }

        @Override
        protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1) throws ExecutionException {
            int indexOfOCLBody = -1;
            for (int i = 0; i < opaqueExpression.getLanguages().size() && indexOfOCLBody == -1; i++) {
                if (opaqueExpression.getLanguages().get(i).equals(OptionalityEditorConfiguration.LANGUAGE)) {
                    indexOfOCLBody = i;
                }
            }
            if (indexOfOCLBody == -1) {
                opaqueExpression.getLanguages().add(OptionalityEditorConfiguration.LANGUAGE);
                opaqueExpression.getBodies().add(newTextualRepresentation);
            } else if (indexOfOCLBody < opaqueExpression.getBodies().size()) { // might not be true, if body list is not
                                                                               // synchronized with language list
                opaqueExpression.getBodies().set(indexOfOCLBody, newTextualRepresentation);
            } else {
                opaqueExpression.getBodies().add(newTextualRepresentation);
            }
            return CommandResult.newOKCommandResult(opaqueExpression);
        }
    }

    /**
     * the command to save the content of the OCL constraint into the body of the UML constraint element
     * 
     */
    protected class UpdateConstraintCommand extends AbstractTransactionalCommand {

        protected final Constraint constraint;

        protected final String newTextualRepresentation;

        public UpdateConstraintCommand(TransactionalEditingDomain editingDomain, Constraint constraint, String newTextualRepresentation) {
            super(editingDomain, "Constraint Update", getWorkspaceFiles(constraint)); //$NON-NLS-1$
            this.constraint = constraint;
            this.newTextualRepresentation = newTextualRepresentation;
        }

        @Override
        protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1) throws ExecutionException {
            org.eclipse.uml2.uml.OpaqueExpression opaqueExpression = null;
            int indexOfOCLBody = -1;
            if (constraint.getSpecification() == null || !(constraint.getSpecification() instanceof org.eclipse.uml2.uml.OpaqueExpression)) {
                opaqueExpression = UMLFactory.eINSTANCE.createOpaqueExpression();
            } else {
                opaqueExpression = (org.eclipse.uml2.uml.OpaqueExpression) constraint.getSpecification();
                indexOfOCLBody = matchLanguageIndex(opaqueExpression);
            }
            if (indexOfOCLBody == -1) {
                opaqueExpression.getLanguages().add(OptionalityEditorConfiguration.LANGUAGE);
                opaqueExpression.getBodies().add(newTextualRepresentation);
            } else {
                opaqueExpression.getBodies().set(indexOfOCLBody, newTextualRepresentation);
            }
            constraint.setSpecification(opaqueExpression);

            return CommandResult.newOKCommandResult(constraint);
        }

        private int matchLanguageIndex(org.eclipse.uml2.uml.OpaqueExpression opaqueExpression) {
            for (int i = 0; i < opaqueExpression.getLanguages().size(); i++) {
                if (opaqueExpression.getLanguages().get(i).equals(OptionalityEditorConfiguration.LANGUAGE)) {
                    return i;
                }
            }
            return -1;
        }
    }

}
