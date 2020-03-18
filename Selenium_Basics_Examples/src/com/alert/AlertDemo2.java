package com.alert;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo2 
{
 public static WebDriver driver;
 
	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
				
		driver = new FirefoxDriver(binary,null);
		
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/AlertHandles.html");
		
		// Simple Alert
		
		driver.findElement(By.cssSelector("input[id='btnAlert']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		// Confirm Alert - Accept
		
		driver.findElement(By.xpath("//input[@id='btnConfirm']")).click();
		
		alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept(); // Accept the alert (Click on OK button)
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		
		// Confirm Alert - Reject or Dismiss
		
		driver.findElement(By.xpath("//input[@id='btnConfirm']")).click();
		
		alert = driver.switchTo().alert();
		
		alert.dismiss(); // Dismiss the alert (Click on Cancel button)
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		// Prompt Alert
		
		driver.findElement(By.id("btnPrompt")).click();
		
		alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("Alert Demo Using Selenium");
		
		alert.accept();
		
		System.out.println(driver.findElement(By.id("output")).getText());

	}

}
