package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_LocateEleementById {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        // webelement "I am feeling lucky" element and save the element
        WebElement luckyText = driver.findElement(By.id("gbqfbb"));

        // find attribute value
        String text = luckyText.getAttribute("value");

        // verify if value i'm feelilng lucky"
        if (text.equals("I'm Feeling Lucky")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
