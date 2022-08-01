package com.report.main;

import java.io.*;
import java.util.Properties;

import com.report.generator.DetailedReport;
import com.report.generator.SummaryReport;

public class ReportGenerationApp {

	private static String input_file;
	private static String detailed_output;
	private static String summary_output;
	private static String detailed_columns;
	private static String summary_columns;
	
	
	public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	
	
	private static void readInput(Properties prop)
	{
		input_file = prop.getProperty("input.filename");
		detailed_output  = prop.getProperty("detailed.output.filename");
		summary_output  = prop.getProperty("summary.output.filename");
		detailed_columns  = prop.getProperty("detailed.input.columns");
		summary_columns  = prop.getProperty("summary.input.columns");
	}
	
	
	
	public static void main(String[] args) {
		try {
			Properties prop = readPropertiesFile("src/Properties/application.properties");
			readInput(prop);
			String detailedColumns[] = detailed_columns.split(",");
			String summaryColumns[] = summary_columns.split(",");
			DetailedReport dr = new DetailedReport();
			dr.generateReport(input_file,detailedColumns,detailed_output);
			SummaryReport sr = new SummaryReport();
			sr.generateReport(input_file,summaryColumns,summary_output);
			
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
