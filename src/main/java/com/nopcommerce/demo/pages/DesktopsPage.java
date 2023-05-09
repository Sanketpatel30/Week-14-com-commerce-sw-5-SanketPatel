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

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;
    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement displayBy;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;
    @CacheLookup
    @FindBy(xpath = "//div[@class='picture']")
    WebElement selectProduct;

    public DesktopsPage() {
        CustomListeners.test.log(Status.PASS, "Desktops Page");
        Reporter.log("Desktops Page" + driver.toString());
        PageFactory.initElements(driver, this);
    }

    public void verifyDesktopText() {
        CustomListeners.test.log(Status.PASS, "Verify Desktop Text");
        Reporter.log("Verify Desktop Text" + desktopText.toString());
        verifyThatTextIsDisplayed(desktopText, "Desktops");
    }

    public void clickOnSortBy() {
        CustomListeners.test.log(Status.PASS, "Click On Sort By");
        Reporter.log("Click On Sort By" + sortBy.toString());
        clickOnElement(sortBy);
    }

    public void clickOnDisplayBy() {
        CustomListeners.test.log(Status.PASS, "Click On Display By");
        Reporter.log("Click On Display By" + displayBy.toString());
        clickOnElement(displayBy);
    }

    public void clickOnProductList() {
        CustomListeners.test.log(Status.PASS, "Click On Product List");
        Reporter.log("Click On Product List" + displayBy.toString());
        clickOnElement((By) displayBy);
    }

    public void selectProductFromDesktopPage(String product) {
        CustomListeners.test.log(Status.PASS, "Select Product From Desktop Page");
        Reporter.log("Select Product From Desktop Page" + selectProduct.toString());
        clickOnElement(selectProduct, product);
    }
}
