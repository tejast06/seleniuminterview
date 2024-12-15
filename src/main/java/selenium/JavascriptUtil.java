package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
	
	public void clickElementByJs(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
		}
	
	public  void scrollToElementUsingJS(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
         js.executeScript("arguments[0].scrollIntoView(true);",element);
}
	
	public String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    String title = 	js.executeScript("return document.title;").toString();
	    return title;
		
	}
	
	public void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+ message +"')");
		
	}

}
