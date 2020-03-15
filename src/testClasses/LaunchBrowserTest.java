package testClasses;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchBrowserTest {

	protected static WebDriver driver = null;

	@BeforeSuite
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://www.techlistic.com/");s
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	public static WebElement getElement(By locator) {
		if (driver.findElements(locator).size() == 1) {
			return driver.findElement(locator);
		} else
			throw new NoSuchElementException();
	}

	public static WebElement getElement(String locator) {

		if (driver.findElements(By.id(locator)).size() == 1) {
			return driver.findElement(By.id(locator));
		} else if (driver.findElements(By.className(locator)).size() == 1) {
			return driver.findElement(By.className(locator));
		} else if (driver.findElements(By.cssSelector(locator)).size() == 1) {
			return driver.findElement(By.cssSelector(locator));
		} else if (driver.findElements(By.linkText(locator)).size() == 1) {
			return driver.findElement(By.linkText(locator));
		} else if (driver.findElements(By.name(locator)).size() == 1) {
			return driver.findElement(By.name(locator));
		} else if (driver.findElements(By.xpath(locator)).size() == 1) {
			return driver.findElement(By.xpath(locator));
		} else
			throw new NoSuchElementException();
	}

	@AfterSuite(alwaysRun = true)
	public void close() {
		driver.close();
		driver.quit();
	}

}