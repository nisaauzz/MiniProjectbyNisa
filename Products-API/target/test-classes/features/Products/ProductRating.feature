Feature: As a user i want to get detail product rating by id

  @GetProductRatingByID
  Scenario: as user i want to input valid data for get product rating by id
    Given user has endpoint get product rating api
    When user get product rating by id
    Then user get product rating status code 200