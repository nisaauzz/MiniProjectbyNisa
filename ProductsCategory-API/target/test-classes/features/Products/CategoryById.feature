Feature: As a user i want to get detail category by id

  @GetCategoryByID
  Scenario: as user i want to input valid endpoint for get detail category by id
    Given user has endpoint category product
    When user send request to endpoint category product
    Then user get response with status code 200