package HandlingPopUp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Child Browser Pop up
public class POPUP3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String>allwids=driver.getWindowHandles();
		for(String wid:allwids) {
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
		

}
   
    }
	
}
