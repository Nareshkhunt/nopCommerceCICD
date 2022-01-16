package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends DriverManager {

    @FindBy(xpath = "//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/37/1/1\"),!1']")
    private WebElement addToCart;

    @FindBy(css = ".cart-label")
    private WebElement shoppingCart;

    @FindBy(id = "termsofservice")
    private WebElement termsOfCondition;

    @FindBy(id = "checkout")
    private WebElement checkout;

    public void clickOnAddToCart() {
        waitForElementVisibility(addToCart, 30, "notVisible");
        addToCart.click();
    }

    public void clickOnShoppingCart() {
        shoppingCart.click();
    }

    public void clickOnTermsOfService() {
        waitForElementVisibility(termsOfCondition, 30, "notVisible");
        termsOfCondition.click();
    }

    public void clickOnCheckout() {
        checkout.click();
    }
}
