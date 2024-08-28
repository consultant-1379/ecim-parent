package com.ericsson.ecim.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MMAValidationParser {
    
    private static final String CSV_HEADER = "Severity;Item Name;Full Qualified Item Name;Problem Description;Subject;Full Qualified Subject Name;Item Definition;Uml Metaclass";
    @SuppressWarnings("unused")
    private final String returnStatus, outResult, statusOutResult;
    private List<String> errors = new ArrayList<String>();
    private List<String> warnings = new ArrayList<String>();
    private List<String> infos = new ArrayList<String>();

    public MMAValidationParser(final String returnStatus, final String outResult, final String statusOutResult) {
        this.returnStatus = returnStatus;
        this.outResult = outResult.replaceAll(CSV_HEADER, "").trim();
        this.statusOutResult = statusOutResult;
        parse();
    }

    private void parse() {
        // Severity;Item Name;Full Qualified Item Name;Problem Description;Subject;Full Qualified Subject Name;Item Definition;Uml Metaclass
        Pattern p = Pattern.compile("^(error|warning|information);(.+);(.+);(.+);(.+);(.+);(.+);(.+)?$", Pattern.MULTILINE);
        Matcher matcher = p.matcher(outResult);
        while (matcher.find()) {
            final String line = matcher.group();
            final String type = matcher.group(1);
            if ("error".equals(type))
                errors.add(line);
            else if ("warning".equals(type))
                warnings.add(line);
            else if ("information".equals(type))
                infos.add(line);
        }
    }

    public String asString(List<String> strings) {
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s + "\n");
        }
        return sb.toString();
    }

    public List<String> getErrors() {
        return errors;
    }

    public int getErrorCount() {
        return errors.size();
    }

    public boolean isExpectedErrors(String[] expectedErrorMessages) {
        StringBuffer messages = new StringBuffer();
        for (String s : getErrors()) {
            messages.append(s + "\n");
        }
        return ValidatorHelper.isExpectedErrors(expectedErrorMessages, messages.toString());
    }

}
