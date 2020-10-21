package Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ankit\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}
		alert.accept();
		System.out.println("Ankit");*/
		driver.get("https://html.com/input-type-file/");
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file' and @value='fileupload']")).sendKeys("C:\\Users\\om");
		
	}

}
