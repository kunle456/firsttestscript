package testingtopic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC004 {
	
	@BeforeMethod
	public void hm() {
		Reporter.log("Running BeforeMethod", true);
	}
	
	@Test
	public void testCase1() {
		Reporter.log("Running test Case1", true);
	}
	
	
	public class TC003 {
		@Test 
		public void testCase() {
			Reporter.log("Running test Case2", true);
		}
		
		@AfterMethod
		public void af() {
			Reporter.log("Running AfterMethod", true);
		}

	}


}
