package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRecordPage {
    public WebDriver driver;

    @FindBy(id = "patientDetails")
    public WebElement patientDetails;

    public PatientRecordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPatientDetailsDisplayed() {
        return patientDetails.isDisplayed();
    }
}
