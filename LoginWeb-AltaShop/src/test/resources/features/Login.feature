Feature: As a user i can success login so that i can see main page

  @PositiveCaseLogin-1
  Scenario: as user i want to input valid so that i can see product page
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    Then user on products page

  @NegativeCaseLogin-1
  Scenario: as user i want to input invalid email then get error message
    Given user on login page
    When user input invalid username
    And user input valid password
    And user click login button
    Then user see error message

  @NegativeCaseLogin-2
  Scenario: as user i want to input empty email then get error message
    Given user on login page
    When user input empty email
    And user input valid password
    And user click login button
    Then user see error message

  @NegativeCaseLogin-3
  Scenario: as user i want to input empty password then get error message
    Given user on login page
    When user input valid email
    And user input empty password
    And user click login button
    Then user see error message