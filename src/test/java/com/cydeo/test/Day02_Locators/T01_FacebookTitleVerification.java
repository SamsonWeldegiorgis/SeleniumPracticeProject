package com.cydeo.test.Day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_FacebookTitleVerification {
    public static void main(String[] args) {

        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Got to https://www.facebook.com .........by get or navigate
        driver.navigate().to("https://www.facebook.com" );
//        driver.get("https://www.facebook.com");  ,,,,,we can use this also ,,,,

        // 3. Verify title :
        // Expected : "Facebook - log in or sign up "
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook title verification is PASSED");
        }else {
            System.out.println("Facebook title verification is FAILED");
        }

        driver.quit();


    }


}
