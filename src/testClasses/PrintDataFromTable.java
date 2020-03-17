package testClasses;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PrintDataFromTable extends LaunchBrowserTest {
	
	@Test
	public void tableData(){
		
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		for(int row =1;row<10;row++){
			for(int col = 1 ;col<7;col++){
				String xpath = ("//table[@id='example']//tbody//tr["+ row+"]//td["+col+"]");
				WebElement content = driver.findElement(By.xpath(xpath));
				System.out.print(content.getText()+ "   ");
				
		}
			System.out.println();
			}
		}
		;
				
				
}