package com.actitimeautomation.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;

    }

    public void login(String username,String password){
        driver.findElement(By.id("username")).sendKeys("deepa@yopmail.com");
        driver.findElement(By.name("pwd")).sendKeys("dipa@123");
        driver.findElement(By.xpath("//a[@id='loginButton']//div")).click();

    }
}
