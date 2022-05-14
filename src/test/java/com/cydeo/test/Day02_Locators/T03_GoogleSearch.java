package com.cydeo.test.Day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_GoogleSearch {
    public static void main(String[] args) throws InterruptedException{

//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com/
        driver.get("https://google.com");

//        3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.name("q"));

//        4- Click google search button
        searchBox.sendKeys("apple" + Keys.ENTER);

//        5- Verify title:
        String actualTitle = "apple";
        String expecteTitle = driver.getTitle();

        if(expecteTitle.startsWith(actualTitle)){ // if(expecteTitle.startsWith("apple")){
            System.out.println("Title Verification is Passed");
        } else {
            System.out.println("Title Verification is Failed");
        }
//        Expected: Title should start with “apple” word

        Thread.sleep(5000);
        WebElement navigateApple = driver.findElement(By.linkText("iPhone"));
        navigateApple.click();


        Thread.sleep(5000);
        WebElement navigatIphone13Pro = driver.findElement(By.className("chapternav-label"));
        navigatIphone13Pro.click();

        Thread.sleep(5000);
        WebElement navigateBuy = driver.findElement(By.className("ac-ln-button"));
        navigateBuy.click();

        Thread.sleep(5000);
        WebElement navigateOptions = driver.findElement(By.id("as-carrierpromotion-ribbonlearnmore-trigger"));
        navigateOptions.click();



        Thread.sleep(30000);
        driver.quit();
    }
}
