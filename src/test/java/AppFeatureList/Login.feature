Feature: login feature

  Scenario Outline: Login fail - possible combination
    Given User is on application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<Username>" in username field
    And user enters "<Password>" in password field
    And user clicks on Sign in button
    Then user gets login failed error message

    Examples:
      | Username            | Password          |
      | incorrectUsername   | 12345             |
      | nafishak3@gmail.com | incorrectPassword |
      | incorrectUsername   | incorrectPassword |

