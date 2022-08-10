package com.ui.poc.test.automation.steps;

import static com.ui.poc.test.automation.utils.WebdriverUtils.getDriverInstanceForChrome;
import static com.ui.poc.test.automation.utils.WebdriverUtils.getDriverInstanceForRemote;
import static com.ui.poc.test.automation.variables.DriverVariables.driverInstance;
import java.net.MalformedURLException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

	Scenario scenario;
	public static ExtentTest test;

	String BROWSER = System.getProperty("browserPlatform");
	//To Be Changed
	String username = "";
	String accessKey = "";
	
	@Before
	public void setup(Scenario scenario) throws MalformedURLException {
		this.scenario = scenario;
		if (driverInstance == null || driverInstance.toString().contains("null")) {

			if (BROWSER.equalsIgnoreCase("remote")) {

				driverInstance = getDriverInstanceForRemote();

			}

			else {

				driverInstance = getDriverInstanceForChrome();
			}
		}
		
		
	}
	

	@After
	public void tearDown() {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driverInstance).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName() + "Failure Screenshot");
		}
		driverInstance.close();
		driverInstance.quit();
	}

}
