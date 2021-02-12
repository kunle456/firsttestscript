package testingtopic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC007 {
	
	@BeforeTest
	public void bt() {
		Reporter.log("Running BeforeTest", true);
	}
	
	@BeforeClass
	public void bc() {
		Reporter.log("Running BeforeClass", true);
	}
	
	@Test 
	public void testCase() {
		Reporter.log("Running test case", true);
	}
	
	@AfterClass
	public void ac() {
		Reporter.log("Running AfterClass", true);
	}
	
	@AfterTest
	public void at() {
		Reporter.log("Running AfterTest", true);
	}

}
