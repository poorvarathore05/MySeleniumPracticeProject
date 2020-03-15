package testClasses;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindBrokenLink extends LaunchBrowserTest{
	
	@Test
	public void findLinks() throws InterruptedException,MalformedURLException, IOException {
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total Links :" +links.size());
		
		ArrayList<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i =0;i<links.size();i++){
	        
			if(links.get(i).getAttribute("href") != null && links.get(i).getAttribute("href").startsWith("http://")){
            
				activeLinks.add(links.get(i));
			}
		}
		
		for(int k =0;k<activeLinks.size();k++){
			System.out.println(activeLinks.get(k).getAttribute("href"));
		}
		System.out.println("active Links and images :" +activeLinks.size());
		
		for(int j =0;j<activeLinks.size();j++){
			HttpURLConnection connection =(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activeLinks.get(j).getAttribute("href") + "Response = " +response);
		}
		
		
		
	}

}
