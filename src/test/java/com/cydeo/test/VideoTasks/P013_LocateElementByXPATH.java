package com.cydeo.test.VideoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P013_LocateElementByXPATH {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://google.com");

        // serach for Cydeo
        WebElement cydeoSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        cydeoSearchBox.sendKeys("cydeo" + Keys.ENTER);


        // Verify Cydeo linkText is appeared in the results
        WebElement cydeoTextClick =driver.findElement(By.xpath("//h3[.='Cydeo']"));


        if(cydeoTextClick.getText().equals("Cydeo")){
            System.out.println("Cydeo text is appeared");
        }else {
            System.out.println("Cydeo text is NOT appeared");
        }


        // close the browser
        driver.quit();
    }
}
