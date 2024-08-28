package com.ericsson.ecim.launcher.transformations.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.optionality.processor.Decision;
import com.ericsson.ecim.optionality.processor.Decisions;

public class OptionalityDecisionsPage extends WizardPage {

    private static Map<String, Boolean> savedSelectionStates = new HashMap<String, Boolean>();

    private Model inModel;
    private Table decisionsTable;
    private List<Decision> decisionsToRun = new ArrayList<Decision>();

    /**
     * Create the wizard.
     */
    public OptionalityDecisionsPage(Model model) {
        super("OptionnalityDecisionsPage");
        setTitle("Optionality Decisions");
        this.inModel = model;
    }

    public List<Decision> getSelection() {
        return decisionsToRun;
    }

    /**
     * Create contents of the wizard.
     * @param parent
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        setControl(container);
        container.setLayout(new GridLayout(2, false));

        Label decisionsLabel = new Label(container, SWT.NONE);
        decisionsLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        decisionsLabel.setText("Choose Optionality Decisions");

        decisionsTable = new Table(container, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION | SWT.MULTI);
        decisionsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
        decisionsTable.setHeaderVisible(true);
        decisionsTable.setLinesVisible(true);
        decisionsTable.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkSelectionTable();
            }
        });

        TableColumn momColumn = new TableColumn(decisionsTable, SWT.NONE);
        momColumn.setWidth(120);
        momColumn.setText("Mom");

        TableColumn decisionColumn = new TableColumn(decisionsTable, SWT.NONE);
        decisionColumn.setWidth(150);
        decisionColumn.setText("Decision");

        Button btnSelectAll = new Button(container, SWT.NONE);
        btnSelectAll.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkAllDecisions(true);
                checkSelectionTable();
            }
        });
        btnSelectAll.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        btnSelectAll.setText("Select All");

        Button btnDeselectAll = new Button(container, SWT.NONE);
        btnDeselectAll.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkAllDecisions(false);
                checkSelectionTable();
            }
        });
        btnDeselectAll.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        btnDeselectAll.setText("Deselect All");

        initialModel();
    }

    private void checkSelectionTable() {
        decisionsToRun.clear();
        TableItem[] items = decisionsTable.getItems();
        for (TableItem item : items) {
            boolean itemChecked = item.getChecked();
            Decision data = (Decision) item.getData();
            String decisionID = item.getText(0) + ":" + item.getText(1);
            savedSelectionStates.put(decisionID, itemChecked);
            if (itemChecked) {
                decisionsToRun.add(data);
            }
        }
    }

    private void initialModel() {
        setDescription("Select the target decisions for the given model. " + inModel.getName());
        List<Decision> decisionSet = Decisions.getDecisions(inModel);

        for (Decision decision : decisionSet) {
            // save the state of the folders as we need to restore it later
            String currentDecision = decision.getName();
            String currentMom = decision.getOwningMom().getName();
            String decisionID = currentMom + ":" + currentDecision;
            TableItem decisionItem = new TableItem(decisionsTable, SWT.NONE);
            decisionItem.setText(new String[] { currentMom, currentDecision });
            if (savedSelectionStates.get(decisionID) == null) {
                // first time set selection to true
                savedSelectionStates.put(decisionID, true);
            }
            if(savedSelectionStates.get(decisionID)) {
                decisionsToRun.add(decision);
            }
            decisionItem.setChecked(savedSelectionStates.get(decisionID));
            decisionItem.setData(decision);
        }
        checkSelectionTable();
    }

    private void checkAllDecisions(boolean check) {
        TableItem[] items = decisionsTable.getItems();
        for (TableItem item : items) {
            item.setChecked(check);
        }
    }

}
