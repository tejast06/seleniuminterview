package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableWithPagination {
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.findElement(By.cssSelector("#input-username")).clear();
		driver.findElement(By.cssSelector("#input-username")).sendKeys("demo");
		
		driver.findElement(By.cssSelector("#input-password")).clear();
		driver.findElement(By.cssSelector("#input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//li[@id='menu-sale']")).click();
		driver.findElement(By.xpath("//li[@id='menu-sale']/ul/li[1]")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text); //Showing 1 to 10 of 1065 (107 Pages)
	    int totalPage = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	    System.out.println("Total number of page" +totalPage);
	    
	    
	    try {
	    	for(int p=1; p<=totalPage; p++) {
		        WebElement activePage = 	driver.findElement(By.xpath("//ul[@class='pagination']/li/span"));
		        Thread.sleep(5000);
		        activePage.click();
		        
		       int rows =  driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
		       System.out.println("total number of rows:" +rows);
		      String page =  Integer.toString(p+1);
		       driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+page+"']")).click();
		        
		    }
	    	
	    }catch(StaleElementReferenceException e) {
	    	System.out.println(e);
	    }
	    
	    
	    
	    
		
		
	    
	  
	   
		
	     
		
		
		
		
}

}
