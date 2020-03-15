package testClasses;

import java.util.concurrent.TimeUnit;

import javax.swing.SpringLayout.Constraints;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider  {

	
    @Test(dataProviderClass=DataProviderDetails.class, dataProvider ="loginProvider")
	public void LoginPage(String username, String password, boolean response){
    	
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
		
		
	    System.out.println("Login Details :\n" + "Email :-" + username + "\n" + "Password :- " + password + "\n"
					+ "Response :-" + response+"\n");
	   // System.out.print(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("My account - My Store"));
	    driver.quit();

	}
}
