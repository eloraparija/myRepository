Feature: verify all links
Scenario: Verify all links

Given I go to ebay website
When I search for all links
Then I should see the below links
|Following|Today|Motors|