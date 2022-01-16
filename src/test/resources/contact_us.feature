@EndToEnd
Feature: Contact us
  As customer I
  I want to check contact us functionality
  So that I can validate contact us functionality

  Scenario: Contact us
    Given I am on the home page
    When I click on the "Contact us"
    Then I should see "Contact Us" on contact us page
    And the url should contain with "/contactus"

  Scenario: Validate ContactUs page with valid Name,Email and Enquiry
    Given I am on the home page
    When I click on the "Contact us"
    And I enter name "Amisha" email "am@gmail.com" and enquiry "About product"
    And I click on submit on Contact Us page
    Then I should see "Your enquiry has been successfully sent to the store owner." message
    And the url should contain with "/contactus"
