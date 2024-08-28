package com.ericsson.ecim.sikuli.GUITests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



import org.sikuli.basics.Settings;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Mouse;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class EclipseHandler {
	private static final String WORKSPACENAME = "\\@@@123workspace_test";
	private static final String MODELNAME = 
			"com.ericsson.ecim.swtbot.tests-TestModels-MMAS-MMAS_Model_output-MP-MMAS_Model_DWAXE_mp.xml";
	private static final String DTDNAME = "mp.dtd";
	private static final int CORES = 4;
	private static final int CLASSES = 44;
	private static final String ECLIPSELOCATION = "C:\\Users\\ejnnnos\\eclipse-standard-luna-R-win32-x86_64\\eclipse\\eclipse.exe";


	public static void setScriptVariables(){
		Settings.MinSimilarity = 0.85;
		Settings.MoveMouseDelay = 0;
		Settings.ActionLogs = false;
		Settings.AutoWaitTimeout = 1;
		Settings.ClickDelay = 0.0;
	}

	public static void setupWorkspace() throws IOException{
		StringBuilder strb = new StringBuilder(System.getProperty("user.home"));
		strb.append(WORKSPACENAME);

		File f = new File(strb.toString());	
		if(f.isDirectory()){
			delete(f); // TODO : try/catch?
			f.mkdir();
		}
		else{
			f.mkdir();
		}
		strb = new StringBuilder(System.getProperty("user.home"));
		strb.append("\\Testmodel\\");
		StringBuilder strb2 = new StringBuilder(strb.toString());
		strb2.append(DTDNAME);
		strb.append(MODELNAME);
		copyXMLFile(strb.toString());
		copyDTDFile(strb2.toString());		
	}

	public static void addPlantUMLView(Screen s) throws FindFailed, InterruptedException{
		Match m;
		if(s.exists("testUMLGeneration/plant_uml_unmarked.png") == null){
			s.click("setupimg/Window.png");
			m = s.wait("setupimg/show_view.png");
			m.click();
			s.hover("setupimg/mma_activation.png");
			s.click("setupimg/other_window.png");
			s.wait("setupimg/show_view_window.png", 15);
			s.paste("PlantUML");
			m = s.wait("setupimg/plant_uml.png", 10);
			//m.doubleClick();
			s.type(Key.ENTER);
		}
	}

	public static void startEclipse(Screen s) throws FindFailed, InterruptedException{
		Match match;
		StringBuilder strb = new StringBuilder(System.getProperty("user.home"));
//		s.click("setupimg/window_logo.png");
//		s.type("Eclipse");
//		Thread.sleep(400);
//		match = s.exists("setupimg/eclipse.png");
//		if(match == null){ 
//			throw new FindFailed("Cant find eclipse!");
//		}
//		else{
//			//System.out.println("Found eclipse!");
//			match.click();
//		}
		
		
		App eclipse = App.open(ECLIPSELOCATION);
		

		Thread.sleep(5);
		match = s.wait("setupimg/workspace.png", 35); //If eclipse not started within 40(!) sec we break it. 

		strb.append(WORKSPACENAME);		
		Region r = match.below(100);
		r = r.find("setupimg/workspace_label.png").right(100); //Find the workspace textbox - click, mark and remove text.
		r.click(); 
		Thread.sleep(100);
		r.type("a", Key.CTRL);
		r.type(Key.BACKSPACE);
		r.paste(strb.toString()); //insert path to the created empty folder.
		Thread.sleep(100);
		r.type(Key.ENTER);		

		match = s.wait("setupimg/eclipse_welcome.png", 25);  // TODO : wait 20 sec for eclipse to load - better solution? use 30? 40?

		match = s.find("setupimg/welcome.png");
		match.click("setupimg/welcome_cross.png");
		s.find("setupimg/java_eclipse.png").right().find("setupimg/fullscreen.png").click(); //put eclipse in full screen
		Thread.sleep(1000);		
	}
	
	public static void closeTab(Screen s, String image) throws FindFailed{
		Match m = s.find(image);
		m.click("setupimg/welcome_cross.png");
		s.waitVanish(image);
	}

	public static void startEclipseAgain(Screen s) throws FindFailed, InterruptedException{
		Match match;
		StringBuilder strb = new StringBuilder(System.getProperty("user.home"));
		s.click("setupimg/window_logo.png");
		s.type("Eclipse");
		Thread.sleep(400);
		match = s.exists("setupimg/eclipse.png");
		if(match == null){ 
			System.out.println("Can't find eclipse!"); //TODO change this, probably to some wait for picture to appear solution.
			throw new FindFailed("Could not find eclipse!");
		}
		else{
			//System.out.println("Found eclipse!");
			match.click();
		}


		Thread.sleep(5);
		match = s.wait("setupimg/workspace.png", 35); //If eclipse not started within 40(!) sec we break it. 

		strb.append(WORKSPACENAME);		
		Region r = match.below(100);
		r = r.find("setupimg/workspace_label.png").right(100); //Find the workspace textbox - click, mark and remove text.
		r.click(); 
		Thread.sleep(100);
		r.type("a", Key.CTRL);
		r.type(Key.BACKSPACE);
		r.paste(strb.toString()); //insert path to the created empty folder.
		Thread.sleep(100);
		r.type(Key.ENTER);

		s.wait("testUMLGeneration/eclipse_loading.png", 15);
		s.waitVanish("testUMLGeneration/eclipse_loading.png", 20);
	}	

	public static void increaseProjectExplorerWidth(Screen s) throws FindFailed{
		Match m;
		m = s.find("testUMLGeneration/project_directory.png");
		m.doubleClick();
		s.waitVanish("testUMLGeneration/mma_guidance.png");
	}

	public static void decreaseProjectExplorWidth(Screen s) throws FindFailed {
		Match m;
		collapseProject(s);
		m = s.find("testUMLGeneration/project_directory.png");
			m.doubleClick();
		s.wait("testUMLGeneration/mma_guidance.png");
	}

	public static void restorePlantUMLView(Screen s) throws FindFailed{
		Match m;
		m = s.wait("testUMLGeneration/plantUMLToolbox.png", 4);		
		m.find("testUMLGeneration/restore_uml.png").click();
		s.waitVanish("testUMLGeneration/plantUMLToolbox.png",10);
//		m = s.exists("testUMLGeneration/mma_problems.png");
	}

	public static void collapseProject(Screen s) throws FindFailed{
		Match m;
		try{
			m = s.find("testUMLGeneration/project_explorer.png");
		}
		catch(FindFailed f){
			m = s.find("testUMLGeneration/project_explorer_unmarked.png");
		}
		m.click();
		try{
			m = s.find("setupimg/collapse.png");
		}
		catch(FindFailed f){
			m = s.find("setupimg/collapse_marked.png");
		}
		m.click();
	}

	public static void doubleClickFileFilder(Screen s) throws FindFailed{
		Match m;

		double tempSim = Settings.MinSimilarity;
		Settings.MinSimilarity = 0.70;		
		try{
			m = s.find("setupimg/files_project_unmarked.png");			
		}
		catch(FindFailed f){
			m = s.find("setupimg/files_project");
		}
		Settings.MinSimilarity = tempSim;
		m.doubleClick();
	}

	public static void doubleClickSourceXMLFolder(Screen s) throws FindFailed{
		Match m;

		double tempSim = Settings.MinSimilarity;
		Settings.MinSimilarity = 0.70;		
		try{
			m = s.find("testUMLGeneration/source_xml.png");			
		}
		catch(FindFailed f){
			m = s.find("testUMLGeneration/source_xml_marked.png");
		}
		Settings.MinSimilarity = tempSim;
		m.doubleClick();
	}

	public static void doubleClickUMLFolder(Screen s) throws FindFailed{
		Match m;
		double tempSim = Settings.MinSimilarity;
		Settings.MinSimilarity = 0.70;		
		try{
			m = s.find("testUMLGeneration/uml.png");			
		}
		catch(FindFailed f){
			m = s.find("testUMLGeneration/uml_marked.png");
		}
		Settings.MinSimilarity = tempSim;
		m.doubleClick();
	}

	public static void setupModelView(Screen s) throws FindFailed, InterruptedException{
		Match m; //TODO : Find some kind of way to wait for fullscreen
		s.click("setupimg/Window.png");
		Thread.sleep(400);
		s.click("setupimg/open_perspective.png");
		Thread.sleep(150);
		s.click("setupimg/other_window.png"); //We might have to move to the right and then down.
		Thread.sleep(300);
		double tempSim = Settings.MinSimilarity;
		Settings.MinSimilarity = 0.95;
		m = s.find("setupimg/metamodelagent_perspective.png");
		Settings.MinSimilarity = tempSim;
		m.doubleClick();
		Thread.sleep(1000); // TODO : Find some workaround..?
	}

	public static void copyXMLFile(String filePath) throws IOException{
		StringBuilder dst = new StringBuilder(System.getProperty("user.home"));	
		dst.append(WORKSPACENAME);
		dst.append("\\sourceXML");
		File dir = new File(dst.toString());
		dir.mkdir();
		dst.append("\\" + MODELNAME);
		File srcFile = new File(filePath);
		File dstFile = new File(dst.toString());
		copyFile(srcFile, dstFile);
	}

	public static void setupFilefolder(Screen s) throws FindFailed, InterruptedException{
		Match m;
		Region r;
		StringBuilder str = new StringBuilder(System.getProperty("user.home"));	
		s.wait("setupimg/files_project.png", 15);
		s.rightClick("setupimg/files_project.png");
		m = s.wait("setupimg/new_no_shortcommand.png" ,15);
		m.click();
		s.hover("setupimg/project.png");
		s.click("setupimg/folder.png");
		s.click("setupimg/advanced.png");
		m = s.find("setupimg/link_to_alt.png");
		m.left().click("setupimg/radiobutton.png");
		Thread.sleep(150);
		r = s.find("setupimg/browse.png").left();
		r.click("setupimg/textbox.png");
		str.append(WORKSPACENAME);
		str.append("\\sourceXML");
		r.paste(str.toString());
		s.click("setupimg/finish_blue.png");
	}

	public static void removeDuplicateProjectExplorer(Screen s) throws InterruptedException, FindFailed{
		Match m, unmarked;

		unmarked = s.exists("testUMLGeneration/project_explorer_unmarked.png");
		if(unmarked != null){
			unmarked.click();
			Thread.sleep(300);
			unmarked.find("setupimg/welcome_cross.png").click();				
		}
		s.click("setupimg/Window.png");
		m = s.wait("setupimg/show_view.png");
		m.click();
		s.hover("setupimg/mma_activation.png");
		s.click("setupimg/other_window.png");
		s.wait("setupimg/show_view_window.png", 15);
		s.paste("Project Explorer");
		m = s.wait("setupimg/project_explorer.png", 10);
		//m.doubleClick();
		s.type(Key.ENTER);
		s.wait("testUMLGeneration/project_explorer.png");
	}

	public static void generateDetailedUML(Screen s) throws FindFailed, InterruptedException{
		Match m;
		m = s.wait("testUMLGeneration/source_xml.png", 15);
		m.click("testUMLGeneration/white_arrow_down.png");
		s.wait("testUMLGeneration/xml_icon.png", 15);
		Iterator<Match> matches =  s.findAll("testUMLGeneration/xml_icon.png");
		while(matches.hasNext()){ //If there exist more xml-files -> find correct one
			m = matches.next();
			m = m.right().find("testUMLGeneration/com_ericsson_xml.png"); 
			if(m != null){
				break;
			}
		}
		m.rightClick();
		m = s.wait("testUMLGeneration/ecim_tool_chain.png", 15);
		m.click();	
		m = s.wait("testUMLGeneration/generate_brief_diagram.png", 15);
		m.hover();
		Mouse.move(-5, 0);
		s.click("testUMLGeneration/generate_diagram.png");
		s.wait("testUMLGeneration/automatic_diagram_generator.png");
		s.click("testUMLGeneration/OK_blue.png");
		s.wait("testUMLGeneration/diagram_generator.png", 15);
		m = s.exists("testUMLGeneration/diagram_generator");
		while(m != null){ //Search for picture once every second
			Thread.sleep(1000);
			m = s.exists("testUMLGeneration/diagram_generator");
		}
	}

	public static void createNewProject(Screen s, String projectName) 
			throws FindFailed, InterruptedException{ 
		Match m;

		s.wait("setupimg/file.png", 15);
		s.click("setupimg/file.png");
		m = s.wait("setupimg/new.png", 15);
		m.click();
		m = s.wait("setupimg/project.png");
		m.click();
		s.wait("setupimg/new_project_wizard.png", 15);
		s.paste("Project");
		m = s.wait("setupimg/project_view_project.png", 15);
		m.doubleClick();
		s.wait("setupimg/new_project_resource.png", 15);
		Thread.sleep(200);
		s.paste(projectName);
		s.type(Key.ENTER);	
	}

	public static boolean testAllClasses(Screen s) throws FindFailed, InterruptedException{
		Region r;
		int start, end, offset = 0;
		StringBuilder str = new StringBuilder(System.getProperty("user.home"));		
		str.append("\\workspace\\ETMenuTester");
		str.append("\\verifytest\\detailed_UML_classes\\");
		String classImg[] = new String[CLASSES]; 
		Thread[] workers = new Thread[CORES];	
		int found[] = new int[CLASSES]; //0 = not found, 1 = found

		for(int i = 1; i<CLASSES + 1 ; i++){
			classImg[i - 1] = str.toString() + Integer.toString(i) + ".png";
			found[i - 1] = 0;
		}

		Thread.sleep(5000); //
		r = createSearchRegion(s);

		offset = CLASSES/CORES; //CAUTION, WHAT IF UNEVEN? 
		for(int i = 0; i < CORES; i++){
			start = i*offset;
			end = start+offset;
			workers[i] = new ScreenFinder(r, start, end, classImg, found);
		}

		scanScreenParallel(workers); //scan
		s.dragDrop("testUMLGeneration/drag.png", "testUMLGeneration/drag_to.png");		//move right
		scanScreenParallel(workers);  //scan
		s.dragDrop("testUMLGeneration/drag_down.png", "testUMLGeneration/arrow_down"); //move down
		scanScreenParallel(workers);  //scan
		s.dragDrop("testUMLGeneration/drag.png", "testUMLGeneration/arrow_left"); //move left
		scanScreenParallel(workers);  //scan

		int occ = 0;
		for(int i = 0; i < CLASSES ; i++){
			if(found[i] == 1){
				occ++;
			}
		}
		return occ == CLASSES;
	}

	static Region createSearchRegion(Screen s) throws FindFailed{
		Match expleft = s.find("testUMLGeneration/mma_problems.png");
		Match expright = expleft.right().find("testUMLGeneration/restore.png");
		Match bottom = expleft.below().find("testUMLGeneration/left_corner.png");
		int x = expleft.getX();
		int y = expleft.getY();
		int w = expright.getTopRight().getX() - expleft.getX();
		int h = bottom.getBottomLeft().getY() - expleft.getY();
		return new Region(x, y , w, h);
	}

	static void scanScreenParallel(Thread[] workers) throws InterruptedException{
		ExecutorService executor = Executors.newFixedThreadPool(CORES);

		for(int i = 0; i<CORES; i++){
			//workers[i].run();
			executor.execute(workers[i]);
		}
		executor.shutdown();
		executor.awaitTermination(2, TimeUnit.MINUTES);
	}

	public static void copyDTDFile(String path) throws IOException{ // TEMPORARY UNTIL BUGFIX (ET)
		StringBuilder dst = new StringBuilder(System.getProperty("user.home"));	
		dst.append(WORKSPACENAME);
		dst.append("\\sourceXML");
		File dir = new File(dst.toString());
		dir.mkdir();
		dst.append("\\" + DTDNAME);
		File srcFile = new File(path);
		File dstFile = new File(dst.toString());
		copyFile(srcFile, dstFile);
	}

	static void delete(File f) throws IOException {
		if (f.isDirectory()) {
			for (File c : f.listFiles())
				delete(c);
		}
		if (!f.delete())
			throw new FileNotFoundException("Failed to delete file: " + f);
	}

	static void copyFile(File src, File dst) throws IOException{
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);
		int len = 0;
		byte buf[] = new byte[1024];
		while( (len = in.read(buf)) > 0){
			out.write(buf, 0 , len);
		}
		in.close();
		out.close();
	}
}
