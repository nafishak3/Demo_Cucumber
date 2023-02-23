Feature: Amazon Search

@Smoke
  Scenario: Search a product MacBook Pro
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" should be displayed
    Then order id is 12345 and username is "Nafisha"

@Regression
  Scenario: Search a product Apple iPhone 13
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple iPhone 13" and price 1000
    Then Product with name "Apple iPhone 13" should be displayed
    Then order id is 12345 and username is "Nafisha"






