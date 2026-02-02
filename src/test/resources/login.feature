@login
Feature: Login

  @valid-login
  Scenario: login with valid username and password
    Given user is on login page
    And user input username text with "standard_user"
    And user input password on password text box with "secret_sauce"
    When user click login button
    Then user will be redirected to homepage

  @invalid-Login
  Scenario: login with invalid username and password
    Given user is on login page
    And user input username text with "standard_user"
    And user input password on password text box with "invalid"
    When user click login button
    Then user sees error message "Epic sadface: Username and password do not match any user in this service"

  @batas-login
  Scenario: login without username
    Given user is on login page
    And User leaves the username field empty ""
    And user input password on password text box with "secret_sauce"
    When user click login button
    Then user sees error message "Epic sadface: Username is required"

