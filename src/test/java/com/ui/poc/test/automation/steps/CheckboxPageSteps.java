package com.ui.poc.test.automation.steps;

import org.junit.Assert;
import com.ui.poc.test.automation.pages.CommonPage;
import com.ui.poc.test.automation.pages.CheckboxPage;
import io.cucumber.java.en.Then;

public class CheckboxPageSteps {
	
	CheckboxPage checkboxPage = new CheckboxPage();
	CommonPage commonPage = new CommonPage();
	
	@Then("^User clicks the \"(.*)\" checkbox$")
	public void clickOnCheckBox(String checkBoxName) throws Exception {
		commonPage.waitForElementToBeInteractable();
		checkboxPage.clickCheckBox(checkBoxName);		
	}
	
	@Then("^User validates that \"(.*)\" checkbox is selected$")
	public void validateCheckBoxChecked(String checkBoxName) throws InterruptedException {
		commonPage.waitForElementToBeInteractable();
		Assert.assertTrue(checkBoxName + " CheckBox is not selected", checkboxPage.validatecheckBoxChecked(checkBoxName).equalsIgnoreCase("true"));		
	}
	
	@Then("^User validates that \"(.*)\" checkbox is not selected$")
	public void validateCheckBoxNotChecked(String checkBoxName) throws InterruptedException {
		commonPage.waitForElementToBeInteractable();
		Assert.assertTrue(checkBoxName + " CheckBox is selected", checkboxPage.validatecheckBoxChecked(checkBoxName).equalsIgnoreCase("false"));		
	}
	
	

}
