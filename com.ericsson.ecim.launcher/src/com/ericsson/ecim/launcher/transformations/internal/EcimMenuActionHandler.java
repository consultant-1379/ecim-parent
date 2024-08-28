package com.ericsson.ecim.launcher.transformations.internal;

import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.uml.helpers.SelectionHelper;

public abstract class EcimMenuActionHandler extends AbstractHandler {

    protected Shell shell;
    protected ISelection selection;

    protected Map<IFile, Model> fetchFromSelection(ISelection selection) throws URISyntaxException {
        return SelectionHelper.fetchFromSelection(selection);
    }
}
