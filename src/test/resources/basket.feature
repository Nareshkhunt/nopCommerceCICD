@EndToEnd
Feature: Basket
  As a customer,
  I want to add product to basket
  so that I can buy product

  Scenario: View books on product page
    Given I am on the home page
    When I click on the "Books"
    Then I should see "Books" text on result page
    And the url should contain with "/books"
