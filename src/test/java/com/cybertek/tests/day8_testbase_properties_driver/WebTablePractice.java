package com.cybertek.tests.day8_testbase_properties_driver;

import com.cybertek.Utilities.WebDriverFactory;
import com.cybertek.Utilities.WebOrderUtils;
import com.cybertek.tests.Base.testBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablePractice extends testBase {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void verify_order_test() throws InterruptedException{
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");

        WebOrderUtils.loginToSmartBear(driver);

        Thread.sleep(1000);

        //Verify "Mark Smith" is in the list.
        WebOrderUtils.verifyOrder(driver,"Mark Smith");



    }
}