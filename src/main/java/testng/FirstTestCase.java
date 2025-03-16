package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//testng execute based on alphabetical order.
//we can control the execution of order by using priority
//if you don't have priority then default value is 0.
//if 2 methods have same priority, then it is executed on alaphabetical order.
//we can add negative priority for ex -1, then it will execute first

public class FirstTestCase {
	
	public WebDriver driver;
	
	@Test(priority = 1)
	public void openapp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    
		
	}
	
	@Test(priority = 2)
	public void enterCredsAndClickOnLogin() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
	
	@Test(priority = 3)
	public void quit() {
		driver.quit();
		
	}

}
