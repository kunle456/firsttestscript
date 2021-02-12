package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndLocationOfElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		
		Dimension userNameDim =username.getSize();
		System.out.println(userNameDim.getHeight());
		System.out.println(userNameDim.getWidth());
		
		Point userNameCord = username.getLocation();
		System.out.println(userNameCord.getX());
		System.out.println(userNameCord.getY());
		
		driver.quit();

}
  }
