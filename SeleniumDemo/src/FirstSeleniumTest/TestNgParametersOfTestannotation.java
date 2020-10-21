package FirstSeleniumTest;

import org.testng.annotations.Test;

public class TestNgParametersOfTestannotation {
	@Test(alwaysRun=true)
	public void m1() {	
		System.out.println("m1 Test Case");
		int i=10/0;
	}
	@Test
	public void m2() {	
		System.out.println("m2 Test Case");
		
	}
	


}
