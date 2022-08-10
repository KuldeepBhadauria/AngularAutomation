package com.ui.poc.test.automation.utils;

import static com.ui.poc.test.automation.variables.DriverVariables.driverInstance;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverComponents {
	
	public String getPageTitle() {
		return driverInstance.getTitle();
	}
	
	public String getCurrentUrl() {
		return driverInstance.getCurrentUrl();
	}

	public void navigateToUrl(String url) {
		driverInstance.navigate().to(url);
	}

	public void navigateBack() {
		driverInstance.navigate().back();
	}
	
	public void refreshPage() {
		driverInstance.navigate().refresh();
	}

	public void clickWebElement(By webElement) {
		driverInstance.findElement(webElement).click();
	}
	
	public void clickUsingJavaScript(By webElement) throws Exception {
		WebElement element = driverInstance.findElement(webElement);
		JavascriptExecutor executor = (JavascriptExecutor) driverInstance;
		executor.executeScript("arguments[0].click();", element);

	}

	public void enterValue(By webElement, String value) {
		driverInstance.findElement(webElement).clear();
		driverInstance.findElement(webElement).sendKeys(value);
	}

	public String getText(By webElement) {
		String text = driverInstance.findElement(webElement).getText();
		return text;
	}

	public int getElementCount(By webElement) {
		int size = driverInstance.findElements(webElement).size();
		return size;
	}

	public String getAttributeValueText(By webElement, String attributeName) {
		String text = driverInstance.findElement(webElement).getAttribute(attributeName);
		return text;
	}
	
	public boolean verifyIsEnabled(By webElement) {
		boolean X = driverInstance.findElement(webElement).isEnabled();
		return X;
	}
	
	public boolean checkObjectExist(By webElement){
		boolean X = false;
		try {
			X = driverInstance.findElement(webElement).isDisplayed();
		} catch (Exception e) {
		}
		return X;
	}
	
	public void selectValueFromDropdown(By webElement, String value) {
		Select dropDownName = new Select(driverInstance.findElement(webElement));
		dropDownName.selectByVisibleText(value);
	}
	
	public String getSelectedOptionValueFromDropdown(By webElement) {
		Select dropDownName = new Select(driverInstance.findElement(webElement));
		String text = dropDownName.getFirstSelectedOption().getText();
		return text;
	}

	public void mouseHover(By webElement) throws InterruptedException {
		Actions actions = new Actions(driverInstance);
		WebElement hoverElement = driverInstance.findElement(webElement);
		actions.moveToElement(hoverElement).build().perform();
		Thread.sleep(20000);
	}
	
	public void dragAndDrop(By sourceWebElement, By targetWebElement) throws InterruptedException {
		Thread.sleep(2000);
		WebElement sourceEl = driverInstance.findElement(sourceWebElement);
		WebElement targetEl = driverInstance.findElement(targetWebElement);
		Actions actions = new Actions(driverInstance);
		actions.dragAndDrop(sourceEl, targetEl).build().perform();
	}
	
	public void handleAlert() {
		WebDriverWait wait = new WebDriverWait(driverInstance, 2);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driverInstance.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void switchWindow() {
		String currWindow = driverInstance.getWindowHandle();
		Set<String> set = driverInstance.getWindowHandles();
		set.remove(currWindow);
		for (String newWindow : set) {
			driverInstance.switchTo().window(newWindow);
		}
	}

	public void switchBackToParentWindow() {
		String currWindow = driverInstance.getWindowHandle();
		Set<String> set = driverInstance.getWindowHandles();
		set.remove(currWindow);
		for (String newWindow : set) {
			driverInstance.switchTo().window(newWindow);
		}
		driverInstance.switchTo().window(currWindow);
	}
	
	public void waitForElementVisibility(By webElement) {
		WebDriverWait wait = new WebDriverWait(driverInstance, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
	}

	public void waitForElementPresence(By webElement) {
		WebDriverWait wait = new WebDriverWait(driverInstance, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(webElement));
	}


}
