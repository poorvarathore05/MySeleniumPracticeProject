package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import helperClasses.ButtonHelper;
import helperClasses.WindowHelper;
import helperClasses.textBoxHelper;

public class SearchProduct extends LaunchBrowserTest {

	@Test
	public void searchProduct() throws InterruptedException {

		driver.get("http://automationpractice.com/index.php");
		WindowHelper.maximazie();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]"))).build().perform();
		ButtonHelper.clickButton(By.xpath("//div[@id='block_top_menu']/ul/li[3]"));
		String itemText = driver.findElement(By.xpath("//div[@class='right-block']/h5/a")).getText();
		System.out.println("Text :" + itemText);
		textBoxHelper.typeInTextBox(By.id("search_query_top"), itemText);
        Thread.sleep(2000);
        
        ButtonHelper.clickButton(By.xpath("//button[@class='btn btn-default button-search']"));
		String productName = driver.findElement(By.xpath("//div[@class='right-block']/h5/a")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(productName, itemText);
	}

}
