package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPage extends BasePage{

	@FindBy(how = How.CSS, using = "#searchResultsHeaderInner>h1")
	private WebElement searchResultsHeader;
	
	public boolean isSearchResultsCorrect(String postCode){
		String resultsText = waitForElementToBeLoaded(searchResultsHeader).getText();
		
		if(resultsText.contains(postCode))
			return true;
		
		return false;
	}
}
