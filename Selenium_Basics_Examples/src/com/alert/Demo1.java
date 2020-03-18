package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Demo1 {
 
    @Test
    public void TestAL() throws InterruptedException{
 
        // Load Chrome browser
 
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
 
       // Open KSRTC website
 
        driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
 
        // Maximize the window
 
        driver.manage().window().maximize();
 
        // Click on Search Availability Service button
 
        driver.findElement(By.id("searchBtn")).click();
 
        // Switch to alert window and capture the text and print
 
        System.out.println(driver.switchTo().alert().getText());
 
        // Pause testcase for 5 second
 
          Thread.sleep(5000);
 
        // click on ok button
 
        driver.switchTo().alert().accept();
 
        // Close browser
 
        driver.quit();
    }
}
