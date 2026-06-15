package org.example;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
    @Test
    void openApp() {
        System.out.println("Open app");
        Assert.assertTrue(true);
    }

    @Test(priority = 1, dependsOnMethods = {"openApp"})
    void login() {
        System.out.println("Login");
        Assert.assertTrue(false);
    }

    @Test(priority = 3, dependsOnMethods = {"openApp", "login"})
    void search() {
        System.out.println("Search");
        Assert.assertTrue(true);
    }
}
