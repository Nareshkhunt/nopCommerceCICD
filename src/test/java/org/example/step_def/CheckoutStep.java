package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.CheckoutPage;

import java.util.List;
import java.util.Map;

public class CheckoutStep extends DriverManager {
    CheckoutPage checkoutPage = new CheckoutPage();
    List<Map<String, String>> data;


    @Then("^I  should see  checkout text$")
    public void i_should_see_checkout_text() throws Throwable {
        checkoutPage.getCheckoutText();
    }


    @Given("^I enter following details on checkout page$")
    public void i_enter_following_details_on_checkout_page(DataTable dataTable) throws Throwable {

        data = dataTable.asMaps(String.class, String.class);
        System.out.println(data);
        checkoutPage.selectCountrySelection(data.get(0).get("country"));
        checkoutPage.addCity(data.get(0).get("city"));
        checkoutPage.addAddress(data.get(0).get("addressLine1 "));
        checkoutPage.addPostalCode(data.get(0).get("postcode"));
        checkoutPage.addPhoneNo(data.get(0).get("phoneNumber"));
    }

    @Given("^I click on continue button$")
    public void i_click_on_continue_button() throws Throwable {
        checkoutPage.clickOnContinueBtn();
    }

    @Given("^I select credit card$")
    public void i_select_credit_card() throws Throwable {
        checkoutPage.clickOnRadioBtn();
    }

    @Given("^I enter following details on the payment page$")
    public void i_enter_following_details_on_the_payment_page(DataTable dataTable) throws Throwable {

        data = dataTable.asMaps(String.class, String.class);
        System.out.println(data);
//        checkoutPage.addCardType(); by default its selected visa
        checkoutPage.addCardHolder(data.get(0).get("cardName"));
        checkoutPage.addCardNo(data.get(0).get("cardNumber"));
        checkoutPage.selectYear();
        checkoutPage.addCardCode(data.get(0).get("cardCode"));
    }

    @And("^I click on continue button on shipping method$")
    public void iClickOnContinueButtonOnShippingMethod() {
        checkoutPage.clickOnContinueBtnShippingMethod();
    }

    @And("^I click on continue button on payment method$")
    public void iClickOnContinueButtonOnPaymentMethod() {
        checkoutPage.clickOnContinueBtnPaymentMethod();
    }

    @And("^I click on continue button on payment information$")
    public void iClickOnContinueButtonOnPaymentInformation() {
        checkoutPage.clickOnContinueBtnPaymentInfo();
    }
}
