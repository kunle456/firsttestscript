package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectofTheElement 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		Rectangle usernameRect = username.getRect();
		System.out.println(usernameRect.getHeight());
		System.out.println(usernameRect.getWidth());
		System.out.println(usernameRect.getX());
		System.out.println(usernameRect.getY());
		

}
    }
