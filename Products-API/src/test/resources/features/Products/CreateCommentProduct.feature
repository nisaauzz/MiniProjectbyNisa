Feature: As a user i want to create new comment product

  @CreateCommentProduct
  Scenario: as user i want to input valid data endpoint for create new comment product
    Given user Has endpoint auth
    When user Clarify and send endpoint auth
    When user has endpoint create new comment for product
    And user send request for create new comment for product
    Then user can see http response code 200