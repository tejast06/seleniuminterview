package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoover {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    WebElement ele = 	driver.findElement(By.xpath("//div[text()='Add-ons']"));
	    WebElement ele1 = driver.findElement(By.xpath("//div[text()='Extra Seat']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(ele).moveToElement(ele1).perform();
	    ele1.click();
	    
		
		
		
		
	  
	   
		
	     
		
		
		
		
}

}
