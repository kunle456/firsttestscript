package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VERIFYTHELEFTALIGNMENT 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		int usernameStartX=username.getLocation().getX();
		int passwordStartX=password.getLocation().getX();
		
		
		if(usernameStartX==passwordStartX) {
			System.out.println("PASSED:: Left Alignment is Correct");
		} else {
			System.out.println("FAILED:: Left Alignment has Failed");
		}
}

}