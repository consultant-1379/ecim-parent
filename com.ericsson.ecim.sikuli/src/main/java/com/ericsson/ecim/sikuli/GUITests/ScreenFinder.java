package com.ericsson.ecim.sikuli.GUITests;
import org.sikuli.script.*;



public class ScreenFinder extends Thread {

	Region s;
	int start;
	int end;
	String[] classImg;
	int[] found;

	public ScreenFinder(Region s, int start, int end, String[] classImg, int[] found) {
		super();
		this.s = s;
		this.start = start;
		this.end = end;
		this.classImg = classImg;
		this.found = found;
	}

	public void run(){
		Match m;
		//System.out.println("THREAD: " + getId() + ", start: " + start + ", end: " + end);		
		for(int i =start; i<end ; i++){
			//System.out.println(i);
			if(found[i] == 0){
				m = s.exists(classImg[i], 0);
				if(m != null){
					found[i] = 1;
				}
			}
		}
	}

}
