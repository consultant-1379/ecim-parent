package com.ericsson.ecim.launcher.transformations.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry.TransformationData;

/**
 * @deprecated
 */
@Deprecated
class TransformationDialog extends Dialog {

    private static Map<String, Boolean> savedCheckButtonStates = new HashMap<String, Boolean>();
    private Model inModel;
    private boolean okClicked = false;
    private List<TransformationData> allData;
    private final List<Button> checkButtons = new ArrayList<Button>();
    private List<TransformationData> transformationsToRun = new ArrayList<TransformationData>(
            checkButtons.size());
    private Button okButton;

    /**
     * InputDialog constructor
     * 
     * @param parent
     *            the parent
     * @param style
     *            the style
     */
    public TransformationDialog(Shell parent, List<TransformationData> allData,
            final Model inModel, int style) {
        // Let users override the default styles
        super(parent, style);
        this.inModel = inModel;
        this.allData = sortTransformationData(allData);
    }

    private boolean isOkClicked() {
        return okClicked;
    }

    private void setOkClicked(boolean okClicked) {
        this.okClicked = okClicked;
    }

    /**
     * This methods enables or disables the OK button based on the check buttons
     * statuses. It also saves the button state for the next run.
     */
    private void checkOkButton() {
        boolean noButtonIsChecked = true;
        for (Button checkButton : checkButtons) {
            boolean isOn = checkButton.isEnabled()
                    && checkButton.getSelection();
            savedCheckButtonStates.put(checkButton.getText(), isOn);
            if (isOn) {
                okButton.setEnabled(true);
                noButtonIsChecked = false;
            }
        }
        if (noButtonIsChecked)
            okButton.setEnabled(false);
    }

    /**
     * Returns the transformations that are selected to be run.
     */
    public List<TransformationData> getChecked() {
        return transformationsToRun;
    }

    /**
     * Sorts the transformation data objects by name.
     */
    private List<TransformationData> sortTransformationData(
            List<TransformationData> tds) {
        List<TransformationData> sortedTds = new ArrayList<TransformationData>();
        for (int i = 0; i < tds.size(); i++) {
            sortedTds.add(i, tds.get(i));
        }

        for (int i = 0; i < sortedTds.size(); i++) {
            for (int j = 0; j < sortedTds.size(); j++) {
                TransformationData tdi = sortedTds.get(i);
                TransformationData tdj = sortedTds.get(j);
                if (tdi.getName().compareTo(tdj.getName()) < 0) {
                    sortedTds.set(i, tdj);
                    sortedTds.set(j, tdi);
                }
            }
        }
        return sortedTds;
    }

    /**
     * Opens the dialog and returns the input
     */
    public boolean open() {
        Display display = getParent().getDisplay();
        final Shell shell = new Shell(display, SWT.MAX | SWT.MIN | SWT.CLOSE);
        shell.setSize(320, 320);
        shell.setText("Generate Artifacts");
        centreshell(shell, display);
        GridLayout gl = new GridLayout();
        gl.numColumns = 1;
        shell.setLayout(gl);

        final Label l1 = new Label(shell, SWT.NO_FOCUS);
        l1.setText("Choose Generator : ");
        GridData glc = new GridData();
        glc.horizontalAlignment = GridData.BEGINNING;
        l1.setLayoutData(glc);

        final ScrolledComposite sc = new ScrolledComposite(shell, SWT.BORDER
                | SWT.H_SCROLL | SWT.V_SCROLL);
        sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        Composite c = new Composite(sc, SWT.NONE);
        c.setLayout(new GridLayout(1, true));
        // Create table items for each transformation
        for (int i = 0; i < allData.size(); i++) {
            TransformationData dataItem = allData.get(i);
            Button check = new Button(c, SWT.CHECK);
            check.setText(dataItem.getName());
            check.setData(dataItem);
            checkButtons.add(check);
            check.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    checkOkButton();
                }
            });
            // Control if the profiles in the created model match with the
            // required profiles .
            // If yes, check the respective transformation on the table.
            // Otherwise, grey it out
            if (TransformationHelper.checkPackageMergable(inModel, dataItem.isForCmwModelMerge())) {
                if (TransformationHelper.checkRequiredProfiles(
                        inModel.getAllAppliedProfiles(),
                        dataItem.getRequiredProfiles())) {
                    check.setEnabled(true);
                    if (savedCheckButtonStates.get(check.getText()) == null) {
                        // first time set selection to true
                        savedCheckButtonStates.put(check.getText(),
                                dataItem.isCheckedByDefault());
                    }
                    check.setSelection(savedCheckButtonStates.get(check
                            .getText()));
                } else {
                    check.setEnabled(false);
                }
            } else {
                check.setEnabled(false);
            }
        }

        sc.setContent(c);
        sc.setExpandHorizontal(true);
        sc.setExpandVertical(true);
        sc.setMinSize(c.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        Listener listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                Control child = (Control) e.widget;
                Rectangle bounds = child.getBounds();
                Rectangle area = sc.getClientArea();
                Point origin = sc.getOrigin();
                if (origin.x > bounds.x)
                    origin.x = Math.max(0, bounds.x);
                if (origin.y > bounds.y)
                    origin.y = Math.max(0, bounds.y);
                if (origin.x + area.width < bounds.x + bounds.width)
                    origin.x = Math
                            .max(0, bounds.x + bounds.width - area.width);
                if (origin.y + area.height < bounds.y + bounds.height)
                    origin.y = Math.max(0, bounds.y + bounds.height
                            - area.height);
                sc.setOrigin(origin);
            }
        };
        Control[] controls = c.getChildren();
        for (int i = 0; i < controls.length; i++) {
            controls[i].addListener(SWT.Activate, listener);
        }
        // Create a RowLayout to insert the Cancel and OK Button
        Composite rc = new Composite(shell, SWT.NO_FOCUS);
        RowLayout rl = new RowLayout(SWT.HORIZONTAL);
        rl.marginLeft = 200;
        rl.marginWidth = 5;
        rc.setLayout(rl);

        // Create the OK button and add a handler
        // so that pressing it will set input
        // to the entered value
        okButton = new Button(rc, SWT.PUSH);
        okButton.setText("OK");
        okButton.setSize(25, 15);
        okButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                // Get a List with all the checked transformations
                for (Button button : checkButtons) {
                    if (button.getSelection()) {
                        transformationsToRun.add((TransformationData) button
                                .getData());
                    }
                }
                setOkClicked(true);
                shell.close();

            }
        });
        checkOkButton();

        // Create the CANCEL button and add a handler
        // so that pressing it will set input
        // to the entered value
        Button cancel = new Button(rc, SWT.PUSH);
        cancel.setText("Cancel");
        cancel.setSize(25, 15);
        cancel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                setOkClicked(false);
                shell.close();
            }
        });

        shell.open();
        display = getParent().getDisplay();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        return isOkClicked();

    }

    /**
     * Locates the shell in the center of the screen
     */
    public void centreshell(Shell shell, Display display) {
        Monitor primary = display.getPrimaryMonitor();
        Rectangle bounds = primary.getBounds();
        Rectangle rect = shell.getBounds();
        int x = bounds.x + (bounds.width - rect.width) / 2;
        int y = bounds.y + (bounds.height - rect.height) / 2;
        shell.setLocation(x, y);
    }
}
