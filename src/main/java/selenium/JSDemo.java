package selenium;

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

public class JSDemo {
public WebDriver driver;
public JavascriptUtil javascriptUtil;
	
	@Test
	public void test() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		javascriptUtil = new JavascriptUtil();
		driver.get("https://www.guru99.com/software-testing.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    WebElement ele = 	driver.findElement(By.linkText("eBook"));
	    
	    javascriptUtil.scrollToElementUsingJS(ele, driver);
	    
	    javascriptUtil.clickElementByJs(driver, ele);
	   String title =  javascriptUtil.getTitleByJs(driver);
	   System.out.println(title);
	   javascriptUtil.generateAlert(driver,"test alert");
		
		
		
		
	  
	   
		
	     
		
		
		
		
}

}
