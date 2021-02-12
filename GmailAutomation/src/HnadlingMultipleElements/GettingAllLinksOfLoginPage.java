package HnadlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingAllLinksOfLoginPage {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks) {
			System.out.println(link.getText());
		}
		
	}

}
