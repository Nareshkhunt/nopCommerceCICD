Feature: Registration using Data table
  @EndToEnd
  Scenario: Registration using data table
    Given I am on the home page
    When I click on the "Register"
    And I select gender "Male"
    And I enter following details to register
      | firstName | lastName | email          | password  | confirmPassword |
      | vedant    | khunt    | test@gmail.com | hello@123 | hello@123       |
    When I click on the "RegisterSubmit" on registration page
    Then I should see "Your registration completed" text on registration page
    And the url should contain with "/registerresult"

#    homework
#  Scenario: Registration with invalid email
#  Scenario: Registration with invalid password
#  Scenario: Registration with empty data