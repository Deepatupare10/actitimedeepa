package com.actitimeautomation.sample;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class SanityTestGroup {

    @BeforeGroups(groups={"regression","sanity"})
    public void beforeGroup(){
        System.out.println("This is before group method");
    }
    @AfterGroups(groups="sanity")
    public void afterGroup(){
        System.out.println("This is after regression group method");
    }

    @Test(groups="sanity")
    public void sanityTest1(){
        System.out.println("sanityTest1");

    }
    @Test(groups="sanity")
    public void sanityTest2(){
        System.out.println("sanityTest2");

    }
    @Test(groups="sanity")
    public void sanityTest3(){
        System.out.println("sanityTest3");

    }
    @Test(groups="sanity")
    public void sanityTest4(){
        System.out.println("sanityTest4");

    }
    @Test(groups={"regression","sanity"})
    public void sanityTest5(){
        System.out.println("sanityTest5");
    }



}
