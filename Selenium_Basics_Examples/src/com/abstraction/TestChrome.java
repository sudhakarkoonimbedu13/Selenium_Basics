package com.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  //driver.get(");

	}

}
