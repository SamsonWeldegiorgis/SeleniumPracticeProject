package com.cydeo.test.Day01_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_Cydeo_url_Verification {
    /*
    TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com/
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        // actual result
        String actualURL = driver.getCurrentUrl();
        System.out.println("Actual Current URL : " + actualURL);

        // expected result
        String expectedURL = "cydeo";

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification Passed");
        }else {
            System.out.println("URL verification Failed");
        }


        String expectedTitle= "Practice";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed");
        }else {
            System.out.println("Title verification Failed");
        }

        driver.quit();

    }
}
