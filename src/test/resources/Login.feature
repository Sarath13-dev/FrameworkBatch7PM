Feature: Given user is on fb

  Scenario: validating login of FB
    Given user is FB page
    When user sould enter username and password
    And user click login button
    Then user need to validate
