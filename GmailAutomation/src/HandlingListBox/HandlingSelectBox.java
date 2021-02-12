package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectBox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("file://D:/Java%20Selenium/105/Selenium/Session%2017/index.html");
		
		WebElement mbox=driver.findElement(By.id("m1"));
		
		Select select = new Select(mbox);
		select.selectByValue("Java");
		select.selectByValue("Sql");
		
		select.deselectAll();
		select.deselectByValue("Java");
	


}
    
   }
