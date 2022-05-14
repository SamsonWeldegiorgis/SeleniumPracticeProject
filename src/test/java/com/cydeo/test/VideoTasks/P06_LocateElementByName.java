package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06_LocateElementByName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //identify and save the searach box element
        WebElement searchBox = driver.findElement(By.name("q"));

        //enter text "selenium" and serach for it
        searchBox.sendKeys("selenium" + Keys.ENTER);

        // close the browser
        driver.quit();


    }
}
