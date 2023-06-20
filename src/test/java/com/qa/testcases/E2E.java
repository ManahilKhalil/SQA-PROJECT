package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.utils.TestUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.InterruptedException;

public class E2E extends TestBase {
    public WebDriver driver;
    public HomePage HomePage;
    public LoginPage logpage;
    public ActiveVisitPage activevisitPage;
    public CaptureVitalPage captureVital;
    public DataManagePage datamanage;
    TestUtils utilities;

    public E2E() throws IOException {
        super();
    }

    @BeforeClass
    public void setup() throws IOException, InterruptedException {
        initialization();
        Thread.sleep(5000);
        HomePage = new HomePage(driver);
        logpage = new LoginPage(driver);
        activevisitPage = new ActiveVisitPage(driver);
        captureVital = new CaptureVitalPage(driver);
        datamanage = new DataManagePage(driver);
    }

    /*@Test(priority = 0 )
    public void verifycantLogButton() throws IOException {
        logpage = new LoginPage(driver);
        logpage.clickCantLogButton();
        logpage.clickOkay();

        // Assert the "Can't Sign in" button
        // Add your assertions here
    }*/

    @Test(priority = 1)
    public void loginWithInvalidCredentials() throws IOException {
        //LoginPage = new LoginPage(driver);
        logpage.enterUsername("invalidUsername");
        logpage.enterPassword("invalidPassword");
        logpage.select_location();
        logpage.clickLoginButton();

        // Assert error message
        // Add your assertions here
    }


    @Test(priority = 2)
    public void loginWithValidCredentials() throws IOException {
        logpage.enterUsername("Admin");
        logpage.enterPassword("Admin123");
        logpage.select_location();
        logpage.clickLoginButton();

        // Assert successful login
        // Add your assertions here
    }

    @Test(priority = 3)
    public void verifyNavigation1Links() throws IOException {
        HomePage HomePage = new HomePage(driver);
        HomePage.clickActiveVisitsLink();
        //String activeVisitPage = driver.getTitle();
        //Assert.assertEquals("Expected Page Title", activeVisitPage, "Actual Page Title");
        activevisitPage.clickHome();
    }
        // Assert the active visits page
        // Add your assertions here
        @Test(priority = 4)
    public void verifyNavigation2Links() throws IOException {
            HomePage HomePage = new HomePage(driver);
            HomePage.clickCaptureVitalsLink();
            //HomePage.clickHome();
        }

        // Assert the capture vitals page
        // Add your assertions here
        @Test(priority = 5)
    public void verifyNavigation3Links() throws IOException {
            HomePage HomePage = new HomePage(driver);
            HomePage.clickDataManagementLink();
        }
        // Assert the data management page
        // Add your assertions here


    @Test(priority = 6)
    public void createNewPatientRecord() throws IOException {
        HomePage homePage = new HomePage(driver);
        logpage.select_location();
        homePage.clickRegisterPatientLink();

        // Fill in the patient details
        // Add your code here

        // Confirm submission
        // Add your code here

        // Assert successful patient creation
        // Add your assertions here
    }

    /*@Test(priority = 6)
    public void searchPatientRecord() {
        HomePage homePage = new HomePage(driver);
        homePage.enterPatientSearch("patientName");
        homePage.clickSearchButton();

        // Assert search results accuracy
        // Add your assertions here
    }*/

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver
        driver.quit();
    }
}
