package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/software-testing.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.findElement(By.linkText("About Us")).click();
		
		//get all links
	    List<WebElement> links = 	driver.findElements(By.tagName("a"));
	    
	    System.out.println("number of links" +links.size());
	    
	    for(int i=0; i<links.size(); i++) {
	    	String data =  links.get(i).getText();
	    	System.out.println(data);
	    	System.out.println(links.get(i).getAttribute("href"));
	    	
	    	
	    	
	    }
		
		
	  
	   
		
	     
		
		
		
		
}

}
