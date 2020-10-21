package Package1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List CountryList=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		System.out.println(CountryList.size());
		Iterator itr=CountryList.iterator();
		while(itr.hasNext()) {
			WebElement element=(WebElement) itr.next();
			System.out.println(element.getText());
		}
	}
	
}
	