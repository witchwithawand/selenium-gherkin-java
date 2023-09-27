Feature: Login to the application
  As a user,
  I want to login to the application
  So that, I can manage the functionality of the application

  Scenario: login
    Given I have the access to the application link
    When I enter the credentials
    Then I should be able to login