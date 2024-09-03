package com.actitimeautomation.sample;

import org.testng.annotations.*;

public class TestNGAttributes {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("This is before suite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("This is after suite");
    }

    @BeforeTest
    public void beforetest()
    {
        System.out.println("This is before test method");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("This is before class");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("This is after class");
    }

    @BeforeMethod
    public void beforeMethod1()
    {
        System.out.println("This is before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This after method");
    }

    @Test(enabled = false)
    public void verifyLogin()
    {
        System.out.println("This is verify login method ");

    }

    @Test(priority=1)
    public void login() throws Exception{
        System.out.println("This is login method from TestNGAnnotations class ");
    }

    @Test(priority=1,dependsOnMethods = {"login"})
    public void verifyTask() throws Exception {
        System.out.println("This is verify task method from TestNGAnnotations class ");
        throw new Exception("This is sample exception");
    }

    @Test(priority=3,dependsOnMethods = "login",enabled=false)
    public void logout()
    {
        System.out.println("This is logout method fromTestNGAnnotations class");


        }
    }

