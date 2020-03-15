package helperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import testClasses.LaunchBrowserTest;

public class ComboBoxHelper extends LaunchBrowserTest {
	
	private static Select select = null;
	
	public static void select(By locator,int index){
		select = new Select(getElement(locator));
        select.selectByIndex(index);
        
	}
	
	public static void select(By locator ,String value){
		select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void select(String locator){
		select = new Select(getElement(locator));
		select.selectByVisibleText(locator);
	}

}
