package testClasses;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import helperClasses.ButtonHelper;
import helperClasses.WindowHelper;

public class testWindowClass extends LaunchBrowserTest {
	
	@Test
	public void window(){
	System.out.println("Title :" + driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("Techlistic"));
	System.out.println("Assertion Passed");

	String page = driver.getPageSource();
	// System.out.println("PageSource : "+page);
	WindowHelper.maximazie();

	ButtonHelper.clickButton(By.xpath("//div[@id='page_list_top']//div[@class='overflowable-contents']/div//a[text()='Java']"));
	//Assert.assertEquals(driver.findElement(By.linkText("Java Tutorials Series - Java For Selenium")),"Java Tutorials Series - Java For Selenium");
	ButtonHelper.clickButton(By.xpath("//div[@id='page_list_top']//div[@class='overflowable-contents']/div//a[text()='Home']"));
	ButtonHelper.clickButton(By.xpath("//div[@id='page_list_top']//div[@class='overflowable-contents']/div//a[text()='Selenium']"));
	//Assert.assertTrue(driver.getTitle().contains("Selenium Tutorial"));
	
	ButtonHelper.clickButton(By.xpath("//div[@id='page_list_top']//div[@class='overflowable-contents']/div//a[text()='Home']"));

}
}