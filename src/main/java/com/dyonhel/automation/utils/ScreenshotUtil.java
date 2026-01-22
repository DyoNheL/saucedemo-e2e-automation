package com.dyonhel.automation.utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;

public class ScreenshotUtil {

	private ScreenshotUtil() {

	}

	@Attachment(value = "Failure Screenshot", type = "image/png")
	public static byte[] captureScreenshot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}
