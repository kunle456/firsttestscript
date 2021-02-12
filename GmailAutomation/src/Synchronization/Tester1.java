package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {
	
	//In order to match the application speed with automation speed we have to use synchronization 
	//Thread.sleep is a blind wait meaning any time its given its will execute an action until that time is met even if 
	//it execution the first second//
	// We use implicit wait for findElement and findElements
	// Explicit wait is used for anything else
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.protomail.com/login");
			driver.findElement(By.id("username")).sendKeys("hemanth190");
			driver.findElement(By.id("password")).sendKeys("Testing@123");
			driver.findElement(By.id("login_btn")).click();
		}


}
