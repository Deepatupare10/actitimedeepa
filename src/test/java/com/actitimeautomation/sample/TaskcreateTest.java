package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskcreateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/cyber15/timetrack/enter.do");
        driver.findElement(By.id("username")).sendKeys("dmt@yopmail.com");
        driver.findElement(By.name("pwd")).sendKeys("dmt@123");
        driver.findElement(By.xpath("//a[@id='loginButton']//div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Tasks']")).click();
    }





}
