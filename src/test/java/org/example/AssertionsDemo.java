package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
    void testTitle() {
        String actualTitle = "OpenCart";
        String expectedTitle = "OpenShop";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
