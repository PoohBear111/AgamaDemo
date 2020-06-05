package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRMwrapperMethodTNG {

	WebDriver driver;
	public void insertapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "//Users//rama//Downloads//Testing//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void enterbyid(String val, String name)
	{
		driver.findElement(By.id(val)).sendKeys(name);
	}
	
	public void enterbyid1(String val, String password)
	{
		driver.findElement(By.id(val)).sendKeys(password);
	}
	
	public void clickbyclassname(String val1)
	{
		driver.findElement(By.className(val1)).click();
	}

//Home Page

	public void clickbylinktext(String val2) 
	{
		driver.findElement(By.linkText(val2)).click();	
	}

	public void enterbyxpath(String val2,String name2) 
	{
		driver.findElement(By.xpath(val2)).sendKeys(name2);
	}
	public void selectdropdown(String text) 
	{
	   Select UserRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
	   UserRole.selectByValue("2");		
	}
	public void enterbyxpath1(String val3,String name3) 
	{
		driver.findElement(By.xpath(val3)).sendKeys(name3);
	}
	public void selectdropdown1(String text) 
	{
	   Select Status = new Select(driver.findElement(By.id("searchSystemUser_status")));
	   Status.selectByValue("0");		
	}
	
	public void clickbyxpath(String val4) 
	{
		driver.findElement(By.xpath(val4)).click();
		
	}
	public void closeapp()
	{
		driver.close();
	}

}

