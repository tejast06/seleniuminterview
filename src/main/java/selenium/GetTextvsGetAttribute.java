package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextvsGetAttribute {
	
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='name']")).getAttribute("class"));
		
		
		
		

}
}
