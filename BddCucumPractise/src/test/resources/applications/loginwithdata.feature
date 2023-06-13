Feature: Login Functionality with data
Scenario: validate login with given data
Given user at logon page
When user enters username as "pragati"
And user enters password as "pragati123"
And user click on login button
Then user should get log into homepage