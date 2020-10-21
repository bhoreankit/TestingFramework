package Package1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplictWaitDemo {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"reg_email__\"]")).getText();
		/** Explicit wait by TestingShastra
		 * FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		wait.ignoring(TimeoutException.class);
		wait.withTimeout(4, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.attributeContains(By.xpath("//input[@name='firstName']"), "name", "firstName"));*/
		
	/*	WebElement firstName=driver.findElement(By.name("firstname"));
		WebElement lastName=driver.findElement(By.name("lastname"));
		
		sendKeys(driver, firstName, 10, "Tom");
		sendKeys(driver, lastName, 5, "peter");
		
	}
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout);
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	private static void until(ExpectedCondition<WebElement> visibilityOf) {
		// TODO Auto-generated method stub
		
	}
	*/
}
}