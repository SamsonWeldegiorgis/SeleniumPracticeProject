package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_LocateElementByPartialLinkTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");


        // identify and save the "Helpful Tips
        WebElement theHiddenText = driver.findElement(By.partialLinkText("the hidden dangers"));

        // Print out text
        System.out.println(theHiddenText.getText());
        // close
        Thread.sleep(10000);
        driver.quit();



    }
}
