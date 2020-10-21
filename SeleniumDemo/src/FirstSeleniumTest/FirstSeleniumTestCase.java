package FirstSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class FirstSeleniumTestCase {

	//public static void main(String[] args) {
	public void m2() {
		
		System.out.println("anljevk");
	}
	
		
		public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		String title=driver.getTitle();
		if(title.contains("Sign In")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
		
	}

}
