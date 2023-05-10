Feature: As a user i want to create login user

  @CreateLogin
  Scenario: as user i want to input valid endpoint for create login user
    Given user has endpoint for create login user
    When user send request for create login user
    Then get response with status code 200