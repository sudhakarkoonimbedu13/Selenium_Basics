package com.alert;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo1 
{
   static WebDriver driver;
   
   public static void main(String[] args) throws InterruptedException 
   {
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		driver = new FirefoxDriver(binary,null);
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//input[@value='Reset']")).click();

	}

}
