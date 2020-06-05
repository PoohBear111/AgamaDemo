package com.testcase;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//rama//Downloads//Testing//chromedriver");
		//HtmlUnitDriver driver = new HtmlUnitDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println("Title of the page is  "+ driver.getTitle());
	}

}