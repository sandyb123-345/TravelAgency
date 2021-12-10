package browser;

import java.time.Duration;

import org.testng.Assert;

public class Browser {

	public void navigateToUrl(String url) {
		try {
		DriverFactory.getDriver().get(url);
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		catch (Exception exc) {
			Assert.fail(exc.toString());
		}
	}
}
