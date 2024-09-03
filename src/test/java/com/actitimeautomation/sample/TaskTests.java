package com.actitimeautomation.sample;

import com.actitimeautomation.page1.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTests {
    public static void main(String[] args)throws Exception {
        //launch browser
        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("https://online.actitime.com/cyber15/timetrack/enter.do");

        //create object of LoginPage class
        LoginPage loginPage = new LoginPage(driver);

        //perform login operation;
        loginPage.login("dmt@yopmail.com","dmt@123");

        //wait for 5 sec
        Thread.sleep(5000);

        //click on Tasks module
        driver.findElement(By.xpath("//div[text()=Tasks]")).click();


        //wait for 5 sec
        Thread.sleep(5000);

        //locate select all check box & verify it is displayed
        boolean selectAllCheckbox = driver.findElement(By.xpath("//tr[@class='headers']/descendant::div[2]")).isDisplayed();

        if(selectAllCheckbox) {
            //click on select all check box
            driver.findElement(By.xpath("//tr[@class='headers']/descendant::div[2]")).click();
            //wait for 5 sec
            Thread.sleep(5000);

            //verify check box is selected or not
            boolean selectedCheckbox = driver.findElement(By.xpath("//table[@class='taskRowsTable']/decendant::tr[1]//div[@class='img']")).isSelected();


            if (selectedCheckbox) {
                System.out.println("All check boxes are selected.....");
            } else {
                System.out.println("Unable to select all checkBoxes.....");
            }
        }else{
            System.out.println("The select all check box is not displayed on screen hence cannot perform further action");

        }
    }




    }

