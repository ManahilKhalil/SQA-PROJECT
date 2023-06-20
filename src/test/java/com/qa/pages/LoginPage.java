package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends TestBase{
   // public WebDriver driver;
    TestUtils utils;

/*    public LoginPage(WebDriver rDriver) throws IOException {
        super();
        this.driver = rDriver;
        PageFactory.initElements(rDriver, this);
    }*/

    public LoginPage( WebDriver driver) throws IOException {
        PageFactory.initElements(TestBase.driver, this);
        utils = new TestUtils();
    }

    @FindBy(id = "username")
     WebElement usernameField;

    @FindBy(id = "password")
     WebElement passwordField;

    @FindBy(id = "loginButton")
     WebElement loginButton;

    @FindBy(id="Inpatient Ward")
    WebElement selectlocation;

    @FindBy(id = "error-message")
     WebElement errorMessage;

    @FindBy(xpath = "//a[@id='cantLogin']")
     WebElement cantLogButton;

     @FindBy(xpath = "//button[@class='confirm']")
     WebElement okay;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void select_location(){
        selectlocation.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void clickCantLogButton() {
        cantLogButton.click();
    }

    public void clickOkay(){okay.click();}

}
