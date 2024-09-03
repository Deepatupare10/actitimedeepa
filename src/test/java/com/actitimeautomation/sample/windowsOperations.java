package com.actitimeautomation.sample;

import com.actitimeautomation.page1.Baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;


public class windowsOperations extends Baseclass1 {
    WebDriver driver;

    @BeforeClass

    public void setup() {
        launchBrowser("chrome");
        driver = new ChromeDriver();
    }

    @Test
    public void verifyWindowHandling() {
        driver.get("https://online.actitime.com/cyber15/timetrack/enter.do");
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);
        Set<String> allWindowIds = driver.getWindowHandles();
        System.out.println(allWindowIds);

        for (String id : allWindowIds)
            if (!id.equals(parentWindowId)) {
                System.out.println("Second Tab Id: " + id);
                driver.switchTo().window(id);
                String childWindowTitle = driver.getTitle();
                System.out.println(childWindowTitle);
                driver.close();
                break;

            }


        driver.switchTo().window(parentWindowId);
        System.out.println("Parent tab title : " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


