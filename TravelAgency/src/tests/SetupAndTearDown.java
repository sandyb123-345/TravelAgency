package tests;

import org.testng.annotations.*;

import UIHelpers.Generic;
import browser.Browser;
import browser.DriverFactory;
import pages.*;
import utilities.Constants;

public class SetupAndTearDown {
	private Browser browser=new Browser();
	public Generic generic=new Generic();
	public FindFlights findFlights=new FindFlights();
	public Reserve reserve=new Reserve();
	public Purchase purchase=new Purchase();
	
	@BeforeMethod
	public void beforeMethod() {
		DriverFactory.setDriver(Constants.BROWSER);
		browser.navigateToUrl(Constants.URL);
		
	}
}
