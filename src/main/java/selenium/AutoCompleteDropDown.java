package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteDropDown {
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
	    WebElement searchBox = 	driver.findElement(By.id("autocomplete"));
	    searchBox.clear();
	    searchBox.sendKeys("Toronto");
	    
	    
	    String text;
	    do {
	   searchBox.sendKeys(Keys.ARROW_DOWN);
	    text =  searchBox.getAttribute("value");
	   if(text.equals("Toronto NSW, Australia")) {
		   searchBox.sendKeys(Keys.ENTER);
		   break;
	   }
	    }while(!text.isEmpty());
	    	
	   
		
		
	     
		
		
		
		
}

}
