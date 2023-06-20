package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ActiveVisitPage {
    public Webdiver driver;
    TestUtils utils;
    @FindBy(xpath = "//h1[contains(text(),'Active Visits')]")
    public WebElement activeVisitHeader;
    @FindBy(xpath = "//i[@class='icon-user small']")
    WebElement home;

    public ActiveVisitPage( WebDriver driver) throws IOException {
        PageFactory.initElements(TestBase.driver, this);
        utils = new TestUtils();
    }
    public String activeVisitPage(){
        return driver.getTitle();
    }
    public boolean isHeaderDisplayed() {
        return activeVisitHeader.isDisplayed();
    }
    public  void clickHome(){home.click();}

}
