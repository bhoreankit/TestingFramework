package Package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ankit\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@role='button' and @id='u_0_2']")).click();
		WebElement bday=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Thread.sleep(2000);
		Select select=new Select(bday);
		
		
		
		
	}

}
//"(//ul/child::li/following-sibling::li[2]//a[contains(text(),'Rest API')])[1]")).click();
//driver.switchTo().window(child1).getTitle().equals("bljwcbf")