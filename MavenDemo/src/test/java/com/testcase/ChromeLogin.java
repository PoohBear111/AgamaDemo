package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); //This Automatically updates the driver	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.setProperty("webdriver.chrome.driver", "//Users//rama//Downloads//Testing//chromedriver");
		driver.close();
	}

}
