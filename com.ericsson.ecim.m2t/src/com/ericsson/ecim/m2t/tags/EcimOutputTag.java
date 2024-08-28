package com.ericsson.ecim.m2t.tags;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.AbstractEmptyTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.taglib.workspace.WorkspaceContextExtender;
import org.eclipse.jet.transform.TransformContextExtender;

/**
 * Replication of org.eclipse.jet.internal.taglib.workspace.FileTag
 * with the important difference that the <i>path</i> is filesystem relative.
 * 
 */
public class EcimOutputTag extends AbstractEmptyTag {
	  private static final String TEMPLATE__ATTR = "template"; //$NON-NLS-1$

	  private static final String PATH__ATTR = "path"; //$NON-NLS-1$

	  private static final String REPLACE__ATTR = "replace"; //$NON-NLS-1$

	  private static final String DERIVED__ATTR = "derived"; //$NON-NLS-1$

	  private static final String ENCODING__ATTR = "encoding"; //$NON-NLS-1$
	  
	  
	@Override
	public void doAction(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {
		// Get all variables
		IPath path = new Path(getAttribute(PATH__ATTR));
	    String templatePath = getAttribute(TEMPLATE__ATTR);
	    boolean replace = true;
	    if (td.hasAttribute(REPLACE__ATTR))
	    {
	      replace = Boolean.valueOf(getAttribute(REPLACE__ATTR)).booleanValue();
	    }
	    boolean derived = false;
	    if (td.hasAttribute(DERIVED__ATTR))
	    {
	      derived = Boolean.valueOf(getAttribute(DERIVED__ATTR)).booleanValue();
	    }
	    
	    WorkspaceContextExtender wsExtender = WorkspaceContextExtender.getInstance(context);

	    File file = path.toFile();

	    if(replace == false && file.exists()) {
	      // don't need to run template or create action...
	      return;
	    }
	    
	    // Run the template
	    BodyContentWriter contentWriter = new BodyContentWriter();
	    TransformContextExtender tce = TransformContextExtender.getInstance(context);
	    tce.execute(templatePath, contentWriter);

	    EcimFileFromWriterAction fileAction = new EcimFileFromWriterAction(
	      context.getTemplatePath(),
	      context,
	      td,
	      file,
	      contentWriter,
	      replace,
	      derived);

	    if (td.hasAttribute(ENCODING__ATTR))
	    {
	      fileAction.setEncoding(getAttribute(ENCODING__ATTR));
	    }
	    // Add the writing object as a Action, so it's run after the template has executed
	    wsExtender.addAction(fileAction);
		
	}

}
