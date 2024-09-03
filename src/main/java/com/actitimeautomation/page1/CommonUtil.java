package com.actitimeautomation.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class CommonUtil {

    WebDriver driver;

    public CommonUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToVisible(WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToPresent(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }

    public void waitForAllElementToVisible(WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public void waitForAllElementToVisible(List<WebElement> elements) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void waitForElementClickable(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementClickable(WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void fluentWait(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(2))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(Exception.class);


        Function<WebDriver, WebElement> function = new Function<>() {

            @Override
            public WebElement apply(WebDriver driver) {
                System.out.println("wait for 2 sec until the element is available....");
                return driver.findElement(locator);
            }
        };
        wait.until(function);
    }
}


