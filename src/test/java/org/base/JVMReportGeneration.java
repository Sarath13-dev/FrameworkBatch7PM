package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportGeneration {

	public static void jvmReports(String json) {
		File file = new File(
				"C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberAfternoonBatch30\\CucumberReport");
		Configuration configuration = new Configuration(file, "Sample");
		configuration.addClassifications("platform", "windown-10");
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("Environment", "QA Eniv");
		configuration.addClassifications("Sprint No", "25");

		List<String> li = new ArrayList<>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}

}
