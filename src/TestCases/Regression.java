package TestCases;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FileUtility.PropertiesFile;
import Keywords.Constants;
import Keywords.Keyword;

public class Regression  {
	
	@BeforeClass
	public void openingSite() {
		Keyword.openBrowser("Chrome");
		Keyword.openURL("https://www.flipkart.com/");
		Keyword.maximizeBrowser();
		Actions action=new Actions(Constants.driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
	@Test(enabled=false)   //doubt
	public void verifyEmailOrMobNumberFieldIsPresentOrNot() {
		WebElement email=Constants.driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		String txt=email.getText();
		System.out.println(txt);
		//Assert.assertEquals(txt, "Enter Email/Mobile number");	
	}
	@Test(enabled=false)   
	public void verifyEmailOrMobNumberFieldIsClickableOrNot() {
	WebElement email=Constants.driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		boolean isClickable=email.isEnabled();
			if(isClickable) {
				email.sendKeys("Ankit");
			}
	}
	
	@Test(enabled=false)
	public void verifyForgotLinkPresentOrNot() {
		WebElement email=Constants.driver.findElement(By.linkText("Forgot?"));
		String txt=email.getText();
		Assert.assertEquals(txt, "Forgot?");
	}
	@Test(enabled=false)
	public void verifyuserIsableToLoginSuccesfullyOrNot() throws InterruptedException {
		Keyword.enterText("XPATH", "//input[@class='_2zrpKA _1dBPDZ']", "8208199330");
		Keyword.enterText("XPATH", "//input[@class='_2zrpKA _3v41xv _1dBPDZ']", "Ankit@8793");
		Keyword.clickOnElement("XPATH", "(//button[@type='submit'])[2]");

	}
	
	@Test(enabled=false)
	public void verifySearchFuctionalityisPresentOrNot() {
		boolean isDisplayed=Constants.driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		if(isDisplayed) {
			System.out.println("Search box is present");
		}
	}
	@Test(enabled=true)
	public void verifyHomePageTitle() {
		String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, "
				+ "Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String ActualTitle=Constants.driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Test(enabled=false)
	public void verifyUsernameIsDisplayedOnHomepageOrNotAfterLogin() throws InterruptedException {
		Thread.sleep(3000);
		Keyword.enterText("XPATH", "(//input[@type='text'])[2]", "8208199330");
		Keyword.enterText("XPATH", "//input[@class='_2zrpKA _3v41xv _1dBPDZ']", "Ankit@8793");
		Keyword.clickOnElement("XPATH", "(//button[@type='submit'])[2]");
		/*Thread.sleep(3000);
		Keyword.getText("XPATH", "(//div[@class='_2aUbKa'])[1]");
		*/
		
		
	}
	@Test(enabled=false)
	public void verifySearchFunctionalityisWorkingOrNot(){
		WebElement products=Constants.driver.findElement(By.xpath("//input[@name='q']"));
		boolean isEnabled=products.isEnabled();
		if(isEnabled) {
			products.sendKeys("dell");
			Constants.driver.navigate().refresh();
		}
	}
	@Test(enabled=false)
	public void verifyWhenUserClickOnProductUserShouldBeRedirectedToProduSpecificationPage() throws InterruptedException {
		Keyword.enterText("XPATH", "//input[@name='q']", "redmi");
		Keyword.clickOnElement("CLASS_NAME", "_2BhAHa");
		Thread.sleep(3000);
		Keyword.clickOnElement("XPATH", "//a[@title='Redmi 8 (Onyx Black, 64 GB)']");
		String Parent=Constants.driver.getWindowHandle();
		Set<String> allwindows=Constants.driver.getWindowHandles();
		for(String child: allwindows) {
			if(!Parent.equals(child)) {
				Constants.driver.switchTo().window(child);
				String txt=Keyword.getText("XPATH", "//span[@class='_35KyD6']");
				Assert.assertEquals(txt, "Redmi 8 (Onyx Black, 64 GB)  (4 GB RAM)");
			}
			
		}
	}
	@Test(enabled=false)  //doubt
	public void verifySortingOptionShouldBePresentOrNot() {
		List<WebElement> lista=Constants.driver.findElements(By.xpath("//*[@class='_1xHtJz']/following-sibling::div"));
		int size=lista.size();
		System.out.println(size);
		/*List<WebElement> listaa=Constants.driver.findElements(By.xpath("//div//a[@class='_2SvCnW']"));
		for(WebElement e: listaa) {
			String sttxt=e.getText();
			System.out.println(sttxt);
		}*/
		
	}
	@Test(enabled=false)
	public void verifyProductOnTheHomePageIsClickableOrNot() {
		WebElement PumaShoe=Constants.driver.findElement(By.className("_2VeolH _3I5S6S"));
		boolean isEnabled=PumaShoe.isEnabled();
		if(isEnabled) {
			PumaShoe.click();
		}
	}
	/*@Test
	private void verifyThatWhenUserclickOnProductUserShouldbeRedirectedToProductSpecificationPage() {
		
	}*/
	@Test(enabled=false)
	public void verifyFeaturedProductPresentOrNot() {
		String featuredProduct="iphone 7 plus 32 gb balck";
		Keyword.enterText("XPATH", "//input[@name='q']", featuredProduct);
		Keyword.clickOnElement("CLASS_NAME", "_2BhAHa");
		List<WebElement> list=Constants.driver.findElements(By.xpath("//*[@class='_3wU53n']"));
		int size=list.size();
		System.out.println(size);
		
	}
	@Test(enabled=false)    //remaining
	public void verifyProfileSectionPresentOrNot() throws InterruptedException {
		Actions action=new Actions(Constants.driver);
		WebElement account=Constants.driver.findElement(By.xpath("(//span[@class='_2aUbKa'])[1]"));
		action.moveToElement(account).build().perform();
		Thread.sleep(3000);	
	}	
	
}
