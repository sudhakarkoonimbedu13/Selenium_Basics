// Syntax: tagname[attribute = 'attribute value']

package com.qtpselenium.demo1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector 
{
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
        driver = new FirefoxDriver(binary,null);
        
        driver.get("https://dev-web/sso-web/login.jsf?");
        
        // id
        
        driver.findElement(By.cssSelector("input[id='loginForm:principal']")).sendKeys("qtpdr");
        
        // name
        
        driver.findElement(By.cssSelector("input[name='loginForm:credentials']")).sendKeys("Dstps18%");
        
        // Direct Child (Using '>')
        
        driver.findElement(By.cssSelector("button[id='loginForm:resetButton']>span[class='ui-button-text']")).click();
        
        Thread.sleep(3000);
        
        // Starts with (^)
        
        driver.findElement(By.cssSelector("input[id^='loginForm:prin']")).sendKeys("qtpdr2");
        
        // Ends with ($)
        
        driver.findElement(By.cssSelector("input[name$='Form:credentials']")).sendKeys("password");
        
        // Contains (*)
        
        driver.findElement(By.cssSelector("button[id*='reset']")).click();
        
        Thread.sleep(3000);
        
        // Multiple Properties
        
        driver.findElement(By.cssSelector("input[id='loginForm:principal'][type='text']")).sendKeys("qtpdr3");
        
        driver.findElement(By.cssSelector("input[id='loginForm:credentials'][type='password']")).sendKeys("Dstps18%");
        
        driver.findElement(By.cssSelector("button[id='loginForm:resetButton'][type=submit]")).click();
        
        Thread.sleep(3000);
        
        // nth child & Indirect child using ' '
        
        driver.findElement(By.cssSelector("table[id='loginForm:formPanelGrid']>tbody tr:nth-child(1) td:nth-child(2)>input[id='loginForm:principal']")).sendKeys("qtpdr4");
        
        // class with shortcut
        
        String loginLabel = driver.findElement(By.cssSelector("h1.rxNovaTitleNoLeftMove")).getText();
        System.out.println(loginLabel);  
        
        
        // id with shortcut
        
        String loginComponent = driver.findElement(By.cssSelector("h1#componentName")).getText();
        System.out.println(loginComponent);
        
        // Working with innertext
        
//        String resetComponent = driver.findElement(By.cssSelector("span:contains('Reset')")).getText();        
//        System.out.println(resetComponent);       
        
      

	}

}
