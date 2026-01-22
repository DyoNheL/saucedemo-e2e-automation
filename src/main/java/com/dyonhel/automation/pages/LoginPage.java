package com.dyonhel.automation.pages;

import org.openqa.selenium.*;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	By errorMsg = By.cssSelector("[data-test='error']");

	public void login(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

	public String getErrorMessage() {
		return driver.findElement(errorMsg).getText();
	}
}
