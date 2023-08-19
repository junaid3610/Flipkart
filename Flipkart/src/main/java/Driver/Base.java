package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\Chromedriver_win32 107\\chromedriver 107.exe");
		WebDriver driver = new ChromeDriver(); 
		return driver ;
	
	}
	

	public static WebDriver OpenfirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\Chromedriver_win32 107\\chromedriver 107.exe");
		WebDriver driver = new FirefoxDriver(); 
		return driver ;
		
		
		
	}
	
	
}
