package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Verify if google is Logo or Image

public class GetTagName 
{
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String tagName=driver.findElement(By.id("hplogo")).getTagName();
		System.out.println(tagName);
		if(tagName.equals("img")) { 
		System.out.println("Its an Image/Logo");
		} else {
			System.out.println("Its not an Image/Logo");
		}
		driver.quit();
				
	
	}

}
