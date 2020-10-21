package Package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeForm {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("button1")).click();
		String parentWindowHandle=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		for(String child: allWindow) {
			if(!parentWindowHandle.equals(child)) {
				driver.switchTo().window(child);
			}	
		}
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		Set<String> allWindows=driver.getWindowHandles();
		for(String child1: allWindows) {
			if(!parentWindowHandle.equals(child1)) {
				driver.switchTo().window(child1);
			}
		}
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("alert")).click();
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.dismiss();
		
		WebElement src=driver.findElement(By.id("draga"));
		WebElement trg=driver.findElement(By.id("dragb"));
		Actions action=new Actions(driver);
		action.clickAndHold(src).moveToElement(trg).release().build().perform();
		System.out.println("ankit");
		
	}

}
