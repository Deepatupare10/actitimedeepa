package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[]arg) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.get("https://online.actitime.com/xyz8/timetrack/enter.do");
        driver.findElement(By.id("username")).sendKeys("deepa@yopmail.com");
        driver.findElement(By.name("pwd")).sendKeys("dipa@123");
        driver.findElement(By.xpath("//a[@id='loginButton']//div")).click();
Thread.sleep(5000);
    }
}
