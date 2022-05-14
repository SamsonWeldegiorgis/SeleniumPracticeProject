package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocatorsPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to https://app.vytrack.com/user/login
        driver.get("https://app.vytrack.com/user/login");

        // Enter username provided : "abcd"
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("abcd");

        // Enter password provided : "abcd"
        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("abcd");

        // Click on login button
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        // Verify the message "Invalid user name or password."
        WebElement alert = driver.findElement(By.className("alert"));
        if(alert.getText().equals("Invalid user name or password.")){
            System.out.println("Message is Passed");
        }else {
            System.out.println("Message is failed");
        }

        // Verify URL contains "vytrack"

        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains("vytrack")){
            System.out.println("URL is passed");
        }else {
            System.out.println("URL is failed");
        }


        // click "Forgot your password?" link
        driver.findElement(By.partialLinkText("Forgot")).click();

        // Verify title is "Forgot Password"
        if(driver.getTitle().equals("Forgot Password")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is NOt correct");
        }

        Thread.sleep(35000);
        driver.quit();

    }
}
