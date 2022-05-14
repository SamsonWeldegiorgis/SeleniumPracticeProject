package com.cydeo.test.Day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T05_NextCBM_Login_NegativeSenario {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // cbm
        driver.navigate().to("http://login2.nextbasecrm.com");

        // Login by name
        WebElement loginText = driver.findElement(By.name("USER_LOGIN"));
        loginText.sendKeys("marketing5@cybertekschool.com " + Keys.ENTER);

        // Password by name
        WebElement passWordText = driver.findElement(By.name("USER_PASSWORD"));
        passWordText.sendKeys("UseyyudhrUser" + Keys.ENTER); // UserUser

        String actualTitle = "Portal";
        String expectedTitle = driver.getTitle();

        if(expectedTitle.contains(actualTitle)){
            System.out.println("Verification of Title PASSED");
        } else {
            System.out.println("Verification of Title FAILED");
        }

        driver.quit();




    }



}
