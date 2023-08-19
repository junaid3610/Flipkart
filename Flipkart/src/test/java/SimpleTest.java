import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void browser() {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\Chromedriver_win32 107\\chromedriver 107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
	
	@Test(priority = 2)
	public void Crednetials() {
		
		driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@data-test=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();	
		
	}
	
	
	
}