package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select select=new Select(day);
		select.selectByValue("12");
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		select=new Select(month);
		
		select.selectByVisibleText("Oct");
		List months=select.getOptions();//this method getoptions() all options belonging to select tag.
		if(months.size()==12) {
			System.out.println("correct");
		}else {
			System.out.println("Incorrect");
		}
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		select=new Select(year);
		select.selectByValue("1992");
	
	}

}
