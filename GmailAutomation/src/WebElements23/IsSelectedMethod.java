package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");

		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		if(checkbox.isSelected()) {
			System.out.println("CheckBox is Selected");
		} else {
			System.out.println("Checkbox is Not Selected");
		}
}
     }
