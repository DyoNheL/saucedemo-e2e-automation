package com.dyonhel.automation.tests;

import com.dyonhel.automation.base.BaseTest;
import com.dyonhel.automation.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

	@Test(description = "E2E Positive Flow - Order Product Successfully")
	public void completeOrderTest() {

		LoginPage login = new LoginPage(driver);
		login.login("standard_user", "secret_sauce");

		ProductsPage products = new ProductsPage(driver);
		products.addProductToCart();
		products.goToCart();

		CartPage cart = new CartPage(driver);
		cart.checkout();

		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.fillCheckoutInfo("Juan", "Dela Cruz", "1234");
		checkout.finishOrder();

		Assert.assertEquals(checkout.getSuccessMessage(), "Thank you for your order!");
	}
}
