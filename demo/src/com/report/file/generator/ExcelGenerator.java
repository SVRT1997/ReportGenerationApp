package com.report.file.generator;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

import com.opencsv.*;

public class ExcelGenerator {
	
	public static void generateFile(List<HashMap> report,String[] columns,String filePath)
	{
		File file = new File(filePath);
		try {
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter(file);
	  
	        // create CSVWriter object filewriter object as parameter
	        CSVWriter writer = new CSVWriter(outputfile,'|',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
	        List<String[]> data = new ArrayList<String[]>();
	        data.add(columns);
	        
	        for(int i=0 ; i< report.size() ; i++)
	        {
	        	String[] row = new String[columns.length];
	        	for(int j =0; j <columns.length;j++)
	        	{
	        		row[j] = (String)report.get(i).getOrDefault(columns[j],"");
	        	}
	        	data.add(row);
	        	
	        }
	        
	        System.out.println(data);
	        
	        
	        
	        
	        writer.writeAll(data);
	  
	        // closing writer connection
	        writer.close();
	        
	        
	        
		}
		catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
}
