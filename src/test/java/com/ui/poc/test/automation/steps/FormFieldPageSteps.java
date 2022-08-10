package com.ui.poc.test.automation.steps;

import org.junit.Assert;
import com.ui.poc.test.automation.pages.CommonPage;
import com.ui.poc.test.automation.pages.FormFieldPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormFieldPageSteps {
	
	FormFieldPage formFieldPage = new FormFieldPage();
	CommonPage commonPage = new CommonPage();
	
	@When("^User enters text \"(.*)\" in the input field$")
	public void enterInInputField(String text) throws Exception {
		commonPage.waitForElementToBeInteractable();
		formFieldPage.enterInputText(text);
		
	}
	
	@When("^User selects \"(.*)\" from the dropdown$")
	public void selectFromDropDown(String value) throws Exception {
		commonPage.waitForElementToBeInteractable();
		formFieldPage.selectDropDownValue(value);		
	}
	
	@When("^User enters \"(.*)\" in text area field$")
	public void enetrValueInTextArea(String text) throws Exception {
		commonPage.waitForElementToBeInteractable();
		formFieldPage.enterTextInTextArea(text);		
	}
	
	@When("^User navigates to \"(.*)\" tab$")
	public void navigateToTab(String linkName) throws Exception {
		commonPage.waitForElementToBeInteractable();
		formFieldPage.navigateToLink(linkName);		
	}
	
	@Then("User validates \"(.*)\" page is displayed$")
	public void validatePageUrl(String pageName) throws Exception {
		commonPage.waitForPageLoadToComplete();
		String actualUrl = formFieldPage.getPageUrl();
		String expectedTextInUrl = pageName;
		Assert.assertTrue("User not landed on page: " + pageName,
				actualUrl.contains(expectedTextInUrl));
	}
	
	
	

}
