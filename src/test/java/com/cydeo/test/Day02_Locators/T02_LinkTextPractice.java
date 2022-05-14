package com.cydeo.test.Day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/
          driver.navigate().to("https://practice.cydeo.com");

        Thread.sleep(3000);

//        3- Click to A/B Testing from top of the list.
        WebElement abLinkText = driver.findElement(By.linkText("A/B Testing"));
//        WebElement addRemoveText = driver.findElement(By.linkText("Add/Remove Elements"));
           abLinkText.click();

        Thread.sleep(3000);

        //        4- Verify title is:
           String expectedTitle = "No A/B Test";
           String actualTitle = driver.getTitle();

           if(expectedTitle.equals(actualTitle)){
               System.out.println("No A/B Test - Title verification is PASSED ");
           }else {
               System.out.println("No A/B Test - Title verification is FAILED");
           }

        Thread.sleep(3000);

//        5- Go back to home page by using the .back();
        driver.navigate().back();

//        6- Verify title equals:
            expectedTitle = "Practice";
            actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Practice- Title verification is PASSED ");
        }else {
            System.out.println("Practice - Title verification is FAILED");
        }

//        Expected: Practice

        Thread.sleep(10000);
        driver.quit();

    }

}
