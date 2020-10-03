package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();

	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String br) {
		if(br.equals("browser")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		
	}
		
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
