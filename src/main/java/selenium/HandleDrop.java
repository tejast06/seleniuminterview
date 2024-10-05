package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDrop {
	
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//	    WebElement ele = 	driver.findElement(By.xpath("//select[@id='country']"));
//	    Select sel = new Select(ele);
//	    sel.selectByVisibleText("Germany");
//	    sel.selectByVisibleText("France");
//	    
//        List<WebElement> list = driver.findElements(By.xpath("//select[@id='country']/option"));
//	    
//	    int l = list.size();
//	    
//	    System.out.println("number of ele:" +l);
//	    
//	    for(int i=0; i<list.size(); i++) {
//	    	System.out.println(list.get(i).getText());
//	    	if(list.get(i).getText().contains("United Kingdom")) {
//	    		list.get(i).click();
//	    	}
//	    }
	    
	    
	    
	    
	    WebElement dropDown =  driver.findElement(By.xpath("//select[@id='country']"));	
	    selectOptionFromDropDown(dropDown, "United Kingdom");

}
	public void selectOptionFromDropDown(WebElement ele,String value) {
		
		Select drp = new Select(ele);
	    List<WebElement> list = 	drp.getOptions();
	    for(WebElement option:list) {
	    	if(option.getText().contains(value)) {
	    		option.click();
	    	}
	    }
		
    	
    }

}
