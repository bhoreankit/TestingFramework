package FirstSeleniumTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCases {
	
	@Test(dataProvider="loginData", dataProviderClass=DataProviders.class)
	public void m1(String uname, String pwd) {	
		System.out.println("m1 Test Case of LoginTestCases " + uname);
		System.out.println("m1 Test Case of LoginTestCases " + pwd);
	}
	
	/*//@Test(dataProvider="LoginDataProvider", dataProviderClass=FirstSeleniumTest.DataProviders.class)
	public void m2(String uname, String pass) {
		if(uname.contains("user") && pass.contains("pass")) {
		System.out.println(uname+"\t"+pass);
		}else {
			throw new ArithmeticException();
		}
	}*/
	
	@Test(priority=-10)
	public void m2() {	
		System.out.println("m2 Test Case of LoginTestCases");
	}
	
	
}
