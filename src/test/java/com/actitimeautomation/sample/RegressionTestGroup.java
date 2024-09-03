package com.actitimeautomation.sample;

import org.testng.annotations.Test;

public class RegressionTestGroup {

    @Test(groups="regression")
    public void regressionTest1(){
        System.out.println("regressionTest1");

    }
    @Test(groups="regression")
    public void regressionTest2(){
        System.out.println("regressionTest2");

    }
    @Test(groups="sanity")
    public void sanityTest5(){
        System.out.println("sanityTest5");

    }
}
