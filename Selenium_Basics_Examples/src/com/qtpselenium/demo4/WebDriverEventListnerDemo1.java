package com.qtpselenium.demo4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverEventListnerDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver web_driver = new FirefoxDriver(binary,null);
		
		EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
		
		WebDriverEventListnerDemo2 myListner = new WebDriverEventListnerDemo2();
		
		driver.register(myListner);
		
		driver.navigate().to("http://google.com");
		
		driver.findElement(By.linkText("Images")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Before click on Back button...");
		
		driver.navigate().back();
		
		System.out.println("Clicked on Back button...");

	}

}
