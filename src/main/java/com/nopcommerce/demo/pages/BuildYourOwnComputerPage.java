package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement selectHdd;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_4']")
    WebElement selectOperatingSystem;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5']")
    WebElement selectSoftware;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[contains(.,'The product has been added to your shopping cart')]")
    WebElement productAddedToCartMessage;

    public String BuildYourOwnComputerPage() {
        CustomListeners.test.log(Status.PASS, "Build Your Own Computer Page");
        Reporter.log("Build Your Own Computer Page" + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void clickOnAddToCartButton() {
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart Button");
        Reporter.log("Click On Add To Cart Button" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public void verifyProductAddedToCartMessage(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Product Added to Cart Message");
        Reporter.log("Verify Product Added to Cart Message" + productAddedToCartMessage.toString());
        verifyThatTextIsDisplayed(productAddedToCartMessage, text);
    }

    public void buildConfigurationFromList(String processor, String ram, String hdd, String os, String software) {
        selectByVisibleTextFromDropDown(processorDropdown, processor);
        selectByVisibleTextFromDropDown(ramDropdown, ram);
        clickOnElement(selectHdd);
        clickOnElement(selectOperatingSystem);
        clickOnElement(selectSoftware);
    }

}
