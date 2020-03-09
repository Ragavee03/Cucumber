package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Jvm {

	public static void generateJvmReport(String jsonFile) {
		File loc= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");
				
	Configuration con= new Configuration(loc,"Adactin hotel booking app");
	con.addClassifications("OS","Windows10");
	con.addClassifications("BrowserName","Chrome");
	con.addClassifications("version","79");

	List<String> jsonFiles= new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder= new ReportBuilder(jsonFiles,con);
	builder.generateReports();
					
	}
}
