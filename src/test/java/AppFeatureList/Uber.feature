@All
Feature: Uber Booking Feature

@Smoke @qa-ready @US-1011 @Epic-900
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "sedan" from uber app
    When user select a car "sedan" and pick up point "NYC" and drop location "NJ"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

@Regression @Smoke
  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber app
    When user select a car "SUV" and pick up point "NYC" and drop location "NJ"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

@Prod
  Scenario: Booking Cab Tesla
    Given User wants to select a car type "Tesla" from uber app
    When user select a car "Tesla" and pick up point "NYC" and drop location "NJ"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD



