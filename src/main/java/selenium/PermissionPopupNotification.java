package selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopupNotification {
	public WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException, IOException {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("https:admin:admin@the-internet.herokuapp.com/digest_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	   
		
	    
		
		
	  
	   
		
	     
		
		
		
		
}

}
