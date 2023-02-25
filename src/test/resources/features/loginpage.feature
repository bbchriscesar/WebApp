Feature: Login page feature

  @login-page
  Scenario: User login web app account
    Given I am on the login page
    When I enter my username and password
    And I click the login button
    Then I should be logged in successfully