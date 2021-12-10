package UIHelpers;

import org.openqa.selenium.By;

import browser.DriverFactory;

public class TextBox {
	public void sendKeys(By object, String text) {
		DriverFactory.getDriver().findElement(object).sendKeys(text);
	}
	
}
