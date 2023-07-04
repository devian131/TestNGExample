package com.automation.test;

import org.testng.annotations.Test;

public class AddCart extends BaseTest {
    @Test
    public void userCanAddProduct(){
        System.out.println("user can enter the product ");
        throw new RuntimeException("Test Failed");
    }
    @Test(dependsOnMethods ="userCanAddProduct")
    public void userCanPurchaseProduct(){
        System.out.println("user can purchase the product ");
    }
    @Test(dependsOnMethods ="userCanAddProduct")
    public void userCanDeleteProduct(){
        System.out.println("user can delete product ");
    }
}
