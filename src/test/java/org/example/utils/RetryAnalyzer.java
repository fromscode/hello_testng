package org.example.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    final int MAX_RETRY_COUNT = 3;
    int retryCount = 0;

    @Override
    public boolean retry (ITestResult result) {
        if (retryCount < MAX_RETRY_COUNT) {
            System.out.println("Retrying test, failed: " + retryCount + " times so far.");
            ++retryCount;
            return true;
        }

        return false;
    }
}
