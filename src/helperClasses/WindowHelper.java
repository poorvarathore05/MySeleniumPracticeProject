package helperClasses;

import testClasses.LaunchBrowserTest;

public class WindowHelper extends LaunchBrowserTest {
	
	 public static void navigateToWindow(String url){
		 driver.navigate().to(url);
	 }
    
	  public static void maximazie(){
		  driver.manage().window().maximize();
	  }
	  
	  public  static void forward(){
		  driver.navigate().forward();
	  } 
	  
	  public static void backward(){
		  driver.navigate().back();
	  }
	  public static void refersh(){
		  driver.navigate().refresh();
	  }
}
