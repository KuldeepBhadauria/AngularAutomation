package com.ui.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.ui.poc.test.automation.utils.WebdriverComponents;

public class CheckboxPage {
	
   WebdriverComponents webdriverComponents = new WebdriverComponents();
	

	public void clickCheckBox(String checkBoxName) throws Exception {
		By checkBox = By.xpath("//span[contains(.,'" + checkBoxName + "')]//parent::label//span//input");
		webdriverComponents.clickUsingJavaScript(checkBox);
	}
	
	public String validatecheckBoxChecked(String checkBoxName) {
		By checkBox = By.xpath("//span[contains(.,'" + checkBoxName + "')]//parent::label//span//input");
		return webdriverComponents.getAttributeValueText(checkBox, "aria-checked");
	}
}
