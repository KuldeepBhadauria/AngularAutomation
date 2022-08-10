package com.ui.poc.test.automation.pages;

public class CommonPage {
	
	
	public void waitForPageLoadToComplete() throws InterruptedException {
		Thread.sleep(2000);
	}

	
	public void waitForElementToBeInteractable() throws InterruptedException {
		Thread.sleep(1000);
	}
}
