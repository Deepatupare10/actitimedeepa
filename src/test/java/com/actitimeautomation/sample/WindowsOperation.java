package com.actitimeautomation.sample;

import com.actitimeautomation.page1.Baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowsOperation extends Baseclass1 {
    static WebDriver driver;

    public WindowsOperation(){
        //launch browser
        launchBrowser("chrome");
        driver = super.driver;
    }
    public static void main(String[] args){
        new WindowsOperation();

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
                break;

            }
        }

    }
}
