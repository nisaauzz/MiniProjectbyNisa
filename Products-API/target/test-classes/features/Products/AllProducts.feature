Feature: As a user i want to get all detail product

  @PositiveCaseProduct
  Scenario: as user i want to input valid data for get all detail product
    Given user has endpoint product
    When user get all detail product
    Then user get product status code 200

  @NegativeCaseProduct
  Scenario: as user i can't get detail product because invalid endpoint
    Given user has invalid endpoint product
    When user not found get detail product
    Then user get code status 404
