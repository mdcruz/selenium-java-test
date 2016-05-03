Feature: Search takeaways in my area
	In order to check what takeaways there is in my area
	As a customer
	I want to search for takeaways
	
	Scenario: Search a takeaway when valid post code is provided
		Given I am on the JustEat search page
		When I search for restaurants in "N4 2NY"
		Then I should see some restaurants in "N4 2NY"