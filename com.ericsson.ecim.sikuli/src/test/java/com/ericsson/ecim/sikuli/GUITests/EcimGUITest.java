package com.ericsson.ecim.sikuli.GUITests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.script.*;

import com.ericsson.ecim.sikuli.GUITests.EclipseHandler;

public class EcimGUITest {

	private static Screen s;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		s = new Screen();
//		EclipseHandler.setScriptVariables();
//		EclipseHandler.setupWorkspace();
//		EclipseHandler.startEclipse(s);
//		EclipseHandler.setupModelView(s);
//		EclipseHandler.createNewProject(s, "Files");
//		EclipseHandler.setupFilefolder(s);
//		EclipseHandler.addPlantUMLView(s);
//		EclipseHandler.generateDetailedUML(s);
//		EclipseHandler.removeDuplicateProjectExplorer(s);
//	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//close eclipse here
	}

	@Before
	public void setUp() throws Exception {
//		EclipseHandler.collapseProject(s);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void TestUMLDirectory() throws FindFailed{
//		Match m;		
//		EclipseHandler.doubleClickFileFilder(s);
//		EclipseHandler.doubleClickSourceXMLFolder(s);
//		EclipseHandler.increaseProjectExplorerWidth(s);
//		m = s.exists("testUMLGeneration/uml.png");
//		EclipseHandler.decreaseProjectExplorWidth(s);
//		assertTrue("UML Directory not created", m != null);
//	}
//
//	@Test
//	public void TestIMGDirectory() throws FindFailed{
//		Match m;
//		EclipseHandler.doubleClickFileFilder(s);
//		EclipseHandler.doubleClickSourceXMLFolder(s);
//		EclipseHandler.doubleClickUMLFolder(s);
//		EclipseHandler.increaseProjectExplorerWidth(s);
//		m = s.exists("testUMLGeneration/img.png");
//		EclipseHandler.decreaseProjectExplorWidth(s);
//		assertTrue("IMG Directory not created", m != null);		
//	}

//	@Test
//	public void TestDetailedDiagramClasses() throws FindFailed, InterruptedException{
//		EclipseHandler.doubleClickFileFilder(s);
//		EclipseHandler.doubleClickSourceXMLFolder(s);
//		EclipseHandler.doubleClickUMLFolder(s);
//		EclipseHandler.increaseProjectExplorerWidth(s);
//
//		Match m;
//		m = s.wait("testUMLGeneration/com_ericsson_pul_detailed.png", 5);
//		m.doubleClick();
//		EclipseHandler.restorePlantUMLView(s);
//		try{
//			m = s.find("testUMLGeneration/plant_uml_unmarked.png");
//		}
//		catch(Exception e){
//			m = s.find("testUMLGeneration/plant_uml_marked.png");
//		}
//		m.doubleClick();
//		boolean result = EclipseHandler.testAllClasses(s);	
//		try{
//
//			m = s.find("testUMLGeneration/plant_uml_unmarked.png");
//		}
//		catch(Exception e){
//			m = s.find("testUMLGeneration/plant_uml_marked.png");
//		}
//		m.doubleClick();
//		s.wait("testUMLGeneration/plant_uml_marked.png", 2);	
//		s.wait("testUMLGeneration/plant_uml_marked.png", 2);	;
//		EclipseHandler.closeTab(s, "testUMLGeneration/com_ericsson_detail_tab.png");
//		assertTrue("Not enough classes generated", result);
//	}
//
//	@Test
//	public void TestDetailedDiagram() throws FindFailed, InterruptedException {
//		EclipseHandler.doubleClickFileFilder(s);
//		EclipseHandler.doubleClickSourceXMLFolder(s);
//		EclipseHandler.doubleClickUMLFolder(s);
//		EclipseHandler.increaseProjectExplorerWidth(s);
//
//		Match m, m2, vDrag, hDrag;
//		int zoom = 0;
//		m = s.wait("testUMLGeneration/com_ericsson_pul_detailed.png", 5);
//		m.doubleClick();
//		EclipseHandler.restorePlantUMLView(s);
//		try{
//			m = s.wait("testUMLGeneration/plant_uml_unmarked.png", 2);
//		}
//		catch(Exception e){
//			m = s.wait("testUMLGeneration/plant_uml_marked.png", 2);
//		}
//		m.doubleClick();
//
//		s.waitVanish("testUMLGeneration/project_explorer.png", 10);
//		m = s.wait("testUMLGeneration/zoom_out.png", 10);
//
//		while(true){
//			vDrag = s.exists("testUMLGeneration/drag.png", 0);
//			hDrag = s.exists("testUMLGeneration/drag_down.png", 0);		
//			if(vDrag == null && hDrag == null){ //zoomed out enough, break
//				break;
//			}
//			m.click();
//			zoom++;
//		}
//		m = s.exists("verifytest/detailed_model.png", 3);
//		m2 = s.find("testUMLGeneration/zoom_out.png");
//		for(int i=0;i<zoom;i++){
//			m2.click();
//		}
//		try{			
//			m = s.find("testUMLGeneration/plant_uml_unmarked.png");
//		}
//		catch(Exception e){
//			m = s.find("testUMLGeneration/plant_uml_marked.png");
//		}
//		m.doubleClick();
//		s.wait("testUMLGeneration/plant_uml_marked.png", 2);	;
//		EclipseHandler.closeTab(s, "testUMLGeneration/com_ericsson_detail_tab.png");
//		assertTrue("UML diagram not generated", m != null);
//	}
//
//	@Test
//	public void TestDiagramFilter() throws FindFailed, InterruptedException{
//		EclipseHandler.doubleClickFileFilder(s);
//		EclipseHandler.doubleClickSourceXMLFolder(s);
//		EclipseHandler.doubleClickUMLFolder(s);
//		EclipseHandler.increaseProjectExplorerWidth(s);
//
//		Match m, result;
//
//		m = s.find("testUMLGeneration/com_ericsson_ecim.png");
//		m.rightClick();
//		m = s.wait("testUMLGeneration/ecim_tool_chain.png", 4);
//		m.click();
//		m = s.wait("testUMLGeneration/generate_diagram_filter.png", 4);
//		m.click();
//		s.wait("testUMLGeneration/automatic_diagram_generator.png", 4);
//		m = s.find("testUMLGeneration/sub_tree_generator.png");
//		m.left().find("setupimg/radiobutton.png").click();
//		s.type(Key.TAB);
//		s.paste("MmasLoggerRoot");
//		m = s.wait("setupimg/OK_blue", 10);
//		m.click();
//		s.wait("testUMLGeneration/filter_generator.png", 20);
//		s.waitVanish("testUMLGeneration/filter_generator.png", 20);
//		s.doubleClick("testUMLGeneration/com_ericsson_mmas_detailed.png");
//		EclipseHandler.restorePlantUMLView(s);
//		try{
//			m = s.wait("testUMLGeneration/plant_uml_unmarked.png", 1);
//		}
//		catch(Exception e){
//			m = s.wait("testUMLGeneration/plant_uml_marked.png", 1);
//		}
//		m.doubleClick();		
//		s.waitVanish("testUMLGeneration/project_explorer.png", 10);
//		result = s.exists("verifytest/filter_model_detailed.png", 3);
//		try{			
//			m = s.find("testUMLGeneration/plant_uml_unmarked.png");
//		}
//		catch(Exception e){
//			m = s.find("testUMLGeneration/plant_uml_marked.png");
//		}
//		m.doubleClick();
//		s.wait("testUMLGeneration/plant_uml_marked.png", 2);
//
//		assertTrue("UML diagram not generated", result != null);		
//	}

	@Test
	public void simpleTest() {
		//		Match m = s.exists("verifytest/test.png", 5);
		//		assertTrue("Eclipse where not started!", m != null);
		assertTrue("One does simply not pass all unit tests",true);  //dummy
	}
	@Test
	public void simpleTest2() {
		//		Match m = s.exists("verifytest/test.png", 5);
		//		assertTrue("Eclipse where not started!", m != null);
		assertTrue("One does simply not pass all unit tests",false);  //dummy
	}

}
