import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchChrome{
	public static WebDriver driver;
	public static void main(String[] args)  {
		/*//To open InternetExplorer Driver
				System.setProperty("webdriver.ie.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();*/
		
		/*//To open Firefox Driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\geckodriver.exe");
		driver=new FirefoxDriver();*/
		
		
		//To open Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhoreankit@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9623654518");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		//driver.findElement(By.xpath("//a[@class='_2s25']")).click();
			
	}
	
}



