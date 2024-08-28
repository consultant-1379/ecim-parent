package com.ericsson.ecim.launcher.transformations.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry.TransformationData;
/**
 * @deprecated
 */
@Deprecated
public class TransformationSelectionDialog extends Dialog {

    private static Map<String, Boolean> savedSelectionStates = new HashMap<String, Boolean>();
    private Table transformationTable;
    private List<TransformationData> transformationsToRun = new ArrayList<TransformationData>();
    private Button okButton;

    /**
     * Create the dialog.
     * @param parentShell
     */
    private TransformationSelectionDialog(Shell parentShell, List<TransformationData> datas, Model model) {
        super(parentShell);
    }

    public List<TransformationData> getSelection() {
        return transformationsToRun;
    }

    /**
     * Create contents of the dialog.
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        GridLayout gridLayout = (GridLayout) container.getLayout();
        gridLayout.numColumns = 2;
        gridLayout.marginWidth = 8;
        gridLayout.marginHeight = 8;

        container.getShell().setText("Generate Artifacts");
        return container;
    }

    protected void checkAllTransformations(boolean check) {
        TableItem[] items = transformationTable.getItems();
        for (TableItem item : items) {
            item.setChecked(check);
        }
    }

    /**
     * Create contents of the button bar.
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        okButton = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        checkSelectionTable();
    }

    private void checkSelectionTable() {
        boolean enableOK = false;
        transformationsToRun.clear();
        TableItem[] items = transformationTable.getItems();
        for (TableItem item : items) {
            boolean itemChecked = item.getChecked();
            enableOK |= itemChecked;
            TransformationData data = (TransformationData) item.getData();
            savedSelectionStates.put(data.getName(), itemChecked);
            if (itemChecked) {
                transformationsToRun.add(data);
            }
        }
        okButton.setEnabled(enableOK);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(320, 360);
    }

}
