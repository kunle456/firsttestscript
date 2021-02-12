package testingtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC006 {
	
	WebDriver driver;
	
	@BeforeClass
	public void openApp() { 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	}
	
	@BeforeMethod 
	public void loginToApp() throws InterruptedException { 
		driver.findElement(By.id("login_Layer")).click();
		
		Thread.sleep(5000);
		
		String usernameXpath = "//input[@placeholder='Enter your active Email ID / Username')";
		driver.findElement(By.xpath(usernameXpath)).sendKeys("nameishemanth@rediffmail.com");
		
		String passwordXpath = "//input[@placeholder='Enter your password']";
		driver.findElement(By.xpath(passwordXpath)).sendKeys("Testing@123");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Thread.sleep(10000);
		
	}
	
	@Test(description="To Verify Login is successful for Valid Credentials")
	public void testValidLogin1() throws InterruptedException {
		driver.findElement(By.name("qp")).sendKeys("hemanth");
		
		
	}
	
	@Test(description="To Verify Login is successful for Valid Credentials")
	public void testValidLogin2() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click(); 
		
	}
	
	
	@AfterMethod
	public void logout( ) {
		WebElement naukri = driver.findElement(By.linkText("MY NAUKRI"));
		Actions actions = new Actions(driver);
		actions.moveToElement(naukri).perform();
		
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
	

}
