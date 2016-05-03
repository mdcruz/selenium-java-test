package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testSupport.Browser;

public class BasePage {
	
	protected WebDriver driver;
	
	BasePage(){
		driver = Browser.driver;
		PageFactory.initElements(driver, this);
	}
	
	protected WebElement waitForElementToBeLoaded(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
}
