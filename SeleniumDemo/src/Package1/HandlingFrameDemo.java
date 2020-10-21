package Package1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrameDemo {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		/*//Thread.sleep(5000);
		//driver.switchTo().frame(0);
		//String parentWindowHandle=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Public Issues']")).click();
		driver.findElement(By.xpath("//input[@name='Company Name' and @type='text']")).sendKeys("ankit");
		driver.findElement(By.xpath("//input[@type='submit' and @name='Submit']")).click();
		Alert alert=driver.switchTo().alert();// Confusion
		alert.dismiss();*/
		
		Actions action=new Actions(driver);
			
		action.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.name("q")).sendKeys("dell");
		driver.findElement(By.className("vh79eN")).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		
		List<WebElement> listTotal=driver.findElements(By.xpath(""));
		
		
	}
}
