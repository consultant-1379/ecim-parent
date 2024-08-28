package com.ericsson.ecim.vdicos.m2t.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_ecim = "com.ericsson.ecim.m2t.ecimTags"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "org.eclipse.jet.taglib.control.iterateSetsContext", //$NON-NLS-1$
                "true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/model/mim", //$NON-NLS-1$
                "mom", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_5 = new TagInfo("c:include", //$NON-NLS-1$
            12, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/dump.jet", //$NON-NLS-1$
                "mom", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ecim_file_17_2 = new TagInfo("ecim:file", //$NON-NLS-1$
            17, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "templates/dump.jet", //$NON-NLS-1$
                "{$destination}/{$mom/@name}.xml", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for Model_To_Text_Transformation 
        out.write(NL);         
        // 
        //  Let c:iterate tags set the XPath context object.
        //  For 100% compatibility with JET 0.9.x or earlier, remove this statement
        // 
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_2.setRuntimeParent(null);
        _jettag_c_iterate_11_2.setTagInfo(_td_c_iterate_11_2);
        _jettag_c_iterate_11_2.doStart(context, out);
        while (_jettag_c_iterate_11_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_12_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_12_5.setRuntimeParent(_jettag_c_iterate_11_2);
            _jettag_c_include_12_5.setTagInfo(_td_c_include_12_5);
            _jettag_c_include_12_5.doStart(context, out);
            _jettag_c_include_12_5.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // This will output the result of running the template into the destination path (which is filesystem path) 
            // It will also register the output file(s) in the com.ericsson.ecim.m2t.JetFileOutRegistry under the transformID (if specified) 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ecim_file_17_2 = context.getTagFactory().createRuntimeTag(_jetns_ecim, "file", "ecim:file", _td_ecim_file_17_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ecim_file_17_2.setRuntimeParent(_jettag_c_iterate_11_2);
            _jettag_ecim_file_17_2.setTagInfo(_td_ecim_file_17_2);
            _jettag_ecim_file_17_2.doStart(context, out);
            _jettag_ecim_file_17_2.doEnd();
            out.write(NL);         
            _jettag_c_iterate_11_2.handleBodyContent(out);
        }
        _jettag_c_iterate_11_2.doEnd();
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ");  //$NON-NLS-1$        
    }
}
