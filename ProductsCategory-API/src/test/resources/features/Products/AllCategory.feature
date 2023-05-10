Feature: As a user i want to get detail category

  @GetAllCategory
  Scenario: as user i want to input valid endpoint for get detail all category
    Given user has endpoint product all categories
    When user send request to endpoint product all categories
    Then user get response with status code 200