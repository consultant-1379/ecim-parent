package com.ericsson.ecim.m2t;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JetFileOutRegistry {
	public static final String TRANSFORM_ID = "transformID";
	private static final Map<String, List<String>> files;
	static{
		files = new HashMap<String, List<String>>();
	}
	/**
	 * All passed values with be appended to a string, and stored under their key
	 * @param key a key String
	 * @param values these will be turned in to Strings through .toString(), with some special, internal exceptions
	 */
	public final static void add(final String key, final Object... values){
		if(values == null) return;
		StringBuffer sb = new StringBuffer(128*values.length);
		for(Object o : values) sb.append(o.toString());
		add(key, sb.toString());
	}
	
	public final static void add(final String key, final String value){
		List<String> previousList = files.get(key);
		if(previousList != null){
			previousList.add(value);
		}
		else{
			List<String> newList = new ArrayList<String>();
			newList.add(value);
			files.put(key, newList);
		}
	}
	public final static List<File> get(final String key){
		List<String> stringList = files.get(key);
		List<File> returnList = new ArrayList<File>();
		
		if(stringList == null) return returnList;
		
		for(String fileString : stringList){
			File workspaceFile = new File(fileString);
			returnList.add(workspaceFile);
		}
		
		return returnList;//ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(files.get(key)));
	}
	public static final void remove(final String key){
		files.remove(key);
	}
	
	public final static Map<String,List<String>> getMap(){
		return files;
	}
}
