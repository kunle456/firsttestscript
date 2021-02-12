package WebElements23;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		File srcFile=driver.findElement(By.id("loginButton")).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./errorShots/loginButton.png");
		
		FileUtils.copyFile(srcFile, destFile);
	}

}
