Feature: As a user i want to create new product category

  @PositiveCaseCreateProductCategory
  Scenario: as user i want to input valid data for create a new product category
    Given user has endpoint product category
    When user send request to endpoint product category
    Then user see status code 200


