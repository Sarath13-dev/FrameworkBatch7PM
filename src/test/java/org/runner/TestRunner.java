package org.runner;

import org.base.JVMReportGeneration;
import org.base.ReportGenerationss;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//resources//Sample.feature" }, glue = {
		"org.stepdef" }, monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
				"html:C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberAfternoonBatch30\\target",
				"json:C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberAfternoonBatch30\\target\\fb.json",
				"junit:C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberAfternoonBatch30\\target\\fb.xml",
				"json:C:\\\\Users\\\\RAM SARATH KUMAR\\\\eclipse-workspace\\\\CucumberAfternoonBatch30\\\\target\\\\CucumberReport\\\\sample.json",
				"json:C:\\\\Users\\\\RAM SARATH KUMAR\\\\eclipse-workspace\\\\CucumberAfternoonBatch30\\\\CucumberReport\\\\sample.json" })

public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReportGeneration.jvmReports(
				"C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberAfternoonBatch30\\CucumberReport\\sample.json");
	}

}
