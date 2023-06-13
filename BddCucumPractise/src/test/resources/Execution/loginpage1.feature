Feature: Login 
Scenario: login page title
Given user is at landing page
When user gets the title of page
Then page title should have word "Shopping"

Scenario: verify cart icon
Given user is at landing page
Then cart icon should get display

Scenario: Login to application
Given user is at landing page
When user enters username as "9529296093"
And user enters password as "amazon@6"
And user confirms signin