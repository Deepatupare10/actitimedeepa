package com.actitimeautomation.sample;

import com.actitimeautomation.page1.Baseclass1;
import com.actitimeautomation.page1.CustomerPage;
import com.actitimeautomation.page1.LoginPage;
import com.actitimeautomation.page1.PropertyHandling;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actitimeautomation.page1.CommonUtil;

import java.io.IOException;


public class CustomerTest extends Baseclass1 {
    WebDriver driver;
    PropertyHandling propertyHandling;
    CustomerPage customerPage;

    @BeforeClass
    public void setup() throws IOException{
        propertyHandling=new PropertyHandling();
        String browser= propertyHandling.getProperty("browser");
        launchBrowser(browser);
        driver= super.driver;
        driver.get(propertyHandling.getProperty("actitimeUrl"));
        LoginPage loginPage=new LoginPage(driver);
        String username=propertyHandling.getProperty("username");
        String password =propertyHandling.getProperty("password");
        loginPage.login(username,password);
        customerPage=new CustomerPage(driver);

    }
    @Test
    public void verifyCreateCustomer() throws InterruptedException {
        customerPage.createCustomer("Successs");
        customerPage.verifyCustomer("Successs");
    }
}
