package com.ericsson.ecim.optionality.processor;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Usage;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.ModelSearch;
import com.ericsson.ecim.core.uml.helpers.ModelUtility;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;

/**
 * 
 * Class to manage Decision Classes
 * 
 */
public class Decision {

	private static final String PROFILE_NAME = "ECIM Base Profile";
	private static final String DECISISON_STEREOTYPE_NAME = "EcimDecision";
	private static final String DECISISONS_STEREOTYPE_NAME = "EcimDecisions";
	private String name;
	private Package owningMom;
	private File modelFile;
	private EList<Relationship> relationships = new BasicEList<Relationship>();
	private Uml2ModelHelper decisionBasedModelHelper = null;

	/**
	 * 
	 * Create a new Decision class to wrap a UML Class with the <<Decision>>
	 * stereotype
	 * 
	 * @param c
	 *            The Class to be wrapped
	 */
	public Decision(Class c) {
		this.name = c.getName();
		this.owningMom = (Package) c.getOwner().getOwner();// get the EcimMom
															// holding the
															// decision
		this.relationships = c.getRelationships();
	}

	public EList<Relationship> getRelationships() {
		return relationships;
	}

	public String getName() {
		return name;
	}

	public Package getOwningMom() {
		return owningMom;
	}

	public Model getModel() {
		if (decisionBasedModelHelper != null) {
			return decisionBasedModelHelper.getModel();
		} else {
			return null;
		}
	}

	public File getModelFile() {
		return modelFile;
	}

	/**
	 * 
	 * Copy the original model and all the dependent models in the project to a
	 * new location
	 * 
	 * @param workFolder
	 *            The folder into which we place the copies
	 * @param modelFile
	 *            The original model
	 * @return File The new decision model file
	 */
	public File copyModelAndLocalDependencies(File workFolder, File modelFile)
			throws IOException {
		File decisionModelOutputFolder = new File(workFolder, this.name);
		File decisionModelFile = new File(
				decisionModelOutputFolder.getAbsolutePath() + File.separator
						+ modelFile.getName());
		// create a filter for ".emx .epx .uml" files. we must recursive down
		// the folders in-case models are there
		IOFileFilter emxOrEpxFilter = FileFilterUtils.or(
				FileFilterUtils.suffixFileFilter(".emx"),
				FileFilterUtils.suffixFileFilter(".epx"));
		IOFileFilter umlOrDirectoryFilter = FileFilterUtils.or(
				FileFilterUtils.suffixFileFilter(".uml"),
				FileFilterUtils.directoryFileFilter());
		IOFileFilter excludeFilter = FileFilterUtils
				.notFileFilter(FileFilterUtils.nameFileFilter(".intermediate"));
		IOFileFilter completeFilter = FileFilterUtils.and(
				FileFilterUtils.or(emxOrEpxFilter, umlOrDirectoryFilter),
				excludeFilter);

		// create a folder for the model copy and all its dependent models
		FileUtils.copyDirectory(modelFile.getParentFile(),
				decisionModelOutputFolder, completeFilter);
		this.modelFile = decisionModelFile;
		return decisionModelFile;
	}

	public void loadModel() throws IOException {
		decisionBasedModelHelper = new Uml2ModelHelper(this.modelFile);
		decisionBasedModelHelper.loadModel();
	}

	public void unloadModel() {
		decisionBasedModelHelper.unloadModel();
	}

	/**
	 * 
	 * Remove elements from the model based on Optionality Constraints
	 * 
	 * @param ocs
	 *            The optionality constraints to be considered
	 */
	public void pruneModel(final OptionalityConstraints ocs)
			throws EcimException {
		Model model = decisionBasedModelHelper.getModel();
		Resource modelResource = model.eResource();
		TransactionalEditingDomain domain = TransactionUtil
				.getEditingDomain(modelResource);
		Assert.isNotNull(domain);
		Assert.isNotNull(domain.getResourceSet());

		TransactionalCommandStack commandStack = (TransactionalCommandStack) domain
				.getCommandStack();

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("no_validation", Boolean.TRUE);

		try {
			commandStack.execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					EList<String> elementIDsToRemove = ocs
							.getIDsOfNonValidatingElements(getFeatureSet());

					// add the ids of all the decisions except for the one this
					// model represents
					elementIDsToRemove.addAll(getIrreleventDecisions());

					// remove all the diagrams as removing elements may cause
					// errors in them
					elementIDsToRemove.addAll(getDiagrams());

					// record the IDs of all the elements which fail the
					// optionality constraints so they can be removed
					// from the model copies
					EList<Element> elementsToRemove = ModelSearch
							.getElementsByID(
									decisionBasedModelHelper.getModel(),
									elementIDsToRemove);

					Collection<Element> relatedElements = ModelUtility
							.INSTANCE().getRelatedElements(elementsToRemove);
					
					Set<Element> allElementsToRemove = ModelUtility.INSTANCE().mergeElements(elementsToRemove, relatedElements);

//					printElements("\nRelated", relatedElements);
//					printElements("\nOriginal", elementsToRemove);
//					printElements("\nAll", allElementsToRemove);				
					
					for (Element element : allElementsToRemove) {
						element.destroy();
					}
				}
			}, options);

			modelResource.save(null);
		} catch (Exception e) {
			throw new EcimException(e.getMessage(), e);
		}
	}
	
	

	/**
	 * 
	 * Retrieve the list of decisions which are not relevant for this Decision
	 * Model
	 * 
	 * @return EList The id(s) of the Decision(s) found
	 */
	private EList<String> getIrreleventDecisions() {
		EList<String> ids = new BasicEList<String>();
		// remove all the decisions except for the one this model represents
		EList<Element> elements = getModel().allOwnedElements();

		Profile modelProfile = getModel().getAppliedProfile(PROFILE_NAME);
		Stereotype ecimDecisionStereotype = modelProfile
				.getOwnedStereotype(DECISISON_STEREOTYPE_NAME);
		Stereotype ecimDecisionsStereotype = modelProfile
				.getOwnedStereotype(DECISISONS_STEREOTYPE_NAME);

		Map<String, Integer> decisionsMap = new HashMap<String, Integer>();
		Map<String, Integer> markMap = new HashMap<String, Integer>();
		for (Element element : elements) {
			if (element instanceof Class) {
				Class c = (Class) element;
				getDecisionFromClass(ids, ecimDecisionStereotype, markMap, c);
			} else if (element instanceof Package) {
				Package p = (Package) element;
				getDecisionFromPackage(ecimDecisionStereotype,
						ecimDecisionsStereotype, decisionsMap, p);
			}
		}

		Set<String> ecimDecisionsIDs = markMap.keySet();
		for (String ecimDecisionsID : ecimDecisionsIDs) {
			if (decisionsMap.containsKey(ecimDecisionsID)) {
				Integer originalNum = decisionsMap.get(ecimDecisionsID);
				Integer removeNum = markMap.get(ecimDecisionsID);
				if (originalNum == removeNum) {
					ids.add(ecimDecisionsID);
				}
			}
		}

		return ids;
	}

	private void getDecisionFromPackage(Stereotype ecimDecisionStereotype,
			Stereotype ecimDecisionsStereotype,
			Map<String, Integer> decisionsMap, Package pack) {
		if (pack.isStereotypeApplied(ecimDecisionsStereotype)) {
			String decisionsID = ((XMLResource) pack.eResource()).getID(pack);
			int decisionCount = 0;
			EList<Element> ownedElements = pack.getOwnedElements();
			for (Element ownedElement : ownedElements) {
				if (ownedElement.isStereotypeApplied(ecimDecisionStereotype)) {
					decisionCount++;
				}
			}
			decisionsMap.put(decisionsID, Integer.valueOf(decisionCount));
		}
	}

	private void getDecisionFromClass(EList<String> ids,
			Stereotype ecimDecisionStereotype, Map<String, Integer> markMap,
			Class clazz) {
		if (clazz.isStereotypeApplied(ecimDecisionStereotype)
				&& !clazz.getName().equals(getName())) {
			// add the ID of the decision class to be deleted
			ids.add(((XMLResource) clazz.eResource()).getID(clazz));

			// Count decisions number to judge whether need to remove the parent
			// EcimDecisions element
			Element ownerElement = clazz.getOwner();
			String ownerId = ((XMLResource) ownerElement.eResource())
					.getID(ownerElement);
			Integer markCount = markMap.get(ownerId);
			if (markCount == null) {
				markCount = 0;
			}
			markMap.put(ownerId, markCount + 1);

			// also add all the Usage elements' IDs this decision class has
			// clientDepedencies to
			EList<Dependency> dependencies = clazz.getClientDependencies();
			for (Dependency d : dependencies) {
				ids.add(((XMLResource) d.eResource()).getID(d));
			}
		}
	}

	/**
	 * 
	 * Retrieve the list of diagrams in the model
	 * 
	 * @return EList The id(s) of the diagrams(s) found
	 */
	private EList<String> getDiagrams() {
		EList<String> ids = new BasicEList<String>();

		EList<Element> elements = getModel().allOwnedElements();

		for (Element element : elements) {
			// diagrams are stored as annotations in RSA
			// note:this code will need to be changed for Papyrus!
			if (element instanceof EAnnotation) {
				EAnnotation a = (EAnnotation) element;
				if ("uml2.diagrams".equals(a.getSource())) {
					ids.add(((XMLResource) a.eResource()).getID(a));
				}
			}
		}
		return ids;
	}

	/**
	 * 
	 * Retrieve the Feature(s) (list of Feature elements) for the Decision
	 * 
	 * @return EList The name(s) of the Feature(s) found
	 */
	private EList<String> getFeatureSet() {
		EList<String> fs = new BasicEList<String>();
		for (Relationship relationship : this.relationships) {
			if (relationship instanceof Usage) {
				EList<Element> targets = ((Usage) relationship).getTargets();
				for (Element target : targets) {
					fs.add(((Class) target).getName());
				}
			}
		}
		return fs;
	}

//	private void printElements(final String t, final Collection<Element> elements) {
//		System.out.println(t + ": " + elements.size());
//		for (Element re : elements) {		
//				System.out.println(re);
//				if (re instanceof NamedElement) {
//					if (((NamedElement)re).getQualifiedName()!=null) {
//						System.out.println("   QDN=" + ((NamedElement) re).getQualifiedName());
//					}
//				}
//		}
//	}
}
