package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Software']")
    WebElement softwareLink;

    public void verifyComputerText(String text) {
        CustomListeners.test.log(Status.PASS, "Verify Computer Text");
        Reporter.log("Verify Computer Text" + computersText.toString());
        verifyThatTextIsDisplayed(computersText, "Computers");
    }

    public ComputerPage() {
        CustomListeners.test.log(Status.PASS, "Computer Page");
        Reporter.log("Computer Page" + driver.toString());
        PageFactory.initElements(driver, this);
    }
    public void clickOnDesktopLink() {
        CustomListeners.test.log(Status.PASS, "Click On Desktop Link");
        Reporter.log("Click On Desktop Link" + desktopLink.toString());
        clickOnElement(desktopLink);
    }

    public void clickOnNotebooksLink() {
        CustomListeners.test.log(Status.PASS, "Click On Notebooks Link");
        Reporter.log("Click On Notebooks Link" + notebooksLink.toString());
        clickOnElement(notebooksLink);
    }

    public void clickOnSoftwareLink() {
        CustomListeners.test.log(Status.PASS, "Click On Software Link");
        Reporter.log("Click On Software Link" + softwareLink.toString());
        clickOnElement(softwareLink);
    }
}
