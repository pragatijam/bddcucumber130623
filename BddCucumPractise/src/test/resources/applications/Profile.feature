Feature: Profile functionality
@sanity @functional
Scenario: Add Profile
Given user is at the add profile page
When user enters the info
Then user id gets created
@functional
Scenario: Edit Profile
Given user is at the add profile page
When user click on edit link
And user update the indo 
Then profile get updated
@regression
Scenario: Delete Profile
Given user is at the add profile page
When user click on delete button 
Then profile should get deleted