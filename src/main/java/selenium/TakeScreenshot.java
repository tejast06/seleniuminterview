package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/software-testing.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = 	ts.getScreenshotAs(OutputType.FILE);
	    File trg = new File(".\\screenshots\\ss.png");
	    FileUtils.copyFile(src, trg);
	    
	    //screenshot of section
	  WebElement ele =   driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
	  File src1 =  ele.getScreenshotAs(OutputType.FILE);
	  File trg1 = new File(".\\screenshots\\policy.png");
	  FileUtils.copyFile(src1, trg1);
		
		
	  
	   
		
	     
		
		
		
		
}

}
