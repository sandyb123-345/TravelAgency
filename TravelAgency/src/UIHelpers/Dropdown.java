package UIHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
 

import browser.DriverFactory;
import utilities.Constants;

public class Dropdown {
	
	public void selectDropDown(By object, String type, String option) {
		Select dropdown = new Select(DriverFactory.getDriver().findElement(object));
		if(type.equals(Constants.VALUE))
		dropdown.selectByValue(option);
		if(type.equals(Constants.TEXT))
			dropdown.selectByVisibleText(option);
	}
}
