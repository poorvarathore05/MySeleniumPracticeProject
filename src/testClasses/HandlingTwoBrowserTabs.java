package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingTwoBrowserTabs extends LaunchBrowserTest {

	
	@Test
	public void handleTwoTabs(){
		
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
	
		act.keyDown(Keys.CONTROL).sendKeys("t").sendKeys(driver.findElement(By.id("fakebox-input"))).click().
		keyUp(Keys.CONTROL)
		.build().perform();
		driver.findElement(By.xpath("//div[@id ='search']//div//h3[text()='Gmail - Google']")).click();
		driver.switchTo().defaultContent();
	
		
		
		
		
	}
}
