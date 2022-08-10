package com.ui.poc.test.automation.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.ui.poc.test.automation.steps", plugin = {
		"pretty", "html:target/htmlReports/poc-test-automation-reports.html", "json:target/cucumber.json",
		"junit:target/junitReports/poc-test-automation-reports.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
        tags = "@angularUI",
		// tags = "@gui or @Regression",
		// tags = "(@gui or @Regression) and @Smoke",
		// tags = "(@gui or @Regression) and not @Smoke",
		monochrome = true)

public class TestRunner {
	
}
