package com.actitimeautomation.sample;

import org.testng.annotations.*;

public class TestNGAnnotations {
    {
    System.out.println("This is non static block");
}
public TestNGAnnotations() {
    System.out.println("This is constructor ofTestNGAnnotations class");
}
@BeforeClass
public void beforeClass(){
    System.out.println("This is before class");
}

@AfterClass
public void afterClass(){
    System.out.println("This is after class");
}

@BeforeMethod
public void beforeMethod1(){
    System.out.println("This is before method");
}

@AfterMethod
public void afterMethod1(){
    System.out.println("This is after method");
}
@Test
public void test1(){
    System.out.println("This is test1 method from TestNGAnnotations class");
}

@Test
    public void test2(){
        System.out.println("This is test2 method from TestNGAnnotations class");
    }

@Test
    public void test3(){
        System.out.println("This is test3 method from TestNGAnnotations class");
    }
}


