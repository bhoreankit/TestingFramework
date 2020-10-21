package FirstSeleniumTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupA {
	@Test
	public void m1() {
		System.out.println("m1 test case fron GroupA");
		
	}
	@Test
	public void m2() {
		System.out.println("m2 test case fron GroupA");
	}
	@Test
	public void m3() {
		System.out.println("m3 test case fron GroupA");
		Assert.assertEquals(12, 13);
	}
}
