package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
    @BeforeMethod
    void login() {
        System.out.println("This is login");
    }

    @Test
    void testCase1() {
        System.out.println("This is first case");
    }

    @Test(priority = 1)
    void testCase2() {
        System.out.println("This is second case");
    }

    @AfterMethod
    void logout() {
        System.out.println("This is logout");
    }
}
