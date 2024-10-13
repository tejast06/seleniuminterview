package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJSScriptPopups {
	
	public WebDriver driver;
	
		
		@Test
		public void test() throws InterruptedException, IOException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https:admin:admin@the-internet.herokuapp.com/digest_auth");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		   //click with js alert ok button.
//			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//			driver.switchTo().alert().accept();
			
//			driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//			driver.switchTo().alert().accept();
			
//			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		    Alert alert = 	driver.switchTo().alert();
//		   
//		    alert.sendKeys("test");
			
			//authentication pop up:
			
		    
			
			
		  
		   
			
		     
			
			
			
			
	}

}
