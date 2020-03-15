package helperClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testClasses.LaunchBrowserTest;

public class textBoxHelper extends LaunchBrowserTest {
	
	
	public static  void typeInTextBox(String locator,String value){
		WebElement element = getElement(locator);
		element.sendKeys(value);
		
	}

	public static  void typeInTextBox(By locator,String value){
		WebElement element = getElement(locator);
		element.sendKeys(value);
	}
		
}
