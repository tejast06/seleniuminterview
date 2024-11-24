package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardCtrlOperation {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("inputText1")).click();
		driver.findElement(By.id("inputText1")).sendKeys("sxscdcd");
		
		driver.findElement(By.id("inputText2"));
		
		Actions act = new Actions(driver);
		//Ctrl+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Ctrl+c
				act.keyDown(Keys.CONTROL);
				act.sendKeys("c");
				act.keyUp(Keys.CONTROL);
				act.perform();
				
		//Tab:
				act.sendKeys(Keys.TAB);
				act.perform();
				
				//Ctrl+v
				act.keyDown(Keys.CONTROL);
				act.sendKeys("v");
				act.keyUp(Keys.CONTROL);
				act.perform();
		
		
		
		
		
	  
	   
		
	     
		
		
		
		
}

}
