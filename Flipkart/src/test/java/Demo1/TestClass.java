package Demo1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Driver.Base;
import POM.Header_POM;
import POM.LoginPage;

public class TestClass extends Base {
	WebDriver driver;
	LoginPage loginpage;
	
	Header_POM header; 
	
	@Parameters("browserName")
	@BeforeTest
	public void launchBrowser(String browser) {
		if(browser.equals("chrome")) {
			driver = OpenChromeBrowser();
			
		} else {
			driver = OpenfirefoxBrowser();
			
		}
	
	}

	@BeforeMethod
	public void loginToApplication() {
		System.out.println("Before Method");
		driver.get("https://www.flipkart.com/");
		
		loginpage = new LoginPage(driver);
		loginpage.Sendusername();
		loginpage.password();
		loginpage.loginclick();
		
		header = new Header_POM(driver);
		
	}
	
	
	@Test
	public void performTest1() {
		header.mobileclick();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
	//	Assert.assertEquals(, title)
		
		
	}
//	
//	@Test
//	public void performTest2() {
//		header
//		
//		
//	}
	
	
	
	@AfterMethod
	public void logoutapplication() {
	//	header.clickonlogout();
		System.out.println("Logout from Application");
		
	}
			
	
	
	

}
