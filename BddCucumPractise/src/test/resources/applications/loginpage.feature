Feature: Login functionality
Scenario: Login to application with correct credentials
Given User is at the login screen
When User enters the username
And User enters the password
And User click on login button
Then User should get redirect to the home page

Scenario: Login to application with incorrect credentials
Given User is at the login screen
When User enters the incorrect username
And User enters the incorrect password
And User click on login button
Then User should get error message


