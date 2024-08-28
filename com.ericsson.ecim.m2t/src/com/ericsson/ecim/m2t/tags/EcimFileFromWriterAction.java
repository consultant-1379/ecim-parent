package com.ericsson.ecim.m2t.tags;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jet.BufferedJET2Writer;
import org.eclipse.jet.IWriterListener;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.taglib.workspace.AbstractWorkspaceAction2;

import com.ericsson.ecim.m2t.JetFileOutRegistry;

public class EcimFileFromWriterAction extends AbstractWorkspaceAction2 {

	private File file;
	private BufferedJET2Writer writer;
	private boolean replace;

	@SuppressWarnings("unused")
	private boolean derived;
	private String encoding;
	private JET2Context context;

	protected EcimFileFromWriterAction(String templatePath,
			JET2Context context, TagInfo tagInfo, File file,
			BufferedJET2Writer writer, boolean replace, boolean derived) {
		super(tagInfo, templatePath);
		this.context = context;
		this.file = file;
		this.writer = writer;
		this.replace = replace;
		this.derived = derived;
	}

	@Override
	public IResource getResource() {
		return null;
	}

	@Override
	public boolean requiresValidateEdit() {
		return replace && file.exists() && !file.canRead() /*
															 * && content has
															 * changed
															 */;
	}

	@Override
	public boolean performActionIfRequired(IProgressMonitor monitor)
			throws JET2TagException {
		try {
			// String sourceEncoding = (encoding == null) ? "utf-8" : encoding;
			// The JET Framework contains a Bug that causes only @see
			// IWorkspaceActionExtension to be finalized
			// See
			// org.eclipse.jet.taglib.workspace.WorkspaceContextExtender.isActionRequired(JET2Context,
			// IWorkspaceAction)
			// If the Action is of another type (which it will be since the very
			// point of this Tag is to write outside the workspace),
			// it will just return true an never run the
			// ActionUtil.finalizeAndTestForChange() method, this method is the
			// only one
			// that calls the private ActionUtil.finalizeContent() method, so we
			// have to repeat that code in this class.
			finalizeContent(writer, file);
			String stringContent = writer.getContent();
			
			// Start with convert string to UTF-8, to enable reliable replacements.
			stringContent = new String(stringContent.getBytes("UTF-8"));

			// If there are special characters we need to replace them with
			// equivalent ones. See:
			// artf65843 : 3-character UTF is possible to enter in documentation
			// fields but are not valid when generating output file
			// The below replacements fixes the faulty EcimLocalAuthorization
			// model, but there is no guarantee the replaced
			// characters are the only ones around. Hopefully covers most if not
			// all current models out there.
			stringContent = stringContent.
				replaceAll("â€¢", "*").
				replaceAll("â€¦", "...").
				replaceAll("â€˜", "'").
				replaceAll("â€™", "'").
				replaceAll("â€œ", "\"").
				replaceAll("â€�", "\"").
				replaceAll("•", "*").
				replaceAll("…", "...").
				replaceAll("‘", "'").
				replaceAll("’", "'").
				replaceAll("“", "\"").
				replaceAll("”", "\"");

			FileUtils.writeStringToFile(file, stringContent, "UTF-8");

			// We add this output registry data after the the data has been
			// written, so it only happens if there are no exceptions
			String transformID = null;
			if (context.hasVariable(JetFileOutRegistry.TRANSFORM_ID)) {
				transformID = String.valueOf(context
						.getVariable(JetFileOutRegistry.TRANSFORM_ID));
				JetFileOutRegistry.add(transformID, file.getAbsolutePath());
			}
			return true;
		} catch (IOException e) {
			throw new JET2TagException(e);
		}
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public BufferedJET2Writer getContentWriter() {
		return writer;
	}

	/**
	 * Will run the finalizers (such as java:import statements Failing to run
	 * this will result in an uncomplete transformation
	 * 
	 * @param writer
	 * @param committedObject
	 * @throws JET2TagException
	 */
	private static final void finalizeContent(JET2Writer writer,
			Object committedObject) throws JET2TagException {
		final IWriterListener[] eventListeners = writer.getEventListeners();
		for (IWriterListener eventListener : eventListeners) {
			eventListener.finalizeContent(writer, committedObject);
		}
	}
}
