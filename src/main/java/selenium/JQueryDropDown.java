package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDown {
public WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		selectValues(driver, "all");
		
		
		
		
		
		

}
	
	public void selectValues(WebDriver driver,String...value) {
		
	List<WebElement> choiceList = 	driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	if(!value[0].equalsIgnoreCase("all")) {
		for(WebElement item:choiceList) {
		    String text = item.getText();
		    for(String val:value) {
		    	if(text.equals(val)) {
		    		item.click();
		    		break;
		    	}
		    }
		}
		
	}
	else {
		
		try {
			for(WebElement choice:choiceList) {
				choice.click();
			}
			
		}catch(Exception e) {
			
		}
		
		
	}
		
	}

}
