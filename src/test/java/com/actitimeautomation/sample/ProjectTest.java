package com.actitimeautomation.sample;

import com.actitimeautomation.page1.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTest extends Baseclass1 {

    WebDriver driver;
    PropertyHandling propertyHandling;
    CustomerPage customerPage;
    LoginPage loginPage;
    ProjectPage projectPage;
    CommonUtil commonUtil;

    @BeforeClass
    public void setup() throws Exception {
        propertyHandling = new PropertyHandling();
        String browser = propertyHandling.getProperty("browser");
        launchBrowser(browser);
        driver = super.driver;
        String url = propertyHandling.getProperty("actitimeUrl");
        driver.get(url);
        loginPage = new LoginPage(driver);
        String username = propertyHandling.getProperty("username");
        String password = propertyHandling.getProperty("password");
        loginPage.login(username, password);
        projectPage = new ProjectPage(driver);
        commonUtil = new CommonUtil(driver);
    }
    @Test
    public void verifyCreateProject() {
        commonUtil.waitForElementClickable(customerPage.taskModule);
        //click task module
        driver.findElement(customerPage.taskModule).click();
        //click on add new button
        driver.findElement(customerPage.addNewButton).click();
        //click on new project
        projectPage.createNewProjectButton.click();


    }

@AfterClass
    public void tearDown() { driver.quit();}
    }

