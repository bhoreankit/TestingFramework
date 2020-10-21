package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

//open browser
//maximize the window
//page load timeout
//implicit wait
//deleteAllcookies
//get(url)

public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	
	public static void main(String[] args) {
		try {
			FileInputStream ip=new FileInputStream("H:\\Ankit Bhore\\workspace\\HybridTestFramework\\src\\main\\java\\Config\\properties\\Cofing.properties");
			prop=new Properties();
			prop.load(ip);
			System.out.println(prop.getProperty("browser"));
		} catch (FileNotFoundException e) {
			System.out.println("unable to open config properties");
			e.printStackTrace();
		}catch(IOException e) {		
			e.printStackTrace();
		}
		
	}
	

}
