package com.ericsson.ecim.m2t;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jet.CoreJETException;
import org.eclipse.jet.JET2Platform;
import org.eclipse.jet.transform.IJETBundleDescriptor;
import org.eclipse.jet.transform.TransformContextExtender;

import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

/**
 * model to text transformation using the JET transform on resource.
 * @author qmahsha
 * @deprecated
 *
 */
public final class M2TLauncher {
	
	/**
	 * launches a model to text transformation using the JET transform on resource.
	 * @param inputFile the input model
	 * @param outputFolder where to put the resulting generated files.
	 * @param jetTransformID The JET transform ID is usually the plugin-ID of the JET bundle.
	 * @return list of generated files.
	 * @throws EcimTransformationException
	 */
	public static List<File> convert(File inputFile, File outputFolder, String jetTransformID) throws EcimTransformationException{
		return convert(inputFile, outputFolder, jetTransformID, null);
	}
	/**
	 * Launches a model to text transformation using the JET transform on resource.
	 * @param inputFile the input model
	 * @param outputFolder where to put the resulting generated files.
	 * @param jetTransformID the JET transform ID is usually the plugin-ID of the JET bundle.
	 * @param jetVariables map of variables to be passed in to the JET Transformation 
	 * @return list of generated files.
	 * @throws EcimTransformationException
	 */
	public static List<File> convert(File inputFile, File outputFolder, String jetTransformID, Map<String, String> jetVariables) throws EcimTransformationException{
		if(jetVariables == null){
			jetVariables = new HashMap<String, String>();
		}
		jetVariables.put("destination",outputFolder.getAbsolutePath());
		String transformUid = UUID.randomUUID().toString();
		jetVariables.put(JetFileOutRegistry.TRANSFORM_ID, transformUid);
		IProgressMonitor monitor = new NullProgressMonitor(); 
		try{
			JetFileOutRegistry.remove(transformUid);
			
			Object myJect = loadModel(inputFile, jetTransformID);
			IStatus transformStatus = JET2Platform.runTransformOnObject(jetTransformID, myJect, jetVariables, monitor);
		
			if (transformStatus.getSeverity() == IStatus.ERROR) {
				throw new EcimTransformationException(transformStatus.getMessage(), transformStatus);
			}
		
			List<File> outputFiles = JetFileOutRegistry.get(transformUid);
			return outputFiles;
		} catch (IOException e) {
			throw new EcimTransformationException("Error load Model file: "+inputFile.getName(), e);
		} catch (CoreJETException e) {
			throw new EcimTransformationException("Error during JET Execution on file: "+inputFile.getName(), e);
		}
		finally{
			JetFileOutRegistry.remove(transformUid);
		}
	}
	
	private static Object loadModel(File inputFile, String jetTransformID) throws IOException, CoreJETException{
		final IJETBundleDescriptor descriptor = JET2Platform.getJETBundleManager().getDescriptor(jetTransformID);
		final URL url = inputFile.toURI().toURL();
		Object object = TransformContextExtender.loadModel(url, descriptor.getModelLoaderId(), null);
		return object;
	}
}
