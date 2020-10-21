package FirstSeleniumTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupC {
	@Test
	@Parameters({"rollno", "ankit"})  //confusion
	public void m1(String rollno, String ankit) {
		System.out.println("m1 test case fron GroupC" + rollno);
		System.out.println("m1 test case fron GroupC" + ankit);
	}
	@Test(groups="smoketest")
	public void m2() {
		System.out.println("m2 test case fron GroupC");
	}
	@Test(dependsOnMethods="m2")
	public void m3() {
		System.out.println("m3 test case fron GroupC");
	}
	
}
