package com.ui.poc.test.automation.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import com.ui.poc.test.automation.pages.CommonPage;
import com.ui.poc.test.automation.pages.FormFieldPage;
import com.ui.poc.test.automation.utils.DataReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormFieldPageSteps {
	
	FormFieldPage formFieldPage = new FormFieldPage();
	CommonPage commonPage = new CommonPage();
	DataReader dataReader = new DataReader();
	public static String currentWorkingDirectory = System.getProperty("user.dir");
	
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
	
	@When("User fills the field form component field from sheet name {string} and row number {int}")
	public void fillFormDataBasedOnSheetNameAndRowNum(String sheetName, int rowNumber) throws Exception {
		//List <Map<String,String>> inputData = dataReader.getData(currentWorkingDirectory + "/src/test/resources/testData/AutomationTestData.xlsx", sheetName);
		List <Map<String,String>> inputData = dataReader.getData("C:/Users/Dell/Desktop/AutomationTestData.xlsx", sheetName);
		
		String inputText = inputData.get(rowNumber).get("InputFieldValue");
		String dropDownValue = inputData.get(rowNumber).get("DropDownValue");
		String textAreaTextext = inputData.get(rowNumber).get("TextAreaText");
		formFieldPage.fillFormData(inputText, dropDownValue, textAreaTextext);
		dataReader.closeWorbook(currentWorkingDirectory + "/src/test/resources/testData/AutomationTestData.xlsx");
				
	}
	
	
	

}
