package org.example;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class SampleTests {
    @Test
    void test1() {
        System.out.println("Test 1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"test1"})
    void test2() {
        System.out.println("Test 2");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"test2"})
    void test3() {
        System.out.println("Test 3");
        Assert.assertTrue(true);
    }
}
