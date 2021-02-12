package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDatainDisabledTextField {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://live.skillrary.com/testing-app/");
		
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Mohan");
		
		WebElement inputField=driver.findElement(By.xpath("//input[@class='form-control']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='mohan';",inputField);
		

		
	}
}
