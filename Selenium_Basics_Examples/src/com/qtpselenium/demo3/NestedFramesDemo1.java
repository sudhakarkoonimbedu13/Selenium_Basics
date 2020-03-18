package com.qtpselenium.demo3;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFramesDemo1 {

	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_mix");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	    driver.manage().window().maximize();	    
 
	    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	    
	    System.out.println(frames.size());
	    
	    for(int i=0;i<frames.size();i++)
	    {
	    	driver.switchTo().frame(i);
	    	if(driver.findElements(By.tagName("h3")).size()>0)
	    	{
	    		System.out.println(i);
	    		System.out.println(driver.findElement(By.tagName("h3")).getText());
	    	}	    	
	    	driver.switchTo().defaultContent();
	    }
	    
   }

}
