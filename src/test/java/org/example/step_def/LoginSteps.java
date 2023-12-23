package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class LoginSteps extends DriverManager {

    LoginPage loginPage = new LoginPage();

    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String expText) throws Throwable {
        String myAcutalText= loginPage.getWelcomeSignInText();
        assertThat(myAcutalText, is(equalToIgnoringCase(expText)));
    }

    @When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_email_and_password(String email, String password) throws Throwable {
       loginPage.enterEmailAndPassword(email, password);
    }

    @When("^I click on log in on login page$")
    public void i_click_on_log_in_on_login_page() throws Throwable {
        loginPage.clickOnLoginSubmitButton();

    }

    @Then("^I should see log out button displayed$")
    public void i_sould_see_log_out_button_displayed() throws Throwable {
        boolean isDisplayed= loginPage.checkLogOutButtonIsDisplayed();
        assertThat(isDisplayed, is(true));
    }


}
