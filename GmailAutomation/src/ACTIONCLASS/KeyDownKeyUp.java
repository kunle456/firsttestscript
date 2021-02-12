package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeyUp {
	
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		
		WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(gmailLink).keyUp(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//span[text()='I agree']")).click();

}

   }