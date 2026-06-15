package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvidersDemo {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }


    @AfterClass
    void teardown() {
        driver.close();
    }

    @DataProvider(name = "dp")
    Object[][] provider() {
        return new Object[][]{
                {"test", "password"},
                {"hello", "world"},
                {"Admin", "admin123"}
        };
    }

    @Test(dataProvider = "dp")
    void testLogin(String username, String password) {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        if (driver.getCurrentUrl().endsWith("/index")) {
            Assert.assertTrue(true);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
            driver.findElement(By.linkText("Logout")).click();
        } else {
            Assert.assertTrue(false);
        }
    }
}
