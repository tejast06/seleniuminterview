package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropOperations {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
	    WebElement source = 	driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    Actions act = new Actions(driver);
	    act.dragAndDrop(source, destination).build().perform();
		
		
		
		
	  
	   
		
	     
		
		
		
		
}

}
