Feature: As a user i want to delete product

  @Delete
  Scenario: as user i want to input valid endpoint for product
    Given user set endpoint auth
    When user send endpoint auth
    When user set endpoint product
    And user send request for delete product
    Then user see HTTP Response code 200