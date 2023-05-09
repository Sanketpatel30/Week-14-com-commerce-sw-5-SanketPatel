package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public LoginPage() {
        CustomListeners.test.log(Status.PASS, "Login Page");
        Reporter.log("Login Page" + driver.toString());
        PageFactory.initElements(driver, this);
    }

    public String verifyWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Verify Welcome Text");
        Reporter.log("Verify Welcome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        CustomListeners.test.log(Status.PASS, "Enter Email Id");
        Reporter.log("Enter Email Id" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS, "Enter Password");
        Reporter.log("Enter Password" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS, "Click On Login Button");
        Reporter.log("Click On Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Get Error Message");
        Reporter.log("Get Error Message" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void verifyInvalidCredentialErrorMessage(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Invalid Credential Error Message");
        Reporter.log("Verify Invalid Credential Error Message" + errorMessage.toString());
        verifyThatTextIsDisplayed(errorMessage, text);
    }
}
