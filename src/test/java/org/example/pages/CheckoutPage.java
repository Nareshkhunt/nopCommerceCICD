package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends DriverManager {

    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement checkoutText;

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement countrySelection;


    @FindBy(id = "BillingNewAddress_City")
    private WebElement addCity;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement addAddress;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement addPostalCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement addPhoneNo;

    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    private WebElement continueBtn;

    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    private WebElement continueBtnShippingMethod;

    @FindBy(xpath = "//button[@onclick='PaymentMethod.save()']")
    private WebElement continueBtnOnPaymentMethod;

    @FindBy(xpath = "//button[@onclick='PaymentInfo.save()']")
    private WebElement continueBtnOnPaymentInfo;

    @FindBy(id = "paymentmethod_1")
    private WebElement selectRadioBtn;

    @FindBy(id = "creditCardType")
    private WebElement selectCardType;

    @FindBy(id = "CardholderName")
    private WebElement cardHolderName;

    @FindBy(id = "CardNumber")
    private WebElement cardNo;

    @FindBy(xpath = "//input[@id='CardCode']")
    private WebElement cardCode;

    @FindBy(id = "ExpireYear")
    private WebElement selectYear;


    public String getCheckoutText() {
        return checkoutText.getText();
    }

    public void selectCountrySelection(String countryName) {
        Select select = new Select(countrySelection);
        select.selectByVisibleText(countryName);
    }

    public void addCity(String cityName) {
        addCity.sendKeys(cityName);

    }

    public void addAddress(String address) {
        addAddress.sendKeys(address);
    }

    public void addPostalCode(String postalCode) {
        addPostalCode.sendKeys(postalCode);
    }

    public void addPhoneNo(String phone) {
        addPhoneNo.sendKeys(phone);
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void clickOnRadioBtn() {
        waitForElementVisibility(selectRadioBtn, 40, "notvisibla");
        selectRadioBtn.click();
    }

    public void addCardType() {
        Select se = new Select(selectCardType);
        se.selectByValue("visa");

    }

    public void addCardHolder(String cardHolder) {
        cardHolderName.sendKeys(cardHolder);
    }

    public void addCardNo(String cardNumber) {
        cardNo.sendKeys(cardNumber);

    }

    public void addCardCode(String cardCo) {
        cardCode.sendKeys(cardCo);

    }

    public void clickOnContinueBtnShippingMethod() {
        continueBtnShippingMethod.click();
    }

    public void clickOnContinueBtnPaymentMethod() {
        continueBtnOnPaymentMethod.click();
    }

    public void clickOnContinueBtnPaymentInfo() {
        continueBtnOnPaymentInfo.click();
    }

    public void selectYear() {
        Select se = new Select(selectYear);
        se.selectByValue("2023");
    }
}
