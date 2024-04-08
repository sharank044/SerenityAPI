Feature: login to test site

  Background:
    Given User navigates to login page

  Scenario: Positive login flow
    Given User is in login page
    When User enters username
    Then User enters password
    And User clicks on login button
    Then User confirms that login successful