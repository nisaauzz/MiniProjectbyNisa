Feature: As a user i want to create new user register

  @CreateRegister
  Scenario: as user i want to input valid data for create user register
    Given user has endpoint for create user register
    When user send endpoint for create user register
    Then user get status code 200