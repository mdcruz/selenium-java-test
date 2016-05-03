$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchTakeaways.feature");
formatter.feature({
  "line": 1,
  "name": "Search takeaways in my area",
  "description": "In order to check what takeaways there is in my area\r\nAs a customer\r\nI want to search for takeaways",
  "id": "search-takeaways-in-my-area",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13125724233,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search a takeaway when valid post code is provided",
  "description": "",
  "id": "search-takeaways-in-my-area;search-a-takeaway-when-valid-post-code-is-provided",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the JustEat search page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for restaurants in \"N4 2NY\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see some restaurants in \"N4 2NY\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchTakeAwaySteps.i_am_on_the_JustEat_search_page()"
});
formatter.result({
  "duration": 5192128598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "N4 2NY",
      "offset": 29
    }
  ],
  "location": "SearchTakeAwaySteps.i_search_for_restaurants_in(String)"
});
formatter.result({
  "duration": 5635156248,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "N4 2NY",
      "offset": 34
    }
  ],
  "location": "SearchTakeAwaySteps.i_should_see_some_restaurants_in(String)"
});
formatter.result({
  "duration": 288947309,
  "status": "passed"
});
formatter.after({
  "duration": 1951436060,
  "status": "passed"
});
});