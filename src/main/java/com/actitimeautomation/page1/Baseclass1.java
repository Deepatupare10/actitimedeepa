package com.actitimeautomation.page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass1 {


        public WebDriver driver;

        public void launchBrowser(String browserName)
        {
            if(browserName.equals("chrome")) {
                driver = new ChromeDriver();
            }
            else if(browserName.equals("firefox")){
                driver=new FirefoxDriver();
            }
        }
    }

