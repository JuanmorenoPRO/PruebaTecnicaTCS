Feature: Register new user

  @regression
  Scenario: Sing up successfully
    Given the user is in the homepage
    When the user wants to sing up
    Then Validate sing up complete
