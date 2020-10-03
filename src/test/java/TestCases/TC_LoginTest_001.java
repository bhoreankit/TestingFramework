package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() {
				
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture,"
				+ " Grocery, Lifestyle, Books & More. Best Offers!")) {
			
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}
	
	
}
