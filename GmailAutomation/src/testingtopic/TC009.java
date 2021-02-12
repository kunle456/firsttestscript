package testingtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC009 extends TC003 {
	
	@Test
	public void testCase() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("login_Layer")).click();
	
	Thread.sleep(5000);
	
	String usernameXpath = "//input[@placeholder='Enter your active Email ID / Username']";
	driver.findElement(By.xpath(usernameXpath)).sendKeys("nameishemanth@rediffmail.com");
	
	String passwordXpath = "//input[@placeholder='Enter your password']";
	driver.findElement(By.xpath(passwordXpath)).sendKeys("Testing@123");
	
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	Thread.sleep(10000);
	
	WebElement updateProfile = driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']"));
	
	//Assert.assertEquals(updateProfile.isDisplayed(),false, "Update Profile is Not Displayed");// Bard Assert
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(updateProfile.isDisplayed(),false, "Update Profile is Not Displayed");
	
	System.out.println("Current URL::"+driver.getCurrentUrl());
	sa.assertAll();
	
	}
}