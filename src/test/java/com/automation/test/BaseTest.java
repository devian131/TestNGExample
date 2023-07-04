package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @AfterMethod
    public void cleanUp(){
        System.out.println("Close Browser");
        System.out.println("Close Database Connection");

    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
        System.out.println("Open Database Connection ");
    }
}
