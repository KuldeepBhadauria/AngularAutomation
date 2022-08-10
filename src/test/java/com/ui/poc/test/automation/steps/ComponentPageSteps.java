package com.ui.poc.test.automation.steps;

import org.junit.Assert;

import com.ui.poc.test.automation.config.ConfigProvider;
import com.ui.poc.test.automation.pages.CommonPage;
import com.ui.poc.test.automation.pages.ComponentPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComponentPageSteps {
	
	ConfigProvider configProvider = new ConfigProvider();
	ComponentPage componentPage = new ComponentPage();
	CommonPage commonPage = new CommonPage();
	
	@Then("^User validates that components home page is displayed$")
	public void validateUserOnComponentHomePage() throws InterruptedException {
		commonPage.waitForPageLoadToComplete();
		String expectedText = configProvider.getProperty("components.page.header");
		String actualText = componentPage.getComponentPageHeaderText().trim();
		Assert.assertTrue("User not landed on Componets page, Expected Header is: " +  expectedText+ " while actual header displayed is: " + actualText ,
				actualText.contains(expectedText));
		
	}
	
	@When("^User navigates to component (.*) tab from left navigation bar$")
	public void navigateToTab(String componentName) throws InterruptedException {
          componentPage.navigateToComponent(componentName);
		
	}
	
	@When("^User navigates to \"(.*)\" component from left navigation bar$")
	public void navigateToTabFromLeftBar(String componentName) throws InterruptedException {
          componentPage.navigateToComponent(componentName);
		
	}

	
	@Then("^User validates that user landed on component page with title (.*)$")
	public void validateUserOnComponentSpecificPage(String componentPageTitle) throws InterruptedException {
		commonPage.waitForPageLoadToComplete();
		String expectedTitle = componentPageTitle;
		String actualTitle = componentPage.getPageTitle();
		Assert.assertTrue("User not landed on page: " + componentPageTitle + ", Expected Title is: " +  expectedTitle+ " while actual Title is: " + actualTitle ,
				actualTitle.contains(expectedTitle));
		
	}
	
	@Then("^User validates that user landed on component with title \"(.*)\"$")
	public void validateUserOnComponentTab(String componentPageTitle) throws InterruptedException {
		commonPage.waitForPageLoadToComplete();
		String expectedTitle = componentPageTitle;
		String actualTitle = componentPage.getPageTitle();
		Assert.assertTrue("User not landed on page: " + componentPageTitle + ", Expected Title is: " +  expectedTitle+ " while actual Title is: " + actualTitle ,
				actualTitle.contains(expectedTitle));
		
	}
	
	
	@Then("^User validates that page header is displayed as (.*)$")
	public void validateComponentPageHeader(String headerText) throws InterruptedException {
		commonPage.waitForPageLoadToComplete();
		String expectedHeaderText = headerText;
		String actualHeaderText = componentPage.getComponentSpecificHeaderText();
		Assert.assertTrue("Header not displayed as expected: " + expectedHeaderText + ", Expected Text is: " +  expectedHeaderText+ " while actual Title is: " + actualHeaderText ,
				actualHeaderText.contains(expectedHeaderText));
		
	}

	
}
