package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
    @Test
    void hardAssertions() {
        System.out.println("Before assertion");
        Assert.assertEquals(1, 2);
        System.out.println("After assertion"); // wont get printed
    }

    @Test
    void softAssertion() {
        System.out.println("Before assertion");
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1, 2);
        System.out.println("After assertion");
        sa.assertAll();     // will get printed
    }
}
