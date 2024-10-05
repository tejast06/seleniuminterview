package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public WebDriver driver;
	
	
	
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
