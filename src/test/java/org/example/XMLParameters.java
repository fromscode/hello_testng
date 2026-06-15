package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class XMLParameters {
    WebDriver driver = null;

    @Test
    @Parameters({"browser", "url", "title"})
    void test1(String browserName, String url, String title) {
        switch (browserName) {
            case "chrome": driver = new ChromeDriver(); break;
            case "firefox": driver = new FirefoxDriver(); break;
            case "edge": driver = new EdgeDriver(); break;
            default:
                Assert.assertTrue(false);
        }

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(driver.getTitle(), title);

        driver.quit();
    }
}
