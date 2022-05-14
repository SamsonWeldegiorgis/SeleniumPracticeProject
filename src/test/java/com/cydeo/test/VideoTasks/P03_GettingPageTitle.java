package com.cydeo.test.VideoTasks;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {

    public static void main(String[] args) {

        // setup chrome and create WebDriver instance
                WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver" , "\"C:\\Users\\Samson Weldegiorgis\\Downloads\\chromedriver_win32.zip\"");
        WebDriver driver = new ChromeDriver();
        // navigate to google and print out the title
        driver.get("https://cydeo.com");

        String title = driver.getTitle();
        System.out.println("Title of the page : " + title);

        if (title.equalsIgnoreCase("Cydeo")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed ");
        }
        driver.quit();

    }
}
