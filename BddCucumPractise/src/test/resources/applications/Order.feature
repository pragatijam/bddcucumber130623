Feature: order information
Background:
Given user should login into app
When user click on orders button
Then user should redirect to order page

Scenario: validate currently placed order
When user click on orderid
Then user should track the order

Scenario: validate info of previous placed order
When user click on past order button
Then user should see the info