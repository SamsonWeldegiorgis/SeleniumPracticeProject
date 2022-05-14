package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P07_Locate_ElementbyClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        // Identify and save the "learn about the hidden dangers and how to help save lives" element
        WebElement learnabouthiddenText = driver.findElement(By.className("NKcBbd"));

        // verify the "On Fentanyl Awareness Day, learn about the hidden dangers and how to help save lives" taxt appear correctly
        if(learnabouthiddenText.getText().equals("learn about the hidden dangers and how to help save lives")){
            System.out.println("Text appears correctly");
        }else {
            System.out.println("Text does NOT appear correctly");
        }


        // closer the browser
//        driver.quit();

    }

}
