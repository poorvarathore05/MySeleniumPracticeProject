package testClasses;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import helperClasses.ButtonHelper;
import helperClasses.textBoxHelper;

public class AutomateGoogleSearch extends LaunchBrowserTest {

	@Test
	public void googleSearch() {

		driver.get("https://www.google.com/?hl=en-US");
		driver.manage().window().maximize();
		textBoxHelper.typeInTextBox(By.xpath("//input[@class ='gLFyf gsfi']"), "san francisco");

		for (int i = 1; i <= 5; i++) {
			String randomXpath = "//ul[@role='listbox']//li[" + i + "]/div[1]//div[@class='sbl1']";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.pollingEvery(3, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(randomXpath), "san francisco"));
		    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String elementtext = driver.findElement(By.xpath(randomXpath)).getText();

			if (elementtext.equalsIgnoreCase("san francisco")) {
				driver.findElement(By.xpath(randomXpath)).click();
				// ButtonHelper.clickButton(By.xpath(randomXpath));
				break;
			}
		}

		// System.out.print("Title :"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("san francisco"));

	}
}
