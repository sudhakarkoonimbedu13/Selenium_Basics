package com.qtpselenium.demo3;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseHoverDemo1 {

	public static void main(String[] args) 
	{

		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		driver.manage().window().maximize();
		
		((JavascriptExecutor) driver).executeScript("alert('Hello');");
		
		    // One way
		
		   // driver.findElement(By.xpath("//*[@id='teamDropDown']/a")).click(); 
		
		  // Second way
		
         //	WebElement element = driver.findElement(By.xpath("//*[@id='teamDropDown']/a"));
		//	Actions act = new Actions(driver);
       //	act.moveToElement(element).build().perform();

	}

}
