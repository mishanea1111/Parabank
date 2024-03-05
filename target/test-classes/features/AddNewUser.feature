@UI
Feature: Add new user1

  Scenario: Add new user to our website
    Given User navigate to the website homepage
  And User click on 'Login' button
  When  User click on 'Register' button
  And User insert some of the mandatory fields
#    And User click on button
