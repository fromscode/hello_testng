package org.example;

import org.testng.annotations.Test;

public class FirstTestCase {
    @Test
    void openApp() {
        System.out.println("Opening App");
    }

    @Test
    void login() {
        System.out.println("Logging in");
    }

    @Test
    void logout() {
        System.out.println("Logging out");
    }
}
