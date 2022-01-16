package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends DriverManager {

    @FindBy(xpath = "//button[@onclick='ConfirmOrder.save()']")
    private WebElement confirmBtn;

    @FindBy(xpath = "//strong[contains(text(), 'Your order has been successfully processed!')]")
    private WebElement confirmationText;

    @FindBy(xpath = "//h1[contains(text(), 'Thank you')]")
    private WebElement thankYouText;

    public void clickOnConfirmationBtn() {
        confirmBtn.click();
    }

    public String getConfirmationText() {
        return confirmationText.getText();
    }

    public String getThankYouText(){
        return  thankYouText.getText();
    }
}
