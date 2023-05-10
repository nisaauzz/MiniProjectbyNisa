Feature: As a user i want to get detail product by id

  @PositiveCaseGetProductByID
  Scenario: as user i want to input valid data for get detail product by id
    Given user has endpoint get api
    When user get detail by id
    Then user get product status code 200

  @NegativeCaseGetProductByID
  Scenario: as user i want to input invalid endpoint product
    Given user has invalid endpoint product
    When user send request to invalid endpoint product
    Then user see error message with status code 404