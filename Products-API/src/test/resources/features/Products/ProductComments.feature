Feature: As a user i want to get product comments

  @productComments
  Scenario: as user i want to input valid data for get product comments
    Given user send endpoint product comments
    When user get product comments
    Then user get product comments status code 200