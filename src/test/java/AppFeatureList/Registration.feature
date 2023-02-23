Feature: User registration
  Scenario: user registration with different data
    Given User is on registration page

    When User enters following user details
      | Nafisha | automation | NafishaK3@gmail.com | 100000 | Bangladesh |
      | Tom     | Jerry      | Tom@gmail.com       | 999999 | USA        |
      | Soup    | spicy      | Soup@gmail.com      | 88888  | China      |

    Then user registration should be successful

  Scenario: user registration with different data with columns
    Given User is on registration page

    When User enters following user details with columns
      | Firstname | lastname   | Email               | phone  | city       |
      | Nafisha   | automation | NafishaK3@gmail.com | 100000 | Bangladesh |
      | Tom       | Jerry      | Tom@gmail.com       | 999999 | USA        |
      | Soup      | spicy      | Soup@gmail.com      | 88888  | China      |

    Then user registration should be successful

