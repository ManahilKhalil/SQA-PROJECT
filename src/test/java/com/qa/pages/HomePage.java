package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage {
    //public WebDriver driver;
    TestUtils utils;
    @FindBy(linkText = "Active Visits")
     WebElement activeVisitsLink;

    @FindBy(linkText = "Capture Vitals")
     WebElement captureVitalsLink;

    @FindBy(linkText = "Data Management")
     WebElement dataManagementLink;

    @FindBy(linkText = "Register a Patient")
     WebElement registerPatientLink;
    @FindBy(id = "searchButton")
     WebElement searchButton;

    @FindBy(id = "patientSearch")
    WebElement patientSearchField;


    public HomePage( WebDriver driver) throws IOException {
        PageFactory.initElements(TestBase.driver, this);
        utils = new TestUtils();
    }

    public void clickActiveVisitsLink() {
        activeVisitsLink.click();
    }

    public void clickCaptureVitalsLink() {
        captureVitalsLink.click();
    }

    public void clickDataManagementLink() {
        dataManagementLink.click();
    }

    public void clickRegisterPatientLink() {
        registerPatientLink.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void enterPatientSearch(String searchText) {patientSearchField.sendKeys(searchText);
    }
}
