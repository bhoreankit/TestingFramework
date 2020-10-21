package TestCasesPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FlipCartTestCases {
	WebDriver driver;
	@BeforeMethod
	public void openingSite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void verifyLogin() {
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();

	}

}
