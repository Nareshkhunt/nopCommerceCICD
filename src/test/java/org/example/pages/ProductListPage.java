package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends DriverManager {

    @FindBy(css = ".page-title")
    private WebElement textOnListPage;

    public String getTextFromListPage(){
        return   textOnListPage.getText();
    }
}
