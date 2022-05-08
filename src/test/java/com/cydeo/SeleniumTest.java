package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        //  1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver" , "\"C:\\Users\\Samson Weldegiorgis\\Downloads\\chromedriver_win32.zip\"");
//


        // 2 - Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }

}
