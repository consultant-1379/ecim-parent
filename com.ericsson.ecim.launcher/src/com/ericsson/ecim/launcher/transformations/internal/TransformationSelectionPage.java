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
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry.TransformationData;
import com.ericsson.ecim.optionality.processor.Decision;
import com.ericsson.ecim.optionality.processor.Decisions;

import static com.ericsson.ecim.launcher.transformations.internal.TransformationHelper.checkPackageMergable;
import static com.ericsson.ecim.launcher.transformations.internal.TransformationHelper.checkRequiredProfiles;

public class TransformationSelectionPage extends WizardPage {

    private static Map<String, Boolean> savedSelectionStates = new HashMap<String, Boolean>();
    private Table transformationTable;
    private Model inModel;
    private List<TransformationData> allData;
    private List<TransformationData> transformationsToRun = new ArrayList<TransformationData>();

    /**
     * Create the wizard.
     */
    public TransformationSelectionPage(List<TransformationData> datas, Model model) {
        super("TransformationSelectionPage");
        this.inModel = model;
        this.allData = sortTransformationData(datas);
        setTitle("Transformation Selection");
        String description = "Select the target transformations for the " + model.getName() + " model.";
        if (hasDecisions(model)) {
            description += "\nThis model has optinality decisions. All decisions will be selected by default.\n";
        }
        setDescription(description);
    }

    public List<TransformationData> getSelection() {
        return transformationsToRun;
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        gridLayout.marginWidth = 8;
        gridLayout.marginHeight = 8;
        container.setLayout(gridLayout);

        Label indicationLabel = new Label(container, SWT.NONE);
        indicationLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        indicationLabel.setText("Choose Generator:");

        transformationTable = new Table(container, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION | SWT.MULTI);
        transformationTable.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkSelectionTable();
            }
        });
        GridData gdTransformationTable = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2);
        transformationTable.setLayoutData(gdTransformationTable);
        transformationTable.setLinesVisible(true);

        Button selectAllBtn = new Button(container, SWT.NONE);
        selectAllBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkAllTransformations(true);
                checkSelectionTable();
            }
        });
        selectAllBtn.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        selectAllBtn.setText("Select All");

        Button deselectAllBtn = new Button(container, SWT.NONE);
        deselectAllBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkAllTransformations(false);
                checkSelectionTable();
            }
        });
        deselectAllBtn.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        deselectAllBtn.setText("Deselect All");

        for (int i = 0; i < allData.size(); i++) {
            TransformationData dataItem = allData.get(i);
            if (checkPackageMergable(inModel, dataItem.isForCmwModelMerge())
                    && checkRequiredProfiles(inModel.getAllAppliedProfiles(), dataItem.getRequiredProfiles())) {
                createTransformationItem(dataItem);
            }
        }
        setControl(container);
    }

    private void createTransformationItem(TransformationData dataItem) {
        String transformationName = dataItem.getName();
        TableItem transformationItem = new TableItem(transformationTable, SWT.NONE);
        transformationItem.setText(dataItem.getName());
        transformationItem.setData(dataItem);
        if (savedSelectionStates.get(transformationName) == null) {
            // first time set selection to true
            savedSelectionStates.put(transformationName, dataItem.isCheckedByDefault());
        }
        if (savedSelectionStates.get(transformationName)) {
            transformationsToRun.add(dataItem);
        }
        transformationItem.setChecked(savedSelectionStates.get(transformationName));
    }

    @Override
    public boolean canFlipToNextPage() {
        boolean canFlip = super.canFlipToNextPage();
        boolean hasDecision = hasDecisions(inModel);
        return canFlip && hasDecision;
    }

    private boolean hasDecisions(Model model) {
        List<Decision> decisions = Decisions.getDecisions(model);
        return decisions != null && !decisions.isEmpty();
    }

    private void checkAllTransformations(boolean check) {
        TableItem[] items = transformationTable.getItems();
        for (TableItem item : items) {
            item.setChecked(check);
        }
    }

    /**
     * Sorts the transformation data objects by name.
     */
    private List<TransformationData> sortTransformationData(List<TransformationData> transforomData) {
        List<TransformationData> datas = new ArrayList<TransformationData>();
        for (int i = 0; i < transforomData.size(); i++) {
            datas.add(i, transforomData.get(i));
        }
        for (int i = 0; i < datas.size(); i++) {
            for (int j = 0; j < datas.size(); j++) {
                TransformationData tdi = datas.get(i);
                TransformationData tdj = datas.get(j);
                if (tdi.getName().compareTo(tdj.getName()) < 0) {
                    datas.set(i, tdj);
                    datas.set(j, tdi);
                }
            }
        }
        return datas;
    }

    private void checkSelectionTable() {
        boolean complete = false;
        transformationsToRun.clear();
        TableItem[] items = transformationTable.getItems();
        for (TableItem item : items) {
            boolean itemChecked = item.getChecked();
            complete |= itemChecked;
            TransformationData data = (TransformationData) item.getData();
            savedSelectionStates.put(data.getName(), itemChecked);
            if (itemChecked) {
                transformationsToRun.add(data);
            }
        }
        this.setPageComplete(complete);
    }

}
