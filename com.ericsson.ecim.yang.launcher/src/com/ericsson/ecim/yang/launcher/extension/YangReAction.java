package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;
import org.eclipse.ui.handlers.HandlerUtil;

import com.ericsson.ecim.core.helpers.UIHelper;
import com.ericsson.ecim.yang.launcher.YangActivator;
import com.ericsson.yang.AbstractModule;
import com.ericsson.yang.Augment;
import com.ericsson.yang.Import;
import com.ericsson.yang.Include;
import com.ericsson.yang.Revision;

/**
 * Class that handles the popup menu selection action for transforming a YANG file to ECIM MM UML
 * 
 * @author efrewan
 *
 */
public class YangReAction extends AbstractHandler {

    private static final Logger LOGGER = Logger.getLogger(YangReAction.class);
    private static final String NO_REVISION_SET = "1970-01-01";
    private IProject currentProject = null;

    /**
     * Data container for yang files
     * 
     * @author ERAJAIK
     *
     */
    public static class YangFileWithDependencies {

        private IFile mainFile;
        private Set<IFile> inputFiles = new HashSet<IFile>();

        public YangFileWithDependencies(IFile initialFile) {
            this.mainFile = initialFile;
        }

        public IFile getMainFile() {
            return mainFile;
        }

        public void setMainFile(IFile mainFile) {
            this.mainFile = mainFile;
        }

        public File getUmlFile() {
            return new File(getParentFolder(), getUmlFileName());
        }

        private File getParentFolder() {
            return mainFile.getRawLocation().toFile().getParentFile();
        }

        private String getUmlFileName() {
            return mainFile.getName().split("\\.", 2)[0] + ".uml";
        }

        public List<File> getFileList() {
            List<File> returnList = new ArrayList<File>();
            returnList.add(mainFile.getRawLocation().toFile());
            Iterator<IFile> iter = inputFiles.iterator();
            while (iter.hasNext()) {
                IFile file = iter.next();
                if (!file.equals(mainFile))
                    returnList.add(file.getRawLocation().toFile());
            }
            return returnList;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(mainFile.getName() + ": [ ");
            Iterator<IFile> iter = inputFiles.iterator();
            while (iter.hasNext())
                sb.append(iter.next().getName() + " ");
            sb.append(" ]\n");
            return sb.toString();
        }

    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
        List<IFile> selectedResources = new ArrayList<IFile>();

        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structureSelection = (IStructuredSelection) selection;
            for (Object o : structureSelection.toList()) {
                if (o instanceof ISubResourceFile) {
                    selectedResources.add(((ISubResourceFile) o).getFile());
                }
                if (o instanceof IFile) {
                    selectedResources.add((IFile) o);
                }
            }

            try {
                YangFileWithDependencies yangFile = null;
                for (IFile selectedResource : selectedResources) {
                    currentProject = selectedResource.getProject();
                    yangFile = new YangFileWithDependencies(selectedResource);
                    addDependentYangFiles(selectedResource, yangFile);
                    YangReTransformationJob yangReTransformationJob = new YangReTransformationJob("YANG to UML Transformation", yangFile.getFileList());
                    yangReTransformationJob.setUser(true);
                    yangReTransformationJob.setOutputUmlFile(yangFile.getUmlFile());
                    yangReTransformationJob.schedule();
                }
            } catch (Exception e) {
                UIHelper.popupErrorMessage(YangActivator.PLUGIN_ID, "Transformation Error", e.toString());
                LOGGER.warn(e.getMessage(), e);
            }
        }

        return null;
    }

    /**
     * Method to parse an input file and add its imports and includes to the list of files to be sent to the ATL
     * transfer
     * 
     * @param inputFile
     *            The chose input file
     * @throws IOException
     * @throws CoreException
     */
    private void addDependentYangFiles(final IFile inputFile, final YangFileWithDependencies yangFile) throws IOException, CoreException, ParseException {

        // Read selected file as YANG file
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI.createFileURI(inputFile.getRawLocation().toFile().getCanonicalPath()), true);
        AbstractModule abstractModule = (AbstractModule) resource.getContents().get(0);
        EList<Import> imports = abstractModule.getImports();
        EList<Include> includes = abstractModule.getIncludeModules();

        List<IFile> inputFileList = new ArrayList<IFile>();
        List<String> modulePrefixesToAugment = getAugmentModulePrefixes(abstractModule);

        inputFileList.add(inputFile);

        handleImportModules(yangFile, imports, inputFileList, modulePrefixesToAugment);

        handleIncludeModules(includes, inputFileList);

        // Call recursively
        List<IFile> filesToCheck = new ArrayList<IFile>();
        for (IFile file : inputFileList) {
            if (!yangFile.inputFiles.contains(file) && !file.equals(inputFile)) {
                filesToCheck.add(file);
            }
        }

        yangFile.inputFiles.addAll(inputFileList);

        for (IFile file : filesToCheck) {
            addDependentYangFiles(file, yangFile);
        }
    }

    private void handleIncludeModules(EList<Include> includes, List<IFile> inputFileList) throws CoreException, IOException, ParseException {
        for (Include anInclude : includes) {
            String moduleName = anInclude.getName();
            String revision = anInclude.getRevisionDate();
            IResource iResource = findFileRecursively(currentProject, moduleName, revision);

            // Error handling if iResource is not found in project
            if (iResource == null || !iResource.exists()) {
                throw new FileNotFoundException("A module \"" + moduleName + "\" with matching revision is not found in the \"" + currentProject.getName()
                        + "\" project.");
            }

            inputFileList.add((IFile) iResource);
        }
    }

    private void handleImportModules(final YangFileWithDependencies yangFile, EList<Import> imports, List<IFile> inputFileList,
            List<String> modulePrefixesToAugment) throws CoreException, IOException, ParseException {
        for (Import anImport : imports) {
            String moduleName = anImport.getModuleName();
            String modulePrefix = anImport.getPrefix().getName();
            String revision = anImport.getRevisionDate();
            IResource iResource = findFileRecursively(currentProject, moduleName, revision);

            // Error handling if iResource is not found in project
            if (iResource == null || !iResource.exists()) {
                throw new FileNotFoundException("A module \"" + moduleName + "\" with matching revision is not found in the \"" + currentProject.getName()
                        + "\" project.");
            }
            if (modulePrefixesToAugment.contains(modulePrefix)) {
                yangFile.setMainFile((IFile) iResource);
            }
            inputFileList.add((IFile) iResource);
        }
    }

    /**
     * Method to return the prefix for augment, and from that prefix find name of module to augment
     * 
     * @param abstractModule
     * @return
     */
    private List<String> getAugmentModulePrefixes(AbstractModule abstractModule) {
        List<String> returnList = new ArrayList<String>();
        Iterator<Object> iterator = EcoreUtil.getAllContents(abstractModule, false);

        while (iterator.hasNext()) {
            Object object = iterator.next();

            if (object instanceof Augment) {
                String augmentName = ((Augment) object).getName();

                // If no prefix is found, the current module is being augmented
                if (augmentName.indexOf(":") < 0)
                    continue;

                // Get all prefixes to augment
                int indexOfColon = augmentName.indexOf(":");
                int indexOfSlash = augmentName.indexOf("/");
                while (indexOfColon != -1 && indexOfSlash != -1) {
                    String augmentPrefix = augmentName.substring(indexOfSlash + 1, indexOfColon);
                    returnList.add(augmentPrefix);
                    indexOfColon = augmentName.indexOf(":", indexOfColon + 1);
                    indexOfSlash = augmentName.indexOf("/", indexOfSlash + 1);
                }
            }
        }

        return returnList;
    }

    /**
     * Finds a file recursively in the supplied container that starts with same file name as supplied name. If
     * revisionDate is null then the file with the most recent revision is chosen. If revisionDate is set (format
     * "YYYY-MM-DD") then the first file that matches name and revision is returned.
     * 
     * @param container
     *            The project to search
     * @param name
     *            Name of file
     * @param revisionDate
     *            the date to search for
     * @return An IFile object if file is found, null if not
     * @throws CoreException
     */
    private IFile findFileRecursively(IContainer container, String name, String revisionDate) throws CoreException, IOException, ParseException {
        IFile matchingFile = null;
        String mostRecentRevision = NO_REVISION_SET;
        for (IResource r : container.members()) {
            IFile recursiveFile = null;
            if (r instanceof IContainer) {
                recursiveFile = findFileRecursively((IContainer) r, name, revisionDate);
            } else if (r instanceof IFile && matchYangFileName(r.getName(), name)) {
                recursiveFile = (IFile) r;
            }
            if (recursiveFile == null) {
                continue;
            }
            String matchingFileRevision = findMostRecentRevision(recursiveFile);
            if (revisionDate == null && matchingFileRevision.compareTo(mostRecentRevision) >= 0) {
                // this means we must try to find most recent file, which
                // may not be the one just found
                mostRecentRevision = matchingFileRevision;
                matchingFile = recursiveFile;
            } else {
                // We got file with exact matching revision, then
                // return it!
                return recursiveFile;
            }
        }

        return matchingFile;
    }

    private boolean matchYangFileName(String resourceName, String name) {
        return resourceName.toLowerCase().endsWith(".yang") && stringsEqualIgnoringAtSuffix(resourceName, name);
    }

    /**
     * Checks if two strings are equal, but first they are stripped of any trailing text beginning with "@" as well as
     * any file suffix.
     */
    private boolean stringsEqualIgnoringAtSuffix(String a, String b) {
        String a1 = subStringUntilChar(a, '.');
        String b1 = subStringUntilChar(b, '.');
        String a2 = subStringUntilChar(a1, '@');
        String b2 = subStringUntilChar(b1, '@');
        return a2.equals(b2);
    }

    /**
     * Returns substring of input string until the character.
     * 
     * @param s
     * @param c
     * @return
     */
    private String subStringUntilChar(String s, Character c) {
        return s.lastIndexOf(c) == -1 ? s : s.substring(0, s.lastIndexOf(c));
    }

    private String findMostRecentRevision(IFile r) throws IOException {
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI.createFileURI(r.getRawLocation().toFile().getCanonicalPath()), true);
        AbstractModule abstractModule = (AbstractModule) resource.getContents().get(0);
        EList<Revision> revisions = abstractModule.getRevisions();

        String mostRecentRevision = NO_REVISION_SET;
        for (Revision rev : revisions) {
            if (rev.getDate().compareTo(mostRecentRevision) > 0) {
                mostRecentRevision = rev.getDate();
            }
        }
        return mostRecentRevision;
    }
}
