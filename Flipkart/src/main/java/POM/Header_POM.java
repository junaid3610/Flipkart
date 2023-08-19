package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header_POM {
	
	WebDriver driver;
	                 // Declaration
//mobile
	@FindBy(xpath="//div[@class=\"_37M3Pb\"]/div[3]")
	private WebElement searchmobile;
	
//Fashion	
	@FindBy(xpath="//div[@class=\"_37M3Pb\"]/div[4]")  
	private WebElement searchfashion;
	
//Electronics	
	@FindBy(xpath="//div[@class=\"_37M3Pb\"]/div[5]")
	private WebElement searchelectronics;
	
//logout
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logout;
	
	
					// Initialization
	
	public Header_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	
	}
					// Usage
					
	public void mobileclick() {
		searchmobile.click();
		
	}
	
	public void fashionclick() {
		searchfashion.click();
		
	}
	
	public void electronicsclick() {
		searchelectronics.click();
		
	}
	
	public void clickonlogout() {
	
		Actions act = new Actions(driver);		
		act.moveToElement(logout).click().build().perform();
		
	}
			
	
	

}



