package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPatientPage {
    private WebDriver driver;

    @FindBy(id = "registerPatientForm")
    private WebElement registerPatientForm;

    public RegisterPatientPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isRegisterPatientFormDisplayed() {
        return registerPatientForm.isDisplayed();
    }
}
