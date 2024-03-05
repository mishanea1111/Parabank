@UI @Run
Feature: Add new user1

  Scenario: Add new user to our website
    Given User navigate to the website1 homepage
    And User click on 'Login' button1
    And User click on 'Register' button2
    And User didnt complete all the fields
    When User click on 'register' with all the data inserted

    Scenario Outline: Add new user to website
      Given User navigate to the website2 homapage
      And  User give <userName>

      Examples:
      | userName |
      | mishanea |
      | sorin |