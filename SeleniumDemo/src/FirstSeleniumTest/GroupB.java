package FirstSeleniumTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupB {
	@Test(expectedExceptions=ArithmeticException.class)
	public void m1() {
		System.out.println("m1 test case fron GroupB");
		int a=1/0;
	}
	@Test(dataProvider="getData")
	public void m2(String uid, String pw) {
		System.out.println("m2 test case fron GroupB" +uid);
		System.out.println("m2 test case fron GroupB" +pw);
	}
	@Test
	public void m3() {
		System.out.println("m3 test case fron GroupB");
	}
	@DataProvider(name="getData")
	public Object[][] getData() {
		Object[][] values= {{"user1","pass1"},{"user2","pass2"}};
		return values;	
	}
	
	
}
