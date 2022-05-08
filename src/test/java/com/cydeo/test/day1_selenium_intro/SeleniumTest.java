package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // set up the web drivers and chrome browser
        WebDriverManager.chromedriver().setup();

        // 2. get the instance of the chrome driver\
        WebDriver driver = new ChromeDriver();

        // 3. Browse google
        driver.get("https://www.google.com");

        Thread.sleep(18000);
        driver.quit();

    }
}