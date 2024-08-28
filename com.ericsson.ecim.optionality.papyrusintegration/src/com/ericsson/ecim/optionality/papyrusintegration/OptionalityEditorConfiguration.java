package com.ericsson.ecim.optionality.papyrusintegration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.uml.xtext.integration.DefaultXtextDirectEditorConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtext.resource.XtextResource;

import com.ericsson.ecim.ui.internal.OptionalityActivator;
import com.google.inject.Inject;
//Note: For this to work right now we must make the following class externally visible from the 
//plugin com.ericsson.yang.ui. This isn't strictly ok. We should be able to reference the ID
//in the com.ericsson.yang project instead
import com.google.inject.Injector;

public class OptionalityEditorConfiguration extends DefaultXtextDirectEditorConfiguration {

    static final String LANGUAGE = "Optionality";

    @Inject
    protected XtextResource fakeResource;

    /**
     * Clients may override to change style to {@link SWT}.MULTI
     */
    @Override
    public int getStyle() {
        return SWT.MULTI | SWT.WRAP;
    }

    @Override
    public Object preEditAction(Object editedObject) {
        if (editedObject instanceof Constraint) {
            Constraint constraint = (Constraint) editedObject;
            if (!(constraint.getSpecification() instanceof OpaqueExpression)) {
                String stringValue = constraint.getSpecification().stringValue();
                if ((stringValue != null) && (stringValue.length() > 0)) {
                    MessageDialog.openWarning(new Shell(), Messages.OptionalityEditorConfiguration_ExistingSpecification,
                            Messages.OptionalityEditorConfiguration_AlreadyContainsNonEmpty);
                }
            }
        }
        return super.preEditAction(editedObject);
    }

    @Override
    public String getTextToEdit(Object editedObject) {
        String value = ""; //$NON-NLS-1$
        ValueSpecification specification = null;
        if (objectToEdit instanceof Constraint) {
            specification = ((Constraint) objectToEdit).getSpecification();
        } else if (objectToEdit instanceof ValueSpecification) {
            specification = (ValueSpecification) objectToEdit;
        }
        if (specification != null) {
            if (specification instanceof LiteralString) {
                LiteralString literal = (LiteralString) specification;
                value = (literal.getValue() != null) ? literal.getValue() : "";
            } else if (specification instanceof OpaqueExpression) {
                value = handleOpaqueExpression((OpaqueExpression) specification);
            }
        }
        return value;
    }

    private String handleOpaqueExpression(OpaqueExpression opaqueExpression) {
        String value = "";
        int indexOfOCLBody = -1;
        for (int i = 0; i < opaqueExpression.getLanguages().size() && indexOfOCLBody == -1; i++) {
            if (opaqueExpression.getLanguages().get(i).equals(LANGUAGE)) {
                if (i < opaqueExpression.getBodies().size()) {
                    value += opaqueExpression.getBodies().get(i);
                }
                indexOfOCLBody = i;
            }
        }
        return value;
    }

    @Override
    public Injector getInjector() {
        return OptionalityActivator.getInstance().getInjector(OptionalityActivator.COM_ERICSSON_ECIM_OPTIONALITY);
    }

    @Override
    public IParser createParser(final EObject semanticObject) {
        if (objectToEdit == null) {
            objectToEdit = semanticObject;
        }
        final IParser defaultParser = super.createParser(semanticObject);
        // use a semantic parser to assure refresh after opaque expression changes, see bug 400077
        return new SemanticParser(semanticObject, defaultParser);
    }

    @Override
    protected ICommand getParseCommand(EObject umlObject, EObject xtextObject) {
        // this operation is never called, since the parser above will not call it.
        return UnexecutableCommand.INSTANCE;
    }
}
