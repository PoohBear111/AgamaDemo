package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	
	@Test
	public void BrowserAutomation()
	{
		System.out.println("Browser Automation");
	}

	@Test
	public void ElementsUi()
	{
		System.out.println("ElementsUi");
	}

	
	@Test
	public void FirefoxAutomation()
	{
		System.setProperty("webdriver.gecko.driver", "//usr//local//bin//geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}
	
}
