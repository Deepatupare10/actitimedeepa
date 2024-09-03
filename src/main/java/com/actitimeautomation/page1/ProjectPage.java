package com.actitimeautomation.page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
    WebDriver driver;
    @FindBy(xpath = "//div[contains@class,'createNewProject')]")
    public WebElement createNewProjectButton;

    public ProjectPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver, this);
    }

}
