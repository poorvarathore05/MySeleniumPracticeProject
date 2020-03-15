package helperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testClasses.LaunchBrowserTest;

public class ButtonHelper extends LaunchBrowserTest {
	
	public static void clickButton(By locator){
		WebElement element = getElement(locator);
		element.click();
	}
	

	

}
