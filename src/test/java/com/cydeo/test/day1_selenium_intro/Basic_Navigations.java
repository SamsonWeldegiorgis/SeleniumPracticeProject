package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {

    public static void main(String[] args) throws InterruptedException {

        // 1. Setting up the WebDriver manager and Chrome browser
        WebDriverManager.chromedriver().setup();

        // 2. Creating instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // 3. Get the navigating to web page
        driver.get("https://www.etsy.com");      // or  driver.navigate().to("https://www.etsy.com");

        // 4. using back i.e. navigating back from the web page
        driver.navigate().back();

        // 5. stoppkng applications, we are givnig time to applns. to see steps
        Thread.sleep(15000);
        driver.quit();



    }
}
