package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		//find menu and submenu by using actionclass
		System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
		Actions action=new Actions(driver);
		WebElement content=driver.findElement(By.className("menulink"));
		action.moveToElement(content).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Articles']")).click();
			
	}
	

}

/*Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
Thread.sleep(3000);

driver.findElement(By.xpath("//li//a[text()='Articles']")).click();*/