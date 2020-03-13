package com.qa.selenium.basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Locators {

	private static ChromeOptions option;
	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException 
	{
		
	 // Load the Properties file
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//config.properties");
		
		Properties pf = new Properties();
		
		pf.load(fis);
		
        if(pf.getProperty("browser").equalsIgnoreCase("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
        	
        	option = new ChromeOptions();
        	
        	option.addArguments("--start-maximized");
        	option.setAcceptInsecureCerts(true);
        	
        	driver = new ChromeDriver(option);
        	
        	driver.get(pf.getProperty("url"));
        	
        	// ************************** Css Selector ************************************
        	
        	// ************************** id **********************************************
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).sendKeys(pf.getProperty("username"));
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).clear();
        	
        	// ************************** name **********************************************
        	
        	driver.findElement(By.cssSelector("input[name='loginForm:principal']")).sendKeys(pf.getProperty("username"));
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).clear();
        	
        	// ************************** id:# **********************************************
        	
        	driver.findElement(By.cssSelector("input#loginForm:principal")).sendKeys(pf.getProperty("username"));
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).clear();
        	
        	// ************************** multiple Properties **********************************************
        	
        	driver.findElement(By.cssSelector("input[name='loginForm:principal'][type='text']")).sendKeys(pf.getProperty("username"));
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).clear();
        	
        	// ************************** nth-child **********************************************
        	
        	driver.findElement(By.cssSelector("table[id='loginForm:formPanelGrid']>tbody>tr td:nth-child(2)>input[id='loginForm:principal']")).sendKeys(pf.getProperty("username"));
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).clear();
        	
        	// ************************** starts-with **********************************************
        	
        	driver.findElement(By.cssSelector("input[id^='loginForm:prin']")).sendKeys(pf.getProperty("username"));
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).clear();
        	
        	// ************************** ends-with **********************************************
        	
        	driver.findElement(By.cssSelector("input[id$='principal']")).sendKeys(pf.getProperty("username"));
        	
        	driver.findElement(By.cssSelector("input[id='loginForm:principal']")).clear();
        	
        	// ************************** contains **********************************************
        	
        	driver.findElement(By.cssSelector("input[id*='principal']")).sendKeys(pf.getProperty("username"));

        }


	}

}
