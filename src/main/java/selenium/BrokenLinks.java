package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
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

public class BrokenLinks {
	
public WebDriver driver;
int brokenLinks=0;
	
	@Test
	public void test() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/software-testing.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    List<WebElement> link = 	driver.findElements(By.tagName("a"));
	    for(WebElement l:link) {
	      String url = 	l.getAttribute("href");
	      if(url==null || url.isEmpty()) {
	    	  System.out.println("url is empty");
	    	  continue;
	      }
	      
	      URL u = new URL(url);
	      HttpURLConnection con = (HttpURLConnection) u.openConnection();
	      con.connect();
	      if(con.getResponseCode()>=400) {
	    	  System.out.println(con.getResponseCode() + "is" + "broken link");
	    	  brokenLinks++;
	    	  con.disconnect();
	      }
	      else {
	    	  System.out.println(con.getResponseCode() + "is" + "valid link");
	    	  
	      }
	    }
		
		
	  
	   
		
	     
		
		
		
		
}

}
