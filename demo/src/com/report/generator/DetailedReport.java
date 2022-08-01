package com.report.generator;

import java.util.HashMap;
import java.util.List;

import com.report.data.reader.DataReader;
import com.report.file.generator.ExcelGenerator;
import com.report.standard.StandardReport;

public class DetailedReport extends Report implements StandardReport{

	
	@Override
	public void generateReport(String filename,String[] columns,String outputFile) {
		DataReader dataReaderObject = new DataReader();
		dataReaderObject.setFilename(filename);
		List<HashMap> report = dataReaderObject.readFile();
		ExcelGenerator.generateFile(report,columns,outputFile);
		
		
	}
	
	
	

}
