package FirstSeleniumTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch Browser");

	}
	@BeforeClass
	public void login() {
		System.out.println("login to app");

	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
	@Test
	public void googleTitleTest() {
		System.out.println("google Title Test");
	}
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	@AfterMethod
	private void logoutFromApp() {
		System.out.println("logout from app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete All cookies");

	}
	
	
	
	
}
