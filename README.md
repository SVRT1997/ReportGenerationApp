# ReportGenerationApp
This project is a report generator app which takes json as input and gives a csv file as output.

#Install 2 jars - opencsv-5.6.jar and json-simple-1.1.jar and add it to the classpath

flow of the program:

ReportGenerationApp.java : main class

Filepath : demo/src/com/report/main/ReportGenerationApp.java
Description : Takes input from application.properties 

Give the following inputs in application.properties for the program to run

filepath: demo/src/Properties/application.properties

input.filename : input JSON file 
detailed.output.filename: filepath + file name of detailed report
summary.output.filename: filepath + file name of summary report
summary.input.columns: comma separated name of columns you want in the summary report
detailed.input.columns: comma separated name of columns you want in the detailed report







