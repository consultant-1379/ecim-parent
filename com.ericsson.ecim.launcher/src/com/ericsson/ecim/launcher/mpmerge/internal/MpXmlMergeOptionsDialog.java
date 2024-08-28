package com.ericsson.ecim.launcher.mpmerge.internal;

import static com.ericsson.ecim.tools.MpXmlMerge.APPROVEDBY_OPT;
import static com.ericsson.ecim.tools.MpXmlMerge.CREATEDBY_OPT;
import static com.ericsson.ecim.tools.MpXmlMerge.DOCDATE_OPT;
import static com.ericsson.ecim.tools.MpXmlMerge.DOCLANG_OPT;
import static com.ericsson.ecim.tools.MpXmlMerge.DOCNUM_OPT;
import static com.ericsson.ecim.tools.MpXmlMerge.DOCREV_OPT;
import static com.ericsson.ecim.tools.MpXmlMerge.SUBTITLE_OPT;
import static com.ericsson.ecim.tools.MpXmlMerge.TITLE_OPT;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import com.ericsson.ecim.tools.MpXmlMerge;

public class MpXmlMergeOptionsDialog extends TitleAreaDialog {

    private Text outputFileText;
    private Text momTitleText;
    private Text momSubtitleText;
    private Text numberText;
    private Text revisionText;
    private Table table;

    private List<File> inputMpXmlFiles;
    private Map<String, String> momMetaData;
    private List<File> selectedMpXmlFiles;
    private File outputFile;
    private Button okBtn;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public MpXmlMergeOptionsDialog(Shell parentShell, List<File> inputFiles) {
        super(parentShell);
        this.inputMpXmlFiles = inputFiles;
        this.selectedMpXmlFiles = new ArrayList<File>();
        this.momMetaData = new HashMap<String, String>();

        momMetaData.put(TITLE_OPT, "MergedModel");
        momMetaData.put(SUBTITLE_OPT, "");
        momMetaData.put(DOCNUM_OPT, "0");
        momMetaData.put(DOCREV_OPT, "0");

        String userName = System.getProperty("user.name", MpXmlMerge.class.getSimpleName());
        momMetaData.put(CREATEDBY_OPT, userName);
        momMetaData.put(APPROVEDBY_OPT, "");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        momMetaData.put(DOCDATE_OPT, dateFormat.format(date));
        momMetaData.put(DOCLANG_OPT, "English");
    }

    public Map<String, String> getMergeOptions() {
        return momMetaData;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public List<File> getSelectedFiles() {
        return selectedMpXmlFiles;
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        
        shell.setText("MP XML Merge");
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(1, false));
        GridData gdContainer = new GridData(GridData.FILL_BOTH);
        gdContainer.grabExcessVerticalSpace = false;
        container.setLayoutData(gdContainer);

        Group grpMpXmlFiles = new Group(container, SWT.NONE);
        grpMpXmlFiles.setText("Files to be merged");
        grpMpXmlFiles.setLayout(new GridLayout(1, false));
        grpMpXmlFiles.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

        TableViewer tableViewer = createTableViewer(grpMpXmlFiles);

        Group grpOutput = new Group(container, SWT.NONE);
        grpOutput.setText("Output File");
        grpOutput.setLayout(new GridLayout(2, false));
        grpOutput.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

        outputFileText = new Text(grpOutput, SWT.BORDER);
        outputFileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        outputFileText.setBounds(0, 0, 76, 21);

        Button btnBrowse = new Button(grpOutput, SWT.NONE);
        btnBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                outputFile = null;
                FileDialog fileDlg = new FileDialog(getShell());
                fileDlg.setFileName("Merged_mp.xml");
                String filePath = fileDlg.open();
                if (filePath != null) {
                    outputFileText.setText(filePath);
                    outputFile = new File(filePath);
                }
                checkOKBtn();
            }
        });
        btnBrowse.setText("Browse");

        if (inputMpXmlFiles != null) {
            File[] inputMpXmlArray = inputMpXmlFiles.toArray(new File[inputMpXmlFiles.size()]);
            tableViewer.add(inputMpXmlArray);
            TableItem[] items = table.getItems();
            for (TableItem item : items) {
                item.setChecked(true);
            }
            String defaultOutputPath = inputMpXmlArray[0].getParent() + File.separator + "Merged_mp.xml";
            outputFileText.setText(defaultOutputPath);
            outputFile = new File(defaultOutputPath);
        }

        ModifyListener modifyListener = createModifyListener();
        outputFileText.addModifyListener(modifyListener);

        Group grpDocumentContent = new Group(container, SWT.NONE);
        grpDocumentContent.setText("Document Content");
        grpDocumentContent.setLayout(new GridLayout(2, false));
        grpDocumentContent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

        Label lblMomtitle = new Label(grpDocumentContent, SWT.NONE);
        lblMomtitle.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblMomtitle.setText("Mom Title:");

        momTitleText = new Text(grpDocumentContent, SWT.BORDER);
        momTitleText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        momTitleText.setText("MergedModel");
        momTitleText.addModifyListener(modifyListener);

        Label lblMomSubtitile = new Label(grpDocumentContent, SWT.NONE);
        lblMomSubtitile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblMomSubtitile.setText("Mom Subtitile:");

        momSubtitleText = new Text(grpDocumentContent, SWT.BORDER);
        momSubtitleText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        momSubtitleText.addModifyListener(modifyListener);

        Label lblDocumentNumber = new Label(grpDocumentContent, SWT.NONE);
        lblDocumentNumber.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblDocumentNumber.setText("Document Num.:");

        numberText = new Text(grpDocumentContent, SWT.BORDER);
        numberText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        numberText.setText("0");
        numberText.addModifyListener(modifyListener);

        Label lblDocumentRev = new Label(grpDocumentContent, SWT.NONE);
        lblDocumentRev.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblDocumentRev.setText("Document Rev.:");

        revisionText = new Text(grpDocumentContent, SWT.BORDER);
        revisionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        revisionText.setText("0");
        revisionText.addModifyListener(modifyListener);
        
        setTitle("Merge MP XML Files");

        return area;
    }

    private ModifyListener createModifyListener() {
        return new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                momMetaData.put(TITLE_OPT, momTitleText.getText().trim());
                momMetaData.put(SUBTITLE_OPT, momSubtitleText.getText().trim());
                momMetaData.put(DOCNUM_OPT, numberText.getText().trim());
                momMetaData.put(DOCREV_OPT, revisionText.getText().trim());

                String filePath = outputFileText.getText();
                if (filePath != null) {
                    outputFile = new File(filePath);
                }
                checkOKBtn();
            }
        };
    }

    private TableViewer createTableViewer(Group grpMpXmlFiles) {
        TableViewer tableViewer = new TableViewer(grpMpXmlFiles, SWT.CHECK | SWT.BORDER | SWT.FULL_SELECTION);
        table = tableViewer.getTable();
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        table.setBounds(0, 0, 85, 85);
        tableViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof File) {
                    return ((File) element).getName();
                }
                return super.getText(element);
            }
        });
        tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                checkOKBtn();
            }
        });
        return tableViewer;
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        okBtn = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        checkOKBtn();
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    private void checkOKBtn() {
        selectedMpXmlFiles.clear();
        TableItem[] items = table.getItems();
        for(TableItem item : items) {
            if(item.getChecked()) {
                selectedMpXmlFiles.add((File) item.getData());
            }
        }
        boolean okEnable = selectedMpXmlFiles.size() > 1 && outputFile != null;
        okBtn.setEnabled(okEnable);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(400, 510);
    }
}
