package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SearchPage;
import pageObjects.SearchResultsPage;
import testSupport.Pages;

import static org.fest.assertions.Assertions.assertThat;

public class SearchTakeAwaySteps {
		
	@Given("^I am on the JustEat search page$")
	public void i_am_on_the_JustEat_search_page() throws Throwable {
	    Pages.page(SearchPage.class).visit("http://www.just-eat.co.uk/");
	}

	@When("^I search for restaurants in \"(.*)\"$")
	public void i_search_for_restaurants_in(String postCode) throws Throwable {
		Pages.page(SearchPage.class).searchTakeaway(postCode);
	}

	@Then("^I should see some restaurants in \"(.*)\"$")
	public void i_should_see_some_restaurants_in(String postCode) throws Throwable {  
		assertThat(Pages.page(SearchResultsPage.class).isSearchResultsCorrect(postCode)).isTrue();	    
	}
}
