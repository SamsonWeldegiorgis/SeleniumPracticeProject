package com.cydeo;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_FullScreenMode {

    public static void main(String[] args) {

        // Set up WebDriver and Chrome setup instnce
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver" , "\"C:\\Users\\Samson Weldegiorgis\\Downloads\\chromedriver_win32.zip\"");
        WebDriver driver = new ChromeDriver();

        // navigate to google and print out the title
        driver.get("https://cydeo.com");

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();   //  chooose from both,,,,the better,,,





    }
}
