package com.ericsson.ecim.launcher.adg.internal;

import java.io.File;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DiagramOptionsDialog extends TitleAreaDialog {

    private String diagramType;
    private String imageFormat;
    private Text filterFileText;
    private String filterFileTextString;
    private File parentFolder;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public DiagramOptionsDialog(Shell parentShell, File parentFolder) {
        super(parentShell);
        this.parentFolder = parentFolder;
        this.diagramType = "";
        this.imageFormat = "svg";
    }

    public File getFilterFile() {
        if (filterFileTextString != null)
            return new File(filterFileTextString);
        return null;
    }

    public String getDiagramType() {
        return diagramType;
    }

    public String getImageFormat() {
        return imageFormat;
    }

    @Override
    protected void configureShell(Shell aShell) {
        super.configureShell(aShell);
        aShell.setText("Automatic Diagram Generator");
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
        container.setLayout(new GridLayout(2, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        Composite container2 = new Composite(area, SWT.NONE);
        container2.setLayout(new GridLayout(1, false));
        GridData gdContainer2 = new GridData(GridData.FILL_BOTH);
        gdContainer2.heightHint = 63;
        container2.setLayoutData(gdContainer2);
        Group grpFilter = new Group(container2, SWT.NONE);
        grpFilter.setLayout(new GridLayout(2, false));
        GridData gdGrpFilter = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gdGrpFilter.heightHint = 104;
        grpFilter.setLayoutData(gdGrpFilter);
        grpFilter.setText("Filter File");
        filterFileText = new Text(grpFilter, SWT.BORDER);
        filterFileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        filterFileText.setBounds(0, 0, 76, 21);
        filterFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                filterFileTextString = filterFileText.getText();
            }
        });

        Button btnBrowse = new Button(grpFilter, SWT.NONE);
        btnBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                FileDialog fileDlg = new FileDialog(getShell());
                fileDlg.setFilterPath(parentFolder.getAbsolutePath());
                fileDlg.setFilterExtensions(new String[] { "*.xml" });
                String filePath = fileDlg.open();
                if (filePath != null) {
                    filterFileText.setText(filePath);
                    filterFileTextString = filePath;
                }
            }
        });
        btnBrowse.setText("Browse");

        Group grpDiagramType = new Group(container, SWT.NONE);
        grpDiagramType.setLayout(new GridLayout(1, false));
        GridData gdDiagramType = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gdDiagramType.heightHint = 104;
        grpDiagramType.setLayoutData(gdDiagramType);
        grpDiagramType.setText("Diagram Type");

        Button btnAll = new Button(grpDiagramType, SWT.RADIO);
        btnAll.setSelection(true);
        btnAll.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnAll.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                diagramType = "";
            }
        });
        btnAll.setText("All");

        Button btnBriefDiagram = new Button(grpDiagramType, SWT.RADIO);
        btnBriefDiagram.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                diagramType = "brief";
            }
        });
        btnBriefDiagram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnBriefDiagram.setText("Brief");

        Button btnDetailDiagram = new Button(grpDiagramType, SWT.RADIO);
        btnDetailDiagram.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                diagramType = "detail";
            }
        });
        btnDetailDiagram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnDetailDiagram.setText("Detail");

        Button btnOptional = new Button(grpDiagramType, SWT.RADIO);
        btnOptional.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnOptional.setText("Optional");
        btnOptional.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                diagramType = "optional";
            }
        });

        Group grpDiagramFormat = new Group(container, SWT.NONE);
        grpDiagramFormat.setLayout(new GridLayout(1, false));
        grpDiagramFormat.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        grpDiagramFormat.setText("Image Format");

        Button btnSvgDiagram = new Button(grpDiagramFormat, SWT.RADIO);
        btnSvgDiagram.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                imageFormat = "svg";
            }
        });
        btnSvgDiagram.setSelection(true);
        btnSvgDiagram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnSvgDiagram.setText("SVG");

        Button btnPngDiagram = new Button(grpDiagramFormat, SWT.RADIO);
        btnPngDiagram.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                imageFormat = "png";
            }
        });
        btnPngDiagram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnPngDiagram.setText("PNG");

        setTitle("Generate Diagrams");
        return area;
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(510, 386);
    }

}
