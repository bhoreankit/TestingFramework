package Keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
//will not have any methods only instance variable
public class Constants {
	public static WebDriver driver;
	public static Properties prop; 
	public static FileInputStream fis;
	 
}
/*@Test(enabled=false)
public void verifyCustermerLogin() throws InterruptedException {
	Keyword.clickOnElement("LINKTEXT", "Sign In");
	Thread.sleep(5000);
	Keyword.clickOnElement("XPATH", "//ul[@class='firebaseui-idp-list']//li[1]");
	Keyword.enterText("XPATH", "//input[@autocomplete=\"username\"]", "bhoreankit@gmail.com");
	Keyword.clickOnElement("XPATH", "//button[@type=\"submit\"]");
	Thread.sleep(3000);
	Keyword.enterText("XPATH", "//input[@type='password']", "ankit@8793");
	Keyword.clickOnElement("XPATH", "//button[text()='Sign In']");
	Thread.sleep(7000);
	String name=Keyword.getText("XPATH", "(//div[@class=\"chip\"])[1]");
	if(name.equals("Ankit Bhore")) {
		System.out.println("Customer Login Succesfully");
	}else {
		System.out.println("Customer Login not Succesfully");
	}
}*/