package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick {
	
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
		
		WebElement plusButton=driver.findElement(By.id("add"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(plusButton).perform();

}

    }