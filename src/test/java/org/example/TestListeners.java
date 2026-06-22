package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Test Start: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("On Test Failure: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("On Test Skipped: " + result.getName());
    }
}
