package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameAndPerformAction1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		
		Thread.sleep(10000);
		
		WebElement frameElement=driver.findElement(By.xpath("//iframe[contains(@href,'https://ogs.google.com')]"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("//span[text()='Gmail']")).click();
		
	}
	
	
	

}
