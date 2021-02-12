package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameAndPerformAction2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.kickofflabs.com/landing-page-templates");
		
		
		driver.switchTo().frame("theme-preview-iframe");
		
		driver.findElement(By.id("email")).sendKeys("nameiskunle@gmail.com");


}

     }