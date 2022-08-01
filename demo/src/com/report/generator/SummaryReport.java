package com.report.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.report.data.reader.DataReader;
import com.report.file.generator.ExcelGenerator;
import com.report.standard.StandardReport;

public class SummaryReport extends Report implements StandardReport {

	@Override
	public void generateReport(String filename,String[] columns,String outputFile) 
	{
		DataReader dataReaderObject = new DataReader();
		dataReaderObject.setFilename(filename);
		List<HashMap> report = dataReaderObject.readFile();
		List<HashMap> summaryReport = new ArrayList<>();
		HashMap<String,String> row = new HashMap<String,String>();
		row.put("Average", String.valueOf(calculateAverageGPA(report)));
		row.put("Total", String.valueOf(report.size()));
		summaryReport.add(row);
		ExcelGenerator.generateFile(summaryReport,columns,outputFile);
	}

	private float calculateAverageGPA(List<HashMap> report)
	{
		float sum = 0;
		float count = 0;
		
		for(int i=0 ; i<report.size() ; i++)
		{
			sum +=Float.parseFloat((String) report.get(i).get("GPA"));
			count+=1;
		}
		
		return sum/count;
		
	}
	
	
	
}
