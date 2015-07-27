@tag1
Feature: Test google
In order to test google

Background:
Given I go to google

@tag3
Scenario Outline: Test google


When I search <this text>
Then it should show me the result


Examples:
|url     |   this text     |
|~google~|  ~selenium~     |
#|~google~|  ~cucumber~     |
