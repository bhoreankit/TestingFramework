package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Ankit\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://eagercrow.com/Home");
		driver.findElement(By.xpath("//a[text()='Contact Us' and @class='color0-hov selected']")).click();
		System.out.println("ankit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Pop me')]")).click();
		//driver.findElement(By.xpath("")).click();
		
		//below code of getting page source
		/*String str=driver.getPageSource();
		System.out.println(str);*/
		
		/*String str=driver.getCurrentUrl();
		System.out.println(str);*/
	}
	
}	
