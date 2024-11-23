package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker_dropdown {
	
public WebDriver driver;
	String dd = "15";
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[text()='Jan']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='1933']")).click();
		
	     List<WebElement>list = 	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
	     for(WebElement date:list) {
	    	String d =  date.getText();
	    	if(d.equals(dd)) {
	    		date.click();
	    		break;
	    	}
	    	
	     }
		
		
	    	
	    	
	    	
	    }
		
		}


