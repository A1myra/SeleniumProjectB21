package com.cybertek.tests.day8_testbase_properties_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablePractice {


    /*
    make the method static so that we don't have to create instance of the class.
     */

    public static void loginToSmartBear(WebDriver driver) {
        //3. Enter username: “Tester”
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();}

        //PRACTICE #4: Method: verifyOrder•
        //Create a method named verifyOrdering SmartBearUtils class.
        // •Methodtakes WebDriver object and String(name).
        //•Methodshould verify if given name exists in orders.
        //•This method should simply accepts a name(String), and assert whether given name is in the list or not.
        //•Create a new TestNG test to test if the method is working as expected.

    public static void verifyOrder(WebDriver driver, String expectedName){

    }



}