package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetCSSValue {
	
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		String actualrgba=driver.findElement(By.id("u_0_2")).getCssValue("background-color");
		
		//1st Way of Comparison 
		System.out.println("actualrgba::"+actualrgba); 
		String expectedrgba = "rgba(66, 183, 42, 1)";
		if(actualrgba.equals(expectedrgba)) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}
		
		
		//2nd Way of Comparison(#FFFFFFF) = WHite  (#0000000) = Black
		String actualHexa=Color.fromString(actualrgba).asHex();
		String expectedHexa ="#42b72a";
		System.out.println("actualHexa::"+actualHexa);
		
		if(actualHexa.equals(expectedHexa)) {
			System.out.println("PASSED on Hexa Comparison");
	    } else {
	    	System.out.println("PASSED on Hexa Comparison");
	    }
		
		driver.quit();
	 
}

    }

