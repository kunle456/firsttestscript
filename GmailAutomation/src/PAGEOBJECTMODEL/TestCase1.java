package PAGEOBJECTMODEL;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com");
			
			LoginPage Ip = new LoginPage(driver);
			driver.navigate().refresh();
			
			Ip.getUsernameTB().sendKeys("admin");
			Ip.getPassword().sendKeys("manager");
			Ip.getLogin().click();
	
	}

}
