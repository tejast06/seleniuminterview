package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {
	
public WebDriver driver;
	
	@Test
	public void test() throws InterruptedException, IOException {
		
	    String location=	System.getProperty("user.dir")+"\\Downloads";
	    
	    HashMap pref = new HashMap();
	    pref.put("download.default_directory", location);
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("prefs", pref);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.sharedfilespro.com/download-sample-pdf/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		
		
		
		
	  
	   
		
	     
		
		
		
		
}
	
}
