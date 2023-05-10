Feature: As a user i can be success register so that i can used my account for login

  @PositiveCaseRegister-1
  Scenario: as user i want to register with complete values
    Given user on register page
    When user input valid complete name
    And user input valid email
    And user input valid password
    And user click login button
    Then user on login page

  @NegativeCaseRegister-2
  Scenario: as user i want to register with empty name
    Given user on register page
    When user input empty name
    And user input valid email
    And user input valid password
    And user click login button
    Then user see error message

  @NegativeCaseRegister-1
  Scenario: as user i want to register with using existing email
    Given user on register page
    When user input valid complete name
    And user input existing email
    And user input valid password
    And user click login button
    Then user see error message

  @NegativeCaseRegister-2
  Scenario: as user i want to register with empty password
    Given user on register page
    When user input valid complete name
    And user input valid email
    And user input empty password
    And user click login button
    Then user see error message

  @NegativeCaseRegister-3
  Scenario: as user i want to register with empty email
    Given user on register page
    When user input valid complete name
    And user input empty email
    And user input valid password
    And user click login button
    Then user see error message
