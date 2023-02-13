Feature: Amazon Order Page
  In order to check my order details as a registered user,
    I want to specify the features of the order details page

  Background: Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page

  Scenario: Check previous Order Details
    When user clicks Order link
    Then user checks the previous order history


  Scenario: Check Open Order Details
    When user clicks Open Order link
    Then user checks the open order history


  Scenario: Check Cancelled Order Details
    When user clicks Cancelled Order link
    Then user checks the Cancelled order history



