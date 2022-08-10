package com.ui.poc.test.automation.pages;

import org.openqa.selenium.By;

import com.ui.poc.test.automation.utils.WebdriverComponents;

public class FormFieldPage {
	
	   WebdriverComponents webdriverComponents = new WebdriverComponents();
		
	    private By inputTxtBox = By.xpath("(//input[contains(@id,'mat-input')])[1]");
	    private By drpDownArrow = By.xpath("(//div[contains(@id,'mat-select-value')]//following-sibling::div//div)[1]");
	    private By txtAreaField = By.xpath("(//textarea[contains(@id,'mat-input')])[1]");

		public void enterInputText(String text) {
			webdriverComponents.enterValue(inputTxtBox, text);
		}
		
		public void selectDropDownValue(String dropDownValueToSelect) {
			By dropDownValue = By.xpath("//span[contains(.,'"+ dropDownValueToSelect+"')]");
			webdriverComponents.clickWebElement(drpDownArrow);
			webdriverComponents.clickWebElement(dropDownValue);
			
		}
	
		public void enterTextInTextArea(String text) throws Exception {
			webdriverComponents.enterValue(txtAreaField, text);
		}

		public void navigateToLink(String linkName) {
			By linkNameLoc = By.xpath("//a[contains(.,'"+linkName+"')]");
			webdriverComponents.clickWebElement(linkNameLoc);
			
		}

		public String getPageUrl() {
			return webdriverComponents.getCurrentUrl();
		}

}
