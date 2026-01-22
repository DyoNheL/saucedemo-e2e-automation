package com.dyonhel.automation.pages;

import org.openqa.selenium.*;

public class ProductsPage {

	WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
	By cartIcon = By.className("shopping_cart_link");

	public void addProductToCart() {
		driver.findElement(addBackpack).click();
	}

	public void goToCart() {
		driver.findElement(cartIcon).click();
	}
}
