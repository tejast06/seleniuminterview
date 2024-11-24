package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickOPerations {
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    WebElement ele = 	driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions act = new Actions(driver);
	    act.doubleClick(ele).perform();
		
		
		
	  
	   
		
	     
		
		
		
		
}

}
