package com.canadiandollarbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.canadiandollarbingo.utilities.Utility;

public class HomePage extends Utility {


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement clickOnLogin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='l_user_name']")
    WebElement usernameField;
    @CacheLookup
    @FindBy(id = "l_password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//div[@class='error center center-text']")
    WebElement errorMessage;

    public void clickOnLogin() {
        log.info("click on" + clickOnLogin);
        clickOnElement(clickOnLogin);
    }

    public void sendTextToLoginField(String userName) {
        log.info("click on username field" + usernameField);
        sendTextToElement(usernameField, userName);

    }

    public void sendTextToPasswordField(String password) {
        log.info("click on password field" + passwordField);
        sendTextToElement(passwordField, password);

    }

    public String getErrorText() {
        log.info("Error message " + errorMessage);
        return errorMessage.getText();
    }

}
