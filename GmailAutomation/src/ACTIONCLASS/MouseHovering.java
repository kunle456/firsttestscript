package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
		WebElement profile=driver.findElement(By.xpath("//span[text()='Profile']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(profile).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("LOGIN / SIGNUP")).click();
		
		
	}

}
