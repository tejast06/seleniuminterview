package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://fengyuanchen.github.io/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String year = "2024";
		String month = "December";
		String date = "16";
		
		driver.findElement(By.xpath("//input[@placeholder='Pick a date']")).click();
		
		
		
		while(true) {
			
		String monthYear = 	driver.findElement(By.xpath("//li[@data-view='month current']")).getText();
		   String[] arr = monthYear.split(" ");
		   String mon =  arr[0];
		   String yrs = arr[1];
		   if(mon.equalsIgnoreCase(month)&& yrs.equals(year)) {
			   break;
		   }
		   else {
			   driver.findElement(By.xpath("//li[@data-view='month next']")).click();
		   }
			
		}
		
	    List<WebElement> dates = 	driver.findElements(By.xpath("//ul[@data-view='days']//li"));
	    for(WebElement ele:dates) {
	          String dd =  ele.getText();
	          if(dd.equals(date)) {
	        	  ele.click();
	        	  break;
	          }
	    }
		
		
		
		
		}

}
