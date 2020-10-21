package Package1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fetchallDataFromTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/"); 
		WebElement table=driver.findElement(By.className("(//div[@class='table-responsive'])[2]"));
		List<WebElement> allrows=table.findElements(By.tagName("tr"));
		for(WebElement row: allrows) {
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell: cells) {
				System.out.println(cell.getText());
			}
		}
		
	}

}
