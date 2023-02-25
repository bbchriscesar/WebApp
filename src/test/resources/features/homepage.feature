Feature: Home page feature

  @homepage
  Scenario: User visits web app home page
    Given User launch the web app URL
    When User is on the landing page
    Then Username and password input box are available