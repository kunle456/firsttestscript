package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataIntoTextField {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement usernameTB=driver.findElement(By.id("username"));
		usernameTB.sendKeys("mynameiskhan");
		
		WebElement password=driver.findElement(By.name("pwd"));
		password.click();
		password.sendKeys("moppy");
		
	}

}
