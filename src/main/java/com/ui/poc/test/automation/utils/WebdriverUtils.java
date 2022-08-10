package com.ui.poc.test.automation.utils;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebdriverUtils {
	
	public static WebDriver driver;
	public static String currentWorkingDir = System.getProperty("user.dir");
	// Should be changed
	public static final String username = "";
	public static final String accessKey = "";
	public static final String URL = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
	
	/**
	 * Method to create a driver instance
	 * @return driver
	 *
	 */
	public static WebDriver getDriverInstanceForChrome() {
		System.setProperty("webdriver.chrome.driver",
				currentWorkingDir + "/src/test/resources/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 return driver;		
	}
	
	/**
	 * Method to create a remote driver instance
	 * @return driver
	 * @throws MalformedURLException 
	 *
	 */
	public static WebDriver getDriverInstanceForRemote() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("project", "Angular UI Automation");
		caps.setCapability("build", "1.0");
		caps.setCapability("name", "Automation Tests");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.console", "info");
		caps.setCapability("browserstack.selenium_version", "3.141.59");
		URL browserstackurl = new URL(URL);
		driver = new RemoteWebDriver(browserstackurl, caps);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;		
	}
	
}