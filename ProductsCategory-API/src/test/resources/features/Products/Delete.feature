Feature: As a user i want to delete category product

  @DeleteCategory
  Scenario: as user i want to input valid endpoint for product category
    Given user set endpoint auth
    When user send endpoint auth
    When user set endpoint product category
    And user send request for delete product category
    Then user see HTTP Response code 200