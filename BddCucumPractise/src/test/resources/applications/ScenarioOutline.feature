Feature: login feature with different invalid combinations
Scenario Outline: login with different combinations
Given user is at application login screen
When user enters "<username>" in username field
And user enters "<password>" in password field
And user click on signin button
Then user should get login message

Examples:
| username | password |
|incorrectusername  |correctpassword |
|correctusername|incorrectpassword  | 
|incorrectusername | incorrectpassword|