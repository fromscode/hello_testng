package org.example;

import org.example.utils.RetryAnalyzer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerDemo {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void foo() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Sauce Demo");
        driver.quit();
    }
}
