Feature: Contact Form


  @regression
  Scenario: Contact Form successfully
    Given the user is in the homepage
    When the user send a contact message
    Then Validate that the message send successfully