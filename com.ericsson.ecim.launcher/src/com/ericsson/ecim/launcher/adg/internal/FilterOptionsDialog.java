package com.ericsson.ecim.launcher.adg.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Dialog to chose the ADG filter type.
 * 
 * @author erajaik
 *
 */
public class FilterOptionsDialog extends TitleAreaDialog {

    private FilterType filterType;
    private Text subtreeFilterText;
    private String[] subtreeFilter;
    private Button okButton;

    private final Display display = Display.getCurrent();
    private final Color errorColor = display.getSystemColor(SWT.COLOR_RED);
    private final Color warningColor = display.getSystemColor(SWT.COLOR_YELLOW);
    private final Color listBackground = display.getSystemColor(SWT.COLOR_LIST_BACKGROUND);

    private Set<String> validMocNames = new HashSet<String>();
    private Set<String> validMomNames = new HashSet<String>();
    private Map<String, String> mocName2MomName = new HashMap<String, String>();

    private enum FilterType {
        ALL, CLASS, SUBTREE
    }

    private enum MatchStatus {
        PERFECT, PARTIALLY, NONE
    }

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public FilterOptionsDialog(Shell parentShell) {
        super(parentShell);
        this.filterType = FilterType.ALL;
    }

    public String[] getSubtreeFilter() {
        return subtreeFilter;
    }

    public String getFilterType() {
        switch (filterType) {
        case CLASS:
            return "-class";
        case SUBTREE:
            return "-sub";
        default:
            return "-all";
        }
    }

    public Set<String> getValidMocNames() {
        return validMocNames;
    }

    public void setValidMocNames(Set<String> validMocNames) {
        this.validMocNames = validMocNames;
    }

    public Set<String> getValidMomNames() {
        return validMomNames;
    }

    public void setValidMomNames(Set<String> validMomNames) {
        this.validMomNames = validMomNames;
    }

    public Map<String, String> getMocName2MomName() {
        return mocName2MomName;
    }

    public void setMocName2MomName(Map<String, String> mocName2MomName) {
        this.mocName2MomName = mocName2MomName;
    }

    @Override
    protected void configureShell(Shell theShell) {
        super.configureShell(theShell);
        theShell.setText("Automatic Diagram Generator");
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
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        Group grpFilterType = new Group(container, SWT.NONE);
        grpFilterType.setLayout(new GridLayout(1, false));
        GridData gdGrpDiagramType = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gdGrpDiagramType.heightHint = 104;
        grpFilterType.setLayoutData(gdGrpDiagramType);
        grpFilterType.setText("Filter Type");

        final Button btnClassFilter = new Button(grpFilterType, SWT.RADIO);
        btnClassFilter.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                filterType = FilterType.CLASS;
                subtreeFilterText.setEnabled(false);
                okButton.setEnabled(true);
            }
        });
        btnClassFilter.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnClassFilter.setText("Class only template");

        final Button btnAllFilter = new Button(grpFilterType, SWT.RADIO);
        btnAllFilter.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                filterType = FilterType.ALL;
                subtreeFilterText.setEnabled(false);
                okButton.setEnabled(true);
            }
        });
        btnAllFilter.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnAllFilter.setText("Both Class and Attribute template");

        final Button btnSubtreeType = new Button(grpFilterType, SWT.RADIO);
        btnSubtreeType.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        btnSubtreeType.setText("Subtree template (fill in root classes below)");
        btnSubtreeType.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                filterType = FilterType.SUBTREE;
                subtreeFilterText.setEnabled(true);
                okButton.setEnabled(false);
            }
        });

        subtreeFilterText = new Text(grpFilterType, SWT.BORDER);
        subtreeFilterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        subtreeFilterText.setBounds(0, 0, 76, 21);
        subtreeFilterText.setToolTipText("Subtree value is 'MomA:ClassX+n MomB:ClassY+n ...' (or 'ClassX ClassY ...' if unique and all levels)");

        ModifyListener filterModifierListener = new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                filterType = FilterType.SUBTREE;
                String filterString = subtreeFilterText.getText().trim();
                okButton.setEnabled(false);
                switch (validateSubtreeFilter(filterString)) {
                case NONE:
                    subtreeFilterText.setBackground(errorColor);
                    break;
                case PARTIALLY:
                    subtreeFilterText.setBackground(warningColor);
                    break;
                default:
                    subtreeFilterText.setBackground(listBackground);
                    okButton.setEnabled(true);
                }
                subtreeFilter = formatSubtreeValue(filterString);
                // Must be a better way to get the other radio buttons updated automatically
                btnSubtreeType.setSelection(true);
                btnAllFilter.setSelection(false);
                btnClassFilter.setSelection(false);
            }
        };
        subtreeFilterText.addModifyListener(filterModifierListener);
        
        setTitle("Generate Diagram Filter");
        return area;
    }

    /**
     * Validates the subtree filter value by checking all valid moc names.
     * 
     * @param s
     * @return
     */
    private MatchStatus validateSubtreeFilter(String s) {
        if (s == null || s.trim().length() == 0)
            return MatchStatus.PARTIALLY;

        String[] mocs = formatSubtreeValue(s);

        MatchStatus result = MatchStatus.PERFECT;
        for (String moc : mocs) {
            String momName = moc.substring(0, moc.lastIndexOf(":"));
            String temp = moc.substring(0, moc.lastIndexOf("+"));
            String mocName = temp.substring(moc.lastIndexOf(":") + 1);
            String levels = moc.substring(moc.lastIndexOf("+") + 1);
            MatchStatus ms = checkSubtreeInput(momName, mocName, levels);
            result = getLowestMatchingStatus(result, ms);
        }

        return result;
    }

    /**
     * Checks input mom and moc names according to valid values and returns match status.
     * 
     * @param momName
     * @param mocName
     * @param levels
     * @return
     */
    private MatchStatus checkSubtreeInput(String momName, String mocName, String levels) {

        if (!levels.isEmpty()) {
            try {
                Integer.parseInt(levels);
            } catch (NumberFormatException e) {
                return MatchStatus.NONE;
            }
        }

        MatchStatus mocNameMatchStatus = matchStringSet(getValidMocNames(), mocName);
        MatchStatus mocNameAsMomNameMatchStatus = matchStringSet(getValidMomNames(), mocName);
        MatchStatus momNameMatchStatus = matchStringSet(getValidMomNames(), momName);

        return getSubtreeMatchStatus(momName, mocName, mocNameMatchStatus, mocNameAsMomNameMatchStatus, momNameMatchStatus);
    }

    private MatchStatus getSubtreeMatchStatus(String momName, String mocName, MatchStatus mocNameMatchStatus, MatchStatus mocNameAsMomNameMatchStatus,
            MatchStatus momNameMatchStatus) {
        if (momName.isEmpty()) {
            if (mocNameMatchStatus == MatchStatus.NONE) {
                // The mocName may match a mom name, which is OK, but should not give a perfect match
                // it should give maximum a partially match since user has only supplied a MOM name
                // User entered for example 'MomA' (where MomA is a mim name, but parsing puts it as a
                // moc name since the : sign is missing).
                return getLowestMatchingStatus(MatchStatus.PARTIALLY, mocNameAsMomNameMatchStatus);
            } else {
                return getHighestMatchingStatus(mocNameMatchStatus, mocNameAsMomNameMatchStatus);
            }
        } else {
            if (mocName.isEmpty()) {
                // User entered for example 'MomA:' which should give partial match
                return getLowestMatchingStatus(MatchStatus.PARTIALLY, momNameMatchStatus);
            } else {
                return getLowestMatchingStatus(mocNameMatchStatus, momNameMatchStatus);
            }
        }
    }

    /**
     * Checks if value matches any strings in the set.
     * 
     * @param strings
     * @param value
     * @return
     */
    private MatchStatus matchStringSet(Set<String> strings, String value) {
        MatchStatus result = MatchStatus.NONE;
        for (String s : strings) {
            if (s.equals(value)) {
                return MatchStatus.PERFECT;
            } else if (!value.isEmpty() && s.startsWith(value)) {
                result = MatchStatus.PARTIALLY;
            }
        }
        return result;
    }

    private MatchStatus getHighestMatchingStatus(MatchStatus ms1, MatchStatus ms2) {
        if (ms1 == MatchStatus.PERFECT || ms2 == MatchStatus.PERFECT)
            return MatchStatus.PERFECT;
        if (ms1 == MatchStatus.PARTIALLY || ms2 == MatchStatus.PARTIALLY)
            return MatchStatus.PARTIALLY;
        return MatchStatus.NONE;
    }

    private MatchStatus getLowestMatchingStatus(MatchStatus ms1, MatchStatus ms2) {
        if (ms1 == MatchStatus.NONE || ms2 == MatchStatus.NONE)
            return MatchStatus.NONE;
        if (ms1 == MatchStatus.PARTIALLY || ms2 == MatchStatus.PARTIALLY)
            return MatchStatus.PARTIALLY;
        return MatchStatus.PERFECT;
    }

    /**
     * Adds the ':' and '+' characters to subtree value if missing.
     * 
     * @param input
     *            , for example 'Fm'
     * @return, for example ':Fm+'
     */
    private String[] formatSubtreeValue(String input) {
        StringTokenizer st = new StringTokenizer(input, " ,");
        String[] result = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            String oneClass = st.nextToken();
            if (oneClass.indexOf(":") == -1)
                oneClass = ":" + oneClass;
            if (oneClass.indexOf("+") == -1)
                oneClass = oneClass + "+";
            result[i++] = oneClass;
        }
        return result;
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        okButton = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(510, 341);
    }

}
