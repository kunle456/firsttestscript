package testingtopic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC008 {
	
	@BeforeMethod(alwaysRun=true)
	public void login() {
		Reporter.log("Login", true);
	}
	
	@Test(groups="customer")
	public void createCustomer() {
		Reporter.log("Running createCustomer", true);
	}
	
	@Test(groups="customer")
	public void deleteCustomer() {
		Reporter.log("Running deleteCustomer", true);
	}
	
	@Test(groups="project")
	public void createProject() {
		Reporter.log("Running createProject", true);
	}
	
	@Test(groups="project")
	public void deleteProject() {
		Reporter.log("Running deleteProject", true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout() {
		Reporter.log("logout", true);
	}

}
