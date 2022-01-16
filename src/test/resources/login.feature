
Feature: Login

  @EndToEnd
  Scenario: Validate login page
    Given I am on the home page
    When I click on the "Log in"
    Then I should see "Welcome, Please Sign In!" text on login page
    And the url should contain with "/login"

  Scenario: Validate login with valid email and password
    Given I am on the home page
    When I click on the "Log in"
    And I enter email "test@gmail.com" and password "hello@123"
    And I click on log in on login page
    Then I should see log out button displayed

    Scenario Outline: Validate login with more then one email and password
      Given I am on the home page
      When I click on the "Log in"
      And I enter email "<myEmail>" and password "<myPassword>"
      And I click on log in on login page
      Then I should see log out button displayed

      Examples:
        | myEmail         | myPassword   |
        |  test@gmail.com    | hello@123     |
        | amit@gmail.com  | amitPatel123 |
#        | megha@gmail.com | megha123     |
#        | yash@gmail.com  | yash123      |

#homework
#  Scenario: login with invalid email
#    Scenario: login with invalid password
#      Scenario: login with empty email
#        Scenario: login with empty password
#      Scenario Outline: login with invalid emails and password

