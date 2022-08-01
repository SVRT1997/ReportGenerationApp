Readme
This project is a report generator app which takes json as input and gives a csv file as output.

#Install 2 jars - opencsv-5.6.jar and json-simple-1.1.jar and add it to the classpath


Java files

ReportGenerationApp.java : Main Class

	link: https://github.com/SVRT1997/ReportGenerationApp/blob/main/demo/src/com/report/main/ReportGenerationApp.java
	Description: 
		1. Takes input parameters from application.properties. 
		2. Creates Objects for DetailedReport and SummaryReport and calls the function to generate report for both of them



application.properties:
	link: https://github.com/SVRT1997/ReportGenerationApp/tree/main/demo/src/Properties
	Description:
	 Contains input parameters:
		1. input.filename : input JSON file
		2. detailed.output.filename: filepath + file name of detailed report
		3. summary.output.filename: filepath + file name of summary report
		4. summary.input.columns: comma separated name of columns you want in the summary report
		5. detailed.input.columns: comma separated name of columns you want in the detailed report

DetailedReport.java
SummaryReport.java
	
	link: https://github.com/SVRT1997/ReportGenerationApp/tree/main/demo/src/com/report/generator
	Description :
		1. Both work in the same manner.
		2. Both extend Report.java and implement StandardReport.java
		3. DataReader object is created to read data from json.
		4. FileGenerator object is created to generate csv file


StandardReport.java
	link : https://github.com/SVRT1997/ReportGenerationApp/tree/main/demo/src/com/report/standard
	Description:
		1. Interface for Reports.

DataReader.java
	link: https://github.com/SVRT1997/ReportGenerationApp/tree/main/demo/src/com/report/data/reader
	Description:
		1. Reads data from json and returns the data. <can you database for the reader>
		2. Needs filename and columns for this DataReader to work

ExcelGenerator.java
	link: https://github.com/SVRT1997/ReportGenerationApp/tree/main/demo/src/com/report/file/generator
	Description: 
		1. generates CSV file from using the data provided with the outputfile name and location




