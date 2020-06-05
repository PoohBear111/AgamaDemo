package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class HRMcallWrapperTNG {
	
	WebDriver driver;
	HRMwrapperMethodTNG wm = new HRMwrapperMethodTNG();
	
	
	@BeforeTest
	public void insertapp()
	{
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	public void login()
	{
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid1("txtPassword", "admin123");
		wm.clickbyclassname("button");
		
	}
	
	@Test(priority=2)
	public void admin()
	{
		wm.clickbylinktext("Admin");
		wm.enterbyxpath("//*[@id=\'searchSystemUser_userName\']", "Tom");
		wm.selectdropdown("2");
		wm.enterbyxpath("//*[@id=\'searchSystemUser_employeeName_empName\']", "Thomas");
		wm.selectdropdown1("0");
		wm.clickbyxpath("//*[@id=\'searchBtn\']");
		
	}
	
	@AfterTest
	public void quit()
	{
		wm.closeapp();
	}
	
}
