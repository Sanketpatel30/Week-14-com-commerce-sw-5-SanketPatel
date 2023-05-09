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

import java.util.List;


public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Electronics')]")
    WebElement electronicsTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Apparel')]")
    WebElement apparelTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement BooksTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Jewelry')]")
    WebElement jewelryTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Gift Cards')]")
    WebElement giftCardsTab;
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement getLoginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement getRegisterLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement getNopCommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement getmyAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement getlogoutLink;


    public HomePage() {
        CustomListeners.test.log(Status.PASS,  "Home Page");
        Reporter.log("Home Page" + driver.toString());
        PageFactory.initElements(driver, this);
    }
    public void clickOnLoginLink() {
        CustomListeners.test.log(Status.PASS, "Click On Login Link");
        Reporter.log("Click On Login Link" + getLoginLink.toString());
        clickOnElement(getLoginLink);
    }

    public void clickOnRegisterLink() {
        CustomListeners.test.log(Status.PASS, "Click On Register Link");
        Reporter.log("Click On Register Link" + getRegisterLink.toString());
        clickOnElement(getRegisterLink);
    }

    public void verifyNopCommerceLogoVisible() {
        CustomListeners.test.log(Status.PASS, "Verify NopCommerce Logo Visible");
        Reporter.log("Verify NopCommerce Logo Visible" + getNopCommerceLogo.toString());
        verifyLogoVisible(getNopCommerceLogo);
    }


    public void clickOnLogoutLink() {
        CustomListeners.test.log(Status.PASS, "Click On Logout Link");
        Reporter.log("Click On Logout Link" + getlogoutLink.toString());
        clickOnElement(getlogoutLink);

    }

    public void verifyLogoutLinkVisible() {
        CustomListeners.test.log(Status.PASS, "Verify Logout Link Visible");
        Reporter.log("Verify Logout Link Visible" + getlogoutLink.toString());
        verifyThatElementIsDisplayed(getlogoutLink);

    }

    public void verifyLoginLinkVisible() {
        CustomListeners.test.log(Status.PASS, "Verify Login Link Visible");
        Reporter.log("Verify Login Link Visible" + getLoginLink.toString());
        verifyThatElementIsDisplayed(getLoginLink);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }
}
