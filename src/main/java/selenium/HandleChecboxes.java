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

public class HandleChecboxes {
	
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    List<WebElement> checkboxes=	driver.findElements(By.xpath("//div[@class='form-check form-check-inline']/input[@class='form-check-input' and @type='checkbox']"));
		
	    int size=  checkboxes.size();
////	    for(int i=0; i<=size; i++) {
////	    	checkboxes.get(i).click();
////	    }
//	    
//	    for(WebElement ch:checkboxes) {
//	     String chkboxes = 	ch.getAttribute("id");
//	     if(chkboxes.equals("monday") || chkboxes.equals("wednesday")) {
//	    	 ch.click();
//	     }
//	    }
	    
	    //select last 2 checkboxes.
	    
//	    for(int i=size-2; i<size; i++) {
//	    	checkboxes.get(i).click();
//	    }
	    
	    //select first 2 checkboxes.
	    for(int i=0; i<size; i++) {
	    	if(i<2) {
	    		checkboxes.get(i).click();
	    	}
	    }
	    
		
		
		
		
}

}
