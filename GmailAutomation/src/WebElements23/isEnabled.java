package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://live.skillrary.com/testing-app/");
		if(driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled()) {
			System.out.println("Enabled");
		} else {
			System.out.println("Disabled");
		}

}
    }
