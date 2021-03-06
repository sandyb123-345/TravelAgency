package pages;

import org.openqa.selenium.By;

import UIHelpers.Dropdown;
import UIHelpers.Generic;
import utilities.Constants;

public class FindFlights {
	private Dropdown dropdown=new Dropdown();
	private Generic generic=new Generic();
public static final By DPD_FROM_PORT=By.xpath("//select[@name='fromPort']");
public static final By DPD_TO_PORT=By.xpath("//select[@name='toPort']");
public static final By BTN_FIND_FLIGHTS=By.xpath("//input[contains(@class,'btn-primary')]");

public void findFlights(String dapartureCity, String destinationCity) {
	dropdown.selectDropDown(DPD_FROM_PORT, Constants.TEXT, dapartureCity);
	dropdown.selectDropDown(DPD_TO_PORT, Constants.TEXT, destinationCity);
	generic.click(BTN_FIND_FLIGHTS);	
}

}
