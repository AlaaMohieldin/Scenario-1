Feature: testing registration

  Scenario: user register on portal
    Given user opens homepage
    When I click on add to cart
    And I entered all necessary info
    Then register page displayed successfully
