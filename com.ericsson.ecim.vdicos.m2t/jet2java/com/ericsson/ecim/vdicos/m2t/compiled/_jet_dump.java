package com.ericsson.ecim.vdicos.m2t.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_dump implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_dump() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_dump_30_1 = new TagInfo("c:dump", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "format", //$NON-NLS-1$
                "entities", //$NON-NLS-1$
            },
            new String[] {
                "$mom", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!-- ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  Copyright (c) ");  //$NON-NLS-1$        
        out.write( java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) );
        out.write(" Ericsson AB.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  All rights reserved");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  DX ECIM Tool-chain generated this file on ");  //$NON-NLS-1$        
        out.write( (new java.util.Date()).toLocaleString() );
        out.write(" using ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    * vdicos.dsl (");  //$NON-NLS-1$        
        out.write( com.ericsson.ecim.vdicos.dsl.Activator.getVersion() );
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    * vdicos.m2m (");  //$NON-NLS-1$        
        out.write( com.ericsson.ecim.vdicos.m2m.Activator.getVersion() );
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    * vdicos.m2t (");  //$NON-NLS-1$        
        out.write( com.ericsson.ecim.vdicos.m2t.VDicosM2TActivator.getVersion() );
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //
        //TODO:Is it possible to set the doctype via ATL?
        out.write("<!DOCTYPE mim SYSTEM \"tsp_mim.dtd\" [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT status (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT category (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT dependencies (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT takesEffect (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT ordered (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT unique (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT ecimName (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT notifiable (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT isVirtualContainer (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT singletonKeyValue (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!ELEMENT ldapServerName (#PCDATA)>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("]>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_dump_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "dump", "c:dump", _td_c_dump_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_dump_30_1.setRuntimeParent(null);
        _jettag_c_dump_30_1.setTagInfo(_td_c_dump_30_1);
        _jettag_c_dump_30_1.doStart(context, out);
        _jettag_c_dump_30_1.doEnd();
        out.write(NL);         
        out.write(NL);         
    }
}
