package com.automation.test;

import org.testng.annotations.Test;

public class OrderCancellationTest extends BaseTest {
    @Test
    public void verifyUserCanCancelOrder(){
        System.out.println("Test-Verify User can Cancel the Order ");
    }
    @Test(groups="Chris's", priority = 4)
    public void verifyUserCannotCancelOrderOnceOrderStateIsShipped(){
        System.out.println("Test- Verify Each product Add to Cart Button");
    }

}
