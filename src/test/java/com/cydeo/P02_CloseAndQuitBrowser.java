package com.cydeo;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_CloseAndQuitBrowser {


    public static void main(String[] args) throws InterruptedException {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver" , "\"C:\\Users\\Samson Weldegiorgis\\Downloads\\chromedriver_win32.zip\"");
        WebDriver driver = new ChromeDriver();

        // navigate to a practice page that open new tab
        // this practice url will open and wait 3 seconds and open new tab
        driver.get("https://practice.cydeo.com/open_new_tab");

        // wait for 5 sec.
        Thread.sleep(5000);
        // closing any current tab
       // driver.close();   // if you want to stay there ,,,,,use driver.close();

        // close all browser window opened by driver
        driver.quit();
    }
}

