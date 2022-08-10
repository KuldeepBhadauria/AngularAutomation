package com.ui.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.ui.poc.test.automation.utils.WebdriverComponents;

public class AngularMaterialHomePage {
	
    WebdriverComponents webdriverComponents = new WebdriverComponents();
	
    private By componentsTab = By.xpath("(//span[@class='mat-button-wrapper' and contains(.,'Components')])[1]");
    private By acceptCookiesBtn = By.xpath("//span[contains(.,'Ok, Got it')]");


	public void navigateToComponents() {
		webdriverComponents.clickWebElement(componentsTab);
		
	}


	public void acceptCookiesOnHomePage() {
		webdriverComponents.clickWebElement(acceptCookiesBtn);
		
	}

}
