package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadfile {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException, IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\opendr\\Desktop\\testimage.jpg");
	    WebElement ele = 	driver.findElement(By.xpath("//input[@type='file']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", ele);
		
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\opendr\\Desktop\\testimage.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		
		
		
		
		
		
	  
	   
		
	     
		
		
		
		
}

}
