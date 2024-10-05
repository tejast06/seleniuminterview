package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {
	
	
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		
	   List<WebElement> list =  driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	   selectValue(list, "All Cards");
		
}
	
	public void selectValue(List<WebElement> options,String val) {
		 for(int i =0; i<options.size(); i++) {
			   if(options.get(i).getText().equals(val)) {
				   options.get(i).click();
			   
			   }
		   }
		
		
	}

}
