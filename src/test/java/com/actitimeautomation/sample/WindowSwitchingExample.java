package com.actitimeautomation.sample;

import com.actitimeautomation.page1.Baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowSwitchingExample extends Baseclass1 {
    static WebDriver driver;

    public WindowSwitchingExample(){
        //launch browser
        launchBrowser("chrome");
        driver = super.driver;
    }
    public static void main(String[] args){
        new WindowSwitchingExample();

        //navigate to website
        driver.navigate().to("https://online.actitime.com/cyber15/timetrack/enter.do");
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        String parentWindowId=driver.getWindowHandle();

        //get all window/tab ids
        Set<String> allWindowIds=driver.getWindowHandles();
        System.out.println(allWindowIds);

        //iterate through all ids
        for(String id:allWindowIds){
            //check if id is not equals with parentId

            if(!id.equals(parentWindowId)){
                System.out.println("Second Tab Id: " + id);

                //switch to second tab
                driver.switchTo().window(id);

                //print the title
                String childWindowTitle= driver.getTitle();
                System.out.println(childWindowTitle);
                //close second tab
                driver.close();
                break;

            }
        }
        //switch control back to parent tab
        driver.switchTo().window(parentWindowId);
        //driver.switchTo().defaultContent();

        //get the title of parent tab
       // System.out.println(("Parent tab title :  "+driver.getTitle());

        driver.quit();
    }

























}
