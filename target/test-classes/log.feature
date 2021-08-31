Feature: Validating the adactin applicaton

Scenario Outline: Validation with correct username and correct password
Given User login to the adactin page
When User enetrs the "<username>" and "<password>"
And User clicks on login button
Then User validates

Examples:
|username|password|
|Purushoth123|2N3WPK|


