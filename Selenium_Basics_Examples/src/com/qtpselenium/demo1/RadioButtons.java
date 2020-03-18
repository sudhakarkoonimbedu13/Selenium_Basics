package com.qtpselenium.demo1;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
        driver = new FirefoxDriver(binary,null);
        
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        
        driver.manage().window().maximize();
        
        //WebElement part1 = driver.findElement(By.name("group"));
        
        for(int grpCount =1;grpCount<=2;grpCount++)
        {
        	//String grpName = "group"+grpCount;
        	List<WebElement> radios = driver.findElements(By.name("group"+grpCount));
        	
            for(int i=0;i<radios.size();i++)
            {
             	System.out.println(radios.get(i).getAttribute("value")+"--------"+radios.get(i).getAttribute("checked"));         	
            	if(radios.get(i).getAttribute("checked")==null)
            	{
            		radios.get(i).click();
            		System.out.println(radios.get(i).getAttribute("value")+"--------"+radios.get(i).getAttribute("checked"));
            	}
            	System.out.println("*****************************************************************");
            }
            
            System.out.println("================================================================================");
        } 
	}

}
