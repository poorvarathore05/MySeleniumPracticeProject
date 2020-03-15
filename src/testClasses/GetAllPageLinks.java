package testClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetAllPageLinks extends LaunchBrowserTest {
	
	@Test
	public void pageLinks(){
		
	   driver.get("http://automationpractice.com/index.php");	
	   List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	   System.out.println("Total Links : "+allLinks.size());
	   
	   
	   for(WebElement element : allLinks){
		   System.out.println("Text :- " +element.getText());
		   System.out.println("href :- " +element.getAttribute("href"));
	   }
	}

}
