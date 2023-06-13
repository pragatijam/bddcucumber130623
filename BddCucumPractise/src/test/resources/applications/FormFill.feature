Feature: Registration
Scenario: user info registration
Given user should be at registration page
When user enters following info 
|abc|def|abc.def@email.com|9865345676|
|ghi|jkl|ghi.jkl@email.com|9865345677|
|mno|pqr|mno.pqr@email.com|9865345678|
Then user should get app id
