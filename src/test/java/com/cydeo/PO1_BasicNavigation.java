package com.cydeo;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO1_BasicNavigation {


    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver" , "\"C:\\Users\\Samson Weldegiorgis\\Downloads\\chromedriver_win32.zip\"");

        WebDriver driver = new ChromeDriver();

        // navigate.to(url)
        driver.navigate().to("https://www.google.com");

        // driver.get(url)
        driver.get("https://www.google.com");

        // navigate.back(url)
        driver.navigate().back();

        // navigate.forward(url)
        driver.navigate().forward();

        // navigate.refresh()
        driver.navigate().refresh();

    }
}
