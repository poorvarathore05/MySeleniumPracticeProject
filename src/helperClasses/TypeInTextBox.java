package helperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testClasses.LaunchBrowserTest;
import testClasses.UserRegisterationDummy;

public class TypeInTextBox extends LaunchBrowserTest{
	
	
	public void typeMethod(By locator ,String firstValue ){
		WebElement ele = getElement(locator);
		ele.sendKeys(firstValue);
	}

}
