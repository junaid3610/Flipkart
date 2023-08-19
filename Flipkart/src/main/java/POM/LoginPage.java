package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

// username	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement username;
// password	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement password;
// click on login	
	@FindBy(xpath="(//div[@class=\\\"_1psGvi _3BvnxG\\\"])[1]")
	private WebElement login;

//submit button	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	private WebElement submitbutton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	public void Sendusername() {
		username.sendKeys("9545111584");
		
	}
	
	public void password() {
		password.sendKeys("Junaid@3610");
		
	}
	
	public void loginclick() {
		login.click();
		
	}
	
	public void submitbtn() {
		submitbutton.click();
	}
			
	
	
	

}
