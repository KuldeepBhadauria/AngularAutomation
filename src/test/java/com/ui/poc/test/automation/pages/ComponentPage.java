package com.ui.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.ui.poc.test.automation.utils.WebdriverComponents;

public class ComponentPage {
	
WebdriverComponents webdriverComponents = new WebdriverComponents();
	
    private By componentHeaderTxt = By.xpath("//h1");
    private By specificComponentPageHeaderTxt = By.xpath("(//h3[@class='docs-header-link'])[1]");
	

	public String getComponentPageHeaderText() {
		String text = webdriverComponents.getText(componentHeaderTxt);
		return text;
	}


	public void navigateToComponent(String componentName) {
		By componentTablnk = By.xpath("//span[@class='mat-list-item-content' and contains(.,'" + componentName + "')]");
		webdriverComponents.clickWebElement(componentTablnk);
		
	}


	public String getPageTitle() {		
		String actualTitle = webdriverComponents.getPageTitle();
		return actualTitle.trim();

	}


	public String getComponentSpecificHeaderText() {
		String actualHeader = webdriverComponents.getText(specificComponentPageHeaderTxt);
		return actualHeader.trim();
	}

}
