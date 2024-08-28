/*
 * generated by Xtext
 */
package com.ericsson.ecim.mgc.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class JsonFormatter extends AbstractDeclarativeFormatter {
    
    @Override
    protected void configureFormatting(FormattingConfig c) {
        com.ericsson.ecim.mgc.services.JsonGrammarAccess  gaccess = (com.ericsson.ecim.mgc.services.JsonGrammarAccess) getGrammarAccess();        
        c.setAutoLinewrap(240);
    
        // Member formatting
        c.setLinewrap(1).before(gaccess.getMemberAccess().getGroup());
        
        // Object formatting
        c.setLinewrap(1).before(gaccess.getObjectAccess().getRightCurlyBracketKeyword_4());
        c.setIndentation(gaccess.getObjectAccess().getLeftCurlyBracketKeyword_1(), gaccess.getObjectAccess().getRightCurlyBracketKeyword_4());
        c.setIndentationIncrement().after(gaccess.getObjectAccess().getLeftCurlyBracketKeyword_1());
        c.setIndentationDecrement().before(gaccess.getObjectAccess().getRightCurlyBracketKeyword_4());
        
        // Array formatting
        c.setLinewrap(1).after(gaccess.getArrayAccess().getLeftSquareBracketKeyword_1());
        c.setNoSpace().before(gaccess.getArrayAccess().getCommaKeyword_3_0());
        c.setLinewrap(1).after(gaccess.getArrayAccess().getCommaKeyword_3_0());
        c.setLinewrap(1).before(gaccess.getArrayAccess().getRightSquareBracketKeyword_4());
        c.setIndentation(gaccess.getArrayAccess().getLeftSquareBracketKeyword_1(), gaccess.getArrayAccess().getRightSquareBracketKeyword_4());
    }

}
