package com.cybertek.tests.day9_drivers_actions_uploads;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class uploadPractice {


    //We don't have to have setupMethod anymore UNLESS we want to create additional structure for our tests.
//    @BeforeMethod
//    public void setUpMethod(){
//        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
//    }

    @Test
    public void upload_test(){
        //driver = Driver.getDriver()
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //Find any file that is not too big in size. And get the path of the file.
        String path = "/Users/cybertekchicago-1/Desktop/fileToUpload.png";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

       // BrowsersUtils.sleep(2);

        //Sending already created path of the file into the 'chooseFile' webElement
        chooseFile.sendKeys(path);

        //Clicking 'uploadButton' to upload the file
        uploadButton.click();

        //Locating the 'File Uploaded!' Header
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        //Asserting the message is displayed
        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        //Closing the driver
        // This will set the driver value to null so that in the future when we use
        // Driver.getDriver() it will be able to create new driver and continue with no issues.
        Driver.closeDriver();
    }

}
