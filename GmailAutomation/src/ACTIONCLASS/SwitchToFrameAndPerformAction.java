package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameAndPerformAction 
{
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https:www.google.com/");
		
		
		WebElement frameElement=driver.findElement(By.xpath("//*[@id=\"cnsw\"]/iframe"));
		driver.switchTo().frame(frameElement);// Switches to Iframe in order for automation to be executed
		
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));
		
		driver.findElement(By.xpath("//span[text()='Gmail']")).click();
		
		

		
		
	}

}