package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript0 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.protonmail.com/login");
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("hemanth190");
		driver.findElement(By.id("password")).sendKeys("Testing123");
		driver.findElement(By.id("login_btn")).click();
		
	}
			
}