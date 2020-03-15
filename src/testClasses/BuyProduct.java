package testClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import helperClasses.ButtonHelper;
import helperClasses.ComboBoxHelper;
import helperClasses.WindowHelper;
import helperClasses.textBoxHelper;

public class BuyProduct extends LaunchBrowserTest {

	@Test
	public void buyProduct() {

		driver.get(" http://automationpractice.com/index.php");
		WindowHelper.maximazie();
		ButtonHelper.clickButton(By.className("login"));
		textBoxHelper.typeInTextBox(By.id("email"), "poorvarathore02@gmail.com");
		textBoxHelper.typeInTextBox(By.id("passwd"), "rathore");
		ButtonHelper.clickButton(By.id("SubmitLogin"));
		Assert.assertTrue(driver.getTitle().contains("My Store"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]")))
		.clickAndHold()
		.build().perform();

		ButtonHelper.clickButton(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/ul/li[2]/a[text()='Blouses']"));
		act.moveToElement(driver.findElement(By.xpath("//div[@class='product-image-container']/a/img")))
		.clickAndHold()
		.build().perform();
		ButtonHelper.clickButton(By.xpath("//a[@class='button lnk_view btn btn-default']/span"));
		ButtonHelper.clickButton(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		ButtonHelper.clickButton(By.id("color_8"));
		ButtonHelper.clickButton(By.id("add_to_cart"));
		ButtonHelper.clickButton(By.xpath("//a[@class='btn btn-default button button-medium']"));
		ButtonHelper.clickButton(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		ButtonHelper.clickButton(By.xpath("//button[@class='button btn btn-default button-medium']"));
        ButtonHelper.clickButton(By.id("cgv"));
        ButtonHelper.clickButton(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		ButtonHelper.clickButton(By.xpath("//a[@class='button-exclusive btn btn-default']"));
			e.printStackTrace();
		}
	}

}
