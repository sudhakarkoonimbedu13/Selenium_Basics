package com.qtpselenium.demo4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MouseMovementDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver web_driver = new FirefoxDriver(binary,null);
		
		EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
		
		WebDriverEventListnerDemo2 myListner = new WebDriverEventListnerDemo2();
		
		driver.register(myListner);
		
		EventFiringMouse mouse = new EventFiringMouse(driver,myListner);
		
		driver.get("https:sakshi.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		Locatable loc = (Locatable)driver.findElement(By.xpath("//*[@id='block-block-6']/div/div/div[1]/div/div/div[1]/div/span/a"));
		
		Coordinates cor = loc.getCoordinates();
		
		try
		{
			mouse.mouseMove(cor);
		}
		catch(Exception e){}
		
		
		driver.findElement(By.xpath("//*[@id='block-block-6']/div/div/div[1]/div/div/div[1]/div/span/a")).sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
		
		Point p = driver.findElement(By.xpath("//*[@id='block-block-6']/div/div/div[1]/div/div/div[1]/div/span/a")).getLocation();
		
		System.out.println(p.x);
		
		System.out.println(p.y);
		
		
		

	}

}
