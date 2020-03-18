package com.qtpselenium.demo2;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopupWindows 
{
   static WebDriver driver;
   
   public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		driver = new FirefoxDriver(binary,null);
		
	    driver.get("http://demo.guru99.com/popup.php");
	    
	    // Procedure - 1
	    
	    /*Set<String> windows = driver.getWindowHandles();
	    
	    Iterator<String> it = windows.iterator();	    
	    
	    String mainWindow = it.next();
	    
	    System.out.println(mainWindow);
	    
	    driver.findElement(By.linkText("Click Here")).click();
	    
	    windows = driver.getWindowHandles();
	    
	    it = windows.iterator();
	    
	    mainWindow = it.next();
	    String subWindow = it.next();
	    
	    System.out.println(mainWindow);
	    System.out.println(subWindow);
	    
	    driver.switchTo().window(subWindow);
	    
	    System.out.println(driver.getCurrentUrl()); */
	    
	    // Procedure - 2
	    
	    /*Set<String> windows = driver.getWindowHandles();
	    
	    Iterator<String> it = windows.iterator();
	    
	       
	    String  mainWindow = it.next();
	    
	    String subWindow=null;
	    
	    System.out.println("Main Window id is --> "+mainWindow);
	    
	    driver.findElement(By.linkText("Click Here")).click();
	    
	   windows = driver.getWindowHandles();
	    
	   it = windows.iterator();
	   
	   mainWindow = it.next();
	   
	   System.out.println("Main Window id is --> "+mainWindow);
	    
	   while(it.hasNext())
	    {
		  subWindow = it.next();  
	      System.out.println("Sub Window id is --> "+subWindow);
	      
	    }	    
	    
	   driver.switchTo().window(subWindow);
	   
	   System.out.println(driver.getCurrentUrl()); */
	   
	   
	  // Procedure - 3
	    
	  for(String windowHandle:driver.getWindowHandles())
	  {
		  System.out.println(windowHandle);
	  }
	  
	  driver.findElement(By.linkText("Click Here")).click();
	  
	  for(String windowHandle:driver.getWindowHandles())
	  {
		  System.out.println(windowHandle);
		  driver.switchTo().window(windowHandle);
	  }
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
	}

}
