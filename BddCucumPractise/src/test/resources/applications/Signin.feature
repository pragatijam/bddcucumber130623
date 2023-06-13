Feature: sign in functionality
Scenario: Sign in to application
Given  open sign in page
When  enters Firstname
And  enters Lastname
And  enters email id
And  click Signin button 
Then  should get message done