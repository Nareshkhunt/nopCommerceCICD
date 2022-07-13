@EndToEnd
Feature: Login

  Scenario: Validate login page
    Given I am on the home page
    When I click on the "Log in"
    Then I should see "Welcome, Please Sign In!" text on login page
    And the url should contain with "/login"

  Scenario Outline: Registration using data table
    Given I am on the home page
    When I click on the "Register"
    And I select gender "Male"
    And I enter following details to register
      | firstName | lastName | email     | password     | confirmPassword     |
      | vedant    | khunt    | <myEmail> | <myPassword> | <myConfirmPassword> |
    When I click on the "RegisterSubmit" on registration page
    Then I should see "Your registration completed" text on registration page
    And the url should contain with "/registerresult"

    Examples:
      | myEmail         | myPassword   | myConfirmPassword |
      | test@gmail.com  | hello@123    | hello@123         |
      | amit@gmail.com  | amitPatel123 | amitPatel123      |
      | megha@gmail.com | megha123     | megha123          |
      | ayash@gmail.com | yash123      | yash123           |

 @ignore
  Scenario: Validate login with valid email and password
    Given I am on the home page
    When I click on the "Log in"
    And I enter email "test@gmail.com" and password "hello@123"
    And I click on log in on login page
    Then I should see log out button displayed
  @ignore
  Scenario Outline: Validate login with more then one email and password
    Given I am on the home page
    When I click on the "Log in"
    And I enter email "<email>" and password "<password>"
    And I click on log in on login page
    Then I should see log out button displayed

    Examples:
      | email          | password     |
      | test@gmail.com | hello@123    |
      | amit@gmail.com | amitPatel123 |
   @EndToEnd2
    Examples:
      | email           | password |
      | megha@gmail.com | megha123 |
      | yash@gmail.com  | yash123  |

#homework
#  Scenario: login with invalid email
#    Scenario: login with invalid password
#      Scenario: login with empty email
#        Scenario: login with empty password
#      Scenario Outline: login with invalid emails and password

