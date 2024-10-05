package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestionDropDown {
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
	    List<WebElement> values = 	driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	    for(WebElement ele:values) {
	    	if(ele.getText().contains("selenium interview questions")) {
	    		ele.click();
	    	}
	    	
	    	
	    }
	     
		
		
		
		
}

}
