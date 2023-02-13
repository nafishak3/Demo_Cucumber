Feature: Uber Booking Feature
  Scenario: Booking Cab
    Given User wants to select a car type "sedan" from uber app
    When user select a car "sedan" and pick up point "NYC" and drop location "NJ"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD


