package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_LocateElementbyTagName {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/");

        //identify and save the "Text Automation Practice " element
        WebElement text = driver.findElement(By.tagName("h1"));


        // print out the text
        System.out.println(text.getText());


        // close the browser
        Thread.sleep(5000);
//        driver.quit();
    }
}
