package com.cydeo.test.Day01_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Yahoo_Title_Verification {
    public static void main(String[] args) {

          /*
        TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com/
3. Verify title:
Expected: Yahoo
         */
        // Web driver & chrome browser & instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1. check it mannaully ,,,,,,yahoo..

        // 2. maximize screen
        driver.manage().window().maximize();

        // 3. get the web page
        driver.get("https://www.yahoo.com");

         // actual title comes from Selenium
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        // expected title comes from requirements (from the task given)
        String expectedTitle = "Yahoo";

        //4. Get the title of the web page
       System.out.println("Yahoo web Page title: \"https://www.yahoo.com/\" = " + "https://www.yahoo.com/");

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is PASSED");
        }else {
            System.out.println("Title verification is FAILED");
        }
        driver.quit();

    }
}
