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

        // 5. stopping applications, we are givnig time to applns. to see steps
//        Thread.sleep(3000);
//        driver.quit();

        // 6. Navigate to forward in the web Page
          driver.navigate().forward();

        Thread.sleep(3000);

        // 7. navigate refreshing the web page
        driver.navigate().refresh();

        // 8. Get the current title......of etsy
        System.out.println("Etsy page driver.getTitle() = " + driver.getTitle());

        // getting url of the current page.....of etsy
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // 7. navigate the web page ...of Tesla
        driver.get("https://www.tesla.com");

        // 8. Get the current title......of Tesla
        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());

        // 9. Getting the url .......of Tesla
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


    }
}
