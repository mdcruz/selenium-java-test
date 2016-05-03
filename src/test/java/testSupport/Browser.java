package testSupport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static void initialise(){
		driver = new FirefoxDriver();
	}
	
	public static void quit(){
		if(driver != null)
			driver.quit();
	}

}
