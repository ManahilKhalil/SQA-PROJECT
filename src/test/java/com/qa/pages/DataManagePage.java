package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataManagePage {
    public WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'Data Management')]")
    public WebElement dataManagementHeader;

    public DataManagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isDataManagementHeaderDisplayed() {
        return dataManagementHeader.isDisplayed();
    }
}
