package com.qtpselenium.demo2;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo4 
{

	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("C:\\Users\\dt204684\\Desktop\\FluentWaitDemo.html");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement element1 = wait.until(new Function<WebDriver,WebElement>()
	    	{
	    	   public WebElement apply(WebDriver driver)
	    	   {
	    		   return driver.findElement(By.linkText("dynamicText6"));
	    		   
	    	   }
	    	});

	}

}
