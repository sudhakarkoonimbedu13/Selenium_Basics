package com.qtpselenium.demo2;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo1 {
    static WebDriver driver;
    
	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
        driver = new FirefoxDriver(binary,null);
        
        WebDriverWait wait = new WebDriverWait(driver,60);
        
        driver.get("C:\\Users\\dt204684\\Desktop\\FluentWaitDemo.html");
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("dynamicText6")));
        
        System.out.println("The required text is displayed...");
        
	}

}
