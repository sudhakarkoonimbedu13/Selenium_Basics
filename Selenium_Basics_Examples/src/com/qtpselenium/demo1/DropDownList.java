package com.qtpselenium.demo1;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList 
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
        driver = new FirefoxDriver(binary,null);
        
        driver.get("http://www.echoecho.com/htmlforms11.htm");
        
        driver.manage().window().maximize();
        
        WebElement dropdown = driver.findElement(By.name("dropdownmenu"));
        
        List<WebElement> list = dropdown.findElements(By.tagName("option"));
        
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i).getText()+"-------------------"+list.get(i).getAttribute("selected"));
        }
        
        dropdown.sendKeys("Cheese");
        
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i).getText()+"-------------------"+list.get(i).getAttribute("selected"));
        }
        
        Select oselect = new Select( driver.findElement(By.name("dropdownmenu")));
        oselect.selectByIndex(2);
        
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i).getText()+"-------------------"+list.get(i).getAttribute("selected"));
        }

	}

}
