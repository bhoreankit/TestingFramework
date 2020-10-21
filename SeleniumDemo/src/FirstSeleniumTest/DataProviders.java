package FirstSeleniumTest;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="loginData")
	public Object[][] loginData(){
		Object[][] values= {{"user1", "pass1"},{"user2","pass2"}};
		
		return values;
	}
	
}
 

/*@DataProvider(name="LoginDataProvider")
public Object[][] loginData() {
	Object[][] values={{"user1","pass1"},
			{"user2","pass2"},
			{"user3","pass3"}};
	return values;
}
*/


















