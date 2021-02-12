package testingtopic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC003 {
	@Test 
	public void testCase() throws InterruptedException {
		Reporter.log("Running test Case", true);
	}
	
	@AfterMethod
	public void af() {
		Reporter.log("Running AfterMethod", true);
	}

}
