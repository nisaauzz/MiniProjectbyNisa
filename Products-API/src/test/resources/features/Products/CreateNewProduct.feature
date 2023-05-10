Feature: As a user i want to create new product

  @PositiveCaseCreateProduct
  Scenario: as user i want to input valid data for create a new product
    Given user has endpoint post new product
    When user send post new product
    Then user see status code 200
  @NegativeCaseCreateProduct
  Scenario: as user i want to input invalid endpoint for create a new product
    Given user has invalid endpoint for create new product
    When user send post invalid endpoint new product
    Then user see error message with status code 404