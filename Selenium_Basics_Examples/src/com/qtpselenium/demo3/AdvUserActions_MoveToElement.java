package com.qtpselenium.demo3;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AdvUserActions_MoveToElement 
{
    public static WebDriver driver;
	public static void main(String[] args) 
	{
		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		driver = new FirefoxDriver(binary,null);
		
		driver.get("https://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.xpath("html/body/div[1]/div[2]/header/nav/div/div[1]/ul/li[2]/a"));
		
		Actions action = new Actions(driver);
		
		Action act = action.moveToElement(element1).build();
		
		act.perform();
		
		//driver.findElement(By.linkText("Drivers")).click();
		
		//System.out.println(driver.getTitle());
		
		List<WebElement> groupElmnt = driver.findElements(By.className("category-group"));
		
		System.out.println(groupElmnt.size());
		
		for(int i=0;i<groupElmnt.size();i++)
		{
			List<WebElement> links = groupElmnt.get(i).findElements(By.tagName("a"));
			for(int j=0;j<links.size();j++)
			{
				if(isElementPresent(links.get(j)))
				{
					System.out.println(links.get(j).getText());
				}				
			}
		}		

	}
	
	public static boolean isElementPresent(WebElement element)
	{
		return element.isDisplayed();
	}

}
