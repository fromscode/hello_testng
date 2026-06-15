package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLoginTest1 {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 0)
    void openApp() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    void testLogo() {
        driver.findElement(By.xpath("//img[contains(@alt, 'branding')]")).isDisplayed();
    }

    @Test(priority = 2)
    void testLogin() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText().equals("Dashboard")) {
            System.out.println("Dashboard displayed");
        }
        else {
            System.out.println("Dashboard not displayed");
        }
    }

    @Test(priority = 3)
    void testLogout() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
        if (driver.getCurrentUrl().endsWith("/auth/login")) {
            System.out.println("Logout is sucessfull");
        }
        else {
            System.out.println("Logout failed");
        }
    }



}
