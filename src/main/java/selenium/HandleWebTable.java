package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    int row=	driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	    System.out.println("number of rows:" +row);
	    
	    int col =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
	    System.out.println("number of column:" +col);
	    
	    
		String val = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText();
		System.out.println(val);
		
		for(int r=2; r<=row; r++) {
			for(int c=1; c<=col; c++) {
				String data = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data+"    ");
				
			}
			    System.out.println();
		}
	  
	   
		
	     
		
		
		
		
}

}
