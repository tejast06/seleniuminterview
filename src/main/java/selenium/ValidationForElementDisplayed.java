package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationForElementDisplayed {
	
	public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	
	    Assert.assertTrue(driver.findElement(By.xpath("//input[@id='name']")).isDisplayed());
	    
	    driver.findElement(By.xpath("//input[@id='male']")).click();
	    
	    Assert.assertTrue(driver.findElement(By.xpath("//input[@id='male']")).isSelected());
		
	}

}
