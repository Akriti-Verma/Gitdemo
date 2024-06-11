Feature: Login functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters username "testuser"
    And User enters password "password123"
    And User clicks on login button
    Then User is navigated to the home page