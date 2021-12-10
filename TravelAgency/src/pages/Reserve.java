package pages;

import org.openqa.selenium.By;

public class Reserve {
	
	public By objChooseFlight(String flightNumber) {
		return By.xpath("//td[text()='"+flightNumber+"']//..//input[@type='submit']");
	}
}
