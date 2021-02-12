package HnadlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(5000);
		
		List<WebElement> AutoSuggestions = driver.findElements(By.className("sbct"));
		System.out.println(AutoSuggestions.size());
		for(WebElement AutoSuggestion:AutoSuggestions) {
			System.out.println(AutoSuggestion.getText());
		}
		
	}

}
