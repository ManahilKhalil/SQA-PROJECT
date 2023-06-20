package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaptureVitalPage {
    private WebDriver driver;

    @FindBy(id = "vitalForm")
    private WebElement vitalForm;

    public CaptureVitalPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isVitalFormDisplayed() {
        return vitalForm.isDisplayed();
    }
}
