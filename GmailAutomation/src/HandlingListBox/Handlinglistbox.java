package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglistbox {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.xpath("//button[text()='Accept All']")).click();
    driver.findElement(By.id("u_0_2")).click();
    
    Thread.sleep(5000);

    WebElement day=driver.findElement(By.id("day"));
    
    Select select = new Select(day);
    select.selectByVisibleText("17");
    //select.selectByIndex(5);
    	
  

}

}