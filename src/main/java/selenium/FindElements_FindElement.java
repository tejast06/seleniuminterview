package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_FindElement {
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//h2[text()='Dynamic Button']")).getText();
		System.out.println("text is " +text);
		
	    List<WebElement> list = driver.findElements(By.xpath("//select[@id='country']/option"));
	    
	    int l = list.size();
	    
	    System.out.println("number of ele:" +l);
	    
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(list.get(i).getText());
	    	if(list.get(i).getText().contains("United Kingdom")) {
	    		list.get(i).click();
	    	}
	    }
		
		
		
	
	    
		
	}

}
