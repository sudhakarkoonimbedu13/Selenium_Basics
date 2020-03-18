package com.qtpselenium.demo2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Predicate;

public class FluentWaitDemo3 
 {
   static WebDriver driver;
   
   public static void main(String[] args) 
   {
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		driver = new FirefoxDriver(binary,null);
		driver.get("C:\\Users\\dt204684\\Desktop\\FluentWaitDemo.html");
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
		
		fwait.withTimeout(20,TimeUnit.SECONDS);
		fwait.pollingEvery(2,TimeUnit.SECONDS);
		fwait.ignoring(NoSuchElementException.class);
		
		Predicate<WebDriver> predicate = new Predicate<WebDriver>()
				{
			         public boolean apply(WebDriver arg0)
			         {
			        	 WebElement element = arg0.findElement(By.id("dynamicColor"));
			        	 
			        	 String color = element.getAttribute("style");
			        	 
			        	 String colorCode = element.getCssValue("color");
			        	 
			        	 System.out.println(color+" ------ "+colorCode );
			        	 
			        	 if(color.contains("yellow") && colorCode.equals("rgba(255, 255, 0, 1)"))
                           {	                          
	                          return true;
                           }
			               return false;
			        		 
			         }
				};
				
				fwait.until(predicate);
	}

}
