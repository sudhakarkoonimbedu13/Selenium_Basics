package com.qtpselenium.demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CertificateErrorDemo2 
{
   public static WebDriver driver;
   
   public static void main(String[] args) 
   {
		
       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
       
       driver = new ChromeDriver();
       
		driver.get("https://badssl.com/");
		
		driver.findElement(By.linkText("untrusted-root")).click();	
   }

}
