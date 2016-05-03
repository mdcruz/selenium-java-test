package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BasePage{
	
	@FindBy(how = How.CSS, using = "#postcode")
	private WebElement postCodeField;
	
	@FindBy(how = How.CSS, using = ".o-btn.o-btn--primary")
	private WebElement searchButton;
	
	public void visit(String url){
		driver.get(url);
	}
	
	public void searchTakeaway(String postCode){
		postCodeField.clear();
		postCodeField.sendKeys(postCode);
		searchButton.click();
	}
	
}
