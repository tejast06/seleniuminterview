package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindows {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String winhandle = driver.getWindowHandle();
		System.out.println(winhandle);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
	    Set<String> windows = 	driver.getWindowHandles();
	  Iterator<String> it =   windows.iterator();
	  String parent =  it.next();
	  String child =  it.next();
	  driver.switchTo().window(child);
	  System.out.println("child window" +driver.getTitle());
	  driver.close();
	  driver.switchTo().window(parent);
	  System.out.println("parent window" +driver.getTitle());
	  
	   
		
	     
		
		
		
		
}

}
