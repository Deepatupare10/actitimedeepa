package com.actitimeautomation.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {
    WebDriver driver;
    CommonUtil commonUtil;

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
        commonUtil=new CommonUtil(this.driver);
    }

    public By taskModule = By.xpath("//div[@id='container_tasks']");
    public By addNewButton = By.xpath("//div[text()='Add New']");
    public By createNewCustomer = By.xpath("//div[@ class='item createNewCustomer']");
    public By customerNameTextArea = By.xpath("//div[@class='customerInfoDiv']/descendant::input");
    public By createCustomerButton = By.xpath("//div[text()='Create Customer']");
    public By searchText = By.xpath("//div[@class='searchFieldContainer']/descendant::input");


    public void createCustomer(String customerName) {
        commonUtil.fluentWait(taskModule);
        driver.findElement(taskModule).click();
        commonUtil.fluentWait(addNewButton);
        driver.findElement(addNewButton).click();
        commonUtil.fluentWait(createNewCustomer);

        driver.findElement(createNewCustomer).click();
        commonUtil.fluentWait(customerNameTextArea);
        driver.findElement(customerNameTextArea).sendKeys(customerName);
        commonUtil.fluentWait(createCustomerButton);
        driver.findElement(createCustomerButton).click();

    }
    public void verifyCustomer (String customerName){
      driver.findElement(searchText).sendKeys(customerName);
    }
}
