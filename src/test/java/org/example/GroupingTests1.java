package org.example;

import org.testng.annotations.Test;

public class GroupingTests1 {
    @Test(groups = {"regression"})
    void test1() {
        System.out.println("Regression");
    }

    @Test(groups = {"sanity"})
    void test2() {
        System.out.println("Sanity");
    }

    @Test(groups = {"regression", "functional"})
    void test3() {
        System.out.println("Both");
    }
}
