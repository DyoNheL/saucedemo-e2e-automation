package com.dyonhel.automation.pages;

import org.openqa.selenium.*;

public class CheckoutPage {

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By continueBtn = By.id("continue");
	By finishBtn = By.id("finish");
	By successMsg = By.className("complete-header");

	public void fillCheckoutInfo(String fn, String ln, String zip) {
		driver.findElement(firstName).sendKeys(fn);
		driver.findElement(lastName).sendKeys(ln);
		driver.findElement(postalCode).sendKeys(zip);
		driver.findElement(continueBtn).click();
	}

	public void finishOrder() {
		driver.findElement(finishBtn).click();
	}

	public String getSuccessMessage() {
		return driver.findElement(successMsg).getText();
	}
}
