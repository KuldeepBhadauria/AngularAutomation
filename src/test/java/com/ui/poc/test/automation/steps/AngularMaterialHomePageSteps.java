package com.ui.poc.test.automation.steps;

import com.ui.poc.test.automation.config.ConfigProvider;
import com.ui.poc.test.automation.impl.AppAccess;
import com.ui.poc.test.automation.pages.AngularMaterialHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AngularMaterialHomePageSteps {
	
	AppAccess appAccess = new AppAccess();
	ConfigProvider configProvider = new ConfigProvider();
	AngularMaterialHomePage angularMaterialHomePage = new AngularMaterialHomePage();
	
	
	@Given("^User is on Angular UI materials home page$")
	public void launchHomePage() {
		appAccess.launchApplication(configProvider.getProperty("angular.materials.homepage.url"));			   
	}
	
	@When("^User navigates to components page$")
	public void navigateToComponentsPage() {
		angularMaterialHomePage.navigateToComponents();
		
	}
	
	
	
	@When("^User accepts cookies$")
	public void accpetCookies() {
		angularMaterialHomePage.acceptCookiesOnHomePage();
		
	}
	

}
