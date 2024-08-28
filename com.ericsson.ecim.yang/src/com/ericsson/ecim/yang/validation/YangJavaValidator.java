package com.ericsson.ecim.yang.validation;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.eclipse.xtext.validation.Check;

import com.ericsson.yang.Bit;
import com.ericsson.yang.Deviate;
import com.ericsson.yang.Import;
import com.ericsson.yang.Include;
import com.ericsson.yang.List;
import com.ericsson.yang.Refine;
import com.ericsson.yang.Revision;
import com.ericsson.yang.YANGPackage;

public class YangJavaValidator extends AbstractYangJavaValidator {

    private static final String ERROR_DATE_MSG = "Date must be expressed in format yyyy-mm-dd";
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Check
    public void checkMinMax(List list) {
        validateMinValue(list.getMin());
        validateMaxValue(list.getMax());
    }

    @Check
    public void checkMinMax(Deviate deviate) {
        validateMinValue(deviate.getMin());
        validateMaxValue(deviate.getMax());
    }

    @Check
    public void checkMinMax(Refine refine) {
        validateMinValue(refine.getMin());
        validateMaxValue(refine.getMax());
    }

    private void validateMinValue(Integer minValue) {
        if (minValue.intValue() < 0) {
            error("Min value must be non negative integer.", YANGPackage.Literals.LIST__MIN);
        }
    }

    private void validateMaxValue(String maxValue) {
        int maxIntValue = Integer.parseInt(maxValue);
        if (maxIntValue <= 0) {
            error("Max value must be postive integer or 'unbounded'.", YANGPackage.Literals.LIST__MAX);
        }
    }

    @Check
    public void checkBit(Bit bit) {
        if (bit.getPosition() != null && (bit.getPosition().compareTo(BigInteger.ZERO) < 0 || bit.getPosition().compareTo(BigInteger.valueOf(4294967295L)) > 0)) {
            error("Allowed value for position is 0 - 4294967295", YANGPackage.Literals.BIT__POSITION);
        }
    }

    @Check
    public void checkDate(Include include) {
        if (!checkDate(include.getRevisionDate()))
            error(ERROR_DATE_MSG, YANGPackage.Literals.INCLUDE__REVISION_DATE);
    }

    @Check
    public void checkDate(Import anImport) {
        if (!checkDate(anImport.getRevisionDate()))
            error(ERROR_DATE_MSG, YANGPackage.Literals.IMPORT__REVISION_DATE);
    }

    @Check
    public void checkDate(Revision revision) {
        if (!checkDate(revision.getDate()))
            error(ERROR_DATE_MSG, YANGPackage.Literals.REVISION__DATE);
    }

    private boolean checkDate(String string) {
        if (string == null)
            return true;
        if (string.matches("\\d{4}-\\d{2}-\\d{2}")) {
            df.setLenient(false);
            try {
                df.parse(string);
                return true;
            } catch (ParseException ex) {
                return false;
            }
        }
        return false;
    }
}
