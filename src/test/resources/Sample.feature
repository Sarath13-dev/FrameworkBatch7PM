Feature: Validating login function of facebook application

Scenario Outline: Validating login function wit all combinations 
Given user is on Facebook application
When user is going enter "<username>" and "<password>"
Then user sould click login button

Examples:
|username|password|
|abcdef|fjbjsfjs|

Scenario Outline: Validating login function wit all combinations 
Given user is on Facebook application
When user is going enter "<username>" and "<password>"
Then user sould click login button

Examples:
|username|password|
|abcdef|fjbjsfjs|
