package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver; 
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String upass) {
		txtPassword.sendKeys(upass);
	}
	public void clickSubmit() {
		btnLogin.click();
	}
}
