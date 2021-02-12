package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(block1,  block4).perform();

}
    }
