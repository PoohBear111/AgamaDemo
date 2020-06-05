package com.testcase;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeLogin1{

	
	@Test
	public void BrowserAutomation()
	{
		
		//public static void main(String[] args)
			// TODO Auto-generated method stub
			
		    System.setProperty("webdriver.gecko.driver", "//usr//local//bin//geckodriver");
			
			WebDriver driver = new FirefoxDriver();
			
		//WebDriverManager.ChromeDriver.Setup(); //This Automatically updates the driver	
			
			driver.get("http://www.google.com");
			
			System.out.println(driver.getTitle());
			
			driver.close();
	
	}
	

	@Test
	public void ElementsUi()
	{
		System.out.println("Joshi");
	}

	
}

