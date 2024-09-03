package com.actitimeautomation.sample;

import com.actitimeautomation.page1.Baseclass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class WindowHandlingExamples extends Baseclass1 {

    static WebDriver driver;

    public WindowHandlingExamples() {
        launchBrowser("chrome");
        driver = super.driver;

    }

    public static void main(String[] args) {
        new WindowHandlingExamples();

        //navigate to website
        driver.navigate().to("https://online.actitime.com/cyber15/timetrack/enter.do");

        //get the id of current page
        String parentTabId = driver.getWindowHandle();

        //open new window
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.navigate().to("https://redbus.in");

        //print title of current page
        System.out.println(driver.getTitle());

        //Print the url of page
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //close the current tab
        driver.close();

        //switch control to default page
        driver.switchTo().window(parentTabId);

        //print the parent title
        System.out.println(driver.getTitle());
        driver.close();
    }
}













    
