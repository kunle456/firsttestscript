package testingtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC005 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	}

	@Test(description="To verify Login is Successful for Valid Credentials")
	public void testValidLogin() throws InterruptedException {
	
		driver.findElement(By.id("login_Layer")).click();
		
		Thread.sleep(5000);
		
		String usernameXpath = "//input[@placeholder='Enter your active Email ID / Username']";
		driver.findElement(By.xpath(usernameXpath)).sendKeys("nameishemanth@rediffmail.com");
		
		String passwordXpath = "//input[@placeholder='Enter your password']";
		driver.findElement(By.xpath(passwordXpath)).sendKeys("Testing@123");
	
		driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
