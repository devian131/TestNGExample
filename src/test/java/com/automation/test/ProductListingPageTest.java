package com.automation.test;

import org.testng.annotations.Test;

public class ProductListingPageTest extends BaseTest {
    @Test(groups="Sean's", priority = 1)
    public void verifyEachProductPrice() {
        System.out.println("Test-Verify Each Product Price ");
    }

    @Test
    public void verifyEachProductHasStockInformation() {
        System.out.println("Test- Verify Each Product Has Stock Information");
    }

    @Test
    public void verifyEachProductHasAddToCartButton() {
        System.out.println("Test- Verify Each Product Has Add to Cart Button ");

    }
}
