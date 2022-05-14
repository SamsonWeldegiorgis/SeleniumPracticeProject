package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocateElementbyCSS {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://www.google.com");

        // search for cydeo
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("cydeo" + Keys.ENTER);

        // verify Cydeo is appeared in the results
        WebElement cydeoText = driver.findElement(By.cssSelector(("a[href='https://cydeo.com/']>h3")));

        if(cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo text test is PASSED");
        }else {
            System.out.println("Cydeo text test is NOT PASSED");
        }

        // close the browser
        driver.quit();
    }
}
