package com.report.data.reader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class DataReader {
	
	private String filename;
	private List columns;

	public List getColumns() {
		return columns;
	}

	public void setColumns(List columns) {
		this.columns = columns;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public List<HashMap> readFile()
	{
		List<HashMap> finalList = new ArrayList<HashMap>();
		JSONParser parser = new JSONParser();
	    try 
	    {
	    	Object obj = parser.parse(new FileReader(filename));
	    	JSONArray jsonArray = (JSONArray) obj;
	    	
	    	
	    	Iterator iterator = jsonArray.iterator();
	    	
	        while (iterator.hasNext()) {
	        	HashMap<String, String> output = new HashMap<String, String>();
	        	JSONObject jsonObject = (JSONObject) iterator.next();
	        	Set<String> keys = jsonObject.keySet();
	        	for(String key : keys)
	        	{
	        		output.put(key, (String) jsonObject.get(key));
	        	}
	        	finalList.add(output);
	        }
	        
	       
	        
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    finally{
	    	return finalList;
	    	
	    }
		
	}
	

	

}
