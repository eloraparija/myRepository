@tag1
Feature: Test gmail
In order to test gmail


Scenario Outline: Test gmail

Given I go to <url> of gmail
When I click on the link
Then it should show me the page


Examples:
|url                   |
|http://eloraparija.com|


