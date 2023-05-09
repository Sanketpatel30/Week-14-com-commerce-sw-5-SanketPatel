package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegistrationTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)

    public void initialize(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }
    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterText("Register");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.verifyFirstNameRequiredErrorText("First name is required.");
        registerPage.verifyLastNameReqiredErrorText("Last name is required.");
        registerPage.verifyEmailRequiredErrorText("Email is required.");
        registerPage.verifyPasswordRequiredErrorText("Password is required.");
        registerPage.verifyConfirmPasswordRequiredErrorText("Password is required.");
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.selectGender("Male");
        registerPage.inputFirstName("test123");
        registerPage.inputLastName("test789");
        registerPage.selectDateOfBirth("1","January","1985");
        registerPage.inputEmail("xyp1@gmail.com");
        registerPage.inputPassword("Abc123");
        registerPage.inputConfirmPassword("Abc123");
        registerPage.clickOnRegisterButton();
        registerPage.verifyRegistrationCompletedText("Your registration completed");
    }

}