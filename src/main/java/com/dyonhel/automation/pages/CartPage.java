package com.dyonhel.automation.pages;

import org.openqa.selenium.*;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	By checkoutBtn = By.id("checkout");

	public void checkout() {
		driver.findElement(checkoutBtn).click();
	}
}
