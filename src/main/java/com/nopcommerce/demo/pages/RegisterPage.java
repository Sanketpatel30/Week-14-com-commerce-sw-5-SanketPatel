package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//input[@name='Gender']")
    WebElement gender;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameErrorText;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameErrorText;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailErrorText;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordErrorText;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordErrorText;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleted;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;


    public RegisterPage() {
        CustomListeners.test.log(Status.PASS, "Register Page");
        Reporter.log("Register Page" + driver.toString());
        PageFactory.initElements(driver, this);
    }

    public void verifyRegisterText(String text) throws InterruptedException {
        CustomListeners.test.log(Status.PASS, "Verify Register Text");
        Reporter.log("Verify Register Text" + registerText.toString());
        verifyThatTextIsDisplayed(registerText, text);

    }

    public void selectGender(String text) {
        CustomListeners.test.log(Status.PASS, "Select Gender");
        Reporter.log("Select Gender" + gender.toString());
        clickOnElement(gender, text);

    }


    public void inputFirstName(String name) {
        CustomListeners.test.log(Status.PASS, "First Name");
        Reporter.log("First Name" + firstName.toString());
        sendTextToElement(firstName, name);

    }

    public void inputLastName(String name) {
        CustomListeners.test.log(Status.PASS, "Input Last Name");
        Reporter.log("Input Last Name" + lastName.toString());
        sendTextToElement(lastName, name);

    }

    public void inputEmail(String text) {
        CustomListeners.test.log(Status.PASS, "Input Email");
        Reporter.log("Input Email" + email.toString());
        sendTextToElement(email, text);

    }

    public void selectDateOfBirth(String day, String month, String year) {
        CustomListeners.test.log(Status.PASS, "Select Date Of Birth");
        Reporter.log("Select Date Of Birth" + dateOfBirthDay.toString());
        Reporter.log("Select Date Of Birth" + dateOfBirthMonth.toString());
        Reporter.log("Select Date Of Birth" + dateOfBirthYear.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
    }

    public void inputPassword(String pswd) {
        CustomListeners.test.log(Status.PASS, "Input Password");
        Reporter.log("Input Password" + password.toString());
        sendTextToElement(password, pswd);
    }

    public void inputConfirmPassword(String password) {
        CustomListeners.test.log(Status.PASS, "Input Confirm Password");
        Reporter.log("Input Confirm Password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, password);

    }

    public void clickOnRegisterButton() {
        CustomListeners.test.log(Status.PASS, "Click On Registration Button");
        Reporter.log("Click On Registration Button" + registerButton.toString());
        clickOnElement(registerButton);

    }

    public void verifyFirstNameRequiredErrorText(String text) {
        CustomListeners.test.log(Status.PASS, "Verify First Name Required Error Text");
        Reporter.log("Verify First Name Required Error Text" + firstNameErrorText.toString());
        verifyThatTextIsDisplayed(firstNameErrorText, text);

    }

    public void verifyLastNameReqiredErrorText(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Last Name Required Error Text");
        Reporter.log("Verify Last Name Required Error Text" + lastNameErrorText.toString());
        verifyThatTextIsDisplayed(lastNameErrorText, text);

    }

    public void verifyEmailRequiredErrorText(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Email Required Error Text");
        Reporter.log("Verify Email Required Error Text" + emailErrorText.toString());
        verifyThatTextIsDisplayed(emailErrorText, text);

    }

    public void verifyPasswordRequiredErrorText(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Password Required Error Text");
        Reporter.log("Verify Password Required Error Text" + passwordErrorText.toString());
        verifyThatTextIsDisplayed(passwordErrorText, text);

    }

    public void verifyConfirmPasswordRequiredErrorText(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Confirmed Password Required Error Text");
        Reporter.log("Verify Confirmed Password Required Error Text" + confirmPasswordErrorText.toString());
        verifyThatTextIsDisplayed(confirmPasswordErrorText, text);

    }

    public void verifyRegistrationCompletedText(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Registration Completed Text");
        Reporter.log("Verify Registration Completed Text" + registrationCompleted.toString());
        verifyThatTextIsDisplayed(registrationCompleted, text);

    }

    public void clickOnContinueButton() {
        CustomListeners.test.log(Status.PASS, "Click On Continue Button");
        Reporter.log("click On Continue Button" + continueBtn.toString());
        clickOnElement(continueBtn);

    }

}
