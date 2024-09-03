package com.actitimeautomation.sample;

import com.actitimeautomation.page1.Baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GetAllLinks extends Baseclass1 {
    static WebDriver driver;


    public GetAllLinks(){
        launchBrowser("chrome");

        driver=super.driver;

    }
    public static void main(String[] args){
        new GetAllLinks();
        driver.navigate().to("https://amazon.in");

        List<WebElement> tagElements= driver.findElements(By.tagName("a"));
        System.out.println(tagElements.size());

        for(WebElement element: tagElements){
            String link=element.getAttribute("href");
            System.out.println(link);

        }
        driver.quit();
    }

}
