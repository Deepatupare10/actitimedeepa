package com.actitimeautomation.sample;

import com.actitimeautomation.page1.Baseclass1;
import com.actitimeautomation.page1.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHrmLoginTestWait extends Baseclass1 {
    WebDriver driver;
    CommonUtil commonUtil;

    @BeforeClass
    public void setup(){
        launchBrowser("chrome");
        driver=super.driver;
        commonUtil=new CommonUtil(driver);
    }

    @Test
    public void verifyLogin() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        commonUtil.fluentWait(By.name("username"));

        String title = driver.getTitle();
        System.out.println("Title of the page :" + title);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        boolean enableLoginButton = loginButton.isEnabled();

        System.out.println("The login Button is enable: " + enableLoginButton);
        if (enableLoginButton) {
            loginButton.submit();
        } else {
            throw new Exception("Login Button is not enables !");
        }
    }
    @AfterClass

        public void tearDown(){
            driver.quit();
        }
    }

