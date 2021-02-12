package Polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester {
	public static void automate(WebDriver driver) {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		automate(new ChromeDriver()); 
		automate(new FirefoxDriver());

}
     
     }
