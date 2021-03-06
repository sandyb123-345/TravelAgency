package pages;

import org.openqa.selenium.By;
import UIHelpers.*;
import utilities.Constants;

public class Purchase {
	private TextBox textBox=new TextBox();
	private Dropdown dropdown=new Dropdown();
	public static final By LBL_TITLE_PURCHASE=By.xpath("//div//h2");
	public static final By TXT_NAME=By.id("inputName");
	public static final By TXT_ADDRESS=By.id("address");
	public static final By TXT_CITY=By.id("city");
	public static final By TXT_STATE=By.id("state");
	public static final By TXT_ZIP=By.id("zipCode");
	public static final By DPD_CARD_TYPEE=By.id("cardType");
	public static final By TXT_CARD_NUMBER=By.id("creditCardNumber");
	public static final By TXT_CARD_MONTH=By.id("creditCardMonth");
	public static final By TXT_CARD_YEAR=By.id("creditCardYear");
	public static final By TXT_CARD_NAME=By.id("nameOnCard");
	public static final By BTN_PURCHASE_FLIGHT=By.xpath("//input[contains(@class,'btn-primary')]");
	
	public void enterPersonalDetails(String name, String address,String city, String state, String zip) {
		textBox.sendKeys(TXT_NAME, name);
		textBox.sendKeys(TXT_ADDRESS, address);
		textBox.sendKeys(TXT_CITY, city);
		textBox.sendKeys(TXT_STATE, state);
		textBox.sendKeys(TXT_ZIP, zip);
	}
	
	public void enterCardDetails(String cardType, String cardNumber, String cardMonth, String cardYear, String cardName) {
		dropdown.selectDropDown(DPD_CARD_TYPEE, Constants.TEXT, cardType);
		textBox.sendKeys(TXT_CARD_NUMBER, cardNumber);
		textBox.sendKeys(TXT_CARD_MONTH, cardMonth);
		textBox.sendKeys(TXT_CARD_YEAR, cardYear);
		textBox.sendKeys(TXT_CARD_NAME, cardName);
	}
}
