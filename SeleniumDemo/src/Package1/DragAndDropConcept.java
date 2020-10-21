package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/** Program for drag and drop
		 * 
		 * driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement sourceelement=driver.findElement(By.id("draggable"));
		WebElement targetelement=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(sourceelement).moveToElement(targetelement).build().perform();
		*/
		
		
		/** Program for rightclick
		 * 
		 * driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action=new Actions(driver);
		WebElement rightclicButton=driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightclicButton).build().perform();
		*/	
	}

}
