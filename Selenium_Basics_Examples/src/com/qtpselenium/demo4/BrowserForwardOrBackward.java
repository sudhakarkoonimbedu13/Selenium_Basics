package com.qtpselenium.demo4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserForwardOrBackward {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		// Back button
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		// Forward button
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		

	}

}
