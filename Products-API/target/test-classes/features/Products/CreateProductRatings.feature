Feature: As a user i want to create new rating of products

  @CreateProductRatings
  Scenario: as user i want to input valid data for create new ratings of products
    Given user set endpoint Auth
    When user send endpoint Auth
    When user set endpoint for create new rating products
    And user send request for create new rating product
    Then user has response code 200