package Package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.canarabank.in");
		//System.out.println("window handle of parent: "+driver.getWindowHandle());
		/*String parentWindowHandle=driver.getWindowHandle();
		driver.findElement(By.xpath("(//button)[3]")).click();
		Set<String> allWindows=driver.getWindowHandles();
		//Iterator itr=allWindows.iterator();
		for(String child: allWindows) {
			if(!parentWindowHandle.equals(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("Ankit");
				driver.findElement(By.xpath("//input[@id='fldPassword']")).sendKeys("8793");
				Alert alert=driver.switchTo().alert(); // code for handling alert
				System.out.println(alert.getText());// code for handling alert
				alert.accept();///code for handling alert
				driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();		
			}
		}*/	
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//a[contains(text(),'Canara UPI')]")).click();
		
	}

}


