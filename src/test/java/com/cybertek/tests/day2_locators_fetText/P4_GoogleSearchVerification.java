package com.cybertek.tests.day2_locators_fetText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {

    public static void main(String[] args) {

        //TC #4: Google search
        //1- Open a chrome browser
        //setup driver
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();

        //maximize page
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Write "apple" in search box
        driver.findElement(By.name("apple"));

        //4- Click google search button
        driver.findElement(By.name("q")).sendKeys( "apple"+ Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with "apple" word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.err.println("Title verification FAILED!");
            System.out.println("ExpectedInTitle = "+expectedInTitle);
            System.out.println("ActualTitle = "+actualTitle);
        }

        driver.close();
    }
}
