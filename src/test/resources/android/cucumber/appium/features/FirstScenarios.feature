
Feature: Amazon App works
	
	
Scenario: Searching in amazon
Given App is open
When I search for 'books'
Then I should see results