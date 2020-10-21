package Package1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static	WebDriver driver;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Ankit\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	public static void takeScreenshot(String fileName) { //pass the filename whatever facebook.png etc
		//1.take screenshot and store it as a file format
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyfile(file, new File(" .png"));
		
		
	}
	
}
