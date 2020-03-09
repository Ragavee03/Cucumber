package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.base.Jvm;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "com.stepdefinition" }, monochrome = true, plugin = {
		"json:src\\test\\resources\\Reporting\\Cucumber.json" })
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		Jvm.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reporting\\Cucumber.json");

	}
}
