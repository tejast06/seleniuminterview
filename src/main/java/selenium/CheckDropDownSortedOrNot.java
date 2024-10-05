package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSortedOrNot {
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		
	     WebElement element= 	driver.findElement(By.name("category_id"));
	     Select sel = new Select(element);
	     List<WebElement> options =   sel.getOptions();
	     
	     ArrayList originalList = new ArrayList();
	     ArrayList tempList = new ArrayList();
	     for(WebElement option:options) {
	    	 originalList.add(option.getText());
	    	 tempList.add(option.getText());
	     }
	     
	     
	     
	     Collections.sort(tempList);
	     System.out.println("original list" +originalList);
	     System.out.println("temp list" +tempList);
	     
		
		
		
		
}

}
