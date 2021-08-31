package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGenerationss {

	public static void generateJvmReport(String jsonFile) {

		File file = new File(
				"C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberAfternoonBatch30\\target\\CucumberReport");

		Configuration configuration = new Configuration(file, "Sample Project");
		configuration.addClassifications("Platform", "Win 10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Sprint No", "23");

		List<String> li = new ArrayList<>();
		li.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}
}
