package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyword {

	public static void openBrowser(String browserName) {

		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Ankit\\chromedriver.exe");
			Constants.driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\om\\Downloads\\Ankit\\Selenium WebDriver\\geckodriver.exe");
			Constants.driver = new FirefoxDriver();
			break;
		case "HtmlUnit":
			break;
		default:
			System.out.println("Invalid browsername:" + browserName);

		}
	}

	public static void openURL(String url) {
		Constants.driver.get(url);

	}
	public static WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element=null;
		switch (locatorType) {
		case "XPATH":
			element=Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element=Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":	
			element=Constants.driver.findElement(By.id(locatorValue));
			break;
		case "LINKTEXT":
			element=Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element=Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "CLASS_NAME":
			element=Constants.driver.findElement(By.className(locatorValue));
			break;
		case "NAME":
			element=Constants.driver.findElement(By.className(locatorValue));
			break;
		default:
			System.err.println("Invalid loctorType: " + locatorType
					+ "Expected: CSS, XPATH, ID, LINKTEXT, PARTIAL_LINK_TEXT, CLASS_NAME,CSS_SELECTOR");
		}
		return element;
		
	}
	public static String getText(String locatorType, String locatorValue) {
		String element=getWebElement(locatorType, locatorValue).getText();
		return element;
		
	}
	
	public static void clickOnElement(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();

	}
	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);		
	}
	public static void mouseHoverElement(String locatorType, String locatorValue) {
		Actions action=new Actions(Constants.driver);
		action.moveToElement(getWebElement(locatorType, locatorValue)).build().perform();
		
	}
	public static void maximizeBrowser() {
		Constants.driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		Constants.driver.close();
	}
	public static void closeAllBrowsers() {
		Constants.driver.quit();

	}

}
