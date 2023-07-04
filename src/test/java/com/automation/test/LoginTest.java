package com.automation.test;

import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    @Parameters("browser")
    @Test(groups="Jessica's", priority = 2)
    public void verifyLoginSuccessful(String browser){
        System.out.println("Open website");
        System.out.println("Do login");
        System.out.println("Verify login successful");
        System.out.println(browser);
    }

    @Test
    public void secondTest(){
        System.out.println("Second Test");
    }
    @Test
    public void thirdTest(){
        System.out.println("Third");
    }
}
