package FirstSeleniumTest;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.google.com");
		
	}
	@Test(priority=3, groups= {"title"})
	public void googleTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google", "title is matched");
		
	}
	/*@Test
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//div[@title='Google' and @class='show-logo']")).isDisplayed();

	}*/
	@Test(expectedExceptions=ArithmeticException.class)
	public void mailLinkTest() {	
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		int i=10/0;
	}
	@Test(dependsOnMethods="mailLinkTest")
	public void ImagesLinkTest() {
		boolean b=driver.findElement(By.linkText("Images")).isDisplayed();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
