package org.example.step_def;

import cucumber.api.java.en.Given;
import org.example.driver.DriverManager;
import org.example.pages.ShoppingCartPage;

public class ShoppingCartStep extends DriverManager {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("^I click on the add to basket button for Fahrenheit by Ray Bradbury$")
    public void i_click_on_the_add_to_basket_button_for_Fahrenheit_by_Ray_Bradbury() throws Throwable {
        shoppingCartPage.clickOnAddToCart();
    }


    @Given("^I click on shopping cart$")
    public void i_click_on_shopping_cart() throws Throwable {
        shoppingCartPage.clickOnShoppingCart();
    }

    @Given("^I click to accept term and condition$")
    public void i_click_to_accept_term_and_condition() throws Throwable {
        shoppingCartPage.clickOnTermsOfService();
    }

    @Given("^I click on checkout button$")
    public void i_click_on_checkout_button() throws Throwable {
        shoppingCartPage.clickOnCheckout();
    }
}










