package UIHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import browser.DriverFactory;

public class Generic {

	public void click(By object) {
		DriverFactory.getDriver().findElement(object).click();
	}

	public String getText(By object) {
		return DriverFactory.getDriver().findElement(object).getText();
	}

	public boolean isDsiplayed(By object) {

		boolean isDisplayed = false;
		try {
			DriverFactory.getDriver().findElement(object).isDisplayed();
			isDisplayed = true;
		} catch (NoSuchElementException exc) {
			isDisplayed = false;
		}
		return isDisplayed;
	}
}
