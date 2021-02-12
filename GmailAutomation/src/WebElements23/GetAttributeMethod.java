package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		String classAttributeValue = username.getAttribute("class");
		System.out.println(classAttributeValue);
		
		String valueIntTextField = username.getAttribute("value");
		if(valueIntTextField.isEmpty()) {
			System.out.println("Username TextField is Empty");
		} else {
			System.out.println("Username TextField is not Empty");

}
   
   }
	
}
