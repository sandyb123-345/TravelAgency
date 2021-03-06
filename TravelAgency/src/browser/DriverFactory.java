package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Constants;

public class DriverFactory {
	public static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
	

	public static void setDriver(String browser) {
		if(browser.equals(Constants.CHROME)) {
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			webdriver.set(new ChromeDriver());
		}
	}
	
	public static WebDriver getDriver() {
		return webdriver.get();
	}
}
