package Package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class NaukriPractic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String parentWindowHandle=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		Iterator ir=allwindow.iterator();	
		for(String child : allwindow) {
			if(!parentWindowHandle.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
			}			
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//button[@class='btn waves-effect waves-light btn-large']")).click();
		driver.findElement(By.xpath("//span[@class='fr geoLocBtn sure']")).click();
		//driver.findElement(By.xpath("//span[@class='fr pushBtn sure']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@title='Search CVs for Free now']")).click();
		Set<String> nextwindows=driver.getWindowHandles();
		//Iterator ir1=nextwindows.iterator();
		for(String child1: nextwindows) {
			if(!parentWindowHandle.equals(child1)) {
				driver.switchTo().window(child1);	
			}
		}
		driver.findElement(By.xpath("//a[@class='tabUnsel']")).click();
		driver.findElement(By.xpath("//input[@name='IT_SKILL0']")).sendKeys("Software Tester");
		WebElement year=driver.findElement(By.xpath("//select[@name='IT_SKILL_EXP0']"));
		Select select=new Select(year);
		select.selectByIndex(2);
		WebElement check_ITskill=driver.findElement(By.name("IT_ER_RESUME_FLAG"));
		check_ITskill.click();
		if(check_ITskill.isSelected()) {
			System.out.println("check_ITskill is selected");
		}else {
			System.out.println("check_ITskill is notselected");
		}		
		driver.findElement(By.name("MIN_EXPYR")).sendKeys("0");
		driver.findElement(By.name("MAX_EXPYR")).sendKeys("2.2");
		WebElement lacs=driver.findElement(By.name("MIN_CTC"));
		Select select1=new Select(lacs);
		select1.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='curr_loc']")).click();
		WebElement india=driver.findElement(By.xpath("//input[@name='CURR_LOC[]' and @value='5000']"));
		india.click();
		if(india.isSelected()) {
			System.out.println("india is selected");
		}else {
			System.out.println("india is not selected");
		}
		
		driver.findElement(By.xpath("//input[@value='JTP']")).click();
		WebElement relevance=driver.findElement(By.name("SORTING"));
		Select sel=new Select(relevance);
		sel.selectByValue("EMAIL_SORT");  
	}

}
