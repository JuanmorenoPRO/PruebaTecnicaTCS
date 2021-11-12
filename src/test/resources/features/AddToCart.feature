Feature: Add to cart

  @regression
  Scenario: Add to cart successfully
    Given the user is in the homepage
    When the user add to cart a laptop
    Then Validate that the laptop is  in the cart
