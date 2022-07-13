@EndToEnd
Feature: End to End functionality


  Scenario: Buy one product
    Given I am on the home page
    And I click on the "Register"
    And I select gender "Male"
    And I enter following details to register
      | firstName | lastName | email             | password  | confirmPassword |
      | vedant    | khunt    | test111@gmail.com | hello@123 | hello@123       |
    And I click on the "RegisterSubmit" on registration page
    And I click on the "Books"
    And I click on the add to basket button for Fahrenheit by Ray Bradbury
    And I click on shopping cart
    And I click to accept term and condition
    And I click on checkout button
    And I enter following details on checkout page
      | country        | city   | addressLine1      | postcode | phoneNumber |
      | United Kingdom | london | 58 Ashridge Drive | WD196TL  | 07538926198 |
    And I click on continue button
    Then I  should see  checkout text
    And I click on continue button on shipping method
    And I select credit card
    And I click on continue button on payment method
    And I enter following details on the payment page
      | cardName | cardNumber       | cardCode |
      | nk khunt | 4444333322221111 | 111      |
    And I click on continue button on payment information
    When I click on confirm button
    Then I should see "Thank you" text on confirmation page
    And I should see "Your order has been successfully processed!" text on confirmation page
    And the url should contain with "checkout/completed"

